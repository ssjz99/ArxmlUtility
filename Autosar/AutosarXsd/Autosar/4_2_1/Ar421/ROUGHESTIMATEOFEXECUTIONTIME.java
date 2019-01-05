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
 * Provides a description of a rough estimate on the ExecutionTime.
 * 
 * <p>ROUGH-ESTIMATE-OF-EXECUTION-TIME complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ROUGH-ESTIMATE-OF-EXECUTION-TIME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXECUTION-TIME"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ROUGH-ESTIMATE-OF-EXECUTION-TIME"/>
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
@XmlType(name = "ROUGH-ESTIMATE-OF-EXECUTION-TIME", propOrder = {
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
    "additionalinformation",
    "estimatedexecutiontime"
})
public class ROUGHESTIMATEOFEXECUTIONTIME {

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
    protected ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF exclusivearearef;
    @XmlElement(name = "EXECUTABLE-ENTITY-REF")
    protected ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF executableentityref;
    @XmlElement(name = "HARDWARE-CONFIGURATION")
    protected HARDWARECONFIGURATION hardwareconfiguration;
    @XmlElement(name = "HW-ELEMENT-REF")
    protected ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF hwelementref;
    @XmlElement(name = "INCLUDED-LIBRARY-REFS")
    protected ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS includedlibraryrefs;
    @XmlElement(name = "MEMORY-SECTION-LOCATIONS")
    protected ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS memorysectionlocations;
    @XmlElement(name = "SOFTWARE-CONTEXT")
    protected SOFTWARECONTEXT softwarecontext;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "ADDITIONAL-INFORMATION")
    protected STRING additionalinformation;
    @XmlElement(name = "ESTIMATED-EXECUTION-TIME")
    protected MULTIDIMENSIONALTIME estimatedexecutiontime;
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
     * ??exclusivearearef?????
     * 
     * @return
     *     possible object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF }
     *     
     */
    public ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF getEXCLUSIVEAREAREF() {
        return exclusivearearef;
    }

    /**
     * ??exclusivearearef?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF }
     *     
     */
    public void setEXCLUSIVEAREAREF(ROUGHESTIMATEOFEXECUTIONTIME.EXCLUSIVEAREAREF value) {
        this.exclusivearearef = value;
    }

    /**
     * ??executableentityref?????
     * 
     * @return
     *     possible object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF }
     *     
     */
    public ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF getEXECUTABLEENTITYREF() {
        return executableentityref;
    }

    /**
     * ??executableentityref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF }
     *     
     */
    public void setEXECUTABLEENTITYREF(ROUGHESTIMATEOFEXECUTIONTIME.EXECUTABLEENTITYREF value) {
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
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF }
     *     
     */
    public ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF getHWELEMENTREF() {
        return hwelementref;
    }

    /**
     * ??hwelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF }
     *     
     */
    public void setHWELEMENTREF(ROUGHESTIMATEOFEXECUTIONTIME.HWELEMENTREF value) {
        this.hwelementref = value;
    }

    /**
     * ??includedlibraryrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS }
     *     
     */
    public ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS getINCLUDEDLIBRARYREFS() {
        return includedlibraryrefs;
    }

    /**
     * ??includedlibraryrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS }
     *     
     */
    public void setINCLUDEDLIBRARYREFS(ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS value) {
        this.includedlibraryrefs = value;
    }

    /**
     * ??memorysectionlocations?????
     * 
     * @return
     *     possible object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS }
     *     
     */
    public ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS getMEMORYSECTIONLOCATIONS() {
        return memorysectionlocations;
    }

    /**
     * ??memorysectionlocations?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS }
     *     
     */
    public void setMEMORYSECTIONLOCATIONS(ROUGHESTIMATEOFEXECUTIONTIME.MEMORYSECTIONLOCATIONS value) {
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
     * ??additionalinformation?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getADDITIONALINFORMATION() {
        return additionalinformation;
    }

    /**
     * ??additionalinformation?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setADDITIONALINFORMATION(STRING value) {
        this.additionalinformation = value;
    }

    /**
     * ??estimatedexecutiontime?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getESTIMATEDEXECUTIONTIME() {
        return estimatedexecutiontime;
    }

    /**
     * ??estimatedexecutiontime?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setESTIMATEDEXECUTIONTIME(MULTIDIMENSIONALTIME value) {
        this.estimatedexecutiontime = value;
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EXCLUSIVEAREAREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected EXCLUSIVEAREASUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link EXCLUSIVEAREASUBTYPESENUM }
         *     
         */
        public EXCLUSIVEAREASUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link EXCLUSIVEAREASUBTYPESENUM }
         *     
         */
        public void setDEST(EXCLUSIVEAREASUBTYPESENUM value) {
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
     *         &lt;element name="INCLUDED-LIBRARY-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DEPENDENCY-ON-ARTIFACT--SUBTYPES-ENUM" />
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
        "includedlibraryref"
    })
    public static class INCLUDEDLIBRARYREFS {

        @XmlElement(name = "INCLUDED-LIBRARY-REF")
        protected List<ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS.INCLUDEDLIBRARYREF> includedlibraryref;

        /**
         * Gets the value of the includedlibraryref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includedlibraryref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCLUDEDLIBRARYREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS.INCLUDEDLIBRARYREF }
         * 
         * 
         */
        public List<ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS.INCLUDEDLIBRARYREF> getINCLUDEDLIBRARYREF() {
            if (includedlibraryref == null) {
                includedlibraryref = new ArrayList<ROUGHESTIMATEOFEXECUTIONTIME.INCLUDEDLIBRARYREFS.INCLUDEDLIBRARYREF>();
            }
            return this.includedlibraryref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DEPENDENCY-ON-ARTIFACT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class INCLUDEDLIBRARYREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected DEPENDENCYONARTIFACTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link DEPENDENCYONARTIFACTSUBTYPESENUM }
             *     
             */
            public DEPENDENCYONARTIFACTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link DEPENDENCYONARTIFACTSUBTYPESENUM }
             *     
             */
            public void setDEST(DEPENDENCYONARTIFACTSUBTYPESENUM value) {
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
     *         &lt;element name="MEMORY-SECTION-LOCATION" type="{http://autosar.org/schema/r4.0}MEMORY-SECTION-LOCATION"/>
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
        "memorysectionlocation"
    })
    public static class MEMORYSECTIONLOCATIONS {

        @XmlElement(name = "MEMORY-SECTION-LOCATION")
        protected List<MEMORYSECTIONLOCATION> memorysectionlocation;

        /**
         * Gets the value of the memorysectionlocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memorysectionlocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEMORYSECTIONLOCATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEMORYSECTIONLOCATION }
         * 
         * 
         */
        public List<MEMORYSECTIONLOCATION> getMEMORYSECTIONLOCATION() {
            if (memorysectionlocation == null) {
                memorysectionlocation = new ArrayList<MEMORYSECTIONLOCATION>();
            }
            return this.memorysectionlocation;
        }

    }

}
