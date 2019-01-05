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
 * AnalyzedExecutionTime provides an analytic method for specifying the best and worst case execution time.
 * 
 * <p>ANALYZED-EXECUTION-TIME complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ANALYZED-EXECUTION-TIME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXECUTION-TIME"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ANALYZED-EXECUTION-TIME"/>
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
@XmlType(name = "ANALYZED-EXECUTION-TIME", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "exclusivearearef",
    "executableentityref",
    "hardwareconfiguration",
    "hwelementref",
    "includedlibraryrefs",
    "memorysectionlocations",
    "softwarecontext",
    "variationpoint",
    "bestcaseexecutiontime",
    "worstcaseexecutiontime"
})
public class ANALYZEDEXECUTIONTIME {

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
    @XmlElement(name = "EXCLUSIVE-AREA-REF")
    protected Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF exclusivearearef;
    @XmlElement(name = "EXECUTABLE-ENTITY-REF")
    protected Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF executableentityref;
    @XmlElement(name = "HARDWARE-CONFIGURATION")
    protected HARDWARECONFIGURATION hardwareconfiguration;
    @XmlElement(name = "HW-ELEMENT-REF")
    protected Ar421.ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF hwelementref;
    @XmlElement(name = "INCLUDED-LIBRARY-REFS")
    protected Ar421.ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS includedlibraryrefs;
    @XmlElement(name = "MEMORY-SECTION-LOCATIONS")
    protected Ar421.ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS memorysectionlocations;
    @XmlElement(name = "SOFTWARE-CONTEXT")
    protected SOFTWARECONTEXT softwarecontext;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "BEST-CASE-EXECUTION-TIME")
    protected MULTIDIMENSIONALTIME bestcaseexecutiontime;
    @XmlElement(name = "WORST-CASE-EXECUTION-TIME")
    protected MULTIDIMENSIONALTIME worstcaseexecutiontime;
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
     * ??exclusivearearef?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF }
     *     
     */
    public Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF getEXCLUSIVEAREAREF() {
        return exclusivearearef;
    }

    /**
     * ??exclusivearearef?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF }
     *     
     */
    public void setEXCLUSIVEAREAREF(Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF value) {
        this.exclusivearearef = value;
    }

    /**
     * ??executableentityref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF }
     *     
     */
    public Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF getEXECUTABLEENTITYREF() {
        return executableentityref;
    }

    /**
     * ??executableentityref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF }
     *     
     */
    public void setEXECUTABLEENTITYREF(Ar421.ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF value) {
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
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF }
     *     
     */
    public Ar421.ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF getHWELEMENTREF() {
        return hwelementref;
    }

    /**
     * ??hwelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF }
     *     
     */
    public void setHWELEMENTREF(Ar421.ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF value) {
        this.hwelementref = value;
    }

    /**
     * ??includedlibraryrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS }
     *     
     */
    public Ar421.ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS getINCLUDEDLIBRARYREFS() {
        return includedlibraryrefs;
    }

    /**
     * ??includedlibraryrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS }
     *     
     */
    public void setINCLUDEDLIBRARYREFS(Ar421.ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS value) {
        this.includedlibraryrefs = value;
    }

    /**
     * ??memorysectionlocations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS }
     *     
     */
    public Ar421.ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS getMEMORYSECTIONLOCATIONS() {
        return memorysectionlocations;
    }

    /**
     * ??memorysectionlocations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS }
     *     
     */
    public void setMEMORYSECTIONLOCATIONS(Ar421.ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS value) {
        this.memorysectionlocations = value;
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
     * ??bestcaseexecutiontime?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getBESTCASEEXECUTIONTIME() {
        return bestcaseexecutiontime;
    }

    /**
     * ??bestcaseexecutiontime?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setBESTCASEEXECUTIONTIME(MULTIDIMENSIONALTIME value) {
        this.bestcaseexecutiontime = value;
    }

    /**
     * ??worstcaseexecutiontime?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getWORSTCASEEXECUTIONTIME() {
        return worstcaseexecutiontime;
    }

    /**
     * ??worstcaseexecutiontime?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setWORSTCASEEXECUTIONTIME(MULTIDIMENSIONALTIME value) {
        this.worstcaseexecutiontime = value;
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