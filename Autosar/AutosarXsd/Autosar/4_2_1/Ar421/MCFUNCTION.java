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
 * Represents a functional element to be used as input to support measurement and calibration. It is used to
 * * assign calibration parameters to a logical function
 * * assign measurement variables to a logical function
 * * structure functions hierarchically
 * 
 * <p>MC-FUNCTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-FUNCTION">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-FUNCTION"/>
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
@XmlType(name = "MC-FUNCTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "defcalprmset",
    "refcalprmset",
    "inmeasurementset",
    "outmeasurmentset",
    "locmeasurementset",
    "outmeasurementset",
    "subfunctionrefs"
})
public class MCFUNCTION {

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
    @XmlElement(name = "DEF-CALPRM-SET")
    protected MCFUNCTIONDATAREFSET defcalprmset;
    @XmlElement(name = "REF-CALPRM-SET")
    protected MCFUNCTIONDATAREFSET refcalprmset;
    @XmlElement(name = "IN-MEASUREMENT-SET")
    protected MCFUNCTIONDATAREFSET inmeasurementset;
    @XmlElement(name = "OUT-MEASURMENT-SET")
    protected MCFUNCTIONDATAREFSET outmeasurmentset;
    @XmlElement(name = "LOC-MEASUREMENT-SET")
    protected MCFUNCTIONDATAREFSET locmeasurementset;
    @XmlElement(name = "OUT-MEASUREMENT-SET")
    protected MCFUNCTIONDATAREFSET outmeasurementset;
    @XmlElement(name = "SUB-FUNCTION-REFS")
    protected MCFUNCTION.SUBFUNCTIONREFS subfunctionrefs;
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
     * ??defcalprmset?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public MCFUNCTIONDATAREFSET getDEFCALPRMSET() {
        return defcalprmset;
    }

    /**
     * ??defcalprmset?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public void setDEFCALPRMSET(MCFUNCTIONDATAREFSET value) {
        this.defcalprmset = value;
    }

    /**
     * ??refcalprmset?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public MCFUNCTIONDATAREFSET getREFCALPRMSET() {
        return refcalprmset;
    }

    /**
     * ??refcalprmset?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public void setREFCALPRMSET(MCFUNCTIONDATAREFSET value) {
        this.refcalprmset = value;
    }

    /**
     * ??inmeasurementset?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public MCFUNCTIONDATAREFSET getINMEASUREMENTSET() {
        return inmeasurementset;
    }

    /**
     * ??inmeasurementset?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public void setINMEASUREMENTSET(MCFUNCTIONDATAREFSET value) {
        this.inmeasurementset = value;
    }

    /**
     * ??outmeasurmentset?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public MCFUNCTIONDATAREFSET getOUTMEASURMENTSET() {
        return outmeasurmentset;
    }

    /**
     * ??outmeasurmentset?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public void setOUTMEASURMENTSET(MCFUNCTIONDATAREFSET value) {
        this.outmeasurmentset = value;
    }

    /**
     * ??locmeasurementset?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public MCFUNCTIONDATAREFSET getLOCMEASUREMENTSET() {
        return locmeasurementset;
    }

    /**
     * ??locmeasurementset?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public void setLOCMEASUREMENTSET(MCFUNCTIONDATAREFSET value) {
        this.locmeasurementset = value;
    }

    /**
     * ??outmeasurementset?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public MCFUNCTIONDATAREFSET getOUTMEASUREMENTSET() {
        return outmeasurementset;
    }

    /**
     * ??outmeasurementset?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSET }
     *     
     */
    public void setOUTMEASUREMENTSET(MCFUNCTIONDATAREFSET value) {
        this.outmeasurementset = value;
    }

    /**
     * ??subfunctionrefs?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTION.SUBFUNCTIONREFS }
     *     
     */
    public MCFUNCTION.SUBFUNCTIONREFS getSUBFUNCTIONREFS() {
        return subfunctionrefs;
    }

    /**
     * ??subfunctionrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTION.SUBFUNCTIONREFS }
     *     
     */
    public void setSUBFUNCTIONREFS(MCFUNCTION.SUBFUNCTIONREFS value) {
        this.subfunctionrefs = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SUB-FUNCTION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-FUNCTION--SUBTYPES-ENUM" />
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
        "subfunctionref"
    })
    public static class SUBFUNCTIONREFS {

        @XmlElement(name = "SUB-FUNCTION-REF")
        protected List<MCFUNCTION.SUBFUNCTIONREFS.SUBFUNCTIONREF> subfunctionref;

        /**
         * Gets the value of the subfunctionref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subfunctionref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUBFUNCTIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCFUNCTION.SUBFUNCTIONREFS.SUBFUNCTIONREF }
         * 
         * 
         */
        public List<MCFUNCTION.SUBFUNCTIONREFS.SUBFUNCTIONREF> getSUBFUNCTIONREF() {
            if (subfunctionref == null) {
                subfunctionref = new ArrayList<MCFUNCTION.SUBFUNCTIONREFS.SUBFUNCTIONREF>();
            }
            return this.subfunctionref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-FUNCTION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SUBFUNCTIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected MCFUNCTIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link MCFUNCTIONSUBTYPESENUM }
             *     
             */
            public MCFUNCTIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link MCFUNCTIONSUBTYPESENUM }
             *     
             */
            public void setDEST(MCFUNCTIONSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
