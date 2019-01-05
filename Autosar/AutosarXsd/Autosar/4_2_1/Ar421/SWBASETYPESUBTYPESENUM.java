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
 * <p>SW-BASE-TYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-BASE-TYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW-BASE-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-BASE-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum SWBASETYPESUBTYPESENUM {

    @XmlEnumValue("SW-BASE-TYPE")
    SW___BASE___TYPE("SW-BASE-TYPE");
    private final String value;

    SWBASETYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWBASETYPESUBTYPESENUM fromValue(String v) {
        for (SWBASETYPESUBTYPESENUM c: SWBASETYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
