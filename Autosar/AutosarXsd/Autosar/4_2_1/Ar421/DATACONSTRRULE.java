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
 * This meta-class represents the ability to express one specific data constraint rule.
 * 
 * <p>DATA-CONSTR-RULE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DATA-CONSTR-RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-CONSTR-RULE"/>
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
@XmlType(name = "DATA-CONSTR-RULE", propOrder = {
    "constrlevel",
    "physconstrs",
    "internalconstrs"
})
public class DATACONSTRRULE {

    @XmlElement(name = "CONSTR-LEVEL")
    protected INTEGER constrlevel;
    @XmlElement(name = "PHYS-CONSTRS")
    protected PHYSCONSTRS physconstrs;
    @XmlElement(name = "INTERNAL-CONSTRS")
    protected INTERNALCONSTRS internalconstrs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??constrlevel?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCONSTRLEVEL() {
        return constrlevel;
    }

    /**
     * ??constrlevel?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCONSTRLEVEL(INTEGER value) {
        this.constrlevel = value;
    }

    /**
     * ??physconstrs?????
     * 
     * @return
     *     possible object is
     *     {@link PHYSCONSTRS }
     *     
     */
    public PHYSCONSTRS getPHYSCONSTRS() {
        return physconstrs;
    }

    /**
     * ??physconstrs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PHYSCONSTRS }
     *     
     */
    public void setPHYSCONSTRS(PHYSCONSTRS value) {
        this.physconstrs = value;
    }

    /**
     * ??internalconstrs?????
     * 
     * @return
     *     possible object is
     *     {@link INTERNALCONSTRS }
     *     
     */
    public INTERNALCONSTRS getINTERNALCONSTRS() {
        return internalconstrs;
    }

    /**
     * ??internalconstrs?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTERNALCONSTRS }
     *     
     */
    public void setINTERNALCONSTRS(INTERNALCONSTRS value) {
        this.internalconstrs = value;
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
