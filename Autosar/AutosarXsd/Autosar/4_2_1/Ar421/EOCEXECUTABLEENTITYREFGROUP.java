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
 * This is used to specify a group (composite) consisting of Execution Order Constraint Executable Entity References (leaves) and/or further Execution Order Constraint Executable Entity Reference Groups (composite).
 * 
 * <p>EOC-EXECUTABLE-ENTITY-REF-GROUP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EOC-EXECUTABLE-ENTITY-REF-GROUP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-GROUP"/>
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
@XmlType(name = "EOC-EXECUTABLE-ENTITY-REF-GROUP", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "directsuccessorrefs",
    "maxcycles",
    "maxslots",
    "nestedelementrefs",
    "successorrefs",
    "triggeringeventref"
})
public class EOCEXECUTABLEENTITYREFGROUP {

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
    @XmlElement(name = "DIRECT-SUCCESSOR-REFS")
    protected EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS directsuccessorrefs;
    @XmlElement(name = "MAX-CYCLES")
    protected INTEGER maxcycles;
    @XmlElement(name = "MAX-SLOTS")
    protected INTEGER maxslots;
    @XmlElement(name = "NESTED-ELEMENT-REFS")
    protected EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS nestedelementrefs;
    @XmlElement(name = "SUCCESSOR-REFS")
    protected EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS successorrefs;
    @XmlElement(name = "TRIGGERING-EVENT-REF")
    protected EOCEXECUTABLEENTITYREFGROUP.TRIGGERINGEVENTREF triggeringeventref;
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
     * ??directsuccessorrefs?????
     * 
     * @return
     *     possible object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS }
     *     
     */
    public EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS getDIRECTSUCCESSORREFS() {
        return directsuccessorrefs;
    }

    /**
     * ??directsuccessorrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS }
     *     
     */
    public void setDIRECTSUCCESSORREFS(EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS value) {
        this.directsuccessorrefs = value;
    }

    /**
     * ??maxcycles?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXCYCLES() {
        return maxcycles;
    }

    /**
     * ??maxcycles?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXCYCLES(INTEGER value) {
        this.maxcycles = value;
    }

    /**
     * ??maxslots?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXSLOTS() {
        return maxslots;
    }

    /**
     * ??maxslots?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXSLOTS(INTEGER value) {
        this.maxslots = value;
    }

    /**
     * ??nestedelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS }
     *     
     */
    public EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS getNESTEDELEMENTREFS() {
        return nestedelementrefs;
    }

    /**
     * ??nestedelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS }
     *     
     */
    public void setNESTEDELEMENTREFS(EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS value) {
        this.nestedelementrefs = value;
    }

    /**
     * ??successorrefs?????
     * 
     * @return
     *     possible object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS }
     *     
     */
    public EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS getSUCCESSORREFS() {
        return successorrefs;
    }

    /**
     * ??successorrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS }
     *     
     */
    public void setSUCCESSORREFS(EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS value) {
        this.successorrefs = value;
    }

    /**
     * ??triggeringeventref?????
     * 
     * @return
     *     possible object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.TRIGGERINGEVENTREF }
     *     
     */
    public EOCEXECUTABLEENTITYREFGROUP.TRIGGERINGEVENTREF getTRIGGERINGEVENTREF() {
        return triggeringeventref;
    }

    /**
     * ??triggeringeventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link EOCEXECUTABLEENTITYREFGROUP.TRIGGERINGEVENTREF }
     *     
     */
    public void setTRIGGERINGEVENTREF(EOCEXECUTABLEENTITYREFGROUP.TRIGGERINGEVENTREF value) {
        this.triggeringeventref = value;
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
     *         &lt;element name="DIRECT-SUCCESSOR-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
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
        "directsuccessorref"
    })
    public static class DIRECTSUCCESSORREFS {

        @XmlElement(name = "DIRECT-SUCCESSOR-REF")
        protected List<EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS.DIRECTSUCCESSORREF> directsuccessorref;

        /**
         * Gets the value of the directsuccessorref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the directsuccessorref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIRECTSUCCESSORREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS.DIRECTSUCCESSORREF }
         * 
         * 
         */
        public List<EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS.DIRECTSUCCESSORREF> getDIRECTSUCCESSORREF() {
            if (directsuccessorref == null) {
                directsuccessorref = new ArrayList<EOCEXECUTABLEENTITYREFGROUP.DIRECTSUCCESSORREFS.DIRECTSUCCESSORREF>();
            }
            return this.directsuccessorref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DIRECTSUCCESSORREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public void setDEST(EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM value) {
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
     *         &lt;element name="NESTED-ELEMENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
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
        "nestedelementref"
    })
    public static class NESTEDELEMENTREFS {

        @XmlElement(name = "NESTED-ELEMENT-REF")
        protected List<EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS.NESTEDELEMENTREF> nestedelementref;

        /**
         * Gets the value of the nestedelementref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nestedelementref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNESTEDELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS.NESTEDELEMENTREF }
         * 
         * 
         */
        public List<EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS.NESTEDELEMENTREF> getNESTEDELEMENTREF() {
            if (nestedelementref == null) {
                nestedelementref = new ArrayList<EOCEXECUTABLEENTITYREFGROUP.NESTEDELEMENTREFS.NESTEDELEMENTREF>();
            }
            return this.nestedelementref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NESTEDELEMENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public void setDEST(EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM value) {
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
     *         &lt;element name="SUCCESSOR-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
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
        "successorref"
    })
    public static class SUCCESSORREFS {

        @XmlElement(name = "SUCCESSOR-REF")
        protected List<EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS.SUCCESSORREF> successorref;

        /**
         * Gets the value of the successorref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the successorref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUCCESSORREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS.SUCCESSORREF }
         * 
         * 
         */
        public List<EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS.SUCCESSORREF> getSUCCESSORREF() {
            if (successorref == null) {
                successorref = new ArrayList<EOCEXECUTABLEENTITYREFGROUP.SUCCESSORREFS.SUCCESSORREF>();
            }
            return this.successorref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SUCCESSORREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM }
             *     
             */
            public void setDEST(EOCEXECUTABLEENTITYREFABSTRACTSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TIMING-DESCRIPTION-EVENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TRIGGERINGEVENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TIMINGDESCRIPTIONEVENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TIMINGDESCRIPTIONEVENTSUBTYPESENUM }
         *     
         */
        public TIMINGDESCRIPTIONEVENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TIMINGDESCRIPTIONEVENTSUBTYPESENUM }
         *     
         */
        public void setDEST(TIMINGDESCRIPTIONEVENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
