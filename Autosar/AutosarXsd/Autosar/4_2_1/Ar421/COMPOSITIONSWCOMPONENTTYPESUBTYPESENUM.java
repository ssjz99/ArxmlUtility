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
 * <p>COMPOSITION-SW-COMPONENT-TYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="COMPOSITION-SW-COMPONENT-TYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPOSITION-SW-COMPONENT-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COMPOSITION-SW-COMPONENT-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM {

    @XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
    COMPOSITION___SW___COMPONENT___TYPE("COMPOSITION-SW-COMPONENT-TYPE");
    private final String value;

    COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM fromValue(String v) {
        for (COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM c: COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
