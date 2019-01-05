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
 * <p>SERIALIZATION-TECHNOLOGY--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SERIALIZATION-TECHNOLOGY--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SERIALIZATION-TECHNOLOGY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SERIALIZATION-TECHNOLOGY--SUBTYPES-ENUM")
@XmlEnum
public enum SERIALIZATIONTECHNOLOGYSUBTYPESENUM {

    @XmlEnumValue("SERIALIZATION-TECHNOLOGY")
    SERIALIZATION___TECHNOLOGY("SERIALIZATION-TECHNOLOGY");
    private final String value;

    SERIALIZATIONTECHNOLOGYSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SERIALIZATIONTECHNOLOGYSUBTYPESENUM fromValue(String v) {
        for (SERIALIZATIONTECHNOLOGYSUBTYPESENUM c: SERIALIZATIONTECHNOLOGYSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
