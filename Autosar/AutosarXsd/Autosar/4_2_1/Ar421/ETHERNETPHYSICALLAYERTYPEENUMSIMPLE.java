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
 * <p>ETHERNET-PHYSICAL-LAYER-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ETHERNET-PHYSICAL-LAYER-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASE-T"/>
 *     &lt;enumeration value="BROAD-R-REACH"/>
 *     &lt;enumeration value="RTPGE"/>
 *     &lt;enumeration value="X-MMI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ETHERNET-PHYSICAL-LAYER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum ETHERNETPHYSICALLAYERTYPEENUMSIMPLE {


    /**
     * BaseT physcial layer (10BaseT, 1000BaseT, 1000BaseT)
     * 
     */
    @XmlEnumValue("BASE-T")
    BASE___T("BASE-T"),

    /**
     * BroadR-Reach physical layer
     * 
     */
    @XmlEnumValue("BROAD-R-REACH")
    BROAD___R___REACH("BROAD-R-REACH"),

    /**
     * Reduced Twisted Pair Gigabit Ethernet (RTPGE) physical layer
     * 
     */
    RTPGE("RTPGE"),

    /**
     * Media Independent Interface (MII) physical layer
     * 
     */
    @XmlEnumValue("X-MMI")
    X___MMI("X-MMI");
    private final String value;

    ETHERNETPHYSICALLAYERTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETHERNETPHYSICALLAYERTYPEENUMSIMPLE fromValue(String v) {
        for (ETHERNETPHYSICALLAYERTYPEENUMSIMPLE c: ETHERNETPHYSICALLAYERTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
