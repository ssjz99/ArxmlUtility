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
 * FlexRay attributes that are valid for each of the referenced (coupled) FlexRay clusters.
 * 
 * <p>FLEXRAY-NM-CLUSTER-COUPLING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-NM-CLUSTER-COUPLING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-CLUSTER-COUPLING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-NM-CLUSTER-COUPLING"/>
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
@XmlType(name = "FLEXRAY-NM-CLUSTER-COUPLING", propOrder = {
    "variationpoint",
    "coupledclusterrefs",
    "nmcontrolbitvectorenabled",
    "nmdatadisabled",
    "nmschedulevariant"
})
public class FLEXRAYNMCLUSTERCOUPLING {

    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "COUPLED-CLUSTER-REFS")
    protected FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS coupledclusterrefs;
    @XmlElement(name = "NM-CONTROL-BIT-VECTOR-ENABLED")
    protected BOOLEAN nmcontrolbitvectorenabled;
    @XmlElement(name = "NM-DATA-DISABLED")
    protected BOOLEAN nmdatadisabled;
    @XmlElement(name = "NM-SCHEDULE-VARIANT")
    protected FLEXRAYNMSCHEDULEVARIANT nmschedulevariant;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??coupledclusterrefs?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS }
     *     
     */
    public FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS getCOUPLEDCLUSTERREFS() {
        return coupledclusterrefs;
    }

    /**
     * ??coupledclusterrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS }
     *     
     */
    public void setCOUPLEDCLUSTERREFS(FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS value) {
        this.coupledclusterrefs = value;
    }

    /**
     * ??nmcontrolbitvectorenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCONTROLBITVECTORENABLED() {
        return nmcontrolbitvectorenabled;
    }

    /**
     * ??nmcontrolbitvectorenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCONTROLBITVECTORENABLED(BOOLEAN value) {
        this.nmcontrolbitvectorenabled = value;
    }

    /**
     * ??nmdatadisabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMDATADISABLED() {
        return nmdatadisabled;
    }

    /**
     * ??nmdatadisabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMDATADISABLED(BOOLEAN value) {
        this.nmdatadisabled = value;
    }

    /**
     * ??nmschedulevariant?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYNMSCHEDULEVARIANT }
     *     
     */
    public FLEXRAYNMSCHEDULEVARIANT getNMSCHEDULEVARIANT() {
        return nmschedulevariant;
    }

    /**
     * ??nmschedulevariant?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYNMSCHEDULEVARIANT }
     *     
     */
    public void setNMSCHEDULEVARIANT(FLEXRAYNMSCHEDULEVARIANT value) {
        this.nmschedulevariant = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="COUPLED-CLUSTER-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-NM-CLUSTER--SUBTYPES-ENUM" />
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
        "coupledclusterref"
    })
    public static class COUPLEDCLUSTERREFS {

        @XmlElement(name = "COUPLED-CLUSTER-REF")
        protected List<FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF> coupledclusterref;

        /**
         * Gets the value of the coupledclusterref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coupledclusterref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUPLEDCLUSTERREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF }
         * 
         * 
         */
        public List<FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF> getCOUPLEDCLUSTERREF() {
            if (coupledclusterref == null) {
                coupledclusterref = new ArrayList<FLEXRAYNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF>();
            }
            return this.coupledclusterref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-NM-CLUSTER--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class COUPLEDCLUSTERREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected FLEXRAYNMCLUSTERSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link FLEXRAYNMCLUSTERSUBTYPESENUM }
             *     
             */
            public FLEXRAYNMCLUSTERSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXRAYNMCLUSTERSUBTYPESENUM }
             *     
             */
            public void setDEST(FLEXRAYNMCLUSTERSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
