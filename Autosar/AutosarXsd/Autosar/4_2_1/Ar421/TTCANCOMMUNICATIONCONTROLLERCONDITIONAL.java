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
 * <p>TTCAN-COMMUNICATION-CONTROLLER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TTCAN-COMMUNICATION-CONTROLLER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-CAN-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TTCAN-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TTCAN-COMMUNICATION-CONTROLLER-CONDITIONAL"/>
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
@XmlType(name = "TTCAN-COMMUNICATION-CONTROLLER-CONDITIONAL", propOrder = {
    "wakeupbycontrollersupported",
    "cancontrollerattributes",
    "applwatchdoglimit",
    "expectedtxtrigger",
    "externalclocksynchronisation",
    "initialrefoffset",
    "master",
    "timemasterpriority",
    "timetriggeredcanlevel",
    "txenablewindowlength",
    "variationpoint"
})
public class TTCANCOMMUNICATIONCONTROLLERCONDITIONAL {

    @XmlElement(name = "WAKE-UP-BY-CONTROLLER-SUPPORTED")
    protected BOOLEAN wakeupbycontrollersupported;
    @XmlElement(name = "CAN-CONTROLLER-ATTRIBUTES")
    protected Ar421.CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES cancontrollerattributes;
    @XmlElement(name = "APPL-WATCHDOG-LIMIT")
    protected INTEGER applwatchdoglimit;
    @XmlElement(name = "EXPECTED-TX-TRIGGER")
    protected INTEGER expectedtxtrigger;
    @XmlElement(name = "EXTERNAL-CLOCK-SYNCHRONISATION")
    protected BOOLEAN externalclocksynchronisation;
    @XmlElement(name = "INITIAL-REF-OFFSET")
    protected INTEGER initialrefoffset;
    @XmlElement(name = "MASTER")
    protected BOOLEAN master;
    @XmlElement(name = "TIME-MASTER-PRIORITY")
    protected INTEGER timemasterpriority;
    @XmlElement(name = "TIME-TRIGGERED-CAN-LEVEL")
    protected INTEGER timetriggeredcanlevel;
    @XmlElement(name = "TX-ENABLE-WINDOW-LENGTH")
    protected INTEGER txenablewindowlength;
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
     * ??cancontrollerattributes?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES }
     *     
     */
    public Ar421.CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES getCANCONTROLLERATTRIBUTES() {
        return cancontrollerattributes;
    }

    /**
     * ??cancontrollerattributes?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES }
     *     
     */
    public void setCANCONTROLLERATTRIBUTES(Ar421.CANCOMMUNICATIONCONTROLLERCONDITIONAL.CANCONTROLLERATTRIBUTES value) {
        this.cancontrollerattributes = value;
    }

    /**
     * ??applwatchdoglimit?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getAPPLWATCHDOGLIMIT() {
        return applwatchdoglimit;
    }

    /**
     * ??applwatchdoglimit?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setAPPLWATCHDOGLIMIT(INTEGER value) {
        this.applwatchdoglimit = value;
    }

    /**
     * ??expectedtxtrigger?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getEXPECTEDTXTRIGGER() {
        return expectedtxtrigger;
    }

    /**
     * ??expectedtxtrigger?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setEXPECTEDTXTRIGGER(INTEGER value) {
        this.expectedtxtrigger = value;
    }

    /**
     * ??externalclocksynchronisation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getEXTERNALCLOCKSYNCHRONISATION() {
        return externalclocksynchronisation;
    }

    /**
     * ??externalclocksynchronisation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setEXTERNALCLOCKSYNCHRONISATION(BOOLEAN value) {
        this.externalclocksynchronisation = value;
    }

    /**
     * ??initialrefoffset?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getINITIALREFOFFSET() {
        return initialrefoffset;
    }

    /**
     * ??initialrefoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setINITIALREFOFFSET(INTEGER value) {
        this.initialrefoffset = value;
    }

    /**
     * ??master?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getMASTER() {
        return master;
    }

    /**
     * ??master?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setMASTER(BOOLEAN value) {
        this.master = value;
    }

    /**
     * ??timemasterpriority?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getTIMEMASTERPRIORITY() {
        return timemasterpriority;
    }

    /**
     * ??timemasterpriority?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setTIMEMASTERPRIORITY(INTEGER value) {
        this.timemasterpriority = value;
    }

    /**
     * ??timetriggeredcanlevel?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getTIMETRIGGEREDCANLEVEL() {
        return timetriggeredcanlevel;
    }

    /**
     * ??timetriggeredcanlevel?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setTIMETRIGGEREDCANLEVEL(INTEGER value) {
        this.timetriggeredcanlevel = value;
    }

    /**
     * ??txenablewindowlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getTXENABLEWINDOWLENGTH() {
        return txenablewindowlength;
    }

    /**
     * ??txenablewindowlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setTXENABLEWINDOWLENGTH(INTEGER value) {
        this.txenablewindowlength = value;
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
