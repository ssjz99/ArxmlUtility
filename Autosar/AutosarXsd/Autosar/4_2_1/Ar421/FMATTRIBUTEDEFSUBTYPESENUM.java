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
 * <p>FM-ATTRIBUTE-DEF--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FM-ATTRIBUTE-DEF--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FM-ATTRIBUTE-DEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FM-ATTRIBUTE-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum FMATTRIBUTEDEFSUBTYPESENUM {

    @XmlEnumValue("FM-ATTRIBUTE-DEF")
    FM___ATTRIBUTE___DEF("FM-ATTRIBUTE-DEF");
    private final String value;

    FMATTRIBUTEDEFSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FMATTRIBUTEDEFSUBTYPESENUM fromValue(String v) {
        for (FMATTRIBUTEDEFSUBTYPESENUM c: FMATTRIBUTEDEFSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
