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
 * <p>DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICCONTROLDTCSETTINGCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS")
    DIAGNOSTIC___CONTROL___DTC___SETTING___CLASS("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS");
    private final String value;

    DIAGNOSTICCONTROLDTCSETTINGCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICCONTROLDTCSETTINGCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICCONTROLDTCSETTINGCLASSSUBTYPESENUM c: DIAGNOSTICCONTROLDTCSETTINGCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
