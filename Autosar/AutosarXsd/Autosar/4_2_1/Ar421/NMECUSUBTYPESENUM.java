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
 * <p>NM-ECU--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="NM-ECU--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NM-ECU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NM-ECU--SUBTYPES-ENUM")
@XmlEnum
public enum NMECUSUBTYPESENUM {

    @XmlEnumValue("NM-ECU")
    NM___ECU("NM-ECU");
    private final String value;

    NMECUSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NMECUSUBTYPESENUM fromValue(String v) {
        for (NMECUSUBTYPESENUM c: NMECUSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
