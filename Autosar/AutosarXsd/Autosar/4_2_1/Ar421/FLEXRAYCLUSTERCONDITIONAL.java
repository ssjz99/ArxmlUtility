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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>FLEXRAY-CLUSTER-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-CLUSTER-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-CLUSTER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-CLUSTER-CONDITIONAL"/>
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
@XmlType(name = "FLEXRAY-CLUSTER-CONDITIONAL", propOrder = {
    "baudrate",
    "physicalchannels",
    "protocolname",
    "protocolversion",
    "speed",
    "actionpointoffset",
    "bit",
    "casrxlowmax",
    "coldstartattempts",
    "cycle",
    "cyclecountmax",
    "detectniterror",
    "dynamicslotidlephase",
    "ignoreaftertx",
    "listennoise",
    "macropercycle",
    "macrotickduration",
    "maxwithoutclockcorrectionfatal",
    "maxwithoutclockcorrectionpassive",
    "minislotactionpointoffset",
    "minislotduration",
    "networkidletime",
    "networkmanagementvectorlength",
    "numberofminislots",
    "numberofstaticslots",
    "offsetcorrectionstart",
    "payloadlengthstatic",
    "safetymargin",
    "sampleclockperiod",
    "staticslotduration",
    "symbolwindow",
    "symbolwindowactionpointoffset",
    "syncframeidcountmax",
    "tranceiverstandbydelay",
    "transmissionstartsequenceduration",
    "wakeuprxidle",
    "wakeuprxlow",
    "wakeuprxwindow",
    "wakeuptxactive",
    "wakeuptxidle",
    "variationpoint"
})
public class FLEXRAYCLUSTERCONDITIONAL {

    @XmlElement(name = "BAUDRATE")
    protected POSITIVEUNLIMITEDINTEGER baudrate;
    @XmlElement(name = "PHYSICAL-CHANNELS")
    protected Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS physicalchannels;
    @XmlElement(name = "PROTOCOL-NAME")
    protected STRING protocolname;
    @XmlElement(name = "PROTOCOL-VERSION")
    protected STRING protocolversion;
    @XmlElement(name = "SPEED")
    protected INTEGER speed;
    @XmlElement(name = "ACTION-POINT-OFFSET")
    protected INTEGER actionpointoffset;
    @XmlElement(name = "BIT")
    protected TIMEVALUE bit;
    @XmlElement(name = "CAS-RX-LOW-MAX")
    protected INTEGER casrxlowmax;
    @XmlElement(name = "COLD-START-ATTEMPTS")
    protected INTEGER coldstartattempts;
    @XmlElement(name = "CYCLE")
    protected TIMEVALUE cycle;
    @XmlElement(name = "CYCLE-COUNT-MAX")
    protected INTEGER cyclecountmax;
    @XmlElement(name = "DETECT-NIT-ERROR")
    protected BOOLEAN detectniterror;
    @XmlElement(name = "DYNAMIC-SLOT-IDLE-PHASE")
    protected INTEGER dynamicslotidlephase;
    @XmlElement(name = "IGNORE-AFTER-TX")
    protected INTEGER ignoreaftertx;
    @XmlElement(name = "LISTEN-NOISE")
    protected INTEGER listennoise;
    @XmlElement(name = "MACRO-PER-CYCLE")
    protected INTEGER macropercycle;
    @XmlElement(name = "MACROTICK-DURATION")
    protected TIMEVALUE macrotickduration;
    @XmlElement(name = "MAX-WITHOUT-CLOCK-CORRECTION-FATAL")
    protected INTEGER maxwithoutclockcorrectionfatal;
    @XmlElement(name = "MAX-WITHOUT-CLOCK-CORRECTION-PASSIVE")
    protected INTEGER maxwithoutclockcorrectionpassive;
    @XmlElement(name = "MINISLOT-ACTION-POINT-OFFSET")
    protected INTEGER minislotactionpointoffset;
    @XmlElement(name = "MINISLOT-DURATION")
    protected INTEGER minislotduration;
    @XmlElement(name = "NETWORK-IDLE-TIME")
    protected INTEGER networkidletime;
    @XmlElement(name = "NETWORK-MANAGEMENT-VECTOR-LENGTH")
    protected INTEGER networkmanagementvectorlength;
    @XmlElement(name = "NUMBER-OF-MINISLOTS")
    protected INTEGER numberofminislots;
    @XmlElement(name = "NUMBER-OF-STATIC-SLOTS")
    protected INTEGER numberofstaticslots;
    @XmlElement(name = "OFFSET-CORRECTION-START")
    protected INTEGER offsetcorrectionstart;
    @XmlElement(name = "PAYLOAD-LENGTH-STATIC")
    protected INTEGER payloadlengthstatic;
    @XmlElement(name = "SAFETY-MARGIN")
    protected INTEGER safetymargin;
    @XmlElement(name = "SAMPLE-CLOCK-PERIOD")
    protected TIMEVALUE sampleclockperiod;
    @XmlElement(name = "STATIC-SLOT-DURATION")
    protected INTEGER staticslotduration;
    @XmlElement(name = "SYMBOL-WINDOW")
    protected INTEGER symbolwindow;
    @XmlElement(name = "SYMBOL-WINDOW-ACTION-POINT-OFFSET")
    protected INTEGER symbolwindowactionpointoffset;
    @XmlElement(name = "SYNC-FRAME-ID-COUNT-MAX")
    protected INTEGER syncframeidcountmax;
    @XmlElement(name = "TRANCEIVER-STANDBY-DELAY")
    protected FLOAT tranceiverstandbydelay;
    @XmlElement(name = "TRANSMISSION-START-SEQUENCE-DURATION")
    protected INTEGER transmissionstartsequenceduration;
    @XmlElement(name = "WAKEUP-RX-IDLE")
    protected INTEGER wakeuprxidle;
    @XmlElement(name = "WAKEUP-RX-LOW")
    protected INTEGER wakeuprxlow;
    @XmlElement(name = "WAKEUP-RX-WINDOW")
    protected INTEGER wakeuprxwindow;
    @XmlElement(name = "WAKEUP-TX-ACTIVE")
    protected INTEGER wakeuptxactive;
    @XmlElement(name = "WAKEUP-TX-IDLE")
    protected INTEGER wakeuptxidle;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??baudrate?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEUNLIMITEDINTEGER }
     *     
     */
    public POSITIVEUNLIMITEDINTEGER getBAUDRATE() {
        return baudrate;
    }

    /**
     * ??baudrate?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEUNLIMITEDINTEGER }
     *     
     */
    public void setBAUDRATE(POSITIVEUNLIMITEDINTEGER value) {
        this.baudrate = value;
    }

    /**
     * ??physicalchannels?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS }
     *     
     */
    public Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS getPHYSICALCHANNELS() {
        return physicalchannels;
    }

    /**
     * ??physicalchannels?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS }
     *     
     */
    public void setPHYSICALCHANNELS(Ar421.J1939CLUSTERCONDITIONAL.PHYSICALCHANNELS value) {
        this.physicalchannels = value;
    }

    /**
     * ??protocolname?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROTOCOLNAME() {
        return protocolname;
    }

    /**
     * ??protocolname?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROTOCOLNAME(STRING value) {
        this.protocolname = value;
    }

    /**
     * ??protocolversion?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROTOCOLVERSION() {
        return protocolversion;
    }

    /**
     * ??protocolversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROTOCOLVERSION(STRING value) {
        this.protocolversion = value;
    }

    /**
     * ??speed?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSPEED() {
        return speed;
    }

    /**
     * ??speed?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSPEED(INTEGER value) {
        this.speed = value;
    }

    /**
     * ??actionpointoffset?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getACTIONPOINTOFFSET() {
        return actionpointoffset;
    }

    /**
     * ??actionpointoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setACTIONPOINTOFFSET(INTEGER value) {
        this.actionpointoffset = value;
    }

    /**
     * ??bit?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getBIT() {
        return bit;
    }

    /**
     * ??bit?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setBIT(TIMEVALUE value) {
        this.bit = value;
    }

    /**
     * ??casrxlowmax?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCASRXLOWMAX() {
        return casrxlowmax;
    }

    /**
     * ??casrxlowmax?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCASRXLOWMAX(INTEGER value) {
        this.casrxlowmax = value;
    }

    /**
     * ??coldstartattempts?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCOLDSTARTATTEMPTS() {
        return coldstartattempts;
    }

    /**
     * ??coldstartattempts?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCOLDSTARTATTEMPTS(INTEGER value) {
        this.coldstartattempts = value;
    }

    /**
     * ??cycle?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getCYCLE() {
        return cycle;
    }

    /**
     * ??cycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setCYCLE(TIMEVALUE value) {
        this.cycle = value;
    }

    /**
     * ??cyclecountmax?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCYCLECOUNTMAX() {
        return cyclecountmax;
    }

    /**
     * ??cyclecountmax?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCYCLECOUNTMAX(INTEGER value) {
        this.cyclecountmax = value;
    }

    /**
     * ??detectniterror?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getDETECTNITERROR() {
        return detectniterror;
    }

    /**
     * ??detectniterror?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setDETECTNITERROR(BOOLEAN value) {
        this.detectniterror = value;
    }

    /**
     * ??dynamicslotidlephase?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getDYNAMICSLOTIDLEPHASE() {
        return dynamicslotidlephase;
    }

    /**
     * ??dynamicslotidlephase?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setDYNAMICSLOTIDLEPHASE(INTEGER value) {
        this.dynamicslotidlephase = value;
    }

    /**
     * ??ignoreaftertx?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getIGNOREAFTERTX() {
        return ignoreaftertx;
    }

    /**
     * ??ignoreaftertx?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setIGNOREAFTERTX(INTEGER value) {
        this.ignoreaftertx = value;
    }

    /**
     * ??listennoise?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getLISTENNOISE() {
        return listennoise;
    }

    /**
     * ??listennoise?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setLISTENNOISE(INTEGER value) {
        this.listennoise = value;
    }

    /**
     * ??macropercycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMACROPERCYCLE() {
        return macropercycle;
    }

    /**
     * ??macropercycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMACROPERCYCLE(INTEGER value) {
        this.macropercycle = value;
    }

    /**
     * ??macrotickduration?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMACROTICKDURATION() {
        return macrotickduration;
    }

    /**
     * ??macrotickduration?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMACROTICKDURATION(TIMEVALUE value) {
        this.macrotickduration = value;
    }

    /**
     * ??maxwithoutclockcorrectionfatal?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXWITHOUTCLOCKCORRECTIONFATAL() {
        return maxwithoutclockcorrectionfatal;
    }

    /**
     * ??maxwithoutclockcorrectionfatal?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXWITHOUTCLOCKCORRECTIONFATAL(INTEGER value) {
        this.maxwithoutclockcorrectionfatal = value;
    }

    /**
     * ??maxwithoutclockcorrectionpassive?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXWITHOUTCLOCKCORRECTIONPASSIVE() {
        return maxwithoutclockcorrectionpassive;
    }

    /**
     * ??maxwithoutclockcorrectionpassive?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXWITHOUTCLOCKCORRECTIONPASSIVE(INTEGER value) {
        this.maxwithoutclockcorrectionpassive = value;
    }

    /**
     * ??minislotactionpointoffset?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMINISLOTACTIONPOINTOFFSET() {
        return minislotactionpointoffset;
    }

    /**
     * ??minislotactionpointoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMINISLOTACTIONPOINTOFFSET(INTEGER value) {
        this.minislotactionpointoffset = value;
    }

    /**
     * ??minislotduration?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMINISLOTDURATION() {
        return minislotduration;
    }

    /**
     * ??minislotduration?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMINISLOTDURATION(INTEGER value) {
        this.minislotduration = value;
    }

    /**
     * ??networkidletime?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNETWORKIDLETIME() {
        return networkidletime;
    }

    /**
     * ??networkidletime?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNETWORKIDLETIME(INTEGER value) {
        this.networkidletime = value;
    }

    /**
     * ??networkmanagementvectorlength?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNETWORKMANAGEMENTVECTORLENGTH() {
        return networkmanagementvectorlength;
    }

    /**
     * ??networkmanagementvectorlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNETWORKMANAGEMENTVECTORLENGTH(INTEGER value) {
        this.networkmanagementvectorlength = value;
    }

    /**
     * ??numberofminislots?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNUMBEROFMINISLOTS() {
        return numberofminislots;
    }

    /**
     * ??numberofminislots?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNUMBEROFMINISLOTS(INTEGER value) {
        this.numberofminislots = value;
    }

    /**
     * ??numberofstaticslots?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNUMBEROFSTATICSLOTS() {
        return numberofstaticslots;
    }

    /**
     * ??numberofstaticslots?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNUMBEROFSTATICSLOTS(INTEGER value) {
        this.numberofstaticslots = value;
    }

    /**
     * ??offsetcorrectionstart?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getOFFSETCORRECTIONSTART() {
        return offsetcorrectionstart;
    }

    /**
     * ??offsetcorrectionstart?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setOFFSETCORRECTIONSTART(INTEGER value) {
        this.offsetcorrectionstart = value;
    }

    /**
     * ??payloadlengthstatic?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPAYLOADLENGTHSTATIC() {
        return payloadlengthstatic;
    }

    /**
     * ??payloadlengthstatic?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPAYLOADLENGTHSTATIC(INTEGER value) {
        this.payloadlengthstatic = value;
    }

    /**
     * ??safetymargin?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSAFETYMARGIN() {
        return safetymargin;
    }

    /**
     * ??safetymargin?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSAFETYMARGIN(INTEGER value) {
        this.safetymargin = value;
    }

    /**
     * ??sampleclockperiod?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getSAMPLECLOCKPERIOD() {
        return sampleclockperiod;
    }

    /**
     * ??sampleclockperiod?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setSAMPLECLOCKPERIOD(TIMEVALUE value) {
        this.sampleclockperiod = value;
    }

    /**
     * ??staticslotduration?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSTATICSLOTDURATION() {
        return staticslotduration;
    }

    /**
     * ??staticslotduration?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSTATICSLOTDURATION(INTEGER value) {
        this.staticslotduration = value;
    }

    /**
     * ??symbolwindow?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSYMBOLWINDOW() {
        return symbolwindow;
    }

    /**
     * ??symbolwindow?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSYMBOLWINDOW(INTEGER value) {
        this.symbolwindow = value;
    }

    /**
     * ??symbolwindowactionpointoffset?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSYMBOLWINDOWACTIONPOINTOFFSET() {
        return symbolwindowactionpointoffset;
    }

    /**
     * ??symbolwindowactionpointoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSYMBOLWINDOWACTIONPOINTOFFSET(INTEGER value) {
        this.symbolwindowactionpointoffset = value;
    }

    /**
     * ??syncframeidcountmax?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSYNCFRAMEIDCOUNTMAX() {
        return syncframeidcountmax;
    }

    /**
     * ??syncframeidcountmax?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSYNCFRAMEIDCOUNTMAX(INTEGER value) {
        this.syncframeidcountmax = value;
    }

    /**
     * ??tranceiverstandbydelay?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getTRANCEIVERSTANDBYDELAY() {
        return tranceiverstandbydelay;
    }

    /**
     * ??tranceiverstandbydelay?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setTRANCEIVERSTANDBYDELAY(FLOAT value) {
        this.tranceiverstandbydelay = value;
    }

    /**
     * ??transmissionstartsequenceduration?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getTRANSMISSIONSTARTSEQUENCEDURATION() {
        return transmissionstartsequenceduration;
    }

    /**
     * ??transmissionstartsequenceduration?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setTRANSMISSIONSTARTSEQUENCEDURATION(INTEGER value) {
        this.transmissionstartsequenceduration = value;
    }

    /**
     * ??wakeuprxidle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getWAKEUPRXIDLE() {
        return wakeuprxidle;
    }

    /**
     * ??wakeuprxidle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setWAKEUPRXIDLE(INTEGER value) {
        this.wakeuprxidle = value;
    }

    /**
     * ??wakeuprxlow?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getWAKEUPRXLOW() {
        return wakeuprxlow;
    }

    /**
     * ??wakeuprxlow?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setWAKEUPRXLOW(INTEGER value) {
        this.wakeuprxlow = value;
    }

    /**
     * ??wakeuprxwindow?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getWAKEUPRXWINDOW() {
        return wakeuprxwindow;
    }

    /**
     * ??wakeuprxwindow?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setWAKEUPRXWINDOW(INTEGER value) {
        this.wakeuprxwindow = value;
    }

    /**
     * ??wakeuptxactive?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getWAKEUPTXACTIVE() {
        return wakeuptxactive;
    }

    /**
     * ??wakeuptxactive?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setWAKEUPTXACTIVE(INTEGER value) {
        this.wakeuptxactive = value;
    }

    /**
     * ??wakeuptxidle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getWAKEUPTXIDLE() {
        return wakeuptxidle;
    }

    /**
     * ??wakeuptxidle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setWAKEUPTXIDLE(INTEGER value) {
        this.wakeuptxidle = value;
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

}
