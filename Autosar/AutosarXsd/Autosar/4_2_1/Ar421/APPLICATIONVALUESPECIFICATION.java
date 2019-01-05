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
 * This meta-class represents values for DataPrototypes typed by ApplicationDataTypes (this includes in particular compound primitives). 
 * 
 * For further details refer to ASAM CDF 2.0. This meta-class corresponds to some extent with SW-INSTANCE in ASAM CDF 2.0.
 * 
 * <p>APPLICATION-VALUE-SPECIFICATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="APPLICATION-VALUE-SPECIFICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VALUE-SPECIFICATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}APPLICATION-VALUE-SPECIFICATION"/>
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
@XmlType(name = "APPLICATION-VALUE-SPECIFICATION", propOrder = {
    "shortlabel",
    "variationpoint",
    "category",
    "swaxisconts",
    "swvaluecont"
})
public class APPLICATIONVALUESPECIFICATION {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "CATEGORY")
    protected IDENTIFIER category;
    @XmlElement(name = "SW-AXIS-CONTS")
    protected APPLICATIONVALUESPECIFICATION.SWAXISCONTS swaxisconts;
    @XmlElement(name = "SW-VALUE-CONT")
    protected SWVALUECONT swvaluecont;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTLABEL(IDENTIFIER value) {
        this.shortlabel = value;
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
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setCATEGORY(IDENTIFIER value) {
        this.category = value;
    }

    /**
     * ??swaxisconts?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONVALUESPECIFICATION.SWAXISCONTS }
     *     
     */
    public APPLICATIONVALUESPECIFICATION.SWAXISCONTS getSWAXISCONTS() {
        return swaxisconts;
    }

    /**
     * ??swaxisconts?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONVALUESPECIFICATION.SWAXISCONTS }
     *     
     */
    public void setSWAXISCONTS(APPLICATIONVALUESPECIFICATION.SWAXISCONTS value) {
        this.swaxisconts = value;
    }

    /**
     * ??swvaluecont?????
     * 
     * @return
     *     possible object is
     *     {@link SWVALUECONT }
     *     
     */
    public SWVALUECONT getSWVALUECONT() {
        return swvaluecont;
    }

    /**
     * ??swvaluecont?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWVALUECONT }
     *     
     */
    public void setSWVALUECONT(SWVALUECONT value) {
        this.swvaluecont = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SW-AXIS-CONT" type="{http://autosar.org/schema/r4.0}SW-AXIS-CONT"/>
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
        "swaxiscont"
    })
    public static class SWAXISCONTS {

        @XmlElement(name = "SW-AXIS-CONT")
        protected List<SWAXISCONT> swaxiscont;

        /**
         * Gets the value of the swaxiscont property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swaxiscont property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWAXISCONT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWAXISCONT }
         * 
         * 
         */
        public List<SWAXISCONT> getSWAXISCONT() {
            if (swaxiscont == null) {
                swaxiscont = new ArrayList<SWAXISCONT>();
            }
            return this.swaxiscont;
        }

    }

}