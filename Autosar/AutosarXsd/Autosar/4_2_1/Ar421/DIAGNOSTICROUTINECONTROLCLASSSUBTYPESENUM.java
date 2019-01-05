//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DIAGNOSTIC-ROUTINE-CONTROL-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-ROUTINE-CONTROL-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-ROUTINE-CONTROL-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-ROUTINE-CONTROL-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICROUTINECONTROLCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-ROUTINE-CONTROL-CLASS")
    DIAGNOSTIC___ROUTINE___CONTROL___CLASS("DIAGNOSTIC-ROUTINE-CONTROL-CLASS");
    private final String value;

    DIAGNOSTICROUTINECONTROLCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICROUTINECONTROLCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICROUTINECONTROLCLASSSUBTYPESENUM c: DIAGNOSTICROUTINECONTROLCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
