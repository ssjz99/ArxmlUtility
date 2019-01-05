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
 * This meta-class represents the ability to denote a table section.
 * 
 * <p>TGROUP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TGROUP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TGROUP"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}TGROUP"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGROUP", propOrder = {
    "colspec",
    "thead",
    "tfoot",
    "tbody"
})
public class TGROUP {

    @XmlElement(name = "COLSPEC")
    protected List<COLSPEC> colspec;
    @XmlElement(name = "THEAD")
    protected TBODY thead;
    @XmlElement(name = "TFOOT")
    protected TBODY tfoot;
    @XmlElement(name = "TBODY")
    protected TBODY tbody;
    @XmlAttribute(name = "ALIGN")
    protected ALIGNENUMSIMPLE align;
    @XmlAttribute(name = "COLS")
    protected String cols;
    @XmlAttribute(name = "COLSEP")
    protected String colsep;
    @XmlAttribute(name = "ROWSEP")
    protected String rowsep;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the colspec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colspec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOLSPEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COLSPEC }
     * 
     * 
     */
    public List<COLSPEC> getCOLSPEC() {
        if (colspec == null) {
            colspec = new ArrayList<COLSPEC>();
        }
        return this.colspec;
    }

    /**
     * ??thead?????
     * 
     * @return
     *     possible object is
     *     {@link TBODY }
     *     
     */
    public TBODY getTHEAD() {
        return thead;
    }

    /**
     * ??thead?????
     * 
     * @param value
     *     allowed object is
     *     {@link TBODY }
     *     
     */
    public void setTHEAD(TBODY value) {
        this.thead = value;
    }

    /**
     * ??tfoot?????
     * 
     * @return
     *     possible object is
     *     {@link TBODY }
     *     
     */
    public TBODY getTFOOT() {
        return tfoot;
    }

    /**
     * ??tfoot?????
     * 
     * @param value
     *     allowed object is
     *     {@link TBODY }
     *     
     */
    public void setTFOOT(TBODY value) {
        this.tfoot = value;
    }

    /**
     * ??tbody?????
     * 
     * @return
     *     possible object is
     *     {@link TBODY }
     *     
     */
    public TBODY getTBODY() {
        return tbody;
    }

    /**
     * ??tbody?????
     * 
     * @param value
     *     allowed object is
     *     {@link TBODY }
     *     
     */
    public void setTBODY(TBODY value) {
        this.tbody = value;
    }

    /**
     * ??align?????
     * 
     * @return
     *     possible object is
     *     {@link ALIGNENUMSIMPLE }
     *     
     */
    public ALIGNENUMSIMPLE getALIGN() {
        return align;
    }

    /**
     * ??align?????
     * 
     * @param value
     *     allowed object is
     *     {@link ALIGNENUMSIMPLE }
     *     
     */
    public void setALIGN(ALIGNENUMSIMPLE value) {
        this.align = value;
    }

    /**
     * ??cols?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLS() {
        return cols;
    }

    /**
     * ??cols?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLS(String value) {
        this.cols = value;
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
