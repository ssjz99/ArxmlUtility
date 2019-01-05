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
 * <p>TIMING-EVENT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TIMING-EVENT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIMING-EVENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIMING-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum TIMINGEVENTSUBTYPESENUM {

    @XmlEnumValue("TIMING-EVENT")
    TIMING___EVENT("TIMING-EVENT");
    private final String value;

    TIMINGEVENTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMINGEVENTSUBTYPESENUM fromValue(String v) {
        for (TIMINGEVENTSUBTYPESENUM c: TIMINGEVENTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
