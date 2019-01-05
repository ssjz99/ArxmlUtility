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
 * <p>TD-EVENT-I-PDU-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-I-PDU-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I-PDU-RECEIVED-BY-COM"/>
 *     &lt;enumeration value="I-PDU-SENT-TO-IF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-I-PDU-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTIPDUTYPEENUMSIMPLE {


    /**
     * A point in time where the received frame is processed by the corresponding (FlexRay / CAN / LIN) Interface BSW module, routed through the PDUR and the contained PDUs are pushed to the COM module.
     * 
     */
    @XmlEnumValue("I-PDU-RECEIVED-BY-COM")
    I___PDU___RECEIVED___BY___COM("I-PDU-RECEIVED-BY-COM"),

    /**
     * A point in time where the carrier COM I-PDU is routed through the PDUR and is pushed to the bus specific (FlexRay / CAN / LIN) Interface BSW module.
     * 
     */
    @XmlEnumValue("I-PDU-SENT-TO-IF")
    I___PDU___SENT___TO___IF("I-PDU-SENT-TO-IF");
    private final String value;

    TDEVENTIPDUTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTIPDUTYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTIPDUTYPEENUMSIMPLE c: TDEVENTIPDUTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
