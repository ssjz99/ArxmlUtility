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
 * Specifies the abstract needs on the configuration of a single NVRAM Block.
 * 
 * <p>NV-BLOCK-NEEDS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NV-BLOCK-NEEDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SERVICE-NEEDS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NV-BLOCK-NEEDS"/>
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
@XmlType(name = "NV-BLOCK-NEEDS", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "calcramblockcrc",
    "checkstaticblockid",
    "cyclicwritingperiod",
    "ndatasets",
    "nromblocks",
    "ramblockstatuscontrol",
    "readonly",
    "reliability",
    "resistanttochangedsw",
    "restoreatstart",
    "storeatshutdown",
    "storecyclic",
    "storeemergency",
    "storeimmediate",
    "useautovalidationatshutdown",
    "usecrccompmechanism",
    "writeonlyonce",
    "writeverification",
    "writingfrequency",
    "writingpriority"
})
public class NVBLOCKNEEDS {

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
    @XmlElement(name = "CALC-RAM-BLOCK-CRC")
    protected BOOLEAN calcramblockcrc;
    @XmlElement(name = "CHECK-STATIC-BLOCK-ID")
    protected BOOLEAN checkstaticblockid;
    @XmlElement(name = "CYCLIC-WRITING-PERIOD")
    protected TIMEVALUE cyclicwritingperiod;
    @XmlElement(name = "N-DATA-SETS")
    protected POSITIVEINTEGER ndatasets;
    @XmlElement(name = "N-ROM-BLOCKS")
    protected POSITIVEINTEGER nromblocks;
    @XmlElement(name = "RAM-BLOCK-STATUS-CONTROL")
    protected RAMBLOCKSTATUSCONTROLENUM ramblockstatuscontrol;
    @XmlElement(name = "READONLY")
    protected BOOLEAN readonly;
    @XmlElement(name = "RELIABILITY")
    protected NVBLOCKNEEDSRELIABILITYENUM reliability;
    @XmlElement(name = "RESISTANT-TO-CHANGED-SW")
    protected BOOLEAN resistanttochangedsw;
    @XmlElement(name = "RESTORE-AT-START")
    protected BOOLEAN restoreatstart;
    @XmlElement(name = "STORE-AT-SHUTDOWN")
    protected BOOLEAN storeatshutdown;
    @XmlElement(name = "STORE-CYCLIC")
    protected BOOLEAN storecyclic;
    @XmlElement(name = "STORE-EMERGENCY")
    protected BOOLEAN storeemergency;
    @XmlElement(name = "STORE-IMMEDIATE")
    protected BOOLEAN storeimmediate;
    @XmlElement(name = "USE-AUTO-VALIDATION-AT-SHUT-DOWN")
    protected BOOLEAN useautovalidationatshutdown;
    @XmlElement(name = "USE-CRC-COMP-MECHANISM")
    protected BOOLEAN usecrccompmechanism;
    @XmlElement(name = "WRITE-ONLY-ONCE")
    protected BOOLEAN writeonlyonce;
    @XmlElement(name = "WRITE-VERIFICATION")
    protected BOOLEAN writeverification;
    @XmlElement(name = "WRITING-FREQUENCY")
    protected POSITIVEINTEGER writingfrequency;
    @XmlElement(name = "WRITING-PRIORITY")
    protected NVBLOCKNEEDSWRITINGPRIORITYENUM writingpriority;
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
     * ??calcramblockcrc?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCALCRAMBLOCKCRC() {
        return calcramblockcrc;
    }

    /**
     * ??calcramblockcrc?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCALCRAMBLOCKCRC(BOOLEAN value) {
        this.calcramblockcrc = value;
    }

    /**
     * ??checkstaticblockid?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCHECKSTATICBLOCKID() {
        return checkstaticblockid;
    }

    /**
     * ??checkstaticblockid?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCHECKSTATICBLOCKID(BOOLEAN value) {
        this.checkstaticblockid = value;
    }

    /**
     * ??cyclicwritingperiod?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getCYCLICWRITINGPERIOD() {
        return cyclicwritingperiod;
    }

    /**
     * ??cyclicwritingperiod?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setCYCLICWRITINGPERIOD(TIMEVALUE value) {
        this.cyclicwritingperiod = value;
    }

    /**
     * ??ndatasets?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNDATASETS() {
        return ndatasets;
    }

    /**
     * ??ndatasets?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNDATASETS(POSITIVEINTEGER value) {
        this.ndatasets = value;
    }

    /**
     * ??nromblocks?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNROMBLOCKS() {
        return nromblocks;
    }

    /**
     * ??nromblocks?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNROMBLOCKS(POSITIVEINTEGER value) {
        this.nromblocks = value;
    }

    /**
     * ??ramblockstatuscontrol?????
     * 
     * @return
     *     possible object is
     *     {@link RAMBLOCKSTATUSCONTROLENUM }
     *     
     */
    public RAMBLOCKSTATUSCONTROLENUM getRAMBLOCKSTATUSCONTROL() {
        return ramblockstatuscontrol;
    }

    /**
     * ??ramblockstatuscontrol?????
     * 
     * @param value
     *     allowed object is
     *     {@link RAMBLOCKSTATUSCONTROLENUM }
     *     
     */
    public void setRAMBLOCKSTATUSCONTROL(RAMBLOCKSTATUSCONTROLENUM value) {
        this.ramblockstatuscontrol = value;
    }

    /**
     * ??readonly?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getREADONLY() {
        return readonly;
    }

    /**
     * ??readonly?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setREADONLY(BOOLEAN value) {
        this.readonly = value;
    }

    /**
     * ??reliability?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKNEEDSRELIABILITYENUM }
     *     
     */
    public NVBLOCKNEEDSRELIABILITYENUM getRELIABILITY() {
        return reliability;
    }

    /**
     * ??reliability?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKNEEDSRELIABILITYENUM }
     *     
     */
    public void setRELIABILITY(NVBLOCKNEEDSRELIABILITYENUM value) {
        this.reliability = value;
    }

    /**
     * ??resistanttochangedsw?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRESISTANTTOCHANGEDSW() {
        return resistanttochangedsw;
    }

    /**
     * ??resistanttochangedsw?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRESISTANTTOCHANGEDSW(BOOLEAN value) {
        this.resistanttochangedsw = value;
    }

    /**
     * ??restoreatstart?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRESTOREATSTART() {
        return restoreatstart;
    }

    /**
     * ??restoreatstart?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRESTOREATSTART(BOOLEAN value) {
        this.restoreatstart = value;
    }

    /**
     * ??storeatshutdown?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSTOREATSHUTDOWN() {
        return storeatshutdown;
    }

    /**
     * ??storeatshutdown?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSTOREATSHUTDOWN(BOOLEAN value) {
        this.storeatshutdown = value;
    }

    /**
     * ??storecyclic?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSTORECYCLIC() {
        return storecyclic;
    }

    /**
     * ??storecyclic?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSTORECYCLIC(BOOLEAN value) {
        this.storecyclic = value;
    }

    /**
     * ??storeemergency?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSTOREEMERGENCY() {
        return storeemergency;
    }

    /**
     * ??storeemergency?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSTOREEMERGENCY(BOOLEAN value) {
        this.storeemergency = value;
    }

    /**
     * ??storeimmediate?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSTOREIMMEDIATE() {
        return storeimmediate;
    }

    /**
     * ??storeimmediate?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSTOREIMMEDIATE(BOOLEAN value) {
        this.storeimmediate = value;
    }

    /**
     * ??useautovalidationatshutdown?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getUSEAUTOVALIDATIONATSHUTDOWN() {
        return useautovalidationatshutdown;
    }

    /**
     * ??useautovalidationatshutdown?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setUSEAUTOVALIDATIONATSHUTDOWN(BOOLEAN value) {
        this.useautovalidationatshutdown = value;
    }

    /**
     * ??usecrccompmechanism?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getUSECRCCOMPMECHANISM() {
        return usecrccompmechanism;
    }

    /**
     * ??usecrccompmechanism?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setUSECRCCOMPMECHANISM(BOOLEAN value) {
        this.usecrccompmechanism = value;
    }

    /**
     * ??writeonlyonce?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWRITEONLYONCE() {
        return writeonlyonce;
    }

    /**
     * ??writeonlyonce?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWRITEONLYONCE(BOOLEAN value) {
        this.writeonlyonce = value;
    }

    /**
     * ??writeverification?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWRITEVERIFICATION() {
        return writeverification;
    }

    /**
     * ??writeverification?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWRITEVERIFICATION(BOOLEAN value) {
        this.writeverification = value;
    }

    /**
     * ??writingfrequency?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getWRITINGFREQUENCY() {
        return writingfrequency;
    }

    /**
     * ??writingfrequency?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setWRITINGFREQUENCY(POSITIVEINTEGER value) {
        this.writingfrequency = value;
    }

    /**
     * ??writingpriority?????
     * 
     * @return
     *     possible object is
     *     {@link NVBLOCKNEEDSWRITINGPRIORITYENUM }
     *     
     */
    public NVBLOCKNEEDSWRITINGPRIORITYENUM getWRITINGPRIORITY() {
        return writingpriority;
    }

    /**
     * ??writingpriority?????
     * 
     * @param value
     *     allowed object is
     *     {@link NVBLOCKNEEDSWRITINGPRIORITYENUM }
     *     
     */
    public void setWRITINGPRIORITY(NVBLOCKNEEDSWRITINGPRIORITYENUM value) {
        this.writingpriority = value;
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

}
