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


/**
 * This metaclass represents the ability to embed a figure.
 * 
 * <p>ML-FIGURE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ML-FIGURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ML-FIGURE"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}ML-FIGURE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ML-FIGURE", propOrder = {
    "figurecaption",
    "lgraphic",
    "verbatim",
    "variationpoint"
})
public class MLFIGURE {

    @XmlElement(name = "FIGURE-CAPTION")
    protected CAPTION figurecaption;
    @XmlElement(name = "L-GRAPHIC")
    protected List<LGRAPHIC> lgraphic;
    @XmlElement(name = "VERBATIM")
    protected MULTILANGUAGEVERBATIM verbatim;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "FRAME")
    protected FRAMEENUMSIMPLE frame;
    @XmlAttribute(name = "HELP-ENTRY")
    protected String helpentry;
    @XmlAttribute(name = "PGWIDE")
    protected PGWIDEENUMSIMPLE pgwide;
    @XmlAttribute(name = "BREAK")
    protected CHAPTERENUMBREAKSIMPLE _break;
    @XmlAttribute(name = "KEEP-WITH-PREVIOUS")
    protected KEEPWITHPREVIOUSENUMSIMPLE keepwithprevious;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "SI")
    protected List<String> si;
    @XmlAttribute(name = "VIEW")
    protected String view;

    /**
     * ??figurecaption?????
     * 
     * @return
     *     possible object is
     *     {@link CAPTION }
     *     
     */
    public CAPTION getFIGURECAPTION() {
        return figurecaption;
    }

    /**
     * ??figurecaption?????
     * 
     * @param value
     *     allowed object is
     *     {@link CAPTION }
     *     
     */
    public void setFIGURECAPTION(CAPTION value) {
        this.figurecaption = value;
    }

    /**
     * Gets the value of the lgraphic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lgraphic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLGRAPHIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LGRAPHIC }
     * 
     * 
     */
    public List<LGRAPHIC> getLGRAPHIC() {
        if (lgraphic == null) {
            lgraphic = new ArrayList<LGRAPHIC>();
        }
        return this.lgraphic;
    }

    /**
     * ??verbatim?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEVERBATIM }
     *     
     */
    public MULTILANGUAGEVERBATIM getVERBATIM() {
        return verbatim;
    }

    /**
     * ??verbatim?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEVERBATIM }
     *     
     */
    public void setVERBATIM(MULTILANGUAGEVERBATIM value) {
        this.verbatim = value;
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
     * ??frame?????
     * 
     * @return
     *     possible object is
     *     {@link FRAMEENUMSIMPLE }
     *     
     */
    public FRAMEENUMSIMPLE getFRAME() {
        return frame;
    }

    /**
     * ??frame?????
     * 
     * @param value
     *     allowed object is
     *     {@link FRAMEENUMSIMPLE }
     *     
     */
    public void setFRAME(FRAMEENUMSIMPLE value) {
        this.frame = value;
    }

    /**
     * ??helpentry?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHELPENTRY() {
        return helpentry;
    }

    /**
     * ??helpentry?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHELPENTRY(String value) {
        this.helpentry = value;
    }

    /**
     * ??pgwide?????
     * 
     * @return
     *     possible object is
     *     {@link PGWIDEENUMSIMPLE }
     *     
     */
    public PGWIDEENUMSIMPLE getPGWIDE() {
        return pgwide;
    }

    /**
     * ??pgwide?????
     * 
     * @param value
     *     allowed object is
     *     {@link PGWIDEENUMSIMPLE }
     *     
     */
    public void setPGWIDE(PGWIDEENUMSIMPLE value) {
        this.pgwide = value;
    }

    /**
     * ??break?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTERENUMBREAKSIMPLE }
     *     
     */
    public CHAPTERENUMBREAKSIMPLE getBREAK() {
        return _break;
    }

    /**
     * ??break?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTERENUMBREAKSIMPLE }
     *     
     */
    public void setBREAK(CHAPTERENUMBREAKSIMPLE value) {
        this._break = value;
    }

    /**
     * ??keepwithprevious?????
     * 
     * @return
     *     possible object is
     *     {@link KEEPWITHPREVIOUSENUMSIMPLE }
     *     
     */
    public KEEPWITHPREVIOUSENUMSIMPLE getKEEPWITHPREVIOUS() {
        return keepwithprevious;
    }

    /**
     * ??keepwithprevious?????
     * 
     * @param value
     *     allowed object is
     *     {@link KEEPWITHPREVIOUSENUMSIMPLE }
     *     
     */
    public void setKEEPWITHPREVIOUS(KEEPWITHPREVIOUSENUMSIMPLE value) {
        this.keepwithprevious = value;
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
     * Gets the value of the si property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the si property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSI() {
        if (si == null) {
            si = new ArrayList<String>();
        }
        return this.si;
    }

    /**
     * ??view?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIEW() {
        return view;
    }

    /**
     * ??view?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIEW(String value) {
        this.view = value;
    }

}
