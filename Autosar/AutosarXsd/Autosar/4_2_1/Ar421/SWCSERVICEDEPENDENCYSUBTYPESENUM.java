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
 * <p>SWC-SERVICE-DEPENDENCY--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SWC-SERVICE-DEPENDENCY--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SWC-SERVICE-DEPENDENCY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SWC-SERVICE-DEPENDENCY--SUBTYPES-ENUM")
@XmlEnum
public enum SWCSERVICEDEPENDENCYSUBTYPESENUM {

    @XmlEnumValue("SWC-SERVICE-DEPENDENCY")
    SWC___SERVICE___DEPENDENCY("SWC-SERVICE-DEPENDENCY");
    private final String value;

    SWCSERVICEDEPENDENCYSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWCSERVICEDEPENDENCYSUBTYPESENUM fromValue(String v) {
        for (SWCSERVICEDEPENDENCYSUBTYPESENUM c: SWCSERVICEDEPENDENCYSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}