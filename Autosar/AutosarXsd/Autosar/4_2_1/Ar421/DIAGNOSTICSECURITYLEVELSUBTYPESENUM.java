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
 * <p>DIAGNOSTIC-SECURITY-LEVEL--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-SECURITY-LEVEL--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-SECURITY-LEVEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-SECURITY-LEVEL--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICSECURITYLEVELSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-SECURITY-LEVEL")
    DIAGNOSTIC___SECURITY___LEVEL("DIAGNOSTIC-SECURITY-LEVEL");
    private final String value;

    DIAGNOSTICSECURITYLEVELSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICSECURITYLEVELSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICSECURITYLEVELSUBTYPESENUM c: DIAGNOSTICSECURITYLEVELSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
