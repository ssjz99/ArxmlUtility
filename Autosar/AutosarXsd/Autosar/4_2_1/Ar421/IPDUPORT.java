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
 * Connectors reception or send port on the referenced channel referenced by a PduTriggering.
 * 
 * <p>I-PDU-PORT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-PDU-PORT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMM-CONNECTOR-PORT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-PDU-PORT"/>
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
@XmlType(name = "I-PDU-PORT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "communicationdirection",
    "variationpoint",
    "ipdusignalprocessing",
    "keyid",
    "rxsecurityverification",
    "timestamprxacceptancewindow"
})
public class IPDUPORT {

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
    @XmlElement(name = "COMMUNICATION-DIRECTION")
    protected COMMUNICATIONDIRECTIONTYPE communicationdirection;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "I-PDU-SIGNAL-PROCESSING")
    protected IPDUSIGNALPROCESSINGENUM ipdusignalprocessing;
    @XmlElement(name = "KEY-ID")
    protected POSITIVEINTEGER keyid;
    @XmlElement(name = "RX-SECURITY-VERIFICATION")
    protected BOOLEAN rxsecurityverification;
    @XmlElement(name = "TIMESTAMP-RX-ACCEPTANCE-WINDOW")
    protected TIMEVALUE timestamprxacceptancewindow;
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
     * ??communicationdirection?????
     * 
     * @return
     *     possible object is
     *     {@link COMMUNICATIONDIRECTIONTYPE }
     *     
     */
    public COMMUNICATIONDIRECTIONTYPE getCOMMUNICATIONDIRECTION() {
        return communicationdirection;
    }

    /**
     * ??communicationdirection?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMMUNICATIONDIRECTIONTYPE }
     *     
     */
    public void setCOMMUNICATIONDIRECTION(COMMUNICATIONDIRECTIONTYPE value) {
        this.communicationdirection = value;
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
     * ??ipdusignalprocessing?????
     * 
     * @return
     *     possible object is
     *     {@link IPDUSIGNALPROCESSINGENUM }
     *     
     */
    public IPDUSIGNALPROCESSINGENUM getIPDUSIGNALPROCESSING() {
        return ipdusignalprocessing;
    }

    /**
     * ??ipdusignalprocessing?????
     * 
     * @param value
     *     allowed object is
     *     {@link IPDUSIGNALPROCESSINGENUM }
     *     
     */
    public void setIPDUSIGNALPROCESSING(IPDUSIGNALPROCESSINGENUM value) {
        this.ipdusignalprocessing = value;
    }

    /**
     * ??keyid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getKEYID() {
        return keyid;
    }

    /**
     * ??keyid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setKEYID(POSITIVEINTEGER value) {
        this.keyid = value;
    }

    /**
     * ??rxsecurityverification?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRXSECURITYVERIFICATION() {
        return rxsecurityverification;
    }

    /**
     * ??rxsecurityverification?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRXSECURITYVERIFICATION(BOOLEAN value) {
        this.rxsecurityverification = value;
    }

    /**
     * ??timestamprxacceptancewindow?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMESTAMPRXACCEPTANCEWINDOW() {
        return timestamprxacceptancewindow;
    }

    /**
     * ??timestamprxacceptancewindow?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMESTAMPRXACCEPTANCEWINDOW(TIMEVALUE value) {
        this.timestamprxacceptancewindow = value;
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
