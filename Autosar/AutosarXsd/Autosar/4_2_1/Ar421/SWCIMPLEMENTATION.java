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
 * This meta-class represents a specialization of the general Implementation meta-class with respect to the usage in application software.
 * 
 * <p>SWC-IMPLEMENTATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-IMPLEMENTATION">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-IMPLEMENTATION"/>
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
@XmlType(name = "SWC-IMPLEMENTATION", propOrder = {
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
    "behaviorref",
    "perinstancememorysizes",
    "requiredrtevendor"
})
public class SWCIMPLEMENTATION {

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
    protected LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "BUILD-ACTION-MANIFESTS")
    protected SWCIMPLEMENTATION.BUILDACTIONMANIFESTS buildactionmanifests;
    @XmlElement(name = "CODE-DESCRIPTORS")
    protected SWCIMPLEMENTATION.CODEDESCRIPTORS codedescriptors;
    @XmlElement(name = "COMPILERS")
    protected SWCIMPLEMENTATION.COMPILERS compilers;
    @XmlElement(name = "GENERATED-ARTIFACTS")
    protected SWCIMPLEMENTATION.GENERATEDARTIFACTS generatedartifacts;
    @XmlElement(name = "HW-ELEMENT-REFS")
    protected SWCIMPLEMENTATION.HWELEMENTREFS hwelementrefs;
    @XmlElement(name = "LINKERS")
    protected SWCIMPLEMENTATION.LINKERS linkers;
    @XmlElement(name = "MC-SUPPORT")
    protected MCSUPPORTDATA mcsupport;
    @XmlElement(name = "PROGRAMMING-LANGUAGE")
    protected PROGRAMMINGLANGUAGEENUM programminglanguage;
    @XmlElement(name = "REQUIRED-ARTIFACTS")
    protected SWCIMPLEMENTATION.REQUIREDARTIFACTS requiredartifacts;
    @XmlElement(name = "REQUIRED-GENERATOR-TOOLS")
    protected SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS requiredgeneratortools;
    @XmlElement(name = "RESOURCE-CONSUMPTION")
    protected RESOURCECONSUMPTION resourceconsumption;
    @XmlElement(name = "SW-VERSION")
    protected REVISIONLABELSTRING swversion;
    @XmlElement(name = "SWC-BSW-MAPPING-REF")
    protected SWCIMPLEMENTATION.SWCBSWMAPPINGREF swcbswmappingref;
    @XmlElement(name = "USED-CODE-GENERATOR")
    protected STRING usedcodegenerator;
    @XmlElement(name = "VENDOR-ID")
    protected POSITIVEINTEGER vendorid;
    @XmlElement(name = "BEHAVIOR-REF")
    protected SWCIMPLEMENTATION.BEHAVIORREF behaviorref;
    @XmlElement(name = "PER-INSTANCE-MEMORY-SIZES")
    protected SWCIMPLEMENTATION.PERINSTANCEMEMORYSIZES perinstancememorysizes;
    @XmlElement(name = "REQUIRED-RTE-VENDOR")
    protected STRING requiredrtevendor;
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
     *     {@link LINKER.ANNOTATIONS }
     *     
     */
    public LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(LINKER.ANNOTATIONS value) {
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
     *     {@link SWCIMPLEMENTATION.BUILDACTIONMANIFESTS }
     *     
     */
    public SWCIMPLEMENTATION.BUILDACTIONMANIFESTS getBUILDACTIONMANIFESTS() {
        return buildactionmanifests;
    }

    /**
     * ??buildactionmanifests?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.BUILDACTIONMANIFESTS }
     *     
     */
    public void setBUILDACTIONMANIFESTS(SWCIMPLEMENTATION.BUILDACTIONMANIFESTS value) {
        this.buildactionmanifests = value;
    }

    /**
     * ??codedescriptors?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.CODEDESCRIPTORS }
     *     
     */
    public SWCIMPLEMENTATION.CODEDESCRIPTORS getCODEDESCRIPTORS() {
        return codedescriptors;
    }

    /**
     * ??codedescriptors?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.CODEDESCRIPTORS }
     *     
     */
    public void setCODEDESCRIPTORS(SWCIMPLEMENTATION.CODEDESCRIPTORS value) {
        this.codedescriptors = value;
    }

    /**
     * ??compilers?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.COMPILERS }
     *     
     */
    public SWCIMPLEMENTATION.COMPILERS getCOMPILERS() {
        return compilers;
    }

    /**
     * ??compilers?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.COMPILERS }
     *     
     */
    public void setCOMPILERS(SWCIMPLEMENTATION.COMPILERS value) {
        this.compilers = value;
    }

    /**
     * ??generatedartifacts?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.GENERATEDARTIFACTS }
     *     
     */
    public SWCIMPLEMENTATION.GENERATEDARTIFACTS getGENERATEDARTIFACTS() {
        return generatedartifacts;
    }

    /**
     * ??generatedartifacts?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.GENERATEDARTIFACTS }
     *     
     */
    public void setGENERATEDARTIFACTS(SWCIMPLEMENTATION.GENERATEDARTIFACTS value) {
        this.generatedartifacts = value;
    }

    /**
     * ??hwelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.HWELEMENTREFS }
     *     
     */
    public SWCIMPLEMENTATION.HWELEMENTREFS getHWELEMENTREFS() {
        return hwelementrefs;
    }

    /**
     * ??hwelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.HWELEMENTREFS }
     *     
     */
    public void setHWELEMENTREFS(SWCIMPLEMENTATION.HWELEMENTREFS value) {
        this.hwelementrefs = value;
    }

    /**
     * ??linkers?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.LINKERS }
     *     
     */
    public SWCIMPLEMENTATION.LINKERS getLINKERS() {
        return linkers;
    }

    /**
     * ??linkers?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.LINKERS }
     *     
     */
    public void setLINKERS(SWCIMPLEMENTATION.LINKERS value) {
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
     *     {@link SWCIMPLEMENTATION.REQUIREDARTIFACTS }
     *     
     */
    public SWCIMPLEMENTATION.REQUIREDARTIFACTS getREQUIREDARTIFACTS() {
        return requiredartifacts;
    }

    /**
     * ??requiredartifacts?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.REQUIREDARTIFACTS }
     *     
     */
    public void setREQUIREDARTIFACTS(SWCIMPLEMENTATION.REQUIREDARTIFACTS value) {
        this.requiredartifacts = value;
    }

    /**
     * ??requiredgeneratortools?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS }
     *     
     */
    public SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS getREQUIREDGENERATORTOOLS() {
        return requiredgeneratortools;
    }

    /**
     * ??requiredgeneratortools?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS }
     *     
     */
    public void setREQUIREDGENERATORTOOLS(SWCIMPLEMENTATION.REQUIREDGENERATORTOOLS value) {
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
     *     {@link SWCIMPLEMENTATION.SWCBSWMAPPINGREF }
     *     
     */
    public SWCIMPLEMENTATION.SWCBSWMAPPINGREF getSWCBSWMAPPINGREF() {
        return swcbswmappingref;
    }

    /**
     * ??swcbswmappingref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.SWCBSWMAPPINGREF }
     *     
     */
    public void setSWCBSWMAPPINGREF(SWCIMPLEMENTATION.SWCBSWMAPPINGREF value) {
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
     * ??behaviorref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.BEHAVIORREF }
     *     
     */
    public SWCIMPLEMENTATION.BEHAVIORREF getBEHAVIORREF() {
        return behaviorref;
    }

    /**
     * ??behaviorref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.BEHAVIORREF }
     *     
     */
    public void setBEHAVIORREF(SWCIMPLEMENTATION.BEHAVIORREF value) {
        this.behaviorref = value;
    }

    /**
     * ??perinstancememorysizes?????
     * 
     * @return
     *     possible object is
     *     {@link SWCIMPLEMENTATION.PERINSTANCEMEMORYSIZES }
     *     
     */
    public SWCIMPLEMENTATION.PERINSTANCEMEMORYSIZES getPERINSTANCEMEMORYSIZES() {
        return perinstancememorysizes;
    }

    /**
     * ??perinstancememorysizes?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCIMPLEMENTATION.PERINSTANCEMEMORYSIZES }
     *     
     */
    public void setPERINSTANCEMEMORYSIZES(SWCIMPLEMENTATION.PERINSTANCEMEMORYSIZES value) {
        this.perinstancememorysizes = value;
    }

    /**
     * ??requiredrtevendor?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getREQUIREDRTEVENDOR() {
        return requiredrtevendor;
    }

    /**
     * ??requiredrtevendor?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setREQUIREDRTEVENDOR(STRING value) {
        this.requiredrtevendor = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SWC-INTERNAL-BEHAVIOR--SUBTYPES-ENUM" />
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
        protected SWCINTERNALBEHAVIORSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public SWCINTERNALBEHAVIORSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCINTERNALBEHAVIORSUBTYPESENUM }
         *     
         */
        public void setDEST(SWCINTERNALBEHAVIORSUBTYPESENUM value) {
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
     *         &lt;element name="BUILD-ACTION-MANIFEST-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}BUILD-ACTION-MANIFEST-REF-CONDITIONAL"/>
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
        "buildactionmanifestrefconditional"
    })
    public static class BUILDACTIONMANIFESTS {

        @XmlElement(name = "BUILD-ACTION-MANIFEST-REF-CONDITIONAL")
        protected List<BUILDACTIONMANIFESTREFCONDITIONAL> buildactionmanifestrefconditional;

        /**
         * Gets the value of the buildactionmanifestrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildactionmanifestrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUILDACTIONMANIFESTREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDACTIONMANIFESTREFCONDITIONAL }
         * 
         * 
         */
        public List<BUILDACTIONMANIFESTREFCONDITIONAL> getBUILDACTIONMANIFESTREFCONDITIONAL() {
            if (buildactionmanifestrefconditional == null) {
                buildactionmanifestrefconditional = new ArrayList<BUILDACTIONMANIFESTREFCONDITIONAL>();
            }
            return this.buildactionmanifestrefconditional;
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
     *         &lt;element name="CODE" type="{http://autosar.org/schema/r4.0}CODE"/>
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
        "code"
    })
    public static class CODEDESCRIPTORS {

        @XmlElement(name = "CODE")
        protected List<CODE> code;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CODE }
         * 
         * 
         */
        public List<CODE> getCODE() {
            if (code == null) {
                code = new ArrayList<CODE>();
            }
            return this.code;
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
     *         &lt;element name="COMPILER" type="{http://autosar.org/schema/r4.0}COMPILER"/>
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
        "compiler"
    })
    public static class COMPILERS {

        @XmlElement(name = "COMPILER")
        protected List<COMPILER> compiler;

        /**
         * Gets the value of the compiler property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compiler property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMPILER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPILER }
         * 
         * 
         */
        public List<COMPILER> getCOMPILER() {
            if (compiler == null) {
                compiler = new ArrayList<COMPILER>();
            }
            return this.compiler;
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
     *         &lt;element name="DEPENDENCY-ON-ARTIFACT" type="{http://autosar.org/schema/r4.0}DEPENDENCY-ON-ARTIFACT"/>
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
        "dependencyonartifact"
    })
    public static class GENERATEDARTIFACTS {

        @XmlElement(name = "DEPENDENCY-ON-ARTIFACT")
        protected List<DEPENDENCYONARTIFACT> dependencyonartifact;

        /**
         * Gets the value of the dependencyonartifact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependencyonartifact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEPENDENCYONARTIFACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DEPENDENCYONARTIFACT }
         * 
         * 
         */
        public List<DEPENDENCYONARTIFACT> getDEPENDENCYONARTIFACT() {
            if (dependencyonartifact == null) {
                dependencyonartifact = new ArrayList<DEPENDENCYONARTIFACT>();
            }
            return this.dependencyonartifact;
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
     *         &lt;element name="HW-ELEMENT-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-ELEMENT--SUBTYPES-ENUM" />
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
        "hwelementref"
    })
    public static class HWELEMENTREFS {

        @XmlElement(name = "HW-ELEMENT-REF")
        protected List<SWCIMPLEMENTATION.HWELEMENTREFS.HWELEMENTREF> hwelementref;

        /**
         * Gets the value of the hwelementref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwelementref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWELEMENTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCIMPLEMENTATION.HWELEMENTREFS.HWELEMENTREF }
         * 
         * 
         */
        public List<SWCIMPLEMENTATION.HWELEMENTREFS.HWELEMENTREF> getHWELEMENTREF() {
            if (hwelementref == null) {
                hwelementref = new ArrayList<SWCIMPLEMENTATION.HWELEMENTREFS.HWELEMENTREF>();
            }
            return this.hwelementref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-ELEMENT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HWELEMENTREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected HWELEMENTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link HWELEMENTSUBTYPESENUM }
             *     
             */
            public HWELEMENTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link HWELEMENTSUBTYPESENUM }
             *     
             */
            public void setDEST(HWELEMENTSUBTYPESENUM value) {
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
     *         &lt;element name="LINKER" type="{http://autosar.org/schema/r4.0}LINKER"/>
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
        "linker"
    })
    public static class LINKERS {

        @XmlElement(name = "LINKER")
        protected List<LINKER> linker;

        /**
         * Gets the value of the linker property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linker property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINKER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINKER }
         * 
         * 
         */
        public List<LINKER> getLINKER() {
            if (linker == null) {
                linker = new ArrayList<LINKER>();
            }
            return this.linker;
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
     *         &lt;element name="PER-INSTANCE-MEMORY-SIZE" type="{http://autosar.org/schema/r4.0}PER-INSTANCE-MEMORY-SIZE"/>
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
        "perinstancememorysize"
    })
    public static class PERINSTANCEMEMORYSIZES {

        @XmlElement(name = "PER-INSTANCE-MEMORY-SIZE")
        protected List<PERINSTANCEMEMORYSIZE> perinstancememorysize;

        /**
         * Gets the value of the perinstancememorysize property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the perinstancememorysize property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPERINSTANCEMEMORYSIZE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PERINSTANCEMEMORYSIZE }
         * 
         * 
         */
        public List<PERINSTANCEMEMORYSIZE> getPERINSTANCEMEMORYSIZE() {
            if (perinstancememorysize == null) {
                perinstancememorysize = new ArrayList<PERINSTANCEMEMORYSIZE>();
            }
            return this.perinstancememorysize;
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
     *         &lt;element name="DEPENDENCY-ON-ARTIFACT" type="{http://autosar.org/schema/r4.0}DEPENDENCY-ON-ARTIFACT"/>
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
        "dependencyonartifact"
    })
    public static class REQUIREDARTIFACTS {

        @XmlElement(name = "DEPENDENCY-ON-ARTIFACT")
        protected List<DEPENDENCYONARTIFACT> dependencyonartifact;

        /**
         * Gets the value of the dependencyonartifact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependencyonartifact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEPENDENCYONARTIFACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DEPENDENCYONARTIFACT }
         * 
         * 
         */
        public List<DEPENDENCYONARTIFACT> getDEPENDENCYONARTIFACT() {
            if (dependencyonartifact == null) {
                dependencyonartifact = new ArrayList<DEPENDENCYONARTIFACT>();
            }
            return this.dependencyonartifact;
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
     *         &lt;element name="DEPENDENCY-ON-ARTIFACT" type="{http://autosar.org/schema/r4.0}DEPENDENCY-ON-ARTIFACT"/>
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
        "dependencyonartifact"
    })
    public static class REQUIREDGENERATORTOOLS {

        @XmlElement(name = "DEPENDENCY-ON-ARTIFACT")
        protected List<DEPENDENCYONARTIFACT> dependencyonartifact;

        /**
         * Gets the value of the dependencyonartifact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependencyonartifact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEPENDENCYONARTIFACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DEPENDENCYONARTIFACT }
         * 
         * 
         */
        public List<DEPENDENCYONARTIFACT> getDEPENDENCYONARTIFACT() {
            if (dependencyonartifact == null) {
                dependencyonartifact = new ArrayList<DEPENDENCYONARTIFACT>();
            }
            return this.dependencyonartifact;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SWC-BSW-MAPPING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWCBSWMAPPINGREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWCBSWMAPPINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCBSWMAPPINGSUBTYPESENUM }
         *     
         */
        public SWCBSWMAPPINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCBSWMAPPINGSUBTYPESENUM }
         *     
         */
        public void setDEST(SWCBSWMAPPINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
