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
 * <p>DTC-KIND-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DTC-KIND-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMISSION-RELATED-DTC"/>
 *     &lt;enumeration value="NON-EMMISSION-RELATED-DTC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DTC-KIND-ENUM--SIMPLE")
@XmlEnum
public enum DTCKINDENUMSIMPLE {


    /**
     * This indicates that the monitor reports a OBD-relevant malfunction.
     * 
     */
    @XmlEnumValue("EMISSION-RELATED-DTC")
    EMISSION___RELATED___DTC("EMISSION-RELATED-DTC"),

    /**
     * This indicates that the monitor reports a non-OBD-relevant malfunction.
     * 
     */
    @XmlEnumValue("NON-EMMISSION-RELATED-DTC")
    NON___EMMISSION___RELATED___DTC("NON-EMMISSION-RELATED-DTC");
    private final String value;

    DTCKINDENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DTCKINDENUMSIMPLE fromValue(String v) {
        for (DTCKINDENUMSIMPLE c: DTCKINDENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
