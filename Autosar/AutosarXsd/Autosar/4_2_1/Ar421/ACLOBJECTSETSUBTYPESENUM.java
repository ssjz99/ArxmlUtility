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
 * <p>ACL-OBJECT-SET--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ACL-OBJECT-SET--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACL-OBJECT-SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACL-OBJECT-SET--SUBTYPES-ENUM")
@XmlEnum
public enum ACLOBJECTSETSUBTYPESENUM {

    @XmlEnumValue("ACL-OBJECT-SET")
    ACL___OBJECT___SET("ACL-OBJECT-SET");
    private final String value;

    ACLOBJECTSETSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACLOBJECTSETSUBTYPESENUM fromValue(String v) {
        for (ACLOBJECTSETSUBTYPESENUM c: ACLOBJECTSETSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
