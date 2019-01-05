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
 * <p>FRAME--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FRAME--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-FRAME"/>
 *     &lt;enumeration value="ETHERNET-FRAME"/>
 *     &lt;enumeration value="FLEXRAY-FRAME"/>
 *     &lt;enumeration value="FRAME"/>
 *     &lt;enumeration value="GENERIC-ETHERNET-FRAME"/>
 *     &lt;enumeration value="IEEE-1722-TP-ETHERNET-FRAME"/>
 *     &lt;enumeration value="LIN-EVENT-TRIGGERED-FRAME"/>
 *     &lt;enumeration value="LIN-FRAME"/>
 *     &lt;enumeration value="LIN-SPORADIC-FRAME"/>
 *     &lt;enumeration value="LIN-UNCONDITIONAL-FRAME"/>
 *     &lt;enumeration value="USER-DEFINED-ETHERNET-FRAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FRAME--SUBTYPES-ENUM")
@XmlEnum
public enum FRAMESUBTYPESENUM {

    @XmlEnumValue("CAN-FRAME")
    CAN___FRAME("CAN-FRAME"),
    @XmlEnumValue("ETHERNET-FRAME")
    ETHERNET___FRAME("ETHERNET-FRAME"),
    @XmlEnumValue("FLEXRAY-FRAME")
    FLEXRAY___FRAME("FLEXRAY-FRAME"),
    FRAME("FRAME"),
    @XmlEnumValue("GENERIC-ETHERNET-FRAME")
    GENERIC___ETHERNET___FRAME("GENERIC-ETHERNET-FRAME"),
    @XmlEnumValue("IEEE-1722-TP-ETHERNET-FRAME")
    IEEE___1722___TP___ETHERNET___FRAME("IEEE-1722-TP-ETHERNET-FRAME"),
    @XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
    LIN___EVENT___TRIGGERED___FRAME("LIN-EVENT-TRIGGERED-FRAME"),
    @XmlEnumValue("LIN-FRAME")
    LIN___FRAME("LIN-FRAME"),
    @XmlEnumValue("LIN-SPORADIC-FRAME")
    LIN___SPORADIC___FRAME("LIN-SPORADIC-FRAME"),
    @XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
    LIN___UNCONDITIONAL___FRAME("LIN-UNCONDITIONAL-FRAME"),
    @XmlEnumValue("USER-DEFINED-ETHERNET-FRAME")
    USER___DEFINED___ETHERNET___FRAME("USER-DEFINED-ETHERNET-FRAME");
    private final String value;

    FRAMESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FRAMESUBTYPESENUM fromValue(String v) {
        for (FRAMESUBTYPESENUM c: FRAMESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
