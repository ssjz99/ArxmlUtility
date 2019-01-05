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
 * The ForbiddenSignalPath describes the physical channels which an element must not take in the topology. Such a signal path can be a constraint for the communication matrix,  because such a path has an effect on the frame generation and the frame path.
 * 
 * <p>FORBIDDEN-SIGNAL-PATH complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FORBIDDEN-SIGNAL-PATH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SIGNAL-PATH-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FORBIDDEN-SIGNAL-PATH"/>
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
@XmlType(name = "FORBIDDEN-SIGNAL-PATH", propOrder = {
    "introduction",
    "variationpoint",
    "operations",
    "physicalchannelrefs",
    "signals"
})
public class FORBIDDENSIGNALPATH {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "OPERATIONS")
    protected FORBIDDENSIGNALPATH.OPERATIONS operations;
    @XmlElement(name = "PHYSICAL-CHANNEL-REFS")
    protected FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS physicalchannelrefs;
    @XmlElement(name = "SIGNALS")
    protected FORBIDDENSIGNALPATH.SIGNALS signals;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??operations?????
     * 
     * @return
     *     possible object is
     *     {@link FORBIDDENSIGNALPATH.OPERATIONS }
     *     
     */
    public FORBIDDENSIGNALPATH.OPERATIONS getOPERATIONS() {
        return operations;
    }

    /**
     * ??operations?????
     * 
     * @param value
     *     allowed object is
     *     {@link FORBIDDENSIGNALPATH.OPERATIONS }
     *     
     */
    public void setOPERATIONS(FORBIDDENSIGNALPATH.OPERATIONS value) {
        this.operations = value;
    }

    /**
     * ??physicalchannelrefs?????
     * 
     * @return
     *     possible object is
     *     {@link FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS }
     *     
     */
    public FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS getPHYSICALCHANNELREFS() {
        return physicalchannelrefs;
    }

    /**
     * ??physicalchannelrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS }
     *     
     */
    public void setPHYSICALCHANNELREFS(FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS value) {
        this.physicalchannelrefs = value;
    }

    /**
     * ??signals?????
     * 
     * @return
     *     possible object is
     *     {@link FORBIDDENSIGNALPATH.SIGNALS }
     *     
     */
    public FORBIDDENSIGNALPATH.SIGNALS getSIGNALS() {
        return signals;
    }

    /**
     * ??signals?????
     * 
     * @param value
     *     allowed object is
     *     {@link FORBIDDENSIGNALPATH.SIGNALS }
     *     
     */
    public void setSIGNALS(FORBIDDENSIGNALPATH.SIGNALS value) {
        this.signals = value;
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
     *         &lt;element name="SWC-TO-SWC-OPERATION-ARGUMENTS" type="{http://autosar.org/schema/r4.0}SWC-TO-SWC-OPERATION-ARGUMENTS"/>
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
        "swctoswcoperationarguments"
    })
    public static class OPERATIONS {

        @XmlElement(name = "SWC-TO-SWC-OPERATION-ARGUMENTS")
        protected List<SWCTOSWCOPERATIONARGUMENTS> swctoswcoperationarguments;

        /**
         * Gets the value of the swctoswcoperationarguments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swctoswcoperationarguments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCTOSWCOPERATIONARGUMENTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCTOSWCOPERATIONARGUMENTS }
         * 
         * 
         */
        public List<SWCTOSWCOPERATIONARGUMENTS> getSWCTOSWCOPERATIONARGUMENTS() {
            if (swctoswcoperationarguments == null) {
                swctoswcoperationarguments = new ArrayList<SWCTOSWCOPERATIONARGUMENTS>();
            }
            return this.swctoswcoperationarguments;
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
     *         &lt;element name="PHYSICAL-CHANNEL-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PHYSICAL-CHANNEL--SUBTYPES-ENUM" />
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
        "physicalchannelref"
    })
    public static class PHYSICALCHANNELREFS {

        @XmlElement(name = "PHYSICAL-CHANNEL-REF")
        protected List<FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS.PHYSICALCHANNELREF> physicalchannelref;

        /**
         * Gets the value of the physicalchannelref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the physicalchannelref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPHYSICALCHANNELREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS.PHYSICALCHANNELREF }
         * 
         * 
         */
        public List<FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS.PHYSICALCHANNELREF> getPHYSICALCHANNELREF() {
            if (physicalchannelref == null) {
                physicalchannelref = new ArrayList<FORBIDDENSIGNALPATH.PHYSICALCHANNELREFS.PHYSICALCHANNELREF>();
            }
            return this.physicalchannelref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PHYSICAL-CHANNEL--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PHYSICALCHANNELREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected PHYSICALCHANNELSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link PHYSICALCHANNELSUBTYPESENUM }
             *     
             */
            public PHYSICALCHANNELSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link PHYSICALCHANNELSUBTYPESENUM }
             *     
             */
            public void setDEST(PHYSICALCHANNELSUBTYPESENUM value) {
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
     *         &lt;element name="SWC-TO-SWC-SIGNAL" type="{http://autosar.org/schema/r4.0}SWC-TO-SWC-SIGNAL"/>
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
        "swctoswcsignal"
    })
    public static class SIGNALS {

        @XmlElement(name = "SWC-TO-SWC-SIGNAL")
        protected List<SWCTOSWCSIGNAL> swctoswcsignal;

        /**
         * Gets the value of the swctoswcsignal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swctoswcsignal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCTOSWCSIGNAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCTOSWCSIGNAL }
         * 
         * 
         */
        public List<SWCTOSWCSIGNAL> getSWCTOSWCSIGNAL() {
            if (swctoswcsignal == null) {
                swctoswcsignal = new ArrayList<SWCTOSWCSIGNAL>();
            }
            return this.swctoswcsignal;
        }

    }

}
