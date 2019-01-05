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
 * <p>BSW-MODULE-DESCRIPTION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BSW-MODULE-DESCRIPTION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-MODULE-DESCRIPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BSW-MODULE-DESCRIPTION--SUBTYPES-ENUM")
@XmlEnum
public enum BSWMODULEDESCRIPTIONSUBTYPESENUM {

    @XmlEnumValue("BSW-MODULE-DESCRIPTION")
    BSW___MODULE___DESCRIPTION("BSW-MODULE-DESCRIPTION");
    private final String value;

    BSWMODULEDESCRIPTIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BSWMODULEDESCRIPTIONSUBTYPESENUM fromValue(String v) {
        for (BSWMODULEDESCRIPTIONSUBTYPESENUM c: BSWMODULEDESCRIPTIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
