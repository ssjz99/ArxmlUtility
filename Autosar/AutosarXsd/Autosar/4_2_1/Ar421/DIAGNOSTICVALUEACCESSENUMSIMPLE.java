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
 * <p>DIAGNOSTIC-VALUE-ACCESS-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-VALUE-ACCESS-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="READ-ONLY"/>
 *     &lt;enumeration value="READ-WRITE"/>
 *     &lt;enumeration value="WRITE-ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-VALUE-ACCESS-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICVALUEACCESSENUMSIMPLE {


    /**
     * The access to the data element is limited to read-only. This is typically used to read-out diagnostic information (e.g. current values).
     * 
     */
    @XmlEnumValue("READ-ONLY")
    READ___ONLY("READ-ONLY"),

    /**
     * The value of the diagnostic data element is classified as configurable (read and write access is possible).
     * 
     */
    @XmlEnumValue("READ-WRITE")
    READ___WRITE("READ-WRITE"),

    /**
     * The access to the data element is limited to write-only. This supports the use case where the Dcm just writes data to the application software without the intention to read it back,
     * 
     */
    @XmlEnumValue("WRITE-ONLY")
    WRITE___ONLY("WRITE-ONLY");
    private final String value;

    DIAGNOSTICVALUEACCESSENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICVALUEACCESSENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICVALUEACCESSENUMSIMPLE c: DIAGNOSTICVALUEACCESSENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
