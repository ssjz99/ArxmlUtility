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
 * Specifies the properties of exactly on NVRAM Block.
 * 
 * <p>NV-BLOCK-DESCRIPTOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NV-BLOCK-DESCRIPTOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NV-BLOCK-DESCRIPTOR"/>
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
@XmlType(name = "NV-BLOCK-DESCRIPTOR", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "clientserverports",
    "constantvaluemappingrefs",
    "datatypemappingrefs",
    "instantiationdatadefpropss",
    "nvblockdatamappings",
    "nvblockneeds",
    "ramblock",
    "romblock",
    "supportdirtyflag",
    "timingeventref",
    "variationpoint"
})
public class NVBLOCKDESCRIPTOR {

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
    @XmlElement(name = "CLIENT-SERVER-PORTS")
    protected NVBLOCKDESCRIPTOR.CLIENTSERVERPORTS clientserverports;
    @XmlElement(name = "CONSTANT-VALUE-MAPPING-REFS")
    protected NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS constantvaluemappingrefs;
    @XmlElement(name = "DATA-TYPE-MAPPING-REFS")
    protected NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS datatypemappingrefs;
    @XmlElement(name = "INSTANTIATION-DATA-DEF-PROPSS")
    protected NVBLOCKDESCRIPTOR.INSTANTIATIONDATADEFPROPSS instantiationdatadefpropss;
    @XmlElement(name = "NV-BLOCK-DATA-MAPPINGS")
    protected NVBLOCKDESCRIPTOR.NVBLOCKDATAMAPPINGS nvblockdatamappings;
    @XmlElement(name = "NV-BLOCK-NEEDS")
    protected NVBLOCKNEEDS nvblockneeds;
    @XmlElement(name = "RAM-BLOCK")
    protected VARIABLEDATAPROTOTYPE ramblock;
    @XmlElement(name = "ROM-BLOCK")
    protected PARAMETERDATAPROTOTYPE romblock;
    @XmlElement(name = "SUPPORT-DIRTY-FLAG")
    protected BOOLEAN supportdirtyflag;
    @XmlElement(name = "TIMING-EVENT-REF")
    protected NVBLOCKDESCRIPTOR.TIMINGEVENTREF timingeventref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??clientserverports?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKDESCRIPTOR.CLIENTSERVERPORTS }
     *     
     */
    public NVBLOCKDESCRIPTOR.CLIENTSERVERPORTS getCLIENTSERVERPORTS() {
        return clientserverports;
    }

    /**
     * ??clientserverports?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKDESCRIPTOR.CLIENTSERVERPORTS }
     *     
     */
    public void setCLIENTSERVERPORTS(NVBLOCKDESCRIPTOR.CLIENTSERVERPORTS value) {
        this.clientserverports = value;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS getCONSTANTVALUEMAPPINGREFS() {
        return constantvaluemappingrefs;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public void setCONSTANTVALUEMAPPINGREFS(NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS value) {
        this.constantvaluemappingrefs = value;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS }
     *     
     */
    public NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS getDATATYPEMAPPINGREFS() {
        return datatypemappingrefs;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS }
     *     
     */
    public void setDATATYPEMAPPINGREFS(NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS value) {
        this.datatypemappingrefs = value;
    }

    /**
     * ??instantiationdatadefpropss?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKDESCRIPTOR.INSTANTIATIONDATADEFPROPSS }
     *     
     */
    public NVBLOCKDESCRIPTOR.INSTANTIATIONDATADEFPROPSS getINSTANTIATIONDATADEFPROPSS() {
        return instantiationdatadefpropss;
    }

    /**
     * ??instantiationdatadefpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKDESCRIPTOR.INSTANTIATIONDATADEFPROPSS }
     *     
     */
    public void setINSTANTIATIONDATADEFPROPSS(NVBLOCKDESCRIPTOR.INSTANTIATIONDATADEFPROPSS value) {
        this.instantiationdatadefpropss = value;
    }

    /**
     * ??nvblockdatamappings?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKDESCRIPTOR.NVBLOCKDATAMAPPINGS }
     *     
     */
    public NVBLOCKDESCRIPTOR.NVBLOCKDATAMAPPINGS getNVBLOCKDATAMAPPINGS() {
        return nvblockdatamappings;
    }

    /**
     * ??nvblockdatamappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKDESCRIPTOR.NVBLOCKDATAMAPPINGS }
     *     
     */
    public void setNVBLOCKDATAMAPPINGS(NVBLOCKDESCRIPTOR.NVBLOCKDATAMAPPINGS value) {
        this.nvblockdatamappings = value;
    }

    /**
     * ??nvblockneeds?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKNEEDS }
     *     
     */
    public NVBLOCKNEEDS getNVBLOCKNEEDS() {
        return nvblockneeds;
    }

    /**
     * ??nvblockneeds?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKNEEDS }
     *     
     */
    public void setNVBLOCKNEEDS(NVBLOCKNEEDS value) {
        this.nvblockneeds = value;
    }

    /**
     * ??ramblock?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEDATAPROTOTYPE }
     *     
     */
    public VARIABLEDATAPROTOTYPE getRAMBLOCK() {
        return ramblock;
    }

    /**
     * ??ramblock?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEDATAPROTOTYPE }
     *     
     */
    public void setRAMBLOCK(VARIABLEDATAPROTOTYPE value) {
        this.ramblock = value;
    }

    /**
     * ??romblock?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERDATAPROTOTYPE }
     *     
     */
    public PARAMETERDATAPROTOTYPE getROMBLOCK() {
        return romblock;
    }

    /**
     * ??romblock?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERDATAPROTOTYPE }
     *     
     */
    public void setROMBLOCK(PARAMETERDATAPROTOTYPE value) {
        this.romblock = value;
    }

    /**
     * ??supportdirtyflag?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSUPPORTDIRTYFLAG() {
        return supportdirtyflag;
    }

    /**
     * ??supportdirtyflag?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSUPPORTDIRTYFLAG(BOOLEAN value) {
        this.supportdirtyflag = value;
    }

    /**
     * ??timingeventref?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKDESCRIPTOR.TIMINGEVENTREF }
     *     
     */
    public NVBLOCKDESCRIPTOR.TIMINGEVENTREF getTIMINGEVENTREF() {
        return timingeventref;
    }

    /**
     * ??timingeventref?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKDESCRIPTOR.TIMINGEVENTREF }
     *     
     */
    public void setTIMINGEVENTREF(NVBLOCKDESCRIPTOR.TIMINGEVENTREF value) {
        this.timingeventref = value;
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
     *         &lt;element name="ROLE-BASED-PORT-ASSIGNMENT" type="{http://autosar.org/schema/r4.0}ROLE-BASED-PORT-ASSIGNMENT"/>
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
        "rolebasedportassignment"
    })
    public static class CLIENTSERVERPORTS {

        @XmlElement(name = "ROLE-BASED-PORT-ASSIGNMENT")
        protected List<ROLEBASEDPORTASSIGNMENT> rolebasedportassignment;

        /**
         * Gets the value of the rolebasedportassignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rolebasedportassignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROLEBASEDPORTASSIGNMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROLEBASEDPORTASSIGNMENT }
         * 
         * 
         */
        public List<ROLEBASEDPORTASSIGNMENT> getROLEBASEDPORTASSIGNMENT() {
            if (rolebasedportassignment == null) {
                rolebasedportassignment = new ArrayList<ROLEBASEDPORTASSIGNMENT>();
            }
            return this.rolebasedportassignment;
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
     *         &lt;element name="CONSTANT-VALUE-MAPPING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING-SET--SUBTYPES-ENUM" />
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
        "constantvaluemappingref"
    })
    public static class CONSTANTVALUEMAPPINGREFS {

        @XmlElement(name = "CONSTANT-VALUE-MAPPING-REF")
        protected List<NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF> constantvaluemappingref;

        /**
         * Gets the value of the constantvaluemappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constantvaluemappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSTANTVALUEMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF }
         * 
         * 
         */
        public List<NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF> getCONSTANTVALUEMAPPINGREF() {
            if (constantvaluemappingref == null) {
                constantvaluemappingref = new ArrayList<NVBLOCKDESCRIPTOR.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF>();
            }
            return this.constantvaluemappingref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONSTANTVALUEMAPPINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM }
             *     
             */
            public CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM }
             *     
             */
            public void setDEST(CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM value) {
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
     *         &lt;element name="DATA-TYPE-MAPPING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-TYPE-MAPPING-SET--SUBTYPES-ENUM" />
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
        "datatypemappingref"
    })
    public static class DATATYPEMAPPINGREFS {

        @XmlElement(name = "DATA-TYPE-MAPPING-REF")
        protected List<NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> datatypemappingref;

        /**
         * Gets the value of the datatypemappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datatypemappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATATYPEMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF }
         * 
         * 
         */
        public List<NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> getDATATYPEMAPPINGREF() {
            if (datatypemappingref == null) {
                datatypemappingref = new ArrayList<NVBLOCKDESCRIPTOR.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF>();
            }
            return this.datatypemappingref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-TYPE-MAPPING-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DATATYPEMAPPINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected DATATYPEMAPPINGSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link DATATYPEMAPPINGSETSUBTYPESENUM }
             *     
             */
            public DATATYPEMAPPINGSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link DATATYPEMAPPINGSETSUBTYPESENUM }
             *     
             */
            public void setDEST(DATATYPEMAPPINGSETSUBTYPESENUM value) {
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
     *         &lt;element name="INSTANTIATION-DATA-DEF-PROPS" type="{http://autosar.org/schema/r4.0}INSTANTIATION-DATA-DEF-PROPS"/>
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
        "instantiationdatadefprops"
    })
    public static class INSTANTIATIONDATADEFPROPSS {

        @XmlElement(name = "INSTANTIATION-DATA-DEF-PROPS")
        protected List<INSTANTIATIONDATADEFPROPS> instantiationdatadefprops;

        /**
         * Gets the value of the instantiationdatadefprops property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instantiationdatadefprops property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSTANTIATIONDATADEFPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSTANTIATIONDATADEFPROPS }
         * 
         * 
         */
        public List<INSTANTIATIONDATADEFPROPS> getINSTANTIATIONDATADEFPROPS() {
            if (instantiationdatadefprops == null) {
                instantiationdatadefprops = new ArrayList<INSTANTIATIONDATADEFPROPS>();
            }
            return this.instantiationdatadefprops;
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
     *         &lt;element name="NV-BLOCK-DATA-MAPPING" type="{http://autosar.org/schema/r4.0}NV-BLOCK-DATA-MAPPING"/>
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
        "nvblockdatamapping"
    })
    public static class NVBLOCKDATAMAPPINGS {

        @XmlElement(name = "NV-BLOCK-DATA-MAPPING")
        protected List<NVBLOCKDATAMAPPING> nvblockdatamapping;

        /**
         * Gets the value of the nvblockdatamapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nvblockdatamapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNVBLOCKDATAMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NVBLOCKDATAMAPPING }
         * 
         * 
         */
        public List<NVBLOCKDATAMAPPING> getNVBLOCKDATAMAPPING() {
            if (nvblockdatamapping == null) {
                nvblockdatamapping = new ArrayList<NVBLOCKDATAMAPPING>();
            }
            return this.nvblockdatamapping;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TIMING-EVENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TIMINGEVENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TIMINGEVENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TIMINGEVENTSUBTYPESENUM }
         *     
         */
        public TIMINGEVENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TIMINGEVENTSUBTYPESENUM }
         *     
         */
        public void setDEST(TIMINGEVENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
