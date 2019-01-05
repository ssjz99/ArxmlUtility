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
 * This represents the ability to describe Hardware Elements on an instance level. The particular types of hardware are distinguished by the category. This category determines the applicable attributes. The possible categories and attributes are defined in HwCategory.
 * 
 * <p>HW-ELEMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HW-ELEMENT">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HW-DESCRIPTION-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HW-ELEMENT"/>
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
@XmlType(name = "HW-ELEMENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "hwtyperef",
    "hwcategoryrefs",
    "hwattributevalues",
    "nestedelements",
    "hwpingroups",
    "hwelementconnections"
})
public class HWELEMENT {

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
    @XmlElement(name = "HW-TYPE-REF")
    protected Ar421.HWPIN.HWTYPEREF hwtyperef;
    @XmlElement(name = "HW-CATEGORY-REFS")
    protected Ar421.HWPIN.HWCATEGORYREFS hwcategoryrefs;
    @XmlElement(name = "HW-ATTRIBUTE-VALUES")
    protected Ar421.HWPIN.HWATTRIBUTEVALUES hwattributevalues;
    @XmlElement(name = "NESTED-ELEMENTS")
    protected HWELEMENT.NESTEDELEMENTS nestedelements;
    @XmlElement(name = "HW-PIN-GROUPS")
    protected HWELEMENT.HWPINGROUPS hwpingroups;
    @XmlElement(name = "HW-ELEMENT-CONNECTIONS")
    protected HWELEMENT.HWELEMENTCONNECTIONS hwelementconnections;
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
     * ??hwtyperef?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.HWPIN.HWTYPEREF }
     *     
     */
    public Ar421.HWPIN.HWTYPEREF getHWTYPEREF() {
        return hwtyperef;
    }

    /**
     * ??hwtyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.HWPIN.HWTYPEREF }
     *     
     */
    public void setHWTYPEREF(Ar421.HWPIN.HWTYPEREF value) {
        this.hwtyperef = value;
    }

    /**
     * ??hwcategoryrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.HWPIN.HWCATEGORYREFS }
     *     
     */
    public Ar421.HWPIN.HWCATEGORYREFS getHWCATEGORYREFS() {
        return hwcategoryrefs;
    }

    /**
     * ??hwcategoryrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.HWPIN.HWCATEGORYREFS }
     *     
     */
    public void setHWCATEGORYREFS(Ar421.HWPIN.HWCATEGORYREFS value) {
        this.hwcategoryrefs = value;
    }

    /**
     * ??hwattributevalues?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.HWPIN.HWATTRIBUTEVALUES }
     *     
     */
    public Ar421.HWPIN.HWATTRIBUTEVALUES getHWATTRIBUTEVALUES() {
        return hwattributevalues;
    }

    /**
     * ??hwattributevalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.HWPIN.HWATTRIBUTEVALUES }
     *     
     */
    public void setHWATTRIBUTEVALUES(Ar421.HWPIN.HWATTRIBUTEVALUES value) {
        this.hwattributevalues = value;
    }

    /**
     * ??nestedelements?????
     * 
     * @return
     *     possible object is
     *     {@link HWELEMENT.NESTEDELEMENTS }
     *     
     */
    public HWELEMENT.NESTEDELEMENTS getNESTEDELEMENTS() {
        return nestedelements;
    }

    /**
     * ??nestedelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWELEMENT.NESTEDELEMENTS }
     *     
     */
    public void setNESTEDELEMENTS(HWELEMENT.NESTEDELEMENTS value) {
        this.nestedelements = value;
    }

    /**
     * ??hwpingroups?????
     * 
     * @return
     *     possible object is
     *     {@link HWELEMENT.HWPINGROUPS }
     *     
     */
    public HWELEMENT.HWPINGROUPS getHWPINGROUPS() {
        return hwpingroups;
    }

    /**
     * ??hwpingroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWELEMENT.HWPINGROUPS }
     *     
     */
    public void setHWPINGROUPS(HWELEMENT.HWPINGROUPS value) {
        this.hwpingroups = value;
    }

    /**
     * ??hwelementconnections?????
     * 
     * @return
     *     possible object is
     *     {@link HWELEMENT.HWELEMENTCONNECTIONS }
     *     
     */
    public HWELEMENT.HWELEMENTCONNECTIONS getHWELEMENTCONNECTIONS() {
        return hwelementconnections;
    }

    /**
     * ??hwelementconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWELEMENT.HWELEMENTCONNECTIONS }
     *     
     */
    public void setHWELEMENTCONNECTIONS(HWELEMENT.HWELEMENTCONNECTIONS value) {
        this.hwelementconnections = value;
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
     *         &lt;element name="HW-ELEMENT-CONNECTOR" type="{http://autosar.org/schema/r4.0}HW-ELEMENT-CONNECTOR"/>
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
        "hwelementconnector"
    })
    public static class HWELEMENTCONNECTIONS {

        @XmlElement(name = "HW-ELEMENT-CONNECTOR")
        protected List<HWELEMENTCONNECTOR> hwelementconnector;

        /**
         * Gets the value of the hwelementconnector property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwelementconnector property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWELEMENTCONNECTOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HWELEMENTCONNECTOR }
         * 
         * 
         */
        public List<HWELEMENTCONNECTOR> getHWELEMENTCONNECTOR() {
            if (hwelementconnector == null) {
                hwelementconnector = new ArrayList<HWELEMENTCONNECTOR>();
            }
            return this.hwelementconnector;
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
     *         &lt;element name="HW-PIN-GROUP" type="{http://autosar.org/schema/r4.0}HW-PIN-GROUP"/>
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
        "hwpingroup"
    })
    public static class HWPINGROUPS {

        @XmlElement(name = "HW-PIN-GROUP")
        protected List<HWPINGROUP> hwpingroup;

        /**
         * Gets the value of the hwpingroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwpingroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWPINGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HWPINGROUP }
         * 
         * 
         */
        public List<HWPINGROUP> getHWPINGROUP() {
            if (hwpingroup == null) {
                hwpingroup = new ArrayList<HWPINGROUP>();
            }
            return this.hwpingroup;
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
     *         &lt;element name="HW-ELEMENT-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}HW-ELEMENT-REF-CONDITIONAL"/>
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
        "hwelementrefconditional"
    })
    public static class NESTEDELEMENTS {

        @XmlElement(name = "HW-ELEMENT-REF-CONDITIONAL")
        protected List<HWELEMENTREFCONDITIONAL> hwelementrefconditional;

        /**
         * Gets the value of the hwelementrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwelementrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWELEMENTREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HWELEMENTREFCONDITIONAL }
         * 
         * 
         */
        public List<HWELEMENTREFCONDITIONAL> getHWELEMENTREFCONDITIONAL() {
            if (hwelementrefconditional == null) {
                hwelementrefconditional = new ArrayList<HWELEMENTREFCONDITIONAL>();
            }
            return this.hwelementrefconditional;
        }

    }

}
