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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A TransformationTechnology is a transformer inside a transformer chain.
 * 
 * <p>TRANSFORMATION-TECHNOLOGY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TRANSFORMATION-TECHNOLOGY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSFORMATION-TECHNOLOGY"/>
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
@XmlType(name = "TRANSFORMATION-TECHNOLOGY", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "bufferproperties",
    "needsoriginaldata",
    "protocol",
    "transformationdescriptions",
    "transformerclass",
    "version",
    "variationpoint"
})
public class TRANSFORMATIONTECHNOLOGY {

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
    @XmlElement(name = "BUFFER-PROPERTIES")
    protected BUFFERPROPERTIES bufferproperties;
    @XmlElement(name = "NEEDS-ORIGINAL-DATA")
    protected BOOLEAN needsoriginaldata;
    @XmlElement(name = "PROTOCOL")
    protected STRING protocol;
    @XmlElement(name = "TRANSFORMATION-DESCRIPTIONS")
    protected TRANSFORMATIONTECHNOLOGY.TRANSFORMATIONDESCRIPTIONS transformationdescriptions;
    @XmlElement(name = "TRANSFORMER-CLASS")
    protected TRANSFORMERCLASSENUM transformerclass;
    @XmlElement(name = "VERSION")
    protected STRING version;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??bufferproperties?????
     * 
     * @return
     *     possible object is
     *     {@link BUFFERPROPERTIES }
     *     
     */
    public BUFFERPROPERTIES getBUFFERPROPERTIES() {
        return bufferproperties;
    }

    /**
     * ??bufferproperties?????
     * 
     * @param value
     *     allowed object is
     *     {@link BUFFERPROPERTIES }
     *     
     */
    public void setBUFFERPROPERTIES(BUFFERPROPERTIES value) {
        this.bufferproperties = value;
    }

    /**
     * ??needsoriginaldata?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNEEDSORIGINALDATA() {
        return needsoriginaldata;
    }

    /**
     * ??needsoriginaldata?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNEEDSORIGINALDATA(BOOLEAN value) {
        this.needsoriginaldata = value;
    }

    /**
     * ??protocol?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROTOCOL() {
        return protocol;
    }

    /**
     * ??protocol?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROTOCOL(STRING value) {
        this.protocol = value;
    }

    /**
     * ??transformationdescriptions?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSFORMATIONTECHNOLOGY.TRANSFORMATIONDESCRIPTIONS }
     *     
     */
    public TRANSFORMATIONTECHNOLOGY.TRANSFORMATIONDESCRIPTIONS getTRANSFORMATIONDESCRIPTIONS() {
        return transformationdescriptions;
    }

    /**
     * ??transformationdescriptions?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSFORMATIONTECHNOLOGY.TRANSFORMATIONDESCRIPTIONS }
     *     
     */
    public void setTRANSFORMATIONDESCRIPTIONS(TRANSFORMATIONTECHNOLOGY.TRANSFORMATIONDESCRIPTIONS value) {
        this.transformationdescriptions = value;
    }

    /**
     * ??transformerclass?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSFORMERCLASSENUM }
     *     
     */
    public TRANSFORMERCLASSENUM getTRANSFORMERCLASS() {
        return transformerclass;
    }

    /**
     * ??transformerclass?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSFORMERCLASSENUM }
     *     
     */
    public void setTRANSFORMERCLASS(TRANSFORMERCLASSENUM value) {
        this.transformerclass = value;
    }

    /**
     * ??version?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getVERSION() {
        return version;
    }

    /**
     * ??version?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setVERSION(STRING value) {
        this.version = value;
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
     *         &lt;element name="END-TO-END-TRANSFORMATION-DESCRIPTION" type="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-DESCRIPTION"/>
     *         &lt;element name="SOMEIP-TRANSFORMATION-DESCRIPTION" type="{http://autosar.org/schema/r4.0}SOMEIP-TRANSFORMATION-DESCRIPTION"/>
     *         &lt;element name="USER-DEFINED-TRANSFORMATION-DESCRIPTION" type="{http://autosar.org/schema/r4.0}USER-DEFINED-TRANSFORMATION-DESCRIPTION"/>
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
        "endtoendtransformationdescriptionOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION"
    })
    public static class TRANSFORMATIONDESCRIPTIONS {

        @XmlElements({
            @XmlElement(name = "END-TO-END-TRANSFORMATION-DESCRIPTION", type = ENDTOENDTRANSFORMATIONDESCRIPTION.class),
            @XmlElement(name = "SOMEIP-TRANSFORMATION-DESCRIPTION", type = SOMEIPTRANSFORMATIONDESCRIPTION.class),
            @XmlElement(name = "USER-DEFINED-TRANSFORMATION-DESCRIPTION", type = USERDEFINEDTRANSFORMATIONDESCRIPTION.class)
        })
        protected List<Object> endtoendtransformationdescriptionOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION;

        /**
         * Gets the value of the endtoendtransformationdescriptionOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendtransformationdescriptionOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDTRANSFORMATIONDESCRIPTIONOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDTRANSFORMATIONDESCRIPTION }
         * {@link SOMEIPTRANSFORMATIONDESCRIPTION }
         * {@link USERDEFINEDTRANSFORMATIONDESCRIPTION }
         * 
         * 
         */
        public List<Object> getENDTOENDTRANSFORMATIONDESCRIPTIONOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION() {
            if (endtoendtransformationdescriptionOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION == null) {
                endtoendtransformationdescriptionOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION = new ArrayList<Object>();
            }
            return this.endtoendtransformationdescriptionOrSOMEIPTRANSFORMATIONDESCRIPTIONOrUSERDEFINEDTRANSFORMATIONDESCRIPTION;
        }

    }

}
