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
 * <p>PHYSICAL-DIMENSION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PHYSICAL-DIMENSION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PHYSICAL-DIMENSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PHYSICAL-DIMENSION--SUBTYPES-ENUM")
@XmlEnum
public enum PHYSICALDIMENSIONSUBTYPESENUM {

    @XmlEnumValue("PHYSICAL-DIMENSION")
    PHYSICAL___DIMENSION("PHYSICAL-DIMENSION");
    private final String value;

    PHYSICALDIMENSIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PHYSICALDIMENSIONSUBTYPESENUM fromValue(String v) {
        for (PHYSICALDIMENSIONSUBTYPESENUM c: PHYSICALDIMENSIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}