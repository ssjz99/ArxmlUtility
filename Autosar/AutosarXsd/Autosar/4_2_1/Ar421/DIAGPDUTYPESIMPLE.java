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
 * <p>DIAG-PDU-TYPE--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAG-PDU-TYPE--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAG-REQUEST"/>
 *     &lt;enumeration value="DIAG-RESPONSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAG-PDU-TYPE--SIMPLE")
@XmlEnum
public enum DIAGPDUTYPESIMPLE {


    /**
     * Diagnostic Request
     * 
     */
    @XmlEnumValue("DIAG-REQUEST")
    DIAG___REQUEST("DIAG-REQUEST"),

    /**
     * Diagnostic Response
     * 
     */
    @XmlEnumValue("DIAG-RESPONSE")
    DIAG___RESPONSE("DIAG-RESPONSE");
    private final String value;

    DIAGPDUTYPESIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGPDUTYPESIMPLE fromValue(String v) {
        for (DIAGPDUTYPESIMPLE c: DIAGPDUTYPESIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
