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
 * This meta-class represents the ability to specify a manifest for processing artifacts. An example use case is the processing of ECUC parameter values.
 * 
 * <p>BUILD-ACTION-MANIFEST complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BUILD-ACTION-MANIFEST">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BUILD-ACTION-MANIFEST"/>
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
@XmlType(name = "BUILD-ACTION-MANIFEST", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "blueprintpolicys",
    "shortnamepattern",
    "startactionrefs",
    "teardownactionrefs",
    "buildactions",
    "buildactionenvironments",
    "dynamicactionrefs"
})
public class BUILDACTIONMANIFEST {

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
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "START-ACTION-REFS")
    protected BUILDACTIONMANIFEST.STARTACTIONREFS startactionrefs;
    @XmlElement(name = "TEAR-DOWN-ACTION-REFS")
    protected BUILDACTIONMANIFEST.TEARDOWNACTIONREFS teardownactionrefs;
    @XmlElement(name = "BUILD-ACTIONS")
    protected BUILDACTIONMANIFEST.BUILDACTIONS buildactions;
    @XmlElement(name = "BUILD-ACTION-ENVIRONMENTS")
    protected BUILDACTIONMANIFEST.BUILDACTIONENVIRONMENTS buildactionenvironments;
    @XmlElement(name = "DYNAMIC-ACTION-REFS")
    protected BUILDACTIONMANIFEST.DYNAMICACTIONREFS dynamicactionrefs;
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
     * ??blueprintpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public Ar421.FLATMAP.BLUEPRINTPOLICYS getBLUEPRINTPOLICYS() {
        return blueprintpolicys;
    }

    /**
     * ??blueprintpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public void setBLUEPRINTPOLICYS(Ar421.FLATMAP.BLUEPRINTPOLICYS value) {
        this.blueprintpolicys = value;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSHORTNAMEPATTERN() {
        return shortnamepattern;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSHORTNAMEPATTERN(STRING value) {
        this.shortnamepattern = value;
    }

    /**
     * ??startactionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONMANIFEST.STARTACTIONREFS }
     *     
     */
    public BUILDACTIONMANIFEST.STARTACTIONREFS getSTARTACTIONREFS() {
        return startactionrefs;
    }

    /**
     * ??startactionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONMANIFEST.STARTACTIONREFS }
     *     
     */
    public void setSTARTACTIONREFS(BUILDACTIONMANIFEST.STARTACTIONREFS value) {
        this.startactionrefs = value;
    }

    /**
     * ??teardownactionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONMANIFEST.TEARDOWNACTIONREFS }
     *     
     */
    public BUILDACTIONMANIFEST.TEARDOWNACTIONREFS getTEARDOWNACTIONREFS() {
        return teardownactionrefs;
    }

    /**
     * ??teardownactionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONMANIFEST.TEARDOWNACTIONREFS }
     *     
     */
    public void setTEARDOWNACTIONREFS(BUILDACTIONMANIFEST.TEARDOWNACTIONREFS value) {
        this.teardownactionrefs = value;
    }

    /**
     * ??buildactions?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONMANIFEST.BUILDACTIONS }
     *     
     */
    public BUILDACTIONMANIFEST.BUILDACTIONS getBUILDACTIONS() {
        return buildactions;
    }

    /**
     * ??buildactions?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONMANIFEST.BUILDACTIONS }
     *     
     */
    public void setBUILDACTIONS(BUILDACTIONMANIFEST.BUILDACTIONS value) {
        this.buildactions = value;
    }

    /**
     * ??buildactionenvironments?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONMANIFEST.BUILDACTIONENVIRONMENTS }
     *     
     */
    public BUILDACTIONMANIFEST.BUILDACTIONENVIRONMENTS getBUILDACTIONENVIRONMENTS() {
        return buildactionenvironments;
    }

    /**
     * ??buildactionenvironments?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONMANIFEST.BUILDACTIONENVIRONMENTS }
     *     
     */
    public void setBUILDACTIONENVIRONMENTS(BUILDACTIONMANIFEST.BUILDACTIONENVIRONMENTS value) {
        this.buildactionenvironments = value;
    }

    /**
     * ??dynamicactionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BUILDACTIONMANIFEST.DYNAMICACTIONREFS }
     *     
     */
    public BUILDACTIONMANIFEST.DYNAMICACTIONREFS getDYNAMICACTIONREFS() {
        return dynamicactionrefs;
    }

    /**
     * ??dynamicactionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDACTIONMANIFEST.DYNAMICACTIONREFS }
     *     
     */
    public void setDYNAMICACTIONREFS(BUILDACTIONMANIFEST.DYNAMICACTIONREFS value) {
        this.dynamicactionrefs = value;
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
     *         &lt;element name="BUILD-ACTION-ENVIRONMENT" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-ENVIRONMENT"/>
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
        "buildactionenvironment"
    })
    public static class BUILDACTIONENVIRONMENTS {

        @XmlElement(name = "BUILD-ACTION-ENVIRONMENT")
        protected List<BUILDACTIONENVIRONMENT> buildactionenvironment;

        /**
         * Gets the value of the buildactionenvironment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildactionenvironment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUILDACTIONENVIRONMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONENVIRONMENT }
         * 
         * 
         */
        public List<BUILDACTIONENVIRONMENT> getBUILDACTIONENVIRONMENT() {
            if (buildactionenvironment == null) {
                buildactionenvironment = new ArrayList<BUILDACTIONENVIRONMENT>();
            }
            return this.buildactionenvironment;
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
     *         &lt;element name="BUILD-ACTION" type="{http://autosar.org/schema/r4.0}BUILD-ACTION"/>
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
        "buildaction"
    })
    public static class BUILDACTIONS {

        @XmlElement(name = "BUILD-ACTION")
        protected List<BUILDACTION> buildaction;

        /**
         * Gets the value of the buildaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUILDACTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTION }
         * 
         * 
         */
        public List<BUILDACTION> getBUILDACTION() {
            if (buildaction == null) {
                buildaction = new ArrayList<BUILDACTION>();
            }
            return this.buildaction;
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
     *         &lt;element name="DYNAMIC-ACTION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
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
        "dynamicactionref"
    })
    public static class DYNAMICACTIONREFS {

        @XmlElement(name = "DYNAMIC-ACTION-REF")
        protected List<BUILDACTIONMANIFEST.DYNAMICACTIONREFS.DYNAMICACTIONREF> dynamicactionref;

        /**
         * Gets the value of the dynamicactionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicactionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDYNAMICACTIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONMANIFEST.DYNAMICACTIONREFS.DYNAMICACTIONREF }
         * 
         * 
         */
        public List<BUILDACTIONMANIFEST.DYNAMICACTIONREFS.DYNAMICACTIONREF> getDYNAMICACTIONREF() {
            if (dynamicactionref == null) {
                dynamicactionref = new ArrayList<BUILDACTIONMANIFEST.DYNAMICACTIONREFS.DYNAMICACTIONREF>();
            }
            return this.dynamicactionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DYNAMICACTIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected BUILDACTIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public BUILDACTIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public void setDEST(BUILDACTIONSUBTYPESENUM value) {
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
     *         &lt;element name="START-ACTION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
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
        "startactionref"
    })
    public static class STARTACTIONREFS {

        @XmlElement(name = "START-ACTION-REF")
        protected List<BUILDACTIONMANIFEST.STARTACTIONREFS.STARTACTIONREF> startactionref;

        /**
         * Gets the value of the startactionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the startactionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTARTACTIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONMANIFEST.STARTACTIONREFS.STARTACTIONREF }
         * 
         * 
         */
        public List<BUILDACTIONMANIFEST.STARTACTIONREFS.STARTACTIONREF> getSTARTACTIONREF() {
            if (startactionref == null) {
                startactionref = new ArrayList<BUILDACTIONMANIFEST.STARTACTIONREFS.STARTACTIONREF>();
            }
            return this.startactionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class STARTACTIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected BUILDACTIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public BUILDACTIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public void setDEST(BUILDACTIONSUBTYPESENUM value) {
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
     *         &lt;element name="TEAR-DOWN-ACTION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
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
        "teardownactionref"
    })
    public static class TEARDOWNACTIONREFS {

        @XmlElement(name = "TEAR-DOWN-ACTION-REF")
        protected List<BUILDACTIONMANIFEST.TEARDOWNACTIONREFS.TEARDOWNACTIONREF> teardownactionref;

        /**
         * Gets the value of the teardownactionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the teardownactionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTEARDOWNACTIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONMANIFEST.TEARDOWNACTIONREFS.TEARDOWNACTIONREF }
         * 
         * 
         */
        public List<BUILDACTIONMANIFEST.TEARDOWNACTIONREFS.TEARDOWNACTIONREF> getTEARDOWNACTIONREF() {
            if (teardownactionref == null) {
                teardownactionref = new ArrayList<BUILDACTIONMANIFEST.TEARDOWNACTIONREFS.TEARDOWNACTIONREF>();
            }
            return this.teardownactionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BUILD-ACTION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TEARDOWNACTIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected BUILDACTIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public BUILDACTIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDACTIONSUBTYPESENUM }
             *     
             */
            public void setDEST(BUILDACTIONSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
