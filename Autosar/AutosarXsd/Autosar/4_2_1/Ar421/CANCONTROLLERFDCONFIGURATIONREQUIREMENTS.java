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
 * This element allows the specification of ranges for the CanFD bit timing configuration parameters. These ranges are taken as requirements and shall be respected by the ECU developer.
 * 
 * <p>CAN-CONTROLLER-FD-CONFIGURATION-REQUIREMENTS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-CONTROLLER-FD-CONFIGURATION-REQUIREMENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-CONTROLLER-FD-CONFIGURATION-REQUIREMENTS"/>
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
@XmlType(name = "CAN-CONTROLLER-FD-CONFIGURATION-REQUIREMENTS", propOrder = {
    "maxnumberoftimequantaperbit",
    "maxsamplepoint",
    "maxsyncjumpwidth",
    "maxtrcvdelaycompensationoffset",
    "minnumberoftimequantaperbit",
    "minsamplepoint",
    "minsyncjumpwidth",
    "mintrcvdelaycompensationoffset",
    "paddingvalue",
    "txbitrateswitch"
})
public class CANCONTROLLERFDCONFIGURATIONREQUIREMENTS {

    @XmlElement(name = "MAX-NUMBER-OF-TIME-QUANTA-PER-BIT")
    protected INTEGER maxnumberoftimequantaperbit;
    @XmlElement(name = "MAX-SAMPLE-POINT")
    protected FLOAT maxsamplepoint;
    @XmlElement(name = "MAX-SYNC-JUMP-WIDTH")
    protected FLOAT maxsyncjumpwidth;
    @XmlElement(name = "MAX-TRCV-DELAY-COMPENSATION-OFFSET")
    protected TIMEVALUE maxtrcvdelaycompensationoffset;
    @XmlElement(name = "MIN-NUMBER-OF-TIME-QUANTA-PER-BIT")
    protected INTEGER minnumberoftimequantaperbit;
    @XmlElement(name = "MIN-SAMPLE-POINT")
    protected FLOAT minsamplepoint;
    @XmlElement(name = "MIN-SYNC-JUMP-WIDTH")
    protected FLOAT minsyncjumpwidth;
    @XmlElement(name = "MIN-TRCV-DELAY-COMPENSATION-OFFSET")
    protected TIMEVALUE mintrcvdelaycompensationoffset;
    @XmlElement(name = "PADDING-VALUE")
    protected POSITIVEINTEGER paddingvalue;
    @XmlElement(name = "TX-BIT-RATE-SWITCH")
    protected BOOLEAN txbitrateswitch;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??maxtrcvdelaycompensationoffset?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMAXTRCVDELAYCOMPENSATIONOFFSET() {
        return maxtrcvdelaycompensationoffset;
    }

    /**
     * ??maxtrcvdelaycompensationoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMAXTRCVDELAYCOMPENSATIONOFFSET(TIMEVALUE value) {
        this.maxtrcvdelaycompensationoffset = value;
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
     * ??mintrcvdelaycompensationoffset?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMINTRCVDELAYCOMPENSATIONOFFSET() {
        return mintrcvdelaycompensationoffset;
    }

    /**
     * ??mintrcvdelaycompensationoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMINTRCVDELAYCOMPENSATIONOFFSET(TIMEVALUE value) {
        this.mintrcvdelaycompensationoffset = value;
    }

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
