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
 * <p>FIBEX-ELEMENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FIBEX-ELEMENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-CAN-CLUSTER"/>
 *     &lt;enumeration value="CAN-CLUSTER"/>
 *     &lt;enumeration value="CAN-FRAME"/>
 *     &lt;enumeration value="CAN-TP-CONFIG"/>
 *     &lt;enumeration value="COMMUNICATION-CLUSTER"/>
 *     &lt;enumeration value="CONTAINER-I-PDU"/>
 *     &lt;enumeration value="COUPLING-ELEMENT"/>
 *     &lt;enumeration value="DCM-I-PDU"/>
 *     &lt;enumeration value="ECU-INSTANCE"/>
 *     &lt;enumeration value="ETHERNET-CLUSTER"/>
 *     &lt;enumeration value="ETHERNET-FRAME"/>
 *     &lt;enumeration value="FIBEX-ELEMENT"/>
 *     &lt;enumeration value="FLEXRAY-AR-TP-CONFIG"/>
 *     &lt;enumeration value="FLEXRAY-CLUSTER"/>
 *     &lt;enumeration value="FLEXRAY-FRAME"/>
 *     &lt;enumeration value="FLEXRAY-TP-CONFIG"/>
 *     &lt;enumeration value="FRAME"/>
 *     &lt;enumeration value="GATEWAY"/>
 *     &lt;enumeration value="GENERAL-PURPOSE-I-PDU"/>
 *     &lt;enumeration value="GENERAL-PURPOSE-PDU"/>
 *     &lt;enumeration value="GENERIC-ETHERNET-FRAME"/>
 *     &lt;enumeration value="GLOBAL-TIME-DOMAIN"/>
 *     &lt;enumeration value="I-PDU"/>
 *     &lt;enumeration value="I-SIGNAL"/>
 *     &lt;enumeration value="I-SIGNAL-GROUP"/>
 *     &lt;enumeration value="I-SIGNAL-I-PDU"/>
 *     &lt;enumeration value="I-SIGNAL-I-PDU-GROUP"/>
 *     &lt;enumeration value="IEEE-1722-TP-ETHERNET-FRAME"/>
 *     &lt;enumeration value="J-1939-CLUSTER"/>
 *     &lt;enumeration value="J-1939-DCM-I-PDU"/>
 *     &lt;enumeration value="J-1939-TP-CONFIG"/>
 *     &lt;enumeration value="LIN-CLUSTER"/>
 *     &lt;enumeration value="LIN-EVENT-TRIGGERED-FRAME"/>
 *     &lt;enumeration value="LIN-FRAME"/>
 *     &lt;enumeration value="LIN-SPORADIC-FRAME"/>
 *     &lt;enumeration value="LIN-TP-CONFIG"/>
 *     &lt;enumeration value="LIN-UNCONDITIONAL-FRAME"/>
 *     &lt;enumeration value="MULTIPLEXED-I-PDU"/>
 *     &lt;enumeration value="N-PDU"/>
 *     &lt;enumeration value="NM-CONFIG"/>
 *     &lt;enumeration value="NM-PDU"/>
 *     &lt;enumeration value="PDU"/>
 *     &lt;enumeration value="PDUR-I-PDU-GROUP"/>
 *     &lt;enumeration value="SECURED-I-PDU"/>
 *     &lt;enumeration value="SO-AD-ROUTING-GROUP"/>
 *     &lt;enumeration value="TP-CONFIG"/>
 *     &lt;enumeration value="TTCAN-CLUSTER"/>
 *     &lt;enumeration value="USER-DEFINED-CLUSTER"/>
 *     &lt;enumeration value="USER-DEFINED-ETHERNET-FRAME"/>
 *     &lt;enumeration value="USER-DEFINED-I-PDU"/>
 *     &lt;enumeration value="USER-DEFINED-PDU"/>
 *     &lt;enumeration value="XCP-PDU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FIBEX-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum FIBEXELEMENTSUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-CAN-CLUSTER")
    ABSTRACT___CAN___CLUSTER("ABSTRACT-CAN-CLUSTER"),
    @XmlEnumValue("CAN-CLUSTER")
    CAN___CLUSTER("CAN-CLUSTER"),
    @XmlEnumValue("CAN-FRAME")
    CAN___FRAME("CAN-FRAME"),
    @XmlEnumValue("CAN-TP-CONFIG")
    CAN___TP___CONFIG("CAN-TP-CONFIG"),
    @XmlEnumValue("COMMUNICATION-CLUSTER")
    COMMUNICATION___CLUSTER("COMMUNICATION-CLUSTER"),
    @XmlEnumValue("CONTAINER-I-PDU")
    CONTAINER___I___PDU("CONTAINER-I-PDU"),
    @XmlEnumValue("COUPLING-ELEMENT")
    COUPLING___ELEMENT("COUPLING-ELEMENT"),
    @XmlEnumValue("DCM-I-PDU")
    DCM___I___PDU("DCM-I-PDU"),
    @XmlEnumValue("ECU-INSTANCE")
    ECU___INSTANCE("ECU-INSTANCE"),
    @XmlEnumValue("ETHERNET-CLUSTER")
    ETHERNET___CLUSTER("ETHERNET-CLUSTER"),
    @XmlEnumValue("ETHERNET-FRAME")
    ETHERNET___FRAME("ETHERNET-FRAME"),
    @XmlEnumValue("FIBEX-ELEMENT")
    FIBEX___ELEMENT("FIBEX-ELEMENT"),
    @XmlEnumValue("FLEXRAY-AR-TP-CONFIG")
    FLEXRAY___AR___TP___CONFIG("FLEXRAY-AR-TP-CONFIG"),
    @XmlEnumValue("FLEXRAY-CLUSTER")
    FLEXRAY___CLUSTER("FLEXRAY-CLUSTER"),
    @XmlEnumValue("FLEXRAY-FRAME")
    FLEXRAY___FRAME("FLEXRAY-FRAME"),
    @XmlEnumValue("FLEXRAY-TP-CONFIG")
    FLEXRAY___TP___CONFIG("FLEXRAY-TP-CONFIG"),
    FRAME("FRAME"),
    GATEWAY("GATEWAY"),
    @XmlEnumValue("GENERAL-PURPOSE-I-PDU")
    GENERAL___PURPOSE___I___PDU("GENERAL-PURPOSE-I-PDU"),
    @XmlEnumValue("GENERAL-PURPOSE-PDU")
    GENERAL___PURPOSE___PDU("GENERAL-PURPOSE-PDU"),
    @XmlEnumValue("GENERIC-ETHERNET-FRAME")
    GENERIC___ETHERNET___FRAME("GENERIC-ETHERNET-FRAME"),
    @XmlEnumValue("GLOBAL-TIME-DOMAIN")
    GLOBAL___TIME___DOMAIN("GLOBAL-TIME-DOMAIN"),
    @XmlEnumValue("I-PDU")
    I___PDU("I-PDU"),
    @XmlEnumValue("I-SIGNAL")
    I___SIGNAL("I-SIGNAL"),
    @XmlEnumValue("I-SIGNAL-GROUP")
    I___SIGNAL___GROUP("I-SIGNAL-GROUP"),
    @XmlEnumValue("I-SIGNAL-I-PDU")
    I___SIGNAL___I___PDU("I-SIGNAL-I-PDU"),
    @XmlEnumValue("I-SIGNAL-I-PDU-GROUP")
    I___SIGNAL___I___PDU___GROUP("I-SIGNAL-I-PDU-GROUP"),
    @XmlEnumValue("IEEE-1722-TP-ETHERNET-FRAME")
    IEEE___1722___TP___ETHERNET___FRAME("IEEE-1722-TP-ETHERNET-FRAME"),
    @XmlEnumValue("J-1939-CLUSTER")
    J___1939___CLUSTER("J-1939-CLUSTER"),
    @XmlEnumValue("J-1939-DCM-I-PDU")
    J___1939___DCM___I___PDU("J-1939-DCM-I-PDU"),
    @XmlEnumValue("J-1939-TP-CONFIG")
    J___1939___TP___CONFIG("J-1939-TP-CONFIG"),
    @XmlEnumValue("LIN-CLUSTER")
    LIN___CLUSTER("LIN-CLUSTER"),
    @XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
    LIN___EVENT___TRIGGERED___FRAME("LIN-EVENT-TRIGGERED-FRAME"),
    @XmlEnumValue("LIN-FRAME")
    LIN___FRAME("LIN-FRAME"),
    @XmlEnumValue("LIN-SPORADIC-FRAME")
    LIN___SPORADIC___FRAME("LIN-SPORADIC-FRAME"),
    @XmlEnumValue("LIN-TP-CONFIG")
    LIN___TP___CONFIG("LIN-TP-CONFIG"),
    @XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
    LIN___UNCONDITIONAL___FRAME("LIN-UNCONDITIONAL-FRAME"),
    @XmlEnumValue("MULTIPLEXED-I-PDU")
    MULTIPLEXED___I___PDU("MULTIPLEXED-I-PDU"),
    @XmlEnumValue("N-PDU")
    N___PDU("N-PDU"),
    @XmlEnumValue("NM-CONFIG")
    NM___CONFIG("NM-CONFIG"),
    @XmlEnumValue("NM-PDU")
    NM___PDU("NM-PDU"),
    PDU("PDU"),
    @XmlEnumValue("PDUR-I-PDU-GROUP")
    PDUR___I___PDU___GROUP("PDUR-I-PDU-GROUP"),
    @XmlEnumValue("SECURED-I-PDU")
    SECURED___I___PDU("SECURED-I-PDU"),
    @XmlEnumValue("SO-AD-ROUTING-GROUP")
    SO___AD___ROUTING___GROUP("SO-AD-ROUTING-GROUP"),
    @XmlEnumValue("TP-CONFIG")
    TP___CONFIG("TP-CONFIG"),
    @XmlEnumValue("TTCAN-CLUSTER")
    TTCAN___CLUSTER("TTCAN-CLUSTER"),
    @XmlEnumValue("USER-DEFINED-CLUSTER")
    USER___DEFINED___CLUSTER("USER-DEFINED-CLUSTER"),
    @XmlEnumValue("USER-DEFINED-ETHERNET-FRAME")
    USER___DEFINED___ETHERNET___FRAME("USER-DEFINED-ETHERNET-FRAME"),
    @XmlEnumValue("USER-DEFINED-I-PDU")
    USER___DEFINED___I___PDU("USER-DEFINED-I-PDU"),
    @XmlEnumValue("USER-DEFINED-PDU")
    USER___DEFINED___PDU("USER-DEFINED-PDU"),
    @XmlEnumValue("XCP-PDU")
    XCP___PDU("XCP-PDU");
    private final String value;

    FIBEXELEMENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FIBEXELEMENTSUBTYPESENUM fromValue(String v) {
        for (FIBEXELEMENTSUBTYPESENUM c: FIBEXELEMENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
