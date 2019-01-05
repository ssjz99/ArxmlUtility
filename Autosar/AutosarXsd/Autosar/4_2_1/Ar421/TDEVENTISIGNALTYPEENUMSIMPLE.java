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
 * <p>TD-EVENT-I-SIGNAL-TYPE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-I-SIGNAL-TYPE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I-SIGNAL-AVAILABLE-FOR-RTE"/>
 *     &lt;enumeration value="I-SIGNAL-SENT-TO-COM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-I-SIGNAL-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TDEVENTISIGNALTYPEENUMSIMPLE {


    /**
     * A point in time, where the COM module makes the contained signal / signal group available for the RTE and the corresponding Rx Indication callout is generated (if configured).
     * 
     */
    @XmlEnumValue("I-SIGNAL-AVAILABLE-FOR-RTE")
    I___SIGNAL___AVAILABLE___FOR___RTE("I-SIGNAL-AVAILABLE-FOR-RTE"),

    /**
     * A point in time, where a transmission request call is issued by the RTE on a named COM signal / signal group and the new value is stored to the carrier COM I-PDU buffer.
     * 
     */
    @XmlEnumValue("I-SIGNAL-SENT-TO-COM")
    I___SIGNAL___SENT___TO___COM("I-SIGNAL-SENT-TO-COM");
    private final String value;

    TDEVENTISIGNALTYPEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTISIGNALTYPEENUMSIMPLE fromValue(String v) {
        for (TDEVENTISIGNALTYPEENUMSIMPLE c: TDEVENTISIGNALTYPEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
