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
 * <p>DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICCLEARDIAGNOSTICINFORMATIONCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS")
    DIAGNOSTIC___CLEAR___DIAGNOSTIC___INFORMATION___CLASS("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS");
    private final String value;

    DIAGNOSTICCLEARDIAGNOSTICINFORMATIONCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICCLEARDIAGNOSTICINFORMATIONCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICCLEARDIAGNOSTICINFORMATIONCLASSSUBTYPESENUM c: DIAGNOSTICCLEARDIAGNOSTICINFORMATIONCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
