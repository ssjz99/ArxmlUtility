//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>COUPLING-ELEMENT-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COUPLING-ELEMENT-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HUB"/>
 *     &lt;enumeration value="ROUTER"/>
 *     &lt;enumeration value="SWITCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COUPLING-ELEMENT-ENUM--SIMPLE")
@XmlEnum
public enum COUPLINGELEMENTENUMSIMPLE {


    /**
     * A device that is used to connect segments of a LAN. In Hubs frames are "broadcasted" to every one of its ports.
     * 
     */
    HUB,

    /**
     * A device that routes frames between different networks.
     * 
     */
    ROUTER,

    /**
     * A device that filters and forwards frames between different LAN segments.
     * 
     */
    SWITCH;

    public String value() {
        return name();
    }

    public static COUPLINGELEMENTENUMSIMPLE fromValue(String v) {
        return valueOf(v);
    }

}
