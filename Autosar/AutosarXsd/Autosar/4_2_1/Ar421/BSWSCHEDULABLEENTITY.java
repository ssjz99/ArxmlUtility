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
 * BSW module entity, which is designed for control by the BSW Scheduler. It may for example implement a so-called "main" function.
 * 
 * <p>BSW-SCHEDULABLE-ENTITY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-SCHEDULABLE-ENTITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXECUTABLE-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-SCHEDULABLE-ENTITY"/>
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
@XmlType(name = "BSW-SCHEDULABLE-ENTITY", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "activationreasons",
    "canenterexclusivearearefs",
    "exclusiveareanestingorderrefs",
    "minimumstartinterval",
    "reentrancylevel",
    "runsinsideexclusivearearefs",
    "swaddrmethodref",
    "accessedmodegroups",
    "activationpoints",
    "callpoints",
    "calledentrys",
    "datareceivepoints",
    "datasendpoints",
    "implementedentryref",
    "issuedtriggers",
    "managedmodegroups",
    "schedulernameprefixref",
    "variationpoint"
})
public class BSWSCHEDULABLEENTITY {

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
    @XmlElement(name = "ACTIVATION-REASONS")
    protected BSWSCHEDULABLEENTITY.ACTIVATIONREASONS activationreasons;
    @XmlElement(name = "CAN-ENTER-EXCLUSIVE-AREA-REFS")
    protected BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS canenterexclusivearearefs;
    @XmlElement(name = "EXCLUSIVE-AREA-NESTING-ORDER-REFS")
    protected BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS exclusiveareanestingorderrefs;
    @XmlElement(name = "MINIMUM-START-INTERVAL")
    protected TIMEVALUE minimumstartinterval;
    @XmlElement(name = "REENTRANCY-LEVEL")
    protected REENTRANCYLEVELENUM reentrancylevel;
    @XmlElement(name = "RUNS-INSIDE-EXCLUSIVE-AREA-REFS")
    protected BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS runsinsideexclusivearearefs;
    @XmlElement(name = "SW-ADDR-METHOD-REF")
    protected BSWSCHEDULABLEENTITY.SWADDRMETHODREF swaddrmethodref;
    @XmlElement(name = "ACCESSED-MODE-GROUPS")
    protected BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS accessedmodegroups;
    @XmlElement(name = "ACTIVATION-POINTS")
    protected BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS activationpoints;
    @XmlElement(name = "CALL-POINTS")
    protected BSWSCHEDULABLEENTITY.CALLPOINTS callpoints;
    @XmlElement(name = "CALLED-ENTRYS")
    protected BSWSCHEDULABLEENTITY.CALLEDENTRYS calledentrys;
    @XmlElement(name = "DATA-RECEIVE-POINTS")
    protected BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS datareceivepoints;
    @XmlElement(name = "DATA-SEND-POINTS")
    protected BSWSCHEDULABLEENTITY.DATASENDPOINTS datasendpoints;
    @XmlElement(name = "IMPLEMENTED-ENTRY-REF")
    protected BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF implementedentryref;
    @XmlElement(name = "ISSUED-TRIGGERS")
    protected BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS issuedtriggers;
    @XmlElement(name = "MANAGED-MODE-GROUPS")
    protected BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS managedmodegroups;
    @XmlElement(name = "SCHEDULER-NAME-PREFIX-REF")
    protected BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF schedulernameprefixref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??activationreasons?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.ACTIVATIONREASONS }
     *     
     */
    public BSWSCHEDULABLEENTITY.ACTIVATIONREASONS getACTIVATIONREASONS() {
        return activationreasons;
    }

    /**
     * ??activationreasons?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.ACTIVATIONREASONS }
     *     
     */
    public void setACTIVATIONREASONS(BSWSCHEDULABLEENTITY.ACTIVATIONREASONS value) {
        this.activationreasons = value;
    }

    /**
     * ??canenterexclusivearearefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS }
     *     
     */
    public BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS getCANENTEREXCLUSIVEAREAREFS() {
        return canenterexclusivearearefs;
    }

    /**
     * ??canenterexclusivearearefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS }
     *     
     */
    public void setCANENTEREXCLUSIVEAREAREFS(BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS value) {
        this.canenterexclusivearearefs = value;
    }

    /**
     * ??exclusiveareanestingorderrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS }
     *     
     */
    public BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS getEXCLUSIVEAREANESTINGORDERREFS() {
        return exclusiveareanestingorderrefs;
    }

    /**
     * ??exclusiveareanestingorderrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS }
     *     
     */
    public void setEXCLUSIVEAREANESTINGORDERREFS(BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS value) {
        this.exclusiveareanestingorderrefs = value;
    }

    /**
     * ??minimumstartinterval?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMINIMUMSTARTINTERVAL() {
        return minimumstartinterval;
    }

    /**
     * ??minimumstartinterval?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMINIMUMSTARTINTERVAL(TIMEVALUE value) {
        this.minimumstartinterval = value;
    }

    /**
     * ??reentrancylevel?????
     * 
     * @return
     *     possible object is
     *     {@link REENTRANCYLEVELENUM }
     *     
     */
    public REENTRANCYLEVELENUM getREENTRANCYLEVEL() {
        return reentrancylevel;
    }

    /**
     * ??reentrancylevel?????
     * 
     * @param value
     *     allowed object is
     *     {@link REENTRANCYLEVELENUM }
     *     
     */
    public void setREENTRANCYLEVEL(REENTRANCYLEVELENUM value) {
        this.reentrancylevel = value;
    }

    /**
     * ??runsinsideexclusivearearefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS }
     *     
     */
    public BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS getRUNSINSIDEEXCLUSIVEAREAREFS() {
        return runsinsideexclusivearearefs;
    }

    /**
     * ??runsinsideexclusivearearefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS }
     *     
     */
    public void setRUNSINSIDEEXCLUSIVEAREAREFS(BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS value) {
        this.runsinsideexclusivearearefs = value;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.SWADDRMETHODREF }
     *     
     */
    public BSWSCHEDULABLEENTITY.SWADDRMETHODREF getSWADDRMETHODREF() {
        return swaddrmethodref;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.SWADDRMETHODREF }
     *     
     */
    public void setSWADDRMETHODREF(BSWSCHEDULABLEENTITY.SWADDRMETHODREF value) {
        this.swaddrmethodref = value;
    }

    /**
     * ??accessedmodegroups?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS }
     *     
     */
    public BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS getACCESSEDMODEGROUPS() {
        return accessedmodegroups;
    }

    /**
     * ??accessedmodegroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS }
     *     
     */
    public void setACCESSEDMODEGROUPS(BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS value) {
        this.accessedmodegroups = value;
    }

    /**
     * ??activationpoints?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS }
     *     
     */
    public BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS getACTIVATIONPOINTS() {
        return activationpoints;
    }

    /**
     * ??activationpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS }
     *     
     */
    public void setACTIVATIONPOINTS(BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS value) {
        this.activationpoints = value;
    }

    /**
     * ??callpoints?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.CALLPOINTS }
     *     
     */
    public BSWSCHEDULABLEENTITY.CALLPOINTS getCALLPOINTS() {
        return callpoints;
    }

    /**
     * ??callpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.CALLPOINTS }
     *     
     */
    public void setCALLPOINTS(BSWSCHEDULABLEENTITY.CALLPOINTS value) {
        this.callpoints = value;
    }

    /**
     * ??calledentrys?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.CALLEDENTRYS }
     *     
     */
    public BSWSCHEDULABLEENTITY.CALLEDENTRYS getCALLEDENTRYS() {
        return calledentrys;
    }

    /**
     * ??calledentrys?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.CALLEDENTRYS }
     *     
     */
    public void setCALLEDENTRYS(BSWSCHEDULABLEENTITY.CALLEDENTRYS value) {
        this.calledentrys = value;
    }

    /**
     * ??datareceivepoints?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS }
     *     
     */
    public BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS getDATARECEIVEPOINTS() {
        return datareceivepoints;
    }

    /**
     * ??datareceivepoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS }
     *     
     */
    public void setDATARECEIVEPOINTS(BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS value) {
        this.datareceivepoints = value;
    }

    /**
     * ??datasendpoints?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.DATASENDPOINTS }
     *     
     */
    public BSWSCHEDULABLEENTITY.DATASENDPOINTS getDATASENDPOINTS() {
        return datasendpoints;
    }

    /**
     * ??datasendpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.DATASENDPOINTS }
     *     
     */
    public void setDATASENDPOINTS(BSWSCHEDULABLEENTITY.DATASENDPOINTS value) {
        this.datasendpoints = value;
    }

    /**
     * ??implementedentryref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF }
     *     
     */
    public BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF getIMPLEMENTEDENTRYREF() {
        return implementedentryref;
    }

    /**
     * ??implementedentryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF }
     *     
     */
    public void setIMPLEMENTEDENTRYREF(BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF value) {
        this.implementedentryref = value;
    }

    /**
     * ??issuedtriggers?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS }
     *     
     */
    public BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS getISSUEDTRIGGERS() {
        return issuedtriggers;
    }

    /**
     * ??issuedtriggers?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS }
     *     
     */
    public void setISSUEDTRIGGERS(BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS value) {
        this.issuedtriggers = value;
    }

    /**
     * ??managedmodegroups?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS }
     *     
     */
    public BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS getMANAGEDMODEGROUPS() {
        return managedmodegroups;
    }

    /**
     * ??managedmodegroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS }
     *     
     */
    public void setMANAGEDMODEGROUPS(BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS value) {
        this.managedmodegroups = value;
    }

    /**
     * ??schedulernameprefixref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF }
     *     
     */
    public BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF getSCHEDULERNAMEPREFIXREF() {
        return schedulernameprefixref;
    }

    /**
     * ??schedulernameprefixref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF }
     *     
     */
    public void setSCHEDULERNAMEPREFIXREF(BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF value) {
        this.schedulernameprefixref = value;
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
     *         &lt;element name="MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL"/>
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
        "modedeclarationgroupprototyperefconditional"
    })
    public static class ACCESSEDMODEGROUPS {

        @XmlElement(name = "MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL")
        protected List<MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL> modedeclarationgroupprototyperefconditional;

        /**
         * Gets the value of the modedeclarationgroupprototyperefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedeclarationgroupprototyperefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL }
         * 
         * 
         */
        public List<MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL> getMODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL() {
            if (modedeclarationgroupprototyperefconditional == null) {
                modedeclarationgroupprototyperefconditional = new ArrayList<MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL>();
            }
            return this.modedeclarationgroupprototyperefconditional;
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
     *         &lt;element name="BSW-INTERNAL-TRIGGERING-POINT-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}BSW-INTERNAL-TRIGGERING-POINT-REF-CONDITIONAL"/>
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
        "bswinternaltriggeringpointrefconditional"
    })
    public static class ACTIVATIONPOINTS {

        @XmlElement(name = "BSW-INTERNAL-TRIGGERING-POINT-REF-CONDITIONAL")
        protected List<BSWINTERNALTRIGGERINGPOINTREFCONDITIONAL> bswinternaltriggeringpointrefconditional;

        /**
         * Gets the value of the bswinternaltriggeringpointrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswinternaltriggeringpointrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWINTERNALTRIGGERINGPOINTREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWINTERNALTRIGGERINGPOINTREFCONDITIONAL }
         * 
         * 
         */
        public List<BSWINTERNALTRIGGERINGPOINTREFCONDITIONAL> getBSWINTERNALTRIGGERINGPOINTREFCONDITIONAL() {
            if (bswinternaltriggeringpointrefconditional == null) {
                bswinternaltriggeringpointrefconditional = new ArrayList<BSWINTERNALTRIGGERINGPOINTREFCONDITIONAL>();
            }
            return this.bswinternaltriggeringpointrefconditional;
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
     *         &lt;element name="EXECUTABLE-ENTITY-ACTIVATION-REASON" type="{http://autosar.org/schema/r4.0}EXECUTABLE-ENTITY-ACTIVATION-REASON"/>
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
        "executableentityactivationreason"
    })
    public static class ACTIVATIONREASONS {

        @XmlElement(name = "EXECUTABLE-ENTITY-ACTIVATION-REASON")
        protected List<EXECUTABLEENTITYACTIVATIONREASON> executableentityactivationreason;

        /**
         * Gets the value of the executableentityactivationreason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the executableentityactivationreason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXECUTABLEENTITYACTIVATIONREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EXECUTABLEENTITYACTIVATIONREASON }
         * 
         * 
         */
        public List<EXECUTABLEENTITYACTIVATIONREASON> getEXECUTABLEENTITYACTIVATIONREASON() {
            if (executableentityactivationreason == null) {
                executableentityactivationreason = new ArrayList<EXECUTABLEENTITYACTIVATIONREASON>();
            }
            return this.executableentityactivationreason;
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
    public static class CALLEDENTRYS {

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
     *         &lt;element name="BSW-ASYNCHRONOUS-SERVER-CALL-POINT" type="{http://autosar.org/schema/r4.0}BSW-ASYNCHRONOUS-SERVER-CALL-POINT"/>
     *         &lt;element name="BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT" type="{http://autosar.org/schema/r4.0}BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"/>
     *         &lt;element name="BSW-DIRECT-CALL-POINT" type="{http://autosar.org/schema/r4.0}BSW-DIRECT-CALL-POINT"/>
     *         &lt;element name="BSW-SYNCHRONOUS-SERVER-CALL-POINT" type="{http://autosar.org/schema/r4.0}BSW-SYNCHRONOUS-SERVER-CALL-POINT"/>
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
        "bswasynchronousservercallpointOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT"
    })
    public static class CALLPOINTS {

        @XmlElements({
            @XmlElement(name = "BSW-ASYNCHRONOUS-SERVER-CALL-POINT", type = BSWASYNCHRONOUSSERVERCALLPOINT.class),
            @XmlElement(name = "BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT", type = BSWASYNCHRONOUSSERVERCALLRESULTPOINT.class),
            @XmlElement(name = "BSW-DIRECT-CALL-POINT", type = BSWDIRECTCALLPOINT.class),
            @XmlElement(name = "BSW-SYNCHRONOUS-SERVER-CALL-POINT", type = BSWSYNCHRONOUSSERVERCALLPOINT.class)
        })
        protected List<Object> bswasynchronousservercallpointOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT;

        /**
         * Gets the value of the bswasynchronousservercallpointOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswasynchronousservercallpointOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWASYNCHRONOUSSERVERCALLPOINTOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWASYNCHRONOUSSERVERCALLPOINT }
         * {@link BSWASYNCHRONOUSSERVERCALLRESULTPOINT }
         * {@link BSWDIRECTCALLPOINT }
         * {@link BSWSYNCHRONOUSSERVERCALLPOINT }
         * 
         * 
         */
        public List<Object> getBSWASYNCHRONOUSSERVERCALLPOINTOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT() {
            if (bswasynchronousservercallpointOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT == null) {
                bswasynchronousservercallpointOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT = new ArrayList<Object>();
            }
            return this.bswasynchronousservercallpointOrBSWASYNCHRONOUSSERVERCALLRESULTPOINTOrBSWDIRECTCALLPOINT;
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
     *         &lt;element name="CAN-ENTER-EXCLUSIVE-AREA-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA--SUBTYPES-ENUM" />
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
        "canenterexclusivearearef"
    })
    public static class CANENTEREXCLUSIVEAREAREFS {

        @XmlElement(name = "CAN-ENTER-EXCLUSIVE-AREA-REF")
        protected List<BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS.CANENTEREXCLUSIVEAREAREF> canenterexclusivearearef;

        /**
         * Gets the value of the canenterexclusivearearef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the canenterexclusivearearef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANENTEREXCLUSIVEAREAREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS.CANENTEREXCLUSIVEAREAREF }
         * 
         * 
         */
        public List<BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS.CANENTEREXCLUSIVEAREAREF> getCANENTEREXCLUSIVEAREAREF() {
            if (canenterexclusivearearef == null) {
                canenterexclusivearearef = new ArrayList<BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS.CANENTEREXCLUSIVEAREAREF>();
            }
            return this.canenterexclusivearearef;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CANENTEREXCLUSIVEAREAREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EXCLUSIVEAREASUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EXCLUSIVEAREASUBTYPESENUM }
             *     
             */
            public EXCLUSIVEAREASUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EXCLUSIVEAREASUBTYPESENUM }
             *     
             */
            public void setDEST(EXCLUSIVEAREASUBTYPESENUM value) {
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
     *         &lt;element name="BSW-VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}BSW-VARIABLE-ACCESS"/>
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
        "bswvariableaccess"
    })
    public static class DATARECEIVEPOINTS {

        @XmlElement(name = "BSW-VARIABLE-ACCESS")
        protected List<BSWVARIABLEACCESS> bswvariableaccess;

        /**
         * Gets the value of the bswvariableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswvariableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWVARIABLEACCESS }
         * 
         * 
         */
        public List<BSWVARIABLEACCESS> getBSWVARIABLEACCESS() {
            if (bswvariableaccess == null) {
                bswvariableaccess = new ArrayList<BSWVARIABLEACCESS>();
            }
            return this.bswvariableaccess;
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
     *         &lt;element name="BSW-VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}BSW-VARIABLE-ACCESS"/>
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
        "bswvariableaccess"
    })
    public static class DATASENDPOINTS {

        @XmlElement(name = "BSW-VARIABLE-ACCESS")
        protected List<BSWVARIABLEACCESS> bswvariableaccess;

        /**
         * Gets the value of the bswvariableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswvariableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWVARIABLEACCESS }
         * 
         * 
         */
        public List<BSWVARIABLEACCESS> getBSWVARIABLEACCESS() {
            if (bswvariableaccess == null) {
                bswvariableaccess = new ArrayList<BSWVARIABLEACCESS>();
            }
            return this.bswvariableaccess;
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
     *         &lt;element name="EXCLUSIVE-AREA-NESTING-ORDER-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA-NESTING-ORDER--SUBTYPES-ENUM" />
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
        "exclusiveareanestingorderref"
    })
    public static class EXCLUSIVEAREANESTINGORDERREFS {

        @XmlElement(name = "EXCLUSIVE-AREA-NESTING-ORDER-REF")
        protected List<BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS.EXCLUSIVEAREANESTINGORDERREF> exclusiveareanestingorderref;

        /**
         * Gets the value of the exclusiveareanestingorderref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exclusiveareanestingorderref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXCLUSIVEAREANESTINGORDERREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS.EXCLUSIVEAREANESTINGORDERREF }
         * 
         * 
         */
        public List<BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS.EXCLUSIVEAREANESTINGORDERREF> getEXCLUSIVEAREANESTINGORDERREF() {
            if (exclusiveareanestingorderref == null) {
                exclusiveareanestingorderref = new ArrayList<BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS.EXCLUSIVEAREANESTINGORDERREF>();
            }
            return this.exclusiveareanestingorderref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA-NESTING-ORDER--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EXCLUSIVEAREANESTINGORDERREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EXCLUSIVEAREANESTINGORDERSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EXCLUSIVEAREANESTINGORDERSUBTYPESENUM }
             *     
             */
            public EXCLUSIVEAREANESTINGORDERSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EXCLUSIVEAREANESTINGORDERSUBTYPESENUM }
             *     
             */
            public void setDEST(EXCLUSIVEAREANESTINGORDERSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTRY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IMPLEMENTEDENTRYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULEENTRYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULEENTRYSUBTYPESENUM }
         *     
         */
        public BSWMODULEENTRYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULEENTRYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULEENTRYSUBTYPESENUM value) {
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
     *         &lt;element name="TRIGGER-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}TRIGGER-REF-CONDITIONAL"/>
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
        "triggerrefconditional"
    })
    public static class ISSUEDTRIGGERS {

        @XmlElement(name = "TRIGGER-REF-CONDITIONAL")
        protected List<TRIGGERREFCONDITIONAL> triggerrefconditional;

        /**
         * Gets the value of the triggerrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the triggerrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRIGGERREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRIGGERREFCONDITIONAL }
         * 
         * 
         */
        public List<TRIGGERREFCONDITIONAL> getTRIGGERREFCONDITIONAL() {
            if (triggerrefconditional == null) {
                triggerrefconditional = new ArrayList<TRIGGERREFCONDITIONAL>();
            }
            return this.triggerrefconditional;
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
     *         &lt;element name="MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL"/>
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
        "modedeclarationgroupprototyperefconditional"
    })
    public static class MANAGEDMODEGROUPS {

        @XmlElement(name = "MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL")
        protected List<MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL> modedeclarationgroupprototyperefconditional;

        /**
         * Gets the value of the modedeclarationgroupprototyperefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedeclarationgroupprototyperefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL }
         * 
         * 
         */
        public List<MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL> getMODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL() {
            if (modedeclarationgroupprototyperefconditional == null) {
                modedeclarationgroupprototyperefconditional = new ArrayList<MODEDECLARATIONGROUPPROTOTYPEREFCONDITIONAL>();
            }
            return this.modedeclarationgroupprototyperefconditional;
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
     *         &lt;element name="RUNS-INSIDE-EXCLUSIVE-AREA-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA--SUBTYPES-ENUM" />
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
        "runsinsideexclusivearearef"
    })
    public static class RUNSINSIDEEXCLUSIVEAREAREFS {

        @XmlElement(name = "RUNS-INSIDE-EXCLUSIVE-AREA-REF")
        protected List<BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS.RUNSINSIDEEXCLUSIVEAREAREF> runsinsideexclusivearearef;

        /**
         * Gets the value of the runsinsideexclusivearearef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runsinsideexclusivearearef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNSINSIDEEXCLUSIVEAREAREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS.RUNSINSIDEEXCLUSIVEAREAREF }
         * 
         * 
         */
        public List<BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS.RUNSINSIDEEXCLUSIVEAREAREF> getRUNSINSIDEEXCLUSIVEAREAREF() {
            if (runsinsideexclusivearearef == null) {
                runsinsideexclusivearearef = new ArrayList<BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS.RUNSINSIDEEXCLUSIVEAREAREF>();
            }
            return this.runsinsideexclusivearearef;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RUNSINSIDEEXCLUSIVEAREAREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EXCLUSIVEAREASUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EXCLUSIVEAREASUBTYPESENUM }
             *     
             */
            public EXCLUSIVEAREASUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EXCLUSIVEAREASUBTYPESENUM }
             *     
             */
            public void setDEST(EXCLUSIVEAREASUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-SCHEDULER-NAME-PREFIX--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SCHEDULERNAMEPREFIXREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWSCHEDULERNAMEPREFIXSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWSCHEDULERNAMEPREFIXSUBTYPESENUM }
         *     
         */
        public BSWSCHEDULERNAMEPREFIXSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWSCHEDULERNAMEPREFIXSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWSCHEDULERNAMEPREFIXSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-ADDR-METHOD--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWADDRMETHODREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWADDRMETHODSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWADDRMETHODSUBTYPESENUM }
         *     
         */
        public SWADDRMETHODSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWADDRMETHODSUBTYPESENUM }
         *     
         */
        public void setDEST(SWADDRMETHODSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
