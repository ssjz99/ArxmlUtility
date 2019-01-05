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
 * <p>TTCAN-CLUSTER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TTCAN-CLUSTER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TTCAN-CLUSTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TTCAN-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum TTCANCLUSTERSUBTYPESENUM {

    @XmlEnumValue("TTCAN-CLUSTER")
    TTCAN___CLUSTER("TTCAN-CLUSTER");
    private final String value;

    TTCANCLUSTERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTCANCLUSTERSUBTYPESENUM fromValue(String v) {
        for (TTCANCLUSTERSUBTYPESENUM c: TTCANCLUSTERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
