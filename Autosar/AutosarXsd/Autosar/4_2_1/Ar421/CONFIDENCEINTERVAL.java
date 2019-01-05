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
 * Additionally to the list of measured distances of event occurrences, a confidence interval can be specified for the expected distance of two consecutive event occurrences with a given probability.
 * 
 * <p>CONFIDENCE-INTERVAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CONFIDENCE-INTERVAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CONFIDENCE-INTERVAL"/>
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
@XmlType(name = "CONFIDENCE-INTERVAL", propOrder = {
    "lowerbound",
    "propability",
    "upperbound"
})
public class CONFIDENCEINTERVAL {

    @XmlElement(name = "LOWER-BOUND")
    protected MULTIDIMENSIONALTIME lowerbound;
    @XmlElement(name = "PROPABILITY")
    protected FLOAT propability;
    @XmlElement(name = "UPPER-BOUND")
    protected MULTIDIMENSIONALTIME upperbound;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??lowerbound?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getLOWERBOUND() {
        return lowerbound;
    }

    /**
     * ??lowerbound?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setLOWERBOUND(MULTIDIMENSIONALTIME value) {
        this.lowerbound = value;
    }

    /**
     * ??propability?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getPROPABILITY() {
        return propability;
    }

    /**
     * ??propability?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setPROPABILITY(FLOAT value) {
        this.propability = value;
    }

    /**
     * ??upperbound?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getUPPERBOUND() {
        return upperbound;
    }

    /**
     * ??upperbound?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setUPPERBOUND(MULTIDIMENSIONALTIME value) {
        this.upperbound = value;
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
