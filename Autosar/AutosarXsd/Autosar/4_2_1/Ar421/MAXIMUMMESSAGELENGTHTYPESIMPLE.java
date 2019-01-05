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
 * <p>MAXIMUM-MESSAGE-LENGTH-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MAXIMUM-MESSAGE-LENGTH-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I-4-G"/>
 *     &lt;enumeration value="ISO"/>
 *     &lt;enumeration value="ISO-6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MAXIMUM-MESSAGE-LENGTH-TYPE--SIMPLE")
@XmlEnum
public enum MAXIMUMMESSAGELENGTHTYPESIMPLE {


    /**
     * SF-E allowed (SF of arbitrary length depending on FrTpPduLength), up to (2**32)-1 byte message length (all FF-x allowed).
     * 
     */
    @XmlEnumValue("I-4-G")
    I___4___G("I-4-G"),

    /**
     * Up to (2**12)-1 Byte message length (No FF-Ex or SF-E or AF shall be used and recognized).
     * 
     */
    ISO("ISO"),

    /**
     * As ISO, but the maximum payload length is limited to 6 byte (SF-I, FF-I, CF). This is necessary to route TP on CAN when using Extended Addressing or Mixed Addressing on CAN.
     * 
     */
    @XmlEnumValue("ISO-6")
    ISO___6("ISO-6");
    private final String value;

    MAXIMUMMESSAGELENGTHTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MAXIMUMMESSAGELENGTHTYPESIMPLE fromValue(String v) {
        for (MAXIMUMMESSAGELENGTHTYPESIMPLE c: MAXIMUMMESSAGELENGTHTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
