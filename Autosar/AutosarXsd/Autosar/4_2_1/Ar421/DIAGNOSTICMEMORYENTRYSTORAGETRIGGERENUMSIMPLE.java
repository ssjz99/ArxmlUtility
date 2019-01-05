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
 * <p>DIAGNOSTIC-MEMORY-ENTRY-STORAGE-TRIGGER-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-MEMORY-ENTRY-STORAGE-TRIGGER-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="FDC-THRESHOLD"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="TEST-FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-MEMORY-ENTRY-STORAGE-TRIGGER-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUMSIMPLE {


    /**
     * Status information of UDS DTC status bit 3
     * 
     */
    CONFIRMED("CONFIRMED"),

    /**
     * Threshold to allocate an event memory entry and to capture the Freeze Frame.
     * 
     */
    @XmlEnumValue("FDC-THRESHOLD")
    FDC___THRESHOLD("FDC-THRESHOLD"),

    /**
     * Status information of UDS DTC status bit 2.
     * 
     */
    PENDING("PENDING"),

    /**
     * Status information of UDS DTC status bit 0.
     * 
     */
    @XmlEnumValue("TEST-FAILED")
    TEST___FAILED("TEST-FAILED");
    private final String value;

    DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUMSIMPLE c: DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
