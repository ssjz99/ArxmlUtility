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
 * <p>ECUC-PARAM-CONF-CONTAINER-DEF--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ECUC-PARAM-CONF-CONTAINER-DEF--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECUC-PARAM-CONF-CONTAINER-DEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECUC-PARAM-CONF-CONTAINER-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM {

    @XmlEnumValue("ECUC-PARAM-CONF-CONTAINER-DEF")
    ECUC___PARAM___CONF___CONTAINER___DEF("ECUC-PARAM-CONF-CONTAINER-DEF");
    private final String value;

    ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM fromValue(String v) {
        for (ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM c: ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}