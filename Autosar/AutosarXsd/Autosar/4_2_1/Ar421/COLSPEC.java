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
import javax.xml.bind.annotation.XmlType;


/**
 * This meta-class represents the ability to specify the properties of a column in a  table.
 * 
 * <p>COLSPEC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COLSPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLSPEC"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}COLSPEC"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLSPEC")
public class COLSPEC {

    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "ALIGN")
    protected ALIGNENUMSIMPLE align;
    @XmlAttribute(name = "COLNAME")
    protected String colname;
    @XmlAttribute(name = "COLNUM")
    protected String colnum;
    @XmlAttribute(name = "COLSEP")
    protected String colsep;
    @XmlAttribute(name = "COLWIDTH")
    protected String colwidth;
    @XmlAttribute(name = "ROWSEP")
    protected String rowsep;

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
     * ??colnum?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLNUM() {
        return colnum;
    }

    /**
     * ??colnum?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLNUM(String value) {
        this.colnum = value;
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
     * ??colwidth?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLWIDTH() {
        return colwidth;
    }

    /**
     * ??colwidth?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLWIDTH(String value) {
        this.colwidth = value;
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

}
