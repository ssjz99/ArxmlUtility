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
 * This meta-class represents the ability to specify constraints as a list of intervals (called scales).
 * 
 * <p>SCALE-CONSTR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SCALE-CONSTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SCALE-CONSTR"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}SCALE-CONSTR"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCALE-CONSTR", propOrder = {
    "shortlabel",
    "desc",
    "lowerlimit",
    "upperlimit"
})
public class SCALECONSTR {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "LOWER-LIMIT")
    protected LIMIT lowerlimit;
    @XmlElement(name = "UPPER-LIMIT")
    protected LIMIT upperlimit;
    @XmlAttribute(name = "VALIDITY")
    protected SCALECONSTRVALIDITYENUMSIMPLE validity;
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
     * ??validity?????
     * 
     * @return
     *     possible object is
     *     {@link SCALECONSTRVALIDITYENUMSIMPLE }
     *     
     */
    public SCALECONSTRVALIDITYENUMSIMPLE getVALIDITY() {
        return validity;
    }

    /**
     * ??validity?????
     * 
     * @param value
     *     allowed object is
     *     {@link SCALECONSTRVALIDITYENUMSIMPLE }
     *     
     */
    public void setVALIDITY(SCALECONSTRVALIDITYENUMSIMPLE value) {
        this.validity = value;
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
