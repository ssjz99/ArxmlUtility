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
 * FlexRay specific NM cluster attributes.
 * 
 * <p>FLEXRAY-NM-CLUSTER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-NM-CLUSTER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-CLUSTER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-NM-CLUSTER"/>
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
@XmlType(name = "FLEXRAY-NM-CLUSTER", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "communicationclusterref",
    "nmchannelid",
    "nmchannelsleepmaster",
    "nmnodes",
    "nmsynchronizingnetwork",
    "variationpoint",
    "nmcarwakeupbitposition",
    "nmcarwakeupfilterenabled",
    "nmcarwakeupfilternodeid",
    "nmcarwakeuprxenabled",
    "nmcontrolbitvectoractive",
    "nmdatacycle",
    "nmdataenabled",
    "nmdetectionlock",
    "nmmainfunctionperiod",
    "nmmessagetimeouttime",
    "nmreadysleepcount",
    "nmremotesleepindicationtime",
    "nmrepeatmessagebitactive",
    "nmrepeatmessagetime",
    "nmrepetitioncycle",
    "nmvotingcycle"
})
public class FLEXRAYNMCLUSTER {

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
    @XmlElement(name = "COMMUNICATION-CLUSTER-REF")
    protected Ar421.CANNMCLUSTER.COMMUNICATIONCLUSTERREF communicationclusterref;
    @XmlElement(name = "NM-CHANNEL-ID")
    protected POSITIVEINTEGER nmchannelid;
    @XmlElement(name = "NM-CHANNEL-SLEEP-MASTER")
    protected BOOLEAN nmchannelsleepmaster;
    @XmlElement(name = "NM-NODES")
    protected Ar421.CANNMCLUSTER.NMNODES nmnodes;
    @XmlElement(name = "NM-SYNCHRONIZING-NETWORK")
    protected BOOLEAN nmsynchronizingnetwork;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "NM-CAR-WAKE-UP-BIT-POSITION")
    protected POSITIVEINTEGER nmcarwakeupbitposition;
    @XmlElement(name = "NM-CAR-WAKE-UP-FILTER-ENABLED")
    protected BOOLEAN nmcarwakeupfilterenabled;
    @XmlElement(name = "NM-CAR-WAKE-UP-FILTER-NODE-ID")
    protected POSITIVEINTEGER nmcarwakeupfilternodeid;
    @XmlElement(name = "NM-CAR-WAKE-UP-RX-ENABLED")
    protected BOOLEAN nmcarwakeuprxenabled;
    @XmlElement(name = "NM-CONTROL-BIT-VECTOR-ACTIVE")
    protected BOOLEAN nmcontrolbitvectoractive;
    @XmlElement(name = "NM-DATA-CYCLE")
    protected INTEGER nmdatacycle;
    @XmlElement(name = "NM-DATA-ENABLED")
    protected BOOLEAN nmdataenabled;
    @XmlElement(name = "NM-DETECTION-LOCK")
    protected TIMEVALUE nmdetectionlock;
    @XmlElement(name = "NM-MAIN-FUNCTION-PERIOD")
    protected TIMEVALUE nmmainfunctionperiod;
    @XmlElement(name = "NM-MESSAGE-TIMEOUT-TIME")
    protected TIMEVALUE nmmessagetimeouttime;
    @XmlElement(name = "NM-READY-SLEEP-COUNT")
    protected INTEGER nmreadysleepcount;
    @XmlElement(name = "NM-REMOTE-SLEEP-INDICATION-TIME")
    protected TIMEVALUE nmremotesleepindicationtime;
    @XmlElement(name = "NM-REPEAT-MESSAGE-BIT-ACTIVE")
    protected BOOLEAN nmrepeatmessagebitactive;
    @XmlElement(name = "NM-REPEAT-MESSAGE-TIME")
    protected TIMEVALUE nmrepeatmessagetime;
    @XmlElement(name = "NM-REPETITION-CYCLE")
    protected INTEGER nmrepetitioncycle;
    @XmlElement(name = "NM-VOTING-CYCLE")
    protected INTEGER nmvotingcycle;
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
     * ??communicationclusterref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CANNMCLUSTER.COMMUNICATIONCLUSTERREF }
     *     
     */
    public Ar421.CANNMCLUSTER.COMMUNICATIONCLUSTERREF getCOMMUNICATIONCLUSTERREF() {
        return communicationclusterref;
    }

    /**
     * ??communicationclusterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CANNMCLUSTER.COMMUNICATIONCLUSTERREF }
     *     
     */
    public void setCOMMUNICATIONCLUSTERREF(Ar421.CANNMCLUSTER.COMMUNICATIONCLUSTERREF value) {
        this.communicationclusterref = value;
    }

    /**
     * ??nmchannelid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNMCHANNELID() {
        return nmchannelid;
    }

    /**
     * ??nmchannelid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNMCHANNELID(POSITIVEINTEGER value) {
        this.nmchannelid = value;
    }

    /**
     * ??nmchannelsleepmaster?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCHANNELSLEEPMASTER() {
        return nmchannelsleepmaster;
    }

    /**
     * ??nmchannelsleepmaster?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCHANNELSLEEPMASTER(BOOLEAN value) {
        this.nmchannelsleepmaster = value;
    }

    /**
     * ??nmnodes?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CANNMCLUSTER.NMNODES }
     *     
     */
    public Ar421.CANNMCLUSTER.NMNODES getNMNODES() {
        return nmnodes;
    }

    /**
     * ??nmnodes?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CANNMCLUSTER.NMNODES }
     *     
     */
    public void setNMNODES(Ar421.CANNMCLUSTER.NMNODES value) {
        this.nmnodes = value;
    }

    /**
     * ??nmsynchronizingnetwork?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMSYNCHRONIZINGNETWORK() {
        return nmsynchronizingnetwork;
    }

    /**
     * ??nmsynchronizingnetwork?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMSYNCHRONIZINGNETWORK(BOOLEAN value) {
        this.nmsynchronizingnetwork = value;
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
     * ??nmcarwakeupbitposition?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNMCARWAKEUPBITPOSITION() {
        return nmcarwakeupbitposition;
    }

    /**
     * ??nmcarwakeupbitposition?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNMCARWAKEUPBITPOSITION(POSITIVEINTEGER value) {
        this.nmcarwakeupbitposition = value;
    }

    /**
     * ??nmcarwakeupfilterenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCARWAKEUPFILTERENABLED() {
        return nmcarwakeupfilterenabled;
    }

    /**
     * ??nmcarwakeupfilterenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCARWAKEUPFILTERENABLED(BOOLEAN value) {
        this.nmcarwakeupfilterenabled = value;
    }

    /**
     * ??nmcarwakeupfilternodeid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNMCARWAKEUPFILTERNODEID() {
        return nmcarwakeupfilternodeid;
    }

    /**
     * ??nmcarwakeupfilternodeid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNMCARWAKEUPFILTERNODEID(POSITIVEINTEGER value) {
        this.nmcarwakeupfilternodeid = value;
    }

    /**
     * ??nmcarwakeuprxenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCARWAKEUPRXENABLED() {
        return nmcarwakeuprxenabled;
    }

    /**
     * ??nmcarwakeuprxenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCARWAKEUPRXENABLED(BOOLEAN value) {
        this.nmcarwakeuprxenabled = value;
    }

    /**
     * ??nmcontrolbitvectoractive?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCONTROLBITVECTORACTIVE() {
        return nmcontrolbitvectoractive;
    }

    /**
     * ??nmcontrolbitvectoractive?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCONTROLBITVECTORACTIVE(BOOLEAN value) {
        this.nmcontrolbitvectoractive = value;
    }

    /**
     * ??nmdatacycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMDATACYCLE() {
        return nmdatacycle;
    }

    /**
     * ??nmdatacycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMDATACYCLE(INTEGER value) {
        this.nmdatacycle = value;
    }

    /**
     * ??nmdataenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMDATAENABLED() {
        return nmdataenabled;
    }

    /**
     * ??nmdataenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMDATAENABLED(BOOLEAN value) {
        this.nmdataenabled = value;
    }

    /**
     * ??nmdetectionlock?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMDETECTIONLOCK() {
        return nmdetectionlock;
    }

    /**
     * ??nmdetectionlock?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMDETECTIONLOCK(TIMEVALUE value) {
        this.nmdetectionlock = value;
    }

    /**
     * ??nmmainfunctionperiod?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMMAINFUNCTIONPERIOD() {
        return nmmainfunctionperiod;
    }

    /**
     * ??nmmainfunctionperiod?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMMAINFUNCTIONPERIOD(TIMEVALUE value) {
        this.nmmainfunctionperiod = value;
    }

    /**
     * ??nmmessagetimeouttime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMMESSAGETIMEOUTTIME() {
        return nmmessagetimeouttime;
    }

    /**
     * ??nmmessagetimeouttime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMMESSAGETIMEOUTTIME(TIMEVALUE value) {
        this.nmmessagetimeouttime = value;
    }

    /**
     * ??nmreadysleepcount?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMREADYSLEEPCOUNT() {
        return nmreadysleepcount;
    }

    /**
     * ??nmreadysleepcount?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMREADYSLEEPCOUNT(INTEGER value) {
        this.nmreadysleepcount = value;
    }

    /**
     * ??nmremotesleepindicationtime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMREMOTESLEEPINDICATIONTIME() {
        return nmremotesleepindicationtime;
    }

    /**
     * ??nmremotesleepindicationtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMREMOTESLEEPINDICATIONTIME(TIMEVALUE value) {
        this.nmremotesleepindicationtime = value;
    }

    /**
     * ??nmrepeatmessagebitactive?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMREPEATMESSAGEBITACTIVE() {
        return nmrepeatmessagebitactive;
    }

    /**
     * ??nmrepeatmessagebitactive?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMREPEATMESSAGEBITACTIVE(BOOLEAN value) {
        this.nmrepeatmessagebitactive = value;
    }

    /**
     * ??nmrepeatmessagetime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMREPEATMESSAGETIME() {
        return nmrepeatmessagetime;
    }

    /**
     * ??nmrepeatmessagetime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMREPEATMESSAGETIME(TIMEVALUE value) {
        this.nmrepeatmessagetime = value;
    }

    /**
     * ??nmrepetitioncycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMREPETITIONCYCLE() {
        return nmrepetitioncycle;
    }

    /**
     * ??nmrepetitioncycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMREPETITIONCYCLE(INTEGER value) {
        this.nmrepetitioncycle = value;
    }

    /**
     * ??nmvotingcycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMVOTINGCYCLE() {
        return nmvotingcycle;
    }

    /**
     * ??nmvotingcycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMVOTINGCYCLE(INTEGER value) {
        this.nmvotingcycle = value;
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