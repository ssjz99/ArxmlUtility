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
 * ECUInstances are used to define the ECUs used in the topology. The type of the ECU is defined by a reference to an ECU specified with the ECU resource description.
 * 
 * <p>ECU-INSTANCE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECU-INSTANCE">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECU-INSTANCE"/>
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
@XmlType(name = "ECU-INSTANCE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "associatedcomipdugrouprefs",
    "associatedpduripdugrouprefs",
    "cantpaddressrefs",
    "clientidrange",
    "comconfigurationgwtimebase",
    "comconfigurationrxtimebase",
    "comconfigurationtxtimebase",
    "comenablemdtforcyclictransmission",
    "commcontrollers",
    "connectors",
    "diagnosticaddress",
    "diagnosticprops",
    "partitions",
    "pnresettime",
    "pncpreparesleeptimer",
    "sleepmodesupported",
    "tpaddressrefs",
    "wakeupoverbussupported"
})
public class ECUINSTANCE {

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
    @XmlElement(name = "ASSOCIATED-COM-I-PDU-GROUP-REFS")
    protected ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS associatedcomipdugrouprefs;
    @XmlElement(name = "ASSOCIATED-PDUR-I-PDU-GROUP-REFS")
    protected ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS associatedpduripdugrouprefs;
    @XmlElement(name = "CAN-TP-ADDRESS-REFS")
    protected ECUINSTANCE.CANTPADDRESSREFS cantpaddressrefs;
    @XmlElement(name = "CLIENT-ID-RANGE")
    protected CLIENTIDRANGE clientidrange;
    @XmlElement(name = "COM-CONFIGURATION-GW-TIME-BASE")
    protected TIMEVALUE comconfigurationgwtimebase;
    @XmlElement(name = "COM-CONFIGURATION-RX-TIME-BASE")
    protected TIMEVALUE comconfigurationrxtimebase;
    @XmlElement(name = "COM-CONFIGURATION-TX-TIME-BASE")
    protected TIMEVALUE comconfigurationtxtimebase;
    @XmlElement(name = "COM-ENABLE-MDT-FOR-CYCLIC-TRANSMISSION")
    protected BOOLEAN comenablemdtforcyclictransmission;
    @XmlElement(name = "COMM-CONTROLLERS")
    protected ECUINSTANCE.COMMCONTROLLERS commcontrollers;
    @XmlElement(name = "CONNECTORS")
    protected ECUINSTANCE.CONNECTORS connectors;
    @XmlElement(name = "DIAGNOSTIC-ADDRESS")
    protected INTEGER diagnosticaddress;
    @XmlElement(name = "DIAGNOSTIC-PROPS")
    protected DIAGNOSTICECUPROPS diagnosticprops;
    @XmlElement(name = "PARTITIONS")
    protected ECUINSTANCE.PARTITIONS partitions;
    @XmlElement(name = "PN-RESET-TIME")
    protected TIMEVALUE pnresettime;
    @XmlElement(name = "PNC-PREPARE-SLEEP-TIMER")
    protected TIMEVALUE pncpreparesleeptimer;
    @XmlElement(name = "SLEEP-MODE-SUPPORTED")
    protected BOOLEAN sleepmodesupported;
    @XmlElement(name = "TP-ADDRESS-REFS")
    protected ECUINSTANCE.TPADDRESSREFS tpaddressrefs;
    @XmlElement(name = "WAKE-UP-OVER-BUS-SUPPORTED")
    protected BOOLEAN wakeupoverbussupported;
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
     * ??associatedcomipdugrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS }
     *     
     */
    public ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS getASSOCIATEDCOMIPDUGROUPREFS() {
        return associatedcomipdugrouprefs;
    }

    /**
     * ??associatedcomipdugrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS }
     *     
     */
    public void setASSOCIATEDCOMIPDUGROUPREFS(ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS value) {
        this.associatedcomipdugrouprefs = value;
    }

    /**
     * ??associatedpduripdugrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS }
     *     
     */
    public ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS getASSOCIATEDPDURIPDUGROUPREFS() {
        return associatedpduripdugrouprefs;
    }

    /**
     * ??associatedpduripdugrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS }
     *     
     */
    public void setASSOCIATEDPDURIPDUGROUPREFS(ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS value) {
        this.associatedpduripdugrouprefs = value;
    }

    /**
     * ??cantpaddressrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ECUINSTANCE.CANTPADDRESSREFS }
     *     
     */
    public ECUINSTANCE.CANTPADDRESSREFS getCANTPADDRESSREFS() {
        return cantpaddressrefs;
    }

    /**
     * ??cantpaddressrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUINSTANCE.CANTPADDRESSREFS }
     *     
     */
    public void setCANTPADDRESSREFS(ECUINSTANCE.CANTPADDRESSREFS value) {
        this.cantpaddressrefs = value;
    }

    /**
     * ??clientidrange?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTIDRANGE }
     *     
     */
    public CLIENTIDRANGE getCLIENTIDRANGE() {
        return clientidrange;
    }

    /**
     * ??clientidrange?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTIDRANGE }
     *     
     */
    public void setCLIENTIDRANGE(CLIENTIDRANGE value) {
        this.clientidrange = value;
    }

    /**
     * ??comconfigurationgwtimebase?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getCOMCONFIGURATIONGWTIMEBASE() {
        return comconfigurationgwtimebase;
    }

    /**
     * ??comconfigurationgwtimebase?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setCOMCONFIGURATIONGWTIMEBASE(TIMEVALUE value) {
        this.comconfigurationgwtimebase = value;
    }

    /**
     * ??comconfigurationrxtimebase?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getCOMCONFIGURATIONRXTIMEBASE() {
        return comconfigurationrxtimebase;
    }

    /**
     * ??comconfigurationrxtimebase?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setCOMCONFIGURATIONRXTIMEBASE(TIMEVALUE value) {
        this.comconfigurationrxtimebase = value;
    }

    /**
     * ??comconfigurationtxtimebase?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getCOMCONFIGURATIONTXTIMEBASE() {
        return comconfigurationtxtimebase;
    }

    /**
     * ??comconfigurationtxtimebase?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setCOMCONFIGURATIONTXTIMEBASE(TIMEVALUE value) {
        this.comconfigurationtxtimebase = value;
    }

    /**
     * ??comenablemdtforcyclictransmission?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCOMENABLEMDTFORCYCLICTRANSMISSION() {
        return comenablemdtforcyclictransmission;
    }

    /**
     * ??comenablemdtforcyclictransmission?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCOMENABLEMDTFORCYCLICTRANSMISSION(BOOLEAN value) {
        this.comenablemdtforcyclictransmission = value;
    }

    /**
     * ??commcontrollers?????
     * 
     * @return
     *     possible object is
     *     {@link ECUINSTANCE.COMMCONTROLLERS }
     *     
     */
    public ECUINSTANCE.COMMCONTROLLERS getCOMMCONTROLLERS() {
        return commcontrollers;
    }

    /**
     * ??commcontrollers?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUINSTANCE.COMMCONTROLLERS }
     *     
     */
    public void setCOMMCONTROLLERS(ECUINSTANCE.COMMCONTROLLERS value) {
        this.commcontrollers = value;
    }

    /**
     * ??connectors?????
     * 
     * @return
     *     possible object is
     *     {@link ECUINSTANCE.CONNECTORS }
     *     
     */
    public ECUINSTANCE.CONNECTORS getCONNECTORS() {
        return connectors;
    }

    /**
     * ??connectors?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUINSTANCE.CONNECTORS }
     *     
     */
    public void setCONNECTORS(ECUINSTANCE.CONNECTORS value) {
        this.connectors = value;
    }

    /**
     * ??diagnosticaddress?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getDIAGNOSTICADDRESS() {
        return diagnosticaddress;
    }

    /**
     * ??diagnosticaddress?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setDIAGNOSTICADDRESS(INTEGER value) {
        this.diagnosticaddress = value;
    }

    /**
     * ??diagnosticprops?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICECUPROPS }
     *     
     */
    public DIAGNOSTICECUPROPS getDIAGNOSTICPROPS() {
        return diagnosticprops;
    }

    /**
     * ??diagnosticprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICECUPROPS }
     *     
     */
    public void setDIAGNOSTICPROPS(DIAGNOSTICECUPROPS value) {
        this.diagnosticprops = value;
    }

    /**
     * ??partitions?????
     * 
     * @return
     *     possible object is
     *     {@link ECUINSTANCE.PARTITIONS }
     *     
     */
    public ECUINSTANCE.PARTITIONS getPARTITIONS() {
        return partitions;
    }

    /**
     * ??partitions?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUINSTANCE.PARTITIONS }
     *     
     */
    public void setPARTITIONS(ECUINSTANCE.PARTITIONS value) {
        this.partitions = value;
    }

    /**
     * ??pnresettime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getPNRESETTIME() {
        return pnresettime;
    }

    /**
     * ??pnresettime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setPNRESETTIME(TIMEVALUE value) {
        this.pnresettime = value;
    }

    /**
     * ??pncpreparesleeptimer?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getPNCPREPARESLEEPTIMER() {
        return pncpreparesleeptimer;
    }

    /**
     * ??pncpreparesleeptimer?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setPNCPREPARESLEEPTIMER(TIMEVALUE value) {
        this.pncpreparesleeptimer = value;
    }

    /**
     * ??sleepmodesupported?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSLEEPMODESUPPORTED() {
        return sleepmodesupported;
    }

    /**
     * ??sleepmodesupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSLEEPMODESUPPORTED(BOOLEAN value) {
        this.sleepmodesupported = value;
    }

    /**
     * ??tpaddressrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ECUINSTANCE.TPADDRESSREFS }
     *     
     */
    public ECUINSTANCE.TPADDRESSREFS getTPADDRESSREFS() {
        return tpaddressrefs;
    }

    /**
     * ??tpaddressrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUINSTANCE.TPADDRESSREFS }
     *     
     */
    public void setTPADDRESSREFS(ECUINSTANCE.TPADDRESSREFS value) {
        this.tpaddressrefs = value;
    }

    /**
     * ??wakeupoverbussupported?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWAKEUPOVERBUSSUPPORTED() {
        return wakeupoverbussupported;
    }

    /**
     * ??wakeupoverbussupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWAKEUPOVERBUSSUPPORTED(BOOLEAN value) {
        this.wakeupoverbussupported = value;
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
     *         &lt;element name="ASSOCIATED-COM-I-PDU-GROUP-REF">
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
        "associatedcomipdugroupref"
    })
    public static class ASSOCIATEDCOMIPDUGROUPREFS {

        @XmlElement(name = "ASSOCIATED-COM-I-PDU-GROUP-REF")
        protected List<ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS.ASSOCIATEDCOMIPDUGROUPREF> associatedcomipdugroupref;

        /**
         * Gets the value of the associatedcomipdugroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedcomipdugroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSOCIATEDCOMIPDUGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS.ASSOCIATEDCOMIPDUGROUPREF }
         * 
         * 
         */
        public List<ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS.ASSOCIATEDCOMIPDUGROUPREF> getASSOCIATEDCOMIPDUGROUPREF() {
            if (associatedcomipdugroupref == null) {
                associatedcomipdugroupref = new ArrayList<ECUINSTANCE.ASSOCIATEDCOMIPDUGROUPREFS.ASSOCIATEDCOMIPDUGROUPREF>();
            }
            return this.associatedcomipdugroupref;
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
        public static class ASSOCIATEDCOMIPDUGROUPREF
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
     *         &lt;element name="ASSOCIATED-PDUR-I-PDU-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDUR-I-PDU-GROUP--SUBTYPES-ENUM" />
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
        "associatedpduripdugroupref"
    })
    public static class ASSOCIATEDPDURIPDUGROUPREFS {

        @XmlElement(name = "ASSOCIATED-PDUR-I-PDU-GROUP-REF")
        protected List<ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS.ASSOCIATEDPDURIPDUGROUPREF> associatedpduripdugroupref;

        /**
         * Gets the value of the associatedpduripdugroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedpduripdugroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSOCIATEDPDURIPDUGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS.ASSOCIATEDPDURIPDUGROUPREF }
         * 
         * 
         */
        public List<ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS.ASSOCIATEDPDURIPDUGROUPREF> getASSOCIATEDPDURIPDUGROUPREF() {
            if (associatedpduripdugroupref == null) {
                associatedpduripdugroupref = new ArrayList<ECUINSTANCE.ASSOCIATEDPDURIPDUGROUPREFS.ASSOCIATEDPDURIPDUGROUPREF>();
            }
            return this.associatedpduripdugroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDUR-I-PDU-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ASSOCIATEDPDURIPDUGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected PDURIPDUGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link PDURIPDUGROUPSUBTYPESENUM }
             *     
             */
            public PDURIPDUGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link PDURIPDUGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(PDURIPDUGROUPSUBTYPESENUM value) {
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
     *         &lt;element name="CAN-TP-ADDRESS-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-TP-ADDRESS--SUBTYPES-ENUM" />
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
        "cantpaddressref"
    })
    public static class CANTPADDRESSREFS {

        @XmlElement(name = "CAN-TP-ADDRESS-REF")
        protected List<ECUINSTANCE.CANTPADDRESSREFS.CANTPADDRESSREF> cantpaddressref;

        /**
         * Gets the value of the cantpaddressref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cantpaddressref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANTPADDRESSREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUINSTANCE.CANTPADDRESSREFS.CANTPADDRESSREF }
         * 
         * 
         */
        public List<ECUINSTANCE.CANTPADDRESSREFS.CANTPADDRESSREF> getCANTPADDRESSREF() {
            if (cantpaddressref == null) {
                cantpaddressref = new ArrayList<ECUINSTANCE.CANTPADDRESSREFS.CANTPADDRESSREF>();
            }
            return this.cantpaddressref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-TP-ADDRESS--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CANTPADDRESSREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CANTPADDRESSSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CANTPADDRESSSUBTYPESENUM }
             *     
             */
            public CANTPADDRESSSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CANTPADDRESSSUBTYPESENUM }
             *     
             */
            public void setDEST(CANTPADDRESSSUBTYPESENUM value) {
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
     *         &lt;element name="CAN-COMMUNICATION-CONTROLLER" type="{http://autosar.org/schema/r4.0}CAN-COMMUNICATION-CONTROLLER"/>
     *         &lt;element name="ETHERNET-COMMUNICATION-CONTROLLER" type="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONTROLLER"/>
     *         &lt;element name="FLEXRAY-COMMUNICATION-CONTROLLER" type="{http://autosar.org/schema/r4.0}FLEXRAY-COMMUNICATION-CONTROLLER"/>
     *         &lt;element name="LIN-MASTER" type="{http://autosar.org/schema/r4.0}LIN-MASTER"/>
     *         &lt;element name="LIN-SLAVE" type="{http://autosar.org/schema/r4.0}LIN-SLAVE"/>
     *         &lt;element name="TTCAN-COMMUNICATION-CONTROLLER" type="{http://autosar.org/schema/r4.0}TTCAN-COMMUNICATION-CONTROLLER"/>
     *         &lt;element name="USER-DEFINED-COMMUNICATION-CONTROLLER" type="{http://autosar.org/schema/r4.0}USER-DEFINED-COMMUNICATION-CONTROLLER"/>
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
        "cancommunicationcontrollerOrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER"
    })
    public static class COMMCONTROLLERS {

        @XmlElements({
            @XmlElement(name = "CAN-COMMUNICATION-CONTROLLER", type = CANCOMMUNICATIONCONTROLLER.class),
            @XmlElement(name = "ETHERNET-COMMUNICATION-CONTROLLER", type = ETHERNETCOMMUNICATIONCONTROLLER.class),
            @XmlElement(name = "FLEXRAY-COMMUNICATION-CONTROLLER", type = FLEXRAYCOMMUNICATIONCONTROLLER.class),
            @XmlElement(name = "LIN-MASTER", type = LINMASTER.class),
            @XmlElement(name = "LIN-SLAVE", type = LINSLAVE.class),
            @XmlElement(name = "TTCAN-COMMUNICATION-CONTROLLER", type = TTCANCOMMUNICATIONCONTROLLER.class),
            @XmlElement(name = "USER-DEFINED-COMMUNICATION-CONTROLLER", type = USERDEFINEDCOMMUNICATIONCONTROLLER.class)
        })
        protected List<Object> cancommunicationcontrollerOrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER;

        /**
         * Gets the value of the cancommunicationcontrollerOrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cancommunicationcontrollerOrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANCOMMUNICATIONCONTROLLEROrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANCOMMUNICATIONCONTROLLER }
         * {@link ETHERNETCOMMUNICATIONCONTROLLER }
         * {@link FLEXRAYCOMMUNICATIONCONTROLLER }
         * {@link LINMASTER }
         * {@link LINSLAVE }
         * {@link TTCANCOMMUNICATIONCONTROLLER }
         * {@link USERDEFINEDCOMMUNICATIONCONTROLLER }
         * 
         * 
         */
        public List<Object> getCANCOMMUNICATIONCONTROLLEROrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER() {
            if (cancommunicationcontrollerOrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER == null) {
                cancommunicationcontrollerOrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER = new ArrayList<Object>();
            }
            return this.cancommunicationcontrollerOrETHERNETCOMMUNICATIONCONTROLLEROrFLEXRAYCOMMUNICATIONCONTROLLER;
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
     *         &lt;element name="CAN-COMMUNICATION-CONNECTOR" type="{http://autosar.org/schema/r4.0}CAN-COMMUNICATION-CONNECTOR"/>
     *         &lt;element name="ETHERNET-COMMUNICATION-CONNECTOR" type="{http://autosar.org/schema/r4.0}ETHERNET-COMMUNICATION-CONNECTOR"/>
     *         &lt;element name="FLEXRAY-COMMUNICATION-CONNECTOR" type="{http://autosar.org/schema/r4.0}FLEXRAY-COMMUNICATION-CONNECTOR"/>
     *         &lt;element name="LIN-COMMUNICATION-CONNECTOR" type="{http://autosar.org/schema/r4.0}LIN-COMMUNICATION-CONNECTOR"/>
     *         &lt;element name="TTCAN-COMMUNICATION-CONNECTOR" type="{http://autosar.org/schema/r4.0}TTCAN-COMMUNICATION-CONNECTOR"/>
     *         &lt;element name="USER-DEFINED-COMMUNICATION-CONNECTOR" type="{http://autosar.org/schema/r4.0}USER-DEFINED-COMMUNICATION-CONNECTOR"/>
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
        "cancommunicationconnectorOrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR"
    })
    public static class CONNECTORS {

        @XmlElements({
            @XmlElement(name = "CAN-COMMUNICATION-CONNECTOR", type = CANCOMMUNICATIONCONNECTOR.class),
            @XmlElement(name = "ETHERNET-COMMUNICATION-CONNECTOR", type = ETHERNETCOMMUNICATIONCONNECTOR.class),
            @XmlElement(name = "FLEXRAY-COMMUNICATION-CONNECTOR", type = FLEXRAYCOMMUNICATIONCONNECTOR.class),
            @XmlElement(name = "LIN-COMMUNICATION-CONNECTOR", type = LINCOMMUNICATIONCONNECTOR.class),
            @XmlElement(name = "TTCAN-COMMUNICATION-CONNECTOR", type = TTCANCOMMUNICATIONCONNECTOR.class),
            @XmlElement(name = "USER-DEFINED-COMMUNICATION-CONNECTOR", type = USERDEFINEDCOMMUNICATIONCONNECTOR.class)
        })
        protected List<Object> cancommunicationconnectorOrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR;

        /**
         * Gets the value of the cancommunicationconnectorOrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cancommunicationconnectorOrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANCOMMUNICATIONCONNECTOROrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANCOMMUNICATIONCONNECTOR }
         * {@link ETHERNETCOMMUNICATIONCONNECTOR }
         * {@link FLEXRAYCOMMUNICATIONCONNECTOR }
         * {@link LINCOMMUNICATIONCONNECTOR }
         * {@link TTCANCOMMUNICATIONCONNECTOR }
         * {@link USERDEFINEDCOMMUNICATIONCONNECTOR }
         * 
         * 
         */
        public List<Object> getCANCOMMUNICATIONCONNECTOROrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR() {
            if (cancommunicationconnectorOrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR == null) {
                cancommunicationconnectorOrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR = new ArrayList<Object>();
            }
            return this.cancommunicationconnectorOrETHERNETCOMMUNICATIONCONNECTOROrFLEXRAYCOMMUNICATIONCONNECTOR;
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
     *         &lt;element name="ECU-PARTITION" type="{http://autosar.org/schema/r4.0}ECU-PARTITION"/>
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
        "ecupartition"
    })
    public static class PARTITIONS {

        @XmlElement(name = "ECU-PARTITION")
        protected List<ECUPARTITION> ecupartition;

        /**
         * Gets the value of the ecupartition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecupartition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUPARTITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUPARTITION }
         * 
         * 
         */
        public List<ECUPARTITION> getECUPARTITION() {
            if (ecupartition == null) {
                ecupartition = new ArrayList<ECUPARTITION>();
            }
            return this.ecupartition;
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
     *         &lt;element name="TP-ADDRESS-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-ADDRESS--SUBTYPES-ENUM" />
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
        "tpaddressref"
    })
    public static class TPADDRESSREFS {

        @XmlElement(name = "TP-ADDRESS-REF")
        protected List<ECUINSTANCE.TPADDRESSREFS.TPADDRESSREF> tpaddressref;

        /**
         * Gets the value of the tpaddressref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tpaddressref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTPADDRESSREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUINSTANCE.TPADDRESSREFS.TPADDRESSREF }
         * 
         * 
         */
        public List<ECUINSTANCE.TPADDRESSREFS.TPADDRESSREF> getTPADDRESSREF() {
            if (tpaddressref == null) {
                tpaddressref = new ArrayList<ECUINSTANCE.TPADDRESSREFS.TPADDRESSREF>();
            }
            return this.tpaddressref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-ADDRESS--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TPADDRESSREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected TPADDRESSSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link TPADDRESSSUBTYPESENUM }
             *     
             */
            public TPADDRESSSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link TPADDRESSSUBTYPESENUM }
             *     
             */
            public void setDEST(TPADDRESSSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
