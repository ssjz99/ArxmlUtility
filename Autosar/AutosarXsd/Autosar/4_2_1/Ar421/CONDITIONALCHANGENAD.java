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
 * Generates an conditional change NAD request. See LIN 2.1 protocol specification for more information.
 * 
 * <p>CONDITIONAL-CHANGE-NAD complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CONDITIONAL-CHANGE-NAD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SCHEDULE-TABLE-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-CONFIGURATION-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CONDITIONAL-CHANGE-NAD"/>
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
@XmlType(name = "CONDITIONAL-CHANGE-NAD", propOrder = {
    "introduction",
    "delay",
    "positionintable",
    "assignedcontrollerref",
    "_byte",
    "id",
    "invert",
    "mask",
    "newnad"
})
public class CONDITIONALCHANGENAD {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "DELAY")
    protected TIMEVALUE delay;
    @XmlElement(name = "POSITION-IN-TABLE")
    protected INTEGER positionintable;
    @XmlElement(name = "ASSIGNED-CONTROLLER-REF")
    protected Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF assignedcontrollerref;
    @XmlElement(name = "BYTE")
    protected INTEGER _byte;
    @XmlElement(name = "ID")
    protected POSITIVEINTEGER id;
    @XmlElement(name = "INVERT")
    protected INTEGER invert;
    @XmlElement(name = "MASK")
    protected INTEGER mask;
    @XmlElement(name = "NEW-NAD")
    protected INTEGER newnad;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??delay?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getDELAY() {
        return delay;
    }

    /**
     * ??delay?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setDELAY(TIMEVALUE value) {
        this.delay = value;
    }

    /**
     * ??positionintable?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPOSITIONINTABLE() {
        return positionintable;
    }

    /**
     * ??positionintable?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPOSITIONINTABLE(INTEGER value) {
        this.positionintable = value;
    }

    /**
     * ??assignedcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF }
     *     
     */
    public Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF getASSIGNEDCONTROLLERREF() {
        return assignedcontrollerref;
    }

    /**
     * ??assignedcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF }
     *     
     */
    public void setASSIGNEDCONTROLLERREF(Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF value) {
        this.assignedcontrollerref = value;
    }

    /**
     * ??byte?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getBYTE() {
        return _byte;
    }

    /**
     * ??byte?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setBYTE(INTEGER value) {
        this._byte = value;
    }

    /**
     * ??id?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getID() {
        return id;
    }

    /**
     * ??id?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setID(POSITIVEINTEGER value) {
        this.id = value;
    }

    /**
     * ??invert?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getINVERT() {
        return invert;
    }

    /**
     * ??invert?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setINVERT(INTEGER value) {
        this.invert = value;
    }

    /**
     * ??mask?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMASK() {
        return mask;
    }

    /**
     * ??mask?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMASK(INTEGER value) {
        this.mask = value;
    }

    /**
     * ??newnad?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNEWNAD() {
        return newnad;
    }

    /**
     * ??newnad?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNEWNAD(INTEGER value) {
        this.newnad = value;
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