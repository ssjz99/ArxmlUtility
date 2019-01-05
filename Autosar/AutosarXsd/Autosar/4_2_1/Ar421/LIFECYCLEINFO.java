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
 * LifeCycleInfo describes the life cycle state of an element together with additional information like what to use instead
 * 
 * <p>LIFE-CYCLE-INFO complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIFE-CYCLE-INFO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIFE-CYCLE-INFO"/>
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
@XmlType(name = "LIFE-CYCLE-INFO", propOrder = {
    "lcobjectref",
    "lcstateref",
    "periodbegin",
    "periodend",
    "remark",
    "useinsteadrefs"
})
public class LIFECYCLEINFO {

    @XmlElement(name = "LC-OBJECT-REF")
    protected LIFECYCLEINFO.LCOBJECTREF lcobjectref;
    @XmlElement(name = "LC-STATE-REF")
    protected LIFECYCLEINFO.LCSTATEREF lcstateref;
    @XmlElement(name = "PERIOD-BEGIN")
    protected LIFECYCLEPERIOD periodbegin;
    @XmlElement(name = "PERIOD-END")
    protected LIFECYCLEPERIOD periodend;
    @XmlElement(name = "REMARK")
    protected DOCUMENTATIONBLOCK remark;
    @XmlElement(name = "USE-INSTEAD-REFS")
    protected LIFECYCLEINFO.USEINSTEADREFS useinsteadrefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??lcobjectref?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEINFO.LCOBJECTREF }
     *     
     */
    public LIFECYCLEINFO.LCOBJECTREF getLCOBJECTREF() {
        return lcobjectref;
    }

    /**
     * ??lcobjectref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEINFO.LCOBJECTREF }
     *     
     */
    public void setLCOBJECTREF(LIFECYCLEINFO.LCOBJECTREF value) {
        this.lcobjectref = value;
    }

    /**
     * ??lcstateref?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEINFO.LCSTATEREF }
     *     
     */
    public LIFECYCLEINFO.LCSTATEREF getLCSTATEREF() {
        return lcstateref;
    }

    /**
     * ??lcstateref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEINFO.LCSTATEREF }
     *     
     */
    public void setLCSTATEREF(LIFECYCLEINFO.LCSTATEREF value) {
        this.lcstateref = value;
    }

    /**
     * ??periodbegin?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public LIFECYCLEPERIOD getPERIODBEGIN() {
        return periodbegin;
    }

    /**
     * ??periodbegin?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public void setPERIODBEGIN(LIFECYCLEPERIOD value) {
        this.periodbegin = value;
    }

    /**
     * ??periodend?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public LIFECYCLEPERIOD getPERIODEND() {
        return periodend;
    }

    /**
     * ??periodend?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public void setPERIODEND(LIFECYCLEPERIOD value) {
        this.periodend = value;
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
     * ??useinsteadrefs?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEINFO.USEINSTEADREFS }
     *     
     */
    public LIFECYCLEINFO.USEINSTEADREFS getUSEINSTEADREFS() {
        return useinsteadrefs;
    }

    /**
     * ??useinsteadrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEINFO.USEINSTEADREFS }
     *     
     */
    public void setUSEINSTEADREFS(LIFECYCLEINFO.USEINSTEADREFS value) {
        this.useinsteadrefs = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LCOBJECTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected REFERRABLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link REFERRABLESUBTYPESENUM }
         *     
         */
        public REFERRABLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link REFERRABLESUBTYPESENUM }
         *     
         */
        public void setDEST(REFERRABLESUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIFE-CYCLE-STATE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LCSTATEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LIFECYCLESTATESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LIFECYCLESTATESUBTYPESENUM }
         *     
         */
        public LIFECYCLESTATESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LIFECYCLESTATESUBTYPESENUM }
         *     
         */
        public void setDEST(LIFECYCLESTATESUBTYPESENUM value) {
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
     *         &lt;element name="USE-INSTEAD-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
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
        "useinsteadref"
    })
    public static class USEINSTEADREFS {

        @XmlElement(name = "USE-INSTEAD-REF")
        protected List<LIFECYCLEINFO.USEINSTEADREFS.USEINSTEADREF> useinsteadref;

        /**
         * Gets the value of the useinsteadref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the useinsteadref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUSEINSTEADREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LIFECYCLEINFO.USEINSTEADREFS.USEINSTEADREF }
         * 
         * 
         */
        public List<LIFECYCLEINFO.USEINSTEADREFS.USEINSTEADREF> getUSEINSTEADREF() {
            if (useinsteadref == null) {
                useinsteadref = new ArrayList<LIFECYCLEINFO.USEINSTEADREFS.USEINSTEADREF>();
            }
            return this.useinsteadref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}REFERRABLE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class USEINSTEADREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected REFERRABLESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public REFERRABLESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link REFERRABLESUBTYPESENUM }
             *     
             */
            public void setDEST(REFERRABLESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
