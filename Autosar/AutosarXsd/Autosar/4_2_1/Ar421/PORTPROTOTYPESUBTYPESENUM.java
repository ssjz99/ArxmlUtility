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
 * <p>PORT-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PORT-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-PROVIDED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="ABSTRACT-REQUIRED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="P-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PR-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PORT-PROTOTYPE"/>
 *     &lt;enumeration value="R-PORT-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PORT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum PORTPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
    ABSTRACT___PROVIDED___PORT___PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),
    @XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
    ABSTRACT___REQUIRED___PORT___PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),
    @XmlEnumValue("P-PORT-PROTOTYPE")
    P___PORT___PROTOTYPE("P-PORT-PROTOTYPE"),
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR___PORT___PROTOTYPE("PR-PORT-PROTOTYPE"),
    @XmlEnumValue("PORT-PROTOTYPE")
    PORT___PROTOTYPE("PORT-PROTOTYPE"),
    @XmlEnumValue("R-PORT-PROTOTYPE")
    R___PORT___PROTOTYPE("R-PORT-PROTOTYPE");
    private final String value;

    PORTPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PORTPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (PORTPROTOTYPESUBTYPESENUM c: PORTPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
