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
 * <p>GLOBAL-TIME-DOMAIN--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="GLOBAL-TIME-DOMAIN--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GLOBAL-TIME-DOMAIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GLOBAL-TIME-DOMAIN--SUBTYPES-ENUM")
@XmlEnum
public enum GLOBALTIMEDOMAINSUBTYPESENUM {

    @XmlEnumValue("GLOBAL-TIME-DOMAIN")
    GLOBAL___TIME___DOMAIN("GLOBAL-TIME-DOMAIN");
    private final String value;

    GLOBALTIMEDOMAINSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GLOBALTIMEDOMAINSUBTYPESENUM fromValue(String v) {
        for (GLOBALTIMEDOMAINSUBTYPESENUM c: GLOBALTIMEDOMAINSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
