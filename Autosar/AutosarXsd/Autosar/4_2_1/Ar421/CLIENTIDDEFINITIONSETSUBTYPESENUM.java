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
 * <p>CLIENT-ID-DEFINITION-SET--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="CLIENT-ID-DEFINITION-SET--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT-ID-DEFINITION-SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CLIENT-ID-DEFINITION-SET--SUBTYPES-ENUM")
@XmlEnum
public enum CLIENTIDDEFINITIONSETSUBTYPESENUM {

    @XmlEnumValue("CLIENT-ID-DEFINITION-SET")
    CLIENT___ID___DEFINITION___SET("CLIENT-ID-DEFINITION-SET");
    private final String value;

    CLIENTIDDEFINITIONSETSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CLIENTIDDEFINITIONSETSUBTYPESENUM fromValue(String v) {
        for (CLIENTIDDEFINITIONSETSUBTYPESENUM c: CLIENTIDDEFINITIONSETSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
