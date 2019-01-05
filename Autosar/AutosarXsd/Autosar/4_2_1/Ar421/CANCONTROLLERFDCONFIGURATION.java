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
 * Bit timing related configuration of a CAN controller for payload and CRC of a CAN FD frame.
 * 
 * <p>CAN-CONTROLLER-FD-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-CONTROLLER-FD-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-CONTROLLER-FD-CONFIGURATION"/>
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
@XmlType(name = "CAN-CONTROLLER-FD-CONFIGURATION", propOrder = {
    "paddingvalue",
    "propseg",
    "syncjumpwidth",
    "timeseg1",
    "timeseg2",
    "trcvdelaycompensationoffset",
    "txbitrateswitch"
})
public class CANCONTROLLERFDCONFIGURATION {

    @XmlElement(name = "PADDING-VALUE")
    protected POSITIVEINTEGER paddingvalue;
    @XmlElement(name = "PROP-SEG")
    protected POSITIVEINTEGER propseg;
    @XmlElement(name = "SYNC-JUMP-WIDTH")
    protected POSITIVEINTEGER syncjumpwidth;
    @XmlElement(name = "TIME-SEG-1")
    protected POSITIVEINTEGER timeseg1;
    @XmlElement(name = "TIME-SEG-2")
    protected POSITIVEINTEGER timeseg2;
    @XmlElement(name = "TRCV-DELAY-COMPENSATION-OFFSET")
    protected TIMEVALUE trcvdelaycompensationoffset;
    @XmlElement(name = "TX-BIT-RATE-SWITCH")
    protected BOOLEAN txbitrateswitch;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??paddingvalue?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPADDINGVALUE() {
        return paddingvalue;
    }

    /**
     * ??paddingvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPADDINGVALUE(POSITIVEINTEGER value) {
        this.paddingvalue = value;
    }

    /**
     * ??propseg?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPROPSEG() {
        return propseg;
    }

    /**
     * ??propseg?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPROPSEG(POSITIVEINTEGER value) {
        this.propseg = value;
    }

    /**
     * ??syncjumpwidth?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSYNCJUMPWIDTH() {
        return syncjumpwidth;
    }

    /**
     * ??syncjumpwidth?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSYNCJUMPWIDTH(POSITIVEINTEGER value) {
        this.syncjumpwidth = value;
    }

    /**
     * ??timeseg1?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getTIMESEG1() {
        return timeseg1;
    }

    /**
     * ??timeseg1?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setTIMESEG1(POSITIVEINTEGER value) {
        this.timeseg1 = value;
    }

    /**
     * ??timeseg2?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getTIMESEG2() {
        return timeseg2;
    }

    /**
     * ??timeseg2?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setTIMESEG2(POSITIVEINTEGER value) {
        this.timeseg2 = value;
    }

    /**
     * ??trcvdelaycompensationoffset?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTRCVDELAYCOMPENSATIONOFFSET() {
        return trcvdelaycompensationoffset;
    }

    /**
     * ??trcvdelaycompensationoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTRCVDELAYCOMPENSATIONOFFSET(TIMEVALUE value) {
        this.trcvdelaycompensationoffset = value;
    }

    /**
     * ??txbitrateswitch?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getTXBITRATESWITCH() {
        return txbitrateswitch;
    }

    /**
     * ??txbitrateswitch?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setTXBITRATESWITCH(BOOLEAN value) {
        this.txbitrateswitch = value;
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
