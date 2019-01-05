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
 * <p>TRIGGER-MODE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TRIGGER-MODE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DYNAMIC-PART-TRIGGER"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="STATIC-OR-DYNAMIC-PART-TRIGGER"/>
 *     &lt;enumeration value="STATIC-PART-TRIGGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TRIGGER-MODE--SIMPLE")
@XmlEnum
public enum TRIGGERMODESIMPLE {


    /**
     * IPduM sends a transmission request to the PduR if a dynamic part is received.
     * 
     */
    @XmlEnumValue("DYNAMIC-PART-TRIGGER")
    DYNAMIC___PART___TRIGGER("DYNAMIC-PART-TRIGGER"),

    /**
     * IPduM does not trigger transmission because of receiving anything of this IPdu in case of TriggerTransmit.
     * 
     */
    NONE("NONE"),

    /**
     * IPduM sends a transmission request to the PduR if a static or dynamic part is received.
     * 
     */
    @XmlEnumValue("STATIC-OR-DYNAMIC-PART-TRIGGER")
    STATIC___OR___DYNAMIC___PART___TRIGGER("STATIC-OR-DYNAMIC-PART-TRIGGER"),

    /**
     * IPduM sends a transmission request to the PduR if a static part is received.
     * 
     */
    @XmlEnumValue("STATIC-PART-TRIGGER")
    STATIC___PART___TRIGGER("STATIC-PART-TRIGGER");
    private final String value;

    TRIGGERMODESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRIGGERMODESIMPLE fromValue(String v) {
        for (TRIGGERMODESIMPLE c: TRIGGERMODESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
