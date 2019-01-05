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
 * EndToEndTransformationDescription holds these attributes which are profile specific and have the same value for all E2E transformers.
 * 
 * <p>END-TO-END-TRANSFORMATION-DESCRIPTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="END-TO-END-TRANSFORMATION-DESCRIPTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DESCRIBABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSFORMATION-DESCRIPTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-DESCRIPTION"/>
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
@XmlType(name = "END-TO-END-TRANSFORMATION-DESCRIPTION", propOrder = {
    "desc",
    "category",
    "introduction",
    "admindata",
    "variationpoint",
    "counteroffset",
    "crcoffset",
    "dataidmode",
    "dataidnibbleoffset",
    "maxdeltacounter",
    "maxerrorstateinit",
    "maxerrorstateinvalid",
    "maxerrorstatevalid",
    "maxnoneworrepeateddata",
    "minokstateinit",
    "minokstateinvalid",
    "minokstatevalid",
    "offset",
    "profilebehavior",
    "profilename",
    "synccounterinit",
    "upperheaderbitstoshift",
    "windowsize"
})
public class ENDTOENDTRANSFORMATIONDESCRIPTION {

    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "COUNTER-OFFSET")
    protected POSITIVEINTEGER counteroffset;
    @XmlElement(name = "CRC-OFFSET")
    protected POSITIVEINTEGER crcoffset;
    @XmlElement(name = "DATA-ID-MODE")
    protected DATAIDMODEENUM dataidmode;
    @XmlElement(name = "DATA-ID-NIBBLE-OFFSET")
    protected POSITIVEINTEGER dataidnibbleoffset;
    @XmlElement(name = "MAX-DELTA-COUNTER")
    protected POSITIVEINTEGER maxdeltacounter;
    @XmlElement(name = "MAX-ERROR-STATE-INIT")
    protected POSITIVEINTEGER maxerrorstateinit;
    @XmlElement(name = "MAX-ERROR-STATE-INVALID")
    protected POSITIVEINTEGER maxerrorstateinvalid;
    @XmlElement(name = "MAX-ERROR-STATE-VALID")
    protected POSITIVEINTEGER maxerrorstatevalid;
    @XmlElement(name = "MAX-NO-NEW-OR-REPEATED-DATA")
    protected POSITIVEINTEGER maxnoneworrepeateddata;
    @XmlElement(name = "MIN-OK-STATE-INIT")
    protected POSITIVEINTEGER minokstateinit;
    @XmlElement(name = "MIN-OK-STATE-INVALID")
    protected POSITIVEINTEGER minokstateinvalid;
    @XmlElement(name = "MIN-OK-STATE-VALID")
    protected POSITIVEINTEGER minokstatevalid;
    @XmlElement(name = "OFFSET")
    protected POSITIVEINTEGER offset;
    @XmlElement(name = "PROFILE-BEHAVIOR")
    protected ENDTOENDPROFILEBEHAVIORENUM profilebehavior;
    @XmlElement(name = "PROFILE-NAME")
    protected NMTOKENSTRING profilename;
    @XmlElement(name = "SYNC-COUNTER-INIT")
    protected POSITIVEINTEGER synccounterinit;
    @XmlElement(name = "UPPER-HEADER-BITS-TO-SHIFT")
    protected POSITIVEINTEGER upperheaderbitstoshift;
    @XmlElement(name = "WINDOW-SIZE")
    protected POSITIVEINTEGER windowsize;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??counteroffset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getCOUNTEROFFSET() {
        return counteroffset;
    }

    /**
     * ??counteroffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setCOUNTEROFFSET(POSITIVEINTEGER value) {
        this.counteroffset = value;
    }

    /**
     * ??crcoffset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getCRCOFFSET() {
        return crcoffset;
    }

    /**
     * ??crcoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setCRCOFFSET(POSITIVEINTEGER value) {
        this.crcoffset = value;
    }

    /**
     * ??dataidmode?????
     * 
     * @return
     *     possible object is
     *     {@link DATAIDMODEENUM }
     *     
     */
    public DATAIDMODEENUM getDATAIDMODE() {
        return dataidmode;
    }

    /**
     * ??dataidmode?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAIDMODEENUM }
     *     
     */
    public void setDATAIDMODE(DATAIDMODEENUM value) {
        this.dataidmode = value;
    }

    /**
     * ??dataidnibbleoffset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDATAIDNIBBLEOFFSET() {
        return dataidnibbleoffset;
    }

    /**
     * ??dataidnibbleoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDATAIDNIBBLEOFFSET(POSITIVEINTEGER value) {
        this.dataidnibbleoffset = value;
    }

    /**
     * ??maxdeltacounter?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXDELTACOUNTER() {
        return maxdeltacounter;
    }

    /**
     * ??maxdeltacounter?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXDELTACOUNTER(POSITIVEINTEGER value) {
        this.maxdeltacounter = value;
    }

    /**
     * ??maxerrorstateinit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXERRORSTATEINIT() {
        return maxerrorstateinit;
    }

    /**
     * ??maxerrorstateinit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXERRORSTATEINIT(POSITIVEINTEGER value) {
        this.maxerrorstateinit = value;
    }

    /**
     * ??maxerrorstateinvalid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXERRORSTATEINVALID() {
        return maxerrorstateinvalid;
    }

    /**
     * ??maxerrorstateinvalid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXERRORSTATEINVALID(POSITIVEINTEGER value) {
        this.maxerrorstateinvalid = value;
    }

    /**
     * ??maxerrorstatevalid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXERRORSTATEVALID() {
        return maxerrorstatevalid;
    }

    /**
     * ??maxerrorstatevalid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXERRORSTATEVALID(POSITIVEINTEGER value) {
        this.maxerrorstatevalid = value;
    }

    /**
     * ??maxnoneworrepeateddata?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXNONEWORREPEATEDDATA() {
        return maxnoneworrepeateddata;
    }

    /**
     * ??maxnoneworrepeateddata?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXNONEWORREPEATEDDATA(POSITIVEINTEGER value) {
        this.maxnoneworrepeateddata = value;
    }

    /**
     * ??minokstateinit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMINOKSTATEINIT() {
        return minokstateinit;
    }

    /**
     * ??minokstateinit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMINOKSTATEINIT(POSITIVEINTEGER value) {
        this.minokstateinit = value;
    }

    /**
     * ??minokstateinvalid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMINOKSTATEINVALID() {
        return minokstateinvalid;
    }

    /**
     * ??minokstateinvalid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMINOKSTATEINVALID(POSITIVEINTEGER value) {
        this.minokstateinvalid = value;
    }

    /**
     * ??minokstatevalid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMINOKSTATEVALID() {
        return minokstatevalid;
    }

    /**
     * ??minokstatevalid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMINOKSTATEVALID(POSITIVEINTEGER value) {
        this.minokstatevalid = value;
    }

    /**
     * ??offset?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getOFFSET() {
        return offset;
    }

    /**
     * ??offset?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setOFFSET(POSITIVEINTEGER value) {
        this.offset = value;
    }

    /**
     * ??profilebehavior?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDPROFILEBEHAVIORENUM }
     *     
     */
    public ENDTOENDPROFILEBEHAVIORENUM getPROFILEBEHAVIOR() {
        return profilebehavior;
    }

    /**
     * ??profilebehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDPROFILEBEHAVIORENUM }
     *     
     */
    public void setPROFILEBEHAVIOR(ENDTOENDPROFILEBEHAVIORENUM value) {
        this.profilebehavior = value;
    }

    /**
     * ??profilename?????
     * 
     * @return
     *     possible object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public NMTOKENSTRING getPROFILENAME() {
        return profilename;
    }

    /**
     * ??profilename?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKENSTRING }
     *     
     */
    public void setPROFILENAME(NMTOKENSTRING value) {
        this.profilename = value;
    }

    /**
     * ??synccounterinit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSYNCCOUNTERINIT() {
        return synccounterinit;
    }

    /**
     * ??synccounterinit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSYNCCOUNTERINIT(POSITIVEINTEGER value) {
        this.synccounterinit = value;
    }

    /**
     * ??upperheaderbitstoshift?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getUPPERHEADERBITSTOSHIFT() {
        return upperheaderbitstoshift;
    }

    /**
     * ??upperheaderbitstoshift?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setUPPERHEADERBITSTOSHIFT(POSITIVEINTEGER value) {
        this.upperheaderbitstoshift = value;
    }

    /**
     * ??windowsize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getWINDOWSIZE() {
        return windowsize;
    }

    /**
     * ??windowsize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setWINDOWSIZE(POSITIVEINTEGER value) {
        this.windowsize = value;
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
