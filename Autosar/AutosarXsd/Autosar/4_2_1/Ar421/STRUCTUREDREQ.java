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
 * This represents a structured requirement. This is intended for a case where specific requirements for features are collected.
 * 
 * Note that this can be rendered as a labeled list.
 * 
 * <p>STRUCTURED-REQ complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="STRUCTURED-REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRACEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}STRUCTURED-REQ"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}PAGINATEABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}DOCUMENT-VIEW-SELECTABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRUCTURED-REQ", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "tracerefs",
    "date",
    "issuedby",
    "type",
    "importance",
    "description",
    "rationale",
    "dependencies",
    "usecase",
    "conflicts",
    "supportingmaterial",
    "remark",
    "testeditemrefs",
    "variationpoint"
})
public class STRUCTUREDREQ {

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
    @XmlElement(name = "TRACE-REFS")
    protected Ar421.AGECONSTRAINT.TRACEREFS tracerefs;
    @XmlElement(name = "DATE")
    protected DATE date;
    @XmlElement(name = "ISSUED-BY")
    protected STRING issuedby;
    @XmlElement(name = "TYPE")
    protected STRING type;
    @XmlElement(name = "IMPORTANCE")
    protected STRING importance;
    @XmlElement(name = "DESCRIPTION")
    protected DOCUMENTATIONBLOCK description;
    @XmlElement(name = "RATIONALE")
    protected DOCUMENTATIONBLOCK rationale;
    @XmlElement(name = "DEPENDENCIES")
    protected DOCUMENTATIONBLOCK dependencies;
    @XmlElement(name = "USE-CASE")
    protected DOCUMENTATIONBLOCK usecase;
    @XmlElement(name = "CONFLICTS")
    protected DOCUMENTATIONBLOCK conflicts;
    @XmlElement(name = "SUPPORTING-MATERIAL")
    protected DOCUMENTATIONBLOCK supportingmaterial;
    @XmlElement(name = "REMARK")
    protected DOCUMENTATIONBLOCK remark;
    @XmlElement(name = "TESTED-ITEM-REFS")
    protected STRUCTUREDREQ.TESTEDITEMREFS testeditemrefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "BREAK")
    protected CHAPTERENUMBREAKSIMPLE _break;
    @XmlAttribute(name = "KEEP-WITH-PREVIOUS")
    protected KEEPWITHPREVIOUSENUMSIMPLE keepwithprevious;
    @XmlAttribute(name = "SI")
    protected List<String> si;
    @XmlAttribute(name = "VIEW")
    protected String view;

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
     * ??tracerefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.AGECONSTRAINT.TRACEREFS }
     *     
     */
    public Ar421.AGECONSTRAINT.TRACEREFS getTRACEREFS() {
        return tracerefs;
    }

    /**
     * ??tracerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.AGECONSTRAINT.TRACEREFS }
     *     
     */
    public void setTRACEREFS(Ar421.AGECONSTRAINT.TRACEREFS value) {
        this.tracerefs = value;
    }

    /**
     * ??date?????
     * 
     * @return
     *     possible object is
     *     {@link DATE }
     *     
     */
    public DATE getDATE() {
        return date;
    }

    /**
     * ??date?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATE }
     *     
     */
    public void setDATE(DATE value) {
        this.date = value;
    }

    /**
     * ??issuedby?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getISSUEDBY() {
        return issuedby;
    }

    /**
     * ??issuedby?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setISSUEDBY(STRING value) {
        this.issuedby = value;
    }

    /**
     * ??type?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getTYPE() {
        return type;
    }

    /**
     * ??type?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setTYPE(STRING value) {
        this.type = value;
    }

    /**
     * ??importance?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getIMPORTANCE() {
        return importance;
    }

    /**
     * ??importance?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setIMPORTANCE(STRING value) {
        this.importance = value;
    }

    /**
     * ??description?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getDESCRIPTION() {
        return description;
    }

    /**
     * ??description?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setDESCRIPTION(DOCUMENTATIONBLOCK value) {
        this.description = value;
    }

    /**
     * ??rationale?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getRATIONALE() {
        return rationale;
    }

    /**
     * ??rationale?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setRATIONALE(DOCUMENTATIONBLOCK value) {
        this.rationale = value;
    }

    /**
     * ??dependencies?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getDEPENDENCIES() {
        return dependencies;
    }

    /**
     * ??dependencies?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setDEPENDENCIES(DOCUMENTATIONBLOCK value) {
        this.dependencies = value;
    }

    /**
     * ??usecase?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getUSECASE() {
        return usecase;
    }

    /**
     * ??usecase?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setUSECASE(DOCUMENTATIONBLOCK value) {
        this.usecase = value;
    }

    /**
     * ??conflicts?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getCONFLICTS() {
        return conflicts;
    }

    /**
     * ??conflicts?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setCONFLICTS(DOCUMENTATIONBLOCK value) {
        this.conflicts = value;
    }

    /**
     * ??supportingmaterial?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getSUPPORTINGMATERIAL() {
        return supportingmaterial;
    }

    /**
     * ??supportingmaterial?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setSUPPORTINGMATERIAL(DOCUMENTATIONBLOCK value) {
        this.supportingmaterial = value;
    }

    /**
     * ??remark?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getREMARK() {
        return remark;
    }

    /**
     * ??remark?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setREMARK(DOCUMENTATIONBLOCK value) {
        this.remark = value;
    }

    /**
     * ??testeditemrefs?????
     * 
     * @return
     *     possible object is
     *     {@link STRUCTUREDREQ.TESTEDITEMREFS }
     *     
     */
    public STRUCTUREDREQ.TESTEDITEMREFS getTESTEDITEMREFS() {
        return testeditemrefs;
    }

    /**
     * ??testeditemrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRUCTUREDREQ.TESTEDITEMREFS }
     *     
     */
    public void setTESTEDITEMREFS(STRUCTUREDREQ.TESTEDITEMREFS value) {
        this.testeditemrefs = value;
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
     * ??break?????
     * 
     * @return
     *     possible object is
     *     {@link CHAPTERENUMBREAKSIMPLE }
     *     
     */
    public CHAPTERENUMBREAKSIMPLE getBREAK() {
        return _break;
    }

    /**
     * ??break?????
     * 
     * @param value
     *     allowed object is
     *     {@link CHAPTERENUMBREAKSIMPLE }
     *     
     */
    public void setBREAK(CHAPTERENUMBREAKSIMPLE value) {
        this._break = value;
    }

    /**
     * ??keepwithprevious?????
     * 
     * @return
     *     possible object is
     *     {@link KEEPWITHPREVIOUSENUMSIMPLE }
     *     
     */
    public KEEPWITHPREVIOUSENUMSIMPLE getKEEPWITHPREVIOUS() {
        return keepwithprevious;
    }

    /**
     * ??keepwithprevious?????
     * 
     * @param value
     *     allowed object is
     *     {@link KEEPWITHPREVIOUSENUMSIMPLE }
     *     
     */
    public void setKEEPWITHPREVIOUS(KEEPWITHPREVIOUSENUMSIMPLE value) {
        this.keepwithprevious = value;
    }

    /**
     * Gets the value of the si property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the si property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSI() {
        if (si == null) {
            si = new ArrayList<String>();
        }
        return this.si;
    }

    /**
     * ??view?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIEW() {
        return view;
    }

    /**
     * ??view?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIEW(String value) {
        this.view = value;
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
     *         &lt;element name="TESTED-ITEM-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TRACEABLE--SUBTYPES-ENUM" />
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
        "testeditemref"
    })
    public static class TESTEDITEMREFS {

        @XmlElement(name = "TESTED-ITEM-REF")
        protected List<STRUCTUREDREQ.TESTEDITEMREFS.TESTEDITEMREF> testeditemref;

        /**
         * Gets the value of the testeditemref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the testeditemref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTESTEDITEMREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link STRUCTUREDREQ.TESTEDITEMREFS.TESTEDITEMREF }
         * 
         * 
         */
        public List<STRUCTUREDREQ.TESTEDITEMREFS.TESTEDITEMREF> getTESTEDITEMREF() {
            if (testeditemref == null) {
                testeditemref = new ArrayList<STRUCTUREDREQ.TESTEDITEMREFS.TESTEDITEMREF>();
            }
            return this.testeditemref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TRACEABLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TESTEDITEMREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected TRACEABLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link TRACEABLESUBTYPESENUM }
             *     
             */
            public TRACEABLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link TRACEABLESUBTYPESENUM }
             *     
             */
            public void setDEST(TRACEABLESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}