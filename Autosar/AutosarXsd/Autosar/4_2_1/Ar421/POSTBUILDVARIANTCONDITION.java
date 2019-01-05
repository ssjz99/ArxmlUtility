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
 * This class specifies the value which must be assigned to a particular variant criterion in order to bind the variation point. If multiple criterion/value pairs are specified, they shall all match to bind the variation point.
 * 
 * In other words binding can be represented by
 * 
 *   (criterion1 == value1) &amp;&amp; (condition2 == value2) ...
 * 
 * <p>POST-BUILD-VARIANT-CONDITION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="POST-BUILD-VARIANT-CONDITION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CONDITION"/>
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
@XmlType(name = "POST-BUILD-VARIANT-CONDITION", propOrder = {
    "matchingcriterionref",
    "value"
})
public class POSTBUILDVARIANTCONDITION {

    @XmlElement(name = "MATCHING-CRITERION-REF")
    protected POSTBUILDVARIANTCONDITION.MATCHINGCRITERIONREF matchingcriterionref;
    @XmlElement(name = "VALUE")
    protected INTEGERVALUEVARIATIONPOINT value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??matchingcriterionref?????
     * 
     * @return
     *     possible object is
     *     {@link POSTBUILDVARIANTCONDITION.MATCHINGCRITERIONREF }
     *     
     */
    public POSTBUILDVARIANTCONDITION.MATCHINGCRITERIONREF getMATCHINGCRITERIONREF() {
        return matchingcriterionref;
    }

    /**
     * ??matchingcriterionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSTBUILDVARIANTCONDITION.MATCHINGCRITERIONREF }
     *     
     */
    public void setMATCHINGCRITERIONREF(POSTBUILDVARIANTCONDITION.MATCHINGCRITERIONREF value) {
        this.matchingcriterionref = value;
    }

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public INTEGERVALUEVARIATIONPOINT getVALUE() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setVALUE(INTEGERVALUEVARIATIONPOINT value) {
        this.value = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CRITERION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MATCHINGCRITERIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected POSTBUILDVARIANTCRITERIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link POSTBUILDVARIANTCRITERIONSUBTYPESENUM }
         *     
         */
        public POSTBUILDVARIANTCRITERIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link POSTBUILDVARIANTCRITERIONSUBTYPESENUM }
         *     
         */
        public void setDEST(POSTBUILDVARIANTCRITERIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
