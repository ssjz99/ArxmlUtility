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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The system mapping aggregates all mapping aspects (mapping of SW components to ECUs, mapping of data elements to signals, and mapping constraints).
 * 
 * <p>SYSTEM-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SYSTEM-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SYSTEM-MAPPING"/>
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
@XmlType(name = "SYSTEM-MAPPING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "datamappings",
    "ecuresourcemappings",
    "mappingconstraints",
    "pncmappings",
    "resourceestimations",
    "signalpathconstraints",
    "swimplmappings",
    "swmappings",
    "variationpoint"
})
public class SYSTEMMAPPING {

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
    @XmlElement(name = "DATA-MAPPINGS")
    protected SYSTEMMAPPING.DATAMAPPINGS datamappings;
    @XmlElement(name = "ECU-RESOURCE-MAPPINGS")
    protected SYSTEMMAPPING.ECURESOURCEMAPPINGS ecuresourcemappings;
    @XmlElement(name = "MAPPING-CONSTRAINTS")
    protected SYSTEMMAPPING.MAPPINGCONSTRAINTS mappingconstraints;
    @XmlElement(name = "PNC-MAPPINGS")
    protected SYSTEMMAPPING.PNCMAPPINGS pncmappings;
    @XmlElement(name = "RESOURCE-ESTIMATIONS")
    protected SYSTEMMAPPING.RESOURCEESTIMATIONS resourceestimations;
    @XmlElement(name = "SIGNAL-PATH-CONSTRAINTS")
    protected SYSTEMMAPPING.SIGNALPATHCONSTRAINTS signalpathconstraints;
    @XmlElement(name = "SW-IMPL-MAPPINGS")
    protected SYSTEMMAPPING.SWIMPLMAPPINGS swimplmappings;
    @XmlElement(name = "SW-MAPPINGS")
    protected SYSTEMMAPPING.SWMAPPINGS swmappings;
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
     * ??datamappings?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.DATAMAPPINGS }
     *     
     */
    public SYSTEMMAPPING.DATAMAPPINGS getDATAMAPPINGS() {
        return datamappings;
    }

    /**
     * ??datamappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.DATAMAPPINGS }
     *     
     */
    public void setDATAMAPPINGS(SYSTEMMAPPING.DATAMAPPINGS value) {
        this.datamappings = value;
    }

    /**
     * ??ecuresourcemappings?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.ECURESOURCEMAPPINGS }
     *     
     */
    public SYSTEMMAPPING.ECURESOURCEMAPPINGS getECURESOURCEMAPPINGS() {
        return ecuresourcemappings;
    }

    /**
     * ??ecuresourcemappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.ECURESOURCEMAPPINGS }
     *     
     */
    public void setECURESOURCEMAPPINGS(SYSTEMMAPPING.ECURESOURCEMAPPINGS value) {
        this.ecuresourcemappings = value;
    }

    /**
     * ??mappingconstraints?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.MAPPINGCONSTRAINTS }
     *     
     */
    public SYSTEMMAPPING.MAPPINGCONSTRAINTS getMAPPINGCONSTRAINTS() {
        return mappingconstraints;
    }

    /**
     * ??mappingconstraints?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.MAPPINGCONSTRAINTS }
     *     
     */
    public void setMAPPINGCONSTRAINTS(SYSTEMMAPPING.MAPPINGCONSTRAINTS value) {
        this.mappingconstraints = value;
    }

    /**
     * ??pncmappings?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.PNCMAPPINGS }
     *     
     */
    public SYSTEMMAPPING.PNCMAPPINGS getPNCMAPPINGS() {
        return pncmappings;
    }

    /**
     * ??pncmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.PNCMAPPINGS }
     *     
     */
    public void setPNCMAPPINGS(SYSTEMMAPPING.PNCMAPPINGS value) {
        this.pncmappings = value;
    }

    /**
     * ??resourceestimations?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.RESOURCEESTIMATIONS }
     *     
     */
    public SYSTEMMAPPING.RESOURCEESTIMATIONS getRESOURCEESTIMATIONS() {
        return resourceestimations;
    }

    /**
     * ??resourceestimations?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.RESOURCEESTIMATIONS }
     *     
     */
    public void setRESOURCEESTIMATIONS(SYSTEMMAPPING.RESOURCEESTIMATIONS value) {
        this.resourceestimations = value;
    }

    /**
     * ??signalpathconstraints?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.SIGNALPATHCONSTRAINTS }
     *     
     */
    public SYSTEMMAPPING.SIGNALPATHCONSTRAINTS getSIGNALPATHCONSTRAINTS() {
        return signalpathconstraints;
    }

    /**
     * ??signalpathconstraints?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.SIGNALPATHCONSTRAINTS }
     *     
     */
    public void setSIGNALPATHCONSTRAINTS(SYSTEMMAPPING.SIGNALPATHCONSTRAINTS value) {
        this.signalpathconstraints = value;
    }

    /**
     * ??swimplmappings?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.SWIMPLMAPPINGS }
     *     
     */
    public SYSTEMMAPPING.SWIMPLMAPPINGS getSWIMPLMAPPINGS() {
        return swimplmappings;
    }

    /**
     * ??swimplmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.SWIMPLMAPPINGS }
     *     
     */
    public void setSWIMPLMAPPINGS(SYSTEMMAPPING.SWIMPLMAPPINGS value) {
        this.swimplmappings = value;
    }

    /**
     * ??swmappings?????
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMMAPPING.SWMAPPINGS }
     *     
     */
    public SYSTEMMAPPING.SWMAPPINGS getSWMAPPINGS() {
        return swmappings;
    }

    /**
     * ??swmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMMAPPING.SWMAPPINGS }
     *     
     */
    public void setSWMAPPINGS(SYSTEMMAPPING.SWMAPPINGS value) {
        this.swmappings = value;
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
     *         &lt;element name="CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING"/>
     *         &lt;element name="CLIENT-SERVER-TO-SIGNAL-MAPPING" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-TO-SIGNAL-MAPPING"/>
     *         &lt;element name="SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING" type="{http://autosar.org/schema/r4.0}SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING"/>
     *         &lt;element name="SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING" type="{http://autosar.org/schema/r4.0}SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING"/>
     *         &lt;element name="SENDER-RECEIVER-TO-SIGNAL-MAPPING" type="{http://autosar.org/schema/r4.0}SENDER-RECEIVER-TO-SIGNAL-MAPPING"/>
     *         &lt;element name="TRIGGER-TO-SIGNAL-MAPPING" type="{http://autosar.org/schema/r4.0}TRIGGER-TO-SIGNAL-MAPPING"/>
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
        "clientservertosignalgroupmappingOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING"
    })
    public static class DATAMAPPINGS {

        @XmlElements({
            @XmlElement(name = "CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING", type = CLIENTSERVERTOSIGNALGROUPMAPPING.class),
            @XmlElement(name = "CLIENT-SERVER-TO-SIGNAL-MAPPING", type = CLIENTSERVERTOSIGNALMAPPING.class),
            @XmlElement(name = "SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING", type = SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.class),
            @XmlElement(name = "SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING", type = SENDERRECEIVERTOSIGNALGROUPMAPPING.class),
            @XmlElement(name = "SENDER-RECEIVER-TO-SIGNAL-MAPPING", type = SENDERRECEIVERTOSIGNALMAPPING.class),
            @XmlElement(name = "TRIGGER-TO-SIGNAL-MAPPING", type = TRIGGERTOSIGNALMAPPING.class)
        })
        protected List<Object> clientservertosignalgroupmappingOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING;

        /**
         * Gets the value of the clientservertosignalgroupmappingOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientservertosignalgroupmappingOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTSERVERTOSIGNALGROUPMAPPINGOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CLIENTSERVERTOSIGNALGROUPMAPPING }
         * {@link CLIENTSERVERTOSIGNALMAPPING }
         * {@link SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING }
         * {@link SENDERRECEIVERTOSIGNALGROUPMAPPING }
         * {@link SENDERRECEIVERTOSIGNALMAPPING }
         * {@link TRIGGERTOSIGNALMAPPING }
         * 
         * 
         */
        public List<Object> getCLIENTSERVERTOSIGNALGROUPMAPPINGOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING() {
            if (clientservertosignalgroupmappingOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING == null) {
                clientservertosignalgroupmappingOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING = new ArrayList<Object>();
            }
            return this.clientservertosignalgroupmappingOrCLIENTSERVERTOSIGNALMAPPINGOrSENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING;
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
     *         &lt;element name="ECU-MAPPING" type="{http://autosar.org/schema/r4.0}ECU-MAPPING"/>
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
        "ecumapping"
    })
    public static class ECURESOURCEMAPPINGS {

        @XmlElement(name = "ECU-MAPPING")
        protected List<ECUMAPPING> ecumapping;

        /**
         * Gets the value of the ecumapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecumapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUMAPPING }
         * 
         * 
         */
        public List<ECUMAPPING> getECUMAPPING() {
            if (ecumapping == null) {
                ecumapping = new ArrayList<ECUMAPPING>();
            }
            return this.ecumapping;
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
     *         &lt;element name="COMPONENT-CLUSTERING" type="{http://autosar.org/schema/r4.0}COMPONENT-CLUSTERING"/>
     *         &lt;element name="COMPONENT-SEPARATION" type="{http://autosar.org/schema/r4.0}COMPONENT-SEPARATION"/>
     *         &lt;element name="SWC-TO-ECU-MAPPING-CONSTRAINT" type="{http://autosar.org/schema/r4.0}SWC-TO-ECU-MAPPING-CONSTRAINT"/>
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
        "componentclusteringOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT"
    })
    public static class MAPPINGCONSTRAINTS {

        @XmlElements({
            @XmlElement(name = "COMPONENT-CLUSTERING", type = COMPONENTCLUSTERING.class),
            @XmlElement(name = "COMPONENT-SEPARATION", type = COMPONENTSEPARATION.class),
            @XmlElement(name = "SWC-TO-ECU-MAPPING-CONSTRAINT", type = SWCTOECUMAPPINGCONSTRAINT.class)
        })
        protected List<Object> componentclusteringOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT;

        /**
         * Gets the value of the componentclusteringOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the componentclusteringOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMPONENTCLUSTERINGOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPONENTCLUSTERING }
         * {@link COMPONENTSEPARATION }
         * {@link SWCTOECUMAPPINGCONSTRAINT }
         * 
         * 
         */
        public List<Object> getCOMPONENTCLUSTERINGOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT() {
            if (componentclusteringOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT == null) {
                componentclusteringOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT = new ArrayList<Object>();
            }
            return this.componentclusteringOrCOMPONENTSEPARATIONOrSWCTOECUMAPPINGCONSTRAINT;
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
     *         &lt;element name="PNC-MAPPING" type="{http://autosar.org/schema/r4.0}PNC-MAPPING"/>
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
        "pncmapping"
    })
    public static class PNCMAPPINGS {

        @XmlElement(name = "PNC-MAPPING")
        protected List<PNCMAPPING> pncmapping;

        /**
         * Gets the value of the pncmapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pncmapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPNCMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNCMAPPING }
         * 
         * 
         */
        public List<PNCMAPPING> getPNCMAPPING() {
            if (pncmapping == null) {
                pncmapping = new ArrayList<PNCMAPPING>();
            }
            return this.pncmapping;
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
     *         &lt;element name="ECU-RESOURCE-ESTIMATION" type="{http://autosar.org/schema/r4.0}ECU-RESOURCE-ESTIMATION"/>
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
        "ecuresourceestimation"
    })
    public static class RESOURCEESTIMATIONS {

        @XmlElement(name = "ECU-RESOURCE-ESTIMATION")
        protected List<ECURESOURCEESTIMATION> ecuresourceestimation;

        /**
         * Gets the value of the ecuresourceestimation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecuresourceestimation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECURESOURCEESTIMATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECURESOURCEESTIMATION }
         * 
         * 
         */
        public List<ECURESOURCEESTIMATION> getECURESOURCEESTIMATION() {
            if (ecuresourceestimation == null) {
                ecuresourceestimation = new ArrayList<ECURESOURCEESTIMATION>();
            }
            return this.ecuresourceestimation;
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
     *         &lt;element name="COMMON-SIGNAL-PATH" type="{http://autosar.org/schema/r4.0}COMMON-SIGNAL-PATH"/>
     *         &lt;element name="FORBIDDEN-SIGNAL-PATH" type="{http://autosar.org/schema/r4.0}FORBIDDEN-SIGNAL-PATH"/>
     *         &lt;element name="PERMISSIBLE-SIGNAL-PATH" type="{http://autosar.org/schema/r4.0}PERMISSIBLE-SIGNAL-PATH"/>
     *         &lt;element name="SEPARATE-SIGNAL-PATH" type="{http://autosar.org/schema/r4.0}SEPARATE-SIGNAL-PATH"/>
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
        "commonsignalpathOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH"
    })
    public static class SIGNALPATHCONSTRAINTS {

        @XmlElements({
            @XmlElement(name = "COMMON-SIGNAL-PATH", type = COMMONSIGNALPATH.class),
            @XmlElement(name = "FORBIDDEN-SIGNAL-PATH", type = FORBIDDENSIGNALPATH.class),
            @XmlElement(name = "PERMISSIBLE-SIGNAL-PATH", type = PERMISSIBLESIGNALPATH.class),
            @XmlElement(name = "SEPARATE-SIGNAL-PATH", type = SEPARATESIGNALPATH.class)
        })
        protected List<Object> commonsignalpathOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH;

        /**
         * Gets the value of the commonsignalpathOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commonsignalpathOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMMONSIGNALPATHOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMMONSIGNALPATH }
         * {@link FORBIDDENSIGNALPATH }
         * {@link PERMISSIBLESIGNALPATH }
         * {@link SEPARATESIGNALPATH }
         * 
         * 
         */
        public List<Object> getCOMMONSIGNALPATHOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH() {
            if (commonsignalpathOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH == null) {
                commonsignalpathOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH = new ArrayList<Object>();
            }
            return this.commonsignalpathOrFORBIDDENSIGNALPATHOrPERMISSIBLESIGNALPATH;
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
     *         &lt;element name="SWC-TO-IMPL-MAPPING" type="{http://autosar.org/schema/r4.0}SWC-TO-IMPL-MAPPING"/>
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
        "swctoimplmapping"
    })
    public static class SWIMPLMAPPINGS {

        @XmlElement(name = "SWC-TO-IMPL-MAPPING")
        protected List<SWCTOIMPLMAPPING> swctoimplmapping;

        /**
         * Gets the value of the swctoimplmapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swctoimplmapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCTOIMPLMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCTOIMPLMAPPING }
         * 
         * 
         */
        public List<SWCTOIMPLMAPPING> getSWCTOIMPLMAPPING() {
            if (swctoimplmapping == null) {
                swctoimplmapping = new ArrayList<SWCTOIMPLMAPPING>();
            }
            return this.swctoimplmapping;
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
     *         &lt;element name="SWC-TO-ECU-MAPPING" type="{http://autosar.org/schema/r4.0}SWC-TO-ECU-MAPPING"/>
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
        "swctoecumapping"
    })
    public static class SWMAPPINGS {

        @XmlElement(name = "SWC-TO-ECU-MAPPING")
        protected List<SWCTOECUMAPPING> swctoecumapping;

        /**
         * Gets the value of the swctoecumapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swctoecumapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCTOECUMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCTOECUMAPPING }
         * 
         * 
         */
        public List<SWCTOECUMAPPING> getSWCTOECUMAPPING() {
            if (swctoecumapping == null) {
                swctoecumapping = new ArrayList<SWCTOECUMAPPING>();
            }
            return this.swctoecumapping;
        }

    }

}
