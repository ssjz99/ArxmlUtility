//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Internet Protocol version 4 (IPv4) configuration.
 * 
 * <p>IPV-4-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IPV-4-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NETWORK-ENDPOINT-ADDRESS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IPV-4-CONFIGURATION"/>
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
@XmlType(name = "IPV-4-CONFIGURATION", propOrder = {
    "assignmentpriority",
    "defaultgateway",
    "dnsserveraddresses",
    "ipaddresskeepbehavior",
    "ipv4ADDRESS",
    "ipv4ADDRESSSOURCE",
    "networkmask",
    "ttl"
})
public class IPV4CONFIGURATION {

    @XmlElement(name = "ASSIGNMENT-PRIORITY")
    protected POSITIVEINTEGER assignmentpriority;
    @XmlElement(name = "DEFAULT-GATEWAY")
    protected IP4ADDRESSSTRING defaultgateway;
    @XmlElement(name = "DNS-SERVER-ADDRESSES")
    protected IPV4CONFIGURATION.DNSSERVERADDRESSES dnsserveraddresses;
    @XmlElement(name = "IP-ADDRESS-KEEP-BEHAVIOR")
    protected IPADDRESSKEEPENUM ipaddresskeepbehavior;
    @XmlElement(name = "IPV-4-ADDRESS")
    protected IP4ADDRESSSTRING ipv4ADDRESS;
    @XmlElement(name = "IPV-4-ADDRESS-SOURCE")
    protected IPV4ADDRESSSOURCEENUM ipv4ADDRESSSOURCE;
    @XmlElement(name = "NETWORK-MASK")
    protected IP4ADDRESSSTRING networkmask;
    @XmlElement(name = "TTL")
    protected POSITIVEINTEGER ttl;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??assignmentpriority?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getASSIGNMENTPRIORITY() {
        return assignmentpriority;
    }

    /**
     * ??assignmentpriority?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setASSIGNMENTPRIORITY(POSITIVEINTEGER value) {
        this.assignmentpriority = value;
    }

    /**
     * ??defaultgateway?????
     * 
     * @return
     *     possible object is
     *     {@link IP4ADDRESSSTRING }
     *     
     */
    public IP4ADDRESSSTRING getDEFAULTGATEWAY() {
        return defaultgateway;
    }

    /**
     * ??defaultgateway?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP4ADDRESSSTRING }
     *     
     */
    public void setDEFAULTGATEWAY(IP4ADDRESSSTRING value) {
        this.defaultgateway = value;
    }

    /**
     * ??dnsserveraddresses?????
     * 
     * @return
     *     possible object is
     *     {@link IPV4CONFIGURATION.DNSSERVERADDRESSES }
     *     
     */
    public IPV4CONFIGURATION.DNSSERVERADDRESSES getDNSSERVERADDRESSES() {
        return dnsserveraddresses;
    }

    /**
     * ??dnsserveraddresses?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPV4CONFIGURATION.DNSSERVERADDRESSES }
     *     
     */
    public void setDNSSERVERADDRESSES(IPV4CONFIGURATION.DNSSERVERADDRESSES value) {
        this.dnsserveraddresses = value;
    }

    /**
     * ??ipaddresskeepbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link IPADDRESSKEEPENUM }
     *     
     */
    public IPADDRESSKEEPENUM getIPADDRESSKEEPBEHAVIOR() {
        return ipaddresskeepbehavior;
    }

    /**
     * ??ipaddresskeepbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPADDRESSKEEPENUM }
     *     
     */
    public void setIPADDRESSKEEPBEHAVIOR(IPADDRESSKEEPENUM value) {
        this.ipaddresskeepbehavior = value;
    }

    /**
     * ??ipv4ADDRESS?????
     * 
     * @return
     *     possible object is
     *     {@link IP4ADDRESSSTRING }
     *     
     */
    public IP4ADDRESSSTRING getIPV4ADDRESS() {
        return ipv4ADDRESS;
    }

    /**
     * ??ipv4ADDRESS?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP4ADDRESSSTRING }
     *     
     */
    public void setIPV4ADDRESS(IP4ADDRESSSTRING value) {
        this.ipv4ADDRESS = value;
    }

    /**
     * ??ipv4ADDRESSSOURCE?????
     * 
     * @return
     *     possible object is
     *     {@link IPV4ADDRESSSOURCEENUM }
     *     
     */
    public IPV4ADDRESSSOURCEENUM getIPV4ADDRESSSOURCE() {
        return ipv4ADDRESSSOURCE;
    }

    /**
     * ??ipv4ADDRESSSOURCE?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPV4ADDRESSSOURCEENUM }
     *     
     */
    public void setIPV4ADDRESSSOURCE(IPV4ADDRESSSOURCEENUM value) {
        this.ipv4ADDRESSSOURCE = value;
    }

    /**
     * ??networkmask?????
     * 
     * @return
     *     possible object is
     *     {@link IP4ADDRESSSTRING }
     *     
     */
    public IP4ADDRESSSTRING getNETWORKMASK() {
        return networkmask;
    }

    /**
     * ??networkmask?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP4ADDRESSSTRING }
     *     
     */
    public void setNETWORKMASK(IP4ADDRESSSTRING value) {
        this.networkmask = value;
    }

    /**
     * ??ttl?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getTTL() {
        return ttl;
    }

    /**
     * ??ttl?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setTTL(POSITIVEINTEGER value) {
        this.ttl = value;
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="DNS-SERVER-ADDRESS" type="{http://autosar.org/schema/r4.0}IP4-ADDRESS-STRING"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dnsserveraddress"
    })
    public static class DNSSERVERADDRESSES {

        @XmlElement(name = "DNS-SERVER-ADDRESS")
        protected List<IP4ADDRESSSTRING> dnsserveraddress;

        /**
         * Gets the value of the dnsserveraddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dnsserveraddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDNSSERVERADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IP4ADDRESSSTRING }
         * 
         * 
         */
        public List<IP4ADDRESSSTRING> getDNSSERVERADDRESS() {
            if (dnsserveraddress == null) {
                dnsserveraddress = new ArrayList<IP4ADDRESSSTRING>();
            }
            return this.dnsserveraddress;
        }

    }

}
