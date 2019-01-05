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
 * The top level element of the System Description.
 * The System description defines five major elements: Topology, Software, Communication, Mapping and Mapping Constraints.
 * 
 * The System element directly aggregates the elements describing the Software, Mapping and Mapping Constraints; it contains a reference to an ASAM FIBEX description specifying Communication and Topology.
 * 
 * <p>SYSTEM complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SYSTEM">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-STRUCTURE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SYSTEM"/>
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
@XmlType(name = "SYSTEM", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "systemdocumentations",
    "clientiddefinitionsetrefs",
    "containeripduheaderbyteorder",
    "ecuextractversion",
    "fibexelements",
    "mappings",
    "pncvectorlength",
    "pncvectoroffset",
    "rootsoftwarecompositions",
    "systemversion"
})
public class SYSTEM {

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
    @XmlElement(name = "SYSTEM-DOCUMENTATIONS")
    protected SYSTEM.SYSTEMDOCUMENTATIONS systemdocumentations;
    @XmlElement(name = "CLIENT-ID-DEFINITION-SET-REFS")
    protected SYSTEM.CLIENTIDDEFINITIONSETREFS clientiddefinitionsetrefs;
    @XmlElement(name = "CONTAINER-I-PDU-HEADER-BYTE-ORDER")
    protected BYTEORDERENUM containeripduheaderbyteorder;
    @XmlElement(name = "ECU-EXTRACT-VERSION")
    protected REVISIONLABELSTRING ecuextractversion;
    @XmlElement(name = "FIBEX-ELEMENTS")
    protected SYSTEM.FIBEXELEMENTS fibexelements;
    @XmlElement(name = "MAPPINGS")
    protected SYSTEM.MAPPINGS mappings;
    @XmlElement(name = "PNC-VECTOR-LENGTH")
    protected POSITIVEINTEGER pncvectorlength;
    @XmlElement(name = "PNC-VECTOR-OFFSET")
    protected POSITIVEINTEGER pncvectoroffset;
    @XmlElement(name = "ROOT-SOFTWARE-COMPOSITIONS")
    protected SYSTEM.ROOTSOFTWARECOMPOSITIONS rootsoftwarecompositions;
    @XmlElement(name = "SYSTEM-VERSION")
    protected REVISIONLABELSTRING systemversion;
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
     * ??systemdocumentations?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEM.SYSTEMDOCUMENTATIONS }
     *     
     */
    public SYSTEM.SYSTEMDOCUMENTATIONS getSYSTEMDOCUMENTATIONS() {
        return systemdocumentations;
    }

    /**
     * ??systemdocumentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEM.SYSTEMDOCUMENTATIONS }
     *     
     */
    public void setSYSTEMDOCUMENTATIONS(SYSTEM.SYSTEMDOCUMENTATIONS value) {
        this.systemdocumentations = value;
    }

    /**
     * ??clientiddefinitionsetrefs?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEM.CLIENTIDDEFINITIONSETREFS }
     *     
     */
    public SYSTEM.CLIENTIDDEFINITIONSETREFS getCLIENTIDDEFINITIONSETREFS() {
        return clientiddefinitionsetrefs;
    }

    /**
     * ??clientiddefinitionsetrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEM.CLIENTIDDEFINITIONSETREFS }
     *     
     */
    public void setCLIENTIDDEFINITIONSETREFS(SYSTEM.CLIENTIDDEFINITIONSETREFS value) {
        this.clientiddefinitionsetrefs = value;
    }

    /**
     * ??containeripduheaderbyteorder?????
     * 
     * @return
     *     possible object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public BYTEORDERENUM getCONTAINERIPDUHEADERBYTEORDER() {
        return containeripduheaderbyteorder;
    }

    /**
     * ??containeripduheaderbyteorder?????
     * 
     * @param value
     *     allowed object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public void setCONTAINERIPDUHEADERBYTEORDER(BYTEORDERENUM value) {
        this.containeripduheaderbyteorder = value;
    }

    /**
     * ??ecuextractversion?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getECUEXTRACTVERSION() {
        return ecuextractversion;
    }

    /**
     * ??ecuextractversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setECUEXTRACTVERSION(REVISIONLABELSTRING value) {
        this.ecuextractversion = value;
    }

    /**
     * ??fibexelements?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEM.FIBEXELEMENTS }
     *     
     */
    public SYSTEM.FIBEXELEMENTS getFIBEXELEMENTS() {
        return fibexelements;
    }

    /**
     * ??fibexelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEM.FIBEXELEMENTS }
     *     
     */
    public void setFIBEXELEMENTS(SYSTEM.FIBEXELEMENTS value) {
        this.fibexelements = value;
    }

    /**
     * ??mappings?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEM.MAPPINGS }
     *     
     */
    public SYSTEM.MAPPINGS getMAPPINGS() {
        return mappings;
    }

    /**
     * ??mappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEM.MAPPINGS }
     *     
     */
    public void setMAPPINGS(SYSTEM.MAPPINGS value) {
        this.mappings = value;
    }

    /**
     * ??pncvectorlength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPNCVECTORLENGTH() {
        return pncvectorlength;
    }

    /**
     * ??pncvectorlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPNCVECTORLENGTH(POSITIVEINTEGER value) {
        this.pncvectorlength = value;
    }

    /**
     * ??pncvectoroffset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPNCVECTOROFFSET() {
        return pncvectoroffset;
    }

    /**
     * ??pncvectoroffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPNCVECTOROFFSET(POSITIVEINTEGER value) {
        this.pncvectoroffset = value;
    }

    /**
     * ??rootsoftwarecompositions?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEM.ROOTSOFTWARECOMPOSITIONS }
     *     
     */
    public SYSTEM.ROOTSOFTWARECOMPOSITIONS getROOTSOFTWARECOMPOSITIONS() {
        return rootsoftwarecompositions;
    }

    /**
     * ??rootsoftwarecompositions?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEM.ROOTSOFTWARECOMPOSITIONS }
     *     
     */
    public void setROOTSOFTWARECOMPOSITIONS(SYSTEM.ROOTSOFTWARECOMPOSITIONS value) {
        this.rootsoftwarecompositions = value;
    }

    /**
     * ??systemversion?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getSYSTEMVERSION() {
        return systemversion;
    }

    /**
     * ??systemversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setSYSTEMVERSION(REVISIONLABELSTRING value) {
        this.systemversion = value;
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
     *         &lt;element name="CLIENT-ID-DEFINITION-SET-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CLIENT-ID-DEFINITION-SET--SUBTYPES-ENUM" />
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
        "clientiddefinitionsetref"
    })
    public static class CLIENTIDDEFINITIONSETREFS {

        @XmlElement(name = "CLIENT-ID-DEFINITION-SET-REF")
        protected List<SYSTEM.CLIENTIDDEFINITIONSETREFS.CLIENTIDDEFINITIONSETREF> clientiddefinitionsetref;

        /**
         * Gets the value of the clientiddefinitionsetref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientiddefinitionsetref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTIDDEFINITIONSETREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SYSTEM.CLIENTIDDEFINITIONSETREFS.CLIENTIDDEFINITIONSETREF }
         * 
         * 
         */
        public List<SYSTEM.CLIENTIDDEFINITIONSETREFS.CLIENTIDDEFINITIONSETREF> getCLIENTIDDEFINITIONSETREF() {
            if (clientiddefinitionsetref == null) {
                clientiddefinitionsetref = new ArrayList<SYSTEM.CLIENTIDDEFINITIONSETREFS.CLIENTIDDEFINITIONSETREF>();
            }
            return this.clientiddefinitionsetref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CLIENT-ID-DEFINITION-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CLIENTIDDEFINITIONSETREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CLIENTIDDEFINITIONSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CLIENTIDDEFINITIONSETSUBTYPESENUM }
             *     
             */
            public CLIENTIDDEFINITIONSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CLIENTIDDEFINITIONSETSUBTYPESENUM }
             *     
             */
            public void setDEST(CLIENTIDDEFINITIONSETSUBTYPESENUM value) {
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
     *         &lt;element name="FIBEX-ELEMENT-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}FIBEX-ELEMENT-REF-CONDITIONAL"/>
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
        "fibexelementrefconditional"
    })
    public static class FIBEXELEMENTS {

        @XmlElement(name = "FIBEX-ELEMENT-REF-CONDITIONAL")
        protected List<FIBEXELEMENTREFCONDITIONAL> fibexelementrefconditional;

        /**
         * Gets the value of the fibexelementrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fibexelementrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFIBEXELEMENTREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FIBEXELEMENTREFCONDITIONAL }
         * 
         * 
         */
        public List<FIBEXELEMENTREFCONDITIONAL> getFIBEXELEMENTREFCONDITIONAL() {
            if (fibexelementrefconditional == null) {
                fibexelementrefconditional = new ArrayList<FIBEXELEMENTREFCONDITIONAL>();
            }
            return this.fibexelementrefconditional;
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
     *         &lt;element name="SYSTEM-MAPPING" type="{http://autosar.org/schema/r4.0}SYSTEM-MAPPING"/>
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
        "systemmapping"
    })
    public static class MAPPINGS {

        @XmlElement(name = "SYSTEM-MAPPING")
        protected List<SYSTEMMAPPING> systemmapping;

        /**
         * Gets the value of the systemmapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the systemmapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSYSTEMMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SYSTEMMAPPING }
         * 
         * 
         */
        public List<SYSTEMMAPPING> getSYSTEMMAPPING() {
            if (systemmapping == null) {
                systemmapping = new ArrayList<SYSTEMMAPPING>();
            }
            return this.systemmapping;
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
     *         &lt;element name="ROOT-SW-COMPOSITION-PROTOTYPE" type="{http://autosar.org/schema/r4.0}ROOT-SW-COMPOSITION-PROTOTYPE"/>
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
        "rootswcompositionprototype"
    })
    public static class ROOTSOFTWARECOMPOSITIONS {

        @XmlElement(name = "ROOT-SW-COMPOSITION-PROTOTYPE")
        protected List<ROOTSWCOMPOSITIONPROTOTYPE> rootswcompositionprototype;

        /**
         * Gets the value of the rootswcompositionprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rootswcompositionprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROOTSWCOMPOSITIONPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROOTSWCOMPOSITIONPROTOTYPE }
         * 
         * 
         */
        public List<ROOTSWCOMPOSITIONPROTOTYPE> getROOTSWCOMPOSITIONPROTOTYPE() {
            if (rootswcompositionprototype == null) {
                rootswcompositionprototype = new ArrayList<ROOTSWCOMPOSITIONPROTOTYPE>();
            }
            return this.rootswcompositionprototype;
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
     *         &lt;element name="CHAPTER" type="{http://autosar.org/schema/r4.0}CHAPTER"/>
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
        "chapter"
    })
    public static class SYSTEMDOCUMENTATIONS {

        @XmlElement(name = "CHAPTER")
        protected List<CHAPTER> chapter;

        /**
         * Gets the value of the chapter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chapter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHAPTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CHAPTER }
         * 
         * 
         */
        public List<CHAPTER> getCHAPTER() {
            if (chapter == null) {
                chapter = new ArrayList<CHAPTER>();
            }
            return this.chapter;
        }

    }

}
