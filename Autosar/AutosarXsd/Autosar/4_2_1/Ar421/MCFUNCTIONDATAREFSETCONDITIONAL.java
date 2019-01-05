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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>MC-FUNCTION-DATA-REF-SET-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-FUNCTION-DATA-REF-SET-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-FUNCTION-DATA-REF-SET-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-FUNCTION-DATA-REF-SET-CONDITIONAL"/>
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
@XmlType(name = "MC-FUNCTION-DATA-REF-SET-CONDITIONAL", propOrder = {
    "flatmapentryrefs",
    "mcdatainstancerefs",
    "variationpoint"
})
public class MCFUNCTIONDATAREFSETCONDITIONAL {

    @XmlElement(name = "FLAT-MAP-ENTRY-REFS")
    protected MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS flatmapentryrefs;
    @XmlElement(name = "MC-DATA-INSTANCE-REFS")
    protected MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS mcdatainstancerefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??flatmapentryrefs?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS }
     *     
     */
    public MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS getFLATMAPENTRYREFS() {
        return flatmapentryrefs;
    }

    /**
     * ??flatmapentryrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS }
     *     
     */
    public void setFLATMAPENTRYREFS(MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS value) {
        this.flatmapentryrefs = value;
    }

    /**
     * ??mcdatainstancerefs?????
     * 
     * @return
     *     possible object is
     *     {@link MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS }
     *     
     */
    public MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS getMCDATAINSTANCEREFS() {
        return mcdatainstancerefs;
    }

    /**
     * ??mcdatainstancerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS }
     *     
     */
    public void setMCDATAINSTANCEREFS(MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS value) {
        this.mcdatainstancerefs = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="FLAT-MAP-ENTRY-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM" />
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
        "flatmapentryref"
    })
    public static class FLATMAPENTRYREFS {

        @XmlElement(name = "FLAT-MAP-ENTRY-REF")
        protected List<MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS.FLATMAPENTRYREF> flatmapentryref;

        /**
         * Gets the value of the flatmapentryref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flatmapentryref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLATMAPENTRYREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS.FLATMAPENTRYREF }
         * 
         * 
         */
        public List<MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS.FLATMAPENTRYREF> getFLATMAPENTRYREF() {
            if (flatmapentryref == null) {
                flatmapentryref = new ArrayList<MCFUNCTIONDATAREFSETCONDITIONAL.FLATMAPENTRYREFS.FLATMAPENTRYREF>();
            }
            return this.flatmapentryref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FLATMAPENTRYREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected FLATINSTANCEDESCRIPTORSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link FLATINSTANCEDESCRIPTORSUBTYPESENUM }
             *     
             */
            public FLATINSTANCEDESCRIPTORSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link FLATINSTANCEDESCRIPTORSUBTYPESENUM }
             *     
             */
            public void setDEST(FLATINSTANCEDESCRIPTORSUBTYPESENUM value) {
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
     *         &lt;element name="MC-DATA-INSTANCE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE--SUBTYPES-ENUM" />
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
        "mcdatainstanceref"
    })
    public static class MCDATAINSTANCEREFS {

        @XmlElement(name = "MC-DATA-INSTANCE-REF")
        protected List<MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS.MCDATAINSTANCEREF> mcdatainstanceref;

        /**
         * Gets the value of the mcdatainstanceref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcdatainstanceref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCDATAINSTANCEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS.MCDATAINSTANCEREF }
         * 
         * 
         */
        public List<MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS.MCDATAINSTANCEREF> getMCDATAINSTANCEREF() {
            if (mcdatainstanceref == null) {
                mcdatainstanceref = new ArrayList<MCFUNCTIONDATAREFSETCONDITIONAL.MCDATAINSTANCEREFS.MCDATAINSTANCEREF>();
            }
            return this.mcdatainstanceref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MCDATAINSTANCEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected MCDATAINSTANCESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link MCDATAINSTANCESUBTYPESENUM }
             *     
             */
            public MCDATAINSTANCESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link MCDATAINSTANCESUBTYPESENUM }
             *     
             */
            public void setDEST(MCDATAINSTANCESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
