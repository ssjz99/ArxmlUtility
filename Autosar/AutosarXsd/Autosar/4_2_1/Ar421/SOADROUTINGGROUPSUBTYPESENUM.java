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
 * <p>SO-AD-ROUTING-GROUP--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SO-AD-ROUTING-GROUP--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SO-AD-ROUTING-GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SO-AD-ROUTING-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum SOADROUTINGGROUPSUBTYPESENUM {

    @XmlEnumValue("SO-AD-ROUTING-GROUP")
    SO___AD___ROUTING___GROUP("SO-AD-ROUTING-GROUP");
    private final String value;

    SOADROUTINGGROUPSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SOADROUTINGGROUPSUBTYPESENUM fromValue(String v) {
        for (SOADROUTINGGROUPSUBTYPESENUM c: SOADROUTINGGROUPSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
