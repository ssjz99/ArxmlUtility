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
 * <p>DIAGNOSTIC-INITIAL-EVENT-STATUS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-INITIAL-EVENT-STATUS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETURN-ON-EVENT-CLEARED"/>
 *     &lt;enumeration value="RETURN-ON-EVENT-STOPPED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-INITIAL-EVENT-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICINITIALEVENTSTATUSENUMSIMPLE {


    /**
     * This means that the ResponseOnEvent is initially cleared.
     * 
     */
    @XmlEnumValue("RETURN-ON-EVENT-CLEARED")
    RETURN___ON___EVENT___CLEARED("RETURN-ON-EVENT-CLEARED"),

    /**
     * This means that the ResponseOnEvent is initially stopped.
     * 
     */
    @XmlEnumValue("RETURN-ON-EVENT-STOPPED")
    RETURN___ON___EVENT___STOPPED("RETURN-ON-EVENT-STOPPED");
    private final String value;

    DIAGNOSTICINITIALEVENTSTATUSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICINITIALEVENTSTATUSENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICINITIALEVENTSTATUSENUMSIMPLE c: DIAGNOSTICINITIALEVENTSTATUSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
