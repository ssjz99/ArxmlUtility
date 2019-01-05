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
 * <p>COMMUNICATION-CONTROLLER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COMMUNICATION-CONTROLLER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-CAN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="CAN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="ETHERNET-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="FLEXRAY-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="LIN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="LIN-MASTER"/>
 *     &lt;enumeration value="LIN-SLAVE"/>
 *     &lt;enumeration value="TTCAN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="USER-DEFINED-COMMUNICATION-CONTROLLER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COMMUNICATION-CONTROLLER--SUBTYPES-ENUM")
@XmlEnum
public enum COMMUNICATIONCONTROLLERSUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-CAN-COMMUNICATION-CONTROLLER")
    ABSTRACT___CAN___COMMUNICATION___CONTROLLER("ABSTRACT-CAN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("CAN-COMMUNICATION-CONTROLLER")
    CAN___COMMUNICATION___CONTROLLER("CAN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("COMMUNICATION-CONTROLLER")
    COMMUNICATION___CONTROLLER("COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("ETHERNET-COMMUNICATION-CONTROLLER")
    ETHERNET___COMMUNICATION___CONTROLLER("ETHERNET-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("FLEXRAY-COMMUNICATION-CONTROLLER")
    FLEXRAY___COMMUNICATION___CONTROLLER("FLEXRAY-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("LIN-COMMUNICATION-CONTROLLER")
    LIN___COMMUNICATION___CONTROLLER("LIN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("LIN-MASTER")
    LIN___MASTER("LIN-MASTER"),
    @XmlEnumValue("LIN-SLAVE")
    LIN___SLAVE("LIN-SLAVE"),
    @XmlEnumValue("TTCAN-COMMUNICATION-CONTROLLER")
    TTCAN___COMMUNICATION___CONTROLLER("TTCAN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("USER-DEFINED-COMMUNICATION-CONTROLLER")
    USER___DEFINED___COMMUNICATION___CONTROLLER("USER-DEFINED-COMMUNICATION-CONTROLLER");
    private final String value;

    COMMUNICATIONCONTROLLERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COMMUNICATIONCONTROLLERSUBTYPESENUM fromValue(String v) {
        for (COMMUNICATIONCONTROLLERSUBTYPESENUM c: COMMUNICATIONCONTROLLERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
