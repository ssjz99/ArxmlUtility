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
 * <p>AUTOSAR-OPERATION-ARGUMENT-INSTANCE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="AUTOSAR-OPERATION-ARGUMENT-INSTANCE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTOSAR-OPERATION-ARGUMENT-INSTANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUTOSAR-OPERATION-ARGUMENT-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum AUTOSAROPERATIONARGUMENTINSTANCESUBTYPESENUM {

    @XmlEnumValue("AUTOSAR-OPERATION-ARGUMENT-INSTANCE")
    AUTOSAR___OPERATION___ARGUMENT___INSTANCE("AUTOSAR-OPERATION-ARGUMENT-INSTANCE");
    private final String value;

    AUTOSAROPERATIONARGUMENTINSTANCESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUTOSAROPERATIONARGUMENTINSTANCESUBTYPESENUM fromValue(String v) {
        for (AUTOSAROPERATIONARGUMENTINSTANCESUBTYPESENUM c: AUTOSAROPERATIONARGUMENTINSTANCESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
