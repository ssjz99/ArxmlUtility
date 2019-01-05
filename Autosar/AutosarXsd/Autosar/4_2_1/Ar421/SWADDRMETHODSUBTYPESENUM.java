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
 * <p>SW-ADDR-METHOD--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-ADDR-METHOD--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW-ADDR-METHOD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-ADDR-METHOD--SUBTYPES-ENUM")
@XmlEnum
public enum SWADDRMETHODSUBTYPESENUM {

    @XmlEnumValue("SW-ADDR-METHOD")
    SW___ADDR___METHOD("SW-ADDR-METHOD");
    private final String value;

    SWADDRMETHODSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWADDRMETHODSUBTYPESENUM fromValue(String v) {
        for (SWADDRMETHODSUBTYPESENUM c: SWADDRMETHODSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
