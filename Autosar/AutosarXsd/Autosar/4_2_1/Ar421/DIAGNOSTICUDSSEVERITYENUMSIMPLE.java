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
 * <p>DIAGNOSTIC-UDS-SEVERITY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-UDS-SEVERITY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHECK-AT-NEXT-HALT"/>
 *     &lt;enumeration value="IMMEDIATELY"/>
 *     &lt;enumeration value="MAINTENANCE-ONLY"/>
 *     &lt;enumeration value="NO-SEVERITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-UDS-SEVERITY-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICUDSSEVERITYENUMSIMPLE {


    /**
     * Check at next halt.
     * 
     */
    @XmlEnumValue("CHECK-AT-NEXT-HALT")
    CHECK___AT___NEXT___HALT("CHECK-AT-NEXT-HALT"),

    /**
     * Check immediately.
     * 
     */
    IMMEDIATELY("IMMEDIATELY"),

    /**
     * Maintenance required.
     * 
     */
    @XmlEnumValue("MAINTENANCE-ONLY")
    MAINTENANCE___ONLY("MAINTENANCE-ONLY"),

    /**
     * No severity information available.
     * 
     */
    @XmlEnumValue("NO-SEVERITY")
    NO___SEVERITY("NO-SEVERITY");
    private final String value;

    DIAGNOSTICUDSSEVERITYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICUDSSEVERITYENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICUDSSEVERITYENUMSIMPLE c: DIAGNOSTICUDSSEVERITYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
