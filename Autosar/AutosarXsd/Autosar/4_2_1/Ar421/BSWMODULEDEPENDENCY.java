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
 * This class collects the dependencies of a BSW module or cluster on a certain other BSW module.
 * 
 * <p>BSW-MODULE-DEPENDENCY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-MODULE-DEPENDENCY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-DEPENDENCY"/>
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
@XmlType(name = "BSW-MODULE-DEPENDENCY", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "targetmoduleid",
    "targetmodulerefs",
    "requiredentrys",
    "expectedcallbacks",
    "serviceitems",
    "variationpoint"
})
public class BSWMODULEDEPENDENCY {

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
    @XmlElement(name = "TARGET-MODULE-ID")
    protected POSITIVEINTEGER targetmoduleid;
    @XmlElement(name = "TARGET-MODULE-REFS")
    protected BSWMODULEDEPENDENCY.TARGETMODULEREFS targetmodulerefs;
    @XmlElement(name = "REQUIRED-ENTRYS")
    protected BSWMODULEDEPENDENCY.REQUIREDENTRYS requiredentrys;
    @XmlElement(name = "EXPECTED-CALLBACKS")
    protected BSWMODULEDEPENDENCY.EXPECTEDCALLBACKS expectedcallbacks;
    @XmlElement(name = "SERVICE-ITEMS")
    protected BSWMODULEDEPENDENCY.SERVICEITEMS serviceitems;
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
     * ??targetmoduleid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getTARGETMODULEID() {
        return targetmoduleid;
    }

    /**
     * ??targetmoduleid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setTARGETMODULEID(POSITIVEINTEGER value) {
        this.targetmoduleid = value;
    }

    /**
     * ??targetmodulerefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDEPENDENCY.TARGETMODULEREFS }
     *     
     */
    public BSWMODULEDEPENDENCY.TARGETMODULEREFS getTARGETMODULEREFS() {
        return targetmodulerefs;
    }

    /**
     * ??targetmodulerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDEPENDENCY.TARGETMODULEREFS }
     *     
     */
    public void setTARGETMODULEREFS(BSWMODULEDEPENDENCY.TARGETMODULEREFS value) {
        this.targetmodulerefs = value;
    }

    /**
     * ??requiredentrys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDEPENDENCY.REQUIREDENTRYS }
     *     
     */
    public BSWMODULEDEPENDENCY.REQUIREDENTRYS getREQUIREDENTRYS() {
        return requiredentrys;
    }

    /**
     * ??requiredentrys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDEPENDENCY.REQUIREDENTRYS }
     *     
     */
    public void setREQUIREDENTRYS(BSWMODULEDEPENDENCY.REQUIREDENTRYS value) {
        this.requiredentrys = value;
    }

    /**
     * ??expectedcallbacks?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDEPENDENCY.EXPECTEDCALLBACKS }
     *     
     */
    public BSWMODULEDEPENDENCY.EXPECTEDCALLBACKS getEXPECTEDCALLBACKS() {
        return expectedcallbacks;
    }

    /**
     * ??expectedcallbacks?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDEPENDENCY.EXPECTEDCALLBACKS }
     *     
     */
    public void setEXPECTEDCALLBACKS(BSWMODULEDEPENDENCY.EXPECTEDCALLBACKS value) {
        this.expectedcallbacks = value;
    }

    /**
     * ??serviceitems?????
     * 
     * @return
     *     possible object is
     *     {@link BSWMODULEDEPENDENCY.SERVICEITEMS }
     *     
     */
    public BSWMODULEDEPENDENCY.SERVICEITEMS getSERVICEITEMS() {
        return serviceitems;
    }

    /**
     * ??serviceitems?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWMODULEDEPENDENCY.SERVICEITEMS }
     *     
     */
    public void setSERVICEITEMS(BSWMODULEDEPENDENCY.SERVICEITEMS value) {
        this.serviceitems = value;
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
     *         &lt;element name="BSW-MODULE-ENTRY-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY-REF-CONDITIONAL"/>
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
        "bswmoduleentryrefconditional"
    })
    public static class EXPECTEDCALLBACKS {

        @XmlElement(name = "BSW-MODULE-ENTRY-REF-CONDITIONAL")
        protected List<BSWMODULEENTRYREFCONDITIONAL> bswmoduleentryrefconditional;

        /**
         * Gets the value of the bswmoduleentryrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduleentryrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULEENTRYREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULEENTRYREFCONDITIONAL }
         * 
         * 
         */
        public List<BSWMODULEENTRYREFCONDITIONAL> getBSWMODULEENTRYREFCONDITIONAL() {
            if (bswmoduleentryrefconditional == null) {
                bswmoduleentryrefconditional = new ArrayList<BSWMODULEENTRYREFCONDITIONAL>();
            }
            return this.bswmoduleentryrefconditional;
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
     *         &lt;element name="BSW-MODULE-ENTRY-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY-REF-CONDITIONAL"/>
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
        "bswmoduleentryrefconditional"
    })
    public static class REQUIREDENTRYS {

        @XmlElement(name = "BSW-MODULE-ENTRY-REF-CONDITIONAL")
        protected List<BSWMODULEENTRYREFCONDITIONAL> bswmoduleentryrefconditional;

        /**
         * Gets the value of the bswmoduleentryrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduleentryrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULEENTRYREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULEENTRYREFCONDITIONAL }
         * 
         * 
         */
        public List<BSWMODULEENTRYREFCONDITIONAL> getBSWMODULEENTRYREFCONDITIONAL() {
            if (bswmoduleentryrefconditional == null) {
                bswmoduleentryrefconditional = new ArrayList<BSWMODULEENTRYREFCONDITIONAL>();
            }
            return this.bswmoduleentryrefconditional;
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
     *         &lt;element name="BSW-MGR-NEEDS" type="{http://autosar.org/schema/r4.0}BSW-MGR-NEEDS"/>
     *         &lt;element name="COM-MGR-USER-NEEDS" type="{http://autosar.org/schema/r4.0}COM-MGR-USER-NEEDS"/>
     *         &lt;element name="CRYPTO-SERVICE-NEEDS" type="{http://autosar.org/schema/r4.0}CRYPTO-SERVICE-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-ENABLE-CONDITION-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ENABLE-CONDITION-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-INFO-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-INFO-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-MANAGER-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-MANAGER-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-EVENT-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-IO-CONTROL-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-IO-CONTROL-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-OPERATION-CYCLE-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-OPERATION-CYCLE-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-ROUTINE-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-ROUTINE-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-STORAGE-CONDITION-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-STORAGE-CONDITION-NEEDS"/>
     *         &lt;element name="DIAGNOSTIC-VALUE-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-VALUE-NEEDS"/>
     *         &lt;element name="DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS" type="{http://autosar.org/schema/r4.0}DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS"/>
     *         &lt;element name="DLT-USER-NEEDS" type="{http://autosar.org/schema/r4.0}DLT-USER-NEEDS"/>
     *         &lt;element name="DO-IP-ACTIVATION-LINE-NEEDS" type="{http://autosar.org/schema/r4.0}DO-IP-ACTIVATION-LINE-NEEDS"/>
     *         &lt;element name="DO-IP-GID-NEEDS" type="{http://autosar.org/schema/r4.0}DO-IP-GID-NEEDS"/>
     *         &lt;element name="DO-IP-GID-SYNCHRONIZATION-NEEDS" type="{http://autosar.org/schema/r4.0}DO-IP-GID-SYNCHRONIZATION-NEEDS"/>
     *         &lt;element name="DO-IP-POWER-MODE-STATUS-NEEDS" type="{http://autosar.org/schema/r4.0}DO-IP-POWER-MODE-STATUS-NEEDS"/>
     *         &lt;element name="DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS" type="{http://autosar.org/schema/r4.0}DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS"/>
     *         &lt;element name="DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS" type="{http://autosar.org/schema/r4.0}DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS"/>
     *         &lt;element name="DTC-STATUS-CHANGE-NOTIFICATION-NEEDS" type="{http://autosar.org/schema/r4.0}DTC-STATUS-CHANGE-NOTIFICATION-NEEDS"/>
     *         &lt;element name="ECU-STATE-MGR-USER-NEEDS" type="{http://autosar.org/schema/r4.0}ECU-STATE-MGR-USER-NEEDS"/>
     *         &lt;element name="FUNCTION-INHIBITION-NEEDS" type="{http://autosar.org/schema/r4.0}FUNCTION-INHIBITION-NEEDS"/>
     *         &lt;element name="NV-BLOCK-NEEDS" type="{http://autosar.org/schema/r4.0}NV-BLOCK-NEEDS"/>
     *         &lt;element name="OBD-CONTROL-SERVICE-NEEDS" type="{http://autosar.org/schema/r4.0}OBD-CONTROL-SERVICE-NEEDS"/>
     *         &lt;element name="OBD-INFO-SERVICE-NEEDS" type="{http://autosar.org/schema/r4.0}OBD-INFO-SERVICE-NEEDS"/>
     *         &lt;element name="OBD-MONITOR-SERVICE-NEEDS" type="{http://autosar.org/schema/r4.0}OBD-MONITOR-SERVICE-NEEDS"/>
     *         &lt;element name="OBD-PID-SERVICE-NEEDS" type="{http://autosar.org/schema/r4.0}OBD-PID-SERVICE-NEEDS"/>
     *         &lt;element name="OBD-RATIO-SERVICE-NEEDS" type="{http://autosar.org/schema/r4.0}OBD-RATIO-SERVICE-NEEDS"/>
     *         &lt;element name="SUPERVISED-ENTITY-NEEDS" type="{http://autosar.org/schema/r4.0}SUPERVISED-ENTITY-NEEDS"/>
     *         &lt;element name="SYNC-TIME-BASE-MGR-USER-NEEDS" type="{http://autosar.org/schema/r4.0}SYNC-TIME-BASE-MGR-USER-NEEDS"/>
     *         &lt;element name="WARNING-INDICATOR-REQUESTED-BIT-NEEDS" type="{http://autosar.org/schema/r4.0}WARNING-INDICATOR-REQUESTED-BIT-NEEDS"/>
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
        "bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS"
    })
    public static class SERVICEITEMS {

        @XmlElements({
            @XmlElement(name = "BSW-MGR-NEEDS", type = BSWMGRNEEDS.class),
            @XmlElement(name = "COM-MGR-USER-NEEDS", type = COMMGRUSERNEEDS.class),
            @XmlElement(name = "CRYPTO-SERVICE-NEEDS", type = CRYPTOSERVICENEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS", type = DIAGNOSTICCOMMUNICATIONMANAGERNEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-ENABLE-CONDITION-NEEDS", type = DIAGNOSTICENABLECONDITIONNEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-INFO-NEEDS", type = DIAGNOSTICEVENTINFONEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-MANAGER-NEEDS", type = DIAGNOSTICEVENTMANAGERNEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-EVENT-NEEDS", type = DIAGNOSTICEVENTNEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-IO-CONTROL-NEEDS", type = DIAGNOSTICIOCONTROLNEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-OPERATION-CYCLE-NEEDS", type = DIAGNOSTICOPERATIONCYCLENEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-ROUTINE-NEEDS", type = DIAGNOSTICROUTINENEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-STORAGE-CONDITION-NEEDS", type = DIAGNOSTICSTORAGECONDITIONNEEDS.class),
            @XmlElement(name = "DIAGNOSTIC-VALUE-NEEDS", type = DIAGNOSTICVALUENEEDS.class),
            @XmlElement(name = "DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS", type = DIAGNOSTICSCOMMUNICATIONSECURITYNEEDS.class),
            @XmlElement(name = "DLT-USER-NEEDS", type = DLTUSERNEEDS.class),
            @XmlElement(name = "DO-IP-ACTIVATION-LINE-NEEDS", type = DOIPACTIVATIONLINENEEDS.class),
            @XmlElement(name = "DO-IP-GID-NEEDS", type = DOIPGIDNEEDS.class),
            @XmlElement(name = "DO-IP-GID-SYNCHRONIZATION-NEEDS", type = DOIPGIDSYNCHRONIZATIONNEEDS.class),
            @XmlElement(name = "DO-IP-POWER-MODE-STATUS-NEEDS", type = DOIPPOWERMODESTATUSNEEDS.class),
            @XmlElement(name = "DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS", type = DOIPROUTINGACTIVATIONAUTHENTICATIONNEEDS.class),
            @XmlElement(name = "DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS", type = DOIPROUTINGACTIVATIONCONFIRMATIONNEEDS.class),
            @XmlElement(name = "DTC-STATUS-CHANGE-NOTIFICATION-NEEDS", type = DTCSTATUSCHANGENOTIFICATIONNEEDS.class),
            @XmlElement(name = "ECU-STATE-MGR-USER-NEEDS", type = ECUSTATEMGRUSERNEEDS.class),
            @XmlElement(name = "FUNCTION-INHIBITION-NEEDS", type = FUNCTIONINHIBITIONNEEDS.class),
            @XmlElement(name = "NV-BLOCK-NEEDS", type = NVBLOCKNEEDS.class),
            @XmlElement(name = "OBD-CONTROL-SERVICE-NEEDS", type = OBDCONTROLSERVICENEEDS.class),
            @XmlElement(name = "OBD-INFO-SERVICE-NEEDS", type = OBDINFOSERVICENEEDS.class),
            @XmlElement(name = "OBD-MONITOR-SERVICE-NEEDS", type = OBDMONITORSERVICENEEDS.class),
            @XmlElement(name = "OBD-PID-SERVICE-NEEDS", type = OBDPIDSERVICENEEDS.class),
            @XmlElement(name = "OBD-RATIO-SERVICE-NEEDS", type = OBDRATIOSERVICENEEDS.class),
            @XmlElement(name = "SUPERVISED-ENTITY-NEEDS", type = SUPERVISEDENTITYNEEDS.class),
            @XmlElement(name = "SYNC-TIME-BASE-MGR-USER-NEEDS", type = SYNCTIMEBASEMGRUSERNEEDS.class),
            @XmlElement(name = "WARNING-INDICATOR-REQUESTED-BIT-NEEDS", type = WARNINGINDICATORREQUESTEDBITNEEDS.class)
        })
        protected List<Object> bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS;

        /**
         * Gets the value of the bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMGRNEEDSOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMGRNEEDS }
         * {@link COMMGRUSERNEEDS }
         * {@link CRYPTOSERVICENEEDS }
         * {@link DIAGNOSTICCOMMUNICATIONMANAGERNEEDS }
         * {@link DIAGNOSTICENABLECONDITIONNEEDS }
         * {@link DIAGNOSTICEVENTINFONEEDS }
         * {@link DIAGNOSTICEVENTMANAGERNEEDS }
         * {@link DIAGNOSTICEVENTNEEDS }
         * {@link DIAGNOSTICIOCONTROLNEEDS }
         * {@link DIAGNOSTICOPERATIONCYCLENEEDS }
         * {@link DIAGNOSTICROUTINENEEDS }
         * {@link DIAGNOSTICSTORAGECONDITIONNEEDS }
         * {@link DIAGNOSTICVALUENEEDS }
         * {@link DIAGNOSTICSCOMMUNICATIONSECURITYNEEDS }
         * {@link DLTUSERNEEDS }
         * {@link DOIPACTIVATIONLINENEEDS }
         * {@link DOIPGIDNEEDS }
         * {@link DOIPGIDSYNCHRONIZATIONNEEDS }
         * {@link DOIPPOWERMODESTATUSNEEDS }
         * {@link DOIPROUTINGACTIVATIONAUTHENTICATIONNEEDS }
         * {@link DOIPROUTINGACTIVATIONCONFIRMATIONNEEDS }
         * {@link DTCSTATUSCHANGENOTIFICATIONNEEDS }
         * {@link ECUSTATEMGRUSERNEEDS }
         * {@link FUNCTIONINHIBITIONNEEDS }
         * {@link NVBLOCKNEEDS }
         * {@link OBDCONTROLSERVICENEEDS }
         * {@link OBDINFOSERVICENEEDS }
         * {@link OBDMONITORSERVICENEEDS }
         * {@link OBDPIDSERVICENEEDS }
         * {@link OBDRATIOSERVICENEEDS }
         * {@link SUPERVISEDENTITYNEEDS }
         * {@link SYNCTIMEBASEMGRUSERNEEDS }
         * {@link WARNINGINDICATORREQUESTEDBITNEEDS }
         * 
         * 
         */
        public List<Object> getBSWMGRNEEDSOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS() {
            if (bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS == null) {
                bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS = new ArrayList<Object>();
            }
            return this.bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS;
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
     *         &lt;element name="BSW-MODULE-DESCRIPTION-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}BSW-MODULE-DESCRIPTION-REF-CONDITIONAL"/>
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
        "bswmoduledescriptionrefconditional"
    })
    public static class TARGETMODULEREFS {

        @XmlElement(name = "BSW-MODULE-DESCRIPTION-REF-CONDITIONAL")
        protected List<BSWMODULEDESCRIPTIONREFCONDITIONAL> bswmoduledescriptionrefconditional;

        /**
         * Gets the value of the bswmoduledescriptionrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswmoduledescriptionrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWMODULEDESCRIPTIONREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWMODULEDESCRIPTIONREFCONDITIONAL }
         * 
         * 
         */
        public List<BSWMODULEDESCRIPTIONREFCONDITIONAL> getBSWMODULEDESCRIPTIONREFCONDITIONAL() {
            if (bswmoduledescriptionrefconditional == null) {
                bswmoduledescriptionrefconditional = new ArrayList<BSWMODULEDESCRIPTIONREFCONDITIONAL>();
            }
            return this.bswmoduledescriptionrefconditional;
        }

    }

}
