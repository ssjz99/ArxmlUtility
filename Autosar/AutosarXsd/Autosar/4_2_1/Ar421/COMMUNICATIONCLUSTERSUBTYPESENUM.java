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
 * <p>COMMUNICATION-CLUSTER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COMMUNICATION-CLUSTER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-CAN-CLUSTER"/>
 *     &lt;enumeration value="CAN-CLUSTER"/>
 *     &lt;enumeration value="COMMUNICATION-CLUSTER"/>
 *     &lt;enumeration value="ETHERNET-CLUSTER"/>
 *     &lt;enumeration value="FLEXRAY-CLUSTER"/>
 *     &lt;enumeration value="J-1939-CLUSTER"/>
 *     &lt;enumeration value="LIN-CLUSTER"/>
 *     &lt;enumeration value="TTCAN-CLUSTER"/>
 *     &lt;enumeration value="USER-DEFINED-CLUSTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COMMUNICATION-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum COMMUNICATIONCLUSTERSUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-CAN-CLUSTER")
    ABSTRACT___CAN___CLUSTER("ABSTRACT-CAN-CLUSTER"),
    @XmlEnumValue("CAN-CLUSTER")
    CAN___CLUSTER("CAN-CLUSTER"),
    @XmlEnumValue("COMMUNICATION-CLUSTER")
    COMMUNICATION___CLUSTER("COMMUNICATION-CLUSTER"),
    @XmlEnumValue("ETHERNET-CLUSTER")
    ETHERNET___CLUSTER("ETHERNET-CLUSTER"),
    @XmlEnumValue("FLEXRAY-CLUSTER")
    FLEXRAY___CLUSTER("FLEXRAY-CLUSTER"),
    @XmlEnumValue("J-1939-CLUSTER")
    J___1939___CLUSTER("J-1939-CLUSTER"),
    @XmlEnumValue("LIN-CLUSTER")
    LIN___CLUSTER("LIN-CLUSTER"),
    @XmlEnumValue("TTCAN-CLUSTER")
    TTCAN___CLUSTER("TTCAN-CLUSTER"),
    @XmlEnumValue("USER-DEFINED-CLUSTER")
    USER___DEFINED___CLUSTER("USER-DEFINED-CLUSTER");
    private final String value;

    COMMUNICATIONCLUSTERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COMMUNICATIONCLUSTERSUBTYPESENUM fromValue(String v) {
        for (COMMUNICATIONCLUSTERSUBTYPESENUM c: COMMUNICATIONCLUSTERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
