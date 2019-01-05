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
 * A RunnableEntity represents the smallest code-fragment that is provided by an AtomicSwComponentType and are executed under control of the RTE. RunnableEntities are for instance set up to respond to data reception or operation invocation on a server.
 * 
 * <p>RUNNABLE-ENTITY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RUNNABLE-ENTITY">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXECUTABLE-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RUNNABLE-ENTITY"/>
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
@XmlType(name = "RUNNABLE-ENTITY", propOrder = {
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
    "arguments",
    "asynchronousservercallresultpoints",
    "canbeinvokedconcurrently",
    "datareadaccesss",
    "datareceivepointbyarguments",
    "datareceivepointbyvalues",
    "datasendpoints",
    "datawriteaccesss",
    "externaltriggeringpoints",
    "internaltriggeringpoints",
    "modeaccesspoints",
    "modeswitchpoints",
    "parameteraccesss",
    "readlocalvariables",
    "servercallpoints",
    "symbol",
    "waitpoints",
    "writtenlocalvariables",
    "variationpoint"
})
public class RUNNABLEENTITY {

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
    @XmlElement(name = "ARGUMENTS")
    protected RUNNABLEENTITY.ARGUMENTS arguments;
    @XmlElement(name = "ASYNCHRONOUS-SERVER-CALL-RESULT-POINTS")
    protected RUNNABLEENTITY.ASYNCHRONOUSSERVERCALLRESULTPOINTS asynchronousservercallresultpoints;
    @XmlElement(name = "CAN-BE-INVOKED-CONCURRENTLY")
    protected BOOLEAN canbeinvokedconcurrently;
    @XmlElement(name = "DATA-READ-ACCESSS")
    protected RUNNABLEENTITY.DATAREADACCESSS datareadaccesss;
    @XmlElement(name = "DATA-RECEIVE-POINT-BY-ARGUMENTS")
    protected RUNNABLEENTITY.DATARECEIVEPOINTBYARGUMENTS datareceivepointbyarguments;
    @XmlElement(name = "DATA-RECEIVE-POINT-BY-VALUES")
    protected RUNNABLEENTITY.DATARECEIVEPOINTBYVALUES datareceivepointbyvalues;
    @XmlElement(name = "DATA-SEND-POINTS")
    protected RUNNABLEENTITY.DATASENDPOINTS datasendpoints;
    @XmlElement(name = "DATA-WRITE-ACCESSS")
    protected RUNNABLEENTITY.DATAWRITEACCESSS datawriteaccesss;
    @XmlElement(name = "EXTERNAL-TRIGGERING-POINTS")
    protected RUNNABLEENTITY.EXTERNALTRIGGERINGPOINTS externaltriggeringpoints;
    @XmlElement(name = "INTERNAL-TRIGGERING-POINTS")
    protected RUNNABLEENTITY.INTERNALTRIGGERINGPOINTS internaltriggeringpoints;
    @XmlElement(name = "MODE-ACCESS-POINTS")
    protected RUNNABLEENTITY.MODEACCESSPOINTS modeaccesspoints;
    @XmlElement(name = "MODE-SWITCH-POINTS")
    protected RUNNABLEENTITY.MODESWITCHPOINTS modeswitchpoints;
    @XmlElement(name = "PARAMETER-ACCESSS")
    protected RUNNABLEENTITY.PARAMETERACCESSS parameteraccesss;
    @XmlElement(name = "READ-LOCAL-VARIABLES")
    protected RUNNABLEENTITY.READLOCALVARIABLES readlocalvariables;
    @XmlElement(name = "SERVER-CALL-POINTS")
    protected RUNNABLEENTITY.SERVERCALLPOINTS servercallpoints;
    @XmlElement(name = "SYMBOL")
    protected CIDENTIFIER symbol;
    @XmlElement(name = "WAIT-POINTS")
    protected RUNNABLEENTITY.WAITPOINTS waitpoints;
    @XmlElement(name = "WRITTEN-LOCAL-VARIABLES")
    protected RUNNABLEENTITY.WRITTENLOCALVARIABLES writtenlocalvariables;
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
     * ??arguments?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.ARGUMENTS }
     *     
     */
    public RUNNABLEENTITY.ARGUMENTS getARGUMENTS() {
        return arguments;
    }

    /**
     * ??arguments?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.ARGUMENTS }
     *     
     */
    public void setARGUMENTS(RUNNABLEENTITY.ARGUMENTS value) {
        this.arguments = value;
    }

    /**
     * ??asynchronousservercallresultpoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.ASYNCHRONOUSSERVERCALLRESULTPOINTS }
     *     
     */
    public RUNNABLEENTITY.ASYNCHRONOUSSERVERCALLRESULTPOINTS getASYNCHRONOUSSERVERCALLRESULTPOINTS() {
        return asynchronousservercallresultpoints;
    }

    /**
     * ??asynchronousservercallresultpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.ASYNCHRONOUSSERVERCALLRESULTPOINTS }
     *     
     */
    public void setASYNCHRONOUSSERVERCALLRESULTPOINTS(RUNNABLEENTITY.ASYNCHRONOUSSERVERCALLRESULTPOINTS value) {
        this.asynchronousservercallresultpoints = value;
    }

    /**
     * ??canbeinvokedconcurrently?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCANBEINVOKEDCONCURRENTLY() {
        return canbeinvokedconcurrently;
    }

    /**
     * ??canbeinvokedconcurrently?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCANBEINVOKEDCONCURRENTLY(BOOLEAN value) {
        this.canbeinvokedconcurrently = value;
    }

    /**
     * ??datareadaccesss?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.DATAREADACCESSS }
     *     
     */
    public RUNNABLEENTITY.DATAREADACCESSS getDATAREADACCESSS() {
        return datareadaccesss;
    }

    /**
     * ??datareadaccesss?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.DATAREADACCESSS }
     *     
     */
    public void setDATAREADACCESSS(RUNNABLEENTITY.DATAREADACCESSS value) {
        this.datareadaccesss = value;
    }

    /**
     * ??datareceivepointbyarguments?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.DATARECEIVEPOINTBYARGUMENTS }
     *     
     */
    public RUNNABLEENTITY.DATARECEIVEPOINTBYARGUMENTS getDATARECEIVEPOINTBYARGUMENTS() {
        return datareceivepointbyarguments;
    }

    /**
     * ??datareceivepointbyarguments?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.DATARECEIVEPOINTBYARGUMENTS }
     *     
     */
    public void setDATARECEIVEPOINTBYARGUMENTS(RUNNABLEENTITY.DATARECEIVEPOINTBYARGUMENTS value) {
        this.datareceivepointbyarguments = value;
    }

    /**
     * ??datareceivepointbyvalues?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.DATARECEIVEPOINTBYVALUES }
     *     
     */
    public RUNNABLEENTITY.DATARECEIVEPOINTBYVALUES getDATARECEIVEPOINTBYVALUES() {
        return datareceivepointbyvalues;
    }

    /**
     * ??datareceivepointbyvalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.DATARECEIVEPOINTBYVALUES }
     *     
     */
    public void setDATARECEIVEPOINTBYVALUES(RUNNABLEENTITY.DATARECEIVEPOINTBYVALUES value) {
        this.datareceivepointbyvalues = value;
    }

    /**
     * ??datasendpoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.DATASENDPOINTS }
     *     
     */
    public RUNNABLEENTITY.DATASENDPOINTS getDATASENDPOINTS() {
        return datasendpoints;
    }

    /**
     * ??datasendpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.DATASENDPOINTS }
     *     
     */
    public void setDATASENDPOINTS(RUNNABLEENTITY.DATASENDPOINTS value) {
        this.datasendpoints = value;
    }

    /**
     * ??datawriteaccesss?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.DATAWRITEACCESSS }
     *     
     */
    public RUNNABLEENTITY.DATAWRITEACCESSS getDATAWRITEACCESSS() {
        return datawriteaccesss;
    }

    /**
     * ??datawriteaccesss?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.DATAWRITEACCESSS }
     *     
     */
    public void setDATAWRITEACCESSS(RUNNABLEENTITY.DATAWRITEACCESSS value) {
        this.datawriteaccesss = value;
    }

    /**
     * ??externaltriggeringpoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.EXTERNALTRIGGERINGPOINTS }
     *     
     */
    public RUNNABLEENTITY.EXTERNALTRIGGERINGPOINTS getEXTERNALTRIGGERINGPOINTS() {
        return externaltriggeringpoints;
    }

    /**
     * ??externaltriggeringpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.EXTERNALTRIGGERINGPOINTS }
     *     
     */
    public void setEXTERNALTRIGGERINGPOINTS(RUNNABLEENTITY.EXTERNALTRIGGERINGPOINTS value) {
        this.externaltriggeringpoints = value;
    }

    /**
     * ??internaltriggeringpoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.INTERNALTRIGGERINGPOINTS }
     *     
     */
    public RUNNABLEENTITY.INTERNALTRIGGERINGPOINTS getINTERNALTRIGGERINGPOINTS() {
        return internaltriggeringpoints;
    }

    /**
     * ??internaltriggeringpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.INTERNALTRIGGERINGPOINTS }
     *     
     */
    public void setINTERNALTRIGGERINGPOINTS(RUNNABLEENTITY.INTERNALTRIGGERINGPOINTS value) {
        this.internaltriggeringpoints = value;
    }

    /**
     * ??modeaccesspoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.MODEACCESSPOINTS }
     *     
     */
    public RUNNABLEENTITY.MODEACCESSPOINTS getMODEACCESSPOINTS() {
        return modeaccesspoints;
    }

    /**
     * ??modeaccesspoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.MODEACCESSPOINTS }
     *     
     */
    public void setMODEACCESSPOINTS(RUNNABLEENTITY.MODEACCESSPOINTS value) {
        this.modeaccesspoints = value;
    }

    /**
     * ??modeswitchpoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.MODESWITCHPOINTS }
     *     
     */
    public RUNNABLEENTITY.MODESWITCHPOINTS getMODESWITCHPOINTS() {
        return modeswitchpoints;
    }

    /**
     * ??modeswitchpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.MODESWITCHPOINTS }
     *     
     */
    public void setMODESWITCHPOINTS(RUNNABLEENTITY.MODESWITCHPOINTS value) {
        this.modeswitchpoints = value;
    }

    /**
     * ??parameteraccesss?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.PARAMETERACCESSS }
     *     
     */
    public RUNNABLEENTITY.PARAMETERACCESSS getPARAMETERACCESSS() {
        return parameteraccesss;
    }

    /**
     * ??parameteraccesss?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.PARAMETERACCESSS }
     *     
     */
    public void setPARAMETERACCESSS(RUNNABLEENTITY.PARAMETERACCESSS value) {
        this.parameteraccesss = value;
    }

    /**
     * ??readlocalvariables?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.READLOCALVARIABLES }
     *     
     */
    public RUNNABLEENTITY.READLOCALVARIABLES getREADLOCALVARIABLES() {
        return readlocalvariables;
    }

    /**
     * ??readlocalvariables?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.READLOCALVARIABLES }
     *     
     */
    public void setREADLOCALVARIABLES(RUNNABLEENTITY.READLOCALVARIABLES value) {
        this.readlocalvariables = value;
    }

    /**
     * ??servercallpoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.SERVERCALLPOINTS }
     *     
     */
    public RUNNABLEENTITY.SERVERCALLPOINTS getSERVERCALLPOINTS() {
        return servercallpoints;
    }

    /**
     * ??servercallpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.SERVERCALLPOINTS }
     *     
     */
    public void setSERVERCALLPOINTS(RUNNABLEENTITY.SERVERCALLPOINTS value) {
        this.servercallpoints = value;
    }

    /**
     * ??symbol?????
     * 
     * @return
     *     possible object is
     *     {@link CIDENTIFIER }
     *     
     */
    public CIDENTIFIER getSYMBOL() {
        return symbol;
    }

    /**
     * ??symbol?????
     * 
     * @param value
     *     allowed object is
     *     {@link CIDENTIFIER }
     *     
     */
    public void setSYMBOL(CIDENTIFIER value) {
        this.symbol = value;
    }

    /**
     * ??waitpoints?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.WAITPOINTS }
     *     
     */
    public RUNNABLEENTITY.WAITPOINTS getWAITPOINTS() {
        return waitpoints;
    }

    /**
     * ??waitpoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.WAITPOINTS }
     *     
     */
    public void setWAITPOINTS(RUNNABLEENTITY.WAITPOINTS value) {
        this.waitpoints = value;
    }

    /**
     * ??writtenlocalvariables?????
     * 
     * @return
     *     possible object is
     *     {@link RUNNABLEENTITY.WRITTENLOCALVARIABLES }
     *     
     */
    public RUNNABLEENTITY.WRITTENLOCALVARIABLES getWRITTENLOCALVARIABLES() {
        return writtenlocalvariables;
    }

    /**
     * ??writtenlocalvariables?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNNABLEENTITY.WRITTENLOCALVARIABLES }
     *     
     */
    public void setWRITTENLOCALVARIABLES(RUNNABLEENTITY.WRITTENLOCALVARIABLES value) {
        this.writtenlocalvariables = value;
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
     *         &lt;element name="RUNNABLE-ENTITY-ARGUMENT" type="{http://autosar.org/schema/r4.0}RUNNABLE-ENTITY-ARGUMENT"/>
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
        "runnableentityargument"
    })
    public static class ARGUMENTS {

        @XmlElement(name = "RUNNABLE-ENTITY-ARGUMENT")
        protected List<RUNNABLEENTITYARGUMENT> runnableentityargument;

        /**
         * Gets the value of the runnableentityargument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runnableentityargument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNNABLEENTITYARGUMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RUNNABLEENTITYARGUMENT }
         * 
         * 
         */
        public List<RUNNABLEENTITYARGUMENT> getRUNNABLEENTITYARGUMENT() {
            if (runnableentityargument == null) {
                runnableentityargument = new ArrayList<RUNNABLEENTITYARGUMENT>();
            }
            return this.runnableentityargument;
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
     *         &lt;element name="ASYNCHRONOUS-SERVER-CALL-RESULT-POINT" type="{http://autosar.org/schema/r4.0}ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"/>
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
        "asynchronousservercallresultpoint"
    })
    public static class ASYNCHRONOUSSERVERCALLRESULTPOINTS {

        @XmlElement(name = "ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
        protected List<ASYNCHRONOUSSERVERCALLRESULTPOINT> asynchronousservercallresultpoint;

        /**
         * Gets the value of the asynchronousservercallresultpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asynchronousservercallresultpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASYNCHRONOUSSERVERCALLRESULTPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASYNCHRONOUSSERVERCALLRESULTPOINT }
         * 
         * 
         */
        public List<ASYNCHRONOUSSERVERCALLRESULTPOINT> getASYNCHRONOUSSERVERCALLRESULTPOINT() {
            if (asynchronousservercallresultpoint == null) {
                asynchronousservercallresultpoint = new ArrayList<ASYNCHRONOUSSERVERCALLRESULTPOINT>();
            }
            return this.asynchronousservercallresultpoint;
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
     *         &lt;element name="VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS"/>
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
        "variableaccess"
    })
    public static class DATAREADACCESSS {

        @XmlElement(name = "VARIABLE-ACCESS")
        protected List<VARIABLEACCESS> variableaccess;

        /**
         * Gets the value of the variableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESS }
         * 
         * 
         */
        public List<VARIABLEACCESS> getVARIABLEACCESS() {
            if (variableaccess == null) {
                variableaccess = new ArrayList<VARIABLEACCESS>();
            }
            return this.variableaccess;
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
     *         &lt;element name="VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS"/>
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
        "variableaccess"
    })
    public static class DATARECEIVEPOINTBYARGUMENTS {

        @XmlElement(name = "VARIABLE-ACCESS")
        protected List<VARIABLEACCESS> variableaccess;

        /**
         * Gets the value of the variableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESS }
         * 
         * 
         */
        public List<VARIABLEACCESS> getVARIABLEACCESS() {
            if (variableaccess == null) {
                variableaccess = new ArrayList<VARIABLEACCESS>();
            }
            return this.variableaccess;
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
     *         &lt;element name="VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS"/>
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
        "variableaccess"
    })
    public static class DATARECEIVEPOINTBYVALUES {

        @XmlElement(name = "VARIABLE-ACCESS")
        protected List<VARIABLEACCESS> variableaccess;

        /**
         * Gets the value of the variableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESS }
         * 
         * 
         */
        public List<VARIABLEACCESS> getVARIABLEACCESS() {
            if (variableaccess == null) {
                variableaccess = new ArrayList<VARIABLEACCESS>();
            }
            return this.variableaccess;
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
     *         &lt;element name="VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS"/>
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
        "variableaccess"
    })
    public static class DATASENDPOINTS {

        @XmlElement(name = "VARIABLE-ACCESS")
        protected List<VARIABLEACCESS> variableaccess;

        /**
         * Gets the value of the variableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESS }
         * 
         * 
         */
        public List<VARIABLEACCESS> getVARIABLEACCESS() {
            if (variableaccess == null) {
                variableaccess = new ArrayList<VARIABLEACCESS>();
            }
            return this.variableaccess;
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
     *         &lt;element name="VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS"/>
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
        "variableaccess"
    })
    public static class DATAWRITEACCESSS {

        @XmlElement(name = "VARIABLE-ACCESS")
        protected List<VARIABLEACCESS> variableaccess;

        /**
         * Gets the value of the variableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESS }
         * 
         * 
         */
        public List<VARIABLEACCESS> getVARIABLEACCESS() {
            if (variableaccess == null) {
                variableaccess = new ArrayList<VARIABLEACCESS>();
            }
            return this.variableaccess;
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
     *         &lt;element name="EXTERNAL-TRIGGERING-POINT" type="{http://autosar.org/schema/r4.0}EXTERNAL-TRIGGERING-POINT"/>
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
        "externaltriggeringpoint"
    })
    public static class EXTERNALTRIGGERINGPOINTS {

        @XmlElement(name = "EXTERNAL-TRIGGERING-POINT")
        protected List<EXTERNALTRIGGERINGPOINT> externaltriggeringpoint;

        /**
         * Gets the value of the externaltriggeringpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externaltriggeringpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXTERNALTRIGGERINGPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EXTERNALTRIGGERINGPOINT }
         * 
         * 
         */
        public List<EXTERNALTRIGGERINGPOINT> getEXTERNALTRIGGERINGPOINT() {
            if (externaltriggeringpoint == null) {
                externaltriggeringpoint = new ArrayList<EXTERNALTRIGGERINGPOINT>();
            }
            return this.externaltriggeringpoint;
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
     *         &lt;element name="INTERNAL-TRIGGERING-POINT" type="{http://autosar.org/schema/r4.0}INTERNAL-TRIGGERING-POINT"/>
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
        "internaltriggeringpoint"
    })
    public static class INTERNALTRIGGERINGPOINTS {

        @XmlElement(name = "INTERNAL-TRIGGERING-POINT")
        protected List<INTERNALTRIGGERINGPOINT> internaltriggeringpoint;

        /**
         * Gets the value of the internaltriggeringpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the internaltriggeringpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTERNALTRIGGERINGPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INTERNALTRIGGERINGPOINT }
         * 
         * 
         */
        public List<INTERNALTRIGGERINGPOINT> getINTERNALTRIGGERINGPOINT() {
            if (internaltriggeringpoint == null) {
                internaltriggeringpoint = new ArrayList<INTERNALTRIGGERINGPOINT>();
            }
            return this.internaltriggeringpoint;
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
     *         &lt;element name="MODE-ACCESS-POINT" type="{http://autosar.org/schema/r4.0}MODE-ACCESS-POINT"/>
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
        "modeaccesspoint"
    })
    public static class MODEACCESSPOINTS {

        @XmlElement(name = "MODE-ACCESS-POINT")
        protected List<MODEACCESSPOINT> modeaccesspoint;

        /**
         * Gets the value of the modeaccesspoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modeaccesspoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEACCESSPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEACCESSPOINT }
         * 
         * 
         */
        public List<MODEACCESSPOINT> getMODEACCESSPOINT() {
            if (modeaccesspoint == null) {
                modeaccesspoint = new ArrayList<MODEACCESSPOINT>();
            }
            return this.modeaccesspoint;
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
     *         &lt;element name="MODE-SWITCH-POINT" type="{http://autosar.org/schema/r4.0}MODE-SWITCH-POINT"/>
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
        "modeswitchpoint"
    })
    public static class MODESWITCHPOINTS {

        @XmlElement(name = "MODE-SWITCH-POINT")
        protected List<MODESWITCHPOINT> modeswitchpoint;

        /**
         * Gets the value of the modeswitchpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modeswitchpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODESWITCHPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODESWITCHPOINT }
         * 
         * 
         */
        public List<MODESWITCHPOINT> getMODESWITCHPOINT() {
            if (modeswitchpoint == null) {
                modeswitchpoint = new ArrayList<MODESWITCHPOINT>();
            }
            return this.modeswitchpoint;
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
     *         &lt;element name="PARAMETER-ACCESS" type="{http://autosar.org/schema/r4.0}PARAMETER-ACCESS"/>
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
        "parameteraccess"
    })
    public static class PARAMETERACCESSS {

        @XmlElement(name = "PARAMETER-ACCESS")
        protected List<PARAMETERACCESS> parameteraccess;

        /**
         * Gets the value of the parameteraccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameteraccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAMETERACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARAMETERACCESS }
         * 
         * 
         */
        public List<PARAMETERACCESS> getPARAMETERACCESS() {
            if (parameteraccess == null) {
                parameteraccess = new ArrayList<PARAMETERACCESS>();
            }
            return this.parameteraccess;
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
     *         &lt;element name="VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS"/>
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
        "variableaccess"
    })
    public static class READLOCALVARIABLES {

        @XmlElement(name = "VARIABLE-ACCESS")
        protected List<VARIABLEACCESS> variableaccess;

        /**
         * Gets the value of the variableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESS }
         * 
         * 
         */
        public List<VARIABLEACCESS> getVARIABLEACCESS() {
            if (variableaccess == null) {
                variableaccess = new ArrayList<VARIABLEACCESS>();
            }
            return this.variableaccess;
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
     *         &lt;element name="ASYNCHRONOUS-SERVER-CALL-POINT" type="{http://autosar.org/schema/r4.0}ASYNCHRONOUS-SERVER-CALL-POINT"/>
     *         &lt;element name="SYNCHRONOUS-SERVER-CALL-POINT" type="{http://autosar.org/schema/r4.0}SYNCHRONOUS-SERVER-CALL-POINT"/>
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
        "asynchronousservercallpointOrSYNCHRONOUSSERVERCALLPOINT"
    })
    public static class SERVERCALLPOINTS {

        @XmlElements({
            @XmlElement(name = "ASYNCHRONOUS-SERVER-CALL-POINT", type = ASYNCHRONOUSSERVERCALLPOINT.class),
            @XmlElement(name = "SYNCHRONOUS-SERVER-CALL-POINT", type = SYNCHRONOUSSERVERCALLPOINT.class)
        })
        protected List<Object> asynchronousservercallpointOrSYNCHRONOUSSERVERCALLPOINT;

        /**
         * Gets the value of the asynchronousservercallpointOrSYNCHRONOUSSERVERCALLPOINT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asynchronousservercallpointOrSYNCHRONOUSSERVERCALLPOINT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASYNCHRONOUSSERVERCALLPOINTOrSYNCHRONOUSSERVERCALLPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASYNCHRONOUSSERVERCALLPOINT }
         * {@link SYNCHRONOUSSERVERCALLPOINT }
         * 
         * 
         */
        public List<Object> getASYNCHRONOUSSERVERCALLPOINTOrSYNCHRONOUSSERVERCALLPOINT() {
            if (asynchronousservercallpointOrSYNCHRONOUSSERVERCALLPOINT == null) {
                asynchronousservercallpointOrSYNCHRONOUSSERVERCALLPOINT = new ArrayList<Object>();
            }
            return this.asynchronousservercallpointOrSYNCHRONOUSSERVERCALLPOINT;
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
     *         &lt;element name="WAIT-POINT" type="{http://autosar.org/schema/r4.0}WAIT-POINT"/>
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
        "waitpoint"
    })
    public static class WAITPOINTS {

        @XmlElement(name = "WAIT-POINT")
        protected List<WAITPOINT> waitpoint;

        /**
         * Gets the value of the waitpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waitpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWAITPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WAITPOINT }
         * 
         * 
         */
        public List<WAITPOINT> getWAITPOINT() {
            if (waitpoint == null) {
                waitpoint = new ArrayList<WAITPOINT>();
            }
            return this.waitpoint;
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
     *         &lt;element name="VARIABLE-ACCESS" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS"/>
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
        "variableaccess"
    })
    public static class WRITTENLOCALVARIABLES {

        @XmlElement(name = "VARIABLE-ACCESS")
        protected List<VARIABLEACCESS> variableaccess;

        /**
         * Gets the value of the variableaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESS }
         * 
         * 
         */
        public List<VARIABLEACCESS> getVARIABLEACCESS() {
            if (variableaccess == null) {
                variableaccess = new ArrayList<VARIABLEACCESS>();
            }
            return this.variableaccess;
        }

    }

}
