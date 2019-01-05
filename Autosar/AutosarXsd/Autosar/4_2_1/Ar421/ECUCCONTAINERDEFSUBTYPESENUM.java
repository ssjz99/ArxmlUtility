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
 * <p>ECUC-CONTAINER-DEF--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-CONTAINER-DEF--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECUC-CHOICE-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-PARAM-CONF-CONTAINER-DEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-CONTAINER-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum ECUCCONTAINERDEFSUBTYPESENUM {

    @XmlEnumValue("ECUC-CHOICE-CONTAINER-DEF")
    ECUC___CHOICE___CONTAINER___DEF("ECUC-CHOICE-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-CONTAINER-DEF")
    ECUC___CONTAINER___DEF("ECUC-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-PARAM-CONF-CONTAINER-DEF")
    ECUC___PARAM___CONF___CONTAINER___DEF("ECUC-PARAM-CONF-CONTAINER-DEF");
    private final String value;

    ECUCCONTAINERDEFSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCCONTAINERDEFSUBTYPESENUM fromValue(String v) {
        for (ECUCCONTAINERDEFSUBTYPESENUM c: ECUCCONTAINERDEFSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
