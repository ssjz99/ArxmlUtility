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
 * <p>NETWORK-ENDPOINT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NETWORK-ENDPOINT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NETWORK-ENDPOINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NETWORK-ENDPOINT--SUBTYPES-ENUM")
@XmlEnum
public enum NETWORKENDPOINTSUBTYPESENUM {

    @XmlEnumValue("NETWORK-ENDPOINT")
    NETWORK___ENDPOINT("NETWORK-ENDPOINT");
    private final String value;

    NETWORKENDPOINTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NETWORKENDPOINTSUBTYPESENUM fromValue(String v) {
        for (NETWORKENDPOINTSUBTYPESENUM c: NETWORKENDPOINTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
