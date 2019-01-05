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
 * This specifies one predefined variant. It is characterized by the union of all system constant values and post-build variant criterion values aggregated within all referenced system constant value sets and post build variant criterion value sets plus the value sets of the included variants.
 * 
 * <p>PREDEFINED-VARIANT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PREDEFINED-VARIANT">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PREDEFINED-VARIANT"/>
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
@XmlType(name = "PREDEFINED-VARIANT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "includedvariantrefs",
    "postbuildvariantcriterionvaluesetrefs",
    "swsystemconstantvaluesetrefs"
})
public class PREDEFINEDVARIANT {

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
    @XmlElement(name = "INCLUDED-VARIANT-REFS")
    protected PREDEFINEDVARIANT.INCLUDEDVARIANTREFS includedvariantrefs;
    @XmlElement(name = "POST-BUILD-VARIANT-CRITERION-VALUE-SET-REFS")
    protected PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS postbuildvariantcriterionvaluesetrefs;
    @XmlElement(name = "SW-SYSTEMCONSTANT-VALUE-SET-REFS")
    protected PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS swsystemconstantvaluesetrefs;
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
     * ??includedvariantrefs?????
     * 
     * @return
     *     possible object is
     *     {@link PREDEFINEDVARIANT.INCLUDEDVARIANTREFS }
     *     
     */
    public PREDEFINEDVARIANT.INCLUDEDVARIANTREFS getINCLUDEDVARIANTREFS() {
        return includedvariantrefs;
    }

    /**
     * ??includedvariantrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PREDEFINEDVARIANT.INCLUDEDVARIANTREFS }
     *     
     */
    public void setINCLUDEDVARIANTREFS(PREDEFINEDVARIANT.INCLUDEDVARIANTREFS value) {
        this.includedvariantrefs = value;
    }

    /**
     * ??postbuildvariantcriterionvaluesetrefs?????
     * 
     * @return
     *     possible object is
     *     {@link PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS }
     *     
     */
    public PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS getPOSTBUILDVARIANTCRITERIONVALUESETREFS() {
        return postbuildvariantcriterionvaluesetrefs;
    }

    /**
     * ??postbuildvariantcriterionvaluesetrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS }
     *     
     */
    public void setPOSTBUILDVARIANTCRITERIONVALUESETREFS(PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS value) {
        this.postbuildvariantcriterionvaluesetrefs = value;
    }

    /**
     * ??swsystemconstantvaluesetrefs?????
     * 
     * @return
     *     possible object is
     *     {@link PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS }
     *     
     */
    public PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS getSWSYSTEMCONSTANTVALUESETREFS() {
        return swsystemconstantvaluesetrefs;
    }

    /**
     * ??swsystemconstantvaluesetrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS }
     *     
     */
    public void setSWSYSTEMCONSTANTVALUESETREFS(PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS value) {
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
     *         &lt;element name="INCLUDED-VARIANT-REF">
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
        "includedvariantref"
    })
    public static class INCLUDEDVARIANTREFS {

        @XmlElement(name = "INCLUDED-VARIANT-REF")
        protected List<PREDEFINEDVARIANT.INCLUDEDVARIANTREFS.INCLUDEDVARIANTREF> includedvariantref;

        /**
         * Gets the value of the includedvariantref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includedvariantref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCLUDEDVARIANTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PREDEFINEDVARIANT.INCLUDEDVARIANTREFS.INCLUDEDVARIANTREF }
         * 
         * 
         */
        public List<PREDEFINEDVARIANT.INCLUDEDVARIANTREFS.INCLUDEDVARIANTREF> getINCLUDEDVARIANTREF() {
            if (includedvariantref == null) {
                includedvariantref = new ArrayList<PREDEFINEDVARIANT.INCLUDEDVARIANTREFS.INCLUDEDVARIANTREF>();
            }
            return this.includedvariantref;
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
        public static class INCLUDEDVARIANTREF
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
        protected List<PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF> postbuildvariantcriterionvaluesetref;

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
         * {@link PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF }
         * 
         * 
         */
        public List<PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF> getPOSTBUILDVARIANTCRITERIONVALUESETREF() {
            if (postbuildvariantcriterionvaluesetref == null) {
                postbuildvariantcriterionvaluesetref = new ArrayList<PREDEFINEDVARIANT.POSTBUILDVARIANTCRITERIONVALUESETREFS.POSTBUILDVARIANTCRITERIONVALUESETREF>();
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
        protected List<PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF> swsystemconstantvaluesetref;

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
         * {@link PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF }
         * 
         * 
         */
        public List<PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF> getSWSYSTEMCONSTANTVALUESETREF() {
            if (swsystemconstantvaluesetref == null) {
                swsystemconstantvaluesetref = new ArrayList<PREDEFINEDVARIANT.SWSYSTEMCONSTANTVALUESETREFS.SWSYSTEMCONSTANTVALUESETREF>();
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
