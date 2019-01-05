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
 * <p>ECU-PARTITION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECU-PARTITION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECU-PARTITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECU-PARTITION--SUBTYPES-ENUM")
@XmlEnum
public enum ECUPARTITIONSUBTYPESENUM {

    @XmlEnumValue("ECU-PARTITION")
    ECU___PARTITION("ECU-PARTITION");
    private final String value;

    ECUPARTITIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUPARTITIONSUBTYPESENUM fromValue(String v) {
        for (ECUPARTITIONSUBTYPESENUM c: ECUPARTITIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
