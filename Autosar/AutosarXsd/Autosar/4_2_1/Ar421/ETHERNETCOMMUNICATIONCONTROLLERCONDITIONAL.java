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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>ETHERNET-COMMUNICATION-CONTROLLER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ETHERNET-COMMUNICATION-CONTROLLER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONTROLLER-CONDITIONAL"/>
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
@XmlType(name = "ETHERNET-COMMUNICATION-CONTROLLER-CONDITIONAL", propOrder = {
    "wakeupbycontrollersupported",
    "couplingports",
    "macunicastaddress",
    "maximumreceivebufferlength",
    "maximumtransmissionunit",
    "maximumtransmitbufferlength",
    "variationpoint"
})
public class ETHERNETCOMMUNICATIONCONTROLLERCONDITIONAL {

    @XmlElement(name = "WAKE-UP-BY-CONTROLLER-SUPPORTED")
    protected BOOLEAN wakeupbycontrollersupported;
    @XmlElement(name = "COUPLING-PORTS")
    protected ETHERNETCOMMUNICATIONCONTROLLERCONDITIONAL.COUPLINGPORTS couplingports;
    @XmlElement(name = "MAC-UNICAST-ADDRESS")
    protected MACADDRESSSTRING macunicastaddress;
    @XmlElement(name = "MAXIMUM-RECEIVE-BUFFER-LENGTH")
    protected INTEGER maximumreceivebufferlength;
    @XmlElement(name = "MAXIMUM-TRANSMISSION-UNIT")
    protected POSITIVEINTEGER maximumtransmissionunit;
    @XmlElement(name = "MAXIMUM-TRANSMIT-BUFFER-LENGTH")
    protected INTEGER maximumtransmitbufferlength;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWAKEUPBYCONTROLLERSUPPORTED() {
        return wakeupbycontrollersupported;
    }

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWAKEUPBYCONTROLLERSUPPORTED(BOOLEAN value) {
        this.wakeupbycontrollersupported = value;
    }

    /**
     * ??couplingports?????
     * 
     * @return
     *     possible object is
     *     {@link ETHERNETCOMMUNICATIONCONTROLLERCONDITIONAL.COUPLINGPORTS }
     *     
     */
    public ETHERNETCOMMUNICATIONCONTROLLERCONDITIONAL.COUPLINGPORTS getCOUPLINGPORTS() {
        return couplingports;
    }

    /**
     * ??couplingports?????
     * 
     * @param value
     *     allowed object is
     *     {@link ETHERNETCOMMUNICATIONCONTROLLERCONDITIONAL.COUPLINGPORTS }
     *     
     */
    public void setCOUPLINGPORTS(ETHERNETCOMMUNICATIONCONTROLLERCONDITIONAL.COUPLINGPORTS value) {
        this.couplingports = value;
    }

    /**
     * ??macunicastaddress?????
     * 
     * @return
     *     possible object is
     *     {@link MACADDRESSSTRING }
     *     
     */
    public MACADDRESSSTRING getMACUNICASTADDRESS() {
        return macunicastaddress;
    }

    /**
     * ??macunicastaddress?????
     * 
     * @param value
     *     allowed object is
     *     {@link MACADDRESSSTRING }
     *     
     */
    public void setMACUNICASTADDRESS(MACADDRESSSTRING value) {
        this.macunicastaddress = value;
    }

    /**
     * ??maximumreceivebufferlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXIMUMRECEIVEBUFFERLENGTH() {
        return maximumreceivebufferlength;
    }

    /**
     * ??maximumreceivebufferlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXIMUMRECEIVEBUFFERLENGTH(INTEGER value) {
        this.maximumreceivebufferlength = value;
    }

    /**
     * ??maximumtransmissionunit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXIMUMTRANSMISSIONUNIT() {
        return maximumtransmissionunit;
    }

    /**
     * ??maximumtransmissionunit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXIMUMTRANSMISSIONUNIT(POSITIVEINTEGER value) {
        this.maximumtransmissionunit = value;
    }

    /**
     * ??maximumtransmitbufferlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXIMUMTRANSMITBUFFERLENGTH() {
        return maximumtransmitbufferlength;
    }

    /**
     * ??maximumtransmitbufferlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXIMUMTRANSMITBUFFERLENGTH(INTEGER value) {
        this.maximumtransmitbufferlength = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
     *         &lt;element name="COUPLING-PORT" type="{http://autosar.org/schema/r4.0}COUPLING-PORT"/>
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
        "couplingport"
    })
    public static class COUPLINGPORTS {

        @XmlElement(name = "COUPLING-PORT")
        protected List<COUPLINGPORT> couplingport;

        /**
         * Gets the value of the couplingport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couplingport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUPLINGPORT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COUPLINGPORT }
         * 
         * 
         */
        public List<COUPLINGPORT> getCOUPLINGPORT() {
            if (couplingport == null) {
                couplingport = new ArrayList<COUPLINGPORT>();
            }
            return this.couplingport;
        }

    }

}
