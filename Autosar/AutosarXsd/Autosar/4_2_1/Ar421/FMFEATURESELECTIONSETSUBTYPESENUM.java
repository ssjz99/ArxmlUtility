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
 * <p>FM-FEATURE-SELECTION-SET--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="FM-FEATURE-SELECTION-SET--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FM-FEATURE-SELECTION-SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FM-FEATURE-SELECTION-SET--SUBTYPES-ENUM")
@XmlEnum
public enum FMFEATURESELECTIONSETSUBTYPESENUM {

    @XmlEnumValue("FM-FEATURE-SELECTION-SET")
    FM___FEATURE___SELECTION___SET("FM-FEATURE-SELECTION-SET");
    private final String value;

    FMFEATURESELECTIONSETSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FMFEATURESELECTIONSETSUBTYPESENUM fromValue(String v) {
        for (FMFEATURESELECTIONSETSUBTYPESENUM c: FMFEATURESELECTIONSETSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
