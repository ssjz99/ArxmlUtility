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
 * The stack usage has been measured.
 * 
 * <p>MEASURED-STACK-USAGE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MEASURED-STACK-USAGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}STACK-USAGE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MEASURED-STACK-USAGE"/>
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
@XmlType(name = "MEASURED-STACK-USAGE", propOrder = {
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
    "averagememoryconsumption",
    "maximummemoryconsumption",
    "minimummemoryconsumption",
    "testpattern"
})
public class MEASUREDSTACKUSAGE {

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
    protected MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF executableentityref;
    @XmlElement(name = "HARDWARE-CONFIGURATION")
    protected HARDWARECONFIGURATION hardwareconfiguration;
    @XmlElement(name = "HW-ELEMENT-REF")
    protected MEASUREDSTACKUSAGE.HWELEMENTREF hwelementref;
    @XmlElement(name = "SOFTWARE-CONTEXT")
    protected SOFTWARECONTEXT softwarecontext;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "AVERAGE-MEMORY-CONSUMPTION")
    protected POSITIVEINTEGER averagememoryconsumption;
    @XmlElement(name = "MAXIMUM-MEMORY-CONSUMPTION")
    protected POSITIVEINTEGER maximummemoryconsumption;
    @XmlElement(name = "MINIMUM-MEMORY-CONSUMPTION")
    protected POSITIVEINTEGER minimummemoryconsumption;
    @XmlElement(name = "TEST-PATTERN")
    protected STRING testpattern;
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
     * ??executableentityref?????
     * 
     * @return
     *     possible object is
     *     {@link MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF }
     *     
     */
    public MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF getEXECUTABLEENTITYREF() {
        return executableentityref;
    }

    /**
     * ??executableentityref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF }
     *     
     */
    public void setEXECUTABLEENTITYREF(MEASUREDSTACKUSAGE.EXECUTABLEENTITYREF value) {
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
     *     {@link MEASUREDSTACKUSAGE.HWELEMENTREF }
     *     
     */
    public MEASUREDSTACKUSAGE.HWELEMENTREF getHWELEMENTREF() {
        return hwelementref;
    }

    /**
     * ??hwelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREDSTACKUSAGE.HWELEMENTREF }
     *     
     */
    public void setHWELEMENTREF(MEASUREDSTACKUSAGE.HWELEMENTREF value) {
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
     * ??averagememoryconsumption?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getAVERAGEMEMORYCONSUMPTION() {
        return averagememoryconsumption;
    }

    /**
     * ??averagememoryconsumption?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setAVERAGEMEMORYCONSUMPTION(POSITIVEINTEGER value) {
        this.averagememoryconsumption = value;
    }

    /**
     * ??maximummemoryconsumption?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXIMUMMEMORYCONSUMPTION() {
        return maximummemoryconsumption;
    }

    /**
     * ??maximummemoryconsumption?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXIMUMMEMORYCONSUMPTION(POSITIVEINTEGER value) {
        this.maximummemoryconsumption = value;
    }

    /**
     * ??minimummemoryconsumption?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMINIMUMMEMORYCONSUMPTION() {
        return minimummemoryconsumption;
    }

    /**
     * ??minimummemoryconsumption?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMINIMUMMEMORYCONSUMPTION(POSITIVEINTEGER value) {
        this.minimummemoryconsumption = value;
    }

    /**
     * ??testpattern?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getTESTPATTERN() {
        return testpattern;
    }

    /**
     * ??testpattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setTESTPATTERN(STRING value) {
        this.testpattern = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXECUTABLE-ENTITY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EXECUTABLEENTITYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected EXECUTABLEENTITYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link EXECUTABLEENTITYSUBTYPESENUM }
         *     
         */
        public EXECUTABLEENTITYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link EXECUTABLEENTITYSUBTYPESENUM }
         *     
         */
        public void setDEST(EXECUTABLEENTITYSUBTYPESENUM value) {
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
