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
 * <p>TD-EVENT-SWC--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TD-EVENT-SWC--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TD-EVENT-SWC"/>
 *     &lt;enumeration value="TD-EVENT-SWC-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TD-EVENT-SWC--SUBTYPES-ENUM")
@XmlEnum
public enum TDEVENTSWCSUBTYPESENUM {

    @XmlEnumValue("TD-EVENT-SWC")
    TD___EVENT___SWC("TD-EVENT-SWC"),
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR")
    TD___EVENT___SWC___INTERNAL___BEHAVIOR("TD-EVENT-SWC-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE")
    TD___EVENT___SWC___INTERNAL___BEHAVIOR___REFERENCE("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE");
    private final String value;

    TDEVENTSWCSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDEVENTSWCSUBTYPESENUM fromValue(String v) {
        for (TDEVENTSWCSUBTYPESENUM c: TDEVENTSWCSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
