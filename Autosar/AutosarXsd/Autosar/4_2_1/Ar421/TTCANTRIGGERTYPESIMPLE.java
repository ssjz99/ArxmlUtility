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
 * <p>TTCAN-TRIGGER-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TTCAN-TRIGGER-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RX-TRIGGER"/>
 *     &lt;enumeration value="TX-REF-TRIGGER"/>
 *     &lt;enumeration value="TX-REF-TRIGGER-GAP"/>
 *     &lt;enumeration value="TX-TRIGGER-MERGED"/>
 *     &lt;enumeration value="TX-TRIGGER-SINGLE"/>
 *     &lt;enumeration value="WATCH-TRIGGER"/>
 *     &lt;enumeration value="WATCH-TRIGGER-GAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TTCAN-TRIGGER-TYPE--SIMPLE")
@XmlEnum
public enum TTCANTRIGGERTYPESIMPLE {


    /**
     * Check for message reception
     * 
     */
    @XmlEnumValue("RX-TRIGGER")
    RX___TRIGGER("RX-TRIGGER"),

    /**
     * Send reference message in periodic case
     * 
     */
    @XmlEnumValue("TX-REF-TRIGGER")
    TX___REF___TRIGGER("TX-REF-TRIGGER"),

    /**
     * Send reference message in event-synchronised case
     * 
     */
    @XmlEnumValue("TX-REF-TRIGGER-GAP")
    TX___REF___TRIGGER___GAP("TX-REF-TRIGGER-GAP"),

    /**
     * Send message in a merged arbitration window
     * 
     */
    @XmlEnumValue("TX-TRIGGER-MERGED")
    TX___TRIGGER___MERGED("TX-TRIGGER-MERGED"),

    /**
     * Send message in an exclusive time window
     * 
     */
    @XmlEnumValue("TX-TRIGGER-SINGLE")
    TX___TRIGGER___SINGLE("TX-TRIGGER-SINGLE"),

    /**
     * Check for missing reference message in periodic case
     * 
     */
    @XmlEnumValue("WATCH-TRIGGER")
    WATCH___TRIGGER("WATCH-TRIGGER"),

    /**
     * Check for missing reference message in event-synchronised case
     * 
     */
    @XmlEnumValue("WATCH-TRIGGER-GAP")
    WATCH___TRIGGER___GAP("WATCH-TRIGGER-GAP");
    private final String value;

    TTCANTRIGGERTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTCANTRIGGERTYPESIMPLE fromValue(String v) {
        for (TTCANTRIGGERTYPESIMPLE c: TTCANTRIGGERTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
