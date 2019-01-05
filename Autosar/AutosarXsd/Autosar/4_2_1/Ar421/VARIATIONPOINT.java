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
 * This meta-class represents the ability to express a "structural variation point". The container of the variation point is part of the selected variant if swSyscond evaluates to true and each postBuildVariantCriterion is fulfilled.
 * 
 * <p>VARIATION-POINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="VARIATION-POINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VARIATION-POINT"/>
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
@XmlType(name = "VARIATION-POINT", propOrder = {
    "shortlabel",
    "desc",
    "blueprintcondition",
    "formalblueprintcondition",
    "swsyscond",
    "postbuildvariantconditions",
    "sdg"
})
public class VARIATIONPOINT {

    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "BLUEPRINT-CONDITION")
    protected DOCUMENTATIONBLOCK blueprintcondition;
    @XmlElement(name = "FORMAL-BLUEPRINT-CONDITION")
    protected BLUEPRINTFORMULA formalblueprintcondition;
    @XmlElement(name = "SW-SYSCOND")
    protected CONDITIONBYFORMULA swsyscond;
    @XmlElement(name = "POST-BUILD-VARIANT-CONDITIONS")
    protected VARIATIONPOINT.POSTBUILDVARIANTCONDITIONS postbuildvariantconditions;
    @XmlElement(name = "SDG")
    protected SDG sdg;
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
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??blueprintcondition?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getBLUEPRINTCONDITION() {
        return blueprintcondition;
    }

    /**
     * ??blueprintcondition?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setBLUEPRINTCONDITION(DOCUMENTATIONBLOCK value) {
        this.blueprintcondition = value;
    }

    /**
     * ??formalblueprintcondition?????
     * 
     * @return
     *     possible object is
     *     {@link BLUEPRINTFORMULA }
     *     
     */
    public BLUEPRINTFORMULA getFORMALBLUEPRINTCONDITION() {
        return formalblueprintcondition;
    }

    /**
     * ??formalblueprintcondition?????
     * 
     * @param value
     *     allowed object is
     *     {@link BLUEPRINTFORMULA }
     *     
     */
    public void setFORMALBLUEPRINTCONDITION(BLUEPRINTFORMULA value) {
        this.formalblueprintcondition = value;
    }

    /**
     * ??swsyscond?????
     * 
     * @return
     *     possible object is
     *     {@link CONDITIONBYFORMULA }
     *     
     */
    public CONDITIONBYFORMULA getSWSYSCOND() {
        return swsyscond;
    }

    /**
     * ??swsyscond?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONDITIONBYFORMULA }
     *     
     */
    public void setSWSYSCOND(CONDITIONBYFORMULA value) {
        this.swsyscond = value;
    }

    /**
     * ??postbuildvariantconditions?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT.POSTBUILDVARIANTCONDITIONS }
     *     
     */
    public VARIATIONPOINT.POSTBUILDVARIANTCONDITIONS getPOSTBUILDVARIANTCONDITIONS() {
        return postbuildvariantconditions;
    }

    /**
     * ??postbuildvariantconditions?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT.POSTBUILDVARIANTCONDITIONS }
     *     
     */
    public void setPOSTBUILDVARIANTCONDITIONS(VARIATIONPOINT.POSTBUILDVARIANTCONDITIONS value) {
        this.postbuildvariantconditions = value;
    }

    /**
     * ??sdg?????
     * 
     * @return
     *     possible object is
     *     {@link SDG }
     *     
     */
    public SDG getSDG() {
        return sdg;
    }

    /**
     * ??sdg?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDG }
     *     
     */
    public void setSDG(SDG value) {
        this.sdg = value;
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
     *         &lt;element name="POST-BUILD-VARIANT-CONDITION" type="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CONDITION"/>
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
        "postbuildvariantcondition"
    })
    public static class POSTBUILDVARIANTCONDITIONS {

        @XmlElement(name = "POST-BUILD-VARIANT-CONDITION")
        protected List<POSTBUILDVARIANTCONDITION> postbuildvariantcondition;

        /**
         * Gets the value of the postbuildvariantcondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the postbuildvariantcondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOSTBUILDVARIANTCONDITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link POSTBUILDVARIANTCONDITION }
         * 
         * 
         */
        public List<POSTBUILDVARIANTCONDITION> getPOSTBUILDVARIANTCONDITION() {
            if (postbuildvariantcondition == null) {
                postbuildvariantcondition = new ArrayList<POSTBUILDVARIANTCONDITION>();
            }
            return this.postbuildvariantcondition;
        }

    }

}
