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
 * <p>TIMING-DESCRIPTION-EVENT-CHAIN--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TIMING-DESCRIPTION-EVENT-CHAIN--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIMING-DESCRIPTION-EVENT-CHAIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIMING-DESCRIPTION-EVENT-CHAIN--SUBTYPES-ENUM")
@XmlEnum
public enum TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM {

    @XmlEnumValue("TIMING-DESCRIPTION-EVENT-CHAIN")
    TIMING___DESCRIPTION___EVENT___CHAIN("TIMING-DESCRIPTION-EVENT-CHAIN");
    private final String value;

    TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM fromValue(String v) {
        for (TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM c: TIMINGDESCRIPTIONEVENTCHAINSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
