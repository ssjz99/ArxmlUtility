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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This meta-class represents the ability to specify one segment of a segmented computation method.
 * 
 * <p>COMPU-SCALE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPU-SCALE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPU-SCALE"/>
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
@XmlType(name = "COMPU-SCALE", propOrder = {
    "shortlabel",
    "symbol",
    "desc",
    "mask",
    "lowerlimit",
    "upperlimit",
    "compuinversevalue",
    "compuconstOrCOMPURATIONALCOEFFS",
    "variationpoint"
})
public class COMPUSCALE {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "SYMBOL")
    protected CIDENTIFIER symbol;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "MASK")
    protected POSITIVEINTEGER mask;
    @XmlElement(name = "LOWER-LIMIT")
    protected LIMIT lowerlimit;
    @XmlElement(name = "UPPER-LIMIT")
    protected LIMIT upperlimit;
    @XmlElement(name = "COMPU-INVERSE-VALUE")
    protected COMPUCONST compuinversevalue;
    @XmlElements({
        @XmlElement(name = "COMPU-CONST", type = COMPUCONST.class),
        @XmlElement(name = "COMPU-RATIONAL-COEFFS", type = COMPURATIONALCOEFFS.class)
    })
    protected Object compuconstOrCOMPURATIONALCOEFFS;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??symbol?????
     * 
     * @return
     *     possible object is
     *     {@link CIDENTIFIER }
     *     
     */
    public CIDENTIFIER getSYMBOL() {
        return symbol;
    }

    /**
     * ??symbol?????
     * 
     * @param value
     *     allowed object is
     *     {@link CIDENTIFIER }
     *     
     */
    public void setSYMBOL(CIDENTIFIER value) {
        this.symbol = value;
    }

    /**
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??mask?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMASK() {
        return mask;
    }

    /**
     * ??mask?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMASK(POSITIVEINTEGER value) {
        this.mask = value;
    }

    /**
     * ??lowerlimit?????
     * 
     * @return
     *     possible object is
     *     {@link LIMIT }
     *     
     */
    public LIMIT getLOWERLIMIT() {
        return lowerlimit;
    }

    /**
     * ??lowerlimit?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIMIT }
     *     
     */
    public void setLOWERLIMIT(LIMIT value) {
        this.lowerlimit = value;
    }

    /**
     * ??upperlimit?????
     * 
     * @return
     *     possible object is
     *     {@link LIMIT }
     *     
     */
    public LIMIT getUPPERLIMIT() {
        return upperlimit;
    }

    /**
     * ??upperlimit?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIMIT }
     *     
     */
    public void setUPPERLIMIT(LIMIT value) {
        this.upperlimit = value;
    }

    /**
     * ??compuinversevalue?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUCONST }
     *     
     */
    public COMPUCONST getCOMPUINVERSEVALUE() {
        return compuinversevalue;
    }

    /**
     * ??compuinversevalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUCONST }
     *     
     */
    public void setCOMPUINVERSEVALUE(COMPUCONST value) {
        this.compuinversevalue = value;
    }

    /**
     * ??compuconstOrCOMPURATIONALCOEFFS?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUCONST }
     *     {@link COMPURATIONALCOEFFS }
     *     
     */
    public Object getCOMPUCONSTOrCOMPURATIONALCOEFFS() {
        return compuconstOrCOMPURATIONALCOEFFS;
    }

    /**
     * ??compuconstOrCOMPURATIONALCOEFFS?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUCONST }
     *     {@link COMPURATIONALCOEFFS }
     *     
     */
    public void setCOMPUCONSTOrCOMPURATIONALCOEFFS(Object value) {
        this.compuconstOrCOMPURATIONALCOEFFS = value;
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
