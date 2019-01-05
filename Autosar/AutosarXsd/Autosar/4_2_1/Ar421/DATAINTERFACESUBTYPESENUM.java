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
 * <p>DATA-INTERFACE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="DATA-INTERFACE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA-INTERFACE"/>
 *     &lt;enumeration value="NV-DATA-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-INTERFACE"/>
 *     &lt;enumeration value="SENDER-RECEIVER-INTERFACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DATA-INTERFACE--SUBTYPES-ENUM")
@XmlEnum
public enum DATAINTERFACESUBTYPESENUM {

    @XmlEnumValue("DATA-INTERFACE")
    DATA___INTERFACE("DATA-INTERFACE"),
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV___DATA___INTERFACE("NV-DATA-INTERFACE"),
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER___INTERFACE("PARAMETER-INTERFACE"),
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER___RECEIVER___INTERFACE("SENDER-RECEIVER-INTERFACE");
    private final String value;

    DATAINTERFACESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DATAINTERFACESUBTYPESENUM fromValue(String v) {
        for (DATAINTERFACESUBTYPESENUM c: DATAINTERFACESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
