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
 * <p>ROOT-SW-COMPOSITION-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ROOT-SW-COMPOSITION-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROOT-SW-COMPOSITION-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ROOT-SW-COMPOSITION-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("ROOT-SW-COMPOSITION-PROTOTYPE")
    ROOT___SW___COMPOSITION___PROTOTYPE("ROOT-SW-COMPOSITION-PROTOTYPE");
    private final String value;

    ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM c: ROOTSWCOMPOSITIONPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
