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
 * <p>ETHERNET-SWITCH-VLAN-EGRESS-TAGGING-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="ETHERNET-SWITCH-VLAN-EGRESS-TAGGING-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT-SENT"/>
 *     &lt;enumeration value="SENT-TAGGED"/>
 *     &lt;enumeration value="SENT-UNTAGGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ETHERNET-SWITCH-VLAN-EGRESS-TAGGING-ENUM--SIMPLE")
@XmlEnum
public enum ETHERNETSWITCHVLANEGRESSTAGGINGENUMSIMPLE {


    /**
     * will not be sent
     * 
     */
    @XmlEnumValue("NOT-SENT")
    NOT___SENT("NOT-SENT"),

    /**
     * sent with its VLAN tag
     * 
     */
    @XmlEnumValue("SENT-TAGGED")
    SENT___TAGGED("SENT-TAGGED"),

    /**
     * sent without a VLAN tag
     * 
     */
    @XmlEnumValue("SENT-UNTAGGED")
    SENT___UNTAGGED("SENT-UNTAGGED");
    private final String value;

    ETHERNETSWITCHVLANEGRESSTAGGINGENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETHERNETSWITCHVLANEGRESSTAGGINGENUMSIMPLE fromValue(String v) {
        for (ETHERNETSWITCHVLANEGRESSTAGGINGENUMSIMPLE c: ETHERNETSWITCHVLANEGRESSTAGGINGENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
