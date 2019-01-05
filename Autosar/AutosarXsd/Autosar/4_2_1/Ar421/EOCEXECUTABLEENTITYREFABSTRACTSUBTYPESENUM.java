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
 * <p>EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EOC-EVENT-REF"/>
 *     &lt;enumeration value="EOC-EXECUTABLE-ENTITY-REF"/>
 *     &lt;enumeration value="EOC-EXECUTABLE-ENTITY-REF-ABSTRACT"/>
 *     &lt;enumeration value="EOC-EXECUTABLE-ENTITY-REF-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM")
@XmlEnum
public enum EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM {

    @XmlEnumValue("EOC-EVENT-REF")
    EOC___EVENT___REF("EOC-EVENT-REF"),
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF")
    EOC___EXECUTABLE___ENTITY___REF("EOC-EXECUTABLE-ENTITY-REF"),
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF-ABSTRACT")
    EOC___EXECUTABLE___ENTITY___REF___ABSTRACT("EOC-EXECUTABLE-ENTITY-REF-ABSTRACT"),
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF-GROUP")
    EOC___EXECUTABLE___ENTITY___REF___GROUP("EOC-EXECUTABLE-ENTITY-REF-GROUP");
    private final String value;

    EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM fromValue(String v) {
        for (EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM c: EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
