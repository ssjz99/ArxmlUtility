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
 * The AUTOSAR COM Layer is able to start and to stop sending and receiving  configurable groups of I-Pdus during runtime. An ISignalIPduGroup contains either ISignalIPdus or ISignalIPduGroups.
 * 
 * <p>I-SIGNAL-I-PDU-GROUP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-SIGNAL-I-PDU-GROUP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FIBEX-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU-GROUP"/>
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
@XmlType(name = "I-SIGNAL-I-PDU-GROUP", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "communicationdirection",
    "communicationmode",
    "containedisignalipdugrouprefs",
    "isignalipdus",
    "nmpdus"
})
public class ISIGNALIPDUGROUP {

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
    @XmlElement(name = "COMMUNICATION-DIRECTION")
    protected COMMUNICATIONDIRECTIONTYPE communicationdirection;
    @XmlElement(name = "COMMUNICATION-MODE")
    protected STRING communicationmode;
    @XmlElement(name = "CONTAINED-I-SIGNAL-I-PDU-GROUP-REFS")
    protected ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS containedisignalipdugrouprefs;
    @XmlElement(name = "I-SIGNAL-I-PDUS")
    protected ISIGNALIPDUGROUP.ISIGNALIPDUS isignalipdus;
    @XmlElement(name = "NM-PDUS")
    protected ISIGNALIPDUGROUP.NMPDUS nmpdus;
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
     * ??communicationdirection?????
     * 
     * @return
     *     possible object is
     *     {@link COMMUNICATIONDIRECTIONTYPE }
     *     
     */
    public COMMUNICATIONDIRECTIONTYPE getCOMMUNICATIONDIRECTION() {
        return communicationdirection;
    }

    /**
     * ??communicationdirection?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMMUNICATIONDIRECTIONTYPE }
     *     
     */
    public void setCOMMUNICATIONDIRECTION(COMMUNICATIONDIRECTIONTYPE value) {
        this.communicationdirection = value;
    }

    /**
     * ??communicationmode?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getCOMMUNICATIONMODE() {
        return communicationmode;
    }

    /**
     * ??communicationmode?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setCOMMUNICATIONMODE(STRING value) {
        this.communicationmode = value;
    }

    /**
     * ??containedisignalipdugrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS }
     *     
     */
    public ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS getCONTAINEDISIGNALIPDUGROUPREFS() {
        return containedisignalipdugrouprefs;
    }

    /**
     * ??containedisignalipdugrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS }
     *     
     */
    public void setCONTAINEDISIGNALIPDUGROUPREFS(ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS value) {
        this.containedisignalipdugrouprefs = value;
    }

    /**
     * ??isignalipdus?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALIPDUGROUP.ISIGNALIPDUS }
     *     
     */
    public ISIGNALIPDUGROUP.ISIGNALIPDUS getISIGNALIPDUS() {
        return isignalipdus;
    }

    /**
     * ??isignalipdus?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALIPDUGROUP.ISIGNALIPDUS }
     *     
     */
    public void setISIGNALIPDUS(ISIGNALIPDUGROUP.ISIGNALIPDUS value) {
        this.isignalipdus = value;
    }

    /**
     * ??nmpdus?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALIPDUGROUP.NMPDUS }
     *     
     */
    public ISIGNALIPDUGROUP.NMPDUS getNMPDUS() {
        return nmpdus;
    }

    /**
     * ??nmpdus?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALIPDUGROUP.NMPDUS }
     *     
     */
    public void setNMPDUS(ISIGNALIPDUGROUP.NMPDUS value) {
        this.nmpdus = value;
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
     *         &lt;element name="CONTAINED-I-SIGNAL-I-PDU-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU-GROUP--SUBTYPES-ENUM" />
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
        "containedisignalipdugroupref"
    })
    public static class CONTAINEDISIGNALIPDUGROUPREFS {

        @XmlElement(name = "CONTAINED-I-SIGNAL-I-PDU-GROUP-REF")
        protected List<ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS.CONTAINEDISIGNALIPDUGROUPREF> containedisignalipdugroupref;

        /**
         * Gets the value of the containedisignalipdugroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the containedisignalipdugroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTAINEDISIGNALIPDUGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS.CONTAINEDISIGNALIPDUGROUPREF }
         * 
         * 
         */
        public List<ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS.CONTAINEDISIGNALIPDUGROUPREF> getCONTAINEDISIGNALIPDUGROUPREF() {
            if (containedisignalipdugroupref == null) {
                containedisignalipdugroupref = new ArrayList<ISIGNALIPDUGROUP.CONTAINEDISIGNALIPDUGROUPREFS.CONTAINEDISIGNALIPDUGROUPREF>();
            }
            return this.containedisignalipdugroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONTAINEDISIGNALIPDUGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ISIGNALIPDUGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ISIGNALIPDUGROUPSUBTYPESENUM }
             *     
             */
            public ISIGNALIPDUGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ISIGNALIPDUGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(ISIGNALIPDUGROUPSUBTYPESENUM value) {
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
     *         &lt;element name="I-SIGNAL-I-PDU-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU-REF-CONDITIONAL"/>
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
        "isignalipdurefconditional"
    })
    public static class ISIGNALIPDUS {

        @XmlElement(name = "I-SIGNAL-I-PDU-REF-CONDITIONAL")
        protected List<ISIGNALIPDUREFCONDITIONAL> isignalipdurefconditional;

        /**
         * Gets the value of the isignalipdurefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the isignalipdurefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISIGNALIPDUREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ISIGNALIPDUREFCONDITIONAL }
         * 
         * 
         */
        public List<ISIGNALIPDUREFCONDITIONAL> getISIGNALIPDUREFCONDITIONAL() {
            if (isignalipdurefconditional == null) {
                isignalipdurefconditional = new ArrayList<ISIGNALIPDUREFCONDITIONAL>();
            }
            return this.isignalipdurefconditional;
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
     *         &lt;element name="NM-PDU-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}NM-PDU-REF-CONDITIONAL"/>
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
        "nmpdurefconditional"
    })
    public static class NMPDUS {

        @XmlElement(name = "NM-PDU-REF-CONDITIONAL")
        protected List<NMPDUREFCONDITIONAL> nmpdurefconditional;

        /**
         * Gets the value of the nmpdurefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nmpdurefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNMPDUREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NMPDUREFCONDITIONAL }
         * 
         * 
         */
        public List<NMPDUREFCONDITIONAL> getNMPDUREFCONDITIONAL() {
            if (nmpdurefconditional == null) {
                nmpdurefconditional = new ArrayList<NMPDUREFCONDITIONAL>();
            }
            return this.nmpdurefconditional;
        }

    }

}
