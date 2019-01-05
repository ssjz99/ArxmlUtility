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
 * Contains the implementation specific information in addition to the generic specification (BswModuleDescription and BswBehavior).
 * It is possible to have several different BswImplementations referring to the same BswBehavior.
 * 
 * <p>BSW-IMPLEMENTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-IMPLEMENTATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IMPLEMENTATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-IMPLEMENTATION"/>
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
@XmlType(name = "BSW-IMPLEMENTATION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "buildactionmanifests",
    "codedescriptors",
    "compilers",
    "generatedartifacts",
    "hwelementrefs",
    "linkers",
    "mcsupport",
    "programminglanguage",
    "requiredartifacts",
    "requiredgeneratortools",
    "resourceconsumption",
    "swversion",
    "swcbswmappingref",
    "usedcodegenerator",
    "vendorid",
    "arreleaseversion",
    "behaviorref",
    "debuginfos",
    "preconfiguredconfigurationrefs",
    "recommendedconfigurationrefs",
    "vendorapiinfix",
    "vendorspecificmoduledefrefs"
})
public class BSWIMPLEMENTATION {

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
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "BUILD-ACTION-MANIFESTS")
    protected Ar421.SWCIMPLEMENTATION.BUILDACTIONMANIFESTS buildactionmanifests;
    @XmlElement(name = "CODE-DESCRIPTORS")
    protected Ar421.SWCIMPLEMENTATION.CODEDESCRIPTORS codedescriptors;
    @XmlElement(name = "COMPILERS")
    protected Ar421.SWCIMPLEMENTATION.COMPILERS compilers;
    @XmlElement(name = "GENERATED-ARTIFACTS")
    protected Ar421.SWCIMPLEMENTATION.GENERATEDARTIFACTS generatedartifacts;
    @XmlElement(name = "HW-ELEMENT-REFS")
    protected Ar421.SWCIMPLEMENTATION.HWELEMENTREFS hwelementrefs;
    @XmlElement(name = "LINKERS")
    protected Ar421.SWCIMPLEMENTATION.LINKERS linkers;
    @XmlElement(name = "MC-SUPPORT")
    protected MCSUPPORTDATA mcsupport;
    @XmlElement(name = "PROGRAMMING-LANGUAGE")
    protected PROGRAMMINGLANGUAGEENUM programminglanguage;
    @XmlElement(name = "REQUIRED-ARTIFACTS")
    protected Ar421.SWCIMPLEMENTATION.REQUIREDARTIFACTS requiredartifacts;
    @XmlElement(name = "REQUIRED-GENERATOR-TOOLS")
    protected Ar421.SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS requiredgeneratortools;
    @XmlElement(name = "RESOURCE-CONSUMPTION")
    protected RESOURCECONSUMPTION resourceconsumption;
    @XmlElement(name = "SW-VERSION")
    protected REVISIONLABELSTRING swversion;
    @XmlElement(name = "SWC-BSW-MAPPING-REF")
    protected Ar421.SWCIMPLEMENTATION.SWCBSWMAPPINGREF swcbswmappingref;
    @XmlElement(name = "USED-CODE-GENERATOR")
    protected STRING usedcodegenerator;
    @XmlElement(name = "VENDOR-ID")
    protected POSITIVEINTEGER vendorid;
    @XmlElement(name = "AR-RELEASE-VERSION")
    protected REVISIONLABELSTRING arreleaseversion;
    @XmlElement(name = "BEHAVIOR-REF")
    protected BSWIMPLEMENTATION.BEHAVIORREF behaviorref;
    @XmlElement(name = "DEBUG-INFOS")
    protected BSWIMPLEMENTATION.DEBUGINFOS debuginfos;
    @XmlElement(name = "PRECONFIGURED-CONFIGURATION-REFS")
    protected BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS preconfiguredconfigurationrefs;
    @XmlElement(name = "RECOMMENDED-CONFIGURATION-REFS")
    protected BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS recommendedconfigurationrefs;
    @XmlElement(name = "VENDOR-API-INFIX")
    protected IDENTIFIER vendorapiinfix;
    @XmlElement(name = "VENDOR-SPECIFIC-MODULE-DEF-REFS")
    protected BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS vendorspecificmoduledefrefs;
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
     * ??buildactionmanifests?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.BUILDACTIONMANIFESTS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.BUILDACTIONMANIFESTS getBUILDACTIONMANIFESTS() {
        return buildactionmanifests;
    }

    /**
     * ??buildactionmanifests?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.BUILDACTIONMANIFESTS }
     *     
     */
    public void setBUILDACTIONMANIFESTS(Ar421.SWCIMPLEMENTATION.BUILDACTIONMANIFESTS value) {
        this.buildactionmanifests = value;
    }

    /**
     * ??codedescriptors?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.CODEDESCRIPTORS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.CODEDESCRIPTORS getCODEDESCRIPTORS() {
        return codedescriptors;
    }

    /**
     * ??codedescriptors?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.CODEDESCRIPTORS }
     *     
     */
    public void setCODEDESCRIPTORS(Ar421.SWCIMPLEMENTATION.CODEDESCRIPTORS value) {
        this.codedescriptors = value;
    }

    /**
     * ??compilers?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.COMPILERS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.COMPILERS getCOMPILERS() {
        return compilers;
    }

    /**
     * ??compilers?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.COMPILERS }
     *     
     */
    public void setCOMPILERS(Ar421.SWCIMPLEMENTATION.COMPILERS value) {
        this.compilers = value;
    }

    /**
     * ??generatedartifacts?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.GENERATEDARTIFACTS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.GENERATEDARTIFACTS getGENERATEDARTIFACTS() {
        return generatedartifacts;
    }

    /**
     * ??generatedartifacts?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.GENERATEDARTIFACTS }
     *     
     */
    public void setGENERATEDARTIFACTS(Ar421.SWCIMPLEMENTATION.GENERATEDARTIFACTS value) {
        this.generatedartifacts = value;
    }

    /**
     * ??hwelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.HWELEMENTREFS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.HWELEMENTREFS getHWELEMENTREFS() {
        return hwelementrefs;
    }

    /**
     * ??hwelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.HWELEMENTREFS }
     *     
     */
    public void setHWELEMENTREFS(Ar421.SWCIMPLEMENTATION.HWELEMENTREFS value) {
        this.hwelementrefs = value;
    }

    /**
     * ??linkers?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.LINKERS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.LINKERS getLINKERS() {
        return linkers;
    }

    /**
     * ??linkers?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.LINKERS }
     *     
     */
    public void setLINKERS(Ar421.SWCIMPLEMENTATION.LINKERS value) {
        this.linkers = value;
    }

    /**
     * ??mcsupport?????
     * 
     * @return
     *     possible object is
     *     {@link MCSUPPORTDATA }
     *     
     */
    public MCSUPPORTDATA getMCSUPPORT() {
        return mcsupport;
    }

    /**
     * ??mcsupport?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSUPPORTDATA }
     *     
     */
    public void setMCSUPPORT(MCSUPPORTDATA value) {
        this.mcsupport = value;
    }

    /**
     * ??programminglanguage?????
     * 
     * @return
     *     possible object is
     *     {@link PROGRAMMINGLANGUAGEENUM }
     *     
     */
    public PROGRAMMINGLANGUAGEENUM getPROGRAMMINGLANGUAGE() {
        return programminglanguage;
    }

    /**
     * ??programminglanguage?????
     * 
     * @param value
     *     allowed object is
     *     {@link PROGRAMMINGLANGUAGEENUM }
     *     
     */
    public void setPROGRAMMINGLANGUAGE(PROGRAMMINGLANGUAGEENUM value) {
        this.programminglanguage = value;
    }

    /**
     * ??requiredartifacts?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.REQUIREDARTIFACTS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.REQUIREDARTIFACTS getREQUIREDARTIFACTS() {
        return requiredartifacts;
    }

    /**
     * ??requiredartifacts?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.REQUIREDARTIFACTS }
     *     
     */
    public void setREQUIREDARTIFACTS(Ar421.SWCIMPLEMENTATION.REQUIREDARTIFACTS value) {
        this.requiredartifacts = value;
    }

    /**
     * ??requiredgeneratortools?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS getREQUIREDGENERATORTOOLS() {
        return requiredgeneratortools;
    }

    /**
     * ??requiredgeneratortools?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS }
     *     
     */
    public void setREQUIREDGENERATORTOOLS(Ar421.SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS value) {
        this.requiredgeneratortools = value;
    }

    /**
     * ??resourceconsumption?????
     * 
     * @return
     *     possible object is
     *     {@link RESOURCECONSUMPTION }
     *     
     */
    public RESOURCECONSUMPTION getRESOURCECONSUMPTION() {
        return resourceconsumption;
    }

    /**
     * ??resourceconsumption?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCECONSUMPTION }
     *     
     */
    public void setRESOURCECONSUMPTION(RESOURCECONSUMPTION value) {
        this.resourceconsumption = value;
    }

    /**
     * ??swversion?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getSWVERSION() {
        return swversion;
    }

    /**
     * ??swversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setSWVERSION(REVISIONLABELSTRING value) {
        this.swversion = value;
    }

    /**
     * ??swcbswmappingref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SWCIMPLEMENTATION.SWCBSWMAPPINGREF }
     *     
     */
    public Ar421.SWCIMPLEMENTATION.SWCBSWMAPPINGREF getSWCBSWMAPPINGREF() {
        return swcbswmappingref;
    }

    /**
     * ??swcbswmappingref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SWCIMPLEMENTATION.SWCBSWMAPPINGREF }
     *     
     */
    public void setSWCBSWMAPPINGREF(Ar421.SWCIMPLEMENTATION.SWCBSWMAPPINGREF value) {
        this.swcbswmappingref = value;
    }

    /**
     * ??usedcodegenerator?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getUSEDCODEGENERATOR() {
        return usedcodegenerator;
    }

    /**
     * ??usedcodegenerator?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setUSEDCODEGENERATOR(STRING value) {
        this.usedcodegenerator = value;
    }

    /**
     * ??vendorid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getVENDORID() {
        return vendorid;
    }

    /**
     * ??vendorid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setVENDORID(POSITIVEINTEGER value) {
        this.vendorid = value;
    }

    /**
     * ??arreleaseversion?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getARRELEASEVERSION() {
        return arreleaseversion;
    }

    /**
     * ??arreleaseversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setARRELEASEVERSION(REVISIONLABELSTRING value) {
        this.arreleaseversion = value;
    }

    /**
     * ??behaviorref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWIMPLEMENTATION.BEHAVIORREF }
     *     
     */
    public BSWIMPLEMENTATION.BEHAVIORREF getBEHAVIORREF() {
        return behaviorref;
    }

    /**
     * ??behaviorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWIMPLEMENTATION.BEHAVIORREF }
     *     
     */
    public void setBEHAVIORREF(BSWIMPLEMENTATION.BEHAVIORREF value) {
        this.behaviorref = value;
    }

    /**
     * ??debuginfos?????
     * 
     * @return
     *     possible object is
     *     {@link BSWIMPLEMENTATION.DEBUGINFOS }
     *     
     */
    public BSWIMPLEMENTATION.DEBUGINFOS getDEBUGINFOS() {
        return debuginfos;
    }

    /**
     * ??debuginfos?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWIMPLEMENTATION.DEBUGINFOS }
     *     
     */
    public void setDEBUGINFOS(BSWIMPLEMENTATION.DEBUGINFOS value) {
        this.debuginfos = value;
    }

    /**
     * ??preconfiguredconfigurationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS }
     *     
     */
    public BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS getPRECONFIGUREDCONFIGURATIONREFS() {
        return preconfiguredconfigurationrefs;
    }

    /**
     * ??preconfiguredconfigurationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS }
     *     
     */
    public void setPRECONFIGUREDCONFIGURATIONREFS(BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS value) {
        this.preconfiguredconfigurationrefs = value;
    }

    /**
     * ??recommendedconfigurationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS }
     *     
     */
    public BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS getRECOMMENDEDCONFIGURATIONREFS() {
        return recommendedconfigurationrefs;
    }

    /**
     * ??recommendedconfigurationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS }
     *     
     */
    public void setRECOMMENDEDCONFIGURATIONREFS(BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS value) {
        this.recommendedconfigurationrefs = value;
    }

    /**
     * ??vendorapiinfix?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getVENDORAPIINFIX() {
        return vendorapiinfix;
    }

    /**
     * ??vendorapiinfix?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setVENDORAPIINFIX(IDENTIFIER value) {
        this.vendorapiinfix = value;
    }

    /**
     * ??vendorspecificmoduledefrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS }
     *     
     */
    public BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS getVENDORSPECIFICMODULEDEFREFS() {
        return vendorspecificmoduledefrefs;
    }

    /**
     * ??vendorspecificmoduledefrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS }
     *     
     */
    public void setVENDORSPECIFICMODULEDEFREFS(BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS value) {
        this.vendorspecificmoduledefrefs = value;
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-INTERNAL-BEHAVIOR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BEHAVIORREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWINTERNALBEHAVIORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public BSWINTERNALBEHAVIORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWINTERNALBEHAVIORSUBTYPESENUM value) {
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
     *         &lt;element name="BSW-DEBUG-INFO" type="{http://autosar.org/schema/r4.0}BSW-DEBUG-INFO"/>
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
        "bswdebuginfo"
    })
    public static class DEBUGINFOS {

        @XmlElement(name = "BSW-DEBUG-INFO")
        protected List<BSWDEBUGINFO> bswdebuginfo;

        /**
         * Gets the value of the bswdebuginfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bswdebuginfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBSWDEBUGINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWDEBUGINFO }
         * 
         * 
         */
        public List<BSWDEBUGINFO> getBSWDEBUGINFO() {
            if (bswdebuginfo == null) {
                bswdebuginfo = new ArrayList<BSWDEBUGINFO>();
            }
            return this.bswdebuginfo;
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
     *         &lt;element name="PRECONFIGURED-CONFIGURATION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "preconfiguredconfigurationref"
    })
    public static class PRECONFIGUREDCONFIGURATIONREFS {

        @XmlElement(name = "PRECONFIGURED-CONFIGURATION-REF")
        protected List<BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS.PRECONFIGUREDCONFIGURATIONREF> preconfiguredconfigurationref;

        /**
         * Gets the value of the preconfiguredconfigurationref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preconfiguredconfigurationref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRECONFIGUREDCONFIGURATIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS.PRECONFIGUREDCONFIGURATIONREF }
         * 
         * 
         */
        public List<BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS.PRECONFIGUREDCONFIGURATIONREF> getPRECONFIGUREDCONFIGURATIONREF() {
            if (preconfiguredconfigurationref == null) {
                preconfiguredconfigurationref = new ArrayList<BSWIMPLEMENTATION.PRECONFIGUREDCONFIGURATIONREFS.PRECONFIGUREDCONFIGURATIONREF>();
            }
            return this.preconfiguredconfigurationref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PRECONFIGUREDCONFIGURATIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM }
             *     
             */
            public ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM }
             *     
             */
            public void setDEST(ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="RECOMMENDED-CONFIGURATION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "recommendedconfigurationref"
    })
    public static class RECOMMENDEDCONFIGURATIONREFS {

        @XmlElement(name = "RECOMMENDED-CONFIGURATION-REF")
        protected List<BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS.RECOMMENDEDCONFIGURATIONREF> recommendedconfigurationref;

        /**
         * Gets the value of the recommendedconfigurationref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendedconfigurationref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECOMMENDEDCONFIGURATIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS.RECOMMENDEDCONFIGURATIONREF }
         * 
         * 
         */
        public List<BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS.RECOMMENDEDCONFIGURATIONREF> getRECOMMENDEDCONFIGURATIONREF() {
            if (recommendedconfigurationref == null) {
                recommendedconfigurationref = new ArrayList<BSWIMPLEMENTATION.RECOMMENDEDCONFIGURATIONREFS.RECOMMENDEDCONFIGURATIONREF>();
            }
            return this.recommendedconfigurationref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RECOMMENDEDCONFIGURATIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM }
             *     
             */
            public ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM }
             *     
             */
            public void setDEST(ECUCMODULECONFIGURATIONVALUESSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="VENDOR-SPECIFIC-MODULE-DEF-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-DEF--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "vendorspecificmoduledefref"
    })
    public static class VENDORSPECIFICMODULEDEFREFS {

        @XmlElement(name = "VENDOR-SPECIFIC-MODULE-DEF-REF")
        protected List<BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS.VENDORSPECIFICMODULEDEFREF> vendorspecificmoduledefref;

        /**
         * Gets the value of the vendorspecificmoduledefref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorspecificmoduledefref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVENDORSPECIFICMODULEDEFREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS.VENDORSPECIFICMODULEDEFREF }
         * 
         * 
         */
        public List<BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS.VENDORSPECIFICMODULEDEFREF> getVENDORSPECIFICMODULEDEFREF() {
            if (vendorspecificmoduledefref == null) {
                vendorspecificmoduledefref = new ArrayList<BSWIMPLEMENTATION.VENDORSPECIFICMODULEDEFREFS.VENDORSPECIFICMODULEDEFREF>();
            }
            return this.vendorspecificmoduledefref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-DEF--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class VENDORSPECIFICMODULEDEFREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ECUCMODULEDEFSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ECUCMODULEDEFSUBTYPESENUM }
             *     
             */
            public ECUCMODULEDEFSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ECUCMODULEDEFSUBTYPESENUM }
             *     
             */
            public void setDEST(ECUCMODULEDEFSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
