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
 * <p>LIFE-CYCLE-STATE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LIFE-CYCLE-STATE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIFE-CYCLE-STATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIFE-CYCLE-STATE--SUBTYPES-ENUM")
@XmlEnum
public enum LIFECYCLESTATESUBTYPESENUM {

    @XmlEnumValue("LIFE-CYCLE-STATE")
    LIFE___CYCLE___STATE("LIFE-CYCLE-STATE");
    private final String value;

    LIFECYCLESTATESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LIFECYCLESTATESUBTYPESENUM fromValue(String v) {
        for (LIFECYCLESTATESUBTYPESENUM c: LIFECYCLESTATESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
