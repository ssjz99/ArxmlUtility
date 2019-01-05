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
 * <p>PHYSICAL-CHANNEL--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PHYSICAL-CHANNEL--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-CAN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="CAN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="ETHERNET-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="FLEXRAY-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="LIN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="TTCAN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="USER-DEFINED-PHYSICAL-CHANNEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PHYSICAL-CHANNEL--SUBTYPES-ENUM")
@XmlEnum
public enum PHYSICALCHANNELSUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-CAN-PHYSICAL-CHANNEL")
    ABSTRACT___CAN___PHYSICAL___CHANNEL("ABSTRACT-CAN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("CAN-PHYSICAL-CHANNEL")
    CAN___PHYSICAL___CHANNEL("CAN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("ETHERNET-PHYSICAL-CHANNEL")
    ETHERNET___PHYSICAL___CHANNEL("ETHERNET-PHYSICAL-CHANNEL"),
    @XmlEnumValue("FLEXRAY-PHYSICAL-CHANNEL")
    FLEXRAY___PHYSICAL___CHANNEL("FLEXRAY-PHYSICAL-CHANNEL"),
    @XmlEnumValue("LIN-PHYSICAL-CHANNEL")
    LIN___PHYSICAL___CHANNEL("LIN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("PHYSICAL-CHANNEL")
    PHYSICAL___CHANNEL("PHYSICAL-CHANNEL"),
    @XmlEnumValue("TTCAN-PHYSICAL-CHANNEL")
    TTCAN___PHYSICAL___CHANNEL("TTCAN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("USER-DEFINED-PHYSICAL-CHANNEL")
    USER___DEFINED___PHYSICAL___CHANNEL("USER-DEFINED-PHYSICAL-CHANNEL");
    private final String value;

    PHYSICALCHANNELSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PHYSICALCHANNELSUBTYPESENUM fromValue(String v) {
        for (PHYSICALCHANNELSUBTYPESENUM c: PHYSICALCHANNELSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
