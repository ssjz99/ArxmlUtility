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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This represents one particular table cell.
 * 
 * <p>ENTRY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ENTRY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ENTRY"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}ENTRY"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTRY", propOrder = {
    "pOrVERBATIMOrLIST"
})
public class ENTRY {

    @XmlElements({
        @XmlElement(name = "P", type = MULTILANGUAGEPARAGRAPH.class),
        @XmlElement(name = "VERBATIM", type = MULTILANGUAGEVERBATIM.class),
        @XmlElement(name = "LIST", type = LIST.class),
        @XmlElement(name = "DEF-LIST", type = DEFLIST.class),
        @XmlElement(name = "LABELED-LIST", type = LABELEDLIST.class),
        @XmlElement(name = "FORMULA", type = MLFORMULA.class),
        @XmlElement(name = "FIGURE", type = MLFIGURE.class),
        @XmlElement(name = "NOTE", type = NOTE.class),
        @XmlElement(name = "TRACE", type = TRACEABLETEXT.class),
        @XmlElement(name = "STRUCTURED-REQ", type = STRUCTUREDREQ.class)
    })
    protected List<Object> pOrVERBATIMOrLIST;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "ALIGN")
    protected ALIGNENUMSIMPLE align;
    @XmlAttribute(name = "COLNAME")
    protected String colname;
    @XmlAttribute(name = "COLSEP")
    protected String colsep;
    @XmlAttribute(name = "MOREROWS")
    protected String morerows;
    @XmlAttribute(name = "NAMEEND")
    protected String nameend;
    @XmlAttribute(name = "NAMEST")
    protected String namest;
    @XmlAttribute(name = "ROTATE")
    protected String rotate;
    @XmlAttribute(name = "ROWSEP")
    protected String rowsep;
    @XmlAttribute(name = "SPANNAME")
    protected String spanname;
    @XmlAttribute(name = "VALIGN")
    protected VALIGNENUMSIMPLE valign;

    /**
     * Gets the value of the pOrVERBATIMOrLIST property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrVERBATIMOrLIST property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrVERBATIMOrLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MULTILANGUAGEPARAGRAPH }
     * {@link MULTILANGUAGEVERBATIM }
     * {@link LIST }
     * {@link DEFLIST }
     * {@link LABELEDLIST }
     * {@link MLFORMULA }
     * {@link MLFIGURE }
     * {@link NOTE }
     * {@link TRACEABLETEXT }
     * {@link STRUCTUREDREQ }
     * 
     * 
     */
    public List<Object> getPOrVERBATIMOrLIST() {
        if (pOrVERBATIMOrLIST == null) {
            pOrVERBATIMOrLIST = new ArrayList<Object>();
        }
        return this.pOrVERBATIMOrLIST;
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
     * ??colname?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLNAME() {
        return colname;
    }

    /**
     * ??colname?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLNAME(String value) {
        this.colname = value;
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
     * ??morerows?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOREROWS() {
        return morerows;
    }

    /**
     * ??morerows?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOREROWS(String value) {
        this.morerows = value;
    }

    /**
     * ??nameend?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEEND() {
        return nameend;
    }

    /**
     * ??nameend?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEEND(String value) {
        this.nameend = value;
    }

    /**
     * ??namest?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEST() {
        return namest;
    }

    /**
     * ??namest?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEST(String value) {
        this.namest = value;
    }

    /**
     * ??rotate?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROTATE() {
        return rotate;
    }

    /**
     * ??rotate?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROTATE(String value) {
        this.rotate = value;
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
     * ??spanname?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPANNAME() {
        return spanname;
    }

    /**
     * ??spanname?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPANNAME(String value) {
        this.spanname = value;
    }

    /**
     * ??valign?????
     * 
     * @return
     *     possible object is
     *     {@link VALIGNENUMSIMPLE }
     *     
     */
    public VALIGNENUMSIMPLE getVALIGN() {
        return valign;
    }

    /**
     * ??valign?????
     * 
     * @param value
     *     allowed object is
     *     {@link VALIGNENUMSIMPLE }
     *     
     */
    public void setVALIGN(VALIGNENUMSIMPLE value) {
        this.valign = value;
    }

}
