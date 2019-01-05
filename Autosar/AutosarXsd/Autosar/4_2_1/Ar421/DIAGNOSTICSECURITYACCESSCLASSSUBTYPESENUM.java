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
 * <p>DIAGNOSTIC-SECURITY-ACCESS-CLASS--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-SECURITY-ACCESS-CLASS--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-SECURITY-ACCESS-CLASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-SECURITY-ACCESS-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICSECURITYACCESSCLASSSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-SECURITY-ACCESS-CLASS")
    DIAGNOSTIC___SECURITY___ACCESS___CLASS("DIAGNOSTIC-SECURITY-ACCESS-CLASS");
    private final String value;

    DIAGNOSTICSECURITYACCESSCLASSSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICSECURITYACCESSCLASSSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICSECURITYACCESSCLASSSUBTYPESENUM c: DIAGNOSTICSECURITYACCESSCLASSSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
