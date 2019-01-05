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
 * This meta-class represents the ability to describe a particular end to end protection.
 * 
 * <p>END-TO-END-PROTECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="END-TO-END-PROTECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}END-TO-END-PROTECTION"/>
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
@XmlType(name = "END-TO-END-PROTECTION", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "endtoendprofile",
    "endtoendprotectionisignalipdus",
    "endtoendprotectionvariableprototypes",
    "variationpoint"
})
public class ENDTOENDPROTECTION {

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
    @XmlElement(name = "END-TO-END-PROFILE")
    protected ENDTOENDDESCRIPTION endtoendprofile;
    @XmlElement(name = "END-TO-END-PROTECTION-I-SIGNAL-I-PDUS")
    protected ENDTOENDPROTECTION.ENDTOENDPROTECTIONISIGNALIPDUS endtoendprotectionisignalipdus;
    @XmlElement(name = "END-TO-END-PROTECTION-VARIABLE-PROTOTYPES")
    protected ENDTOENDPROTECTION.ENDTOENDPROTECTIONVARIABLEPROTOTYPES endtoendprotectionvariableprototypes;
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
     * ??endtoendprofile?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDDESCRIPTION }
     *     
     */
    public ENDTOENDDESCRIPTION getENDTOENDPROFILE() {
        return endtoendprofile;
    }

    /**
     * ??endtoendprofile?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDDESCRIPTION }
     *     
     */
    public void setENDTOENDPROFILE(ENDTOENDDESCRIPTION value) {
        this.endtoendprofile = value;
    }

    /**
     * ??endtoendprotectionisignalipdus?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDPROTECTION.ENDTOENDPROTECTIONISIGNALIPDUS }
     *     
     */
    public ENDTOENDPROTECTION.ENDTOENDPROTECTIONISIGNALIPDUS getENDTOENDPROTECTIONISIGNALIPDUS() {
        return endtoendprotectionisignalipdus;
    }

    /**
     * ??endtoendprotectionisignalipdus?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDPROTECTION.ENDTOENDPROTECTIONISIGNALIPDUS }
     *     
     */
    public void setENDTOENDPROTECTIONISIGNALIPDUS(ENDTOENDPROTECTION.ENDTOENDPROTECTIONISIGNALIPDUS value) {
        this.endtoendprotectionisignalipdus = value;
    }

    /**
     * ??endtoendprotectionvariableprototypes?????
     * 
     * @return
     *     possible object is
     *     {@link ENDTOENDPROTECTION.ENDTOENDPROTECTIONVARIABLEPROTOTYPES }
     *     
     */
    public ENDTOENDPROTECTION.ENDTOENDPROTECTIONVARIABLEPROTOTYPES getENDTOENDPROTECTIONVARIABLEPROTOTYPES() {
        return endtoendprotectionvariableprototypes;
    }

    /**
     * ??endtoendprotectionvariableprototypes?????
     * 
     * @param value
     *     allowed object is
     *     {@link ENDTOENDPROTECTION.ENDTOENDPROTECTIONVARIABLEPROTOTYPES }
     *     
     */
    public void setENDTOENDPROTECTIONVARIABLEPROTOTYPES(ENDTOENDPROTECTION.ENDTOENDPROTECTIONVARIABLEPROTOTYPES value) {
        this.endtoendprotectionvariableprototypes = value;
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
     *         &lt;element name="END-TO-END-PROTECTION-I-SIGNAL-I-PDU" type="{http://autosar.org/schema/r4.0}END-TO-END-PROTECTION-I-SIGNAL-I-PDU"/>
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
        "endtoendprotectionisignalipdu"
    })
    public static class ENDTOENDPROTECTIONISIGNALIPDUS {

        @XmlElement(name = "END-TO-END-PROTECTION-I-SIGNAL-I-PDU")
        protected List<ENDTOENDPROTECTIONISIGNALIPDU> endtoendprotectionisignalipdu;

        /**
         * Gets the value of the endtoendprotectionisignalipdu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendprotectionisignalipdu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDPROTECTIONISIGNALIPDU().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDPROTECTIONISIGNALIPDU }
         * 
         * 
         */
        public List<ENDTOENDPROTECTIONISIGNALIPDU> getENDTOENDPROTECTIONISIGNALIPDU() {
            if (endtoendprotectionisignalipdu == null) {
                endtoendprotectionisignalipdu = new ArrayList<ENDTOENDPROTECTIONISIGNALIPDU>();
            }
            return this.endtoendprotectionisignalipdu;
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
     *         &lt;element name="END-TO-END-PROTECTION-VARIABLE-PROTOTYPE" type="{http://autosar.org/schema/r4.0}END-TO-END-PROTECTION-VARIABLE-PROTOTYPE"/>
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
        "endtoendprotectionvariableprototype"
    })
    public static class ENDTOENDPROTECTIONVARIABLEPROTOTYPES {

        @XmlElement(name = "END-TO-END-PROTECTION-VARIABLE-PROTOTYPE")
        protected List<ENDTOENDPROTECTIONVARIABLEPROTOTYPE> endtoendprotectionvariableprototype;

        /**
         * Gets the value of the endtoendprotectionvariableprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendprotectionvariableprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDPROTECTIONVARIABLEPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDPROTECTIONVARIABLEPROTOTYPE }
         * 
         * 
         */
        public List<ENDTOENDPROTECTIONVARIABLEPROTOTYPE> getENDTOENDPROTECTIONVARIABLEPROTOTYPE() {
            if (endtoendprotectionvariableprototype == null) {
                endtoendprotectionvariableprototype = new ArrayList<ENDTOENDPROTECTIONVARIABLEPROTOTYPE>();
            }
            return this.endtoendprotectionvariableprototype;
        }

    }

}
