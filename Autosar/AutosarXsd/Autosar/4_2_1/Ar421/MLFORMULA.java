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
 * This meta-class represents the ability to express a formula in a documentation. The formula can be expressed by various means. If more than one representation is available, they need to be consistent. The rendering system can use the representation which is most appropriate.
 * 
 * <p>ML-FORMULA complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ML-FORMULA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ML-FORMULA"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ML-FORMULA", propOrder = {
    "formulacaption",
    "lgraphic",
    "verbatim",
    "texmath",
    "genericmath",
    "variationpoint"
})
public class MLFORMULA {

    @XmlElement(name = "FORMULA-CAPTION")
    protected CAPTION formulacaption;
    @XmlElement(name = "L-GRAPHIC")
    protected List<LGRAPHIC> lgraphic;
    @XmlElement(name = "VERBATIM")
    protected MULTILANGUAGEVERBATIM verbatim;
    @XmlElement(name = "TEX-MATH")
    protected MULTILANGUAGEPLAINTEXT texmath;
    @XmlElement(name = "GENERIC-MATH")
    protected MULTILANGUAGEPLAINTEXT genericmath;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "SI")
    protected List<String> si;
    @XmlAttribute(name = "VIEW")
    protected String view;
    @XmlAttribute(name = "BREAK")
    protected CHAPTERENUMBREAKSIMPLE _break;
    @XmlAttribute(name = "KEEP-WITH-PREVIOUS")
    protected KEEPWITHPREVIOUSENUMSIMPLE keepwithprevious;

    /**
     * ??formulacaption?????
     * 
     * @return
     *     possible object is
     *     {@link CAPTION }
     *     
     */
    public CAPTION getFORMULACAPTION() {
        return formulacaption;
    }

    /**
     * ??formulacaption?????
     * 
     * @param value
     *     allowed object is
     *     {@link CAPTION }
     *     
     */
    public void setFORMULACAPTION(CAPTION value) {
        this.formulacaption = value;
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
     * ??texmath?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEPLAINTEXT }
     *     
     */
    public MULTILANGUAGEPLAINTEXT getTEXMATH() {
        return texmath;
    }

    /**
     * ??texmath?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEPLAINTEXT }
     *     
     */
    public void setTEXMATH(MULTILANGUAGEPLAINTEXT value) {
        this.texmath = value;
    }

    /**
     * ??genericmath?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEPLAINTEXT }
     *     
     */
    public MULTILANGUAGEPLAINTEXT getGENERICMATH() {
        return genericmath;
    }

    /**
     * ??genericmath?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEPLAINTEXT }
     *     
     */
    public void setGENERICMATH(MULTILANGUAGEPLAINTEXT value) {
        this.genericmath = value;
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

}