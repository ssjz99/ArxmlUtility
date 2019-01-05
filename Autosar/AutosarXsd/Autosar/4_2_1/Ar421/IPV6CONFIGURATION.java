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
 * Internet Protocol version 6 (IPv6) configuration.
 * 
 * <p>IPV-6-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IPV-6-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NETWORK-ENDPOINT-ADDRESS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IPV-6-CONFIGURATION"/>
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
@XmlType(name = "IPV-6-CONFIGURATION", propOrder = {
    "assignmentpriority",
    "defaultrouter",
    "dnsserveraddresses",
    "hopcount",
    "ipaddresskeepbehavior",
    "ipaddressprefixlength",
    "ipv6ADDRESS",
    "ipv6ADDRESSSOURCE"
})
public class IPV6CONFIGURATION {

    @XmlElement(name = "ASSIGNMENT-PRIORITY")
    protected POSITIVEINTEGER assignmentpriority;
    @XmlElement(name = "DEFAULT-ROUTER")
    protected IP6ADDRESSSTRING defaultrouter;
    @XmlElement(name = "DNS-SERVER-ADDRESSES")
    protected IPV6CONFIGURATION.DNSSERVERADDRESSES dnsserveraddresses;
    @XmlElement(name = "HOP-COUNT")
    protected POSITIVEINTEGER hopcount;
    @XmlElement(name = "IP-ADDRESS-KEEP-BEHAVIOR")
    protected IPADDRESSKEEPENUM ipaddresskeepbehavior;
    @XmlElement(name = "IP-ADDRESS-PREFIX-LENGTH")
    protected POSITIVEINTEGER ipaddressprefixlength;
    @XmlElement(name = "IPV-6-ADDRESS")
    protected IP6ADDRESSSTRING ipv6ADDRESS;
    @XmlElement(name = "IPV-6-ADDRESS-SOURCE")
    protected IPV6ADDRESSSOURCEENUM ipv6ADDRESSSOURCE;
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
     * ??defaultrouter?????
     * 
     * @return
     *     possible object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public IP6ADDRESSSTRING getDEFAULTROUTER() {
        return defaultrouter;
    }

    /**
     * ??defaultrouter?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public void setDEFAULTROUTER(IP6ADDRESSSTRING value) {
        this.defaultrouter = value;
    }

    /**
     * ??dnsserveraddresses?????
     * 
     * @return
     *     possible object is
     *     {@link IPV6CONFIGURATION.DNSSERVERADDRESSES }
     *     
     */
    public IPV6CONFIGURATION.DNSSERVERADDRESSES getDNSSERVERADDRESSES() {
        return dnsserveraddresses;
    }

    /**
     * ??dnsserveraddresses?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPV6CONFIGURATION.DNSSERVERADDRESSES }
     *     
     */
    public void setDNSSERVERADDRESSES(IPV6CONFIGURATION.DNSSERVERADDRESSES value) {
        this.dnsserveraddresses = value;
    }

    /**
     * ??hopcount?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getHOPCOUNT() {
        return hopcount;
    }

    /**
     * ??hopcount?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setHOPCOUNT(POSITIVEINTEGER value) {
        this.hopcount = value;
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
     * ??ipaddressprefixlength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getIPADDRESSPREFIXLENGTH() {
        return ipaddressprefixlength;
    }

    /**
     * ??ipaddressprefixlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setIPADDRESSPREFIXLENGTH(POSITIVEINTEGER value) {
        this.ipaddressprefixlength = value;
    }

    /**
     * ??ipv6ADDRESS?????
     * 
     * @return
     *     possible object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public IP6ADDRESSSTRING getIPV6ADDRESS() {
        return ipv6ADDRESS;
    }

    /**
     * ??ipv6ADDRESS?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public void setIPV6ADDRESS(IP6ADDRESSSTRING value) {
        this.ipv6ADDRESS = value;
    }

    /**
     * ??ipv6ADDRESSSOURCE?????
     * 
     * @return
     *     possible object is
     *     {@link IPV6ADDRESSSOURCEENUM }
     *     
     */
    public IPV6ADDRESSSOURCEENUM getIPV6ADDRESSSOURCE() {
        return ipv6ADDRESSSOURCE;
    }

    /**
     * ??ipv6ADDRESSSOURCE?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPV6ADDRESSSOURCEENUM }
     *     
     */
    public void setIPV6ADDRESSSOURCE(IPV6ADDRESSSOURCEENUM value) {
        this.ipv6ADDRESSSOURCE = value;
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
     *         &lt;element name="DNS-SERVER-ADDRESS" type="{http://autosar.org/schema/r4.0}IP6-ADDRESS-STRING"/>
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
        protected List<IP6ADDRESSSTRING> dnsserveraddress;

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
         * {@link IP6ADDRESSSTRING }
         * 
         * 
         */
        public List<IP6ADDRESSSTRING> getDNSSERVERADDRESS() {
            if (dnsserveraddress == null) {
                dnsserveraddress = new ArrayList<IP6ADDRESSSTRING>();
            }
            return this.dnsserveraddress;
        }

    }

}
