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
 * <p>DIAGNOSTIC-HANDLE-DDDI-CONFIGURATION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-HANDLE-DDDI-CONFIGURATION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON-VOLATILE"/>
 *     &lt;enumeration value="VOLATILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-HANDLE-DDDI-CONFIGURATION-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICHANDLEDDDICONFIGURATIONENUMSIMPLE {


    /**
     * This indicates that the configuration of DynamicallyDefineDataIdentifier shall be stored as non-volatile data.
     * 
     */
    @XmlEnumValue("NON-VOLATILE")
    NON___VOLATILE("NON-VOLATILE"),

    /**
     * This indicates that the configuration of DynamicallyDefineDataIdentifier shall be handled as volatile data.
     * 
     */
    VOLATILE("VOLATILE");
    private final String value;

    DIAGNOSTICHANDLEDDDICONFIGURATIONENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICHANDLEDDDICONFIGURATIONENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICHANDLEDDDICONFIGURATIONENUMSIMPLE c: DIAGNOSTICHANDLEDDDICONFIGURATIONENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
