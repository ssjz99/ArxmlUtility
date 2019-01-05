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
 * <p>DIAGNOSTIC-ACCESS-PERMISSION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-ACCESS-PERMISSION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAGNOSTIC-ACCESS-PERMISSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-ACCESS-PERMISSION--SUBTYPES-ENUM")
@XmlEnum
public enum DIAGNOSTICACCESSPERMISSIONSUBTYPESENUM {

    @XmlEnumValue("DIAGNOSTIC-ACCESS-PERMISSION")
    DIAGNOSTIC___ACCESS___PERMISSION("DIAGNOSTIC-ACCESS-PERMISSION");
    private final String value;

    DIAGNOSTICACCESSPERMISSIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICACCESSPERMISSIONSUBTYPESENUM fromValue(String v) {
        for (DIAGNOSTICACCESSPERMISSIONSUBTYPESENUM c: DIAGNOSTICACCESSPERMISSIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
