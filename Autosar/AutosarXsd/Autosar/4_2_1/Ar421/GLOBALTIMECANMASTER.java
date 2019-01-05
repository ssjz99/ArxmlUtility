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
 * This represents the specialization of the GlobalTimeMaster for the CAN communication.
 * 
 * <p>GLOBAL-TIME-CAN-MASTER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="GLOBAL-TIME-CAN-MASTER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GLOBAL-TIME-MASTER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}GLOBAL-TIME-CAN-MASTER"/>
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
@XmlType(name = "GLOBAL-TIME-CAN-MASTER", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "communicationconnectorref",
    "issystemwideglobaltimemaster",
    "syncperiod",
    "crcsecured",
    "followupoffset",
    "syncconfirmationtimeout"
})
public class GLOBALTIMECANMASTER {

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
    @XmlElement(name = "COMMUNICATION-CONNECTOR-REF")
    protected Ar421.GLOBALTIMEETHMASTER.COMMUNICATIONCONNECTORREF communicationconnectorref;
    @XmlElement(name = "IS-SYSTEM-WIDE-GLOBAL-TIME-MASTER")
    protected BOOLEAN issystemwideglobaltimemaster;
    @XmlElement(name = "SYNC-PERIOD")
    protected TIMEVALUE syncperiod;
    @XmlElement(name = "CRC-SECURED")
    protected GLOBALTIMECRCSUPPORTENUM crcsecured;
    @XmlElement(name = "FOLLOW-UP-OFFSET")
    protected TIMEVALUE followupoffset;
    @XmlElement(name = "SYNC-CONFIRMATION-TIMEOUT")
    protected TIMEVALUE syncconfirmationtimeout;
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
     * ??communicationconnectorref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.GLOBALTIMEETHMASTER.COMMUNICATIONCONNECTORREF }
     *     
     */
    public Ar421.GLOBALTIMEETHMASTER.COMMUNICATIONCONNECTORREF getCOMMUNICATIONCONNECTORREF() {
        return communicationconnectorref;
    }

    /**
     * ??communicationconnectorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.GLOBALTIMEETHMASTER.COMMUNICATIONCONNECTORREF }
     *     
     */
    public void setCOMMUNICATIONCONNECTORREF(Ar421.GLOBALTIMEETHMASTER.COMMUNICATIONCONNECTORREF value) {
        this.communicationconnectorref = value;
    }

    /**
     * ??issystemwideglobaltimemaster?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getISSYSTEMWIDEGLOBALTIMEMASTER() {
        return issystemwideglobaltimemaster;
    }

    /**
     * ??issystemwideglobaltimemaster?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setISSYSTEMWIDEGLOBALTIMEMASTER(BOOLEAN value) {
        this.issystemwideglobaltimemaster = value;
    }

    /**
     * ??syncperiod?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getSYNCPERIOD() {
        return syncperiod;
    }

    /**
     * ??syncperiod?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setSYNCPERIOD(TIMEVALUE value) {
        this.syncperiod = value;
    }

    /**
     * ??crcsecured?????
     * 
     * @return
     *     possible object is
     *     {@link GLOBALTIMECRCSUPPORTENUM }
     *     
     */
    public GLOBALTIMECRCSUPPORTENUM getCRCSECURED() {
        return crcsecured;
    }

    /**
     * ??crcsecured?????
     * 
     * @param value
     *     allowed object is
     *     {@link GLOBALTIMECRCSUPPORTENUM }
     *     
     */
    public void setCRCSECURED(GLOBALTIMECRCSUPPORTENUM value) {
        this.crcsecured = value;
    }

    /**
     * ??followupoffset?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getFOLLOWUPOFFSET() {
        return followupoffset;
    }

    /**
     * ??followupoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setFOLLOWUPOFFSET(TIMEVALUE value) {
        this.followupoffset = value;
    }

    /**
     * ??syncconfirmationtimeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getSYNCCONFIRMATIONTIMEOUT() {
        return syncconfirmationtimeout;
    }

    /**
     * ??syncconfirmationtimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setSYNCCONFIRMATIONTIMEOUT(TIMEVALUE value) {
        this.syncconfirmationtimeout = value;
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
