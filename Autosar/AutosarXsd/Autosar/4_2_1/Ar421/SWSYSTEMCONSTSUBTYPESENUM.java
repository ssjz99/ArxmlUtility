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
 * <p>SW-SYSTEMCONST--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-SYSTEMCONST--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW-SYSTEMCONST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-SYSTEMCONST--SUBTYPES-ENUM")
@XmlEnum
public enum SWSYSTEMCONSTSUBTYPESENUM {

    @XmlEnumValue("SW-SYSTEMCONST")
    SW___SYSTEMCONST("SW-SYSTEMCONST");
    private final String value;

    SWSYSTEMCONSTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWSYSTEMCONSTSUBTYPESENUM fromValue(String v) {
        for (SWSYSTEMCONSTSUBTYPESENUM c: SWSYSTEMCONSTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
