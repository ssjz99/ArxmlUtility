/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RteSim;

import ArxmlLib.*;
import AutoSarTools.*;
import java.util.*;

/**
 *
 * @author ssjz99
 */
public class RteGenClientServerOperation extends RteGenCommon{
    
    private final AutoSarInterface aif;
    private final CLIENTSERVEROPERATION operation;
    private final List<RteGenCallArgument> args = new ArrayList();
    private final Map<RteGenCallArgument,String> argVarMapping = new HashMap();

    public RteGenClientServerOperation(AutoSarInterface i, CLIENTSERVEROPERATION op) {
        aif = i;
        operation = op;
        for (ARGUMENTDATAPROTOTYPE arg : operation.getARGUMENTS().getARGUMENTDATAPROTOTYPE()) {
            String s;
            RteGenCallArgument rte_arg = new RteGenCallArgument(aif, arg);
            args.add(rte_arg);
            if(rte_arg.isIn())
                s = String.format("%s_%s_%s",ARG_IN_PREFTX, op.getSHORTNAME().getValue(), rte_arg.getArgName());
            else
                s = String.format("%s_%s_%s",ARG_OUT_PREFTX, op.getSHORTNAME().getValue(), rte_arg.getArgName());
            argVarMapping.put(rte_arg, s);
        }
    }

    public String getName() {
        return operation.getSHORTNAME().getValue();
    }

    public String getArgsDefinition() {
        if (args.isEmpty()) {
            return "void";
        } else {
            String ret = "";
            for (RteGenCallArgument arg : args) {
                if (arg.isIn()) {
                    ret += String.format(",%s %s", arg.getArgTypeName(), arg.getArgName());
                } else {
                    ret += String.format(",%s *%s", arg.getArgTypeName(), arg.getArgName());
                }
            }
            return ret.substring(1);
        }
    }
    
    public String getOperationDefinition(){
        String ret = "";
        for (RteGenCallArgument arg : args) {
            if (arg.isIn()) {
                ret += String.format("  %s = %s;\n", getArgVarName(arg), arg.getArgName());
            } else {
                ret += String.format("  *%s = %s;\n", arg.getArgName(), getArgVarName(arg));
            }
        }
        ret += "  return 0;\n";
        return ret;
    }
    
    public List<String> getArgVarDefinition() {
        List<String> ret = new ArrayList();
        String temp = "";
        for (RteGenCallArgument arg : args) {
            String s = String.format("%s %s;", arg.getArgTypeName(), getArgVarName(arg));
            if(!temp.contains(s)){
                temp += s+"\n";
                ret.add(s);
            }
        }
        return ret;
    }
    
    private String getArgVarName(RteGenCallArgument arg){
        return argVarMapping.get(arg);
    }
}
