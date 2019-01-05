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
 * This class implements an exchange table according to OASIS Technical Resolution TR 9503:1995.
 * 
 * http://www.oasis-open.org/specs/a503.htm
 * 
 * <p>TABLE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TABLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TABLE"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}TABLE"/>
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
@XmlType(name = "TABLE", propOrder = {
    "tablecaption",
    "tgroup",
    "variationpoint"
})
public class TABLE {

    @XmlElement(name = "TABLE-CAPTION")
    protected CAPTION tablecaption;
    @XmlElement(name = "TGROUP")
    protected List<TGROUP> tgroup;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "COLSEP")
    protected String colsep;
    @XmlAttribute(name = "FLOAT")
    protected FLOATENUMSIMPLE _float;
    @XmlAttribute(name = "FRAME")
    protected FRAMEENUMSIMPLE frame;
    @XmlAttribute(name = "HELP-ENTRY")
    protected String helpentry;
    @XmlAttribute(name = "ORIENT")
    protected ORIENTENUMSIMPLE orient;
    @XmlAttribute(name = "PGWIDE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pgwide;
    @XmlAttribute(name = "ROWSEP")
    protected String rowsep;
    @XmlAttribute(name = "TABSTYLE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tabstyle;
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
     * ??tablecaption?????
     * 
     * @return
     *     possible object is
     *     {@link CAPTION }
     *     
     */
    public CAPTION getTABLECAPTION() {
        return tablecaption;
    }

    /**
     * ??tablecaption?????
     * 
     * @param value
     *     allowed object is
     *     {@link CAPTION }
     *     
     */
    public void setTABLECAPTION(CAPTION value) {
        this.tablecaption = value;
    }

    /**
     * Gets the value of the tgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGROUP }
     * 
     * 
     */
    public List<TGROUP> getTGROUP() {
        if (tgroup == null) {
            tgroup = new ArrayList<TGROUP>();
        }
        return this.tgroup;
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
     * ??colsep?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLSEP() {
        return colsep;
    }

    /**
     * ??colsep?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLSEP(String value) {
        this.colsep = value;
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
     * ??orient?????
     * 
     * @return
     *     possible object is
     *     {@link ORIENTENUMSIMPLE }
     *     
     */
    public ORIENTENUMSIMPLE getORIENT() {
        return orient;
    }

    /**
     * ??orient?????
     * 
     * @param value
     *     allowed object is
     *     {@link ORIENTENUMSIMPLE }
     *     
     */
    public void setORIENT(ORIENTENUMSIMPLE value) {
        this.orient = value;
    }

    /**
     * ??pgwide?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGWIDE() {
        return pgwide;
    }

    /**
     * ??pgwide?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGWIDE(String value) {
        this.pgwide = value;
    }

    /**
     * ??rowsep?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROWSEP() {
        return rowsep;
    }

    /**
     * ??rowsep?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROWSEP(String value) {
        this.rowsep = value;
    }

    /**
     * ??tabstyle?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABSTYLE() {
        return tabstyle;
    }

    /**
     * ??tabstyle?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABSTYLE(String value) {
        this.tabstyle = value;
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
