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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSFORMATION-I-SIGNAL-PROPS-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL"/>
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
@XmlType(name = "USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL", propOrder = {
    "transformerref",
    "variationpoint"
})
public class USERDEFINEDTRANSFORMATIONISIGNALPROPSCONDITIONAL {

    @XmlElement(name = "TRANSFORMER-REF")
    protected Ar421.ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF transformerref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??transformerref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF }
     *     
     */
    public Ar421.ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF getTRANSFORMERREF() {
        return transformerref;
    }

    /**
     * ??transformerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF }
     *     
     */
    public void setTRANSFORMERREF(Ar421.ENDTOENDTRANSFORMATIONISIGNALPROPSCONDITIONAL.TRANSFORMERREF value) {
        this.transformerref = value;
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
