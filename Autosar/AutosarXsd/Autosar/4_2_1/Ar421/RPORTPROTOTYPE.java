//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Component port requiring a certain port interface.
 * 
 * <p>R-PORT-PROTOTYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="R-PORT-PROTOTYPE">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-REQUIRED-PORT-PROTOTYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-PORT-PROTOTYPE"/>
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
@XmlType(name = "R-PORT-PROTOTYPE", propOrder = {
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
    "requiredcomspecs",
    "requiredinterfacetref"
})
public class RPORTPROTOTYPE {

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
    protected Ar421.PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS clientserverannotations;
    @XmlElement(name = "DELEGATED-PORT-ANNOTATION")
    protected DELEGATEDPORTANNOTATION delegatedportannotation;
    @XmlElement(name = "IO-HW-ABSTRACTION-SERVER-ANNOTATIONS")
    protected Ar421.PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS iohwabstractionserverannotations;
    @XmlElement(name = "MODE-PORT-ANNOTATIONS")
    protected Ar421.PRPORTPROTOTYPE.MODEPORTANNOTATIONS modeportannotations;
    @XmlElement(name = "NV-DATA-PORT-ANNOTATIONS")
    protected Ar421.PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS nvdataportannotations;
    @XmlElement(name = "PARAMETER-PORT-ANNOTATIONS")
    protected Ar421.PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS parameterportannotations;
    @XmlElement(name = "SENDER-RECEIVER-ANNOTATIONS")
    protected Ar421.PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS senderreceiverannotations;
    @XmlElement(name = "TRIGGER-PORT-ANNOTATIONS")
    protected Ar421.PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS triggerportannotations;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "REQUIRED-COM-SPECS")
    protected Ar421.PRPORTPROTOTYPE.REQUIREDCOMSPECS requiredcomspecs;
    @XmlElement(name = "REQUIRED-INTERFACE-TREF")
    protected RPORTPROTOTYPE.REQUIREDINTERFACETREF requiredinterfacetref;
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
     *     {@link Ar421.PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS getCLIENTSERVERANNOTATIONS() {
        return clientserverannotations;
    }

    /**
     * ??clientserverannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS }
     *     
     */
    public void setCLIENTSERVERANNOTATIONS(Ar421.PRPORTPROTOTYPE.CLIENTSERVERANNOTATIONS value) {
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
     *     {@link Ar421.PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS getIOHWABSTRACTIONSERVERANNOTATIONS() {
        return iohwabstractionserverannotations;
    }

    /**
     * ??iohwabstractionserverannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS }
     *     
     */
    public void setIOHWABSTRACTIONSERVERANNOTATIONS(Ar421.PRPORTPROTOTYPE.IOHWABSTRACTIONSERVERANNOTATIONS value) {
        this.iohwabstractionserverannotations = value;
    }

    /**
     * ??modeportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PRPORTPROTOTYPE.MODEPORTANNOTATIONS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.MODEPORTANNOTATIONS getMODEPORTANNOTATIONS() {
        return modeportannotations;
    }

    /**
     * ??modeportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.MODEPORTANNOTATIONS }
     *     
     */
    public void setMODEPORTANNOTATIONS(Ar421.PRPORTPROTOTYPE.MODEPORTANNOTATIONS value) {
        this.modeportannotations = value;
    }

    /**
     * ??nvdataportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS getNVDATAPORTANNOTATIONS() {
        return nvdataportannotations;
    }

    /**
     * ??nvdataportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS }
     *     
     */
    public void setNVDATAPORTANNOTATIONS(Ar421.PRPORTPROTOTYPE.NVDATAPORTANNOTATIONS value) {
        this.nvdataportannotations = value;
    }

    /**
     * ??parameterportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS getPARAMETERPORTANNOTATIONS() {
        return parameterportannotations;
    }

    /**
     * ??parameterportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS }
     *     
     */
    public void setPARAMETERPORTANNOTATIONS(Ar421.PRPORTPROTOTYPE.PARAMETERPORTANNOTATIONS value) {
        this.parameterportannotations = value;
    }

    /**
     * ??senderreceiverannotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS getSENDERRECEIVERANNOTATIONS() {
        return senderreceiverannotations;
    }

    /**
     * ??senderreceiverannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS }
     *     
     */
    public void setSENDERRECEIVERANNOTATIONS(Ar421.PRPORTPROTOTYPE.SENDERRECEIVERANNOTATIONS value) {
        this.senderreceiverannotations = value;
    }

    /**
     * ??triggerportannotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS getTRIGGERPORTANNOTATIONS() {
        return triggerportannotations;
    }

    /**
     * ??triggerportannotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS }
     *     
     */
    public void setTRIGGERPORTANNOTATIONS(Ar421.PRPORTPROTOTYPE.TRIGGERPORTANNOTATIONS value) {
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
     * ??requiredcomspecs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PRPORTPROTOTYPE.REQUIREDCOMSPECS }
     *     
     */
    public Ar421.PRPORTPROTOTYPE.REQUIREDCOMSPECS getREQUIREDCOMSPECS() {
        return requiredcomspecs;
    }

    /**
     * ??requiredcomspecs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PRPORTPROTOTYPE.REQUIREDCOMSPECS }
     *     
     */
    public void setREQUIREDCOMSPECS(Ar421.PRPORTPROTOTYPE.REQUIREDCOMSPECS value) {
        this.requiredcomspecs = value;
    }

    /**
     * ??requiredinterfacetref?????
     * 
     * @return
     *     possible object is
     *     {@link RPORTPROTOTYPE.REQUIREDINTERFACETREF }
     *     
     */
    public RPORTPROTOTYPE.REQUIREDINTERFACETREF getREQUIREDINTERFACETREF() {
        return requiredinterfacetref;
    }

    /**
     * ??requiredinterfacetref?????
     * 
     * @param value
     *     allowed object is
     *     {@link RPORTPROTOTYPE.REQUIREDINTERFACETREF }
     *     
     */
    public void setREQUIREDINTERFACETREF(RPORTPROTOTYPE.REQUIREDINTERFACETREF value) {
        this.requiredinterfacetref = value;
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
    public static class REQUIREDINTERFACETREF
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

}
