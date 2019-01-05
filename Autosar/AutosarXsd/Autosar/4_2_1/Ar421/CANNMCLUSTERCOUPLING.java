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
 * CAN attributes that are valid for each of the referenced (coupled) CAN clusters.
 * 
 * <p>CAN-NM-CLUSTER-COUPLING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-NM-CLUSTER-COUPLING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-CLUSTER-COUPLING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-NM-CLUSTER-COUPLING"/>
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
@XmlType(name = "CAN-NM-CLUSTER-COUPLING", propOrder = {
    "variationpoint",
    "coupledclusterrefs",
    "nmbusloadreductionenabled",
    "nmimmediaterestartenabled"
})
public class CANNMCLUSTERCOUPLING {

    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "COUPLED-CLUSTER-REFS")
    protected CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS coupledclusterrefs;
    @XmlElement(name = "NM-BUSLOAD-REDUCTION-ENABLED")
    protected BOOLEAN nmbusloadreductionenabled;
    @XmlElement(name = "NM-IMMEDIATE-RESTART-ENABLED")
    protected BOOLEAN nmimmediaterestartenabled;
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
     *     {@link CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS }
     *     
     */
    public CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS getCOUPLEDCLUSTERREFS() {
        return coupledclusterrefs;
    }

    /**
     * ??coupledclusterrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS }
     *     
     */
    public void setCOUPLEDCLUSTERREFS(CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS value) {
        this.coupledclusterrefs = value;
    }

    /**
     * ??nmbusloadreductionenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMBUSLOADREDUCTIONENABLED() {
        return nmbusloadreductionenabled;
    }

    /**
     * ??nmbusloadreductionenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMBUSLOADREDUCTIONENABLED(BOOLEAN value) {
        this.nmbusloadreductionenabled = value;
    }

    /**
     * ??nmimmediaterestartenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMIMMEDIATERESTARTENABLED() {
        return nmimmediaterestartenabled;
    }

    /**
     * ??nmimmediaterestartenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMIMMEDIATERESTARTENABLED(BOOLEAN value) {
        this.nmimmediaterestartenabled = value;
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
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-NM-CLUSTER--SUBTYPES-ENUM" />
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
        protected List<CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF> coupledclusterref;

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
         * {@link CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF }
         * 
         * 
         */
        public List<CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF> getCOUPLEDCLUSTERREF() {
            if (coupledclusterref == null) {
                coupledclusterref = new ArrayList<CANNMCLUSTERCOUPLING.COUPLEDCLUSTERREFS.COUPLEDCLUSTERREF>();
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-NM-CLUSTER--SUBTYPES-ENUM" />
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
            protected CANNMCLUSTERSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CANNMCLUSTERSUBTYPESENUM }
             *     
             */
            public CANNMCLUSTERSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CANNMCLUSTERSUBTYPESENUM }
             *     
             */
            public void setDEST(CANNMCLUSTERSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
