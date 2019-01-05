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
 * This class specifies a the value which must be assigned to a particular variant criterion in order to bind the variation point. If multiple criterion/value pairs are specified, they all must must match to bind the variation point.
 * 
 * <p>POST-BUILD-VARIANT-CRITERION-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="POST-BUILD-VARIANT-CRITERION-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CRITERION-VALUE"/>
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
@XmlType(name = "POST-BUILD-VARIANT-CRITERION-VALUE", propOrder = {
    "variantcriterionref",
    "value",
    "annotations"
})
public class POSTBUILDVARIANTCRITERIONVALUE {

    @XmlElement(name = "VARIANT-CRITERION-REF")
    protected POSTBUILDVARIANTCRITERIONVALUE.VARIANTCRITERIONREF variantcriterionref;
    @XmlElement(name = "VALUE")
    protected INTEGERVALUEVARIATIONPOINT value;
    @XmlElement(name = "ANNOTATIONS")
    protected POSTBUILDVARIANTCRITERIONVALUE.ANNOTATIONS annotations;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??variantcriterionref?????
     * 
     * @return
     *     possible object is
     *     {@link POSTBUILDVARIANTCRITERIONVALUE.VARIANTCRITERIONREF }
     *     
     */
    public POSTBUILDVARIANTCRITERIONVALUE.VARIANTCRITERIONREF getVARIANTCRITERIONREF() {
        return variantcriterionref;
    }

    /**
     * ??variantcriterionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSTBUILDVARIANTCRITERIONVALUE.VARIANTCRITERIONREF }
     *     
     */
    public void setVARIANTCRITERIONREF(POSTBUILDVARIANTCRITERIONVALUE.VARIANTCRITERIONREF value) {
        this.variantcriterionref = value;
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
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link POSTBUILDVARIANTCRITERIONVALUE.ANNOTATIONS }
     *     
     */
    public POSTBUILDVARIANTCRITERIONVALUE.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSTBUILDVARIANTCRITERIONVALUE.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(POSTBUILDVARIANTCRITERIONVALUE.ANNOTATIONS value) {
        this.annotations = value;
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
     *         &lt;element name="ANNOTATION" type="{http://autosar.org/schema/r4.0}ANNOTATION"/>
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
        "annotation"
    })
    public static class ANNOTATIONS {

        @XmlElement(name = "ANNOTATION")
        protected List<ANNOTATION> annotation;

        /**
         * Gets the value of the annotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANNOTATION }
         * 
         * 
         */
        public List<ANNOTATION> getANNOTATION() {
            if (annotation == null) {
                annotation = new ArrayList<ANNOTATION>();
            }
            return this.annotation;
        }

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
    public static class VARIANTCRITERIONREF
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
