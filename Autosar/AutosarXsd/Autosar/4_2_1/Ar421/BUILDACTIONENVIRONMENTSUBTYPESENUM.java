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
 * <p>BUILD-ACTION-ENVIRONMENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BUILD-ACTION-ENVIRONMENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUILD-ACTION-ENVIRONMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BUILD-ACTION-ENVIRONMENT--SUBTYPES-ENUM")
@XmlEnum
public enum BUILDACTIONENVIRONMENTSUBTYPESENUM {

    @XmlEnumValue("BUILD-ACTION-ENVIRONMENT")
    BUILD___ACTION___ENVIRONMENT("BUILD-ACTION-ENVIRONMENT");
    private final String value;

    BUILDACTIONENVIRONMENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BUILDACTIONENVIRONMENTSUBTYPESENUM fromValue(String v) {
        for (BUILDACTIONENVIRONMENTSUBTYPESENUM c: BUILDACTIONENVIRONMENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}