/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RteSim;

import AutoSarTools.AutoSarInterface;
import ArxmlLib.*;
import DrsLib.*;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author ssjz99
 */
public class RteGen extends RteGenCommon {

    private final AutoSarInterface aif;
    private final PrintStream ps;
    private final String SIM_NVM_PREFIX = "SimNvm";
    private final String SIM_OPR_PREFIX = "SimOpr";

    public RteGen(AutoSarInterface i, PrintStream stream) {
        aif = i;
        ps = stream;
    }

    public String generateSimTypes() {
        ps.println("Generating Types");
        ps.flush();
        String ret = "#ifndef RTE_TYPE\n#define RTE_TYPE\n\n";
        ret += "#include \"Platform_Types.h\"\n";
        List<IMPLEMENTATIONDATATYPE> temp = aif.getImplTypes();
        while (!temp.isEmpty()) {
            IMPLEMENTATIONDATATYPE im_type = temp.remove(0);
            String im_type_name = im_type.getSHORTNAME().getValue();
            switch (im_type.getCATEGORY().getValue()) {
                case "STRUCTURE": {
                    boolean indep = true;
                    String type_name = im_type.getSHORTNAME().getValue();
                    String type_begin = String.format("\ntypedef struct %s_struct{\n", type_name);
                    String type_end = String.format("} %s;\n\n", type_name);
                    String ele = "";
                    for (IMPLEMENTATIONDATATYPEELEMENT element : im_type.getSUBELEMENTS().getIMPLEMENTATIONDATATYPEELEMENT()) {
                        IMPLEMENTATIONDATATYPE ref_type = aif.getImplementationDataType(element);
                        ele += String.format("    %s %s;\n", ref_type.getSHORTNAME().getValue(), element.getSHORTNAME().getValue());
                        if (temp.contains(ref_type)) {
                            indep = false;
                            break;
                        }
                    }
                    if (indep) {
                        String struct_def = type_begin + ele + type_end;
                        ret += struct_def;
                    } else {
                        temp.add(im_type);
                    }
                    break;
                }
                case "ARRAY": {
                    IMPLEMENTATIONDATATYPE ref_type = aif.getImplementationDataType(im_type);
                    String size = im_type.getSUBELEMENTS().getIMPLEMENTATIONDATATYPEELEMENT().get(0).getARRAYSIZE().getContent().get(0).toString();
                    String ref_type_name = ref_type.getSHORTNAME().getValue();
                    if (!im_type_name.equals(ref_type_name)) {
                        String im_type_def = String.format("typedef %s %s[%s];\n", ref_type_name, im_type_name, size);
                        ret += im_type_def;
                    }
                    break;
                }
                case "TYPE_REFERENCE": {
                    IMPLEMENTATIONDATATYPE ref_type = aif.getImplementationDataType(im_type);
                    String ref_type_name = ref_type.getSHORTNAME().getValue();
                    if (!im_type_name.equals(ref_type_name)) {
                        String im_type_def = String.format("typedef %s %s;\n", ref_type_name, im_type_name);
                        ret += im_type_def;
                    }
                    try {

                        SWDATADEFPROPSCONDITIONAL def = im_type.getSWDATADEFPROPS().getSWDATADEFPROPSVARIANTS().getSWDATADEFPROPSCONDITIONAL().get(0);
                        COMPUMETHOD compu = aif.getCompuMethod(def);
                        switch (compu.getCATEGORY().getValue()) {
                            case "TEXTTABLE": {
                                for (COMPUSCALE scale : compu.getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                                    String im_type_def = String.format("#define %s %s\n", scale.getSHORTLABEL().getValue(), scale.getLOWERLIMIT().getContent().get(0).toString());
                                    ret += im_type_def;
                                }
                                break;
                            }
                            default:
                                break;
                        }
                    } catch (java.lang.NullPointerException e) {
                    }
                    break;
                }
                case "VALUE": {
                    SWBASETYPE b_type = aif.getSwBaseType(im_type);
                    String b_type_name = b_type.getSHORTNAME().getValue();
                    if (!im_type_name.equals(b_type_name)) {
                        String im_type_def = String.format("typedef %s %s;\n", b_type_name, im_type_name);
                        ret += im_type_def;
                    }
                    try {
                        SWDATADEFPROPSCONDITIONAL def = im_type.getSWDATADEFPROPS().getSWDATADEFPROPSVARIANTS().getSWDATADEFPROPSCONDITIONAL().get(0);
                        COMPUMETHOD compu = aif.getCompuMethod(def);
                        switch (compu.getCATEGORY().getValue()) {
                            case "TEXTTABLE": {
                                for (COMPUSCALE scale : compu.getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                                    String im_type_def = String.format("#define %s %s\n", scale.getSHORTLABEL().getValue(), scale.getLOWERLIMIT().getContent().get(0).toString());
                                    ret += im_type_def;
                                }
                                break;
                            }
                            default:
                                break;
                        }
                    } catch (java.lang.NullPointerException e) {
                    }
                    break;
                }
                default: {
                    ps.println("Warning: " + im_type + " not generated");
                    ps.flush();
                    break;
                }
            }
        }
        /*Type mapping*/
        for (Object k : aif.getDataTypeMapping().keySet()) {
            Object v = aif.getDataTypeMapping().get(k);
            IMPLEMENTATIONDATATYPE im_type = (IMPLEMENTATIONDATATYPE) v;
            String ap_name = "";

            if (k instanceof APPLICATIONARRAYDATATYPE) {
                ap_name = ((APPLICATIONARRAYDATATYPE) k).getSHORTNAME().getValue();
            } else if (k instanceof APPLICATIONPRIMITIVEDATATYPE) {
                ap_name = ((APPLICATIONPRIMITIVEDATATYPE) k).getSHORTNAME().getValue();
            } else if (k instanceof APPLICATIONRECORDDATATYPE) {
                ap_name = ((APPLICATIONRECORDDATATYPE) k).getSHORTNAME().getValue();
            } else {
                ps.println("Unknown data type: " + k);
                ps.flush();
            }

            if (!ap_name.equals(im_type.getSHORTNAME().getValue())) {
                if (!ap_name.equals("")) {
                    String define = String.format("#define %s %s\n", ap_name, im_type.getSHORTNAME().getValue());
                    ret += define;
                }
            }
        }
        ret += "#define Std_ReturnType uint8\n";
        ret += "\n#endif";
        return ret;
    }

    public String generateSimIncludes(APPLICATIONSWCOMPONENTTYPE swc) {
        
        String includes = "#ifndef RTE_H\n#define RTE_H\n";
        includes += "#include \"Rte_Type.h\"\n\n";
        includes += generateSimRteDeclaration(swc);
        includes += generateSimIrvDeclaration(swc);
        includes += generateSimCalDeclaration(swc);
        includes += generateSimPimDeclaration(swc);
        includes += generateSimRteMapping(swc);
        includes += generateSimIrvMapping(swc);
        includes += generateSimCalIfMapping(swc);
        includes += generateSimOperationIfMapping(swc);
        includes += generateSimPimIfMapping(swc);
        includes += "#endif";
        return includes;
    }

    public String generateSim(APPLICATIONSWCOMPONENTTYPE swc) {
        String def = String.format("#include \"Rte_%s.h\"\n\n", swc.getSHORTNAME().getValue());
        def += generateSimRte(swc);
        def += generateSimIrv(swc);
        def += generateSimCal(swc);
        def += generateSimOperation(swc);
        def += generateSimPim(swc);
        return def;
    }

    private String generateSimRteMapping(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating RTE mapping");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/*       RTE Mapping        */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            for (VARIABLEACCESS va : r.getDATAREADACCESSS().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(2);
                switch (aif.getImplementationDataType(va).getCATEGORY().getValue()) {
                    case "STRUCTURE":
                    case "ARRAY": {
                        ret += String.format("#define Rte_IRead_%s_%s() (&%s_IRead_%s_%s)\n", r_name, va_name, SIM_RTE_PREFIX, r_name, va_name);
                        break;
                    }
                    default: {
                        ret += String.format("#define Rte_IRead_%s_%s() %s_IRead_%s_%s\n", r_name, va_name, SIM_RTE_PREFIX, r_name, va_name);
                        break;
                    }
                }
            }
            for (VARIABLEACCESS va : r.getDATAWRITEACCESSS().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(2);
                switch (aif.getImplementationDataType(va).getCATEGORY().getValue()) {
                    case "STRUCTURE":
                    case "ARRAY": {
                        ret += String.format("#define Rte_IWrite_%s_%s(a) %s_IWrite_%s_%s = *(a)\n", r_name, va_name, SIM_RTE_PREFIX, r_name, va_name);
                        break;
                    }
                    default: {
                        ret += String.format("#define Rte_IWrite_%s_%s(a) %s_IWrite_%s_%s = (a)\n", r_name, va_name, SIM_RTE_PREFIX, r_name, va_name);
                        break;
                    }
                }
            }
        }
        return ret;
    }

    private String generateSimRteDeclaration(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating RTE declarations");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/* RTE Variable Declaration */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            for (VARIABLEACCESS va : r.getDATAREADACCESSS().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(2);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                ret += String.format("extern %s %s_IRead_%s_%s;\n", va_type_name, SIM_RTE_PREFIX, r_name, va_name);
            }
            for (VARIABLEACCESS va : r.getDATAWRITEACCESSS().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(2);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                ret += String.format("extern %s %s_IWrite_%s_%s;\n", va_type_name, SIM_RTE_PREFIX, r_name, va_name);
            }
        }
        return ret;
    }

    private String generateSimRte(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating RTE simulations");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/* RTE Variable Definition  */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            for (VARIABLEACCESS va : r.getDATAREADACCESSS().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(2);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                String var_def = String.format("%s %s_IRead_%s_%s;\n", va_type_name, SIM_RTE_PREFIX, r_name, va_name);
                if (!ret.contains(var_def)) {
                    ret += var_def;
                }
            }
            for (VARIABLEACCESS va : r.getDATAWRITEACCESSS().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(2);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                String var_def = String.format("%s %s_IWrite_%s_%s;\n", va_type_name, SIM_RTE_PREFIX, r_name, va_name);
                if (!ret.contains(var_def)) {
                    ret += var_def;
                }
            }
        }
        return ret;
    }

    private String generateSimIrvMapping(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating IRV mapping");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/*       IRV Mapping        */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            for (VARIABLEACCESS va : r.getREADLOCALVARIABLES().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(3);
                switch (aif.getImplementationDataType(va).getCATEGORY().getValue()) {
                    case "STRUCTURE":
                    case "ARRAY": {
                        if (aif.isExplicit(aif.getVariableType(va))) {
                            //ret += String.format("#define Rte_IrvRead_%s_%s() (&%s_IrvRead_%s_%s)\n", r_name, va_name, SIM_IRV_PREFIX, r_name, va_name);
                            ret += String.format("#define Rte_IrvRead_%s_%s() (&%s_%s)\n", r_name, va_name, SIM_IRV_PREFIX, va_name);
                        } else {
                            //ret += String.format("#define Rte_IrvIRead_%s_%s() (&%s_IrvIRead_%s_%s)\n", r_name, va_name, SIM_IRV_PREFIX, r_name, va_name);
                            ret += String.format("#define Rte_IrvIRead_%s_%s() (&%s_%s)\n", r_name, va_name, SIM_IRV_PREFIX, va_name);
                        }
                        break;
                    }
                    default: {
                        if (aif.isExplicit(aif.getVariableType(va))) {
                            //ret += String.format("#define Rte_IrvRead_%s_%s() %s_IrvRead_%s_%s\n", r_name, va_name, SIM_IRV_PREFIX, r_name, va_name);
                            ret += String.format("#define Rte_IrvRead_%s_%s() %s_%s\n", r_name, va_name, SIM_IRV_PREFIX, va_name);
                        } else {
                            //ret += String.format("#define Rte_IrvIRead_%s_%s() %s_IrvIRead_%s_%s\n", r_name, va_name, SIM_IRV_PREFIX, r_name, va_name);
                            ret += String.format("#define Rte_IrvIRead_%s_%s() %s_%s\n", r_name, va_name, SIM_IRV_PREFIX, va_name);
                        }
                        break;
                    }

                }
            }
            for (VARIABLEACCESS va : r.getWRITTENLOCALVARIABLES().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(3);
                if (aif.isExplicit(aif.getVariableType(va))) {
                    //ret += String.format("#define Rte_IrvWrite_%s_%s(a) %s_IrvWrite_%s_%s=a\n", r_name, va_name, SIM_IRV_PREFIX, r_name, va_name);
                    ret += String.format("#define Rte_IrvWrite_%s_%s(a) %s_%s=(a)\n", r_name, va_name, SIM_IRV_PREFIX, va_name);
                } else {
                    //ret += String.format("#define Rte_IrvIWrite_%s_%s(a) %s_IrvIWrite_%s_%s=a\n", r_name, va_name, SIM_IRV_PREFIX, r_name, va_name);
                    ret += String.format("#define Rte_IrvIWrite_%s_%s(a) %s_%s=(a)\n", r_name, va_name, SIM_IRV_PREFIX, va_name);
                }
            }
        }
        return ret;
    }

    private String generateSimIrvDeclaration(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating IRV declaration");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/* IRV Variable Declaration */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            /*
            for (VARIABLEACCESS va : r.getREADLOCALVARIABLES().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(3);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                if (aif.isExplicit(aif.getVariableType(va))) {
                    ret += String.format("extern %s %s_IrvRead_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                } else {
                    ret += String.format("extern %s %s_IrvIRead_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                }
            }
             */
            for (VARIABLEACCESS va : r.getWRITTENLOCALVARIABLES().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(3);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                if (aif.isExplicit(aif.getVariableType(va))) {
                    //ret += String.format("extern %s %s_IrvWrite_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                    ret += String.format("extern %s %s_%s;\n", va_type_name, SIM_IRV_PREFIX, va_name);
                } else {
                    //ret += String.format("extern %s %s_IrvIWrite_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                    ret += String.format("extern %s %s_%s;\n", va_type_name, SIM_IRV_PREFIX, va_name);
                }
            }
        }
        return ret;
    }

    private String generateSimIrv(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating IRV definition");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/* IRV Variable Definition  */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            String r_name = r.getSHORTNAME().getValue();
            /*
            for (VARIABLEACCESS va : r.getREADLOCALVARIABLES().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(3);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                String var_def = "";
                if (aif.isExplicit(aif.getVariableType(va))) {
                    var_def = String.format("%s %s_IrvRead_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                } else {
                    var_def = String.format("%s %s_IrvIRead_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                }
                if (!ret.contains(var_def)) {
                    ret += var_def;
                }
            }
             */
            for (VARIABLEACCESS va : r.getWRITTENLOCALVARIABLES().getVARIABLEACCESS()) {
                String va_name = va.getSHORTNAME().getValue().substring(3);
                String va_type_name = aif.getImplementationDataType(va).getSHORTNAME().getValue();
                String var_def = "";
                if (aif.isExplicit(aif.getVariableType(va))) {
                    //var_def = String.format("%s %s_IrvWrite_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                    var_def = String.format("%s %s_%s;\n", va_type_name, SIM_IRV_PREFIX, va_name);
                } else {
                    //var_def = String.format("%s %s_IrvIWrite_%s_%s;\n", va_type_name, SIM_IRV_PREFIX, r_name, va_name);
                    var_def = String.format("%s %s_%s;\n", va_type_name, SIM_IRV_PREFIX, va_name);
                }
                if (!ret.contains(var_def)) {
                    ret += var_def;
                }
            }
        }
        return ret;
    }

    private String generateSimCalIfMapping(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating calibration mapping");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/*       CAL Mapping        */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (PARAMETERACCESS pa : r.getPARAMETERACCESSS().getPARAMETERACCESS()) {
                String pa_name = pa.getSHORTNAME().getValue();
                if (pa.getACCESSEDPARAMETER().getAUTOSARPARAMETERIREF() != null) {
                    PARAMETERINATOMICSWCTYPEINSTANCEREF.PORTPROTOTYPEREF ref = pa.getACCESSEDPARAMETER().getAUTOSARPARAMETERIREF().getPORTPROTOTYPEREF();
                    switch (ref.getDEST()) {
                        case R_PORT_PROTOTYPE: {
                            RPORTPROTOTYPE port = (RPORTPROTOTYPE) aif.getArObj(ref.getValue(), ref.getDEST().value());
                            ret += String.format("#define Rte_Prm_%s_%s() %s_%s\n", port.getSHORTNAME().getValue(), pa_name, SIM_CAL_PREFIX, pa_name);
                            break;
                        }
                        case P_PORT_PROTOTYPE: {
                            PPORTPROTOTYPE port = (PPORTPROTOTYPE) aif.getArObj(ref.getValue(), ref.getDEST().value());
                            ret += String.format("#define Rte_Prm_%s_%s() %s_%s\n", port.getSHORTNAME().getValue(), pa_name, SIM_CAL_PREFIX, pa_name);
                            break;
                        }
                        default: {
                            PRPORTPROTOTYPE port = (PRPORTPROTOTYPE) aif.getArObj(ref.getValue(), ref.getDEST().value());
                            ret += String.format("#define Rte_Prm_%s_%s() %s_%s\n", port.getSHORTNAME().getValue(), pa_name, SIM_CAL_PREFIX, pa_name);
                        }
                    }
                } else {
                    ret += String.format("#define Rte_CData_%s() %s_%s\n", pa_name, SIM_CAL_PREFIX, pa_name);
                }
            }
        }
        return ret;
    }

    private String generateSimPimIfMapping(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating PIM mapping");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/*       PIM Mapping        */\n"
                + "/****************************/\n";
        for (VARIABLEDATAPROTOTYPE v : aif.getPim(swc)) {
            String pim_name = v.getSHORTNAME().getValue();
            String mapping;
            switch (aif.getImplementationDataType(v).getCATEGORY().getValue()) {
                case "STRUCTURE": {
                    mapping = String.format("#define Rte_Pim_%s() (&%s_%s)\n", pim_name, SIM_PIM_PREFIX, pim_name);
                    break;
                }
                default: {
                    mapping = String.format("#define Rte_Pim_%s() %s_%s\n", pim_name, SIM_PIM_PREFIX, pim_name);
                }
            }
            if (!ret.contains(mapping)) {
                ret += mapping;
            }
        }
        return ret;
    }

    private String generateSimPimDeclaration(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating PIM declarations");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/* PIM Variable Declaration */\n"
                + "/****************************/\n";
        for (VARIABLEDATAPROTOTYPE v : aif.getPim(swc)) {
            String pim_name = v.getSHORTNAME().getValue();
            String pim_type_name = aif.getImplementationDataType(v).getSHORTNAME().getValue();
            String declaration = String.format("extern %s %s_%s;\n", pim_type_name, SIM_PIM_PREFIX, pim_name);
            if (!ret.contains(declaration)) {
                ret += declaration;
            }
        }
        return ret;
    }

    private String generateSimPim(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating PIM simulations");
        ps.flush();
        String ret = ""
                + "/***************************/\n"
                + "/* PIM Variable Definition */\n"
                + "/***************************/\n";
        for (VARIABLEDATAPROTOTYPE v : aif.getPim(swc)) {
            String pim_name = v.getSHORTNAME().getValue();
            String pim_type_name = aif.getImplementationDataType(v).getSHORTNAME().getValue();
            String def = String.format("%s %s_%s;\n", pim_type_name, SIM_PIM_PREFIX, pim_name);
            if (!ret.contains(def)) {
                ret += def;
            }
        }
        return ret;
    }

    private String generateSimCalDeclaration(APPLICATIONSWCOMPONENTTYPE swc) {        
        ps.println("Generating calibration declaration");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/* CAL Variable Declaration */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (PARAMETERACCESS pa : r.getPARAMETERACCESSS().getPARAMETERACCESS()) {
                String pa_name = pa.getSHORTNAME().getValue();
                String pa_type_name = aif.getImplementationDataType(pa).getSHORTNAME().getValue();
                ret += String.format("extern %s %s_%s;\n", pa_type_name, SIM_CAL_PREFIX, pa_name);
            }
        }
        return ret;
    }

    private String generateSimCal(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating calibration definition");
        ps.flush();
        String ret = ""
                + "/****************************/\n"
                + "/* CAL Variable Definition  */\n"
                + "/****************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (PARAMETERACCESS pa : r.getPARAMETERACCESSS().getPARAMETERACCESS()) {
                String pa_name = pa.getSHORTNAME().getValue();
                String pa_type_name = aif.getImplementationDataType(pa).getSHORTNAME().getValue();
                PARAMETERDATAPROTOTYPE p_type = aif.getParameterDataType(pa);
                ARRAYVALUESPECIFICATION spec = aif.getArrayValueSpec(p_type);
                String var_def;
                if (spec != null) {
                    String init = getArraySpecValue(spec);
                    var_def = String.format("%s %s_%s=%s;\n", pa_type_name, SIM_CAL_PREFIX, pa_name, init);
                } else {
                    var_def = String.format("%s %s_%s;\n", pa_type_name, SIM_CAL_PREFIX, pa_name);
                }
                if (!ret.contains(var_def)) {
                    ret += var_def;
                }
            }
        }
        return ret;
    }

    private String generateSimOperationIfMapping(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating operation call declaration");
        ps.flush();
        String ret = ""
                + "/******************************/\n"
                + "/* Operation Call Declaration */\n"
                + "/******************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (Object o : r.getSERVERCALLPOINTS().getASYNCHRONOUSSERVERCALLPOINTOrSYNCHRONOUSSERVERCALLPOINT()) {
                String call = "";
                if (o instanceof SYNCHRONOUSSERVERCALLPOINT) {
                    RteGenServiceCallPoint point = new RteGenServiceCallPoint(aif, (SYNCHRONOUSSERVERCALLPOINT) o);
                    call = point.getCallDeclaration();
                } else if (o instanceof ASYNCHRONOUSSERVERCALLPOINT) {
                    RteGenServiceCallPoint point = new RteGenServiceCallPoint(aif, (ASYNCHRONOUSSERVERCALLPOINT) o);
                    call = point.getCallDeclaration();
                }
                if (!ret.contains(call)) {
                    ret += call;
                }
            }
        }
        return ret;
    }

    private String generateSimOperation(APPLICATIONSWCOMPONENTTYPE swc) {
        ps.println("Generating operation call definition");
        ps.flush();
        String operation_def = ""
                + "/*****************************/\n"
                + "/* Operation Call Definition */\n"
                + "/*****************************/\n";
        String var_def = ""
                + "/*********************************/\n"
                + "/* Operation Variable Definition */\n"
                + "/*********************************/\n";
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (Object o : r.getSERVERCALLPOINTS().getASYNCHRONOUSSERVERCALLPOINTOrSYNCHRONOUSSERVERCALLPOINT()) {
                if (o instanceof SYNCHRONOUSSERVERCALLPOINT) {
                    RteGenServiceCallPoint point = new RteGenServiceCallPoint(aif, (SYNCHRONOUSSERVERCALLPOINT) o);
                    for (String s : point.getCallVarDefinition()) {
                        if (!var_def.contains(s)) {
                            var_def += s + "\n";
                        }
                    }
                    String call_def = point.getCallDefinition();
                    if (!operation_def.contains(call_def)) {
                        operation_def += call_def;
                    }
                } else if (o instanceof ASYNCHRONOUSSERVERCALLPOINT) {
                    RteGenServiceCallPoint point = new RteGenServiceCallPoint(aif, (ASYNCHRONOUSSERVERCALLPOINT) o);
                    for (String s : point.getCallVarDefinition()) {
                        if (!var_def.contains(s)) {
                            var_def += s + "\n";
                        }
                    }
                    String call_def = point.getCallDefinition();
                    if (!operation_def.contains(call_def)) {
                        operation_def += call_def;
                    }
                }
            }
        }
        return var_def + operation_def;
    }

    public List<Function> generateDrsOperationFunction(APPLICATIONSWCOMPONENTTYPE swc) {
        List<Function> ret = new ArrayList();
        for (RUNNABLEENTITY r : aif.getRunnables(swc)) {
            for (Object o : r.getSERVERCALLPOINTS().getASYNCHRONOUSSERVERCALLPOINTOrSYNCHRONOUSSERVERCALLPOINT()) {
                if (o instanceof SYNCHRONOUSSERVERCALLPOINT) {
                    RteGenServiceCallPoint point = new RteGenServiceCallPoint(aif, (SYNCHRONOUSSERVERCALLPOINT) o);
                    ret.add(point.getDrsFunction());
                } else if (o instanceof ASYNCHRONOUSSERVERCALLPOINT) {
                }
            }
        }
        return ret;
    }
    
    private String getArraySpecValue(ARRAYVALUESPECIFICATION spec) {
        String init = "";
        for (Object o : spec.getELEMENTS().getAPPLICATIONRULEBASEDVALUESPECIFICATIONOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION()) {
            if (o instanceof ARRAYVALUESPECIFICATION) {
                String a_init = getArraySpecValue((ARRAYVALUESPECIFICATION) o);
                init += String.format(", %s", a_init);
            } else if (o instanceof NUMERICALVALUESPECIFICATION) {
                String n_init = getNumericValue((NUMERICALVALUESPECIFICATION) o);
                init += String.format(", %s", n_init);
            }
        }
        if (init.startsWith(", ")) {
            init = init.substring(2);
        }
        return String.format("{%s}", init);
    }
    
    private String getNumericValue(NUMERICALVALUESPECIFICATION o){
        NUMERICALVALUESPECIFICATION nspec = (NUMERICALVALUESPECIFICATION) o;
        return nspec.getVALUE().getContent().get(0).toString().trim();
    }
}
