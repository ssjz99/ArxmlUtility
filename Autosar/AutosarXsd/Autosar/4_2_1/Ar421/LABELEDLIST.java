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
 * This meta-class represents a labeled list, in which items have a label and a content. The policy how to render such items is specified in the labeled list.
 * 
 * <p>LABELED-LIST complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LABELED-LIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LABELED-LIST"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LABELED-LIST", propOrder = {
    "indentsample",
    "labeleditem",
    "variationpoint"
})
public class LABELEDLIST {

    @XmlElement(name = "INDENT-SAMPLE")
    protected INDENTSAMPLE indentsample;
    @XmlElement(name = "LABELED-ITEM")
    protected List<LABELEDITEM> labeleditem;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "BREAK")
    protected CHAPTERENUMBREAKSIMPLE _break;
    @XmlAttribute(name = "KEEP-WITH-PREVIOUS")
    protected KEEPWITHPREVIOUSENUMSIMPLE keepwithprevious;
    @XmlAttribute(name = "SI")
    protected List<String> si;
    @XmlAttribute(name = "VIEW")
    protected String view;

    /**
     * ??indentsample?????
     * 
     * @return
     *     possible object is
     *     {@link INDENTSAMPLE }
     *     
     */
    public INDENTSAMPLE getINDENTSAMPLE() {
        return indentsample;
    }

    /**
     * ??indentsample?????
     * 
     * @param value
     *     allowed object is
     *     {@link INDENTSAMPLE }
     *     
     */
    public void setINDENTSAMPLE(INDENTSAMPLE value) {
        this.indentsample = value;
    }

    /**
     * Gets the value of the labeleditem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labeleditem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLABELEDITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LABELEDITEM }
     * 
     * 
     */
    public List<LABELEDITEM> getLABELEDITEM() {
        if (labeleditem == null) {
            labeleditem = new ArrayList<LABELEDITEM>();
        }
        return this.labeleditem;
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
