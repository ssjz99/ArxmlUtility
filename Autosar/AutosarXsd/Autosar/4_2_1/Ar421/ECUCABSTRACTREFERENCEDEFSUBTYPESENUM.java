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
 * <p>ECUC-ABSTRACT-REFERENCE-DEF--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-ABSTRACT-REFERENCE-DEF--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECUC-ABSTRACT-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-CHOICE-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-FOREIGN-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-INSTANCE-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-SYMBOLIC-NAME-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-URI-REFERENCE-DEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-ABSTRACT-REFERENCE-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum ECUCABSTRACTREFERENCEDEFSUBTYPESENUM {

    @XmlEnumValue("ECUC-ABSTRACT-REFERENCE-DEF")
    ECUC___ABSTRACT___REFERENCE___DEF("ECUC-ABSTRACT-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-CHOICE-REFERENCE-DEF")
    ECUC___CHOICE___REFERENCE___DEF("ECUC-CHOICE-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-FOREIGN-REFERENCE-DEF")
    ECUC___FOREIGN___REFERENCE___DEF("ECUC-FOREIGN-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-INSTANCE-REFERENCE-DEF")
    ECUC___INSTANCE___REFERENCE___DEF("ECUC-INSTANCE-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-REFERENCE-DEF")
    ECUC___REFERENCE___DEF("ECUC-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-SYMBOLIC-NAME-REFERENCE-DEF")
    ECUC___SYMBOLIC___NAME___REFERENCE___DEF("ECUC-SYMBOLIC-NAME-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-URI-REFERENCE-DEF")
    ECUC___URI___REFERENCE___DEF("ECUC-URI-REFERENCE-DEF");
    private final String value;

    ECUCABSTRACTREFERENCEDEFSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCABSTRACTREFERENCEDEFSUBTYPESENUM fromValue(String v) {
        for (ECUCABSTRACTREFERENCEDEFSUBTYPESENUM c: ECUCABSTRACTREFERENCEDEFSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
