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
 * <p>DIAGNOSTIC-DATA-CAPTURE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-DATA-CAPTURE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAPTURE-ASYNCHRONOUSLY-TO-REPORTING"/>
 *     &lt;enumeration value="CAPTURE-SYNCHRONOUSLY-TO-REPORTING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-DATA-CAPTURE-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICDATACAPTUREENUMSIMPLE {


    /**
     * This represents the intention to capture the environment data asynchronously after the actual capture API function terminated.
     * 
     */
    @XmlEnumValue("CAPTURE-ASYNCHRONOUSLY-TO-REPORTING")
    CAPTURE___ASYNCHRONOUSLY___TO___REPORTING("CAPTURE-ASYNCHRONOUSLY-TO-REPORTING"),

    /**
     * This represents the intention to capture the environment data synchronously within the capture API function.
     * 
     */
    @XmlEnumValue("CAPTURE-SYNCHRONOUSLY-TO-REPORTING")
    CAPTURE___SYNCHRONOUSLY___TO___REPORTING("CAPTURE-SYNCHRONOUSLY-TO-REPORTING");
    private final String value;

    DIAGNOSTICDATACAPTUREENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICDATACAPTUREENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICDATACAPTUREENUMSIMPLE c: DIAGNOSTICDATACAPTUREENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
