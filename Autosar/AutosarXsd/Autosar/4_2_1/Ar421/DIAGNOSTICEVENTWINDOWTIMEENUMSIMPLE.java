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
 * <p>DIAGNOSTIC-EVENT-WINDOW-TIME-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-EVENT-WINDOW-TIME-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENT-WINDOW-CURRENT-AND-FOLLOWING-CYCLE"/>
 *     &lt;enumeration value="EVENT-WINDOW-CURRENT-CYCLE"/>
 *     &lt;enumeration value="EVENT-WINDOW-INFINITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-EVENT-WINDOW-TIME-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICEVENTWINDOWTIMEENUMSIMPLE {


    /**
     * This means that the window extends to this and the following cycle.
     * 
     */
    @XmlEnumValue("EVENT-WINDOW-CURRENT-AND-FOLLOWING-CYCLE")
    EVENT___WINDOW___CURRENT___AND___FOLLOWING___CYCLE("EVENT-WINDOW-CURRENT-AND-FOLLOWING-CYCLE"),

    /**
     * This means that the window is limited to the current cycle.
     * 
     */
    @XmlEnumValue("EVENT-WINDOW-CURRENT-CYCLE")
    EVENT___WINDOW___CURRENT___CYCLE("EVENT-WINDOW-CURRENT-CYCLE"),

    /**
     * This means that the window extents without a border.
     * 
     */
    @XmlEnumValue("EVENT-WINDOW-INFINITE")
    EVENT___WINDOW___INFINITE("EVENT-WINDOW-INFINITE");
    private final String value;

    DIAGNOSTICEVENTWINDOWTIMEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICEVENTWINDOWTIMEENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICEVENTWINDOWTIMEENUMSIMPLE c: DIAGNOSTICEVENTWINDOWTIMEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
