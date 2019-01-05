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
 * <p>APPLICATION-PRIMITIVE-DATA-TYPE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="APPLICATION-PRIMITIVE-DATA-TYPE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPLICATION-PRIMITIVE-DATA-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APPLICATION-PRIMITIVE-DATA-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM {

    @XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
    APPLICATION___PRIMITIVE___DATA___TYPE("APPLICATION-PRIMITIVE-DATA-TYPE");
    private final String value;

    APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM fromValue(String v) {
        for (APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM c: APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
