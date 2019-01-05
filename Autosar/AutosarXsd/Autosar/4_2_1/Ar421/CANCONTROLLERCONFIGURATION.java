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
 * This element is used for the specification of the exact CAN Bit Timing configuration parameter values.
 * 
 * <p>CAN-CONTROLLER-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-CONTROLLER-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-CAN-COMMUNICATION-CONTROLLER-ATTRIBUTES"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-CONTROLLER-CONFIGURATION"/>
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
@XmlType(name = "CAN-CONTROLLER-CONFIGURATION", propOrder = {
    "cancontrollerfdattributes",
    "cancontrollerfdrequirements",
    "propseg",
    "syncjumpwidth",
    "timeseg1",
    "timeseg2"
})
public class CANCONTROLLERCONFIGURATION {

    @XmlElement(name = "CAN-CONTROLLER-FD-ATTRIBUTES")
    protected CANCONTROLLERFDCONFIGURATION cancontrollerfdattributes;
    @XmlElement(name = "CAN-CONTROLLER-FD-REQUIREMENTS")
    protected CANCONTROLLERFDCONFIGURATIONREQUIREMENTS cancontrollerfdrequirements;
    @XmlElement(name = "PROP-SEG")
    protected INTEGER propseg;
    @XmlElement(name = "SYNC-JUMP-WIDTH")
    protected INTEGER syncjumpwidth;
    @XmlElement(name = "TIME-SEG-1")
    protected INTEGER timeseg1;
    @XmlElement(name = "TIME-SEG-2")
    protected INTEGER timeseg2;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??cancontrollerfdattributes?????
     * 
     * @return
     *     possible object is
     *     {@link CANCONTROLLERFDCONFIGURATION }
     *     
     */
    public CANCONTROLLERFDCONFIGURATION getCANCONTROLLERFDATTRIBUTES() {
        return cancontrollerfdattributes;
    }

    /**
     * ??cancontrollerfdattributes?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANCONTROLLERFDCONFIGURATION }
     *     
     */
    public void setCANCONTROLLERFDATTRIBUTES(CANCONTROLLERFDCONFIGURATION value) {
        this.cancontrollerfdattributes = value;
    }

    /**
     * ??cancontrollerfdrequirements?????
     * 
     * @return
     *     possible object is
     *     {@link CANCONTROLLERFDCONFIGURATIONREQUIREMENTS }
     *     
     */
    public CANCONTROLLERFDCONFIGURATIONREQUIREMENTS getCANCONTROLLERFDREQUIREMENTS() {
        return cancontrollerfdrequirements;
    }

    /**
     * ??cancontrollerfdrequirements?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANCONTROLLERFDCONFIGURATIONREQUIREMENTS }
     *     
     */
    public void setCANCONTROLLERFDREQUIREMENTS(CANCONTROLLERFDCONFIGURATIONREQUIREMENTS value) {
        this.cancontrollerfdrequirements = value;
    }

    /**
     * ??propseg?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPROPSEG() {
        return propseg;
    }

    /**
     * ??propseg?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPROPSEG(INTEGER value) {
        this.propseg = value;
    }

    /**
     * ??syncjumpwidth?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSYNCJUMPWIDTH() {
        return syncjumpwidth;
    }

    /**
     * ??syncjumpwidth?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSYNCJUMPWIDTH(INTEGER value) {
        this.syncjumpwidth = value;
    }

    /**
     * ??timeseg1?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getTIMESEG1() {
        return timeseg1;
    }

    /**
     * ??timeseg1?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setTIMESEG1(INTEGER value) {
        this.timeseg1 = value;
    }

    /**
     * ??timeseg2?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getTIMESEG2() {
        return timeseg2;
    }

    /**
     * ??timeseg2?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setTIMESEG2(INTEGER value) {
        this.timeseg2 = value;
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
