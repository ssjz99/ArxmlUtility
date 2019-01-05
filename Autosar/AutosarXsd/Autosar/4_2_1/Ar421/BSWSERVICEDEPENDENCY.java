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
 * Specialization of ServiceDependency in the context of an BswInternalBehavior. It allows to associate BswModuleEntries and data defined for a BSW module or cluster to a given ServiceNeeds element.
 * 
 * <p>BSW-SERVICE-DEPENDENCY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-SERVICE-DEPENDENCY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SERVICE-DEPENDENCY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-SERVICE-DEPENDENCY"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BSW-SERVICE-DEPENDENCY", propOrder = {
    "assigneddatatypes",
    "symbolicnameprops",
    "ident",
    "assigneddatas",
    "assignedentryroles",
    "serviceneeds",
    "variationpoint"
})
public class BSWSERVICEDEPENDENCY {

    @XmlElement(name = "ASSIGNED-DATA-TYPES")
    protected Ar421.SWCSERVICEDEPENDENCY.ASSIGNEDDATATYPES assigneddatatypes;
    @XmlElement(name = "SYMBOLIC-NAME-PROPS")
    protected SYMBOLICNAMEPROPS symbolicnameprops;
    @XmlElement(name = "IDENT")
    protected BSWSERVICEDEPENDENCYIDENT ident;
    @XmlElement(name = "ASSIGNED-DATAS")
    protected BSWSERVICEDEPENDENCY.ASSIGNEDDATAS assigneddatas;
    @XmlElement(name = "ASSIGNED-ENTRY-ROLES")
    protected BSWSERVICEDEPENDENCY.ASSIGNEDENTRYROLES assignedentryroles;
    @XmlElement(name = "SERVICE-NEEDS")
    protected BSWSERVICEDEPENDENCY.SERVICENEEDS serviceneeds;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??assigneddatatypes?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCSERVICEDEPENDENCY.ASSIGNEDDATATYPES }
     *     
     */
    public Ar421.SWCSERVICEDEPENDENCY.ASSIGNEDDATATYPES getASSIGNEDDATATYPES() {
        return assigneddatatypes;
    }

    /**
     * ??assigneddatatypes?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCSERVICEDEPENDENCY.ASSIGNEDDATATYPES }
     *     
     */
    public void setASSIGNEDDATATYPES(Ar421.SWCSERVICEDEPENDENCY.ASSIGNEDDATATYPES value) {
        this.assigneddatatypes = value;
    }

    /**
     * ??symbolicnameprops?????
     * 
     * @return
     *     possible object is
     *     {@link SYMBOLICNAMEPROPS }
     *     
     */
    public SYMBOLICNAMEPROPS getSYMBOLICNAMEPROPS() {
        return symbolicnameprops;
    }

    /**
     * ??symbolicnameprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SYMBOLICNAMEPROPS }
     *     
     */
    public void setSYMBOLICNAMEPROPS(SYMBOLICNAMEPROPS value) {
        this.symbolicnameprops = value;
    }

    /**
     * ??ident?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSERVICEDEPENDENCYIDENT }
     *     
     */
    public BSWSERVICEDEPENDENCYIDENT getIDENT() {
        return ident;
    }

    /**
     * ??ident?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSERVICEDEPENDENCYIDENT }
     *     
     */
    public void setIDENT(BSWSERVICEDEPENDENCYIDENT value) {
        this.ident = value;
    }

    /**
     * ??assigneddatas?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSERVICEDEPENDENCY.ASSIGNEDDATAS }
     *     
     */
    public BSWSERVICEDEPENDENCY.ASSIGNEDDATAS getASSIGNEDDATAS() {
        return assigneddatas;
    }

    /**
     * ??assigneddatas?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSERVICEDEPENDENCY.ASSIGNEDDATAS }
     *     
     */
    public void setASSIGNEDDATAS(BSWSERVICEDEPENDENCY.ASSIGNEDDATAS value) {
        this.assigneddatas = value;
    }

    /**
     * ??assignedentryroles?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSERVICEDEPENDENCY.ASSIGNEDENTRYROLES }
     *     
     */
    public BSWSERVICEDEPENDENCY.ASSIGNEDENTRYROLES getASSIGNEDENTRYROLES() {
        return assignedentryroles;
    }

    /**
     * ??assignedentryroles?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSERVICEDEPENDENCY.ASSIGNEDENTRYROLES }
     *     
     */
    public void setASSIGNEDENTRYROLES(BSWSERVICEDEPENDENCY.ASSIGNEDENTRYROLES value) {
        this.assignedentryroles = value;
    }

    /**
     * ??serviceneeds?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSERVICEDEPENDENCY.SERVICENEEDS }
     *     
     */
    public BSWSERVICEDEPENDENCY.SERVICENEEDS getSERVICENEEDS() {
        return serviceneeds;
    }

    /**
     * ??serviceneeds?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSERVICEDEPENDENCY.SERVICENEEDS }
     *     
     */
    public void setSERVICENEEDS(BSWSERVICEDEPENDENCY.SERVICENEEDS value) {
        this.serviceneeds = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="ROLE-BASED-DATA-ASSIGNMENT" type="{http://autosar.org/schema/r4.0}ROLE-BASED-DATA-ASSIGNMENT"/>
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
        "rolebaseddataassignment"
    })
    public static class ASSIGNEDDATAS {

        @XmlElement(name = "ROLE-BASED-DATA-ASSIGNMENT")
        protected List<ROLEBASEDDATAASSIGNMENT> rolebaseddataassignment;

        /**
         * Gets the value of the rolebaseddataassignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rolebaseddataassignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROLEBASEDDATAASSIGNMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROLEBASEDDATAASSIGNMENT }
         * 
         * 
         */
        public List<ROLEBASEDDATAASSIGNMENT> getROLEBASEDDATAASSIGNMENT() {
            if (rolebaseddataassignment == null) {
                rolebaseddataassignment = new ArrayList<ROLEBASEDDATAASSIGNMENT>();
            }
            return this.rolebaseddataassignment;
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
     *         &lt;element name="ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT" type="{http://autosar.org/schema/r4.0}ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT"/>
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
        "rolebasedbswmoduleentryassignment"
    })
    public static class ASSIGNEDENTRYROLES {

        @XmlElement(name = "ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT")
        protected List<ROLEBASEDBSWMODULEENTRYASSIGNMENT> rolebasedbswmoduleentryassignment;

        /**
         * Gets the value of the rolebasedbswmoduleentryassignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rolebasedbswmoduleentryassignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROLEBASEDBSWMODULEENTRYASSIGNMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROLEBASEDBSWMODULEENTRYASSIGNMENT }
         * 
         * 
         */
        public List<ROLEBASEDBSWMODULEENTRYASSIGNMENT> getROLEBASEDBSWMODULEENTRYASSIGNMENT() {
            if (rolebasedbswmoduleentryassignment == null) {
                rolebasedbswmoduleentryassignment = new ArrayList<ROLEBASEDBSWMODULEENTRYASSIGNMENT>();
            }
            return this.rolebasedbswmoduleentryassignment;
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
     *       &lt;choice minOccurs="0">
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
    public static class SERVICENEEDS {

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
        protected Object bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS;

        /**
         * ??bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMGRNEEDS }
         *     {@link COMMGRUSERNEEDS }
         *     {@link CRYPTOSERVICENEEDS }
         *     {@link DIAGNOSTICCOMMUNICATIONMANAGERNEEDS }
         *     {@link DIAGNOSTICENABLECONDITIONNEEDS }
         *     {@link DIAGNOSTICEVENTINFONEEDS }
         *     {@link DIAGNOSTICEVENTMANAGERNEEDS }
         *     {@link DIAGNOSTICEVENTNEEDS }
         *     {@link DIAGNOSTICIOCONTROLNEEDS }
         *     {@link DIAGNOSTICOPERATIONCYCLENEEDS }
         *     {@link DIAGNOSTICROUTINENEEDS }
         *     {@link DIAGNOSTICSTORAGECONDITIONNEEDS }
         *     {@link DIAGNOSTICVALUENEEDS }
         *     {@link DIAGNOSTICSCOMMUNICATIONSECURITYNEEDS }
         *     {@link DLTUSERNEEDS }
         *     {@link DOIPACTIVATIONLINENEEDS }
         *     {@link DOIPGIDNEEDS }
         *     {@link DOIPGIDSYNCHRONIZATIONNEEDS }
         *     {@link DOIPPOWERMODESTATUSNEEDS }
         *     {@link DOIPROUTINGACTIVATIONAUTHENTICATIONNEEDS }
         *     {@link DOIPROUTINGACTIVATIONCONFIRMATIONNEEDS }
         *     {@link DTCSTATUSCHANGENOTIFICATIONNEEDS }
         *     {@link ECUSTATEMGRUSERNEEDS }
         *     {@link FUNCTIONINHIBITIONNEEDS }
         *     {@link NVBLOCKNEEDS }
         *     {@link OBDCONTROLSERVICENEEDS }
         *     {@link OBDINFOSERVICENEEDS }
         *     {@link OBDMONITORSERVICENEEDS }
         *     {@link OBDPIDSERVICENEEDS }
         *     {@link OBDRATIOSERVICENEEDS }
         *     {@link SUPERVISEDENTITYNEEDS }
         *     {@link SYNCTIMEBASEMGRUSERNEEDS }
         *     {@link WARNINGINDICATORREQUESTEDBITNEEDS }
         *     
         */
        public Object getBSWMGRNEEDSOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS() {
            return bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS;
        }

        /**
         * ??bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMGRNEEDS }
         *     {@link COMMGRUSERNEEDS }
         *     {@link CRYPTOSERVICENEEDS }
         *     {@link DIAGNOSTICCOMMUNICATIONMANAGERNEEDS }
         *     {@link DIAGNOSTICENABLECONDITIONNEEDS }
         *     {@link DIAGNOSTICEVENTINFONEEDS }
         *     {@link DIAGNOSTICEVENTMANAGERNEEDS }
         *     {@link DIAGNOSTICEVENTNEEDS }
         *     {@link DIAGNOSTICIOCONTROLNEEDS }
         *     {@link DIAGNOSTICOPERATIONCYCLENEEDS }
         *     {@link DIAGNOSTICROUTINENEEDS }
         *     {@link DIAGNOSTICSTORAGECONDITIONNEEDS }
         *     {@link DIAGNOSTICVALUENEEDS }
         *     {@link DIAGNOSTICSCOMMUNICATIONSECURITYNEEDS }
         *     {@link DLTUSERNEEDS }
         *     {@link DOIPACTIVATIONLINENEEDS }
         *     {@link DOIPGIDNEEDS }
         *     {@link DOIPGIDSYNCHRONIZATIONNEEDS }
         *     {@link DOIPPOWERMODESTATUSNEEDS }
         *     {@link DOIPROUTINGACTIVATIONAUTHENTICATIONNEEDS }
         *     {@link DOIPROUTINGACTIVATIONCONFIRMATIONNEEDS }
         *     {@link DTCSTATUSCHANGENOTIFICATIONNEEDS }
         *     {@link ECUSTATEMGRUSERNEEDS }
         *     {@link FUNCTIONINHIBITIONNEEDS }
         *     {@link NVBLOCKNEEDS }
         *     {@link OBDCONTROLSERVICENEEDS }
         *     {@link OBDINFOSERVICENEEDS }
         *     {@link OBDMONITORSERVICENEEDS }
         *     {@link OBDPIDSERVICENEEDS }
         *     {@link OBDRATIOSERVICENEEDS }
         *     {@link SUPERVISEDENTITYNEEDS }
         *     {@link SYNCTIMEBASEMGRUSERNEEDS }
         *     {@link WARNINGINDICATORREQUESTEDBITNEEDS }
         *     
         */
        public void setBSWMGRNEEDSOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS(Object value) {
            this.bswmgrneedsOrCOMMGRUSERNEEDSOrCRYPTOSERVICENEEDS = value;
        }

    }

}
