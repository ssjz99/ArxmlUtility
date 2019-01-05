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
 * Root element for all measurement and calibration support data related to one Implementation artifact on an ECU. There shall be one such element related to the RTE implementation (if it owns MC data) and a separate one for each module or component, which owns private MC data.
 * 
 * <p>MC-SUPPORT-DATA complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-SUPPORT-DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-SUPPORT-DATA"/>
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
@XmlType(name = "MC-SUPPORT-DATA", propOrder = {
    "emulationsupports",
    "mcparameterinstances",
    "mcvariableinstances",
    "measurablesystemconstantvaluesrefs"
})
public class MCSUPPORTDATA {

    @XmlElement(name = "EMULATION-SUPPORTS")
    protected MCSUPPORTDATA.EMULATIONSUPPORTS emulationsupports;
    @XmlElement(name = "MC-PARAMETER-INSTANCES")
    protected MCSUPPORTDATA.MCPARAMETERINSTANCES mcparameterinstances;
    @XmlElement(name = "MC-VARIABLE-INSTANCES")
    protected MCSUPPORTDATA.MCVARIABLEINSTANCES mcvariableinstances;
    @XmlElement(name = "MEASURABLE-SYSTEM-CONSTANT-VALUES-REFS")
    protected MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS measurablesystemconstantvaluesrefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??emulationsupports?????
     * 
     * @return
     *     possible object is
     *     {@link MCSUPPORTDATA.EMULATIONSUPPORTS }
     *     
     */
    public MCSUPPORTDATA.EMULATIONSUPPORTS getEMULATIONSUPPORTS() {
        return emulationsupports;
    }

    /**
     * ??emulationsupports?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSUPPORTDATA.EMULATIONSUPPORTS }
     *     
     */
    public void setEMULATIONSUPPORTS(MCSUPPORTDATA.EMULATIONSUPPORTS value) {
        this.emulationsupports = value;
    }

    /**
     * ??mcparameterinstances?????
     * 
     * @return
     *     possible object is
     *     {@link MCSUPPORTDATA.MCPARAMETERINSTANCES }
     *     
     */
    public MCSUPPORTDATA.MCPARAMETERINSTANCES getMCPARAMETERINSTANCES() {
        return mcparameterinstances;
    }

    /**
     * ??mcparameterinstances?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSUPPORTDATA.MCPARAMETERINSTANCES }
     *     
     */
    public void setMCPARAMETERINSTANCES(MCSUPPORTDATA.MCPARAMETERINSTANCES value) {
        this.mcparameterinstances = value;
    }

    /**
     * ??mcvariableinstances?????
     * 
     * @return
     *     possible object is
     *     {@link MCSUPPORTDATA.MCVARIABLEINSTANCES }
     *     
     */
    public MCSUPPORTDATA.MCVARIABLEINSTANCES getMCVARIABLEINSTANCES() {
        return mcvariableinstances;
    }

    /**
     * ??mcvariableinstances?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSUPPORTDATA.MCVARIABLEINSTANCES }
     *     
     */
    public void setMCVARIABLEINSTANCES(MCSUPPORTDATA.MCVARIABLEINSTANCES value) {
        this.mcvariableinstances = value;
    }

    /**
     * ??measurablesystemconstantvaluesrefs?????
     * 
     * @return
     *     possible object is
     *     {@link MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS }
     *     
     */
    public MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS getMEASURABLESYSTEMCONSTANTVALUESREFS() {
        return measurablesystemconstantvaluesrefs;
    }

    /**
     * ??measurablesystemconstantvaluesrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS }
     *     
     */
    public void setMEASURABLESYSTEMCONSTANTVALUESREFS(MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS value) {
        this.measurablesystemconstantvaluesrefs = value;
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
     *         &lt;element name="MC-SW-EMULATION-METHOD-SUPPORT" type="{http://autosar.org/schema/r4.0}MC-SW-EMULATION-METHOD-SUPPORT"/>
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
        "mcswemulationmethodsupport"
    })
    public static class EMULATIONSUPPORTS {

        @XmlElement(name = "MC-SW-EMULATION-METHOD-SUPPORT")
        protected List<MCSWEMULATIONMETHODSUPPORT> mcswemulationmethodsupport;

        /**
         * Gets the value of the mcswemulationmethodsupport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcswemulationmethodsupport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCSWEMULATIONMETHODSUPPORT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCSWEMULATIONMETHODSUPPORT }
         * 
         * 
         */
        public List<MCSWEMULATIONMETHODSUPPORT> getMCSWEMULATIONMETHODSUPPORT() {
            if (mcswemulationmethodsupport == null) {
                mcswemulationmethodsupport = new ArrayList<MCSWEMULATIONMETHODSUPPORT>();
            }
            return this.mcswemulationmethodsupport;
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
     *         &lt;element name="MC-DATA-INSTANCE" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE"/>
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
        "mcdatainstance"
    })
    public static class MCPARAMETERINSTANCES {

        @XmlElement(name = "MC-DATA-INSTANCE")
        protected List<MCDATAINSTANCE> mcdatainstance;

        /**
         * Gets the value of the mcdatainstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcdatainstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCDATAINSTANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCDATAINSTANCE }
         * 
         * 
         */
        public List<MCDATAINSTANCE> getMCDATAINSTANCE() {
            if (mcdatainstance == null) {
                mcdatainstance = new ArrayList<MCDATAINSTANCE>();
            }
            return this.mcdatainstance;
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
     *         &lt;element name="MC-DATA-INSTANCE" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE"/>
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
        "mcdatainstance"
    })
    public static class MCVARIABLEINSTANCES {

        @XmlElement(name = "MC-DATA-INSTANCE")
        protected List<MCDATAINSTANCE> mcdatainstance;

        /**
         * Gets the value of the mcdatainstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcdatainstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCDATAINSTANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCDATAINSTANCE }
         * 
         * 
         */
        public List<MCDATAINSTANCE> getMCDATAINSTANCE() {
            if (mcdatainstance == null) {
                mcdatainstance = new ArrayList<MCDATAINSTANCE>();
            }
            return this.mcdatainstance;
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
     *         &lt;element name="MEASURABLE-SYSTEM-CONSTANT-VALUES-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-SYSTEMCONSTANT-VALUE-SET--SUBTYPES-ENUM" />
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
        "measurablesystemconstantvaluesref"
    })
    public static class MEASURABLESYSTEMCONSTANTVALUESREFS {

        @XmlElement(name = "MEASURABLE-SYSTEM-CONSTANT-VALUES-REF")
        protected List<MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS.MEASURABLESYSTEMCONSTANTVALUESREF> measurablesystemconstantvaluesref;

        /**
         * Gets the value of the measurablesystemconstantvaluesref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measurablesystemconstantvaluesref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEASURABLESYSTEMCONSTANTVALUESREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS.MEASURABLESYSTEMCONSTANTVALUESREF }
         * 
         * 
         */
        public List<MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS.MEASURABLESYSTEMCONSTANTVALUESREF> getMEASURABLESYSTEMCONSTANTVALUESREF() {
            if (measurablesystemconstantvaluesref == null) {
                measurablesystemconstantvaluesref = new ArrayList<MCSUPPORTDATA.MEASURABLESYSTEMCONSTANTVALUESREFS.MEASURABLESYSTEMCONSTANTVALUESREF>();
            }
            return this.measurablesystemconstantvaluesref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-SYSTEMCONSTANT-VALUE-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MEASURABLESYSTEMCONSTANTVALUESREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected SWSYSTEMCONSTANTVALUESETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link SWSYSTEMCONSTANTVALUESETSUBTYPESENUM }
             *     
             */
            public SWSYSTEMCONSTANTVALUESETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link SWSYSTEMCONSTANTVALUESETSUBTYPESENUM }
             *     
             */
            public void setDEST(SWSYSTEMCONSTANTVALUESETSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
