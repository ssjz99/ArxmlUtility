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
 * This meta class represents the ability to refine a timing event for particular instances of a software component. This supports then an instance specific timing.
 * 
 * <p>INSTANTIATION-TIMING-EVENT-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INSTANTIATION-TIMING-EVENT-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INSTANTIATION-RTE-EVENT-PROPS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INSTANTIATION-TIMING-EVENT-PROPS"/>
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
@XmlType(name = "INSTANTIATION-TIMING-EVENT-PROPS", propOrder = {
    "refinedeventiref",
    "shortlabel",
    "variationpoint",
    "period"
})
public class INSTANTIATIONTIMINGEVENTPROPS {

    @XmlElement(name = "REFINED-EVENT-IREF")
    protected INSTANCEEVENTINCOMPOSITIONINSTANCEREF refinedeventiref;
    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "PERIOD")
    protected TIMEVALUE period;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??refinedeventiref?????
     * 
     * @return
     *     possible object is
     *     {@link INSTANCEEVENTINCOMPOSITIONINSTANCEREF }
     *     
     */
    public INSTANCEEVENTINCOMPOSITIONINSTANCEREF getREFINEDEVENTIREF() {
        return refinedeventiref;
    }

    /**
     * ??refinedeventiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link INSTANCEEVENTINCOMPOSITIONINSTANCEREF }
     *     
     */
    public void setREFINEDEVENTIREF(INSTANCEEVENTINCOMPOSITIONINSTANCEREF value) {
        this.refinedeventiref = value;
    }

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTLABEL(IDENTIFIER value) {
        this.shortlabel = value;
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
     * ??period?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getPERIOD() {
        return period;
    }

    /**
     * ??period?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setPERIOD(TIMEVALUE value) {
        this.period = value;
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