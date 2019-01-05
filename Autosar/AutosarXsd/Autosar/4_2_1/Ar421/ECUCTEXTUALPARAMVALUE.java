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
 * Holding a value which is not subject to variation.
 * 
 * <p>ECUC-TEXTUAL-PARAM-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-TEXTUAL-PARAM-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-INDEXABLE-VALUE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-PARAMETER-VALUE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-TEXTUAL-PARAM-VALUE"/>
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
@XmlType(name = "ECUC-TEXTUAL-PARAM-VALUE", propOrder = {
    "index",
    "definitionref",
    "annotations",
    "isautovalue",
    "variationpoint",
    "value"
})
public class ECUCTEXTUALPARAMVALUE {

    @XmlElement(name = "INDEX")
    protected POSITIVEINTEGER index;
    @XmlElement(name = "DEFINITION-REF")
    protected Ar421.ECUCADDINFOPARAMVALUE.DEFINITIONREF definitionref;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.ECUCADDINFOPARAMVALUE.ANNOTATIONS annotations;
    @XmlElement(name = "IS-AUTO-VALUE")
    protected BOOLEAN isautovalue;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "VALUE")
    protected VERBATIMSTRING value;
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
     *     {@link Ar421.ECUCADDINFOPARAMVALUE.DEFINITIONREF }
     *     
     */
    public Ar421.ECUCADDINFOPARAMVALUE.DEFINITIONREF getDEFINITIONREF() {
        return definitionref;
    }

    /**
     * ??definitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCADDINFOPARAMVALUE.DEFINITIONREF }
     *     
     */
    public void setDEFINITIONREF(Ar421.ECUCADDINFOPARAMVALUE.DEFINITIONREF value) {
        this.definitionref = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ECUCADDINFOPARAMVALUE.ANNOTATIONS }
     *     
     */
    public Ar421.ECUCADDINFOPARAMVALUE.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCADDINFOPARAMVALUE.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.ECUCADDINFOPARAMVALUE.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??isautovalue?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getISAUTOVALUE() {
        return isautovalue;
    }

    /**
     * ??isautovalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setISAUTOVALUE(BOOLEAN value) {
        this.isautovalue = value;
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
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public VERBATIMSTRING getVALUE() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link VERBATIMSTRING }
     *     
     */
    public void setVALUE(VERBATIMSTRING value) {
        this.value = value;
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
