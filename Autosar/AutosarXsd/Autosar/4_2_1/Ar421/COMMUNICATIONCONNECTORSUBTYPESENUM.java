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
 * <p>COMMUNICATION-CONNECTOR--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COMMUNICATION-CONNECTOR--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-CAN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="CAN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="ETHERNET-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="FLEXRAY-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="LIN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="TTCAN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="USER-DEFINED-COMMUNICATION-CONNECTOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COMMUNICATION-CONNECTOR--SUBTYPES-ENUM")
@XmlEnum
public enum COMMUNICATIONCONNECTORSUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-CAN-COMMUNICATION-CONNECTOR")
    ABSTRACT___CAN___COMMUNICATION___CONNECTOR("ABSTRACT-CAN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("CAN-COMMUNICATION-CONNECTOR")
    CAN___COMMUNICATION___CONNECTOR("CAN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("COMMUNICATION-CONNECTOR")
    COMMUNICATION___CONNECTOR("COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("ETHERNET-COMMUNICATION-CONNECTOR")
    ETHERNET___COMMUNICATION___CONNECTOR("ETHERNET-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("FLEXRAY-COMMUNICATION-CONNECTOR")
    FLEXRAY___COMMUNICATION___CONNECTOR("FLEXRAY-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("LIN-COMMUNICATION-CONNECTOR")
    LIN___COMMUNICATION___CONNECTOR("LIN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("TTCAN-COMMUNICATION-CONNECTOR")
    TTCAN___COMMUNICATION___CONNECTOR("TTCAN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("USER-DEFINED-COMMUNICATION-CONNECTOR")
    USER___DEFINED___COMMUNICATION___CONNECTOR("USER-DEFINED-COMMUNICATION-CONNECTOR");
    private final String value;

    COMMUNICATIONCONNECTORSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COMMUNICATIONCONNECTORSUBTYPESENUM fromValue(String v) {
        for (COMMUNICATIONCONNECTORSUBTYPESENUM c: COMMUNICATIONCONNECTORSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
