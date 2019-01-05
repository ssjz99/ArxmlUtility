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
 * <p>SWC-BSW-MAPPING--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SWC-BSW-MAPPING--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SWC-BSW-MAPPING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SWC-BSW-MAPPING--SUBTYPES-ENUM")
@XmlEnum
public enum SWCBSWMAPPINGSUBTYPESENUM {

    @XmlEnumValue("SWC-BSW-MAPPING")
    SWC___BSW___MAPPING("SWC-BSW-MAPPING");
    private final String value;

    SWCBSWMAPPINGSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWCBSWMAPPINGSUBTYPESENUM fromValue(String v) {
        for (SWCBSWMAPPINGSUBTYPESENUM c: SWCBSWMAPPINGSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
