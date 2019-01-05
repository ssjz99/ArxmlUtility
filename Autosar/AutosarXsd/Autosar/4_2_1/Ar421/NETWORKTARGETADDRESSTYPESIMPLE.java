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
 * <p>NETWORK-TARGET-ADDRESS-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NETWORK-TARGET-ADDRESS-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FUNCTIONAL"/>
 *     &lt;enumeration value="FUNCTIONAL-CAN-FD"/>
 *     &lt;enumeration value="PHYSICAL"/>
 *     &lt;enumeration value="PHYSICAL-CAN-FD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NETWORK-TARGET-ADDRESS-TYPE--SIMPLE")
@XmlEnum
public enum NETWORKTARGETADDRESSTYPESIMPLE {


    /**
     * Functional request type
     * 
     */
    FUNCTIONAL("FUNCTIONAL"),

    /**
     * Functional request type via CAN FD
     * 
     */
    @XmlEnumValue("FUNCTIONAL-CAN-FD")
    FUNCTIONAL___CAN___FD("FUNCTIONAL-CAN-FD"),

    /**
     * Physical request type
     * 
     */
    PHYSICAL("PHYSICAL"),

    /**
     * Physical request type via CAN FD
     * 
     */
    @XmlEnumValue("PHYSICAL-CAN-FD")
    PHYSICAL___CAN___FD("PHYSICAL-CAN-FD");
    private final String value;

    NETWORKTARGETADDRESSTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NETWORKTARGETADDRESSTYPESIMPLE fromValue(String v) {
        for (NETWORKTARGETADDRESSTYPESIMPLE c: NETWORKTARGETADDRESSTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
