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
 * This event is thrown on operation invocation in Client-Server-Communication via the BSW Scheduler. Its "entry" reference provides the BswClientServerEntry that is called subsequently.
 * 
 * Note this event is not needed in case of direct function calls.
 * 
 * <p>BSW-OPERATION-INVOKED-EVENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-OPERATION-INVOKED-EVENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-EVENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-OPERATION-INVOKED-EVENT"/>
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
@XmlType(name = "BSW-OPERATION-INVOKED-EVENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "activationreasonrepresentationref",
    "contextlimitationrefs",
    "disabledinmodeirefs",
    "startsoneventref",
    "variationpoint",
    "entryref"
})
public class BSWOPERATIONINVOKEDEVENT {

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
    @XmlElement(name = "ACTIVATION-REASON-REPRESENTATION-REF")
    protected Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF activationreasonrepresentationref;
    @XmlElement(name = "CONTEXT-LIMITATION-REFS")
    protected BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS contextlimitationrefs;
    @XmlElement(name = "DISABLED-IN-MODE-IREFS")
    protected BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS disabledinmodeirefs;
    @XmlElement(name = "STARTS-ON-EVENT-REF")
    protected BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF startsoneventref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "ENTRY-REF")
    protected BSWOPERATIONINVOKEDEVENT.ENTRYREF entryref;
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
     * ??activationreasonrepresentationref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF }
     *     
     */
    public Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF getACTIVATIONREASONREPRESENTATIONREF() {
        return activationreasonrepresentationref;
    }

    /**
     * ??activationreasonrepresentationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF }
     *     
     */
    public void setACTIVATIONREASONREPRESENTATIONREF(Ar421.MODESWITCHEDACKEVENT.ACTIVATIONREASONREPRESENTATIONREF value) {
        this.activationreasonrepresentationref = value;
    }

    /**
     * ??contextlimitationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS }
     *     
     */
    public BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS getCONTEXTLIMITATIONREFS() {
        return contextlimitationrefs;
    }

    /**
     * ??contextlimitationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS }
     *     
     */
    public void setCONTEXTLIMITATIONREFS(BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS value) {
        this.contextlimitationrefs = value;
    }

    /**
     * ??disabledinmodeirefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS }
     *     
     */
    public BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS getDISABLEDINMODEIREFS() {
        return disabledinmodeirefs;
    }

    /**
     * ??disabledinmodeirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS }
     *     
     */
    public void setDISABLEDINMODEIREFS(BSWOPERATIONINVOKEDEVENT.DISABLEDINMODEIREFS value) {
        this.disabledinmodeirefs = value;
    }

    /**
     * ??startsoneventref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF }
     *     
     */
    public BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF getSTARTSONEVENTREF() {
        return startsoneventref;
    }

    /**
     * ??startsoneventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF }
     *     
     */
    public void setSTARTSONEVENTREF(BSWOPERATIONINVOKEDEVENT.STARTSONEVENTREF value) {
        this.startsoneventref = value;
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
     * ??entryref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWOPERATIONINVOKEDEVENT.ENTRYREF }
     *     
     */
    public BSWOPERATIONINVOKEDEVENT.ENTRYREF getENTRYREF() {
        return entryref;
    }

    /**
     * ??entryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWOPERATIONINVOKEDEVENT.ENTRYREF }
     *     
     */
    public void setENTRYREF(BSWOPERATIONINVOKEDEVENT.ENTRYREF value) {
        this.entryref = value;
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
     *         &lt;element name="CONTEXT-LIMITATION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM" />
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
        "contextlimitationref"
    })
    public static class CONTEXTLIMITATIONREFS {

        @XmlElement(name = "CONTEXT-LIMITATION-REF")
        protected List<BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF> contextlimitationref;

        /**
         * Gets the value of the contextlimitationref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contextlimitationref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTEXTLIMITATIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF }
         * 
         * 
         */
        public List<BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF> getCONTEXTLIMITATIONREF() {
            if (contextlimitationref == null) {
                contextlimitationref = new ArrayList<BSWOPERATIONINVOKEDEVENT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF>();
            }
            return this.contextlimitationref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONTEXTLIMITATIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected BSWDISTINGUISHEDPARTITIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link BSWDISTINGUISHEDPARTITIONSUBTYPESENUM }
             *     
             */
            public BSWDISTINGUISHEDPARTITIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link BSWDISTINGUISHEDPARTITIONSUBTYPESENUM }
             *     
             */
            public void setDEST(BSWDISTINGUISHEDPARTITIONSUBTYPESENUM value) {
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
     *         &lt;element name="DISABLED-IN-MODE-IREF" type="{http://autosar.org/schema/r4.0}MODE-IN-BSW-MODULE-DESCRIPTION-INSTANCE-REF"/>
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
        "disabledinmodeiref"
    })
    public static class DISABLEDINMODEIREFS {

        @XmlElement(name = "DISABLED-IN-MODE-IREF")
        protected List<MODEINBSWMODULEDESCRIPTIONINSTANCEREF> disabledinmodeiref;

        /**
         * Gets the value of the disabledinmodeiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disabledinmodeiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDISABLEDINMODEIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEINBSWMODULEDESCRIPTIONINSTANCEREF }
         * 
         * 
         */
        public List<MODEINBSWMODULEDESCRIPTIONINSTANCEREF> getDISABLEDINMODEIREF() {
            if (disabledinmodeiref == null) {
                disabledinmodeiref = new ArrayList<MODEINBSWMODULEDESCRIPTIONINSTANCEREF>();
            }
            return this.disabledinmodeiref;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-CLIENT-SERVER-ENTRY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ENTRYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULECLIENTSERVERENTRYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULECLIENTSERVERENTRYSUBTYPESENUM }
         *     
         */
        public BSWMODULECLIENTSERVERENTRYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULECLIENTSERVERENTRYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULECLIENTSERVERENTRYSUBTYPESENUM value) {
            this.dest = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTITY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class STARTSONEVENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULEENTITYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULEENTITYSUBTYPESENUM }
         *     
         */
        public BSWMODULEENTITYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULEENTITYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULEENTITYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
