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
 * <p>HW-PIN--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="HW-PIN--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HW-PIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HW-PIN--SUBTYPES-ENUM")
@XmlEnum
public enum HWPINSUBTYPESENUM {

    @XmlEnumValue("HW-PIN")
    HW___PIN("HW-PIN");
    private final String value;

    HWPINSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HWPINSUBTYPESENUM fromValue(String v) {
        for (HWPINSUBTYPESENUM c: HWPINSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
