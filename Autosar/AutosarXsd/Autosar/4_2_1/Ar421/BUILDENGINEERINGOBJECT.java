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
 * This meta-class represents the ability to denote an artifact which is processed within a particular build action.
 * 
 * <p>BUILD-ENGINEERING-OBJECT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BUILD-ENGINEERING-OBJECT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ENGINEERING-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUILD-ENGINEERING-OBJECT"/>
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
@XmlType(name = "BUILD-ENGINEERING-OBJECT", propOrder = {
    "shortlabel",
    "category",
    "revisionlabels",
    "domain",
    "filetype",
    "intendedfilename",
    "parentcategory",
    "parentshortlabel",
    "shortlabelpattern",
    "filetypepattern"
})
public class BUILDENGINEERINGOBJECT {

    @XmlElement(name = "SHORT-LABEL")
    protected NMTOKENSTRING shortlabel;
    @XmlElement(name = "CATEGORY")
    protected NMTOKENSTRING category;
    @XmlElement(name = "REVISION-LABELS")
    protected Ar421.GRAPHIC.REVISIONLABELS revisionlabels;
    @XmlElement(name = "DOMAIN")
    protected NMTOKENSTRING domain;
    @XmlElement(name = "FILE-TYPE")
    protected NMTOKENSTRING filetype;
    @XmlElement(name = "INTENDED-FILENAME")
    protected URISTRING intendedfilename;
    @XmlElement(name = "PARENT-CATEGORY")
    protected NMTOKENSTRING parentcategory;
    @XmlElement(name = "PARENT-SHORT-LABEL")
    protected NMTOKENSTRING parentshortlabel;
    @XmlElement(name = "SHORT-LABEL-PATTERN")
    protected REGULAREXPRESSION shortlabelpattern;
    @XmlElement(name = "FILE-TYPE-PATTERN")
    protected REGULAREXPRESSION filetypepattern;
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
     * ??filetype?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getFILETYPE() {
        return filetype;
    }

    /**
     * ??filetype?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setFILETYPE(NMTOKENSTRING value) {
        this.filetype = value;
    }

    /**
     * ??intendedfilename?????
     * 
     * @return
     *     possible object is
     *     {@link URISTRING }
     *     
     */
    public URISTRING getINTENDEDFILENAME() {
        return intendedfilename;
    }

    /**
     * ??intendedfilename?????
     * 
     * @param value
     *     allowed object is
     *     {@link URISTRING }
     *     
     */
    public void setINTENDEDFILENAME(URISTRING value) {
        this.intendedfilename = value;
    }

    /**
     * ??parentcategory?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getPARENTCATEGORY() {
        return parentcategory;
    }

    /**
     * ??parentcategory?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setPARENTCATEGORY(NMTOKENSTRING value) {
        this.parentcategory = value;
    }

    /**
     * ??parentshortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getPARENTSHORTLABEL() {
        return parentshortlabel;
    }

    /**
     * ??parentshortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setPARENTSHORTLABEL(NMTOKENSTRING value) {
        this.parentshortlabel = value;
    }

    /**
     * ??shortlabelpattern?????
     * 
     * @return
     *     possible object is
     *     {@link REGULAREXPRESSION }
     *     
     */
    public REGULAREXPRESSION getSHORTLABELPATTERN() {
        return shortlabelpattern;
    }

    /**
     * ??shortlabelpattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link REGULAREXPRESSION }
     *     
     */
    public void setSHORTLABELPATTERN(REGULAREXPRESSION value) {
        this.shortlabelpattern = value;
    }

    /**
     * ??filetypepattern?????
     * 
     * @return
     *     possible object is
     *     {@link REGULAREXPRESSION }
     *     
     */
    public REGULAREXPRESSION getFILETYPEPATTERN() {
        return filetypepattern;
    }

    /**
     * ??filetypepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link REGULAREXPRESSION }
     *     
     */
    public void setFILETYPEPATTERN(REGULAREXPRESSION value) {
        this.filetypepattern = value;
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
