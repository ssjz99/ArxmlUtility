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
 * <p>HW-DESCRIPTION-ENTITY--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="HW-DESCRIPTION-ENTITY--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HW-DESCRIPTION-ENTITY"/>
 *     &lt;enumeration value="HW-ELEMENT"/>
 *     &lt;enumeration value="HW-PIN"/>
 *     &lt;enumeration value="HW-PIN-GROUP"/>
 *     &lt;enumeration value="HW-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HW-DESCRIPTION-ENTITY--SUBTYPES-ENUM")
@XmlEnum
public enum HWDESCRIPTIONENTITYSUBTYPESENUM {

    @XmlEnumValue("HW-DESCRIPTION-ENTITY")
    HW___DESCRIPTION___ENTITY("HW-DESCRIPTION-ENTITY"),
    @XmlEnumValue("HW-ELEMENT")
    HW___ELEMENT("HW-ELEMENT"),
    @XmlEnumValue("HW-PIN")
    HW___PIN("HW-PIN"),
    @XmlEnumValue("HW-PIN-GROUP")
    HW___PIN___GROUP("HW-PIN-GROUP"),
    @XmlEnumValue("HW-TYPE")
    HW___TYPE("HW-TYPE");
    private final String value;

    HWDESCRIPTIONENTITYSUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HWDESCRIPTIONENTITYSUBTYPESENUM fromValue(String v) {
        for (HWDESCRIPTIONENTITYSUBTYPESENUM c: HWDESCRIPTIONENTITYSUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
