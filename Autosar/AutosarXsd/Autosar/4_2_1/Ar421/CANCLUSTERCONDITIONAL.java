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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>CAN-CLUSTER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-CLUSTER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-CAN-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-CLUSTER-CONDITIONAL"/>
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
@XmlType(name = "CAN-CLUSTER-CONDITIONAL", propOrder = {
    "baudrate",
    "physicalchannels",
    "protocolname",
    "protocolversion",
    "speed",
    "busoffrecovery",
    "canfdbaudrate",
    "variationpoint"
})
public class CANCLUSTERCONDITIONAL {

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

}
