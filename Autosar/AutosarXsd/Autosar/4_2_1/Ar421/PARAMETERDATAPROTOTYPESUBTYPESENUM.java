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
 * <p>PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARAMETER-DATA-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum PARAMETERDATAPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER___DATA___PROTOTYPE("PARAMETER-DATA-PROTOTYPE");
    private final String value;

    PARAMETERDATAPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PARAMETERDATAPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (PARAMETERDATAPROTOTYPESUBTYPESENUM c: PARAMETERDATAPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
