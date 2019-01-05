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
 * Defines the configuration of a IPv6 DHCP server that runs on the network endpoint.
 * 
 * <p>IPV-6-DHCP-SERVER-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IPV-6-DHCP-SERVER-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DESCRIBABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IPV-6-DHCP-SERVER-CONFIGURATION"/>
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
@XmlType(name = "IPV-6-DHCP-SERVER-CONFIGURATION", propOrder = {
    "desc",
    "category",
    "introduction",
    "admindata",
    "addressrangelowerbound",
    "addressrangeupperbound",
    "defaultgateway",
    "defaultleasetime",
    "dnsserveraddresses",
    "networkmask"
})
public class IPV6DHCPSERVERCONFIGURATION {

    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "ADDRESS-RANGE-LOWER-BOUND")
    protected IP6ADDRESSSTRING addressrangelowerbound;
    @XmlElement(name = "ADDRESS-RANGE-UPPER-BOUND")
    protected IP6ADDRESSSTRING addressrangeupperbound;
    @XmlElement(name = "DEFAULT-GATEWAY")
    protected IP6ADDRESSSTRING defaultgateway;
    @XmlElement(name = "DEFAULT-LEASE-TIME")
    protected TIMEVALUE defaultleasetime;
    @XmlElement(name = "DNS-SERVER-ADDRESSES")
    protected IPV6DHCPSERVERCONFIGURATION.DNSSERVERADDRESSES dnsserveraddresses;
    @XmlElement(name = "NETWORK-MASK")
    protected IP6ADDRESSSTRING networkmask;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public CATEGORYSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public void setCATEGORY(CATEGORYSTRING value) {
        this.category = value;
    }

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??admindata?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA }
     *     
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * ??admindata?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA }
     *     
     */
    public void setADMINDATA(ADMINDATA value) {
        this.admindata = value;
    }

    /**
     * ??addressrangelowerbound?????
     * 
     * @return
     *     possible object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public IP6ADDRESSSTRING getADDRESSRANGELOWERBOUND() {
        return addressrangelowerbound;
    }

    /**
     * ??addressrangelowerbound?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public void setADDRESSRANGELOWERBOUND(IP6ADDRESSSTRING value) {
        this.addressrangelowerbound = value;
    }

    /**
     * ??addressrangeupperbound?????
     * 
     * @return
     *     possible object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public IP6ADDRESSSTRING getADDRESSRANGEUPPERBOUND() {
        return addressrangeupperbound;
    }

    /**
     * ??addressrangeupperbound?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public void setADDRESSRANGEUPPERBOUND(IP6ADDRESSSTRING value) {
        this.addressrangeupperbound = value;
    }

    /**
     * ??defaultgateway?????
     * 
     * @return
     *     possible object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public IP6ADDRESSSTRING getDEFAULTGATEWAY() {
        return defaultgateway;
    }

    /**
     * ??defaultgateway?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public void setDEFAULTGATEWAY(IP6ADDRESSSTRING value) {
        this.defaultgateway = value;
    }

    /**
     * ??defaultleasetime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getDEFAULTLEASETIME() {
        return defaultleasetime;
    }

    /**
     * ??defaultleasetime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setDEFAULTLEASETIME(TIMEVALUE value) {
        this.defaultleasetime = value;
    }

    /**
     * ??dnsserveraddresses?????
     * 
     * @return
     *     possible object is
     *     {@link IPV6DHCPSERVERCONFIGURATION.DNSSERVERADDRESSES }
     *     
     */
    public IPV6DHCPSERVERCONFIGURATION.DNSSERVERADDRESSES getDNSSERVERADDRESSES() {
        return dnsserveraddresses;
    }

    /**
     * ??dnsserveraddresses?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPV6DHCPSERVERCONFIGURATION.DNSSERVERADDRESSES }
     *     
     */
    public void setDNSSERVERADDRESSES(IPV6DHCPSERVERCONFIGURATION.DNSSERVERADDRESSES value) {
        this.dnsserveraddresses = value;
    }

    /**
     * ??networkmask?????
     * 
     * @return
     *     possible object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public IP6ADDRESSSTRING getNETWORKMASK() {
        return networkmask;
    }

    /**
     * ??networkmask?????
     * 
     * @param value
     *     allowed object is
     *     {@link IP6ADDRESSSTRING }
     *     
     */
    public void setNETWORKMASK(IP6ADDRESSSTRING value) {
        this.networkmask = value;
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
