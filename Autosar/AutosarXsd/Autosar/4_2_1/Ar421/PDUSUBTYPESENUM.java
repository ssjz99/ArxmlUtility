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
 * <p>PDU--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PDU--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINER-I-PDU"/>
 *     &lt;enumeration value="DCM-I-PDU"/>
 *     &lt;enumeration value="GENERAL-PURPOSE-I-PDU"/>
 *     &lt;enumeration value="GENERAL-PURPOSE-PDU"/>
 *     &lt;enumeration value="I-PDU"/>
 *     &lt;enumeration value="I-SIGNAL-I-PDU"/>
 *     &lt;enumeration value="J-1939-DCM-I-PDU"/>
 *     &lt;enumeration value="MULTIPLEXED-I-PDU"/>
 *     &lt;enumeration value="N-PDU"/>
 *     &lt;enumeration value="NM-PDU"/>
 *     &lt;enumeration value="PDU"/>
 *     &lt;enumeration value="SECURED-I-PDU"/>
 *     &lt;enumeration value="USER-DEFINED-I-PDU"/>
 *     &lt;enumeration value="USER-DEFINED-PDU"/>
 *     &lt;enumeration value="XCP-PDU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDU--SUBTYPES-ENUM")
@XmlEnum
public enum PDUSUBTYPESENUM {

    @XmlEnumValue("CONTAINER-I-PDU")
    CONTAINER___I___PDU("CONTAINER-I-PDU"),
    @XmlEnumValue("DCM-I-PDU")
    DCM___I___PDU("DCM-I-PDU"),
    @XmlEnumValue("GENERAL-PURPOSE-I-PDU")
    GENERAL___PURPOSE___I___PDU("GENERAL-PURPOSE-I-PDU"),
    @XmlEnumValue("GENERAL-PURPOSE-PDU")
    GENERAL___PURPOSE___PDU("GENERAL-PURPOSE-PDU"),
    @XmlEnumValue("I-PDU")
    I___PDU("I-PDU"),
    @XmlEnumValue("I-SIGNAL-I-PDU")
    I___SIGNAL___I___PDU("I-SIGNAL-I-PDU"),
    @XmlEnumValue("J-1939-DCM-I-PDU")
    J___1939___DCM___I___PDU("J-1939-DCM-I-PDU"),
    @XmlEnumValue("MULTIPLEXED-I-PDU")
    MULTIPLEXED___I___PDU("MULTIPLEXED-I-PDU"),
    @XmlEnumValue("N-PDU")
    N___PDU("N-PDU"),
    @XmlEnumValue("NM-PDU")
    NM___PDU("NM-PDU"),
    PDU("PDU"),
    @XmlEnumValue("SECURED-I-PDU")
    SECURED___I___PDU("SECURED-I-PDU"),
    @XmlEnumValue("USER-DEFINED-I-PDU")
    USER___DEFINED___I___PDU("USER-DEFINED-I-PDU"),
    @XmlEnumValue("USER-DEFINED-PDU")
    USER___DEFINED___PDU("USER-DEFINED-PDU"),
    @XmlEnumValue("XCP-PDU")
    XCP___PDU("XCP-PDU");
    private final String value;

    PDUSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDUSUBTYPESENUM fromValue(String v) {
        for (PDUSUBTYPESENUM c: PDUSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
