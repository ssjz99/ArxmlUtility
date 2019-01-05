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
 * <p>DIAGNOSTIC-EVENT-DISPLACEMENT-STRATEGY-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DIAGNOSTIC-EVENT-DISPLACEMENT-STRATEGY-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PRIO-OCC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DIAGNOSTIC-EVENT-DISPLACEMENT-STRATEGY-ENUM--SIMPLE")
@XmlEnum
public enum DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUMSIMPLE {


    /**
     * Event memory entry displacement is enabled, by consideration of priority active/passive status, and occurrence.
     * 
     */
    FULL("FULL"),

    /**
     * Event memory entry displacement is disabled.
     * 
     */
    NONE("NONE"),

    /**
     * Event memory entry displacement is enabled, by consideration of priority and occurrence (but without active/passive status).
     * 
     */
    @XmlEnumValue("PRIO-OCC")
    PRIO___OCC("PRIO-OCC");
    private final String value;

    DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUMSIMPLE fromValue(String v) {
        for (DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUMSIMPLE c: DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
