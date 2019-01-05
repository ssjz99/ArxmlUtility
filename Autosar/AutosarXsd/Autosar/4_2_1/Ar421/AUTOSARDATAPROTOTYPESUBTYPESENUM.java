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
 * <p>AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARGUMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="AUTOSAR-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="PARAMETER-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="VARIABLE-DATA-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AUTOSARDATAPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT___DATA___PROTOTYPE("ARGUMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("AUTOSAR-DATA-PROTOTYPE")
    AUTOSAR___DATA___PROTOTYPE("AUTOSAR-DATA-PROTOTYPE"),
    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER___DATA___PROTOTYPE("PARAMETER-DATA-PROTOTYPE"),
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
    VARIABLE___DATA___PROTOTYPE("VARIABLE-DATA-PROTOTYPE");
    private final String value;

    AUTOSARDATAPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUTOSARDATAPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (AUTOSARDATAPROTOTYPESUBTYPESENUM c: AUTOSARDATAPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
