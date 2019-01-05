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
 * Annotation to a "delegated port" to specify the Signal Fan In or Signal Fan Out inside the CompositionSwComponentType.
 * 
 * <p>DELEGATED-PORT-ANNOTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DELEGATED-PORT-ANNOTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GENERAL-ANNOTATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DELEGATED-PORT-ANNOTATION"/>
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
@XmlType(name = "DELEGATED-PORT-ANNOTATION", propOrder = {
    "label",
    "annotationorigin",
    "annotationtext",
    "signalfan"
})
public class DELEGATEDPORTANNOTATION {

    @XmlElement(name = "LABEL")
    protected MULTILANGUAGELONGNAME label;
    @XmlElement(name = "ANNOTATION-ORIGIN")
    protected STRING annotationorigin;
    @XmlElement(name = "ANNOTATION-TEXT")
    protected DOCUMENTATIONBLOCK annotationtext;
    @XmlElement(name = "SIGNAL-FAN")
    protected SIGNALFANENUM signalfan;
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
     * ??signalfan?????
     * 
     * @return
     *     possible object is
     *     {@link SIGNALFANENUM }
     *     
     */
    public SIGNALFANENUM getSIGNALFAN() {
        return signalfan;
    }

    /**
     * ??signalfan?????
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNALFANENUM }
     *     
     */
    public void setSIGNALFAN(SIGNALFANENUM value) {
        this.signalfan = value;
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
