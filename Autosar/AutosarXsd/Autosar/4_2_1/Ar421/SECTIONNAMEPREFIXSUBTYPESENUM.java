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
 * <p>SECTION-NAME-PREFIX--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="SECTION-NAME-PREFIX--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SECTION-NAME-PREFIX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SECTION-NAME-PREFIX--SUBTYPES-ENUM")
@XmlEnum
public enum SECTIONNAMEPREFIXSUBTYPESENUM {

    @XmlEnumValue("SECTION-NAME-PREFIX")
    SECTION___NAME___PREFIX("SECTION-NAME-PREFIX");
    private final String value;

    SECTIONNAMEPREFIXSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SECTIONNAMEPREFIXSUBTYPESENUM fromValue(String v) {
        for (SECTIONNAMEPREFIXSUBTYPESENUM c: SECTIONNAMEPREFIXSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
