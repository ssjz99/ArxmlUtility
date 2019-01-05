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
 * <p>AUTOSAR-VARIABLE-INSTANCE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="AUTOSAR-VARIABLE-INSTANCE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTOSAR-VARIABLE-INSTANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUTOSAR-VARIABLE-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum AUTOSARVARIABLEINSTANCESUBTYPESENUM {

    @XmlEnumValue("AUTOSAR-VARIABLE-INSTANCE")
    AUTOSAR___VARIABLE___INSTANCE("AUTOSAR-VARIABLE-INSTANCE");
    private final String value;

    AUTOSARVARIABLEINSTANCESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUTOSARVARIABLEINSTANCESUBTYPESENUM fromValue(String v) {
        for (AUTOSARVARIABLEINSTANCESUBTYPESENUM c: AUTOSARVARIABLEINSTANCESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
