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
 * This meta class represents the ability to express if a set of ARElements is able to support one or more particular variants.
 * 
 * In other words, for a given set of evaluatedElements this meta class represents a table of evaluated variants, where each PredefinedVariant represents one column. In this column each descendant swSystemconstantValue resp. postbuildVariantCriterionValue represents one entry.
 * 
 * In a graphical representation each swSystemconstantValueSet / postBuildVariantCriterionValueSet could be used as an intermediate headline in the table column.
 * 
 * If the approvalStatus is "APPROVED" it expresses that the collection of CollectableElements is known be valid for the given evaluatedVariants.
 * 
 * Note that the EvaluatedVariantSet is a CollectableElement. This allows to establish a hierarchy of EvaluatedVariantSets.
 * 
 * <p>EVALUATED-VARIANT-SET complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EVALUATED-VARIANT-SET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EVALUATED-VARIANT-SET"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVALUATED-VARIANT-SET", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "approvalstatus",
    "evaluatedelementrefs",
    "evaluatedvariantrefs"
})
public class EVALUATEDVARIANTSET {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "APPROVAL-STATUS")
    protected NMTOKENSTRING approvalstatus;
    @XmlElement(name = "EVALUATED-ELEMENT-REFS")
    protected EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS evaluatedelementrefs;
    @XmlElement(name = "EVALUATED-VARIANT-REFS")
    protected EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS evaluatedvariantrefs;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
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
     * ??admindata?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA }
     *     
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * ??admindata?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA }
     *     
     */
    public void setADMINDATA(ADMINDATA value) {
        this.admindata = value;
    }

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
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
     * ??approvalstatus?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getAPPROVALSTATUS() {
        return approvalstatus;
    }

    /**
     * ??approvalstatus?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setAPPROVALSTATUS(NMTOKENSTRING value) {
        this.approvalstatus = value;
    }

    /**
     * ??evaluatedelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS }
     *     
     */
    public EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS getEVALUATEDELEMENTREFS() {
        return evaluatedelementrefs;
    }

    /**
     * ??evaluatedelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS }
     *     
     */
    public void setEVALUATEDELEMENTREFS(EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS value) {
        this.evaluatedelementrefs = value;
    }

    /**
     * ??evaluatedvariantrefs?????
     * 
     * @return
     *     possible object is
     *     {@link EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS }
     *     
     */
    public EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS getEVALUATEDVARIANTREFS() {
        return evaluatedvariantrefs;
    }

    /**
     * ??evaluatedvariantrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS }
     *     
     */
    public void setEVALUATEDVARIANTREFS(EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS value) {
        this.evaluatedvariantrefs = value;
    }

    /**
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *         &lt;element name="EVALUATED-ELEMENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT--SUBTYPES-ENUM" />
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
        "evaluatedelementref"
    })
    public static class EVALUATEDELEMENTREFS {

        @XmlElement(name = "EVALUATED-ELEMENT-REF")
        protected List<EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS.EVALUATEDELEMENTREF> evaluatedelementref;

        /**
         * Gets the value of the evaluatedelementref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evaluatedelementref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEVALUATEDELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS.EVALUATEDELEMENTREF }
         * 
         * 
         */
        public List<EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS.EVALUATEDELEMENTREF> getEVALUATEDELEMENTREF() {
            if (evaluatedelementref == null) {
                evaluatedelementref = new ArrayList<EVALUATEDVARIANTSET.EVALUATEDELEMENTREFS.EVALUATEDELEMENTREF>();
            }
            return this.evaluatedelementref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EVALUATEDELEMENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected COLLECTABLEELEMENTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link COLLECTABLEELEMENTSUBTYPESENUM }
             *     
             */
            public COLLECTABLEELEMENTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link COLLECTABLEELEMENTSUBTYPESENUM }
             *     
             */
            public void setDEST(COLLECTABLEELEMENTSUBTYPESENUM value) {
                this.dest = value;
            }

        }

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
     *         &lt;element name="EVALUATED-VARIANT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PREDEFINED-VARIANT--SUBTYPES-ENUM" />
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
        "evaluatedvariantref"
    })
    public static class EVALUATEDVARIANTREFS {

        @XmlElement(name = "EVALUATED-VARIANT-REF")
        protected List<EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS.EVALUATEDVARIANTREF> evaluatedvariantref;

        /**
         * Gets the value of the evaluatedvariantref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evaluatedvariantref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEVALUATEDVARIANTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS.EVALUATEDVARIANTREF }
         * 
         * 
         */
        public List<EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS.EVALUATEDVARIANTREF> getEVALUATEDVARIANTREF() {
            if (evaluatedvariantref == null) {
                evaluatedvariantref = new ArrayList<EVALUATEDVARIANTSET.EVALUATEDVARIANTREFS.EVALUATEDVARIANTREF>();
            }
            return this.evaluatedvariantref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PREDEFINED-VARIANT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EVALUATEDVARIANTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected PREDEFINEDVARIANTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link PREDEFINEDVARIANTSUBTYPESENUM }
             *     
             */
            public PREDEFINEDVARIANTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link PREDEFINEDVARIANTSUBTYPESENUM }
             *     
             */
            public void setDEST(PREDEFINEDVARIANTSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
