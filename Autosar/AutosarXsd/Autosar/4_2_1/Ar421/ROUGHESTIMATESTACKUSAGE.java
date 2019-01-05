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
 * Rough estimation of the stack usage.
 * 
 * <p>ROUGH-ESTIMATE-STACK-USAGE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ROUGH-ESTIMATE-STACK-USAGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}STACK-USAGE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ROUGH-ESTIMATE-STACK-USAGE"/>
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
@XmlType(name = "ROUGH-ESTIMATE-STACK-USAGE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "executableentityref",
    "hardwareconfiguration",
    "hwelementref",
    "softwarecontext",
    "variationpoint",
    "memoryconsumption"
})
public class ROUGHESTIMATESTACKUSAGE {

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
    @XmlElement(name = "EXECUTABLE-ENTITY-REF")
    protected Ar421.MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF executableentityref;
    @XmlElement(name = "HARDWARE-CONFIGURATION")
    protected HARDWARECONFIGURATION hardwareconfiguration;
    @XmlElement(name = "HW-ELEMENT-REF")
    protected Ar421.MEASUREDSTACKUSAGE.HWELEMENTREF hwelementref;
    @XmlElement(name = "SOFTWARE-CONTEXT")
    protected SOFTWARECONTEXT softwarecontext;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "MEMORY-CONSUMPTION")
    protected POSITIVEINTEGER memoryconsumption;
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
     * ??executableentityref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF }
     *     
     */
    public Ar421.MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF getEXECUTABLEENTITYREF() {
        return executableentityref;
    }

    /**
     * ??executableentityref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF }
     *     
     */
    public void setEXECUTABLEENTITYREF(Ar421.MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF value) {
        this.executableentityref = value;
    }

    /**
     * ??hardwareconfiguration?????
     * 
     * @return
     *     possible object is
     *     {@link HARDWARECONFIGURATION }
     *     
     */
    public HARDWARECONFIGURATION getHARDWARECONFIGURATION() {
        return hardwareconfiguration;
    }

    /**
     * ??hardwareconfiguration?????
     * 
     * @param value
     *     allowed object is
     *     {@link HARDWARECONFIGURATION }
     *     
     */
    public void setHARDWARECONFIGURATION(HARDWARECONFIGURATION value) {
        this.hardwareconfiguration = value;
    }

    /**
     * ??hwelementref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.MEASUREDSTACKUSAGE.HWELEMENTREF }
     *     
     */
    public Ar421.MEASUREDSTACKUSAGE.HWELEMENTREF getHWELEMENTREF() {
        return hwelementref;
    }

    /**
     * ??hwelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.MEASUREDSTACKUSAGE.HWELEMENTREF }
     *     
     */
    public void setHWELEMENTREF(Ar421.MEASUREDSTACKUSAGE.HWELEMENTREF value) {
        this.hwelementref = value;
    }

    /**
     * ??softwarecontext?????
     * 
     * @return
     *     possible object is
     *     {@link SOFTWARECONTEXT }
     *     
     */
    public SOFTWARECONTEXT getSOFTWARECONTEXT() {
        return softwarecontext;
    }

    /**
     * ??softwarecontext?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOFTWARECONTEXT }
     *     
     */
    public void setSOFTWARECONTEXT(SOFTWARECONTEXT value) {
        this.softwarecontext = value;
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
     * ??memoryconsumption?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMEMORYCONSUMPTION() {
        return memoryconsumption;
    }

    /**
     * ??memoryconsumption?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMEMORYCONSUMPTION(POSITIVEINTEGER value) {
        this.memoryconsumption = value;
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
