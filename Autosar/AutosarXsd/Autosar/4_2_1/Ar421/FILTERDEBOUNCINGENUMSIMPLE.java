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
 * <p>FILTER-DEBOUNCING-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FILTER-DEBOUNCING-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEBOUNCE-DATA"/>
 *     &lt;enumeration value="RAW-DATA"/>
 *     &lt;enumeration value="WAIT-TIME-DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FILTER-DEBOUNCING-ENUM--SIMPLE")
@XmlEnum
public enum FILTERDEBOUNCINGENUMSIMPLE {


    /**
     * The signal is a
     * mean value
     * 
     */
    @XmlEnumValue("DEBOUNCE-DATA")
    DEBOUNCE___DATA("DEBOUNCE-DATA"),

    /**
     * Means that no modification of the
     * signal has been applied. This is the default
     * value
     * 
     */
    @XmlEnumValue("RAW-DATA")
    RAW___DATA("RAW-DATA"),

    /**
     * The signal is delivered by a GET operation after a certain amount of time
     * 
     */
    @XmlEnumValue("WAIT-TIME-DATE")
    WAIT___TIME___DATE("WAIT-TIME-DATE");
    private final String value;

    FILTERDEBOUNCINGENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FILTERDEBOUNCINGENUMSIMPLE fromValue(String v) {
        for (FILTERDEBOUNCINGENUMSIMPLE c: FILTERDEBOUNCINGENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
