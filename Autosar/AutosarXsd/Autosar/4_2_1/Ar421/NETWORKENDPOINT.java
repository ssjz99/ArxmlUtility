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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The network endpoint defines the network addressing (e.g. IP-Address or MAC multicast address).
 * 
 * <p>NETWORK-ENDPOINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NETWORK-ENDPOINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NETWORK-ENDPOINT"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NETWORK-ENDPOINT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "fullyqualifieddomainname",
    "infrastructureservices",
    "networkendpointaddresses",
    "priority"
})
public class NETWORKENDPOINT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "FULLY-QUALIFIED-DOMAIN-NAME")
    protected STRING fullyqualifieddomainname;
    @XmlElement(name = "INFRASTRUCTURE-SERVICES")
    protected INFRASTRUCTURESERVICES infrastructureservices;
    @XmlElement(name = "NETWORK-ENDPOINT-ADDRESSES")
    protected NETWORKENDPOINT.NETWORKENDPOINTADDRESSES networkendpointaddresses;
    @XmlElement(name = "PRIORITY")
    protected POSITIVEINTEGER priority;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
    }

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
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??fullyqualifieddomainname?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getFULLYQUALIFIEDDOMAINNAME() {
        return fullyqualifieddomainname;
    }

    /**
     * ??fullyqualifieddomainname?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setFULLYQUALIFIEDDOMAINNAME(STRING value) {
        this.fullyqualifieddomainname = value;
    }

    /**
     * ??infrastructureservices?????
     * 
     * @return
     *     possible object is
     *     {@link INFRASTRUCTURESERVICES }
     *     
     */
    public INFRASTRUCTURESERVICES getINFRASTRUCTURESERVICES() {
        return infrastructureservices;
    }

    /**
     * ??infrastructureservices?????
     * 
     * @param value
     *     allowed object is
     *     {@link INFRASTRUCTURESERVICES }
     *     
     */
    public void setINFRASTRUCTURESERVICES(INFRASTRUCTURESERVICES value) {
        this.infrastructureservices = value;
    }

    /**
     * ??networkendpointaddresses?????
     * 
     * @return
     *     possible object is
     *     {@link NETWORKENDPOINT.NETWORKENDPOINTADDRESSES }
     *     
     */
    public NETWORKENDPOINT.NETWORKENDPOINTADDRESSES getNETWORKENDPOINTADDRESSES() {
        return networkendpointaddresses;
    }

    /**
     * ??networkendpointaddresses?????
     * 
     * @param value
     *     allowed object is
     *     {@link NETWORKENDPOINT.NETWORKENDPOINTADDRESSES }
     *     
     */
    public void setNETWORKENDPOINTADDRESSES(NETWORKENDPOINT.NETWORKENDPOINTADDRESSES value) {
        this.networkendpointaddresses = value;
    }

    /**
     * ??priority?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPRIORITY() {
        return priority;
    }

    /**
     * ??priority?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPRIORITY(POSITIVEINTEGER value) {
        this.priority = value;
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
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *         &lt;element name="IPV-4-CONFIGURATION" type="{http://autosar.org/schema/r4.0}IPV-4-CONFIGURATION"/>
     *         &lt;element name="IPV-6-CONFIGURATION" type="{http://autosar.org/schema/r4.0}IPV-6-CONFIGURATION"/>
     *         &lt;element name="MAC-MULTICAST-CONFIGURATION" type="{http://autosar.org/schema/r4.0}MAC-MULTICAST-CONFIGURATION"/>
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
        "ipv4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION"
    })
    public static class NETWORKENDPOINTADDRESSES {

        @XmlElements({
            @XmlElement(name = "IPV-4-CONFIGURATION", type = IPV4CONFIGURATION.class),
            @XmlElement(name = "IPV-6-CONFIGURATION", type = IPV6CONFIGURATION.class),
            @XmlElement(name = "MAC-MULTICAST-CONFIGURATION", type = MACMULTICASTCONFIGURATION.class)
        })
        protected List<Object> ipv4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION;

        /**
         * Gets the value of the ipv4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ipv4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIPV4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IPV4CONFIGURATION }
         * {@link IPV6CONFIGURATION }
         * {@link MACMULTICASTCONFIGURATION }
         * 
         * 
         */
        public List<Object> getIPV4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION() {
            if (ipv4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION == null) {
                ipv4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION = new ArrayList<Object>();
            }
            return this.ipv4CONFIGURATIONOrIPV6CONFIGURATIONOrMACMULTICASTCONFIGURATION;
        }

    }

}
