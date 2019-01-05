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
 * <p>ARGUMENT-DATA-PROTOTYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ARGUMENT-DATA-PROTOTYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARGUMENT-DATA-PROTOTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARGUMENT-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ARGUMENTDATAPROTOTYPESUBTYPESENUM {

    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT___DATA___PROTOTYPE("ARGUMENT-DATA-PROTOTYPE");
    private final String value;

    ARGUMENTDATAPROTOTYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARGUMENTDATAPROTOTYPESUBTYPESENUM fromValue(String v) {
        for (ARGUMENTDATAPROTOTYPESUBTYPESENUM c: ARGUMENTDATAPROTOTYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
