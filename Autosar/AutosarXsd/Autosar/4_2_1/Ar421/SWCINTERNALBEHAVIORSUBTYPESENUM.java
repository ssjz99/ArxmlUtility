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
 * <p>SWC-INTERNAL-BEHAVIOR--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SWC-INTERNAL-BEHAVIOR--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SWC-INTERNAL-BEHAVIOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SWC-INTERNAL-BEHAVIOR--SUBTYPES-ENUM")
@XmlEnum
public enum SWCINTERNALBEHAVIORSUBTYPESENUM {

    @XmlEnumValue("SWC-INTERNAL-BEHAVIOR")
    SWC___INTERNAL___BEHAVIOR("SWC-INTERNAL-BEHAVIOR");
    private final String value;

    SWCINTERNALBEHAVIORSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWCINTERNALBEHAVIORSUBTYPESENUM fromValue(String v) {
        for (SWCINTERNALBEHAVIORSUBTYPESENUM c: SWCINTERNALBEHAVIORSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
