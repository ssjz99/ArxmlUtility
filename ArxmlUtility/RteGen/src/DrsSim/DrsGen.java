/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrsSim;

import AutoSarTools.*;
import AutosarClass.*;
import DrsClass.*;
import DrsTools.*;
import RteSim.*;
import static RteSim.RteGen.SIM_CAL_PREFIX;
import static RteSim.RteGen.SIM_IRV_PREFIX;
import static RteSim.RteGen.SIM_RTE_PREFIX;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

/**
 *
 * @author ssjz99
 */
public class DrsGen {
    private final AutoSarInterface aif;
    private final DrsIf dif;
    private final PrintStream ps;
    public DrsGen(AutoSarInterface i,PrintStream stream){
        aif = i;
        ps = stream;
        dif = new DrsIf(i,ps);
    }
    public void generate(APPLICATIONSWCOMPONENTTYPE swc) {
        try {
            DrsClass.Global drs = new DrsClass.Global();
            DrsClass.File drs_rte_c = new DrsClass.File();
            drs_rte_c.setName(String.format("Rte_%s.c", swc.getSHORTNAME().getValue()));            
            generateFunctions(swc).forEach((o) -> {
                drs_rte_c.getScalarAndPointerAndArray().add(o);
            });
            generateRteVar(swc).forEach((o) -> {
                drs_rte_c.getScalarAndPointerAndArray().add(o);
            });
            generateIrvVar(swc).forEach((o) -> {
                drs_rte_c.getScalarAndPointerAndArray().add(o);
            });
            generateCalVar(swc).forEach((o) -> {
                drs_rte_c.getScalarAndPointerAndArray().add(o);
            });
            generateArgVar(swc).forEach((o) -> {
                drs_rte_c.getScalarAndPointerAndArray().add(o);
            });
            
            drs.getFileAndScalarAndPointer().add(drs_rte_c);
            /*write drs to file*/
            File unformatted_drs = new File("drs_unformatted.xml");
            File formatted_drs = new File("drs.xml");
            FileWriter output = new FileWriter(unformatted_drs);
            XMLOutputFactory xof = XMLOutputFactory.newFactory();
            XMLStreamWriter xsw = xof.createXMLStreamWriter(output);
            JAXBContext jaxbContext = JAXBContext.newInstance(DrsClass.Global.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setListener(new DrsMarshallerListener(xsw));
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(drs, xsw);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setValidating(false);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new FileInputStream(unformatted_drs));
            Transformer tf = TransformerFactory.newInstance().newTransformer();
            tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            tf.transform(new DOMSource(doc), new StreamResult(formatted_drs));
        } catch (IOException | JAXBException | XMLStreamException | TransformerException | org.xml.sax.SAXException | ParserConfigurationException ex) {

        }
    }
    
    private List<Function> generateFunctions(APPLICATIONSWCOMPONENTTYPE swc){
        List<Function> functions = new ArrayList();
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (Object o : r.getSERVERCALLPOINTS().getASYNCHRONOUSSERVERCALLPOINTOrSYNCHRONOUSSERVERCALLPOINT()) {
                Function f;
                if (o instanceof SYNCHRONOUSSERVERCALLPOINT) {
                    RteGenServiceCallPoint point = new RteGenServiceCallPoint(aif, (SYNCHRONOUSSERVERCALLPOINT) o);
                    f= generateFunction(point);
                    f.setMainGeneratorCalled(MainGeneratorCalledType.NO);
                    functions.add(f);
                } else if (o instanceof ASYNCHRONOUSSERVERCALLPOINT) {
                    RteGenServiceCallPoint point = new RteGenServiceCallPoint(aif, (ASYNCHRONOUSSERVERCALLPOINT) o);
                    f= generateFunction(point);
                    f.setMainGeneratorCalled(MainGeneratorCalledType.NO);
                    functions.add(f);
                }                
            }
        }        
        return functions;
    }
    
    private Function generateFunction(RteGenServiceCallPoint point){
        String call = point.getCallName();
        String ret_type_name = point.getCallRetType();
        Function f = new Function();
        f.setName(call);
        Scalar ret = new Scalar();
        ret.setName("return");
        ret.setBaseType(ret_type_name);
        ret.setCompleteType(ret_type_name);
        f.getScalarAndPointerAndArray().add(ret);
        return f;
    }
    
    private List<Object> generateRteVar(APPLICATIONSWCOMPONENTTYPE swc){
        List<Object> list = new ArrayList();
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            for (VARIABLEACCESS va : r.getDATAREADACCESSS().getVARIABLEACCESS()) {
                VARIABLEDATAPROTOTYPE v_type = aif.getVariableType(va);
                IMPLEMENTATIONDATATYPE im_type = aif.getImplementationDataType(v_type);
                String port_name = aif.getPortName(va);
                String name = String.format("%s_IRead_%s_%s_%s", SIM_RTE_PREFIX, r_name, port_name, v_type.getSHORTNAME().getValue());
                if(im_type.getCATEGORY().getValue().equals("STRUCTURE")){
                    Struct s = dif.getStruct(v_type,true);
                    s.setName(name);
                    list.add(s);
                }else{
                    Scalar s = dif.getScalar(v_type,true);
                    s.setName(name);
                    list.add(s);
                }
            }
            for (VARIABLEACCESS va : r.getDATAWRITEACCESSS().getVARIABLEACCESS()) {
                VARIABLEDATAPROTOTYPE v_type = aif.getVariableType(va);
                IMPLEMENTATIONDATATYPE im_type = aif.getImplementationDataType(v_type);
                String port_name = aif.getPortName(va);
                String name = String.format("%s_IWrite_%s_%s_%s", SIM_RTE_PREFIX, r_name, port_name, v_type.getSHORTNAME().getValue());
                if(im_type.getCATEGORY().getValue().equals("STRUCTURE")){
                    Struct s = dif.getStruct(v_type, false);
                    s.setName(name);
                    list.add(s);
                }else{
                    Scalar s = dif.getScalar(v_type, false);
                    s.setName(name);
                    list.add(s);
                }
            }
        }
        return list;
    }
    
    private List<Object> generateIrvVar(APPLICATIONSWCOMPONENTTYPE swc){
        List<Object> list = new ArrayList();
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            /*
            for (VARIABLEACCESS va : r.getREADLOCALVARIABLES().getVARIABLEACCESS()) {
                VARIABLEDATAPROTOTYPE v_type = aif.getVariableType(va);
                IMPLEMENTATIONDATATYPE im_type = aif.getImplementationDataType(v_type);
                String name;
                if (aif.isExplicit(aif.getVariableType(va))) {
                    name = String.format("%s_IrvRead_%s_%s", SIM_IRV_PREFIX, r_name, v_type.getSHORTNAME().getValue());
                } else {
                    name = String.format("%s_IrvIRead_%s_%s", SIM_IRV_PREFIX, r_name, v_type.getSHORTNAME().getValue());
                }
                if(im_type.getCATEGORY().getValue().equals("STRUCTURE")){
                    Struct s = dif.getStruct(v_type,true);
                    s.setName(name);
                    list.add(s);
                }else{
                    Scalar s = dif.getScalar(v_type,true);
                    s.setName(name);
                    list.add(s);
                }
            }
*/
            for (VARIABLEACCESS va : r.getWRITTENLOCALVARIABLES().getVARIABLEACCESS()) {
                VARIABLEDATAPROTOTYPE v_type = aif.getVariableType(va);
                IMPLEMENTATIONDATATYPE im_type = aif.getImplementationDataType(v_type);
                String name;
                if (aif.isExplicit(aif.getVariableType(va))) {
                    //name = String.format("%s_IrvWrite_%s_%s", SIM_IRV_PREFIX, r_name, v_type.getSHORTNAME().getValue());
                    name = String.format("%s_%s", SIM_IRV_PREFIX, v_type.getSHORTNAME().getValue());
                } else {
                    //name = String.format("%s_IrvIWrite_%s_%s", SIM_IRV_PREFIX, r_name, v_type.getSHORTNAME().getValue());
                    name = String.format("%s_%s", SIM_IRV_PREFIX,  v_type.getSHORTNAME().getValue());
                }
                if(im_type.getCATEGORY().getValue().equals("STRUCTURE")){
                    Struct s = dif.getStruct(v_type, false);
                    s.setName(name);
                    list.add(s);
                }else{
                    Scalar s = dif.getScalarAndInitToZero(v_type, false);
                    s.setName(name);
                    list.add(s);
                }
            }
        }
        return list;
    }
    
    
    private List<Object> generateCalVar(APPLICATIONSWCOMPONENTTYPE swc){
        List<Object> list = new ArrayList();
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (PARAMETERACCESS pa : r.getPARAMETERACCESSS().getPARAMETERACCESS()) {
                PARAMETERDATAPROTOTYPE p_type = aif.getParameterDataType(pa);
                IMPLEMENTATIONDATATYPE im_type = aif.getImplementationDataType(pa);
                String name = String.format("%s_%s", SIM_CAL_PREFIX, pa.getSHORTNAME().getValue());                
                if(im_type.getCATEGORY().getValue().equals("STRUCTURE")){
                    Struct s = dif.getStruct(p_type,true);
                    s.setName(name);
                    list.add(s);                    
                }else if(im_type.getCATEGORY().getValue().equals("ARRAY")){
                    Array s = dif.getArray(im_type,true);
                    s.setName(name);
                    list.add(s);                    
                }
                else{
                    Scalar s = dif.getScalar(p_type,true);
                    s.setName(name);
                    list.add(s);
                }
            }
        }
        return list;
    }
    
    private List<Object> generateArgVar(APPLICATIONSWCOMPONENTTYPE swc){
        List<Object> list = new ArrayList();
        String temp = "";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (Object o : r.getSERVERCALLPOINTS().getASYNCHRONOUSSERVERCALLPOINTOrSYNCHRONOUSSERVERCALLPOINT()) {
                if (o instanceof SYNCHRONOUSSERVERCALLPOINT) {
                    CLIENTSERVEROPERATION op = aif.getOperation((SYNCHRONOUSSERVERCALLPOINT)o);
                    for (ARGUMENTDATAPROTOTYPE arg : op.getARGUMENTS().getARGUMENTDATAPROTOTYPE()) {
                        String arg_name;
                        Object item;
                        if (arg.getDIRECTION().getValue() == ARGUMENTDIRECTIONENUMSIMPLE.OUT) {
                            arg_name = String.format("%s_%s_%s", RteGen.ARG_OUT_PREFTX, op.getSHORTNAME().getValue(), arg.getSHORTNAME().getValue());
                            item = dif.getStructOrScalar(arg,arg_name, true);
                        } else {
                            arg_name = String.format("%s_%s_%s", RteGen.ARG_IN_PREFTX, op.getSHORTNAME().getValue(), arg.getSHORTNAME().getValue());
                            item = dif.getStructOrScalar(arg,arg_name, false);
                        }
                        if(!temp.contains(arg_name)){
                            temp += "|"+arg_name;
                            list.add(item);
                        }
                    }
                }else{
                    CLIENTSERVEROPERATION op = aif.getOperation((ASYNCHRONOUSSERVERCALLPOINT)o);
                    for(ARGUMENTDATAPROTOTYPE arg:op.getARGUMENTS().getARGUMENTDATAPROTOTYPE()){
                        String arg_name;
                        Object item;
                        if (arg.getDIRECTION().getValue() == ARGUMENTDIRECTIONENUMSIMPLE.OUT) {
                            arg_name = String.format("%s_%s_%s", RteGen.ARG_OUT_PREFTX, op.getSHORTNAME().getValue(), arg.getSHORTNAME().getValue());
                            item = dif.getStructOrScalar(arg,arg_name, true);
                        } else {
                            arg_name = String.format("%s_%s_%s", RteGen.ARG_IN_PREFTX, op.getSHORTNAME().getValue(), arg.getSHORTNAME().getValue());
                            item = dif.getStructOrScalar(arg,arg_name, false);
                        }
                        if(!temp.contains(arg_name)){
                            temp += "|"+arg_name;
                            list.add(item);
                        }
                    }
                }
            }
        }
        return list;
    }
    
}
