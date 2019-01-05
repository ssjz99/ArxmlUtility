//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This class represents an artifact containing the image to be inserted in the document
 * 
 * <p>GRAPHIC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="GRAPHIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ENGINEERING-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GRAPHIC"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}GRAPHIC"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRAPHIC", propOrder = {
    "shortlabel",
    "category",
    "revisionlabels",
    "domain"
})
public class GRAPHIC {

    @XmlElement(name = "SHORT-LABEL")
    protected NMTOKENSTRING shortlabel;
    @XmlElement(name = "CATEGORY")
    protected NMTOKENSTRING category;
    @XmlElement(name = "REVISION-LABELS")
    protected GRAPHIC.REVISIONLABELS revisionlabels;
    @XmlElement(name = "DOMAIN")
    protected NMTOKENSTRING domain;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "EDIT-HEIGHT")
    protected String editheight;
    @XmlAttribute(name = "EDIT-WIDTH")
    protected String editwidth;
    @XmlAttribute(name = "EDITFIT")
    protected GRAPHICFITENUMSIMPLE editfit;
    @XmlAttribute(name = "EDITSCALE")
    protected String editscale;
    @XmlAttribute(name = "FILENAME")
    protected String filename;
    @XmlAttribute(name = "FIT")
    protected GRAPHICFITENUMSIMPLE fit;
    @XmlAttribute(name = "GENERATOR")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String generator;
    @XmlAttribute(name = "HEIGHT")
    protected String height;
    @XmlAttribute(name = "HTML-FIT")
    protected GRAPHICFITENUMSIMPLE htmlfit;
    @XmlAttribute(name = "HTML-HEIGHT")
    protected String htmlheight;
    @XmlAttribute(name = "HTML-SCALE")
    protected String htmlscale;
    @XmlAttribute(name = "HTML-WIDTH")
    protected String htmlwidth;
    @XmlAttribute(name = "NOTATION")
    protected GRAPHICNOTATIONENUMSIMPLE notation;
    @XmlAttribute(name = "SCALE")
    protected String scale;
    @XmlAttribute(name = "WIDTH")
    protected String width;

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
     *     {@link GRAPHIC.REVISIONLABELS }
     *     
     */
    public GRAPHIC.REVISIONLABELS getREVISIONLABELS() {
        return revisionlabels;
    }

    /**
     * ??revisionlabels?????
     * 
     * @param value
     *     allowed object is
     *     {@link GRAPHIC.REVISIONLABELS }
     *     
     */
    public void setREVISIONLABELS(GRAPHIC.REVISIONLABELS value) {
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

    /**
     * ??editheight?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDITHEIGHT() {
        return editheight;
    }

    /**
     * ??editheight?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDITHEIGHT(String value) {
        this.editheight = value;
    }

    /**
     * ??editwidth?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDITWIDTH() {
        return editwidth;
    }

    /**
     * ??editwidth?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDITWIDTH(String value) {
        this.editwidth = value;
    }

    /**
     * ??editfit?????
     * 
     * @return
     *     possible object is
     *     {@link GRAPHICFITENUMSIMPLE }
     *     
     */
    public GRAPHICFITENUMSIMPLE getEDITFIT() {
        return editfit;
    }

    /**
     * ??editfit?????
     * 
     * @param value
     *     allowed object is
     *     {@link GRAPHICFITENUMSIMPLE }
     *     
     */
    public void setEDITFIT(GRAPHICFITENUMSIMPLE value) {
        this.editfit = value;
    }

    /**
     * ??editscale?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDITSCALE() {
        return editscale;
    }

    /**
     * ??editscale?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDITSCALE(String value) {
        this.editscale = value;
    }

    /**
     * ??filename?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * ??filename?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * ??fit?????
     * 
     * @return
     *     possible object is
     *     {@link GRAPHICFITENUMSIMPLE }
     *     
     */
    public GRAPHICFITENUMSIMPLE getFIT() {
        return fit;
    }

    /**
     * ??fit?????
     * 
     * @param value
     *     allowed object is
     *     {@link GRAPHICFITENUMSIMPLE }
     *     
     */
    public void setFIT(GRAPHICFITENUMSIMPLE value) {
        this.fit = value;
    }

    /**
     * ??generator?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENERATOR() {
        return generator;
    }

    /**
     * ??generator?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENERATOR(String value) {
        this.generator = value;
    }

    /**
     * ??height?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEIGHT() {
        return height;
    }

    /**
     * ??height?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEIGHT(String value) {
        this.height = value;
    }

    /**
     * ??htmlfit?????
     * 
     * @return
     *     possible object is
     *     {@link GRAPHICFITENUMSIMPLE }
     *     
     */
    public GRAPHICFITENUMSIMPLE getHTMLFIT() {
        return htmlfit;
    }

    /**
     * ??htmlfit?????
     * 
     * @param value
     *     allowed object is
     *     {@link GRAPHICFITENUMSIMPLE }
     *     
     */
    public void setHTMLFIT(GRAPHICFITENUMSIMPLE value) {
        this.htmlfit = value;
    }

    /**
     * ??htmlheight?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLHEIGHT() {
        return htmlheight;
    }

    /**
     * ??htmlheight?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLHEIGHT(String value) {
        this.htmlheight = value;
    }

    /**
     * ??htmlscale?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLSCALE() {
        return htmlscale;
    }

    /**
     * ??htmlscale?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLSCALE(String value) {
        this.htmlscale = value;
    }

    /**
     * ??htmlwidth?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLWIDTH() {
        return htmlwidth;
    }

    /**
     * ??htmlwidth?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLWIDTH(String value) {
        this.htmlwidth = value;
    }

    /**
     * ??notation?????
     * 
     * @return
     *     possible object is
     *     {@link GRAPHICNOTATIONENUMSIMPLE }
     *     
     */
    public GRAPHICNOTATIONENUMSIMPLE getNOTATION() {
        return notation;
    }

    /**
     * ??notation?????
     * 
     * @param value
     *     allowed object is
     *     {@link GRAPHICNOTATIONENUMSIMPLE }
     *     
     */
    public void setNOTATION(GRAPHICNOTATIONENUMSIMPLE value) {
        this.notation = value;
    }

    /**
     * ??scale?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCALE() {
        return scale;
    }

    /**
     * ??scale?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCALE(String value) {
        this.scale = value;
    }

    /**
     * ??width?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWIDTH() {
        return width;
    }

    /**
     * ??width?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWIDTH(String value) {
        this.width = value;
    }


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="REVISION-LABEL" type="{http://autosar.org/schema/r4.0}REVISION-LABEL-STRING"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "revisionlabel"
    })
    public static class REVISIONLABELS {

        @XmlElement(name = "REVISION-LABEL")
        protected List<REVISIONLABELSTRING> revisionlabel;

        /**
         * Gets the value of the revisionlabel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the revisionlabel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREVISIONLABEL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REVISIONLABELSTRING }
         * 
         * 
         */
        public List<REVISIONLABELSTRING> getREVISIONLABEL() {
            if (revisionlabel == null) {
                revisionlabel = new ArrayList<REVISIONLABELSTRING>();
            }
            return this.revisionlabel;
        }

    }

}
