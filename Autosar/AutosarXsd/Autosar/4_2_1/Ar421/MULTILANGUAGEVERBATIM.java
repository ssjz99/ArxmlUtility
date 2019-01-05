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
 * This class represents multilingual Verbatim. Verbatim means, that white-space is maintained. When Verbatim is rendered in PDF or Online media, white-space is obeyed. Blanks are rendered as well as newline characters.
 * 
 * <p>MULTI-LANGUAGE-VERBATIM complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MULTI-LANGUAGE-VERBATIM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTI-LANGUAGE-VERBATIM"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}MULTI-LANGUAGE-VERBATIM"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MULTI-LANGUAGE-VERBATIM", propOrder = {
    "l5",
    "variationpoint"
})
public class MULTILANGUAGEVERBATIM {

    @XmlElement(name = "L-5")
    protected List<LVERBATIM> l5;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "ALLOW-BREAK")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowbreak;
    @XmlAttribute(name = "FLOAT")
    protected FLOATENUMSIMPLE _float;
    @XmlAttribute(name = "HELP-ENTRY")
    protected String helpentry;
    @XmlAttribute(name = "PGWIDE")
    protected PGWIDEENUMSIMPLE pgwide;
    @XmlAttribute(name = "SI")
    protected List<String> si;
    @XmlAttribute(name = "VIEW")
    protected String view;
    @XmlAttribute(name = "BREAK")
    protected CHAPTERENUMBREAKSIMPLE _break;
    @XmlAttribute(name = "KEEP-WITH-PREVIOUS")
    protected KEEPWITHPREVIOUSENUMSIMPLE keepwithprevious;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the l5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LVERBATIM }
     * 
     * 
     */
    public List<LVERBATIM> getL5() {
        if (l5 == null) {
            l5 = new ArrayList<LVERBATIM>();
        }
        return this.l5;
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
     * ??allowbreak?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWBREAK() {
        return allowbreak;
    }

    /**
     * ??allowbreak?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWBREAK(String value) {
        this.allowbreak = value;
    }

    /**
     * ??float?????
     * 
     * @return
     *     possible object is
     *     {@link FLOATENUMSIMPLE }
     *     
     */
    public FLOATENUMSIMPLE getFLOAT() {
        return _float;
    }

    /**
     * ??float?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOATENUMSIMPLE }
     *     
     */
    public void setFLOAT(FLOATENUMSIMPLE value) {
        this._float = value;
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
