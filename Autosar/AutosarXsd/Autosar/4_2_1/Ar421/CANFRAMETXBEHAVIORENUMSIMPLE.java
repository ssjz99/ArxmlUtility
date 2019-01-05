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
 * <p>CAN-FRAME-TX-BEHAVIOR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-FRAME-TX-BEHAVIOR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-20"/>
 *     &lt;enumeration value="CAN-FD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-FRAME-TX-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum CANFRAMETXBEHAVIORENUMSIMPLE {


    /**
     * This CAN frame shall be sent as CAN 2.0 only.
     * 
     */
    @XmlEnumValue("CAN-20")
    CAN___20("CAN-20"),

    /**
     * This CAN frame shall be sent as CAN FD.
     * 
     */
    @XmlEnumValue("CAN-FD")
    CAN___FD("CAN-FD");
    private final String value;

    CANFRAMETXBEHAVIORENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CANFRAMETXBEHAVIORENUMSIMPLE fromValue(String v) {
        for (CANFRAMETXBEHAVIORENUMSIMPLE c: CANFRAMETXBEHAVIORENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
