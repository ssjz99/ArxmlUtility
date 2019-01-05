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
 * <p>LIN-SCHEDULE-TABLE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="LIN-SCHEDULE-TABLE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIN-SCHEDULE-TABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LIN-SCHEDULE-TABLE--SUBTYPES-ENUM")
@XmlEnum
public enum LINSCHEDULETABLESUBTYPESENUM {

    @XmlEnumValue("LIN-SCHEDULE-TABLE")
    LIN___SCHEDULE___TABLE("LIN-SCHEDULE-TABLE");
    private final String value;

    LINSCHEDULETABLESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LINSCHEDULETABLESUBTYPESENUM fromValue(String v) {
        for (LINSCHEDULETABLESUBTYPESENUM c: LINSCHEDULETABLESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
