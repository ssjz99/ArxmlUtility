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
 * <p>ECUC-PARAMETER-DEF--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-PARAMETER-DEF--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECUC-ABSTRACT-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-ADD-INFO-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-BOOLEAN-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-ENUMERATION-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-FLOAT-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-FUNCTION-NAME-DEF"/>
 *     &lt;enumeration value="ECUC-INTEGER-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-LINKER-SYMBOL-DEF"/>
 *     &lt;enumeration value="ECUC-MULTILINE-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-PARAMETER-DEF"/>
 *     &lt;enumeration value="ECUC-STRING-PARAM-DEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-PARAMETER-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum ECUCPARAMETERDEFSUBTYPESENUM {

    @XmlEnumValue("ECUC-ABSTRACT-STRING-PARAM-DEF")
    ECUC___ABSTRACT___STRING___PARAM___DEF("ECUC-ABSTRACT-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-ADD-INFO-PARAM-DEF")
    ECUC___ADD___INFO___PARAM___DEF("ECUC-ADD-INFO-PARAM-DEF"),
    @XmlEnumValue("ECUC-BOOLEAN-PARAM-DEF")
    ECUC___BOOLEAN___PARAM___DEF("ECUC-BOOLEAN-PARAM-DEF"),
    @XmlEnumValue("ECUC-ENUMERATION-PARAM-DEF")
    ECUC___ENUMERATION___PARAM___DEF("ECUC-ENUMERATION-PARAM-DEF"),
    @XmlEnumValue("ECUC-FLOAT-PARAM-DEF")
    ECUC___FLOAT___PARAM___DEF("ECUC-FLOAT-PARAM-DEF"),
    @XmlEnumValue("ECUC-FUNCTION-NAME-DEF")
    ECUC___FUNCTION___NAME___DEF("ECUC-FUNCTION-NAME-DEF"),
    @XmlEnumValue("ECUC-INTEGER-PARAM-DEF")
    ECUC___INTEGER___PARAM___DEF("ECUC-INTEGER-PARAM-DEF"),
    @XmlEnumValue("ECUC-LINKER-SYMBOL-DEF")
    ECUC___LINKER___SYMBOL___DEF("ECUC-LINKER-SYMBOL-DEF"),
    @XmlEnumValue("ECUC-MULTILINE-STRING-PARAM-DEF")
    ECUC___MULTILINE___STRING___PARAM___DEF("ECUC-MULTILINE-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-PARAMETER-DEF")
    ECUC___PARAMETER___DEF("ECUC-PARAMETER-DEF"),
    @XmlEnumValue("ECUC-STRING-PARAM-DEF")
    ECUC___STRING___PARAM___DEF("ECUC-STRING-PARAM-DEF");
    private final String value;

    ECUCPARAMETERDEFSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCPARAMETERDEFSUBTYPESENUM fromValue(String v) {
        for (ECUCPARAMETERDEFSUBTYPESENUM c: ECUCPARAMETERDEFSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
