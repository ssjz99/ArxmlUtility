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
 * <p>PER-INSTANCE-MEMORY--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PER-INSTANCE-MEMORY--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PER-INSTANCE-MEMORY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PER-INSTANCE-MEMORY--SUBTYPES-ENUM")
@XmlEnum
public enum PERINSTANCEMEMORYSUBTYPESENUM {

    @XmlEnumValue("PER-INSTANCE-MEMORY")
    PER___INSTANCE___MEMORY("PER-INSTANCE-MEMORY");
    private final String value;

    PERINSTANCEMEMORYSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PERINSTANCEMEMORYSUBTYPESENUM fromValue(String v) {
        for (PERINSTANCEMEMORYSUBTYPESENUM c: PERINSTANCEMEMORYSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
