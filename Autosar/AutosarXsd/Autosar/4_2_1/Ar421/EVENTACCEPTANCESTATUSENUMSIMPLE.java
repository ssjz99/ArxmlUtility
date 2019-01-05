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
 * <p>EVENT-ACCEPTANCE-STATUS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EVENT-ACCEPTANCE-STATUS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENT-ACCEPTANCE-DISABLED"/>
 *     &lt;enumeration value="EVENT-ACCEPTANCE-ENABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EVENT-ACCEPTANCE-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum EVENTACCEPTANCESTATUSENUMSIMPLE {


    /**
     * Acceptance of a diagnostic event is disabled.
     * 
     */
    @XmlEnumValue("EVENT-ACCEPTANCE-DISABLED")
    EVENT___ACCEPTANCE___DISABLED("EVENT-ACCEPTANCE-DISABLED"),

    /**
     * Acceptance of a diagnostic event is enabled.
     * 
     */
    @XmlEnumValue("EVENT-ACCEPTANCE-ENABLED")
    EVENT___ACCEPTANCE___ENABLED("EVENT-ACCEPTANCE-ENABLED");
    private final String value;

    EVENTACCEPTANCESTATUSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EVENTACCEPTANCESTATUSENUMSIMPLE fromValue(String v) {
        for (EVENTACCEPTANCESTATUSENUMSIMPLE c: EVENTACCEPTANCESTATUSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
