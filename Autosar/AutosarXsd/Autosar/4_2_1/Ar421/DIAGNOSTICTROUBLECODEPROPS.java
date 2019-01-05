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
 * This element defines common Dtc properties that can be reused by different non OBD-relevant DTCs.
 * 
 * <p>DIAGNOSTIC-TROUBLE-CODE-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-TROUBLE-CODE-PROPS">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-TROUBLE-CODE-PROPS"/>
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
@XmlType(name = "DIAGNOSTIC-TROUBLE-CODE-PROPS", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "agingref",
    "environmentcapturetoreporting",
    "extendeddatarecords",
    "fdcthresholdstoragevalue",
    "freezeframes",
    "freezeframecontentref",
    "immediatenvdatastorage",
    "maxnumberfreezeframerecords",
    "memorydestinationrefs",
    "priority",
    "significance"
})
public class DIAGNOSTICTROUBLECODEPROPS {

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
    @XmlElement(name = "AGING-REF")
    protected DIAGNOSTICTROUBLECODEPROPS.AGINGREF agingref;
    @XmlElement(name = "ENVIRONMENT-CAPTURE-TO-REPORTING")
    protected ENVIRONMENTCAPTURETOREPORTINGENUM environmentcapturetoreporting;
    @XmlElement(name = "EXTENDED-DATA-RECORDS")
    protected DIAGNOSTICTROUBLECODEPROPS.EXTENDEDDATARECORDS extendeddatarecords;
    @XmlElement(name = "FDC-THRESHOLD-STORAGE-VALUE")
    protected POSITIVEINTEGER fdcthresholdstoragevalue;
    @XmlElement(name = "FREEZE-FRAMES")
    protected DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMES freezeframes;
    @XmlElement(name = "FREEZE-FRAME-CONTENT-REF")
    protected DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMECONTENTREF freezeframecontentref;
    @XmlElement(name = "IMMEDIATE-NV-DATA-STORAGE")
    protected BOOLEAN immediatenvdatastorage;
    @XmlElement(name = "MAX-NUMBER-FREEZE-FRAME-RECORDS")
    protected POSITIVEINTEGER maxnumberfreezeframerecords;
    @XmlElement(name = "MEMORY-DESTINATION-REFS")
    protected DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS memorydestinationrefs;
    @XmlElement(name = "PRIORITY")
    protected POSITIVEINTEGER priority;
    @XmlElement(name = "SIGNIFICANCE")
    protected DIAGNOSTICSIGNIFICANCEENUM significance;
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
     * ??agingref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.AGINGREF }
     *     
     */
    public DIAGNOSTICTROUBLECODEPROPS.AGINGREF getAGINGREF() {
        return agingref;
    }

    /**
     * ??agingref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.AGINGREF }
     *     
     */
    public void setAGINGREF(DIAGNOSTICTROUBLECODEPROPS.AGINGREF value) {
        this.agingref = value;
    }

    /**
     * ??environmentcapturetoreporting?????
     * 
     * @return
     *     possible object is
     *     {@link ENVIRONMENTCAPTURETOREPORTINGENUM }
     *     
     */
    public ENVIRONMENTCAPTURETOREPORTINGENUM getENVIRONMENTCAPTURETOREPORTING() {
        return environmentcapturetoreporting;
    }

    /**
     * ??environmentcapturetoreporting?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENVIRONMENTCAPTURETOREPORTINGENUM }
     *     
     */
    public void setENVIRONMENTCAPTURETOREPORTING(ENVIRONMENTCAPTURETOREPORTINGENUM value) {
        this.environmentcapturetoreporting = value;
    }

    /**
     * ??extendeddatarecords?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.EXTENDEDDATARECORDS }
     *     
     */
    public DIAGNOSTICTROUBLECODEPROPS.EXTENDEDDATARECORDS getEXTENDEDDATARECORDS() {
        return extendeddatarecords;
    }

    /**
     * ??extendeddatarecords?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.EXTENDEDDATARECORDS }
     *     
     */
    public void setEXTENDEDDATARECORDS(DIAGNOSTICTROUBLECODEPROPS.EXTENDEDDATARECORDS value) {
        this.extendeddatarecords = value;
    }

    /**
     * ??fdcthresholdstoragevalue?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFDCTHRESHOLDSTORAGEVALUE() {
        return fdcthresholdstoragevalue;
    }

    /**
     * ??fdcthresholdstoragevalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFDCTHRESHOLDSTORAGEVALUE(POSITIVEINTEGER value) {
        this.fdcthresholdstoragevalue = value;
    }

    /**
     * ??freezeframes?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMES }
     *     
     */
    public DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMES getFREEZEFRAMES() {
        return freezeframes;
    }

    /**
     * ??freezeframes?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMES }
     *     
     */
    public void setFREEZEFRAMES(DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMES value) {
        this.freezeframes = value;
    }

    /**
     * ??freezeframecontentref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMECONTENTREF }
     *     
     */
    public DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMECONTENTREF getFREEZEFRAMECONTENTREF() {
        return freezeframecontentref;
    }

    /**
     * ??freezeframecontentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMECONTENTREF }
     *     
     */
    public void setFREEZEFRAMECONTENTREF(DIAGNOSTICTROUBLECODEPROPS.FREEZEFRAMECONTENTREF value) {
        this.freezeframecontentref = value;
    }

    /**
     * ??immediatenvdatastorage?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getIMMEDIATENVDATASTORAGE() {
        return immediatenvdatastorage;
    }

    /**
     * ??immediatenvdatastorage?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setIMMEDIATENVDATASTORAGE(BOOLEAN value) {
        this.immediatenvdatastorage = value;
    }

    /**
     * ??maxnumberfreezeframerecords?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXNUMBERFREEZEFRAMERECORDS() {
        return maxnumberfreezeframerecords;
    }

    /**
     * ??maxnumberfreezeframerecords?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXNUMBERFREEZEFRAMERECORDS(POSITIVEINTEGER value) {
        this.maxnumberfreezeframerecords = value;
    }

    /**
     * ??memorydestinationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS }
     *     
     */
    public DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS getMEMORYDESTINATIONREFS() {
        return memorydestinationrefs;
    }

    /**
     * ??memorydestinationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS }
     *     
     */
    public void setMEMORYDESTINATIONREFS(DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS value) {
        this.memorydestinationrefs = value;
    }

    /**
     * ??priority?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPRIORITY() {
        return priority;
    }

    /**
     * ??priority?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPRIORITY(POSITIVEINTEGER value) {
        this.priority = value;
    }

    /**
     * ??significance?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICSIGNIFICANCEENUM }
     *     
     */
    public DIAGNOSTICSIGNIFICANCEENUM getSIGNIFICANCE() {
        return significance;
    }

    /**
     * ??significance?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICSIGNIFICANCEENUM }
     *     
     */
    public void setSIGNIFICANCE(DIAGNOSTICSIGNIFICANCEENUM value) {
        this.significance = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-AGING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AGINGREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICAGINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICAGINGSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICAGINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICAGINGSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICAGINGSUBTYPESENUM value) {
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
     *         &lt;element name="DIAGNOSTIC-EXTENDED-DATA-RECORD-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EXTENDED-DATA-RECORD-REF-CONDITIONAL"/>
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
        "diagnosticextendeddatarecordrefconditional"
    })
    public static class EXTENDEDDATARECORDS {

        @XmlElement(name = "DIAGNOSTIC-EXTENDED-DATA-RECORD-REF-CONDITIONAL")
        protected List<DIAGNOSTICEXTENDEDDATARECORDREFCONDITIONAL> diagnosticextendeddatarecordrefconditional;

        /**
         * Gets the value of the diagnosticextendeddatarecordrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticextendeddatarecordrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICEXTENDEDDATARECORDREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICEXTENDEDDATARECORDREFCONDITIONAL }
         * 
         * 
         */
        public List<DIAGNOSTICEXTENDEDDATARECORDREFCONDITIONAL> getDIAGNOSTICEXTENDEDDATARECORDREFCONDITIONAL() {
            if (diagnosticextendeddatarecordrefconditional == null) {
                diagnosticextendeddatarecordrefconditional = new ArrayList<DIAGNOSTICEXTENDEDDATARECORDREFCONDITIONAL>();
            }
            return this.diagnosticextendeddatarecordrefconditional;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-IDENTIFIER-SET--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FREEZEFRAMECONTENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICDATAIDENTIFIERSETSUBTYPESENUM value) {
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
     *         &lt;element name="DIAGNOSTIC-FREEZE-FRAME-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-FREEZE-FRAME-REF-CONDITIONAL"/>
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
        "diagnosticfreezeframerefconditional"
    })
    public static class FREEZEFRAMES {

        @XmlElement(name = "DIAGNOSTIC-FREEZE-FRAME-REF-CONDITIONAL")
        protected List<DIAGNOSTICFREEZEFRAMEREFCONDITIONAL> diagnosticfreezeframerefconditional;

        /**
         * Gets the value of the diagnosticfreezeframerefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticfreezeframerefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICFREEZEFRAMEREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICFREEZEFRAMEREFCONDITIONAL }
         * 
         * 
         */
        public List<DIAGNOSTICFREEZEFRAMEREFCONDITIONAL> getDIAGNOSTICFREEZEFRAMEREFCONDITIONAL() {
            if (diagnosticfreezeframerefconditional == null) {
                diagnosticfreezeframerefconditional = new ArrayList<DIAGNOSTICFREEZEFRAMEREFCONDITIONAL>();
            }
            return this.diagnosticfreezeframerefconditional;
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
     *         &lt;element name="MEMORY-DESTINATION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-DESTINATION--SUBTYPES-ENUM" />
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
        "memorydestinationref"
    })
    public static class MEMORYDESTINATIONREFS {

        @XmlElement(name = "MEMORY-DESTINATION-REF")
        protected List<DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS.MEMORYDESTINATIONREF> memorydestinationref;

        /**
         * Gets the value of the memorydestinationref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memorydestinationref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEMORYDESTINATIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS.MEMORYDESTINATIONREF }
         * 
         * 
         */
        public List<DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS.MEMORYDESTINATIONREF> getMEMORYDESTINATIONREF() {
            if (memorydestinationref == null) {
                memorydestinationref = new ArrayList<DIAGNOSTICTROUBLECODEPROPS.MEMORYDESTINATIONREFS.MEMORYDESTINATIONREF>();
            }
            return this.memorydestinationref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-MEMORY-DESTINATION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MEMORYDESTINATIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM }
             *     
             */
            public DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM }
             *     
             */
            public void setDEST(DIAGNOSTICMEMORYDESTINATIONSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
