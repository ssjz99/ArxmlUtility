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
 * <p>ABSTRACT-SERVICE-INSTANCE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ABSTRACT-SERVICE-INSTANCE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-SERVICE-INSTANCE"/>
 *     &lt;enumeration value="CONSUMED-SERVICE-INSTANCE"/>
 *     &lt;enumeration value="PROVIDED-SERVICE-INSTANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ABSTRACT-SERVICE-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum ABSTRACTSERVICEINSTANCESUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-SERVICE-INSTANCE")
    ABSTRACT___SERVICE___INSTANCE("ABSTRACT-SERVICE-INSTANCE"),
    @XmlEnumValue("CONSUMED-SERVICE-INSTANCE")
    CONSUMED___SERVICE___INSTANCE("CONSUMED-SERVICE-INSTANCE"),
    @XmlEnumValue("PROVIDED-SERVICE-INSTANCE")
    PROVIDED___SERVICE___INSTANCE("PROVIDED-SERVICE-INSTANCE");
    private final String value;

    ABSTRACTSERVICEINSTANCESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ABSTRACTSERVICEINSTANCESUBTYPESENUM fromValue(String v) {
        for (ABSTRACTSERVICEINSTANCESUBTYPESENUM c: ABSTRACTSERVICEINSTANCESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
