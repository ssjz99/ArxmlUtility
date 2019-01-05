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
 * <p>ETHERNET-PHYSICAL-CHANNEL--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ETHERNET-PHYSICAL-CHANNEL--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ETHERNET-PHYSICAL-CHANNEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ETHERNET-PHYSICAL-CHANNEL--SUBTYPES-ENUM")
@XmlEnum
public enum ETHERNETPHYSICALCHANNELSUBTYPESENUM {

    @XmlEnumValue("ETHERNET-PHYSICAL-CHANNEL")
    ETHERNET___PHYSICAL___CHANNEL("ETHERNET-PHYSICAL-CHANNEL");
    private final String value;

    ETHERNETPHYSICALCHANNELSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETHERNETPHYSICALCHANNELSUBTYPESENUM fromValue(String v) {
        for (ETHERNETPHYSICALCHANNELSUBTYPESENUM c: ETHERNETPHYSICALCHANNELSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
