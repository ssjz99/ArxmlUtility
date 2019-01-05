//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the configuration of DHCP servers that are running on the network endpoint. It is possible that an Ipv4DhcpServer and an Ipv6DhcpServer run on the same Ecu.
 * 
 * <p>DHCP-SERVER-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DHCP-SERVER-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DHCP-SERVER-CONFIGURATION"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DHCP-SERVER-CONFIGURATION", propOrder = {
    "ipv4DHCPSERVERCONFIGURATION",
    "ipv6DHCPSERVERCONFIGURATION"
})
public class DHCPSERVERCONFIGURATION {

    @XmlElement(name = "IPV-4-DHCP-SERVER-CONFIGURATION")
    protected IPV4DHCPSERVERCONFIGURATION ipv4DHCPSERVERCONFIGURATION;
    @XmlElement(name = "IPV-6-DHCP-SERVER-CONFIGURATION")
    protected IPV6DHCPSERVERCONFIGURATION ipv6DHCPSERVERCONFIGURATION;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??ipv4DHCPSERVERCONFIGURATION?????
     * 
     * @return
     *     possible object is
     *     {@link IPV4DHCPSERVERCONFIGURATION }
     *     
     */
    public IPV4DHCPSERVERCONFIGURATION getIPV4DHCPSERVERCONFIGURATION() {
        return ipv4DHCPSERVERCONFIGURATION;
    }

    /**
     * ??ipv4DHCPSERVERCONFIGURATION?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPV4DHCPSERVERCONFIGURATION }
     *     
     */
    public void setIPV4DHCPSERVERCONFIGURATION(IPV4DHCPSERVERCONFIGURATION value) {
        this.ipv4DHCPSERVERCONFIGURATION = value;
    }

    /**
     * ??ipv6DHCPSERVERCONFIGURATION?????
     * 
     * @return
     *     possible object is
     *     {@link IPV6DHCPSERVERCONFIGURATION }
     *     
     */
    public IPV6DHCPSERVERCONFIGURATION getIPV6DHCPSERVERCONFIGURATION() {
        return ipv6DHCPSERVERCONFIGURATION;
    }

    /**
     * ??ipv6DHCPSERVERCONFIGURATION?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPV6DHCPSERVERCONFIGURATION }
     *     
     */
    public void setIPV6DHCPSERVERCONFIGURATION(IPV6DHCPSERVERCONFIGURATION value) {
        this.ipv6DHCPSERVERCONFIGURATION = value;
    }

    /**
     * ??s?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS() {
        return s;
    }

    /**
     * ??s?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
        this.s = value;
    }

    /**
     * ??t?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT() {
        return t;
    }

    /**
     * ??t?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT(String value) {
        this.t = value;
    }

}
