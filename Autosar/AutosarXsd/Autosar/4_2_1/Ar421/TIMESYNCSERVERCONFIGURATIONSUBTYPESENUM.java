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
 * <p>TIME-SYNC-SERVER-CONFIGURATION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="TIME-SYNC-SERVER-CONFIGURATION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIME-SYNC-SERVER-CONFIGURATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIME-SYNC-SERVER-CONFIGURATION--SUBTYPES-ENUM")
@XmlEnum
public enum TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM {

    @XmlEnumValue("TIME-SYNC-SERVER-CONFIGURATION")
    TIME___SYNC___SERVER___CONFIGURATION("TIME-SYNC-SERVER-CONFIGURATION");
    private final String value;

    TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM fromValue(String v) {
        for (TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM c: TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
