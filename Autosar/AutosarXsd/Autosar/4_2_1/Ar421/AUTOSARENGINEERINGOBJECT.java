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
 * This denotes an engineering object being part of the process. It is a specialization of the abstract class EngineeringObject for usage within AUTOSAR.
 * 
 * <p>AUTOSAR-ENGINEERING-OBJECT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="AUTOSAR-ENGINEERING-OBJECT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ENGINEERING-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AUTOSAR-ENGINEERING-OBJECT"/>
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
@XmlType(name = "AUTOSAR-ENGINEERING-OBJECT", propOrder = {
    "shortlabel",
    "category",
    "revisionlabels",
    "domain"
})
public class AUTOSARENGINEERINGOBJECT {

    @XmlElement(name = "SHORT-LABEL")
    protected NMTOKENSTRING shortlabel;
    @XmlElement(name = "CATEGORY")
    protected NMTOKENSTRING category;
    @XmlElement(name = "REVISION-LABELS")
    protected Ar421.GRAPHIC.REVISIONLABELS revisionlabels;
    @XmlElement(name = "DOMAIN")
    protected NMTOKENSTRING domain;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setSHORTLABEL(NMTOKENSTRING value) {
        this.shortlabel = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setCATEGORY(NMTOKENSTRING value) {
        this.category = value;
    }

    /**
     * ??revisionlabels?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.GRAPHIC.REVISIONLABELS }
     *     
     */
    public Ar421.GRAPHIC.REVISIONLABELS getREVISIONLABELS() {
        return revisionlabels;
    }

    /**
     * ??revisionlabels?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.GRAPHIC.REVISIONLABELS }
     *     
     */
    public void setREVISIONLABELS(Ar421.GRAPHIC.REVISIONLABELS value) {
        this.revisionlabels = value;
    }

    /**
     * ??domain?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getDOMAIN() {
        return domain;
    }

    /**
     * ??domain?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setDOMAIN(NMTOKENSTRING value) {
        this.domain = value;
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
