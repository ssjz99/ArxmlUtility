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
 * <p>SW-RECORD-LAYOUT--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SW-RECORD-LAYOUT--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SW-RECORD-LAYOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SW-RECORD-LAYOUT--SUBTYPES-ENUM")
@XmlEnum
public enum SWRECORDLAYOUTSUBTYPESENUM {

    @XmlEnumValue("SW-RECORD-LAYOUT")
    SW___RECORD___LAYOUT("SW-RECORD-LAYOUT");
    private final String value;

    SWRECORDLAYOUTSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWRECORDLAYOUTSUBTYPESENUM fromValue(String v) {
        for (SWRECORDLAYOUTSUBTYPESENUM c: SWRECORDLAYOUTSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
