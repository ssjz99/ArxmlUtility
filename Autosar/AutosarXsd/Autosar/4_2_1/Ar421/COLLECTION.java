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
 * This meta-class specifies a collection of elements. A collection can be utilized to express additional aspects for a set of elements. 
 * 
 * Note that Collection is an ARElement. Therefore it is applicable e.g. for EvaluatedVariant, even if this is not obvious.
 * 
 * Usually the category of a Collection is "SET". On the other hand, a Collection can also express an arbitrary relationship between elements. This is denoted by the category "RELATION" (see also [TPS_GST_00347]). 
 * 
 * In this case the collection represents an association from "sourceElement" to "targetElement" in the role "role".
 * 
 * <p>COLLECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COLLECTION">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTION"/>
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
@XmlType(name = "COLLECTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "autocollect",
    "elementrole",
    "elementrefs",
    "sourceelementrefs",
    "collectedinstanceirefs",
    "sourceinstanceirefs"
})
public class COLLECTION {

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
    @XmlElement(name = "AUTO-COLLECT")
    protected AUTOCOLLECTENUM autocollect;
    @XmlElement(name = "ELEMENT-ROLE")
    protected IDENTIFIER elementrole;
    @XmlElement(name = "ELEMENT-REFS")
    protected COLLECTION.ELEMENTREFS elementrefs;
    @XmlElement(name = "SOURCE-ELEMENT-REFS")
    protected COLLECTION.SOURCEELEMENTREFS sourceelementrefs;
    @XmlElement(name = "COLLECTED-INSTANCE-IREFS")
    protected COLLECTION.COLLECTEDINSTANCEIREFS collectedinstanceirefs;
    @XmlElement(name = "SOURCE-INSTANCE-IREFS")
    protected COLLECTION.SOURCEINSTANCEIREFS sourceinstanceirefs;
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
     * ??autocollect?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOCOLLECTENUM }
     *     
     */
    public AUTOCOLLECTENUM getAUTOCOLLECT() {
        return autocollect;
    }

    /**
     * ??autocollect?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOCOLLECTENUM }
     *     
     */
    public void setAUTOCOLLECT(AUTOCOLLECTENUM value) {
        this.autocollect = value;
    }

    /**
     * ??elementrole?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getELEMENTROLE() {
        return elementrole;
    }

    /**
     * ??elementrole?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setELEMENTROLE(IDENTIFIER value) {
        this.elementrole = value;
    }

    /**
     * ??elementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link COLLECTION.ELEMENTREFS }
     *     
     */
    public COLLECTION.ELEMENTREFS getELEMENTREFS() {
        return elementrefs;
    }

    /**
     * ??elementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COLLECTION.ELEMENTREFS }
     *     
     */
    public void setELEMENTREFS(COLLECTION.ELEMENTREFS value) {
        this.elementrefs = value;
    }

    /**
     * ??sourceelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link COLLECTION.SOURCEELEMENTREFS }
     *     
     */
    public COLLECTION.SOURCEELEMENTREFS getSOURCEELEMENTREFS() {
        return sourceelementrefs;
    }

    /**
     * ??sourceelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COLLECTION.SOURCEELEMENTREFS }
     *     
     */
    public void setSOURCEELEMENTREFS(COLLECTION.SOURCEELEMENTREFS value) {
        this.sourceelementrefs = value;
    }

    /**
     * ??collectedinstanceirefs?????
     * 
     * @return
     *     possible object is
     *     {@link COLLECTION.COLLECTEDINSTANCEIREFS }
     *     
     */
    public COLLECTION.COLLECTEDINSTANCEIREFS getCOLLECTEDINSTANCEIREFS() {
        return collectedinstanceirefs;
    }

    /**
     * ??collectedinstanceirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COLLECTION.COLLECTEDINSTANCEIREFS }
     *     
     */
    public void setCOLLECTEDINSTANCEIREFS(COLLECTION.COLLECTEDINSTANCEIREFS value) {
        this.collectedinstanceirefs = value;
    }

    /**
     * ??sourceinstanceirefs?????
     * 
     * @return
     *     possible object is
     *     {@link COLLECTION.SOURCEINSTANCEIREFS }
     *     
     */
    public COLLECTION.SOURCEINSTANCEIREFS getSOURCEINSTANCEIREFS() {
        return sourceinstanceirefs;
    }

    /**
     * ??sourceinstanceirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COLLECTION.SOURCEINSTANCEIREFS }
     *     
     */
    public void setSOURCEINSTANCEIREFS(COLLECTION.SOURCEINSTANCEIREFS value) {
        this.sourceinstanceirefs = value;
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
     *         &lt;element name="COLLECTED-INSTANCE-IREF" type="{http://autosar.org/schema/r4.0}ANY-INSTANCE-REF"/>
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
        "collectedinstanceiref"
    })
    public static class COLLECTEDINSTANCEIREFS {

        @XmlElement(name = "COLLECTED-INSTANCE-IREF")
        protected List<ANYINSTANCEREF> collectedinstanceiref;

        /**
         * Gets the value of the collectedinstanceiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the collectedinstanceiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOLLECTEDINSTANCEIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANYINSTANCEREF }
         * 
         * 
         */
        public List<ANYINSTANCEREF> getCOLLECTEDINSTANCEIREF() {
            if (collectedinstanceiref == null) {
                collectedinstanceiref = new ArrayList<ANYINSTANCEREF>();
            }
            return this.collectedinstanceiref;
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
     *         &lt;element name="ELEMENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IDENTIFIABLE--SUBTYPES-ENUM" />
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
        "elementref"
    })
    public static class ELEMENTREFS {

        @XmlElement(name = "ELEMENT-REF")
        protected List<COLLECTION.ELEMENTREFS.ELEMENTREF> elementref;

        /**
         * Gets the value of the elementref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elementref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COLLECTION.ELEMENTREFS.ELEMENTREF }
         * 
         * 
         */
        public List<COLLECTION.ELEMENTREFS.ELEMENTREF> getELEMENTREF() {
            if (elementref == null) {
                elementref = new ArrayList<COLLECTION.ELEMENTREFS.ELEMENTREF>();
            }
            return this.elementref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IDENTIFIABLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ELEMENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected IDENTIFIABLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link IDENTIFIABLESUBTYPESENUM }
             *     
             */
            public IDENTIFIABLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link IDENTIFIABLESUBTYPESENUM }
             *     
             */
            public void setDEST(IDENTIFIABLESUBTYPESENUM value) {
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
     *         &lt;element name="SOURCE-ELEMENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IDENTIFIABLE--SUBTYPES-ENUM" />
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
        "sourceelementref"
    })
    public static class SOURCEELEMENTREFS {

        @XmlElement(name = "SOURCE-ELEMENT-REF")
        protected List<COLLECTION.SOURCEELEMENTREFS.SOURCEELEMENTREF> sourceelementref;

        /**
         * Gets the value of the sourceelementref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sourceelementref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOURCEELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COLLECTION.SOURCEELEMENTREFS.SOURCEELEMENTREF }
         * 
         * 
         */
        public List<COLLECTION.SOURCEELEMENTREFS.SOURCEELEMENTREF> getSOURCEELEMENTREF() {
            if (sourceelementref == null) {
                sourceelementref = new ArrayList<COLLECTION.SOURCEELEMENTREFS.SOURCEELEMENTREF>();
            }
            return this.sourceelementref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IDENTIFIABLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SOURCEELEMENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected IDENTIFIABLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link IDENTIFIABLESUBTYPESENUM }
             *     
             */
            public IDENTIFIABLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link IDENTIFIABLESUBTYPESENUM }
             *     
             */
            public void setDEST(IDENTIFIABLESUBTYPESENUM value) {
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
     *         &lt;element name="SOURCE-INSTANCE-IREF" type="{http://autosar.org/schema/r4.0}ANY-INSTANCE-REF"/>
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
        "sourceinstanceiref"
    })
    public static class SOURCEINSTANCEIREFS {

        @XmlElement(name = "SOURCE-INSTANCE-IREF")
        protected List<ANYINSTANCEREF> sourceinstanceiref;

        /**
         * Gets the value of the sourceinstanceiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sourceinstanceiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOURCEINSTANCEIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANYINSTANCEREF }
         * 
         * 
         */
        public List<ANYINSTANCEREF> getSOURCEINSTANCEIREF() {
            if (sourceinstanceiref == null) {
                sourceinstanceiref = new ArrayList<ANYINSTANCEREF>();
            }
            return this.sourceinstanceiref;
        }

    }

}
