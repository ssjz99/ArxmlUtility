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
 * BSW module entity, which is designed to be triggered by an interrupt.
 * 
 * <p>BSW-INTERRUPT-ENTITY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-INTERRUPT-ENTITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXECUTABLE-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-INTERRUPT-ENTITY"/>
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
@XmlType(name = "BSW-INTERRUPT-ENTITY", propOrder = {
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
    "variationpoint",
    "interruptcategory",
    "interruptsource"
})
public class BSWINTERRUPTENTITY {

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
    protected Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONREASONS activationreasons;
    @XmlElement(name = "CAN-ENTER-EXCLUSIVE-AREA-REFS")
    protected Ar421.BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS canenterexclusivearearefs;
    @XmlElement(name = "EXCLUSIVE-AREA-NESTING-ORDER-REFS")
    protected Ar421.BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS exclusiveareanestingorderrefs;
    @XmlElement(name = "MINIMUM-START-INTERVAL")
    protected TIMEVALUE minimumstartinterval;
    @XmlElement(name = "REENTRANCY-LEVEL")
    protected REENTRANCYLEVELENUM reentrancylevel;
    @XmlElement(name = "RUNS-INSIDE-EXCLUSIVE-AREA-REFS")
    protected Ar421.BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS runsinsideexclusivearearefs;
    @XmlElement(name = "SW-ADDR-METHOD-REF")
    protected Ar421.BSWSCHEDULABLEENTITY.SWADDRMETHODREF swaddrmethodref;
    @XmlElement(name = "ACCESSED-MODE-GROUPS")
    protected Ar421.BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS accessedmodegroups;
    @XmlElement(name = "ACTIVATION-POINTS")
    protected Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS activationpoints;
    @XmlElement(name = "CALL-POINTS")
    protected Ar421.BSWSCHEDULABLEENTITY.CALLPOINTS callpoints;
    @XmlElement(name = "CALLED-ENTRYS")
    protected Ar421.BSWSCHEDULABLEENTITY.CALLEDENTRYS calledentrys;
    @XmlElement(name = "DATA-RECEIVE-POINTS")
    protected Ar421.BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS datareceivepoints;
    @XmlElement(name = "DATA-SEND-POINTS")
    protected Ar421.BSWSCHEDULABLEENTITY.DATASENDPOINTS datasendpoints;
    @XmlElement(name = "IMPLEMENTED-ENTRY-REF")
    protected Ar421.BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF implementedentryref;
    @XmlElement(name = "ISSUED-TRIGGERS")
    protected Ar421.BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS issuedtriggers;
    @XmlElement(name = "MANAGED-MODE-GROUPS")
    protected Ar421.BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS managedmodegroups;
    @XmlElement(name = "SCHEDULER-NAME-PREFIX-REF")
    protected Ar421.BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF schedulernameprefixref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "INTERRUPT-CATEGORY")
    protected BSWINTERRUPTCATEGORY interruptcategory;
    @XmlElement(name = "INTERRUPT-SOURCE")
    protected STRING interruptsource;
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
     * ??activationreasons?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONREASONS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONREASONS getACTIVATIONREASONS() {
        return activationreasons;
    }

    /**
     * ??activationreasons?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONREASONS }
     *     
     */
    public void setACTIVATIONREASONS(Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONREASONS value) {
        this.activationreasons = value;
    }

    /**
     * ??canenterexclusivearearefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS getCANENTEREXCLUSIVEAREAREFS() {
        return canenterexclusivearearefs;
    }

    /**
     * ??canenterexclusivearearefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS }
     *     
     */
    public void setCANENTEREXCLUSIVEAREAREFS(Ar421.BSWSCHEDULABLEENTITY.CANENTEREXCLUSIVEAREAREFS value) {
        this.canenterexclusivearearefs = value;
    }

    /**
     * ??exclusiveareanestingorderrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS getEXCLUSIVEAREANESTINGORDERREFS() {
        return exclusiveareanestingorderrefs;
    }

    /**
     * ??exclusiveareanestingorderrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS }
     *     
     */
    public void setEXCLUSIVEAREANESTINGORDERREFS(Ar421.BSWSCHEDULABLEENTITY.EXCLUSIVEAREANESTINGORDERREFS value) {
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
     *     {@link Ar421.BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS getRUNSINSIDEEXCLUSIVEAREAREFS() {
        return runsinsideexclusivearearefs;
    }

    /**
     * ??runsinsideexclusivearearefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS }
     *     
     */
    public void setRUNSINSIDEEXCLUSIVEAREAREFS(Ar421.BSWSCHEDULABLEENTITY.RUNSINSIDEEXCLUSIVEAREAREFS value) {
        this.runsinsideexclusivearearefs = value;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.SWADDRMETHODREF }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.SWADDRMETHODREF getSWADDRMETHODREF() {
        return swaddrmethodref;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.SWADDRMETHODREF }
     *     
     */
    public void setSWADDRMETHODREF(Ar421.BSWSCHEDULABLEENTITY.SWADDRMETHODREF value) {
        this.swaddrmethodref = value;
    }

    /**
     * ??accessedmodegroups?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS getACCESSEDMODEGROUPS() {
        return accessedmodegroups;
    }

    /**
     * ??accessedmodegroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS }
     *     
     */
    public void setACCESSEDMODEGROUPS(Ar421.BSWSCHEDULABLEENTITY.ACCESSEDMODEGROUPS value) {
        this.accessedmodegroups = value;
    }

    /**
     * ??activationpoints?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS getACTIVATIONPOINTS() {
        return activationpoints;
    }

    /**
     * ??activationpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS }
     *     
     */
    public void setACTIVATIONPOINTS(Ar421.BSWSCHEDULABLEENTITY.ACTIVATIONPOINTS value) {
        this.activationpoints = value;
    }

    /**
     * ??callpoints?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.CALLPOINTS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.CALLPOINTS getCALLPOINTS() {
        return callpoints;
    }

    /**
     * ??callpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.CALLPOINTS }
     *     
     */
    public void setCALLPOINTS(Ar421.BSWSCHEDULABLEENTITY.CALLPOINTS value) {
        this.callpoints = value;
    }

    /**
     * ??calledentrys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.CALLEDENTRYS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.CALLEDENTRYS getCALLEDENTRYS() {
        return calledentrys;
    }

    /**
     * ??calledentrys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.CALLEDENTRYS }
     *     
     */
    public void setCALLEDENTRYS(Ar421.BSWSCHEDULABLEENTITY.CALLEDENTRYS value) {
        this.calledentrys = value;
    }

    /**
     * ??datareceivepoints?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS getDATARECEIVEPOINTS() {
        return datareceivepoints;
    }

    /**
     * ??datareceivepoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS }
     *     
     */
    public void setDATARECEIVEPOINTS(Ar421.BSWSCHEDULABLEENTITY.DATARECEIVEPOINTS value) {
        this.datareceivepoints = value;
    }

    /**
     * ??datasendpoints?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.DATASENDPOINTS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.DATASENDPOINTS getDATASENDPOINTS() {
        return datasendpoints;
    }

    /**
     * ??datasendpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.DATASENDPOINTS }
     *     
     */
    public void setDATASENDPOINTS(Ar421.BSWSCHEDULABLEENTITY.DATASENDPOINTS value) {
        this.datasendpoints = value;
    }

    /**
     * ??implementedentryref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF getIMPLEMENTEDENTRYREF() {
        return implementedentryref;
    }

    /**
     * ??implementedentryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF }
     *     
     */
    public void setIMPLEMENTEDENTRYREF(Ar421.BSWSCHEDULABLEENTITY.IMPLEMENTEDENTRYREF value) {
        this.implementedentryref = value;
    }

    /**
     * ??issuedtriggers?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS getISSUEDTRIGGERS() {
        return issuedtriggers;
    }

    /**
     * ??issuedtriggers?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS }
     *     
     */
    public void setISSUEDTRIGGERS(Ar421.BSWSCHEDULABLEENTITY.ISSUEDTRIGGERS value) {
        this.issuedtriggers = value;
    }

    /**
     * ??managedmodegroups?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS getMANAGEDMODEGROUPS() {
        return managedmodegroups;
    }

    /**
     * ??managedmodegroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS }
     *     
     */
    public void setMANAGEDMODEGROUPS(Ar421.BSWSCHEDULABLEENTITY.MANAGEDMODEGROUPS value) {
        this.managedmodegroups = value;
    }

    /**
     * ??schedulernameprefixref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF }
     *     
     */
    public Ar421.BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF getSCHEDULERNAMEPREFIXREF() {
        return schedulernameprefixref;
    }

    /**
     * ??schedulernameprefixref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF }
     *     
     */
    public void setSCHEDULERNAMEPREFIXREF(Ar421.BSWSCHEDULABLEENTITY.SCHEDULERNAMEPREFIXREF value) {
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
     * ??interruptcategory?????
     * 
     * @return
     *     possible object is
     *     {@link BSWINTERRUPTCATEGORY }
     *     
     */
    public BSWINTERRUPTCATEGORY getINTERRUPTCATEGORY() {
        return interruptcategory;
    }

    /**
     * ??interruptcategory?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWINTERRUPTCATEGORY }
     *     
     */
    public void setINTERRUPTCATEGORY(BSWINTERRUPTCATEGORY value) {
        this.interruptcategory = value;
    }

    /**
     * ??interruptsource?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getINTERRUPTSOURCE() {
        return interruptsource;
    }

    /**
     * ??interruptsource?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setINTERRUPTSOURCE(STRING value) {
        this.interruptsource = value;
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

}
