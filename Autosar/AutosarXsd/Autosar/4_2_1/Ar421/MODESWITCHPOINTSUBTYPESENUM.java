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
 * <p>MODE-SWITCH-POINT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="MODE-SWITCH-POINT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MODE-SWITCH-POINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MODE-SWITCH-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum MODESWITCHPOINTSUBTYPESENUM {

    @XmlEnumValue("MODE-SWITCH-POINT")
    MODE___SWITCH___POINT("MODE-SWITCH-POINT");
    private final String value;

    MODESWITCHPOINTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MODESWITCHPOINTSUBTYPESENUM fromValue(String v) {
        for (MODESWITCHPOINTSUBTYPESENUM c: MODESWITCHPOINTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
