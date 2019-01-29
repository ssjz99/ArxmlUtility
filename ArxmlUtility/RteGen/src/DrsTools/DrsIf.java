/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrsTools;

import AutoSarTools.AutoSarInterface;
import DrsLib.*;
import ArxmlLib.*;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author ssjz99
 */
public class DrsIf {

    private final AutoSarInterface aif;
    private final PrintStream ps;
    public DrsIf(AutoSarInterface i, PrintStream stream) {
        aif = i;
        ps = stream;
    }
    
    public Scalar getScalar(IMPLEMENTATIONDATATYPE i_type, boolean in) {
        Scalar scalar = new Scalar();
        SWBASETYPE bsType = aif.getSwBaseType(i_type);
        scalar.setBaseType(bsType.getSHORTNAME().getValue());
        scalar.setCompleteType(bsType.getSHORTNAME().getValue());
        if (in) {
            scalar.setInitMode(InitModeType.INIT);
            scalar.setInitModesAllowed(10);
            scalar.setInitRange("min..max");
            scalar.setGlobalAssert(GlobalAssertType.NO);
        } else {
            scalar.setInitMode(InitModeType.IGNORE);
            scalar.setInitRange("min..max");
            scalar.setGlobalAssert(GlobalAssertType.YES);
            scalar.setAssertRange("min..max");
        }
        return scalar;
    }

    public Scalar getScalar(PARAMETERDATAPROTOTYPE p_type, boolean in) {
        ARGUMENTDATAPROTOTYPE.TYPETREF ref = p_type.getTYPETREF();
        Object o = aif.getArObj(ref.getValue(), ref.getDEST().value());
        if (o instanceof IMPLEMENTATIONDATATYPE) {
            return getScalar((IMPLEMENTATIONDATATYPE) o, in);
        } else if (o instanceof APPLICATIONPRIMITIVEDATATYPE) {
            return getScalar((APPLICATIONPRIMITIVEDATATYPE) o, in);
        } else {
            System.err.println("getDrsScalarFromVariableDataType: unknow format!"+o);
            System.exit(0);
            return null;
        }
    }

    public Scalar getScalar(VARIABLEDATAPROTOTYPE v_type, boolean in) {
        ARGUMENTDATAPROTOTYPE.TYPETREF ref = v_type.getTYPETREF();
        Object o = aif.getArObj(ref.getValue(), ref.getDEST().value());
        if (o instanceof IMPLEMENTATIONDATATYPE) {
            return getScalar((IMPLEMENTATIONDATATYPE) o, in);
        } else if (o instanceof APPLICATIONPRIMITIVEDATATYPE) {
            return getScalar((APPLICATIONPRIMITIVEDATATYPE) o, in);
        } else {
            System.err.println("getDrsScalarFromVariableDataType: unknow format!");
            System.err.println(o);
            System.exit(0);
            return null;
        }
    }
    
    public Scalar getScalarAndInitToZero(VARIABLEDATAPROTOTYPE v_type, boolean in) {
        ARGUMENTDATAPROTOTYPE.TYPETREF ref = v_type.getTYPETREF();
        Object o = aif.getArObj(ref.getValue(), ref.getDEST().value());
        if (o instanceof IMPLEMENTATIONDATATYPE) {            
            Scalar ret = getScalar((IMPLEMENTATIONDATATYPE) o, in);
            ret.setInitMode(InitModeType.INIT);
            ret.setInitRange("0");
            return ret;
        } else if (o instanceof APPLICATIONPRIMITIVEDATATYPE) {
            Scalar ret = getScalar((APPLICATIONPRIMITIVEDATATYPE) o, in);
            ret.setInitMode(InitModeType.INIT);
            ret.setInitRange("0");
            return ret;
        } else {
            System.err.println("getDrsScalarFromVariableDataType: unknow format!");
            System.err.println(o);
            System.exit(0);
            return null;
        }
    }
    
    public Array getArray(IMPLEMENTATIONDATATYPE im_type, boolean in) {
        Array ret = new Array();
        IMPLEMENTATIONDATATYPE type = aif.getImplementationDataType(im_type);
        while(type.getCATEGORY().getValue().equals("TYPE_REFERENCE")){
            type = aif.getImplementationDataType(type);
        }
        SWBASETYPE bsType = aif.getSwBaseType(im_type);
        String size = im_type.getSUBELEMENTS().getIMPLEMENTATIONDATATYPEELEMENT().get(0).getARRAYSIZE().getContent().get(0).toString();
        switch (type.getCATEGORY().getValue()) {
            case "ARRAY":
                Array sub_array = getArray(type, in);
                String sub_size = type.getSUBELEMENTS().getIMPLEMENTATIONDATATYPEELEMENT().get(0).getARRAYSIZE().getContent().get(0).toString();
                ret.setCompleteType(String.format("%s ([%s])[%s]", bsType.getSHORTNAME().getValue(), size, sub_size));
                ret.getScalarAndPointerAndArray().add(sub_array);
                break;
            case "VALUE":                
                ret.setCompleteType(String.format("%s [%s]", bsType.getSHORTNAME().getValue(), size));
                Scalar scalar = getScalar(im_type, in);
                scalar.setInitMode(InitModeType.IGNORE);
                ret.getScalarAndPointerAndArray().add(scalar);
                break;
            default:
                System.out.println(this.getClass().toString() + "->getArray: unknown format!");
                System.exit(0);
        }       
        return ret;
    }

    private List<String> adjustValueRange(String type, String min, String max) {
        List<String> ret = new ArrayList();
        switch (type) {
            case "uint8": {
                Long min_value = Long.parseLong(min);
                Long max_value = Long.parseLong(max);
                if (min_value > 0) {
                    min_value -= 1;
                }
                if (max_value < 255) {
                    max_value += 1;
                }
                ret.add(Long.toString(min_value));
                ret.add(Long.toString(max_value));
                return ret;
            }

            case "sint8": {
                Long min_value = Long.parseLong(min);
                Long max_value = Long.parseLong(max);
                if (min_value > -128) {
                    min_value -= 1;
                }
                if (max_value < 127) {
                    max_value += 1;
                }
                ret.add(Long.toString(min_value));
                ret.add(Long.toString(max_value));
                return ret;
            }

            case "uint16": {
                Long min_value = Long.parseLong(min);
                Long max_value = Long.parseLong(max);
                if (min_value > 0) {
                    min_value -= 1;
                }
                if (max_value < 65535L) {
                    max_value += 1;
                }
                ret.add(Long.toString(min_value));
                ret.add(Long.toString(max_value));
                return ret;
            }

            case "sint16": {
                Long min_value = Long.parseLong(min);
                Long max_value = Long.parseLong(max);
                if (min_value > -32768L) {
                    min_value -= 1;
                }
                if (max_value < 32767L) {
                    max_value += 1;
                }
                ret.add(Long.toString(min_value));
                ret.add(Long.toString(max_value));
                return ret;
            }

            case "uint32": {
                Long min_value = Long.parseLong(min);
                Long max_value = Long.parseLong(max);
                if (min_value > 0) {
                    min_value -= 1;
                }
                if (max_value < 4294967295L) {
                    max_value += 1;
                }
                ret.add(Long.toString(min_value));
                ret.add(Long.toString(max_value));
                return ret;
            }

            case "sint32": {
                Long min_value = Long.parseLong(min);
                Long max_value = Long.parseLong(max);
                if (min_value > -2147483648L) {
                    min_value -= 1;
                }
                if (max_value < 2147483647L) {
                    max_value += 1;
                }
                ret.add(Long.toString(min_value));
                ret.add(Long.toString(max_value));
                return ret;
            }

            case "float32": {
                double min_value = Float.parseFloat(min);
                double max_value = Float.parseFloat(max);
                min_value = min_value - 1;
                max_value = max_value + 1;
                ret.add(Double.toString(min_value));
                ret.add(Double.toString(max_value));
                return ret;
            }
            case "float64": {
                double min_value = Float.parseFloat(min);
                double max_value = Float.parseFloat(max);
                min_value = min_value - 1;
                max_value = max_value + 1;
                ret.add(Double.toString(min_value));
                ret.add(Double.toString(max_value));
                return ret;
            }
            default: {
                ret.add(min);
                ret.add(max);
                return ret;
            }
        }
    }

    public Scalar getScalar(APPLICATIONPRIMITIVEDATATYPE a_type, boolean in) {
        IMPLEMENTATIONDATATYPE i_type = (IMPLEMENTATIONDATATYPE) aif.getDataTypeMapping().get(a_type);
        Scalar scalar = getScalar(i_type, in);
        if (in) {
            try {
                for (SWDATADEFPROPSCONDITIONAL o : a_type.getSWDATADEFPROPS().getSWDATADEFPROPSVARIANTS().getSWDATADEFPROPSCONDITIONAL()) {
                    DATACONSTR dataConstr = aif.getDataConstr(o);
                    for (DATACONSTRRULE rule : dataConstr.getDATACONSTRRULES().getDATACONSTRRULE()) {
                        String min = rule.getPHYSCONSTRS().getLOWERLIMIT().getContent().get(0).toString();
                        String max = rule.getPHYSCONSTRS().getUPPERLIMIT().getContent().get(0).toString();
                        IMPLEMENTATIONDATATYPE im_type = (IMPLEMENTATIONDATATYPE) aif.getDataTypeMapping().get(a_type);
                        SWBASETYPE b_type = aif.getSwBaseType(im_type);
                        List<String> adjustedRange = adjustValueRange(b_type.getSHORTNAME().getValue(), min, max);
                        scalar.setInitRange(String.format("%s..%s", adjustedRange.get(0), adjustedRange.get(1)));
                        scalar.setInitMode(InitModeType.INIT);
                    }
                }
            } catch (java.lang.NullPointerException | java.lang.ClassCastException e) {
            }
        }
        return scalar;
    }

    public Scalar getScalar(ARGUMENTDATAPROTOTYPE a_type, boolean in) {
        IMPLEMENTATIONDATATYPE i_type = aif.getImplementationDataType(a_type);
        return getScalar(i_type, in);
    }

    public Struct getStruct(VARIABLEDATAPROTOTYPE v_type, boolean in) {
        ARGUMENTDATAPROTOTYPE.TYPETREF ref = v_type.getTYPETREF();
        APPLICATIONRECORDDATATYPE a_type = (APPLICATIONRECORDDATATYPE) aif.getArObj(ref.getValue(), ref.getDEST().value());
        return getStruct(a_type, in);
    }

    public Struct getStruct(PARAMETERDATAPROTOTYPE p_type, boolean in) {
        ARGUMENTDATAPROTOTYPE.TYPETREF ref = p_type.getTYPETREF();
        APPLICATIONRECORDDATATYPE a_type = (APPLICATIONRECORDDATATYPE) aif.getArObj(ref.getValue(), ref.getDEST().value());
        return getStruct(a_type, in);
    }

    public Struct getStruct(APPLICATIONRECORDDATATYPE type, boolean in) {
        Struct struct = new Struct();
        for (APPLICATIONRECORDELEMENT ele : type.getELEMENTS().getAPPLICATIONRECORDELEMENT()) {
            APPLICATIONRECORDELEMENT.TYPETREF type_ref = ele.getTYPETREF();
            Object o = aif.getArObj(type_ref.getValue(), type_ref.getDEST().value());
            if (o instanceof APPLICATIONRECORDDATATYPE) {
                Struct sub_struct = getStruct((APPLICATIONRECORDDATATYPE) o, in);
                sub_struct.setName(ele.getSHORTNAME().getValue());
                struct.getScalarAndPointerAndArray().add(sub_struct);
            } else if (o instanceof APPLICATIONPRIMITIVEDATATYPE) {
                DrsLib.Scalar sub_scalar = getScalar((APPLICATIONPRIMITIVEDATATYPE) o, in);
                sub_scalar.setName(ele.getSHORTNAME().getValue());
                struct.getScalarAndPointerAndArray().add(sub_scalar);
            }
        }
        return struct;
    }

    public Struct getStruct(ARGUMENTDATAPROTOTYPE type, boolean in) {
        ARGUMENTDATAPROTOTYPE.TYPETREF ref = type.getTYPETREF();
        APPLICATIONRECORDDATATYPE a_type = (APPLICATIONRECORDDATATYPE) aif.getArObj(ref.getValue(), ref.getDEST().value());
        return getStruct(a_type, in);
    }

    public Object getStructOrScalar(ARGUMENTDATAPROTOTYPE type, String name, boolean in) {
        ARGUMENTDATAPROTOTYPE.TYPETREF ref = type.getTYPETREF();
        Object o = aif.getArObj(ref.getValue(), ref.getDEST().value());
        if (o instanceof ARGUMENTDATAPROTOTYPE) {
            Struct ret = getStruct((ARGUMENTDATAPROTOTYPE) o, in);
            ret.setName(name);
            return ret;
        }else if(o instanceof APPLICATIONPRIMITIVEDATATYPE){
            APPLICATIONPRIMITIVEDATATYPE a_type = (APPLICATIONPRIMITIVEDATATYPE)o;
            Scalar ret = getScalar(a_type, in);
            ret.setName(name);
            return ret;
        }else if(o instanceof APPLICATIONRECORDDATATYPE){
            APPLICATIONRECORDDATATYPE a_type = (APPLICATIONRECORDDATATYPE)o;
            Struct ret = getStruct(a_type, in);
            ret.setName(name);
            return ret;
        }
        else {
            IMPLEMENTATIONDATATYPE i_type = aif.getImplementationDataType(type);
            Scalar ret = getScalar(i_type, in);
            ret.setName(name);
            return ret;
        }
    }
}
