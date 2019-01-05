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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>J-1939-CLUSTER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="J-1939-CLUSTER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-CAN-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}J-1939-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}J-1939-CLUSTER-CONDITIONAL"/>
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
@XmlType(name = "J-1939-CLUSTER-CONDITIONAL", propOrder = {
    "baudrate",
    "physicalchannels",
    "protocolname",
    "protocolversion",
    "speed",
    "busoffrecovery",
    "canfdbaudrate",
    "variationpoint"
})
public class J1939CLUSTERCONDITIONAL {

    @XmlElement(name = "BAUDRATE")
    protected POSITIVEUNLIMITEDINTEGER baudrate;
    @XmlElement(name = "PHYSICAL-CHANNELS")
    protected J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS physicalchannels;
    @XmlElement(name = "PROTOCOL-NAME")
    protected STRING protocolname;
    @XmlElement(name = "PROTOCOL-VERSION")
    protected STRING protocolversion;
    @XmlElement(name = "SPEED")
    protected INTEGER speed;
    @XmlElement(name = "BUS-OFF-RECOVERY")
    protected CANCLUSTERBUSOFFRECOVERY busoffrecovery;
    @XmlElement(name = "CAN-FD-BAUDRATE")
    protected POSITIVEUNLIMITEDINTEGER canfdbaudrate;
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
     *     {@link J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS }
     *     
     */
    public J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS getPHYSICALCHANNELS() {
        return physicalchannels;
    }

    /**
     * ??physicalchannels?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS }
     *     
     */
    public void setPHYSICALCHANNELS(J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS value) {
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
     * ??busoffrecovery?????
     * 
     * @return
     *     possible object is
     *     {@link CANCLUSTERBUSOFFRECOVERY }
     *     
     */
    public CANCLUSTERBUSOFFRECOVERY getBUSOFFRECOVERY() {
        return busoffrecovery;
    }

    /**
     * ??busoffrecovery?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANCLUSTERBUSOFFRECOVERY }
     *     
     */
    public void setBUSOFFRECOVERY(CANCLUSTERBUSOFFRECOVERY value) {
        this.busoffrecovery = value;
    }

    /**
     * ??canfdbaudrate?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEUNLIMITEDINTEGER }
     *     
     */
    public POSITIVEUNLIMITEDINTEGER getCANFDBAUDRATE() {
        return canfdbaudrate;
    }

    /**
     * ??canfdbaudrate?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEUNLIMITEDINTEGER }
     *     
     */
    public void setCANFDBAUDRATE(POSITIVEUNLIMITEDINTEGER value) {
        this.canfdbaudrate = value;
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
     *         &lt;element name="CAN-PHYSICAL-CHANNEL" type="{http://autosar.org/schema/r4.0}CAN-PHYSICAL-CHANNEL"/>
     *         &lt;element name="ETHERNET-PHYSICAL-CHANNEL" type="{http://autosar.org/schema/r4.0}ETHERNET-PHYSICAL-CHANNEL"/>
     *         &lt;element name="FLEXRAY-PHYSICAL-CHANNEL" type="{http://autosar.org/schema/r4.0}FLEXRAY-PHYSICAL-CHANNEL"/>
     *         &lt;element name="LIN-PHYSICAL-CHANNEL" type="{http://autosar.org/schema/r4.0}LIN-PHYSICAL-CHANNEL"/>
     *         &lt;element name="TTCAN-PHYSICAL-CHANNEL" type="{http://autosar.org/schema/r4.0}TTCAN-PHYSICAL-CHANNEL"/>
     *         &lt;element name="USER-DEFINED-PHYSICAL-CHANNEL" type="{http://autosar.org/schema/r4.0}USER-DEFINED-PHYSICAL-CHANNEL"/>
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
        "canphysicalchannelOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL"
    })
    public static class PHYSICALCHANNELS {

        @XmlElements({
            @XmlElement(name = "CAN-PHYSICAL-CHANNEL", type = CANPHYSICALCHANNEL.class),
            @XmlElement(name = "ETHERNET-PHYSICAL-CHANNEL", type = ETHERNETPHYSICALCHANNEL.class),
            @XmlElement(name = "FLEXRAY-PHYSICAL-CHANNEL", type = FLEXRAYPHYSICALCHANNEL.class),
            @XmlElement(name = "LIN-PHYSICAL-CHANNEL", type = LINPHYSICALCHANNEL.class),
            @XmlElement(name = "TTCAN-PHYSICAL-CHANNEL", type = TTCANPHYSICALCHANNEL.class),
            @XmlElement(name = "USER-DEFINED-PHYSICAL-CHANNEL", type = USERDEFINEDPHYSICALCHANNEL.class)
        })
        protected List<Object> canphysicalchannelOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL;

        /**
         * Gets the value of the canphysicalchannelOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the canphysicalchannelOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANPHYSICALCHANNELOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANPHYSICALCHANNEL }
         * {@link ETHERNETPHYSICALCHANNEL }
         * {@link FLEXRAYPHYSICALCHANNEL }
         * {@link LINPHYSICALCHANNEL }
         * {@link TTCANPHYSICALCHANNEL }
         * {@link USERDEFINEDPHYSICALCHANNEL }
         * 
         * 
         */
        public List<Object> getCANPHYSICALCHANNELOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL() {
            if (canphysicalchannelOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL == null) {
                canphysicalchannelOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL = new ArrayList<Object>();
            }
            return this.canphysicalchannelOrETHERNETPHYSICALCHANNELOrFLEXRAYPHYSICALCHANNEL;
        }

    }

}
