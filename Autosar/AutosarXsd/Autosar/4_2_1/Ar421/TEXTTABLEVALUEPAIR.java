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
 * Defines a pair of text values which are translated into each other.
 * 
 * <p>TEXT-TABLE-VALUE-PAIR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TEXT-TABLE-VALUE-PAIR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TEXT-TABLE-VALUE-PAIR"/>
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
@XmlType(name = "TEXT-TABLE-VALUE-PAIR", propOrder = {
    "firstvalue",
    "secondvalue"
})
public class TEXTTABLEVALUEPAIR {

    @XmlElement(name = "FIRST-VALUE")
    protected NUMERICALVALUEVARIATIONPOINT firstvalue;
    @XmlElement(name = "SECOND-VALUE")
    protected NUMERICALVALUEVARIATIONPOINT secondvalue;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firstvalue?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public NUMERICALVALUEVARIATIONPOINT getFIRSTVALUE() {
        return firstvalue;
    }

    /**
     * ??firstvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public void setFIRSTVALUE(NUMERICALVALUEVARIATIONPOINT value) {
        this.firstvalue = value;
    }

    /**
     * ??secondvalue?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public NUMERICALVALUEVARIATIONPOINT getSECONDVALUE() {
        return secondvalue;
    }

    /**
     * ??secondvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public void setSECONDVALUE(NUMERICALVALUEVARIATIONPOINT value) {
        this.secondvalue = value;
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
