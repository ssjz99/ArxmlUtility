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
 * <p>CONSUMED-EVENT-GROUP--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CONSUMED-EVENT-GROUP--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONSUMED-EVENT-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CONSUMED-EVENT-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum CONSUMEDEVENTGROUPSUBTYPESENUM {

    @XmlEnumValue("CONSUMED-EVENT-GROUP")
    CONSUMED___EVENT___GROUP("CONSUMED-EVENT-GROUP");
    private final String value;

    CONSUMEDEVENTGROUPSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CONSUMEDEVENTGROUPSUBTYPESENUM fromValue(String v) {
        for (CONSUMEDEVENTGROUPSUBTYPESENUM c: CONSUMEDEVENTGROUPSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
