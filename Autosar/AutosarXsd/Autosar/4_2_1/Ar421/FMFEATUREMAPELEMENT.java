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
 * Defines value sets for system constants and postbuild variant
 * criterions that shall be chosen whenever a certain combination
 * of features (and system constants) is encountered.
 * 
 * <p>FM-FEATURE-MAP-ELEMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FM-FEATURE-MAP-ELEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FM-FEATURE-MAP-ELEMENT"/>
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
@XmlType(name = "FM-FEATURE-MAP-ELEMENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "assertions",
    "conditions",
    "postbuildvariantcriterionvaluesetrefs",
    "swsystemconstantvaluesetrefs"
})
public class FMFEATUREMAPELEMENT {

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
    @XmlElement(name = "ASSERTIONS")
    protected FMFEATUREMAPELEMENT.ASSERTIONS assertions;
    @XmlElement(name = "CONDITIONS")
    protected FMFEATUREMAPELEMENT.CONDITIONS conditions;
    @XmlElement(name = "POST-BUILD-VARIANT-CRITERION-VALUE-SET-REFS")
    protected FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS postbuildvariantcriterionvaluesetrefs;
    @XmlElement(name = "SW-SYSTEMCONSTANT-VALUE-SET-REFS")
    protected FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS swsystemconstantvaluesetrefs;
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
     * ??assertions?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATUREMAPELEMENT.ASSERTIONS }
     *     
     */
    public FMFEATUREMAPELEMENT.ASSERTIONS getASSERTIONS() {
        return assertions;
    }

    /**
     * ??assertions?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATUREMAPELEMENT.ASSERTIONS }
     *     
     */
    public void setASSERTIONS(FMFEATUREMAPELEMENT.ASSERTIONS value) {
        this.assertions = value;
    }

    /**
     * ??conditions?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATUREMAPELEMENT.CONDITIONS }
     *     
     */
    public FMFEATUREMAPELEMENT.CONDITIONS getCONDITIONS() {
        return conditions;
    }

    /**
     * ??conditions?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATUREMAPELEMENT.CONDITIONS }
     *     
     */
    public void setCONDITIONS(FMFEATUREMAPELEMENT.CONDITIONS value) {
        this.conditions = value;
    }

    /**
     * ??postbuildvariantcriterionvaluesetrefs?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS }
     *     
     */
    public FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS getPOSTBUILDVARIANTCRITERIONVALUESETREFS() {
        return postbuildvariantcriterionvaluesetrefs;
    }

    /**
     * ??postbuildvariantcriterionvaluesetrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS }
     *     
     */
    public void setPOSTBUILDVARIANTCRITERIONVALUESETREFS(FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS value) {
        this.postbuildvariantcriterionvaluesetrefs = value;
    }

    /**
     * ??swsystemconstantvaluesetrefs?????
     * 
     * @return
     *     possible object is
     *     {@link FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS }
     *     
     */
    public FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS getSWSYSTEMCONSTANTVALUESETREFS() {
        return swsystemconstantvaluesetrefs;
    }

    /**
     * ??swsystemconstantvaluesetrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS }
     *     
     */
    public void setSWSYSTEMCONSTANTVALUESETREFS(FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS value) {
        this.swsystemconstantvaluesetrefs = value;
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
     *         &lt;element name="FM-FEATURE-MAP-ASSERTION" type="{http://autosar.org/schema/r4.0}FM-FEATURE-MAP-ASSERTION"/>
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
        "fmfeaturemapassertion"
    })
    public static class ASSERTIONS {

        @XmlElement(name = "FM-FEATURE-MAP-ASSERTION")
        protected List<FMFEATUREMAPASSERTION> fmfeaturemapassertion;

        /**
         * Gets the value of the fmfeaturemapassertion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fmfeaturemapassertion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFMFEATUREMAPASSERTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FMFEATUREMAPASSERTION }
         * 
         * 
         */
        public List<FMFEATUREMAPASSERTION> getFMFEATUREMAPASSERTION() {
            if (fmfeaturemapassertion == null) {
                fmfeaturemapassertion = new ArrayList<FMFEATUREMAPASSERTION>();
            }
            return this.fmfeaturemapassertion;
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
     *         &lt;element name="FM-FEATURE-MAP-CONDITION" type="{http://autosar.org/schema/r4.0}FM-FEATURE-MAP-CONDITION"/>
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
        "fmfeaturemapcondition"
    })
    public static class CONDITIONS {

        @XmlElement(name = "FM-FEATURE-MAP-CONDITION")
        protected List<FMFEATUREMAPCONDITION> fmfeaturemapcondition;

        /**
         * Gets the value of the fmfeaturemapcondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fmfeaturemapcondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFMFEATUREMAPCONDITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FMFEATUREMAPCONDITION }
         * 
         * 
         */
        public List<FMFEATUREMAPCONDITION> getFMFEATUREMAPCONDITION() {
            if (fmfeaturemapcondition == null) {
                fmfeaturemapcondition = new ArrayList<FMFEATUREMAPCONDITION>();
            }
            return this.fmfeaturemapcondition;
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
     *         &lt;element name="POST-BUILD-VARIANT-CRITERION-VALUE-SET-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CRITERION-VALUE-SET--SUBTYPES-ENUM" />
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
        "postbuildvariantcriterionvaluesetref"
    })
    public static class POSTBUILDVARIANTCRITERIONVALUESETREFS {

        @XmlElement(name = "POST-BUILD-VARIANT-CRITERION-VALUE-SET-REF")
        protected List<FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF> postbuildvariantcriterionvaluesetref;

        /**
         * Gets the value of the postbuildvariantcriterionvaluesetref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the postbuildvariantcriterionvaluesetref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOSTBUILDVARIANTCRITERIONVALUESETREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF }
         * 
         * 
         */
        public List<FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF> getPOSTBUILDVARIANTCRITERIONVALUESETREF() {
            if (postbuildvariantcriterionvaluesetref == null) {
                postbuildvariantcriterionvaluesetref = new ArrayList<FMFEATUREMAPELEMENT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF>();
            }
            return this.postbuildvariantcriterionvaluesetref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}POST-BUILD-VARIANT-CRITERION-VALUE-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class POSTBUILDVARIANTCRITERIONVALUESETREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected POSTBUILDVARIANTCRITERIONVALUESETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link POSTBUILDVARIANTCRITERIONVALUESETSUBTYPESENUM }
             *     
             */
            public POSTBUILDVARIANTCRITERIONVALUESETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link POSTBUILDVARIANTCRITERIONVALUESETSUBTYPESENUM }
             *     
             */
            public void setDEST(POSTBUILDVARIANTCRITERIONVALUESETSUBTYPESENUM value) {
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
     *         &lt;element name="SW-SYSTEMCONSTANT-VALUE-SET-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-SYSTEMCONSTANT-VALUE-SET--SUBTYPES-ENUM" />
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
        "swsystemconstantvaluesetref"
    })
    public static class SWSYSTEMCONSTANTVALUESETREFS {

        @XmlElement(name = "SW-SYSTEMCONSTANT-VALUE-SET-REF")
        protected List<FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF> swsystemconstantvaluesetref;

        /**
         * Gets the value of the swsystemconstantvaluesetref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swsystemconstantvaluesetref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWSYSTEMCONSTANTVALUESETREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF }
         * 
         * 
         */
        public List<FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF> getSWSYSTEMCONSTANTVALUESETREF() {
            if (swsystemconstantvaluesetref == null) {
                swsystemconstantvaluesetref = new ArrayList<FMFEATUREMAPELEMENT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF>();
            }
            return this.swsystemconstantvaluesetref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-SYSTEMCONSTANT-VALUE-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SWSYSTEMCONSTANTVALUESETREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected SWSYSTEMCONSTANTVALUESETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link SWSYSTEMCONSTANTVALUESETSUBTYPESENUM }
             *     
             */
            public SWSYSTEMCONSTANTVALUESETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link SWSYSTEMCONSTANTVALUESETSUBTYPESENUM }
             *     
             */
            public void setDEST(SWSYSTEMCONSTANTVALUESETSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
