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
 * <p>EVENT-HANDLER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EVENT-HANDLER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENT-HANDLER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EVENT-HANDLER--SUBTYPES-ENUM")
@XmlEnum
public enum EVENTHANDLERSUBTYPESENUM {

    @XmlEnumValue("EVENT-HANDLER")
    EVENT___HANDLER("EVENT-HANDLER");
    private final String value;

    EVENTHANDLERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EVENTHANDLERSUBTYPESENUM fromValue(String v) {
        for (EVENTHANDLERSUBTYPESENUM c: EVENTHANDLERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
