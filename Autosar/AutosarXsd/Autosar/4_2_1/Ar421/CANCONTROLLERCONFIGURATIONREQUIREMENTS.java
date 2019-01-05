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
 * This element allows the specification of ranges for the CAN Bit Timing configuration parameters. These ranges are taken as requirements and have to be respected by the ECU developer.
 * 
 * <p>CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-CAN-COMMUNICATION-CONTROLLER-ATTRIBUTES"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS"/>
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
@XmlType(name = "CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS", propOrder = {
    "cancontrollerfdattributes",
    "cancontrollerfdrequirements",
    "maxnumberoftimequantaperbit",
    "maxsamplepoint",
    "maxsyncjumpwidth",
    "minnumberoftimequantaperbit",
    "minsamplepoint",
    "minsyncjumpwidth"
})
public class CANCONTROLLERCONFIGURATIONREQUIREMENTS {

    @XmlElement(name = "CAN-CONTROLLER-FD-ATTRIBUTES")
    protected CANCONTROLLERFDCONFIGURATION cancontrollerfdattributes;
    @XmlElement(name = "CAN-CONTROLLER-FD-REQUIREMENTS")
    protected CANCONTROLLERFDCONFIGURATIONREQUIREMENTS cancontrollerfdrequirements;
    @XmlElement(name = "MAX-NUMBER-OF-TIME-QUANTA-PER-BIT")
    protected INTEGER maxnumberoftimequantaperbit;
    @XmlElement(name = "MAX-SAMPLE-POINT")
    protected FLOAT maxsamplepoint;
    @XmlElement(name = "MAX-SYNC-JUMP-WIDTH")
    protected FLOAT maxsyncjumpwidth;
    @XmlElement(name = "MIN-NUMBER-OF-TIME-QUANTA-PER-BIT")
    protected INTEGER minnumberoftimequantaperbit;
    @XmlElement(name = "MIN-SAMPLE-POINT")
    protected FLOAT minsamplepoint;
    @XmlElement(name = "MIN-SYNC-JUMP-WIDTH")
    protected FLOAT minsyncjumpwidth;
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
     * ??maxnumberoftimequantaperbit?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXNUMBEROFTIMEQUANTAPERBIT() {
        return maxnumberoftimequantaperbit;
    }

    /**
     * ??maxnumberoftimequantaperbit?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXNUMBEROFTIMEQUANTAPERBIT(INTEGER value) {
        this.maxnumberoftimequantaperbit = value;
    }

    /**
     * ??maxsamplepoint?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getMAXSAMPLEPOINT() {
        return maxsamplepoint;
    }

    /**
     * ??maxsamplepoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setMAXSAMPLEPOINT(FLOAT value) {
        this.maxsamplepoint = value;
    }

    /**
     * ??maxsyncjumpwidth?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getMAXSYNCJUMPWIDTH() {
        return maxsyncjumpwidth;
    }

    /**
     * ??maxsyncjumpwidth?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setMAXSYNCJUMPWIDTH(FLOAT value) {
        this.maxsyncjumpwidth = value;
    }

    /**
     * ??minnumberoftimequantaperbit?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMINNUMBEROFTIMEQUANTAPERBIT() {
        return minnumberoftimequantaperbit;
    }

    /**
     * ??minnumberoftimequantaperbit?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMINNUMBEROFTIMEQUANTAPERBIT(INTEGER value) {
        this.minnumberoftimequantaperbit = value;
    }

    /**
     * ??minsamplepoint?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getMINSAMPLEPOINT() {
        return minsamplepoint;
    }

    /**
     * ??minsamplepoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setMINSAMPLEPOINT(FLOAT value) {
        this.minsamplepoint = value;
    }

    /**
     * ??minsyncjumpwidth?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getMINSYNCJUMPWIDTH() {
        return minsyncjumpwidth;
    }

    /**
     * ??minsyncjumpwidth?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setMINSYNCJUMPWIDTH(FLOAT value) {
        this.minsyncjumpwidth = value;
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
