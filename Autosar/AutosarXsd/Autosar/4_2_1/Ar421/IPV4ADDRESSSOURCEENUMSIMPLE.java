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
 * <p>IPV-4-ADDRESS-SOURCE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="IPV-4-ADDRESS-SOURCE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO-IP"/>
 *     &lt;enumeration value="AUTO-IP--DOIP"/>
 *     &lt;enumeration value="AUTO-IPDHCPV-4"/>
 *     &lt;enumeration value="DHCPV-4"/>
 *     &lt;enumeration value="FIXED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IPV-4-ADDRESS-SOURCE-ENUM--SIMPLE")
@XmlEnum
public enum IPV4ADDRESSSOURCEENUMSIMPLE {


    /**
     * AutoIP is used to dynamically assign IP addresses at device startup.
     * 
     */
    @XmlEnumValue("AUTO-IP")
    AUTO___IP("AUTO-IP"),

    /**
     * Linklocal IPv4 Address Assignment using DoIP Parameters
     * 
     */
    @XmlEnumValue("AUTO-IP--DOIP")
    AUTO___IP____DOIP("AUTO-IP--DOIP"),

    /**
     * This enum literal is deprecated and will be removed in future.
     * 
     * Old description: 
     * The IpAddress is declared via AutoIp or dhcp.
     * 
     */
    @XmlEnumValue("AUTO-IPDHCPV-4")
    AUTO___IPDHCPV___4("AUTO-IPDHCPV-4"),

    /**
     * DHCP is a service for the automatic IP configuration of a client.
     * 
     */
    @XmlEnumValue("DHCPV-4")
    DHCPV___4("DHCPV-4"),

    /**
     * The IP Address shall be declared manually.
     * 
     */
    FIXED("FIXED");
    private final String value;

    IPV4ADDRESSSOURCEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPV4ADDRESSSOURCEENUMSIMPLE fromValue(String v) {
        for (IPV4ADDRESSSOURCEENUMSIMPLE c: IPV4ADDRESSSOURCEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
