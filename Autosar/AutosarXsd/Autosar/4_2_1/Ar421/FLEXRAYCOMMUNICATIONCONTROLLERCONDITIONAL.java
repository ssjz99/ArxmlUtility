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
import javax.xml.bind.annotation.XmlType;


/**
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>FLEXRAY-COMMUNICATION-CONTROLLER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-COMMUNICATION-CONTROLLER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-COMMUNICATION-CONTROLLER-CONDITIONAL"/>
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
@XmlType(name = "FLEXRAY-COMMUNICATION-CONTROLLER-CONDITIONAL", propOrder = {
    "wakeupbycontrollersupported",
    "acceptedstartuprange",
    "allowhaltduetoclock",
    "allowpassivetoactive",
    "clusterdriftdamping",
    "decodingcorrection",
    "delaycompensationa",
    "delaycompensationb",
    "externoffsetcorrection",
    "externratecorrection",
    "externalsync",
    "fallbackinternal",
    "flexrayfifos",
    "keyslotid",
    "keyslotonlyenabled",
    "keyslotusedforstartup",
    "keyslotusedforsync",
    "latesttx",
    "listentimeout",
    "macroinitialoffseta",
    "macroinitialoffsetb",
    "maximumdynamicpayloadlength",
    "microinitialoffseta",
    "microinitialoffsetb",
    "micropercycle",
    "microtickduration",
    "nmvectorearlyupdate",
    "offsetcorrectionout",
    "ratecorrectionout",
    "samplespermicrotick",
    "secondkeyslotid",
    "twokeyslotmode",
    "wakeuppattern",
    "variationpoint"
})
public class FLEXRAYCOMMUNICATIONCONTROLLERCONDITIONAL {

    @XmlElement(name = "WAKE-UP-BY-CONTROLLER-SUPPORTED")
    protected BOOLEAN wakeupbycontrollersupported;
    @XmlElement(name = "ACCEPTED-STARTUP-RANGE")
    protected INTEGER acceptedstartuprange;
    @XmlElement(name = "ALLOW-HALT-DUE-TO-CLOCK")
    protected BOOLEAN allowhaltduetoclock;
    @XmlElement(name = "ALLOW-PASSIVE-TO-ACTIVE")
    protected INTEGER allowpassivetoactive;
    @XmlElement(name = "CLUSTER-DRIFT-DAMPING")
    protected INTEGER clusterdriftdamping;
    @XmlElement(name = "DECODING-CORRECTION")
    protected INTEGER decodingcorrection;
    @XmlElement(name = "DELAY-COMPENSATION-A")
    protected INTEGER delaycompensationa;
    @XmlElement(name = "DELAY-COMPENSATION-B")
    protected INTEGER delaycompensationb;
    @XmlElement(name = "EXTERN-OFFSET-CORRECTION")
    protected INTEGER externoffsetcorrection;
    @XmlElement(name = "EXTERN-RATE-CORRECTION")
    protected INTEGER externratecorrection;
    @XmlElement(name = "EXTERNAL-SYNC")
    protected BOOLEAN externalsync;
    @XmlElement(name = "FALL-BACK-INTERNAL")
    protected BOOLEAN fallbackinternal;
    @XmlElement(name = "FLEXRAY-FIFOS")
    protected FLEXRAYCOMMUNICATIONCONTROLLERCONDITIONAL.FLEXRAYFIFOS flexrayfifos;
    @XmlElement(name = "KEY-SLOT-ID")
    protected POSITIVEINTEGER keyslotid;
    @XmlElement(name = "KEY-SLOT-ONLY-ENABLED")
    protected BOOLEAN keyslotonlyenabled;
    @XmlElement(name = "KEY-SLOT-USED-FOR-START-UP")
    protected BOOLEAN keyslotusedforstartup;
    @XmlElement(name = "KEY-SLOT-USED-FOR-SYNC")
    protected BOOLEAN keyslotusedforsync;
    @XmlElement(name = "LATEST-TX")
    protected INTEGER latesttx;
    @XmlElement(name = "LISTEN-TIMEOUT")
    protected INTEGER listentimeout;
    @XmlElement(name = "MACRO-INITIAL-OFFSET-A")
    protected INTEGER macroinitialoffseta;
    @XmlElement(name = "MACRO-INITIAL-OFFSET-B")
    protected INTEGER macroinitialoffsetb;
    @XmlElement(name = "MAXIMUM-DYNAMIC-PAYLOAD-LENGTH")
    protected INTEGER maximumdynamicpayloadlength;
    @XmlElement(name = "MICRO-INITIAL-OFFSET-A")
    protected INTEGER microinitialoffseta;
    @XmlElement(name = "MICRO-INITIAL-OFFSET-B")
    protected INTEGER microinitialoffsetb;
    @XmlElement(name = "MICRO-PER-CYCLE")
    protected INTEGER micropercycle;
    @XmlElement(name = "MICROTICK-DURATION")
    protected TIMEVALUE microtickduration;
    @XmlElement(name = "NM-VECTOR-EARLY-UPDATE")
    protected BOOLEAN nmvectorearlyupdate;
    @XmlElement(name = "OFFSET-CORRECTION-OUT")
    protected INTEGER offsetcorrectionout;
    @XmlElement(name = "RATE-CORRECTION-OUT")
    protected INTEGER ratecorrectionout;
    @XmlElement(name = "SAMPLES-PER-MICROTICK")
    protected INTEGER samplespermicrotick;
    @XmlElement(name = "SECOND-KEY-SLOT-ID")
    protected POSITIVEINTEGER secondkeyslotid;
    @XmlElement(name = "TWO-KEY-SLOT-MODE")
    protected BOOLEAN twokeyslotmode;
    @XmlElement(name = "WAKE-UP-PATTERN")
    protected INTEGER wakeuppattern;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWAKEUPBYCONTROLLERSUPPORTED() {
        return wakeupbycontrollersupported;
    }

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWAKEUPBYCONTROLLERSUPPORTED(BOOLEAN value) {
        this.wakeupbycontrollersupported = value;
    }

    /**
     * ??acceptedstartuprange?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getACCEPTEDSTARTUPRANGE() {
        return acceptedstartuprange;
    }

    /**
     * ??acceptedstartuprange?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setACCEPTEDSTARTUPRANGE(INTEGER value) {
        this.acceptedstartuprange = value;
    }

    /**
     * ??allowhaltduetoclock?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getALLOWHALTDUETOCLOCK() {
        return allowhaltduetoclock;
    }

    /**
     * ??allowhaltduetoclock?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setALLOWHALTDUETOCLOCK(BOOLEAN value) {
        this.allowhaltduetoclock = value;
    }

    /**
     * ??allowpassivetoactive?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getALLOWPASSIVETOACTIVE() {
        return allowpassivetoactive;
    }

    /**
     * ??allowpassivetoactive?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setALLOWPASSIVETOACTIVE(INTEGER value) {
        this.allowpassivetoactive = value;
    }

    /**
     * ??clusterdriftdamping?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCLUSTERDRIFTDAMPING() {
        return clusterdriftdamping;
    }

    /**
     * ??clusterdriftdamping?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCLUSTERDRIFTDAMPING(INTEGER value) {
        this.clusterdriftdamping = value;
    }

    /**
     * ??decodingcorrection?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getDECODINGCORRECTION() {
        return decodingcorrection;
    }

    /**
     * ??decodingcorrection?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setDECODINGCORRECTION(INTEGER value) {
        this.decodingcorrection = value;
    }

    /**
     * ??delaycompensationa?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getDELAYCOMPENSATIONA() {
        return delaycompensationa;
    }

    /**
     * ??delaycompensationa?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setDELAYCOMPENSATIONA(INTEGER value) {
        this.delaycompensationa = value;
    }

    /**
     * ??delaycompensationb?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getDELAYCOMPENSATIONB() {
        return delaycompensationb;
    }

    /**
     * ??delaycompensationb?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setDELAYCOMPENSATIONB(INTEGER value) {
        this.delaycompensationb = value;
    }

    /**
     * ??externoffsetcorrection?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getEXTERNOFFSETCORRECTION() {
        return externoffsetcorrection;
    }

    /**
     * ??externoffsetcorrection?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setEXTERNOFFSETCORRECTION(INTEGER value) {
        this.externoffsetcorrection = value;
    }

    /**
     * ??externratecorrection?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getEXTERNRATECORRECTION() {
        return externratecorrection;
    }

    /**
     * ??externratecorrection?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setEXTERNRATECORRECTION(INTEGER value) {
        this.externratecorrection = value;
    }

    /**
     * ??externalsync?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getEXTERNALSYNC() {
        return externalsync;
    }

    /**
     * ??externalsync?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setEXTERNALSYNC(BOOLEAN value) {
        this.externalsync = value;
    }

    /**
     * ??fallbackinternal?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getFALLBACKINTERNAL() {
        return fallbackinternal;
    }

    /**
     * ??fallbackinternal?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setFALLBACKINTERNAL(BOOLEAN value) {
        this.fallbackinternal = value;
    }

    /**
     * ??flexrayfifos?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYCOMMUNICATIONCONTROLLERCONDITIONAL.FLEXRAYFIFOS }
     *     
     */
    public FLEXRAYCOMMUNICATIONCONTROLLERCONDITIONAL.FLEXRAYFIFOS getFLEXRAYFIFOS() {
        return flexrayfifos;
    }

    /**
     * ??flexrayfifos?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYCOMMUNICATIONCONTROLLERCONDITIONAL.FLEXRAYFIFOS }
     *     
     */
    public void setFLEXRAYFIFOS(FLEXRAYCOMMUNICATIONCONTROLLERCONDITIONAL.FLEXRAYFIFOS value) {
        this.flexrayfifos = value;
    }

    /**
     * ??keyslotid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getKEYSLOTID() {
        return keyslotid;
    }

    /**
     * ??keyslotid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setKEYSLOTID(POSITIVEINTEGER value) {
        this.keyslotid = value;
    }

    /**
     * ??keyslotonlyenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getKEYSLOTONLYENABLED() {
        return keyslotonlyenabled;
    }

    /**
     * ??keyslotonlyenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setKEYSLOTONLYENABLED(BOOLEAN value) {
        this.keyslotonlyenabled = value;
    }

    /**
     * ??keyslotusedforstartup?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getKEYSLOTUSEDFORSTARTUP() {
        return keyslotusedforstartup;
    }

    /**
     * ??keyslotusedforstartup?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setKEYSLOTUSEDFORSTARTUP(BOOLEAN value) {
        this.keyslotusedforstartup = value;
    }

    /**
     * ??keyslotusedforsync?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getKEYSLOTUSEDFORSYNC() {
        return keyslotusedforsync;
    }

    /**
     * ??keyslotusedforsync?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setKEYSLOTUSEDFORSYNC(BOOLEAN value) {
        this.keyslotusedforsync = value;
    }

    /**
     * ??latesttx?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getLATESTTX() {
        return latesttx;
    }

    /**
     * ??latesttx?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setLATESTTX(INTEGER value) {
        this.latesttx = value;
    }

    /**
     * ??listentimeout?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getLISTENTIMEOUT() {
        return listentimeout;
    }

    /**
     * ??listentimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setLISTENTIMEOUT(INTEGER value) {
        this.listentimeout = value;
    }

    /**
     * ??macroinitialoffseta?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMACROINITIALOFFSETA() {
        return macroinitialoffseta;
    }

    /**
     * ??macroinitialoffseta?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMACROINITIALOFFSETA(INTEGER value) {
        this.macroinitialoffseta = value;
    }

    /**
     * ??macroinitialoffsetb?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMACROINITIALOFFSETB() {
        return macroinitialoffsetb;
    }

    /**
     * ??macroinitialoffsetb?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMACROINITIALOFFSETB(INTEGER value) {
        this.macroinitialoffsetb = value;
    }

    /**
     * ??maximumdynamicpayloadlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXIMUMDYNAMICPAYLOADLENGTH() {
        return maximumdynamicpayloadlength;
    }

    /**
     * ??maximumdynamicpayloadlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXIMUMDYNAMICPAYLOADLENGTH(INTEGER value) {
        this.maximumdynamicpayloadlength = value;
    }

    /**
     * ??microinitialoffseta?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMICROINITIALOFFSETA() {
        return microinitialoffseta;
    }

    /**
     * ??microinitialoffseta?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMICROINITIALOFFSETA(INTEGER value) {
        this.microinitialoffseta = value;
    }

    /**
     * ??microinitialoffsetb?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMICROINITIALOFFSETB() {
        return microinitialoffsetb;
    }

    /**
     * ??microinitialoffsetb?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMICROINITIALOFFSETB(INTEGER value) {
        this.microinitialoffsetb = value;
    }

    /**
     * ??micropercycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMICROPERCYCLE() {
        return micropercycle;
    }

    /**
     * ??micropercycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMICROPERCYCLE(INTEGER value) {
        this.micropercycle = value;
    }

    /**
     * ??microtickduration?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMICROTICKDURATION() {
        return microtickduration;
    }

    /**
     * ??microtickduration?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMICROTICKDURATION(TIMEVALUE value) {
        this.microtickduration = value;
    }

    /**
     * ??nmvectorearlyupdate?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMVECTOREARLYUPDATE() {
        return nmvectorearlyupdate;
    }

    /**
     * ??nmvectorearlyupdate?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMVECTOREARLYUPDATE(BOOLEAN value) {
        this.nmvectorearlyupdate = value;
    }

    /**
     * ??offsetcorrectionout?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getOFFSETCORRECTIONOUT() {
        return offsetcorrectionout;
    }

    /**
     * ??offsetcorrectionout?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setOFFSETCORRECTIONOUT(INTEGER value) {
        this.offsetcorrectionout = value;
    }

    /**
     * ??ratecorrectionout?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getRATECORRECTIONOUT() {
        return ratecorrectionout;
    }

    /**
     * ??ratecorrectionout?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setRATECORRECTIONOUT(INTEGER value) {
        this.ratecorrectionout = value;
    }

    /**
     * ??samplespermicrotick?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSAMPLESPERMICROTICK() {
        return samplespermicrotick;
    }

    /**
     * ??samplespermicrotick?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSAMPLESPERMICROTICK(INTEGER value) {
        this.samplespermicrotick = value;
    }

    /**
     * ??secondkeyslotid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSECONDKEYSLOTID() {
        return secondkeyslotid;
    }

    /**
     * ??secondkeyslotid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSECONDKEYSLOTID(POSITIVEINTEGER value) {
        this.secondkeyslotid = value;
    }

    /**
     * ??twokeyslotmode?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getTWOKEYSLOTMODE() {
        return twokeyslotmode;
    }

    /**
     * ??twokeyslotmode?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setTWOKEYSLOTMODE(BOOLEAN value) {
        this.twokeyslotmode = value;
    }

    /**
     * ??wakeuppattern?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getWAKEUPPATTERN() {
        return wakeuppattern;
    }

    /**
     * ??wakeuppattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setWAKEUPPATTERN(INTEGER value) {
        this.wakeuppattern = value;
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
     *         &lt;element name="FLEXRAY-FIFO-CONFIGURATION" type="{http://autosar.org/schema/r4.0}FLEXRAY-FIFO-CONFIGURATION"/>
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
        "flexrayfifoconfiguration"
    })
    public static class FLEXRAYFIFOS {

        @XmlElement(name = "FLEXRAY-FIFO-CONFIGURATION")
        protected List<FLEXRAYFIFOCONFIGURATION> flexrayfifoconfiguration;

        /**
         * Gets the value of the flexrayfifoconfiguration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexrayfifoconfiguration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYFIFOCONFIGURATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYFIFOCONFIGURATION }
         * 
         * 
         */
        public List<FLEXRAYFIFOCONFIGURATION> getFLEXRAYFIFOCONFIGURATION() {
            if (flexrayfifoconfiguration == null) {
                flexrayfifoconfiguration = new ArrayList<FLEXRAYFIFOCONFIGURATION>();
            }
            return this.flexrayfifoconfiguration;
        }

    }

}
