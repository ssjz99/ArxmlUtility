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
 * <p>FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLAT-INSTANCE-DESCRIPTOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM")
@XmlEnum
public enum FLATINSTANCEDESCRIPTORSUBTYPESENUM {

    @XmlEnumValue("FLAT-INSTANCE-DESCRIPTOR")
    FLAT___INSTANCE___DESCRIPTOR("FLAT-INSTANCE-DESCRIPTOR");
    private final String value;

    FLATINSTANCEDESCRIPTORSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FLATINSTANCEDESCRIPTORSUBTYPESENUM fromValue(String v) {
        for (FLATINSTANCEDESCRIPTORSUBTYPESENUM c: FLATINSTANCEDESCRIPTORSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
