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
 * This meta-class represents the ability to connect two hardware elements. 
 * The details of the connection can be refined by hwPinGroupConnection.
 * 
 * <p>HW-ELEMENT-CONNECTOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HW-ELEMENT-CONNECTOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DESCRIBABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HW-ELEMENT-CONNECTOR"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HW-ELEMENT-CONNECTOR", propOrder = {
    "desc",
    "category",
    "introduction",
    "admindata",
    "hwelementrefs",
    "hwpingroupconnections",
    "hwpinconnections",
    "variationpoint"
})
public class HWELEMENTCONNECTOR {

    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "HW-ELEMENT-REFS")
    protected HWELEMENTCONNECTOR.HWELEMENTREFS hwelementrefs;
    @XmlElement(name = "HW-PIN-GROUP-CONNECTIONS")
    protected HWELEMENTCONNECTOR.HWPINGROUPCONNECTIONS hwpingroupconnections;
    @XmlElement(name = "HW-PIN-CONNECTIONS")
    protected HWELEMENTCONNECTOR.HWPINCONNECTIONS hwpinconnections;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??hwelementrefs?????
     * 
     * @return
     *     possible object is
     *     {@link HWELEMENTCONNECTOR.HWELEMENTREFS }
     *     
     */
    public HWELEMENTCONNECTOR.HWELEMENTREFS getHWELEMENTREFS() {
        return hwelementrefs;
    }

    /**
     * ??hwelementrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWELEMENTCONNECTOR.HWELEMENTREFS }
     *     
     */
    public void setHWELEMENTREFS(HWELEMENTCONNECTOR.HWELEMENTREFS value) {
        this.hwelementrefs = value;
    }

    /**
     * ??hwpingroupconnections?????
     * 
     * @return
     *     possible object is
     *     {@link HWELEMENTCONNECTOR.HWPINGROUPCONNECTIONS }
     *     
     */
    public HWELEMENTCONNECTOR.HWPINGROUPCONNECTIONS getHWPINGROUPCONNECTIONS() {
        return hwpingroupconnections;
    }

    /**
     * ??hwpingroupconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWELEMENTCONNECTOR.HWPINGROUPCONNECTIONS }
     *     
     */
    public void setHWPINGROUPCONNECTIONS(HWELEMENTCONNECTOR.HWPINGROUPCONNECTIONS value) {
        this.hwpingroupconnections = value;
    }

    /**
     * ??hwpinconnections?????
     * 
     * @return
     *     possible object is
     *     {@link HWELEMENTCONNECTOR.HWPINCONNECTIONS }
     *     
     */
    public HWELEMENTCONNECTOR.HWPINCONNECTIONS getHWPINCONNECTIONS() {
        return hwpinconnections;
    }

    /**
     * ??hwpinconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link HWELEMENTCONNECTOR.HWPINCONNECTIONS }
     *     
     */
    public void setHWPINCONNECTIONS(HWELEMENTCONNECTOR.HWPINCONNECTIONS value) {
        this.hwpinconnections = value;
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="2" minOccurs="0">
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
        protected List<HWELEMENTCONNECTOR.HWELEMENTREFS.HWELEMENTREF> hwelementref;

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
         * {@link HWELEMENTCONNECTOR.HWELEMENTREFS.HWELEMENTREF }
         * 
         * 
         */
        public List<HWELEMENTCONNECTOR.HWELEMENTREFS.HWELEMENTREF> getHWELEMENTREF() {
            if (hwelementref == null) {
                hwelementref = new ArrayList<HWELEMENTCONNECTOR.HWELEMENTREFS.HWELEMENTREF>();
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
     *         &lt;element name="HW-PIN-CONNECTOR" type="{http://autosar.org/schema/r4.0}HW-PIN-CONNECTOR"/>
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
        "hwpinconnector"
    })
    public static class HWPINCONNECTIONS {

        @XmlElement(name = "HW-PIN-CONNECTOR")
        protected List<HWPINCONNECTOR> hwpinconnector;

        /**
         * Gets the value of the hwpinconnector property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwpinconnector property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWPINCONNECTOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HWPINCONNECTOR }
         * 
         * 
         */
        public List<HWPINCONNECTOR> getHWPINCONNECTOR() {
            if (hwpinconnector == null) {
                hwpinconnector = new ArrayList<HWPINCONNECTOR>();
            }
            return this.hwpinconnector;
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
     *         &lt;element name="HW-PIN-GROUP-CONNECTOR" type="{http://autosar.org/schema/r4.0}HW-PIN-GROUP-CONNECTOR"/>
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
        "hwpingroupconnector"
    })
    public static class HWPINGROUPCONNECTIONS {

        @XmlElement(name = "HW-PIN-GROUP-CONNECTOR")
        protected List<HWPINGROUPCONNECTOR> hwpingroupconnector;

        /**
         * Gets the value of the hwpingroupconnector property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hwpingroupconnector property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHWPINGROUPCONNECTOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HWPINGROUPCONNECTOR }
         * 
         * 
         */
        public List<HWPINGROUPCONNECTOR> getHWPINGROUPCONNECTOR() {
            if (hwpingroupconnector == null) {
                hwpingroupconnector = new ArrayList<HWPINGROUPCONNECTOR>();
            }
            return this.hwpingroupconnector;
        }

    }

}
