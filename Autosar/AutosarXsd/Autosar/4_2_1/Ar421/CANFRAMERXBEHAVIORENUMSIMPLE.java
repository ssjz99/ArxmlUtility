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
 * <p>CAN-FRAME-RX-BEHAVIOR-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-FRAME-RX-BEHAVIOR-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="CAN-20"/>
 *     &lt;enumeration value="CAN-FD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-FRAME-RX-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum CANFRAMERXBEHAVIORENUMSIMPLE {


    /**
     * This CAN frame may be received as both, CAN 2.0 and CAN FD.
     * 
     */
    ANY("ANY"),

    /**
     * This CAN frame shall be received as CAN 2.0 only. In case the CAN frame is received as CAN FD it is discarded during reception.
     * 
     */
    @XmlEnumValue("CAN-20")
    CAN___20("CAN-20"),

    /**
     * This CAN frame shall be received as CAN FD only. In case the CAN frame is received as CAN 2.0 it is discarded during reception.
     * 
     */
    @XmlEnumValue("CAN-FD")
    CAN___FD("CAN-FD");
    private final String value;

    CANFRAMERXBEHAVIORENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CANFRAMERXBEHAVIORENUMSIMPLE fromValue(String v) {
        for (CANFRAMERXBEHAVIORENUMSIMPLE c: CANFRAMERXBEHAVIORENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
