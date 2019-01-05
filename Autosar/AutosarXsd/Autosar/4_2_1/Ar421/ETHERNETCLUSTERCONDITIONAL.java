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
 * <p>ETHERNET-CLUSTER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ETHERNET-CLUSTER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ETHERNET-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ETHERNET-CLUSTER-CONDITIONAL"/>
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
@XmlType(name = "ETHERNET-CLUSTER-CONDITIONAL", propOrder = {
    "baudrate",
    "physicalchannels",
    "protocolname",
    "protocolversion",
    "speed",
    "couplingportconnections",
    "macmulticastgroups",
    "variationpoint"
})
public class ETHERNETCLUSTERCONDITIONAL {

    @XmlElement(name = "BAUDRATE")
    protected POSITIVEUNLIMITEDINTEGER baudrate;
    @XmlElement(name = "PHYSICAL-CHANNELS")
    protected Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS physicalchannels;
    @XmlElement(name = "PROTOCOL-NAME")
    protected STRING protocolname;
    @XmlElement(name = "PROTOCOL-VERSION")
    protected STRING protocolversion;
    @XmlElement(name = "SPEED")
    protected INTEGER speed;
    @XmlElement(name = "COUPLING-PORT-CONNECTIONS")
    protected ETHERNETCLUSTERCONDITIONAL.COUPLINGPORTCONNECTIONS couplingportconnections;
    @XmlElement(name = "MAC-MULTICAST-GROUPS")
    protected ETHERNETCLUSTERCONDITIONAL.MACMULTICASTGROUPS macmulticastgroups;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??baudrate?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEUNLIMITEDINTEGER }
     *     
     */
    public POSITIVEUNLIMITEDINTEGER getBAUDRATE() {
        return baudrate;
    }

    /**
     * ??baudrate?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEUNLIMITEDINTEGER }
     *     
     */
    public void setBAUDRATE(POSITIVEUNLIMITEDINTEGER value) {
        this.baudrate = value;
    }

    /**
     * ??physicalchannels?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS }
     *     
     */
    public Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS getPHYSICALCHANNELS() {
        return physicalchannels;
    }

    /**
     * ??physicalchannels?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS }
     *     
     */
    public void setPHYSICALCHANNELS(Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS value) {
        this.physicalchannels = value;
    }

    /**
     * ??protocolname?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROTOCOLNAME() {
        return protocolname;
    }

    /**
     * ??protocolname?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROTOCOLNAME(STRING value) {
        this.protocolname = value;
    }

    /**
     * ??protocolversion?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROTOCOLVERSION() {
        return protocolversion;
    }

    /**
     * ??protocolversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROTOCOLVERSION(STRING value) {
        this.protocolversion = value;
    }

    /**
     * ??speed?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSPEED() {
        return speed;
    }

    /**
     * ??speed?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSPEED(INTEGER value) {
        this.speed = value;
    }

    /**
     * ??couplingportconnections?????
     * 
     * @return
     *     possible object is
     *     {@link ETHERNETCLUSTERCONDITIONAL.COUPLINGPORTCONNECTIONS }
     *     
     */
    public ETHERNETCLUSTERCONDITIONAL.COUPLINGPORTCONNECTIONS getCOUPLINGPORTCONNECTIONS() {
        return couplingportconnections;
    }

    /**
     * ??couplingportconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link ETHERNETCLUSTERCONDITIONAL.COUPLINGPORTCONNECTIONS }
     *     
     */
    public void setCOUPLINGPORTCONNECTIONS(ETHERNETCLUSTERCONDITIONAL.COUPLINGPORTCONNECTIONS value) {
        this.couplingportconnections = value;
    }

    /**
     * ??macmulticastgroups?????
     * 
     * @return
     *     possible object is
     *     {@link ETHERNETCLUSTERCONDITIONAL.MACMULTICASTGROUPS }
     *     
     */
    public ETHERNETCLUSTERCONDITIONAL.MACMULTICASTGROUPS getMACMULTICASTGROUPS() {
        return macmulticastgroups;
    }

    /**
     * ??macmulticastgroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link ETHERNETCLUSTERCONDITIONAL.MACMULTICASTGROUPS }
     *     
     */
    public void setMACMULTICASTGROUPS(ETHERNETCLUSTERCONDITIONAL.MACMULTICASTGROUPS value) {
        this.macmulticastgroups = value;
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
     *         &lt;element name="COUPLING-PORT-CONNECTION" type="{http://autosar.org/schema/r4.0}COUPLING-PORT-CONNECTION"/>
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
        "couplingportconnection"
    })
    public static class COUPLINGPORTCONNECTIONS {

        @XmlElement(name = "COUPLING-PORT-CONNECTION")
        protected List<COUPLINGPORTCONNECTION> couplingportconnection;

        /**
         * Gets the value of the couplingportconnection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couplingportconnection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUPLINGPORTCONNECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COUPLINGPORTCONNECTION }
         * 
         * 
         */
        public List<COUPLINGPORTCONNECTION> getCOUPLINGPORTCONNECTION() {
            if (couplingportconnection == null) {
                couplingportconnection = new ArrayList<COUPLINGPORTCONNECTION>();
            }
            return this.couplingportconnection;
        }

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
     *         &lt;element name="MAC-MULTICAST-GROUP" type="{http://autosar.org/schema/r4.0}MAC-MULTICAST-GROUP"/>
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
        "macmulticastgroup"
    })
    public static class MACMULTICASTGROUPS {

        @XmlElement(name = "MAC-MULTICAST-GROUP")
        protected List<MACMULTICASTGROUP> macmulticastgroup;

        /**
         * Gets the value of the macmulticastgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the macmulticastgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMACMULTICASTGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MACMULTICASTGROUP }
         * 
         * 
         */
        public List<MACMULTICASTGROUP> getMACMULTICASTGROUP() {
            if (macmulticastgroup == null) {
                macmulticastgroup = new ArrayList<MACMULTICASTGROUP>();
            }
            return this.macmulticastgroup;
        }

    }

}
