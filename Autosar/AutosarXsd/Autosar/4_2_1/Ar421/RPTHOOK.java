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
 * This meta class provide the ability to describe a rapid prototyping hook. This can either be described by an other AUTOSAR system with the category RPT_SYSTEM or as a non AUTOSAR software.
 * 
 * <p>RPT-HOOK complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RPT-HOOK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RPT-HOOK"/>
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
@XmlType(name = "RPT-HOOK", propOrder = {
    "codelabel",
    "mcdidentifier",
    "rptarhookiref",
    "sdgs",
    "variationpoint"
})
public class RPTHOOK {

    @XmlElement(name = "CODE-LABEL")
    protected CIDENTIFIER codelabel;
    @XmlElement(name = "MCD-IDENTIFIER")
    protected NMTOKENSTRING mcdidentifier;
    @XmlElement(name = "RPT-AR-HOOK-IREF")
    protected ANYINSTANCEREF rptarhookiref;
    @XmlElement(name = "SDGS")
    protected RPTHOOK.SDGS sdgs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??codelabel?????
     * 
     * @return
     *     possible object is
     *     {@link CIDENTIFIER }
     *     
     */
    public CIDENTIFIER getCODELABEL() {
        return codelabel;
    }

    /**
     * ??codelabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link CIDENTIFIER }
     *     
     */
    public void setCODELABEL(CIDENTIFIER value) {
        this.codelabel = value;
    }

    /**
     * ??mcdidentifier?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getMCDIDENTIFIER() {
        return mcdidentifier;
    }

    /**
     * ??mcdidentifier?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setMCDIDENTIFIER(NMTOKENSTRING value) {
        this.mcdidentifier = value;
    }

    /**
     * ??rptarhookiref?????
     * 
     * @return
     *     possible object is
     *     {@link ANYINSTANCEREF }
     *     
     */
    public ANYINSTANCEREF getRPTARHOOKIREF() {
        return rptarhookiref;
    }

    /**
     * ??rptarhookiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ANYINSTANCEREF }
     *     
     */
    public void setRPTARHOOKIREF(ANYINSTANCEREF value) {
        this.rptarhookiref = value;
    }

    /**
     * ??sdgs?????
     * 
     * @return
     *     possible object is
     *     {@link RPTHOOK.SDGS }
     *     
     */
    public RPTHOOK.SDGS getSDGS() {
        return sdgs;
    }

    /**
     * ??sdgs?????
     * 
     * @param value
     *     allowed object is
     *     {@link RPTHOOK.SDGS }
     *     
     */
    public void setSDGS(RPTHOOK.SDGS value) {
        this.sdgs = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SDG" type="{http://autosar.org/schema/r4.0}SDG"/>
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
        "sdg"
    })
    public static class SDGS {

        @XmlElement(name = "SDG")
        protected List<SDG> sdg;

        /**
         * Gets the value of the sdg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sdg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSDG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SDG }
         * 
         * 
         */
        public List<SDG> getSDG() {
            if (sdg == null) {
                sdg = new ArrayList<SDG>();
            }
            return this.sdg;
        }

    }

}
