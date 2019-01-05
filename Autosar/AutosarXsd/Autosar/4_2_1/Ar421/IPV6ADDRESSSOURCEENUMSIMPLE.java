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
 * <p>IPV-6-ADDRESS-SOURCE-ENUM--SIMPLE? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="IPV-6-ADDRESS-SOURCE-ENUM--SIMPLE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DHCPV-6"/>
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="LINK-LOCAL"/>
 *     &lt;enumeration value="LINK-LOCAL--DOIP"/>
 *     &lt;enumeration value="ROUTER-ADVERTISEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IPV-6-ADDRESS-SOURCE-ENUM--SIMPLE")
@XmlEnum
public enum IPV6ADDRESSSOURCEENUMSIMPLE {


    /**
     * DHCP is a service for the automatic IP configuration of a client.
     * 
     */
    @XmlEnumValue("DHCPV-6")
    DHCPV___6("DHCPV-6"),

    /**
     * The IP Address shall be declared manually.
     * 
     */
    FIXED("FIXED"),

    /**
     * LinkLocal is intended only for communications within the segment of a local network (a link) or a point-to-point connection that a host is connected to.
     * 
     */
    @XmlEnumValue("LINK-LOCAL")
    LINK___LOCAL("LINK-LOCAL"),

    /**
     * Linklocal IPv6 Address Assignment using DoIP Parameters
     * 
     */
    @XmlEnumValue("LINK-LOCAL--DOIP")
    LINK___LOCAL____DOIP("LINK-LOCAL--DOIP"),

    /**
     * IPv6 Stateless Autoconfiguration.
     * 
     */
    @XmlEnumValue("ROUTER-ADVERTISEMENT")
    ROUTER___ADVERTISEMENT("ROUTER-ADVERTISEMENT");
    private final String value;

    IPV6ADDRESSSOURCEENUMSIMPLE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPV6ADDRESSSOURCEENUMSIMPLE fromValue(String v) {
        for (IPV6ADDRESSSOURCEENUMSIMPLE c: IPV6ADDRESSSOURCEENUMSIMPLE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
