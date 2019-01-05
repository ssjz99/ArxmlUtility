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
 * <p>KEY-USAGE-RESTRICTION-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="KEY-USAGE-RESTRICTION-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERATE"/>
 *     &lt;enumeration value="GENERATE-AND-VERIFY"/>
 *     &lt;enumeration value="VERIFY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KEY-USAGE-RESTRICTION-ENUM--SIMPLE")
@XmlEnum
public enum KEYUSAGERESTRICTIONENUMSIMPLE {

    GENERATE("GENERATE"),
    @XmlEnumValue("GENERATE-AND-VERIFY")
    GENERATE___AND___VERIFY("GENERATE-AND-VERIFY"),
    VERIFY("VERIFY");
    private final String value;

    KEYUSAGERESTRICTIONENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KEYUSAGERESTRICTIONENUMSIMPLE fromValue(String v) {
        for (KEYUSAGERESTRICTIONENUMSIMPLE c: KEYUSAGERESTRICTIONENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
