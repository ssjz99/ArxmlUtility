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
 * <p>SW-COMPONENT-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-COMPONENT-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW-COMPONENT-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-COMPONENT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum SWCOMPONENTPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("SW-COMPONENT-PROTOTYPE")
    SW___COMPONENT___PROTOTYPE("SW-COMPONENT-PROTOTYPE");
    private final String value;

    SWCOMPONENTPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWCOMPONENTPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (SWCOMPONENTPROTOTYPESUBTYPESENUM c: SWCOMPONENTPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
