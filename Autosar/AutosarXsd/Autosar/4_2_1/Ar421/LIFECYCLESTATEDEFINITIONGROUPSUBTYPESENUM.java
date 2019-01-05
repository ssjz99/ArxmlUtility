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
 * <p>LIFE-CYCLE-STATE-DEFINITION-GROUP--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LIFE-CYCLE-STATE-DEFINITION-GROUP--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIFE-CYCLE-STATE-DEFINITION-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIFE-CYCLE-STATE-DEFINITION-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM {

    @XmlEnumValue("LIFE-CYCLE-STATE-DEFINITION-GROUP")
    LIFE___CYCLE___STATE___DEFINITION___GROUP("LIFE-CYCLE-STATE-DEFINITION-GROUP");
    private final String value;

    LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM fromValue(String v) {
        for (LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM c: LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
