/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RteSim;
import AutoSarTools.*;
import ArxmlLib.*;
import DrsLib.*;
import java.util.*;

/**
 *
 * @author ssjz99
 */
public class RteGenServiceCallPoint extends RteGenCommon{
    private static final String CALL_DECLARATON_PREFIX = "Rte_Call";
    private final AutoSarInterface aif;
    private final SYNCHRONOUSSERVERCALLPOINT s_point;
    private final ASYNCHRONOUSSERVERCALLPOINT as_point;
    private final RteGenClientServerOperation operation;
    private String port_name;
    public RteGenServiceCallPoint(AutoSarInterface i,SYNCHRONOUSSERVERCALLPOINT point){
        aif = i;
        s_point = point;
        as_point = null;
        ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF ref = point.getOPERATIONIREF().getTARGETREQUIREDOPERATIONREF();
        CLIENTSERVEROPERATION op = (CLIENTSERVEROPERATION) aif.getArObj(ref.getValue(), ref.getDEST().value());
        operation = new RteGenClientServerOperation(aif,op);
        processPort(point);
    }
    
    public RteGenServiceCallPoint(AutoSarInterface i, ASYNCHRONOUSSERVERCALLPOINT point){
        aif = i;
        as_point = point;
        s_point = null;
        ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF ref = point.getOPERATIONIREF().getTARGETREQUIREDOPERATIONREF();
        CLIENTSERVEROPERATION op = (CLIENTSERVEROPERATION) aif.getArObj(ref.getValue(), ref.getDEST().value());
        operation = new RteGenClientServerOperation(aif,op);
        processPort(point);
    }
    
    public String getCallDeclaration(){
        String ret = String.format("extern Std_ReturnType %s_%s_%s(%s);\n",CALL_DECLARATON_PREFIX,port_name,operation.getName(),operation.getArgsDefinition());
        return ret;
    }
    
    public String getCallName(){
        return String.format("%s_%s_%s",CALL_DECLARATON_PREFIX,port_name,operation.getName());
    }
    
    public String getCallRetType(){
        return "Std_ReturnType";
    }
    
    public Function getDrsFunction(){
        String name = String.format("%s_%s_%s",CALL_DECLARATON_PREFIX,port_name,operation.getName());
        Function fun = new Function();
        fun.setName(name);
        fun.setMainGeneratorCalled(MainGeneratorCalledType.NO);
        Scalar ret = new Scalar();
        ret.setName("return");
        ret.setBaseType("uint8");
        ret.setCompleteType("uint8");
        fun.getScalarAndPointerAndArray().add(ret);
        return fun;
    }
    
    public String getCallDefinition(){
        return String.format("Std_ReturnType %s_%s_%s(%s){\n%s}\n\n",CALL_DECLARATON_PREFIX,port_name,operation.getName(),operation.getArgsDefinition(),operation.getOperationDefinition());
    }
    
    public List<String> getCallVarDefinition(){
        return operation.getArgVarDefinition();
    }
    
    private void processPort(SYNCHRONOUSSERVERCALLPOINT point) {
        ROPERATIONINATOMICSWCINSTANCEREF.CONTEXTRPORTREF contex_ref = point.getOPERATIONIREF().getCONTEXTRPORTREF();
        if (null == contex_ref.getDEST()) {
            System.err.println("RteGenServiceCallPoint: unknown data type");
            System.exit(0);
        } else {
            switch (contex_ref.getDEST()) {
                case R_PORT_PROTOTYPE: {
                    RPORTPROTOTYPE p = (RPORTPROTOTYPE) aif.getArObj(contex_ref.getValue(), contex_ref.getDEST().value());
                    port_name = p.getSHORTNAME().getValue();
                    break;
                }
                case ABSTRACT_REQUIRED_PORT_PROTOTYPE: {
                    PRPORTPROTOTYPE p = (PRPORTPROTOTYPE) aif.getArObj(contex_ref.getValue(), contex_ref.getDEST().value());
                    port_name = p.getSHORTNAME().getValue();
                    break;
                }
                default: {
                    PPORTPROTOTYPE p = (PPORTPROTOTYPE) aif.getArObj(contex_ref.getValue(), contex_ref.getDEST().value());
                    port_name = p.getSHORTNAME().getValue();
                    break;
                }
            }
        }
    }
    
    private void processPort(ASYNCHRONOUSSERVERCALLPOINT point){
        ROPERATIONINATOMICSWCINSTANCEREF.CONTEXTRPORTREF contex_ref = point.getOPERATIONIREF().getCONTEXTRPORTREF();
        if(null == contex_ref.getDEST()){
            System.err.println("RteGenServiceCallPoint: unknown data type");
            System.exit(0);
        }else switch (contex_ref.getDEST()) {
            case R_PORT_PROTOTYPE:
                break;
            case ABSTRACT_REQUIRED_PORT_PROTOTYPE:
                break;
            default:
                break;
        }
    }
}
