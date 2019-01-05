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
 * <p>PORT-INTERFACE-MAPPING--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PORT-INTERFACE-MAPPING--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="MODE-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="PORT-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="VARIABLE-AND-PARAMETER-INTERFACE-MAPPING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PORT-INTERFACE-MAPPING--SUBTYPES-ENUM")
@XmlEnum
public enum PORTINTERFACEMAPPINGSUBTYPESENUM {

    @XmlEnumValue("CLIENT-SERVER-INTERFACE-MAPPING")
    CLIENT___SERVER___INTERFACE___MAPPING("CLIENT-SERVER-INTERFACE-MAPPING"),
    @XmlEnumValue("MODE-INTERFACE-MAPPING")
    MODE___INTERFACE___MAPPING("MODE-INTERFACE-MAPPING"),
    @XmlEnumValue("PORT-INTERFACE-MAPPING")
    PORT___INTERFACE___MAPPING("PORT-INTERFACE-MAPPING"),
    @XmlEnumValue("TRIGGER-INTERFACE-MAPPING")
    TRIGGER___INTERFACE___MAPPING("TRIGGER-INTERFACE-MAPPING"),
    @XmlEnumValue("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING")
    VARIABLE___AND___PARAMETER___INTERFACE___MAPPING("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING");
    private final String value;

    PORTINTERFACEMAPPINGSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PORTINTERFACEMAPPINGSUBTYPESENUM fromValue(String v) {
        for (PORTINTERFACEMAPPINGSUBTYPESENUM c: PORTINTERFACEMAPPINGSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
