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
 * <p>BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSW-DISTINGUISHED-PARTITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM")
@XmlEnum
public enum BSWDISTINGUISHEDPARTITIONSUBTYPESENUM {

    @XmlEnumValue("BSW-DISTINGUISHED-PARTITION")
    BSW___DISTINGUISHED___PARTITION("BSW-DISTINGUISHED-PARTITION");
    private final String value;

    BSWDISTINGUISHEDPARTITIONSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BSWDISTINGUISHEDPARTITIONSUBTYPESENUM fromValue(String v) {
        for (BSWDISTINGUISHEDPARTITIONSUBTYPESENUM c: BSWDISTINGUISHEDPARTITIONSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
