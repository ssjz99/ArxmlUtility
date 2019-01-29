/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoSarTools;
import ArxmlLib.*;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author ssjz99
 */
public class AutoSarInterface {

    private final AUTOSAR autosar;
    private String cwd = "";
    private final Map<String, String> dataTypeRefMapping = new HashMap();
    private final Map<Object, Object> dataTypeMapping = new HashMap();
    private final List<APPLICATIONSWCOMPONENTTYPE> swcs = new ArrayList();
    private final Map<String, Object> itemMap = new HashMap();
    private final List<IMPLEMENTATIONDATATYPE> implTypes = new ArrayList();
    private final List<VARIABLEDATAPROTOTYPE> isExplicit = new ArrayList();
    private final PrintStream ps;

    public AutoSarInterface(AUTOSAR a, PrintStream stream) {
        this.autosar = a;
        this.ps = stream;
        for (ARPACKAGE pkg : autosar.getARPACKAGES().getARPACKAGE()) {
            processPkg(pkg);
        }
        buildTypeCache();
    }

    private void processPkg(ARPACKAGE pkg) {
        //cache the path
        String lastCwd = cwd;
        cwd = cwd + "/" + pkg.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, pkg);
        if (pkg.getARPACKAGES() != null) {
            for (ARPACKAGE subPkg : pkg.getARPACKAGES().getARPACKAGE()) {
                processPkg(subPkg);
            }
        }

        if (pkg.getELEMENTS() != null) {
            for (Object o : pkg.getELEMENTS().getACLOBJECTSETOrACLOPERATIONOrACLPERMISSION()) {
                if (o instanceof SWBASETYPE) {
                    processBaseType((SWBASETYPE) o);
                } else if (o instanceof DATATYPEMAPPINGSET) {
                    for (DATATYPEMAP map : ((DATATYPEMAPPINGSET) o).getDATATYPEMAPS().getDATATYPEMAP()) {
                        processMappingSet(map);
                    }
                } else if (o instanceof APPLICATIONSWCOMPONENTTYPE) {
                    processSwc((APPLICATIONSWCOMPONENTTYPE) o);
                } else if (o instanceof SENDERRECEIVERINTERFACE) {
                    processSri((SENDERRECEIVERINTERFACE) o);
                } else if (o instanceof IMPLEMENTATIONDATATYPE) {
                    processImplDataType((IMPLEMENTATIONDATATYPE) o);
                } else if (o instanceof APPLICATIONPRIMITIVEDATATYPE) {
                    processApplicationPrimitiveDataType((APPLICATIONPRIMITIVEDATATYPE) o);
                } else if (o instanceof APPLICATIONARRAYDATATYPE) {
                    processApplicationArrayDataType((APPLICATIONARRAYDATATYPE) o);
                } else if (o instanceof APPLICATIONRECORDDATATYPE) {
                    processApplicationRecordDataType((APPLICATIONRECORDDATATYPE) o);
                } else if (o instanceof COMPUMETHOD) {
                    processCompuMethod((COMPUMETHOD) o);
                } else if (o instanceof UNIT) {
                    processUnit((UNIT) o);
                } else if (o instanceof DATACONSTR) {
                    processDataConstr((DATACONSTR) o);
                } else if (o instanceof CONSTANTSPECIFICATION) {
                    processConstantSpec((CONSTANTSPECIFICATION) o);
                } else if (o instanceof SWADDRMETHOD) {
                    processSwAddMethod((SWADDRMETHOD) o);
                } else if (o instanceof CLIENTSERVERINTERFACE) {
                    processCsi((CLIENTSERVERINTERFACE) o);
                } else if (o instanceof PARAMETERINTERFACE) {
                    processParameterInterface((PARAMETERINTERFACE) o);
                } else {
                    ps.println("unprocessed object: " + o);
                }
            }
        }
        cwd = lastCwd;
    }

    private void processApplicationPrimitiveDataType(APPLICATIONPRIMITIVEDATATYPE type) {
        String lastCwd = cwd;
        cwd = cwd + "/" + type.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, type);
        cwd = lastCwd;
    }

    private void processApplicationRecordDataType(APPLICATIONRECORDDATATYPE type) {
        String lastCwd = cwd;
        cwd = cwd + "/" + type.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, type);
        cwd = lastCwd;
    }

    private void processApplicationArrayDataType(APPLICATIONARRAYDATATYPE type) {
        String lastCwd = cwd;
        cwd = cwd + "/" + type.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, type);
        cwd = lastCwd;
    }

    private void processCompuMethod(COMPUMETHOD cm) {
        String lastCwd = cwd;
        cwd = cwd + "/" + cm.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, cm);
        cwd = lastCwd;
    }

    private void processUnit(UNIT unit) {
        String lastCwd = cwd;
        cwd = cwd + "/" + unit.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, unit);
        cwd = lastCwd;
    }

    private void processDataConstr(DATACONSTR constr) {
        String lastCwd = cwd;
        cwd = cwd + "/" + constr.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, constr);
        cwd = lastCwd;
    }

    private void processConstantSpec(CONSTANTSPECIFICATION constant) {
        String lastCwd = cwd;
        cwd = cwd + "/" + constant.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, constant);
        cwd = lastCwd;
    }

    private void processSwAddMethod(SWADDRMETHOD swam) {
        String lastCwd = cwd;
        cwd = cwd + "/" + swam.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, swam);
        cwd = lastCwd;
    }

    private void processCso(CLIENTSERVEROPERATION cso) {
        String lastCwd = cwd;
        cwd = cwd + "/" + cso.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, cso);
        cwd = lastCwd;
    }

    private void processCsi(CLIENTSERVERINTERFACE csi) {
        String lastCwd = cwd;
        cwd = cwd + "/" + csi.getSHORTNAME().getValue().trim();
        for (CLIENTSERVEROPERATION op : csi.getOPERATIONS().getCLIENTSERVEROPERATION()) {
            processCso(op);
        }
        itemMap.put(cwd, csi);
        cwd = lastCwd;
    }

    private void processParameterDataPrototype(PARAMETERDATAPROTOTYPE type) {
        String lastCwd = cwd;
        cwd = cwd + "/" + type.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, type);
        cwd = lastCwd;
    }

    private void processParameterInterface(PARAMETERINTERFACE p_if) {
        String lastCwd = cwd;
        cwd = cwd + "/" + p_if.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, p_if);
        for (PARAMETERDATAPROTOTYPE type : p_if.getPARAMETERS().getPARAMETERDATAPROTOTYPE()) {
            processParameterDataPrototype(type);
        }
        cwd = lastCwd;
    }

    private void processBaseType(SWBASETYPE type) {
        String lastCwd = cwd;
        cwd = cwd + "/" + type.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, type);
        cwd = lastCwd;
    }

    private void processImplDataType(IMPLEMENTATIONDATATYPE type) {
        //cache the path        
        String lastCwd = cwd;
        cwd = cwd + "/" + type.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, type);
        implTypes.add(type);
        cwd = lastCwd;
    }

    private void processSri(SENDERRECEIVERINTERFACE sri) {
        //cache the path
        String lastCwd = cwd;
        cwd = cwd + "/" + sri.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, sri);
        for (VARIABLEDATAPROTOTYPE type : sri.getDATAELEMENTS().getVARIABLEDATAPROTOTYPE()) {
            itemMap.put(cwd + "/" + type.getSHORTNAME().getValue(), type);
        }
        cwd = lastCwd;
    }

    private void processInternalBehavior(SWCINTERNALBEHAVIOR beh) {
        //cache the path
        String lastCwd = cwd;
        cwd = cwd + "/" + beh.getSHORTNAME().getValue().trim();

        for (VARIABLEDATAPROTOTYPE type : beh.getEXPLICITINTERRUNNABLEVARIABLES().getVARIABLEDATAPROTOTYPE()) {
            String key = cwd + "/" + type.getSHORTNAME().getValue();
            itemMap.put(key, type);
            isExplicit.add(type);
        }
        for (VARIABLEDATAPROTOTYPE type : beh.getIMPLICITINTERRUNNABLEVARIABLES().getVARIABLEDATAPROTOTYPE()) {
            String key = cwd + "/" + type.getSHORTNAME().getValue();
            itemMap.put(key, type);
        }
        for (PARAMETERDATAPROTOTYPE type : beh.getPERINSTANCEPARAMETERS().getPARAMETERDATAPROTOTYPE()) {
            String key = cwd + "/" + type.getSHORTNAME().getValue();
            itemMap.put(key, type);
        }
        cwd = lastCwd;
    }
    
    public List<VARIABLEDATAPROTOTYPE> getPim(APPLICATIONSWCOMPONENTTYPE swc){
        return swc.getINTERNALBEHAVIORS().getSWCINTERNALBEHAVIOR().get(0).getARTYPEDPERINSTANCEMEMORYS().getVARIABLEDATAPROTOTYPE();
    }    

    private void processSwc(APPLICATIONSWCOMPONENTTYPE swc) {
        //cache the path
        String lastCwd = cwd;
        cwd = cwd + "/" + swc.getSHORTNAME().getValue().trim();
        itemMap.put(cwd, swc);

        swcs.add(swc);
        for (Object port_obj : swc.getPORTS().getPPORTPROTOTYPEOrPRPORTPROTOTYPEOrRPORTPROTOTYPE()) {
            if (port_obj instanceof PPORTPROTOTYPE) {
                PPORTPROTOTYPE port = (PPORTPROTOTYPE) port_obj;
                itemMap.put(cwd + "/" + port.getSHORTNAME().getValue(), port);
            } else if (port_obj instanceof RPORTPROTOTYPE) {
                RPORTPROTOTYPE port = (RPORTPROTOTYPE) port_obj;
                itemMap.put(cwd + "/" + port.getSHORTNAME().getValue(), port);
            }
        }
        for (SWCINTERNALBEHAVIOR beh : swc.getINTERNALBEHAVIORS().getSWCINTERNALBEHAVIOR()) {
            processInternalBehavior(beh);
        }
        cwd = lastCwd;
    }

    private void processMappingSet(DATATYPEMAP map) {
        String k = map.getAPPLICATIONDATATYPEREF().getDEST().value() + "@" + map.getAPPLICATIONDATATYPEREF().getValue();
        String v = map.getIMPLEMENTATIONDATATYPEREF().getDEST().value() + "@" + map.getIMPLEMENTATIONDATATYPEREF().getValue();        
        dataTypeRefMapping.put(k, v);        
    }
    private void buildTypeCache(){
        for(String key:dataTypeRefMapping.keySet()){
            String value = dataTypeRefMapping.get(key);
            String v_dest = value.split("@")[0];
            String v_path = value.split("@")[1];
            String k_dest = key.split("@")[0];
            String k_path = key.split("@")[1];
            Object a_type = getArObj(k_path, k_dest);
            Object i_type = getArObj(v_path, v_dest);
            dataTypeMapping.put(a_type, i_type);
        }
    }

    public Object getArObj(String path, String dest) {
        //ps.println(path);
        return itemMap.get(path);
    }

    public List<APPLICATIONSWCOMPONENTTYPE> getSwcs() {
        return swcs;
    }

    public List<RUNNABLEENTITY> getRunnables(APPLICATIONSWCOMPONENTTYPE swc) {
        if (swc == null) {
            return null;
        } else {
            List<RUNNABLEENTITY> ret = new ArrayList();
            for (SWCINTERNALBEHAVIOR bhv : swc.getINTERNALBEHAVIORS().getSWCINTERNALBEHAVIOR()) {
                ret.addAll(bhv.getRUNNABLES().getRUNNABLEENTITY());
            }
            return ret;
        }
    }

    public List<PPORTPROTOTYPE> getPPorts(APPLICATIONSWCOMPONENTTYPE swc) {
        if (swc == null) {
            return null;
        } else {
            List<PPORTPROTOTYPE> ret = new ArrayList();
            for (Object o : swc.getPORTS().getPPORTPROTOTYPEOrPRPORTPROTOTYPEOrRPORTPROTOTYPE()) {
                if (o instanceof PPORTPROTOTYPE) {
                    ret.add((PPORTPROTOTYPE) o);
                }
            }
            return ret;
        }
    }

    public List<RPORTPROTOTYPE> getRPorts(APPLICATIONSWCOMPONENTTYPE swc) {
        if (swc == null) {
            return null;
        } else {
            List<RPORTPROTOTYPE> ret = new ArrayList();
            for (Object o : swc.getPORTS().getPPORTPROTOTYPEOrPRPORTPROTOTYPEOrRPORTPROTOTYPE()) {
                if (o instanceof RPORTPROTOTYPE) {
                    ret.add((RPORTPROTOTYPE) o);
                }
            }
            return ret;
        }
    }

    public List<PRPORTPROTOTYPE> getPRPorts(APPLICATIONSWCOMPONENTTYPE swc) {
        if (swc == null) {
            return null;
        } else {
            List<PRPORTPROTOTYPE> ret = new ArrayList();
            for (Object o : swc.getPORTS().getPPORTPROTOTYPEOrPRPORTPROTOTYPEOrRPORTPROTOTYPE()) {
                if (o instanceof PRPORTPROTOTYPE) {
                    ret.add((PRPORTPROTOTYPE) o);
                }
            }
            return ret;
        }
    }

    public IMPLEMENTATIONDATATYPE getImplementationDataType(PARAMETERACCESS pa) {
        if (pa == null) {
            return null;
        } else {
            PARAMETERDATAPROTOTYPE type = getParameterDataType(pa);
            return getImplementationDataType(type);
        }
    }
    
    public IMPLEMENTATIONDATATYPE getImplementationDataType(IMPLEMENTATIONDATATYPEELEMENT ele) {
        if (ele == null) {
            return null;
        } else {
            SWDATADEFPROPSCONDITIONAL data_def = ele.getSWDATADEFPROPS().getSWDATADEFPROPSVARIANTS().getSWDATADEFPROPSCONDITIONAL().get(0);            
            return getImplementationDataType(data_def);
        }
    }
    
    private IMPLEMENTATIONDATATYPE getImplementationDataType(SWDATADEFPROPSCONDITIONAL ele) {
        if (ele == null) {
            return null;
        } else {
            try{
            SWDATADEFPROPSCONDITIONAL.IMPLEMENTATIONDATATYPEREF ref = ele.getIMPLEMENTATIONDATATYPEREF();
            String type_ref = ref.getValue();
            String type_dest = ref.getDEST().value();
            return (IMPLEMENTATIONDATATYPE) getArObj(type_ref, type_dest);
            }catch(java.lang.NullPointerException e){
                return null;
            }
        }
    }
    
    public IMPLEMENTATIONDATATYPE getImplementationDataType(VARIABLEDATAPROTOTYPE type) {
        if (type == null) {
            return null;
        } else {
            String type_ref = type.getTYPETREF().getValue();
            AUTOSARDATATYPESUBTYPESENUM dest = type.getTYPETREF().getDEST();
            Object o = getArObj(type_ref, dest.value());
            switch (dest) {
                case IMPLEMENTATION_DATA_TYPE: {
                    return (IMPLEMENTATIONDATATYPE) o;
                }
                default: {
                    Object mapped_type = dataTypeMapping.getOrDefault(o, o);
                    if (mapped_type == o) {
                        System.err.println(String.format("%s not mapped", type.getSHORTNAME().getValue()));
                        System.exit(0);
                        return null;
                    } else {
                        return (IMPLEMENTATIONDATATYPE) mapped_type;
                    }
                }
            }
        }
    }
    
    public IMPLEMENTATIONDATATYPE getImplementationDataType(VARIABLEACCESS va) {
        if (va == null) {
            return null;
        } else {
            VARIABLEDATAPROTOTYPE type = getVariableType(va);
            return getImplementationDataType(type);
        }
    }
    
    public String getPortName(VARIABLEACCESS va) {
        if (va == null) {
            return null;
        } else {
            VARIABLEINATOMICSWCTYPEINSTANCEREF.PORTPROTOTYPEREF ref = va.getACCESSEDVARIABLE().getAUTOSARVARIABLEIREF().getPORTPROTOTYPEREF();
            switch(ref.getDEST()){
                case R_PORT_PROTOTYPE:{
                    RPORTPROTOTYPE p = (RPORTPROTOTYPE) getArObj(ref.getValue(),ref.getDEST().value());
                    return p.getSHORTNAME().getValue();
                }
                case P_PORT_PROTOTYPE:{
                    PPORTPROTOTYPE p = (PPORTPROTOTYPE) getArObj(ref.getValue(),ref.getDEST().value());
                    return p.getSHORTNAME().getValue();
                }
                default:{
                    PRPORTPROTOTYPE p = (PRPORTPROTOTYPE) getArObj(ref.getValue(),ref.getDEST().value());
                    return p.getSHORTNAME().getValue();
                }
            }
        }
    }
    
    public CLIENTSERVEROPERATION getOperation(SYNCHRONOUSSERVERCALLPOINT point){
        ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF ref = point.getOPERATIONIREF().getTARGETREQUIREDOPERATIONREF();
        return ((CLIENTSERVEROPERATION) getArObj(ref.getValue(), ref.getDEST().value()));        
    }
    
    public CLIENTSERVEROPERATION getOperation(ASYNCHRONOUSSERVERCALLPOINT point){
        ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF ref = point.getOPERATIONIREF().getTARGETREQUIREDOPERATIONREF();
        return ((CLIENTSERVEROPERATION) getArObj(ref.getValue(), ref.getDEST().value()));        
    }
    
    public VARIABLEDATAPROTOTYPE getVariableType(VARIABLEACCESS va) {
        if (va == null) {
            return null;
        } else {
            try {
                String type_ref = va.getACCESSEDVARIABLE().getAUTOSARVARIABLEIREF().getTARGETDATAPROTOTYPEREF().getValue();
                String type_ref_dest = va.getACCESSEDVARIABLE().getAUTOSARVARIABLEIREF().getTARGETDATAPROTOTYPEREF().getDEST().value();
                VARIABLEDATAPROTOTYPE var = (VARIABLEDATAPROTOTYPE) getArObj(type_ref, type_ref_dest);
                return var;
            } catch (java.lang.NullPointerException e) {
                String type_ref = va.getACCESSEDVARIABLE().getLOCALVARIABLEREF().getValue();
                String type_ref_dest = va.getACCESSEDVARIABLE().getLOCALVARIABLEREF().getDEST().value();
                VARIABLEDATAPROTOTYPE var = (VARIABLEDATAPROTOTYPE) getArObj(type_ref, type_ref_dest);
                return var;
            }
        }
    }
    
    public PARAMETERDATAPROTOTYPE getParameterDataType(PARAMETERACCESS pa) {
        if (pa == null) {
            return null;
        } else {
            try {
                String type_ref = pa.getACCESSEDPARAMETER().getAUTOSARPARAMETERIREF().getTARGETDATAPROTOTYPEREF().getValue();
                String type_ref_dest = pa.getACCESSEDPARAMETER().getAUTOSARPARAMETERIREF().getTARGETDATAPROTOTYPEREF().getDEST().value();
                return (PARAMETERDATAPROTOTYPE) getArObj(type_ref, type_ref_dest);
            } catch (java.lang.NullPointerException | java.lang.ClassCastException e) {
                String type_ref = pa.getACCESSEDPARAMETER().getLOCALPARAMETERREF().getValue();
                String type_ref_dest = pa.getACCESSEDPARAMETER().getLOCALPARAMETERREF().getDEST().value();
                return (PARAMETERDATAPROTOTYPE) getArObj(type_ref, type_ref_dest);
            }
        }
    }
    
    public IMPLEMENTATIONDATATYPE getImplementationDataType(PARAMETERDATAPROTOTYPE p_type) {
        if (p_type == null) {
            return null;
        } else {
            String type_ref = p_type.getTYPETREF().getValue();
            String type_ref_dest = p_type.getTYPETREF().getDEST().value();
            Object o = getArObj(type_ref, type_ref_dest);
            return ((IMPLEMENTATIONDATATYPE)this.dataTypeMapping.getOrDefault(o, o));
        }
    }
    
    public ARRAYVALUESPECIFICATION getArrayValueSpec(PARAMETERDATAPROTOTYPE p_type) {
        try {
            CONSTANTREFERENCE.CONSTANTREF ref = p_type.getINITVALUE().getCONSTANTREFERENCE().getCONSTANTREF();
            CONSTANTSPECIFICATION spec = (CONSTANTSPECIFICATION)getArObj(ref.getValue(), ref.getDEST().value());            
            return spec.getVALUESPEC().getARRAYVALUESPECIFICATION();
        } catch (java.lang.NullPointerException e) {
            return null;
        }
    }
    
    public IMPLEMENTATIONDATATYPE getImplementationDataType(IMPLEMENTATIONDATATYPE ref_type) {
        switch (ref_type.getCATEGORY().getValue()) {
            case "TYPE_REFERENCE": {
                SWDATADEFPROPSCONDITIONAL def = ref_type.getSWDATADEFPROPS().getSWDATADEFPROPSVARIANTS().getSWDATADEFPROPSCONDITIONAL().get(0);
                return getImplementationDataType(def);
            }
            case "ARRAY": {
                IMPLEMENTATIONDATATYPEELEMENT ele = ref_type.getSUBELEMENTS().getIMPLEMENTATIONDATATYPEELEMENT().get(0);                
                return getImplementationDataType(ele);
            }
            default:
                ps.println("Unknown implementation reference type");
                return null;
        }
    }
    
    public IMPLEMENTATIONDATATYPE getImplementationDataType(ARGUMENTDATAPROTOTYPE type) {
        if (type == null) {
            return null;
        } else {
            String type_ref = type.getTYPETREF().getValue();
            String type_ref_dest = type.getTYPETREF().getDEST().value();
            Object o = getArObj(type_ref, type_ref_dest);
            return ((IMPLEMENTATIONDATATYPE)this.dataTypeMapping.getOrDefault(o, o));
        }
    }
                
    public COMPUMETHOD getCompuMethod(SWDATADEFPROPSCONDITIONAL def) {
        if (def == null) {
            return null;
        } else {
            String compu_ref = def.getCOMPUMETHODREF().getValue();
            String compu_dest = def.getCOMPUMETHODREF().getDEST().value();
            return (COMPUMETHOD) getArObj(compu_ref, compu_dest);
        }
    }
    
    public DATACONSTR getDataConstr(SWDATADEFPROPSCONDITIONAL def) {
         if (def == null) {
            return null;
        } else {
            String compu_ref = def.getDATACONSTRREF().getValue();
            String compu_dest = def.getDATACONSTRREF().getDEST().value();
            return (DATACONSTR) getArObj(compu_ref, compu_dest);
        }
    }
    
    public SWBASETYPE getSwBaseType(IMPLEMENTATIONDATATYPE im_type) {
        switch (im_type.getCATEGORY().getValue()) {
            case "VALUE": {
                String b_type_ref = im_type.getSWDATADEFPROPS().getSWDATADEFPROPSVARIANTS().getSWDATADEFPROPSCONDITIONAL().get(0).getBASETYPEREF().getValue();
                String b_type_dest = im_type.getSWDATADEFPROPS().getSWDATADEFPROPSVARIANTS().getSWDATADEFPROPSCONDITIONAL().get(0).getBASETYPEREF().getDEST().value();
                SWBASETYPE b_type = (SWBASETYPE) getArObj(b_type_ref, b_type_dest);
                return b_type;
            }
            case "ARRAY":
            case "TYPE_REFERENCE": {
                IMPLEMENTATIONDATATYPE type = getImplementationDataType(im_type);
                return getSwBaseType(type);
            }
            case "STRUCTURE":
            default:
                ps.println("getSwBaseTypeFromImplementationDataType: unknown data type");
                return null;
        }
    }

    public Map<Object, Object> getDataTypeMapping() {
        return new HashMap(dataTypeMapping);
    }

    public List<IMPLEMENTATIONDATATYPE> getImplTypes() {
        return new ArrayList<>(implTypes);
    }    
    
    public boolean isExplicit(VARIABLEDATAPROTOTYPE type){
        return isExplicit.contains(type);
    }
}
