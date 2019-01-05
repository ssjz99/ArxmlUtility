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
 * <p>ABSTRACT-REQUIRED-PORT-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ABSTRACT-REQUIRED-PORT-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-REQUIRED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PR-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="R-PORT-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ABSTRACT-REQUIRED-PORT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
    ABSTRACT___REQUIRED___PORT___PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR___PORT___PROTOTYPE("PR-PORT-PROTOTYPE"),
    @XmlEnumValue("R-PORT-PROTOTYPE")
    R___PORT___PROTOTYPE("R-PORT-PROTOTYPE");
    private final String value;

    ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM c: ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
