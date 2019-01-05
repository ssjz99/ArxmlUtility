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
 * A FMFeatureDecomposition describes dependencies between a list of
 * features and their parent feature (i.e., the FMFeature that
 * aggregates the FMFeatureDecomposition). The kind of dependency is
 * defined by the attribute category.
 * 
 * <p>FM-FEATURE-DECOMPOSITION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FM-FEATURE-DECOMPOSITION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FM-FEATURE-DECOMPOSITION"/>
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
@XmlType(name = "FM-FEATURE-DECOMPOSITION", propOrder = {
    "category",
    "featurerefs",
    "max",
    "min"
})
public class FMFEATUREDECOMPOSITION {

    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "FEATURE-REFS")
    protected FMFEATUREDECOMPOSITION.FEATUREREFS featurerefs;
    @XmlElement(name = "MAX")
    protected POSITIVEINTEGER max;
    @XmlElement(name = "MIN")
    protected POSITIVEINTEGER min;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public CATEGORYSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public void setCATEGORY(CATEGORYSTRING value) {
        this.category = value;
    }

    /**
     * ??featurerefs?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATUREDECOMPOSITION.FEATUREREFS }
     *     
     */
    public FMFEATUREDECOMPOSITION.FEATUREREFS getFEATUREREFS() {
        return featurerefs;
    }

    /**
     * ??featurerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATUREDECOMPOSITION.FEATUREREFS }
     *     
     */
    public void setFEATUREREFS(FMFEATUREDECOMPOSITION.FEATUREREFS value) {
        this.featurerefs = value;
    }

    /**
     * ??max?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAX() {
        return max;
    }

    /**
     * ??max?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAX(POSITIVEINTEGER value) {
        this.max = value;
    }

    /**
     * ??min?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMIN() {
        return min;
    }

    /**
     * ??min?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMIN(POSITIVEINTEGER value) {
        this.min = value;
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
     *         &lt;element name="FEATURE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FM-FEATURE--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "featureref"
    })
    public static class FEATUREREFS {

        @XmlElement(name = "FEATURE-REF")
        protected List<FMFEATUREDECOMPOSITION.FEATUREREFS.FEATUREREF> featureref;

        /**
         * Gets the value of the featureref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFEATUREREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FMFEATUREDECOMPOSITION.FEATUREREFS.FEATUREREF }
         * 
         * 
         */
        public List<FMFEATUREDECOMPOSITION.FEATUREREFS.FEATUREREF> getFEATUREREF() {
            if (featureref == null) {
                featureref = new ArrayList<FMFEATUREDECOMPOSITION.FEATUREREFS.FEATUREREF>();
            }
            return this.featureref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FM-FEATURE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FEATUREREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected FMFEATURESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link FMFEATURESUBTYPESENUM }
             *     
             */
            public FMFEATURESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link FMFEATURESUBTYPESENUM }
             *     
             */
            public void setDEST(FMFEATURESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
