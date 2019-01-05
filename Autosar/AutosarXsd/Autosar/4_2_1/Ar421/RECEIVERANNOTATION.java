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
 * Annotation of a receiver port, specifying properties of data elements that don't affect communication or generation of the RTE. The given attributes are requirements on the required data.
 * 
 * <p>RECEIVER-ANNOTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RECEIVER-ANNOTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GENERAL-ANNOTATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-RECEIVER-ANNOTATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RECEIVER-ANNOTATION"/>
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
@XmlType(name = "RECEIVER-ANNOTATION", propOrder = {
    "label",
    "annotationorigin",
    "annotationtext",
    "computed",
    "dataelementref",
    "limitkind",
    "processingkind",
    "signalage"
})
public class RECEIVERANNOTATION {

    @XmlElement(name = "LABEL")
    protected MULTILANGUAGELONGNAME label;
    @XmlElement(name = "ANNOTATION-ORIGIN")
    protected STRING annotationorigin;
    @XmlElement(name = "ANNOTATION-TEXT")
    protected DOCUMENTATIONBLOCK annotationtext;
    @XmlElement(name = "COMPUTED")
    protected BOOLEAN computed;
    @XmlElement(name = "DATA-ELEMENT-REF")
    protected Ar421.SENDERANNOTATION.DATAELEMENTREF dataelementref;
    @XmlElement(name = "LIMIT-KIND")
    protected DATALIMITKINDENUM limitkind;
    @XmlElement(name = "PROCESSING-KIND")
    protected PROCESSINGKINDENUM processingkind;
    @XmlElement(name = "SIGNAL-AGE")
    protected MULTIDIMENSIONALTIME signalage;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??label?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLABEL() {
        return label;
    }

    /**
     * ??label?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLABEL(MULTILANGUAGELONGNAME value) {
        this.label = value;
    }

    /**
     * ??annotationorigin?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getANNOTATIONORIGIN() {
        return annotationorigin;
    }

    /**
     * ??annotationorigin?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setANNOTATIONORIGIN(STRING value) {
        this.annotationorigin = value;
    }

    /**
     * ??annotationtext?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getANNOTATIONTEXT() {
        return annotationtext;
    }

    /**
     * ??annotationtext?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setANNOTATIONTEXT(DOCUMENTATIONBLOCK value) {
        this.annotationtext = value;
    }

    /**
     * ??computed?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCOMPUTED() {
        return computed;
    }

    /**
     * ??computed?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCOMPUTED(BOOLEAN value) {
        this.computed = value;
    }

    /**
     * ??dataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SENDERANNOTATION.DATAELEMENTREF }
     *     
     */
    public Ar421.SENDERANNOTATION.DATAELEMENTREF getDATAELEMENTREF() {
        return dataelementref;
    }

    /**
     * ??dataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SENDERANNOTATION.DATAELEMENTREF }
     *     
     */
    public void setDATAELEMENTREF(Ar421.SENDERANNOTATION.DATAELEMENTREF value) {
        this.dataelementref = value;
    }

    /**
     * ??limitkind?????
     * 
     * @return
     *     possible object is
     *     {@link DATALIMITKINDENUM }
     *     
     */
    public DATALIMITKINDENUM getLIMITKIND() {
        return limitkind;
    }

    /**
     * ??limitkind?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATALIMITKINDENUM }
     *     
     */
    public void setLIMITKIND(DATALIMITKINDENUM value) {
        this.limitkind = value;
    }

    /**
     * ??processingkind?????
     * 
     * @return
     *     possible object is
     *     {@link PROCESSINGKINDENUM }
     *     
     */
    public PROCESSINGKINDENUM getPROCESSINGKIND() {
        return processingkind;
    }

    /**
     * ??processingkind?????
     * 
     * @param value
     *     allowed object is
     *     {@link PROCESSINGKINDENUM }
     *     
     */
    public void setPROCESSINGKIND(PROCESSINGKINDENUM value) {
        this.processingkind = value;
    }

    /**
     * ??signalage?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getSIGNALAGE() {
        return signalage;
    }

    /**
     * ??signalage?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setSIGNALAGE(MULTIDIMENSIONALTIME value) {
        this.signalage = value;
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
