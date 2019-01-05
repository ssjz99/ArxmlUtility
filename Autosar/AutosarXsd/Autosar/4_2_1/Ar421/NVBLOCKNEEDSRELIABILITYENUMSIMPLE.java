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
 * <p>NV-BLOCK-NEEDS-RELIABILITY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NV-BLOCK-NEEDS-RELIABILITY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR-CORRECTION"/>
 *     &lt;enumeration value="ERROR-DETECTION"/>
 *     &lt;enumeration value="NO-PROTECTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NV-BLOCK-NEEDS-RELIABILITY-ENUM--SIMPLE")
@XmlEnum
public enum NVBLOCKNEEDSRELIABILITYENUMSIMPLE {


    /**
     * Errors shall be corrected
     * 
     */
    @XmlEnumValue("ERROR-CORRECTION")
    ERROR___CORRECTION("ERROR-CORRECTION"),

    /**
     * Errors shall be detected
     * 
     */
    @XmlEnumValue("ERROR-DETECTION")
    ERROR___DETECTION("ERROR-DETECTION"),

    /**
     * Data need not to be handled with protection
     * 
     */
    @XmlEnumValue("NO-PROTECTION")
    NO___PROTECTION("NO-PROTECTION");
    private final String value;

    NVBLOCKNEEDSRELIABILITYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NVBLOCKNEEDSRELIABILITYENUMSIMPLE fromValue(String v) {
        for (NVBLOCKNEEDSRELIABILITYENUMSIMPLE c: NVBLOCKNEEDSRELIABILITYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
