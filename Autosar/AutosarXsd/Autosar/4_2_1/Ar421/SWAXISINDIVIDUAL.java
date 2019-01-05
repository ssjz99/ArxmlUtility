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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This element describes an axis integrated into a parameter (field etc.). The integration makes this individual to each parameter. The so-called grouped axis represents the counterpart to this. It is conceived as an independent parameter (see class SwAxisGrouped).
 * 
 * <p>SW-AXIS-INDIVIDUAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-AXIS-INDIVIDUAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-CALPRM-AXIS-TYPE-PROPS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-AXIS-INDIVIDUAL"/>
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
@XmlType(name = "SW-AXIS-INDIVIDUAL", propOrder = {
    "inputvariabletyperef",
    "swvariablerefs",
    "compumethodref",
    "unitref",
    "swmaxaxispoints",
    "swminaxispoints",
    "dataconstrref",
    "swaxisgeneric"
})
public class SWAXISINDIVIDUAL {

    @XmlElement(name = "INPUT-VARIABLE-TYPE-REF")
    protected SWAXISINDIVIDUAL.INPUTVARIABLETYPEREF inputvariabletyperef;
    @XmlElement(name = "SW-VARIABLE-REFS")
    protected SWAXISINDIVIDUAL.SWVARIABLEREFS swvariablerefs;
    @XmlElement(name = "COMPU-METHOD-REF")
    protected SWAXISINDIVIDUAL.COMPUMETHODREF compumethodref;
    @XmlElement(name = "UNIT-REF")
    protected SWAXISINDIVIDUAL.UNITREF unitref;
    @XmlElement(name = "SW-MAX-AXIS-POINTS")
    protected INTEGERVALUEVARIATIONPOINT swmaxaxispoints;
    @XmlElement(name = "SW-MIN-AXIS-POINTS")
    protected INTEGERVALUEVARIATIONPOINT swminaxispoints;
    @XmlElement(name = "DATA-CONSTR-REF")
    protected SWAXISINDIVIDUAL.DATACONSTRREF dataconstrref;
    @XmlElement(name = "SW-AXIS-GENERIC")
    protected SWAXISGENERIC swaxisgeneric;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??inputvariabletyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISINDIVIDUAL.INPUTVARIABLETYPEREF }
     *     
     */
    public SWAXISINDIVIDUAL.INPUTVARIABLETYPEREF getINPUTVARIABLETYPEREF() {
        return inputvariabletyperef;
    }

    /**
     * ??inputvariabletyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISINDIVIDUAL.INPUTVARIABLETYPEREF }
     *     
     */
    public void setINPUTVARIABLETYPEREF(SWAXISINDIVIDUAL.INPUTVARIABLETYPEREF value) {
        this.inputvariabletyperef = value;
    }

    /**
     * ??swvariablerefs?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISINDIVIDUAL.SWVARIABLEREFS }
     *     
     */
    public SWAXISINDIVIDUAL.SWVARIABLEREFS getSWVARIABLEREFS() {
        return swvariablerefs;
    }

    /**
     * ??swvariablerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISINDIVIDUAL.SWVARIABLEREFS }
     *     
     */
    public void setSWVARIABLEREFS(SWAXISINDIVIDUAL.SWVARIABLEREFS value) {
        this.swvariablerefs = value;
    }

    /**
     * ??compumethodref?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISINDIVIDUAL.COMPUMETHODREF }
     *     
     */
    public SWAXISINDIVIDUAL.COMPUMETHODREF getCOMPUMETHODREF() {
        return compumethodref;
    }

    /**
     * ??compumethodref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISINDIVIDUAL.COMPUMETHODREF }
     *     
     */
    public void setCOMPUMETHODREF(SWAXISINDIVIDUAL.COMPUMETHODREF value) {
        this.compumethodref = value;
    }

    /**
     * ??unitref?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISINDIVIDUAL.UNITREF }
     *     
     */
    public SWAXISINDIVIDUAL.UNITREF getUNITREF() {
        return unitref;
    }

    /**
     * ??unitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISINDIVIDUAL.UNITREF }
     *     
     */
    public void setUNITREF(SWAXISINDIVIDUAL.UNITREF value) {
        this.unitref = value;
    }

    /**
     * ??swmaxaxispoints?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public INTEGERVALUEVARIATIONPOINT getSWMAXAXISPOINTS() {
        return swmaxaxispoints;
    }

    /**
     * ??swmaxaxispoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setSWMAXAXISPOINTS(INTEGERVALUEVARIATIONPOINT value) {
        this.swmaxaxispoints = value;
    }

    /**
     * ??swminaxispoints?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public INTEGERVALUEVARIATIONPOINT getSWMINAXISPOINTS() {
        return swminaxispoints;
    }

    /**
     * ??swminaxispoints?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setSWMINAXISPOINTS(INTEGERVALUEVARIATIONPOINT value) {
        this.swminaxispoints = value;
    }

    /**
     * ??dataconstrref?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISINDIVIDUAL.DATACONSTRREF }
     *     
     */
    public SWAXISINDIVIDUAL.DATACONSTRREF getDATACONSTRREF() {
        return dataconstrref;
    }

    /**
     * ??dataconstrref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISINDIVIDUAL.DATACONSTRREF }
     *     
     */
    public void setDATACONSTRREF(SWAXISINDIVIDUAL.DATACONSTRREF value) {
        this.dataconstrref = value;
    }

    /**
     * ??swaxisgeneric?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISGENERIC }
     *     
     */
    public SWAXISGENERIC getSWAXISGENERIC() {
        return swaxisgeneric;
    }

    /**
     * ??swaxisgeneric?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISGENERIC }
     *     
     */
    public void setSWAXISGENERIC(SWAXISGENERIC value) {
        this.swaxisgeneric = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMPU-METHOD--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COMPUMETHODREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMPUMETHODSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMPUMETHODSUBTYPESENUM }
         *     
         */
        public COMPUMETHODSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMPUMETHODSUBTYPESENUM }
         *     
         */
        public void setDEST(COMPUMETHODSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-CONSTR--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATACONSTRREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DATACONSTRSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DATACONSTRSUBTYPESENUM }
         *     
         */
        public DATACONSTRSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DATACONSTRSUBTYPESENUM }
         *     
         */
        public void setDEST(DATACONSTRSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-PRIMITIVE-DATA-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class INPUTVARIABLETYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM }
         *     
         */
        public APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM value) {
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
     *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-VARIABLE-REF-PROXY"/>
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
        "autosarvariableAndMCDATAINSTANCEVARREF"
    })
    public static class SWVARIABLEREFS {

        @XmlElements({
            @XmlElement(name = "AUTOSAR-VARIABLE", type = AUTOSARVARIABLEREF.class),
            @XmlElement(name = "MC-DATA-INSTANCE-VAR-REF", type = Ar421.SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF.class)
        })
        protected List<Object> autosarvariableAndMCDATAINSTANCEVARREF;

        /**
         * Gets the value of the autosarvariableAndMCDATAINSTANCEVARREF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autosarvariableAndMCDATAINSTANCEVARREF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAUTOSARVARIABLEAndMCDATAINSTANCEVARREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AUTOSARVARIABLEREF }
         * {@link Ar421.SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF }
         * 
         * 
         */
        public List<Object> getAUTOSARVARIABLEAndMCDATAINSTANCEVARREF() {
            if (autosarvariableAndMCDATAINSTANCEVARREF == null) {
                autosarvariableAndMCDATAINSTANCEVARREF = new ArrayList<Object>();
            }
            return this.autosarvariableAndMCDATAINSTANCEVARREF;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}UNIT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UNITREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected UNITSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public UNITSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link UNITSUBTYPESENUM }
         *     
         */
        public void setDEST(UNITSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
