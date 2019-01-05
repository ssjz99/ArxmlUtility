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
 * <p>EVENT-GROUP-CONTROL-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EVENT-GROUP-CONTROL-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVATION-AND-TRIGGER-UNICAST"/>
 *     &lt;enumeration value="ACTIVATION-MULTICAST"/>
 *     &lt;enumeration value="ACTIVATION-UNICAST"/>
 *     &lt;enumeration value="TRIGGER-UNICAST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EVENT-GROUP-CONTROL-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum EVENTGROUPCONTROLTYPEENUMSIMPLE {


    /**
     * Activate the data path for unicast events and triggered unicast events that are sent out after a client got subscribed.
     * 
     */
    @XmlEnumValue("ACTIVATION-AND-TRIGGER-UNICAST")
    ACTIVATION___AND___TRIGGER___UNICAST("ACTIVATION-AND-TRIGGER-UNICAST"),

    /**
     * Activate the data path for multicast events of an EventGroup.
     * 
     */
    @XmlEnumValue("ACTIVATION-MULTICAST")
    ACTIVATION___MULTICAST("ACTIVATION-MULTICAST"),

    /**
     * Activate the data path for unicast events of an EventGroup.
     * 
     */
    @XmlEnumValue("ACTIVATION-UNICAST")
    ACTIVATION___UNICAST("ACTIVATION-UNICAST"),

    /**
     * Activate the data path for triggered unicast events that are sent out after a client got subscribed.
     * 
     */
    @XmlEnumValue("TRIGGER-UNICAST")
    TRIGGER___UNICAST("TRIGGER-UNICAST");
    private final String value;

    EVENTGROUPCONTROLTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EVENTGROUPCONTROLTYPEENUMSIMPLE fromValue(String v) {
        for (EVENTGROUPCONTROLTYPEENUMSIMPLE c: EVENTGROUPCONTROLTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
