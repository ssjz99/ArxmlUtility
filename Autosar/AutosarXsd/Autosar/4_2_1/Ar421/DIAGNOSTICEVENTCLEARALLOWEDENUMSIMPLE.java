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
 * <p>DIAGNOSTIC-EVENT-CLEAR-ALLOWED-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-EVENT-CLEAR-ALLOWED-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALWAYS"/>
 *     &lt;enumeration value="NEVER"/>
 *     &lt;enumeration value="REQUIRES-CALLBACK-EXECUTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-EVENT-CLEAR-ALLOWED-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICEVENTCLEARALLOWEDENUMSIMPLE {


    /**
     * The clearing is allowed unconditionally.
     * 
     */
    ALWAYS("ALWAYS"),

    /**
     * The clearing is never allowed.
     * 
     */
    NEVER("NEVER"),

    /**
     * In case the clearing of a Diagnostic Event has to be allowed or prohibited through the SWC interface CallbackClearEventAllowed, the SWC has to indicate this by defining appropriate ServiceNeeds (i.e. DiagnosticEventNeeds).
     * 
     */
    @XmlEnumValue("REQUIRES-CALLBACK-EXECUTION")
    REQUIRES___CALLBACK___EXECUTION("REQUIRES-CALLBACK-EXECUTION");
    private final String value;

    DIAGNOSTICEVENTCLEARALLOWEDENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICEVENTCLEARALLOWEDENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICEVENTCLEARALLOWEDENUMSIMPLE c: DIAGNOSTICEVENTCLEARALLOWEDENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
