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
 * Defines the network infrastructure services provided or consumed.
 * 
 * <p>INFRASTRUCTURE-SERVICES complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INFRASTRUCTURE-SERVICES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INFRASTRUCTURE-SERVICES"/>
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
@XmlType(name = "INFRASTRUCTURE-SERVICES", propOrder = {
    "dhcpserverconfiguration",
    "doipentity",
    "timesynchronization"
})
public class INFRASTRUCTURESERVICES {

    @XmlElement(name = "DHCP-SERVER-CONFIGURATION")
    protected DHCPSERVERCONFIGURATION dhcpserverconfiguration;
    @XmlElement(name = "DO-IP-ENTITY")
    protected DOIPENTITY doipentity;
    @XmlElement(name = "TIME-SYNCHRONIZATION")
    protected TIMESYNCHRONIZATION timesynchronization;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??dhcpserverconfiguration?????
     * 
     * @return
     *     possible object is
     *     {@link DHCPSERVERCONFIGURATION }
     *     
     */
    public DHCPSERVERCONFIGURATION getDHCPSERVERCONFIGURATION() {
        return dhcpserverconfiguration;
    }

    /**
     * ??dhcpserverconfiguration?????
     * 
     * @param value
     *     allowed object is
     *     {@link DHCPSERVERCONFIGURATION }
     *     
     */
    public void setDHCPSERVERCONFIGURATION(DHCPSERVERCONFIGURATION value) {
        this.dhcpserverconfiguration = value;
    }

    /**
     * ??doipentity?????
     * 
     * @return
     *     possible object is
     *     {@link DOIPENTITY }
     *     
     */
    public DOIPENTITY getDOIPENTITY() {
        return doipentity;
    }

    /**
     * ??doipentity?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOIPENTITY }
     *     
     */
    public void setDOIPENTITY(DOIPENTITY value) {
        this.doipentity = value;
    }

    /**
     * ??timesynchronization?????
     * 
     * @return
     *     possible object is
     *     {@link TIMESYNCHRONIZATION }
     *     
     */
    public TIMESYNCHRONIZATION getTIMESYNCHRONIZATION() {
        return timesynchronization;
    }

    /**
     * ??timesynchronization?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESYNCHRONIZATION }
     *     
     */
    public void setTIMESYNCHRONIZATION(TIMESYNCHRONIZATION value) {
        this.timesynchronization = value;
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
