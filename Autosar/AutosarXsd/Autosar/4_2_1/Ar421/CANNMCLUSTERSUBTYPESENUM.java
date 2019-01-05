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
 * <p>CAN-NM-CLUSTER--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CAN-NM-CLUSTER--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAN-NM-CLUSTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CAN-NM-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum CANNMCLUSTERSUBTYPESENUM {

    @XmlEnumValue("CAN-NM-CLUSTER")
    CAN___NM___CLUSTER("CAN-NM-CLUSTER");
    private final String value;

    CANNMCLUSTERSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CANNMCLUSTERSUBTYPESENUM fromValue(String v) {
        for (CANNMCLUSTERSUBTYPESENUM c: CANNMCLUSTERSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
