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
 * This kind of PortPrototype can take the role of both a required and a provided PortPrototype.
 * 
 * <p>PR-PORT-PROTOTYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PR-PORT-PROTOTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-FEATURE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-PROVIDED-PORT-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-REQUIRED-PORT-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PR-PORT-PROTOTYPE"/>
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
@XmlType(name = "PR-PORT-PROTOTYPE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "clientserverannotations",
    "delegatedportannotation",
    "iohwabstractionserverannotations",
    "modeportannotations",
    "nvdataportannotations",
    "parameterportannotations",
    "senderreceiverannotations",
    "triggerportannotations",
    "variationpoint",
    "providedcomspecs",
    "requiredcomspecs",
    "providedrequiredinterfacetref"
})
public class PRPORTPROTOTYPE {

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
    @XmlElement(name = "CLIENT-SERVER-ANNOTATIONS")
    protected PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS clientserverannotations;
    @XmlElement(name = "DELEGATED-PORT-ANNOTATION")
    protected DELEGATEDPORTANNOTATION delegatedportannotation;
    @XmlElement(name = "IO-HW-ABSTRACTION-SERVER-ANNOTATIONS")
    protected PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS iohwabstractionserverannotations;
    @XmlElement(name = "MODE-PORT-ANNOTATIONS")
    protected PRPORTPROTOTYPE.MODEPORTANNOTATIONS modeportannotations;
    @XmlElement(name = "NV-DATA-PORT-ANNOTATIONS")
    protected PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS nvdataportannotations;
    @XmlElement(name = "PARAMETER-PORT-ANNOTATIONS")
    protected PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS parameterportannotations;
    @XmlElement(name = "SENDER-RECEIVER-ANNOTATIONS")
    protected PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS senderreceiverannotations;
    @XmlElement(name = "TRIGGER-PORT-ANNOTATIONS")
    protected PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS triggerportannotations;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "PROVIDED-COM-SPECS")
    protected PRPORTPROTOTYPE.PROVIDEDCOMSPECS providedcomspecs;
    @XmlElement(name = "REQUIRED-COM-SPECS")
    protected PRPORTPROTOTYPE.REQUIREDCOMSPECS requiredcomspecs;
    @XmlElement(name = "PROVIDED-REQUIRED-INTERFACE-TREF")
    protected PRPORTPROTOTYPE.PROVIDEDREQUIREDINTERFACETREF providedrequiredinterfacetref;
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
     * ??clientserverannotations?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS }
     *     
     */
    public PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS getCLIENTSERVERANNOTATIONS() {
        return clientserverannotations;
    }

    /**
     * ??clientserverannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS }
     *     
     */
    public void setCLIENTSERVERANNOTATIONS(PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS value) {
        this.clientserverannotations = value;
    }

    /**
     * ??delegatedportannotation?????
     * 
     * @return
     *     possible object is
     *     {@link DELEGATEDPORTANNOTATION }
     *     
     */
    public DELEGATEDPORTANNOTATION getDELEGATEDPORTANNOTATION() {
        return delegatedportannotation;
    }

    /**
     * ??delegatedportannotation?????
     * 
     * @param value
     *     allowed object is
     *     {@link DELEGATEDPORTANNOTATION }
     *     
     */
    public void setDELEGATEDPORTANNOTATION(DELEGATEDPORTANNOTATION value) {
        this.delegatedportannotation = value;
    }

    /**
     * ??iohwabstractionserverannotations?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS }
     *     
     */
    public PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS getIOHWABSTRACTIONSERVERANNOTATIONS() {
        return iohwabstractionserverannotations;
    }

    /**
     * ??iohwabstractionserverannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS }
     *     
     */
    public void setIOHWABSTRACTIONSERVERANNOTATIONS(PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS value) {
        this.iohwabstractionserverannotations = value;
    }

    /**
     * ??modeportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.MODEPORTANNOTATIONS }
     *     
     */
    public PRPORTPROTOTYPE.MODEPORTANNOTATIONS getMODEPORTANNOTATIONS() {
        return modeportannotations;
    }

    /**
     * ??modeportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.MODEPORTANNOTATIONS }
     *     
     */
    public void setMODEPORTANNOTATIONS(PRPORTPROTOTYPE.MODEPORTANNOTATIONS value) {
        this.modeportannotations = value;
    }

    /**
     * ??nvdataportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS }
     *     
     */
    public PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS getNVDATAPORTANNOTATIONS() {
        return nvdataportannotations;
    }

    /**
     * ??nvdataportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS }
     *     
     */
    public void setNVDATAPORTANNOTATIONS(PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS value) {
        this.nvdataportannotations = value;
    }

    /**
     * ??parameterportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS }
     *     
     */
    public PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS getPARAMETERPORTANNOTATIONS() {
        return parameterportannotations;
    }

    /**
     * ??parameterportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS }
     *     
     */
    public void setPARAMETERPORTANNOTATIONS(PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS value) {
        this.parameterportannotations = value;
    }

    /**
     * ??senderreceiverannotations?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS }
     *     
     */
    public PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS getSENDERRECEIVERANNOTATIONS() {
        return senderreceiverannotations;
    }

    /**
     * ??senderreceiverannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS }
     *     
     */
    public void setSENDERRECEIVERANNOTATIONS(PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS value) {
        this.senderreceiverannotations = value;
    }

    /**
     * ??triggerportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS }
     *     
     */
    public PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS getTRIGGERPORTANNOTATIONS() {
        return triggerportannotations;
    }

    /**
     * ??triggerportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS }
     *     
     */
    public void setTRIGGERPORTANNOTATIONS(PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS value) {
        this.triggerportannotations = value;
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
     * ??providedcomspecs?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.PROVIDEDCOMSPECS }
     *     
     */
    public PRPORTPROTOTYPE.PROVIDEDCOMSPECS getPROVIDEDCOMSPECS() {
        return providedcomspecs;
    }

    /**
     * ??providedcomspecs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.PROVIDEDCOMSPECS }
     *     
     */
    public void setPROVIDEDCOMSPECS(PRPORTPROTOTYPE.PROVIDEDCOMSPECS value) {
        this.providedcomspecs = value;
    }

    /**
     * ??requiredcomspecs?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.REQUIREDCOMSPECS }
     *     
     */
    public PRPORTPROTOTYPE.REQUIREDCOMSPECS getREQUIREDCOMSPECS() {
        return requiredcomspecs;
    }

    /**
     * ??requiredcomspecs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.REQUIREDCOMSPECS }
     *     
     */
    public void setREQUIREDCOMSPECS(PRPORTPROTOTYPE.REQUIREDCOMSPECS value) {
        this.requiredcomspecs = value;
    }

    /**
     * ??providedrequiredinterfacetref?????
     * 
     * @return
     *     possible object is
     *     {@link PRPORTPROTOTYPE.PROVIDEDREQUIREDINTERFACETREF }
     *     
     */
    public PRPORTPROTOTYPE.PROVIDEDREQUIREDINTERFACETREF getPROVIDEDREQUIREDINTERFACETREF() {
        return providedrequiredinterfacetref;
    }

    /**
     * ??providedrequiredinterfacetref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PRPORTPROTOTYPE.PROVIDEDREQUIREDINTERFACETREF }
     *     
     */
    public void setPROVIDEDREQUIREDINTERFACETREF(PRPORTPROTOTYPE.PROVIDEDREQUIREDINTERFACETREF value) {
        this.providedrequiredinterfacetref = value;
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
     *         &lt;element name="CLIENT-SERVER-ANNOTATION" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-ANNOTATION"/>
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
        "clientserverannotation"
    })
    public static class CLIENTSERVERANNOTATIONS {

        @XmlElement(name = "CLIENT-SERVER-ANNOTATION")
        protected List<CLIENTSERVERANNOTATION> clientserverannotation;

        /**
         * Gets the value of the clientserverannotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientserverannotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTSERVERANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CLIENTSERVERANNOTATION }
         * 
         * 
         */
        public List<CLIENTSERVERANNOTATION> getCLIENTSERVERANNOTATION() {
            if (clientserverannotation == null) {
                clientserverannotation = new ArrayList<CLIENTSERVERANNOTATION>();
            }
            return this.clientserverannotation;
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
     *         &lt;element name="IO-HW-ABSTRACTION-SERVER-ANNOTATION" type="{http://autosar.org/schema/r4.0}IO-HW-ABSTRACTION-SERVER-ANNOTATION"/>
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
        "iohwabstractionserverannotation"
    })
    public static class IOHWABSTRACTIONSERVERANNOTATIONS {

        @XmlElement(name = "IO-HW-ABSTRACTION-SERVER-ANNOTATION")
        protected List<IOHWABSTRACTIONSERVERANNOTATION> iohwabstractionserverannotation;

        /**
         * Gets the value of the iohwabstractionserverannotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the iohwabstractionserverannotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIOHWABSTRACTIONSERVERANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IOHWABSTRACTIONSERVERANNOTATION }
         * 
         * 
         */
        public List<IOHWABSTRACTIONSERVERANNOTATION> getIOHWABSTRACTIONSERVERANNOTATION() {
            if (iohwabstractionserverannotation == null) {
                iohwabstractionserverannotation = new ArrayList<IOHWABSTRACTIONSERVERANNOTATION>();
            }
            return this.iohwabstractionserverannotation;
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
     *         &lt;element name="MODE-PORT-ANNOTATION" type="{http://autosar.org/schema/r4.0}MODE-PORT-ANNOTATION"/>
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
        "modeportannotation"
    })
    public static class MODEPORTANNOTATIONS {

        @XmlElement(name = "MODE-PORT-ANNOTATION")
        protected List<MODEPORTANNOTATION> modeportannotation;

        /**
         * Gets the value of the modeportannotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modeportannotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEPORTANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEPORTANNOTATION }
         * 
         * 
         */
        public List<MODEPORTANNOTATION> getMODEPORTANNOTATION() {
            if (modeportannotation == null) {
                modeportannotation = new ArrayList<MODEPORTANNOTATION>();
            }
            return this.modeportannotation;
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
     *         &lt;element name="NV-DATA-PORT-ANNOTATION" type="{http://autosar.org/schema/r4.0}NV-DATA-PORT-ANNOTATION"/>
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
        "nvdataportannotation"
    })
    public static class NVDATAPORTANNOTATIONS {

        @XmlElement(name = "NV-DATA-PORT-ANNOTATION")
        protected List<NVDATAPORTANNOTATION> nvdataportannotation;

        /**
         * Gets the value of the nvdataportannotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nvdataportannotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNVDATAPORTANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NVDATAPORTANNOTATION }
         * 
         * 
         */
        public List<NVDATAPORTANNOTATION> getNVDATAPORTANNOTATION() {
            if (nvdataportannotation == null) {
                nvdataportannotation = new ArrayList<NVDATAPORTANNOTATION>();
            }
            return this.nvdataportannotation;
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
     *         &lt;element name="PARAMETER-PORT-ANNOTATION" type="{http://autosar.org/schema/r4.0}PARAMETER-PORT-ANNOTATION"/>
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
        "parameterportannotation"
    })
    public static class PARAMETERPORTANNOTATIONS {

        @XmlElement(name = "PARAMETER-PORT-ANNOTATION")
        protected List<PARAMETERPORTANNOTATION> parameterportannotation;

        /**
         * Gets the value of the parameterportannotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterportannotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAMETERPORTANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARAMETERPORTANNOTATION }
         * 
         * 
         */
        public List<PARAMETERPORTANNOTATION> getPARAMETERPORTANNOTATION() {
            if (parameterportannotation == null) {
                parameterportannotation = new ArrayList<PARAMETERPORTANNOTATION>();
            }
            return this.parameterportannotation;
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
     *         &lt;element name="MODE-SWITCH-SENDER-COM-SPEC" type="{http://autosar.org/schema/r4.0}MODE-SWITCH-SENDER-COM-SPEC"/>
     *         &lt;element name="NONQUEUED-SENDER-COM-SPEC" type="{http://autosar.org/schema/r4.0}NONQUEUED-SENDER-COM-SPEC"/>
     *         &lt;element name="NV-PROVIDE-COM-SPEC" type="{http://autosar.org/schema/r4.0}NV-PROVIDE-COM-SPEC"/>
     *         &lt;element name="PARAMETER-PROVIDE-COM-SPEC" type="{http://autosar.org/schema/r4.0}PARAMETER-PROVIDE-COM-SPEC"/>
     *         &lt;element name="QUEUED-SENDER-COM-SPEC" type="{http://autosar.org/schema/r4.0}QUEUED-SENDER-COM-SPEC"/>
     *         &lt;element name="SERVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}SERVER-COM-SPEC"/>
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
        "modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC"
    })
    public static class PROVIDEDCOMSPECS {

        @XmlElements({
            @XmlElement(name = "MODE-SWITCH-SENDER-COM-SPEC", type = MODESWITCHSENDERCOMSPEC.class),
            @XmlElement(name = "NONQUEUED-SENDER-COM-SPEC", type = NONQUEUEDSENDERCOMSPEC.class),
            @XmlElement(name = "NV-PROVIDE-COM-SPEC", type = NVPROVIDECOMSPEC.class),
            @XmlElement(name = "PARAMETER-PROVIDE-COM-SPEC", type = PARAMETERPROVIDECOMSPEC.class),
            @XmlElement(name = "QUEUED-SENDER-COM-SPEC", type = QUEUEDSENDERCOMSPEC.class),
            @XmlElement(name = "SERVER-COM-SPEC", type = SERVERCOMSPEC.class)
        })
        protected List<Object> modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC;

        /**
         * Gets the value of the modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODESWITCHSENDERCOMSPECOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODESWITCHSENDERCOMSPEC }
         * {@link NONQUEUEDSENDERCOMSPEC }
         * {@link NVPROVIDECOMSPEC }
         * {@link PARAMETERPROVIDECOMSPEC }
         * {@link QUEUEDSENDERCOMSPEC }
         * {@link SERVERCOMSPEC }
         * 
         * 
         */
        public List<Object> getMODESWITCHSENDERCOMSPECOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC() {
            if (modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC == null) {
                modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC = new ArrayList<Object>();
            }
            return this.modeswitchsendercomspecOrNONQUEUEDSENDERCOMSPECOrNVPROVIDECOMSPEC;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-INTERFACE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PROVIDEDREQUIREDINTERFACETREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTINTERFACESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public PORTINTERFACESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTINTERFACESUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="CLIENT-COM-SPEC" type="{http://autosar.org/schema/r4.0}CLIENT-COM-SPEC"/>
     *         &lt;element name="MODE-SWITCH-RECEIVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}MODE-SWITCH-RECEIVER-COM-SPEC"/>
     *         &lt;element name="NONQUEUED-RECEIVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}NONQUEUED-RECEIVER-COM-SPEC"/>
     *         &lt;element name="NV-REQUIRE-COM-SPEC" type="{http://autosar.org/schema/r4.0}NV-REQUIRE-COM-SPEC"/>
     *         &lt;element name="PARAMETER-REQUIRE-COM-SPEC" type="{http://autosar.org/schema/r4.0}PARAMETER-REQUIRE-COM-SPEC"/>
     *         &lt;element name="QUEUED-RECEIVER-COM-SPEC" type="{http://autosar.org/schema/r4.0}QUEUED-RECEIVER-COM-SPEC"/>
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
        "clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC"
    })
    public static class REQUIREDCOMSPECS {

        @XmlElements({
            @XmlElement(name = "CLIENT-COM-SPEC", type = CLIENTCOMSPEC.class),
            @XmlElement(name = "MODE-SWITCH-RECEIVER-COM-SPEC", type = MODESWITCHRECEIVERCOMSPEC.class),
            @XmlElement(name = "NONQUEUED-RECEIVER-COM-SPEC", type = NONQUEUEDRECEIVERCOMSPEC.class),
            @XmlElement(name = "NV-REQUIRE-COM-SPEC", type = NVREQUIRECOMSPEC.class),
            @XmlElement(name = "PARAMETER-REQUIRE-COM-SPEC", type = PARAMETERREQUIRECOMSPEC.class),
            @XmlElement(name = "QUEUED-RECEIVER-COM-SPEC", type = QUEUEDRECEIVERCOMSPEC.class)
        })
        protected List<Object> clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC;

        /**
         * Gets the value of the clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTCOMSPECOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CLIENTCOMSPEC }
         * {@link MODESWITCHRECEIVERCOMSPEC }
         * {@link NONQUEUEDRECEIVERCOMSPEC }
         * {@link NVREQUIRECOMSPEC }
         * {@link PARAMETERREQUIRECOMSPEC }
         * {@link QUEUEDRECEIVERCOMSPEC }
         * 
         * 
         */
        public List<Object> getCLIENTCOMSPECOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC() {
            if (clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC == null) {
                clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC = new ArrayList<Object>();
            }
            return this.clientcomspecOrMODESWITCHRECEIVERCOMSPECOrNONQUEUEDRECEIVERCOMSPEC;
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
     *         &lt;element name="RECEIVER-ANNOTATION" type="{http://autosar.org/schema/r4.0}RECEIVER-ANNOTATION"/>
     *         &lt;element name="SENDER-ANNOTATION" type="{http://autosar.org/schema/r4.0}SENDER-ANNOTATION"/>
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
        "receiverannotationOrSENDERANNOTATION"
    })
    public static class SENDERRECEIVERANNOTATIONS {

        @XmlElements({
            @XmlElement(name = "RECEIVER-ANNOTATION", type = RECEIVERANNOTATION.class),
            @XmlElement(name = "SENDER-ANNOTATION", type = SENDERANNOTATION.class)
        })
        protected List<Object> receiverannotationOrSENDERANNOTATION;

        /**
         * Gets the value of the receiverannotationOrSENDERANNOTATION property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the receiverannotationOrSENDERANNOTATION property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECEIVERANNOTATIONOrSENDERANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RECEIVERANNOTATION }
         * {@link SENDERANNOTATION }
         * 
         * 
         */
        public List<Object> getRECEIVERANNOTATIONOrSENDERANNOTATION() {
            if (receiverannotationOrSENDERANNOTATION == null) {
                receiverannotationOrSENDERANNOTATION = new ArrayList<Object>();
            }
            return this.receiverannotationOrSENDERANNOTATION;
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
     *         &lt;element name="TRIGGER-PORT-ANNOTATION" type="{http://autosar.org/schema/r4.0}TRIGGER-PORT-ANNOTATION"/>
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
        "triggerportannotation"
    })
    public static class TRIGGERPORTANNOTATIONS {

        @XmlElement(name = "TRIGGER-PORT-ANNOTATION")
        protected List<TRIGGERPORTANNOTATION> triggerportannotation;

        /**
         * Gets the value of the triggerportannotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the triggerportannotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRIGGERPORTANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIGGERPORTANNOTATION }
         * 
         * 
         */
        public List<TRIGGERPORTANNOTATION> getTRIGGERPORTANNOTATION() {
            if (triggerportannotation == null) {
                triggerportannotation = new ArrayList<TRIGGERPORTANNOTATION>();
            }
            return this.triggerportannotation;
        }

    }

}
