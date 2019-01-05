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
 * <p>EVENT-OCCURRENCE-KIND-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EVENT-OCCURRENCE-KIND-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MULTIPLE-OCCURRENCES"/>
 *     &lt;enumeration value="SINGLE-OCCURRENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EVENT-OCCURRENCE-KIND-ENUM--SIMPLE")
@XmlEnum
public enum EVENTOCCURRENCEKINDENUMSIMPLE {


    /**
     * Specifies that an event may occur more than once in a given time interval.
     * 
     */
    @XmlEnumValue("MULTIPLE-OCCURRENCES")
    MULTIPLE___OCCURRENCES("MULTIPLE-OCCURRENCES"),

    /**
     * Specifies that an event shall occur only once in a given time interval.
     * 
     */
    @XmlEnumValue("SINGLE-OCCURRENCE")
    SINGLE___OCCURRENCE("SINGLE-OCCURRENCE");
    private final String value;

    EVENTOCCURRENCEKINDENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EVENTOCCURRENCEKINDENUMSIMPLE fromValue(String v) {
        for (EVENTOCCURRENCEKINDENUMSIMPLE c: EVENTOCCURRENCEKINDENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
