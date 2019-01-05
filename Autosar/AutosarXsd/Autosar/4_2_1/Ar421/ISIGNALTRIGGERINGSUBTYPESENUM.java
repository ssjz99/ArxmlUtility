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
 * <p>I-SIGNAL-TRIGGERING--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="I-SIGNAL-TRIGGERING--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I-SIGNAL-TRIGGERING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "I-SIGNAL-TRIGGERING--SUBTYPES-ENUM")
@XmlEnum
public enum ISIGNALTRIGGERINGSUBTYPESENUM {

    @XmlEnumValue("I-SIGNAL-TRIGGERING")
    I___SIGNAL___TRIGGERING("I-SIGNAL-TRIGGERING");
    private final String value;

    ISIGNALTRIGGERINGSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ISIGNALTRIGGERINGSUBTYPESENUM fromValue(String v) {
        for (ISIGNALTRIGGERINGSUBTYPESENUM c: ISIGNALTRIGGERINGSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
