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
 * <p>FLEXRAY-NM-CLUSTER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLEXRAY-NM-CLUSTER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLEXRAY-NM-CLUSTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLEXRAY-NM-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum FLEXRAYNMCLUSTERSUBTYPESENUM {

    @XmlEnumValue("FLEXRAY-NM-CLUSTER")
    FLEXRAY___NM___CLUSTER("FLEXRAY-NM-CLUSTER");
    private final String value;

    FLEXRAYNMCLUSTERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLEXRAYNMCLUSTERSUBTYPESENUM fromValue(String v) {
        for (FLEXRAYNMCLUSTERSUBTYPESENUM c: FLEXRAYNMCLUSTERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
