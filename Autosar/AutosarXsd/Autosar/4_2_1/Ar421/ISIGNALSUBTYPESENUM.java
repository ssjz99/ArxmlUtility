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
 * <p>I-SIGNAL--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="I-SIGNAL--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I-SIGNAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "I-SIGNAL--SUBTYPES-ENUM")
@XmlEnum
public enum ISIGNALSUBTYPESENUM {

    @XmlEnumValue("I-SIGNAL")
    I___SIGNAL("I-SIGNAL");
    private final String value;

    ISIGNALSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ISIGNALSUBTYPESENUM fromValue(String v) {
        for (ISIGNALSUBTYPESENUM c: ISIGNALSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
