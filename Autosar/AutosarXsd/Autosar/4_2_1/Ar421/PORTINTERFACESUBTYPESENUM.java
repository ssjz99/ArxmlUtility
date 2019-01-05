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
 * <p>PORT-INTERFACE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="PORT-INTERFACE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE"/>
 *     &lt;enumeration value="DATA-INTERFACE"/>
 *     &lt;enumeration value="MODE-SWITCH-INTERFACE"/>
 *     &lt;enumeration value="NV-DATA-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-INTERFACE"/>
 *     &lt;enumeration value="PORT-INTERFACE"/>
 *     &lt;enumeration value="SENDER-RECEIVER-INTERFACE"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PORT-INTERFACE--SUBTYPES-ENUM")
@XmlEnum
public enum PORTINTERFACESUBTYPESENUM {

    @XmlEnumValue("CLIENT-SERVER-INTERFACE")
    CLIENT___SERVER___INTERFACE("CLIENT-SERVER-INTERFACE"),
    @XmlEnumValue("DATA-INTERFACE")
    DATA___INTERFACE("DATA-INTERFACE"),
    @XmlEnumValue("MODE-SWITCH-INTERFACE")
    MODE___SWITCH___INTERFACE("MODE-SWITCH-INTERFACE"),
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV___DATA___INTERFACE("NV-DATA-INTERFACE"),
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER___INTERFACE("PARAMETER-INTERFACE"),
    @XmlEnumValue("PORT-INTERFACE")
    PORT___INTERFACE("PORT-INTERFACE"),
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER___RECEIVER___INTERFACE("SENDER-RECEIVER-INTERFACE"),
    @XmlEnumValue("TRIGGER-INTERFACE")
    TRIGGER___INTERFACE("TRIGGER-INTERFACE");
    private final String value;

    PORTINTERFACESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PORTINTERFACESUBTYPESENUM fromValue(String v) {
        for (PORTINTERFACESUBTYPESENUM c: PORTINTERFACESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
