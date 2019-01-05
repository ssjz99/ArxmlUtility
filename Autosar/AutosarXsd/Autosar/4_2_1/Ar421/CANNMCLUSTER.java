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
 * Can specific NmCluster attributes
 * 
 * <p>CAN-NM-CLUSTER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-NM-CLUSTER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-CLUSTER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-NM-CLUSTER"/>
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
@XmlType(name = "CAN-NM-CLUSTER", propOrder = {
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
    "nmbusloadreductionactive",
    "nmcarwakeupbitposition",
    "nmcarwakeupfilterenabled",
    "nmcarwakeupfilternodeid",
    "nmcarwakeuprxenabled",
    "nmcbvposition",
    "nmchannelactive",
    "nmimmediatenmcycletime",
    "nmimmediatenmtransmissions",
    "nmmessagetimeouttime",
    "nmmsgcycletime",
    "nmnetworktimeout",
    "nmnidposition",
    "nmremotesleepindicationtime",
    "nmrepeatmessagetime",
    "nmuserdatalength",
    "nmwaitbussleeptime"
})
public class CANNMCLUSTER {

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
    protected CANNMCLUSTER.COMMUNICATIONCLUSTERREF communicationclusterref;
    @XmlElement(name = "NM-CHANNEL-ID")
    protected POSITIVEINTEGER nmchannelid;
    @XmlElement(name = "NM-CHANNEL-SLEEP-MASTER")
    protected BOOLEAN nmchannelsleepmaster;
    @XmlElement(name = "NM-NODES")
    protected CANNMCLUSTER.NMNODES nmnodes;
    @XmlElement(name = "NM-SYNCHRONIZING-NETWORK")
    protected BOOLEAN nmsynchronizingnetwork;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "NM-BUSLOAD-REDUCTION-ACTIVE")
    protected BOOLEAN nmbusloadreductionactive;
    @XmlElement(name = "NM-CAR-WAKE-UP-BIT-POSITION")
    protected POSITIVEINTEGER nmcarwakeupbitposition;
    @XmlElement(name = "NM-CAR-WAKE-UP-FILTER-ENABLED")
    protected BOOLEAN nmcarwakeupfilterenabled;
    @XmlElement(name = "NM-CAR-WAKE-UP-FILTER-NODE-ID")
    protected POSITIVEINTEGER nmcarwakeupfilternodeid;
    @XmlElement(name = "NM-CAR-WAKE-UP-RX-ENABLED")
    protected BOOLEAN nmcarwakeuprxenabled;
    @XmlElement(name = "NM-CBV-POSITION")
    protected INTEGER nmcbvposition;
    @XmlElement(name = "NM-CHANNEL-ACTIVE")
    protected BOOLEAN nmchannelactive;
    @XmlElement(name = "NM-IMMEDIATE-NM-CYCLE-TIME")
    protected TIMEVALUE nmimmediatenmcycletime;
    @XmlElement(name = "NM-IMMEDIATE-NM-TRANSMISSIONS")
    protected POSITIVEINTEGER nmimmediatenmtransmissions;
    @XmlElement(name = "NM-MESSAGE-TIMEOUT-TIME")
    protected TIMEVALUE nmmessagetimeouttime;
    @XmlElement(name = "NM-MSG-CYCLE-TIME")
    protected TIMEVALUE nmmsgcycletime;
    @XmlElement(name = "NM-NETWORK-TIMEOUT")
    protected TIMEVALUE nmnetworktimeout;
    @XmlElement(name = "NM-NID-POSITION")
    protected INTEGER nmnidposition;
    @XmlElement(name = "NM-REMOTE-SLEEP-INDICATION-TIME")
    protected TIMEVALUE nmremotesleepindicationtime;
    @XmlElement(name = "NM-REPEAT-MESSAGE-TIME")
    protected TIMEVALUE nmrepeatmessagetime;
    @XmlElement(name = "NM-USER-DATA-LENGTH")
    protected INTEGER nmuserdatalength;
    @XmlElement(name = "NM-WAIT-BUS-SLEEP-TIME")
    protected TIMEVALUE nmwaitbussleeptime;
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
     *     {@link CANNMCLUSTER.COMMUNICATIONCLUSTERREF }
     *     
     */
    public CANNMCLUSTER.COMMUNICATIONCLUSTERREF getCOMMUNICATIONCLUSTERREF() {
        return communicationclusterref;
    }

    /**
     * ??communicationclusterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANNMCLUSTER.COMMUNICATIONCLUSTERREF }
     *     
     */
    public void setCOMMUNICATIONCLUSTERREF(CANNMCLUSTER.COMMUNICATIONCLUSTERREF value) {
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
     *     {@link CANNMCLUSTER.NMNODES }
     *     
     */
    public CANNMCLUSTER.NMNODES getNMNODES() {
        return nmnodes;
    }

    /**
     * ??nmnodes?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANNMCLUSTER.NMNODES }
     *     
     */
    public void setNMNODES(CANNMCLUSTER.NMNODES value) {
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
     * ??nmbusloadreductionactive?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMBUSLOADREDUCTIONACTIVE() {
        return nmbusloadreductionactive;
    }

    /**
     * ??nmbusloadreductionactive?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMBUSLOADREDUCTIONACTIVE(BOOLEAN value) {
        this.nmbusloadreductionactive = value;
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
     * ??nmcbvposition?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMCBVPOSITION() {
        return nmcbvposition;
    }

    /**
     * ??nmcbvposition?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMCBVPOSITION(INTEGER value) {
        this.nmcbvposition = value;
    }

    /**
     * ??nmchannelactive?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCHANNELACTIVE() {
        return nmchannelactive;
    }

    /**
     * ??nmchannelactive?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCHANNELACTIVE(BOOLEAN value) {
        this.nmchannelactive = value;
    }

    /**
     * ??nmimmediatenmcycletime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMIMMEDIATENMCYCLETIME() {
        return nmimmediatenmcycletime;
    }

    /**
     * ??nmimmediatenmcycletime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMIMMEDIATENMCYCLETIME(TIMEVALUE value) {
        this.nmimmediatenmcycletime = value;
    }

    /**
     * ??nmimmediatenmtransmissions?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNMIMMEDIATENMTRANSMISSIONS() {
        return nmimmediatenmtransmissions;
    }

    /**
     * ??nmimmediatenmtransmissions?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNMIMMEDIATENMTRANSMISSIONS(POSITIVEINTEGER value) {
        this.nmimmediatenmtransmissions = value;
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
     * ??nmmsgcycletime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMMSGCYCLETIME() {
        return nmmsgcycletime;
    }

    /**
     * ??nmmsgcycletime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMMSGCYCLETIME(TIMEVALUE value) {
        this.nmmsgcycletime = value;
    }

    /**
     * ??nmnetworktimeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMNETWORKTIMEOUT() {
        return nmnetworktimeout;
    }

    /**
     * ??nmnetworktimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMNETWORKTIMEOUT(TIMEVALUE value) {
        this.nmnetworktimeout = value;
    }

    /**
     * ??nmnidposition?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMNIDPOSITION() {
        return nmnidposition;
    }

    /**
     * ??nmnidposition?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMNIDPOSITION(INTEGER value) {
        this.nmnidposition = value;
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
     * ??nmuserdatalength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMUSERDATALENGTH() {
        return nmuserdatalength;
    }

    /**
     * ??nmuserdatalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMUSERDATALENGTH(INTEGER value) {
        this.nmuserdatalength = value;
    }

    /**
     * ??nmwaitbussleeptime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMWAITBUSSLEEPTIME() {
        return nmwaitbussleeptime;
    }

    /**
     * ??nmwaitbussleeptime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMWAITBUSSLEEPTIME(TIMEVALUE value) {
        this.nmwaitbussleeptime = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COMMUNICATIONCLUSTERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMMUNICATIONCLUSTERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
         *     
         */
        public COMMUNICATIONCLUSTERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
         *     
         */
        public void setDEST(COMMUNICATIONCLUSTERSUBTYPESENUM value) {
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
     *         &lt;element name="CAN-NM-NODE" type="{http://autosar.org/schema/r4.0}CAN-NM-NODE"/>
     *         &lt;element name="FLEXRAY-NM-NODE" type="{http://autosar.org/schema/r4.0}FLEXRAY-NM-NODE"/>
     *         &lt;element name="J-1939-NM-NODE" type="{http://autosar.org/schema/r4.0}J-1939-NM-NODE"/>
     *         &lt;element name="UDP-NM-NODE" type="{http://autosar.org/schema/r4.0}UDP-NM-NODE"/>
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
        "cannmnodeOrFLEXRAYNMNODEOrJ1939NMNODE"
    })
    public static class NMNODES {

        @XmlElements({
            @XmlElement(name = "CAN-NM-NODE", type = CANNMNODE.class),
            @XmlElement(name = "FLEXRAY-NM-NODE", type = FLEXRAYNMNODE.class),
            @XmlElement(name = "J-1939-NM-NODE", type = J1939NMNODE.class),
            @XmlElement(name = "UDP-NM-NODE", type = UDPNMNODE.class)
        })
        protected List<Object> cannmnodeOrFLEXRAYNMNODEOrJ1939NMNODE;

        /**
         * Gets the value of the cannmnodeOrFLEXRAYNMNODEOrJ1939NMNODE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cannmnodeOrFLEXRAYNMNODEOrJ1939NMNODE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANNMNODEOrFLEXRAYNMNODEOrJ1939NMNODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANNMNODE }
         * {@link FLEXRAYNMNODE }
         * {@link J1939NMNODE }
         * {@link UDPNMNODE }
         * 
         * 
         */
        public List<Object> getCANNMNODEOrFLEXRAYNMNODEOrJ1939NMNODE() {
            if (cannmnodeOrFLEXRAYNMNODEOrJ1939NMNODE == null) {
                cannmnodeOrFLEXRAYNMNODEOrJ1939NMNODE = new ArrayList<Object>();
            }
            return this.cannmnodeOrFLEXRAYNMNODEOrJ1939NMNODE;
        }

    }

}
