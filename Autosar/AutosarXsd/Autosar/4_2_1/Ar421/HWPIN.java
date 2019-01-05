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
 * This meta-class represents the possibility to describe a hardware pin.
 * 
 * <p>HW-PIN complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HW-PIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HW-DESCRIPTION-ENTITY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HW-PIN"/>
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
@XmlType(name = "HW-PIN", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "hwtyperef",
    "hwcategoryrefs",
    "hwattributevalues",
    "pinnumber",
    "variationpoint"
})
public class HWPIN {

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
    @XmlElement(name = "HW-TYPE-REF")
    protected HWPIN.HWTYPEREF hwtyperef;
    @XmlElement(name = "HW-CATEGORY-REFS")
    protected HWPIN.HWCATEGORYREFS hwcategoryrefs;
    @XmlElement(name = "HW-ATTRIBUTE-VALUES")
    protected HWPIN.HWATTRIBUTEVALUES hwattributevalues;
    @XmlElement(name = "PIN-NUMBER")
    protected INTEGER pinnumber;
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
     * ??hwtyperef?????
     * 
     * @return
     *     possible object is
     *     {@link HWPIN.HWTYPEREF }
     *     
     */
    public HWPIN.HWTYPEREF getHWTYPEREF() {
        return hwtyperef;
    }

    /**
     * ??hwtyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWPIN.HWTYPEREF }
     *     
     */
    public void setHWTYPEREF(HWPIN.HWTYPEREF value) {
        this.hwtyperef = value;
    }

    /**
     * ??hwcategoryrefs?????
     * 
     * @return
     *     possible object is
     *     {@link HWPIN.HWCATEGORYREFS }
     *     
     */
    public HWPIN.HWCATEGORYREFS getHWCATEGORYREFS() {
        return hwcategoryrefs;
    }

    /**
     * ??hwcategoryrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWPIN.HWCATEGORYREFS }
     *     
     */
    public void setHWCATEGORYREFS(HWPIN.HWCATEGORYREFS value) {
        this.hwcategoryrefs = value;
    }

    /**
     * ??hwattributevalues?????
     * 
     * @return
     *     possible object is
     *     {@link HWPIN.HWATTRIBUTEVALUES }
     *     
     */
    public HWPIN.HWATTRIBUTEVALUES getHWATTRIBUTEVALUES() {
        return hwattributevalues;
    }

    /**
     * ??hwattributevalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWPIN.HWATTRIBUTEVALUES }
     *     
     */
    public void setHWATTRIBUTEVALUES(HWPIN.HWATTRIBUTEVALUES value) {
        this.hwattributevalues = value;
    }

    /**
     * ??pinnumber?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPINNUMBER() {
        return pinnumber;
    }

    /**
     * ??pinnumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPINNUMBER(INTEGER value) {
        this.pinnumber = value;
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
     *         &lt;element name="HW-ATTRIBUTE-VALUE" type="{http://autosar.org/schema/r4.0}HW-ATTRIBUTE-VALUE"/>
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
        "hwattributevalue"
    })
    public static class HWATTRIBUTEVALUES {

        @XmlElement(name = "HW-ATTRIBUTE-VALUE")
        protected List<HWATTRIBUTEVALUE> hwattributevalue;

        /**
         * Gets the value of the hwattributevalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwattributevalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWATTRIBUTEVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HWATTRIBUTEVALUE }
         * 
         * 
         */
        public List<HWATTRIBUTEVALUE> getHWATTRIBUTEVALUE() {
            if (hwattributevalue == null) {
                hwattributevalue = new ArrayList<HWATTRIBUTEVALUE>();
            }
            return this.hwattributevalue;
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
     *         &lt;element name="HW-CATEGORY-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-CATEGORY--SUBTYPES-ENUM" />
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
        "hwcategoryref"
    })
    public static class HWCATEGORYREFS {

        @XmlElement(name = "HW-CATEGORY-REF")
        protected List<HWPIN.HWCATEGORYREFS.HWCATEGORYREF> hwcategoryref;

        /**
         * Gets the value of the hwcategoryref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwcategoryref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWCATEGORYREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HWPIN.HWCATEGORYREFS.HWCATEGORYREF }
         * 
         * 
         */
        public List<HWPIN.HWCATEGORYREFS.HWCATEGORYREF> getHWCATEGORYREF() {
            if (hwcategoryref == null) {
                hwcategoryref = new ArrayList<HWPIN.HWCATEGORYREFS.HWCATEGORYREF>();
            }
            return this.hwcategoryref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-CATEGORY--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HWCATEGORYREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected HWCATEGORYSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link HWCATEGORYSUBTYPESENUM }
             *     
             */
            public HWCATEGORYSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link HWCATEGORYSUBTYPESENUM }
             *     
             */
            public void setDEST(HWCATEGORYSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}HW-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HWTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected HWTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link HWTYPESUBTYPESENUM }
         *     
         */
        public HWTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link HWTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(HWTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
