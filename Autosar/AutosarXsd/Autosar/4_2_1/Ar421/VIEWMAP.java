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
 * The ViewMap allows to relate any number of elements on the "first" side to any number of elements on the "second" side. Since the ViewMap does not address a specific mapping use-case the roles "first" and "second" shall imply this generality.
 * 
 * This mapping allows to trace transformations of artifacts within the AUTOSAR environment. The references to the mapped elements can be plain references and/or InstanceRefs.
 * 
 * <p>VIEW-MAP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="VIEW-MAP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}VIEW-MAP"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VIEW-MAP", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "role",
    "firstelementrefs",
    "secondelementrefs",
    "firstelementinstanceirefs",
    "secondelementinstanceirefs"
})
public class VIEWMAP {

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
    @XmlElement(name = "ROLE")
    protected IDENTIFIER role;
    @XmlElement(name = "FIRST-ELEMENT-REFS")
    protected VIEWMAP.FIRSTELEMENTREFS firstelementrefs;
    @XmlElement(name = "SECOND-ELEMENT-REFS")
    protected VIEWMAP.SECONDELEMENTREFS secondelementrefs;
    @XmlElement(name = "FIRST-ELEMENT-INSTANCE-IREFS")
    protected VIEWMAP.FIRSTELEMENTINSTANCEIREFS firstelementinstanceirefs;
    @XmlElement(name = "SECOND-ELEMENT-INSTANCE-IREFS")
    protected VIEWMAP.SECONDELEMENTINSTANCEIREFS secondelementinstanceirefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

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
     * ??role?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getROLE() {
        return role;
    }

    /**
     * ??role?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setROLE(IDENTIFIER value) {
        this.role = value;
    }

    /**
     * ??firstelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link VIEWMAP.FIRSTELEMENTREFS }
     *     
     */
    public VIEWMAP.FIRSTELEMENTREFS getFIRSTELEMENTREFS() {
        return firstelementrefs;
    }

    /**
     * ??firstelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link VIEWMAP.FIRSTELEMENTREFS }
     *     
     */
    public void setFIRSTELEMENTREFS(VIEWMAP.FIRSTELEMENTREFS value) {
        this.firstelementrefs = value;
    }

    /**
     * ??secondelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link VIEWMAP.SECONDELEMENTREFS }
     *     
     */
    public VIEWMAP.SECONDELEMENTREFS getSECONDELEMENTREFS() {
        return secondelementrefs;
    }

    /**
     * ??secondelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link VIEWMAP.SECONDELEMENTREFS }
     *     
     */
    public void setSECONDELEMENTREFS(VIEWMAP.SECONDELEMENTREFS value) {
        this.secondelementrefs = value;
    }

    /**
     * ??firstelementinstanceirefs?????
     * 
     * @return
     *     possible object is
     *     {@link VIEWMAP.FIRSTELEMENTINSTANCEIREFS }
     *     
     */
    public VIEWMAP.FIRSTELEMENTINSTANCEIREFS getFIRSTELEMENTINSTANCEIREFS() {
        return firstelementinstanceirefs;
    }

    /**
     * ??firstelementinstanceirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link VIEWMAP.FIRSTELEMENTINSTANCEIREFS }
     *     
     */
    public void setFIRSTELEMENTINSTANCEIREFS(VIEWMAP.FIRSTELEMENTINSTANCEIREFS value) {
        this.firstelementinstanceirefs = value;
    }

    /**
     * ??secondelementinstanceirefs?????
     * 
     * @return
     *     possible object is
     *     {@link VIEWMAP.SECONDELEMENTINSTANCEIREFS }
     *     
     */
    public VIEWMAP.SECONDELEMENTINSTANCEIREFS getSECONDELEMENTINSTANCEIREFS() {
        return secondelementinstanceirefs;
    }

    /**
     * ??secondelementinstanceirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link VIEWMAP.SECONDELEMENTINSTANCEIREFS }
     *     
     */
    public void setSECONDELEMENTINSTANCEIREFS(VIEWMAP.SECONDELEMENTINSTANCEIREFS value) {
        this.secondelementinstanceirefs = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="FIRST-ELEMENT-INSTANCE-IREF" type="{http://autosar.org/schema/r4.0}ANY-INSTANCE-REF"/>
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
        "firstelementinstanceiref"
    })
    public static class FIRSTELEMENTINSTANCEIREFS {

        @XmlElement(name = "FIRST-ELEMENT-INSTANCE-IREF")
        protected List<ANYINSTANCEREF> firstelementinstanceiref;

        /**
         * Gets the value of the firstelementinstanceiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the firstelementinstanceiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFIRSTELEMENTINSTANCEIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANYINSTANCEREF }
         * 
         * 
         */
        public List<ANYINSTANCEREF> getFIRSTELEMENTINSTANCEIREF() {
            if (firstelementinstanceiref == null) {
                firstelementinstanceiref = new ArrayList<ANYINSTANCEREF>();
            }
            return this.firstelementinstanceiref;
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
     *         &lt;element name="FIRST-ELEMENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
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
        "firstelementref"
    })
    public static class FIRSTELEMENTREFS {

        @XmlElement(name = "FIRST-ELEMENT-REF")
        protected List<VIEWMAP.FIRSTELEMENTREFS.FIRSTELEMENTREF> firstelementref;

        /**
         * Gets the value of the firstelementref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the firstelementref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFIRSTELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VIEWMAP.FIRSTELEMENTREFS.FIRSTELEMENTREF }
         * 
         * 
         */
        public List<VIEWMAP.FIRSTELEMENTREFS.FIRSTELEMENTREF> getFIRSTELEMENTREF() {
            if (firstelementref == null) {
                firstelementref = new ArrayList<VIEWMAP.FIRSTELEMENTREFS.FIRSTELEMENTREF>();
            }
            return this.firstelementref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FIRSTELEMENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected REFERRABLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public REFERRABLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public void setDEST(REFERRABLESUBTYPESENUM value) {
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
     *         &lt;element name="SECOND-ELEMENT-INSTANCE-IREF" type="{http://autosar.org/schema/r4.0}ANY-INSTANCE-REF"/>
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
        "secondelementinstanceiref"
    })
    public static class SECONDELEMENTINSTANCEIREFS {

        @XmlElement(name = "SECOND-ELEMENT-INSTANCE-IREF")
        protected List<ANYINSTANCEREF> secondelementinstanceiref;

        /**
         * Gets the value of the secondelementinstanceiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondelementinstanceiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSECONDELEMENTINSTANCEIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANYINSTANCEREF }
         * 
         * 
         */
        public List<ANYINSTANCEREF> getSECONDELEMENTINSTANCEIREF() {
            if (secondelementinstanceiref == null) {
                secondelementinstanceiref = new ArrayList<ANYINSTANCEREF>();
            }
            return this.secondelementinstanceiref;
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
     *         &lt;element name="SECOND-ELEMENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
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
        "secondelementref"
    })
    public static class SECONDELEMENTREFS {

        @XmlElement(name = "SECOND-ELEMENT-REF")
        protected List<VIEWMAP.SECONDELEMENTREFS.SECONDELEMENTREF> secondelementref;

        /**
         * Gets the value of the secondelementref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondelementref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSECONDELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VIEWMAP.SECONDELEMENTREFS.SECONDELEMENTREF }
         * 
         * 
         */
        public List<VIEWMAP.SECONDELEMENTREFS.SECONDELEMENTREF> getSECONDELEMENTREF() {
            if (secondelementref == null) {
                secondelementref = new ArrayList<VIEWMAP.SECONDELEMENTREFS.SECONDELEMENTREF>();
            }
            return this.secondelementref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SECONDELEMENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected REFERRABLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public REFERRABLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public void setDEST(REFERRABLESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
