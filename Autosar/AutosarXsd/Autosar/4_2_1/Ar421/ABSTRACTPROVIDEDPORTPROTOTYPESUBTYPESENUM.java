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
 * <p>ABSTRACT-PROVIDED-PORT-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ABSTRACT-PROVIDED-PORT-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSTRACT-PROVIDED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="P-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PR-PORT-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ABSTRACT-PROVIDED-PORT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
    ABSTRACT___PROVIDED___PORT___PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),
    @XmlEnumValue("P-PORT-PROTOTYPE")
    P___PORT___PROTOTYPE("P-PORT-PROTOTYPE"),
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR___PORT___PROTOTYPE("PR-PORT-PROTOTYPE");
    private final String value;

    ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM c: ABSTRACTPROVIDEDPORTPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
