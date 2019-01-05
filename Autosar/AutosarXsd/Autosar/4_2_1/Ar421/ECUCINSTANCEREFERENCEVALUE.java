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
 * InstanceReference representation in the ECU Configuration.
 * 
 * <p>ECUC-INSTANCE-REFERENCE-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-INSTANCE-REFERENCE-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-INDEXABLE-VALUE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-ABSTRACT-REFERENCE-VALUE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-INSTANCE-REFERENCE-VALUE"/>
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
@XmlType(name = "ECUC-INSTANCE-REFERENCE-VALUE", propOrder = {
    "index",
    "definitionref",
    "annotations",
    "variationpoint",
    "valueiref"
})
public class ECUCINSTANCEREFERENCEVALUE {

    @XmlElement(name = "INDEX")
    protected POSITIVEINTEGER index;
    @XmlElement(name = "DEFINITION-REF")
    protected Ar421.ECUCREFERENCEVALUE.DEFINITIONREF definitionref;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.ECUCREFERENCEVALUE.ANNOTATIONS annotations;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "VALUE-IREF")
    protected ANYINSTANCEREF valueiref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??index?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getINDEX() {
        return index;
    }

    /**
     * ??index?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setINDEX(POSITIVEINTEGER value) {
        this.index = value;
    }

    /**
     * ??definitionref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ECUCREFERENCEVALUE.DEFINITIONREF }
     *     
     */
    public Ar421.ECUCREFERENCEVALUE.DEFINITIONREF getDEFINITIONREF() {
        return definitionref;
    }

    /**
     * ??definitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCREFERENCEVALUE.DEFINITIONREF }
     *     
     */
    public void setDEFINITIONREF(Ar421.ECUCREFERENCEVALUE.DEFINITIONREF value) {
        this.definitionref = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ECUCREFERENCEVALUE.ANNOTATIONS }
     *     
     */
    public Ar421.ECUCREFERENCEVALUE.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCREFERENCEVALUE.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.ECUCREFERENCEVALUE.ANNOTATIONS value) {
        this.annotations = value;
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
     * ??valueiref?????
     * 
     * @return
     *     possible object is
     *     {@link ANYINSTANCEREF }
     *     
     */
    public ANYINSTANCEREF getVALUEIREF() {
        return valueiref;
    }

    /**
     * ??valueiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ANYINSTANCEREF }
     *     
     */
    public void setVALUEIREF(ANYINSTANCEREF value) {
        this.valueiref = value;
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
