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
 * <p>MODE-ERROR-REACTION-POLICY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MODE-ERROR-REACTION-POLICY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT-MODE"/>
 *     &lt;enumeration value="LAST-MODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MODE-ERROR-REACTION-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum MODEERRORREACTIONPOLICYENUMSIMPLE {


    /**
     * This represents the ability to switch to the defaultMode in case of a mode error.
     * 
     */
    @XmlEnumValue("DEFAULT-MODE")
    DEFAULT___MODE("DEFAULT-MODE"),

    /**
     * This represents the ability to keep the last mode in case of a mode error.
     * 
     */
    @XmlEnumValue("LAST-MODE")
    LAST___MODE("LAST-MODE");
    private final String value;

    MODEERRORREACTIONPOLICYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MODEERRORREACTIONPOLICYENUMSIMPLE fromValue(String v) {
        for (MODEERRORREACTIONPOLICYENUMSIMPLE c: MODEERRORREACTIONPOLICYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
