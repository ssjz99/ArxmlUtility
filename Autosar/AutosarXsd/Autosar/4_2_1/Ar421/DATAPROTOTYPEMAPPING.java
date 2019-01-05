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
 * Defines the mapping of two particular VariableDataPrototypes, ParameterDataPrototypes or ArgumentDataPrototypes with unequal names and/or unequal semantic (resolution or range) in context of two different SenderReceiverInterface, NvDataInterface or ParameterInterface or Operations.
 * 
 * If the semantic is unequal following rules apply:
 * The textTableMapping is only applicable if the referred DataPrototypes are typed by AutosarDataType referring to CompuMethods of category TEXTTABLE, SCALE_LINEAR_AND_TEXTTABLE or BITFIELD_TEXTTABLE.
 * 
 * In the case that the  DataPrototypes are typed by AutosarDataType either referring to CompuMethods of category LINEAR, IDENTICAL or referring to no CompuMethod (which is similar as  IDENTICAL) the linear conversion factor is calculated out of the factorSiToUnit and offsetSiToUnit attributes of the referred Units and the CompuRationalCoeffs of a compuInternalToPhys of the referred CompuMethods.
 * 
 * <p>DATA-PROTOTYPE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DATA-PROTOTYPE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE-MAPPING"/>
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
@XmlType(name = "DATA-PROTOTYPE-MAPPING", propOrder = {
    "firstdataprototyperef",
    "seconddataprototyperef",
    "subelementmappings",
    "texttablemappings"
})
public class DATAPROTOTYPEMAPPING {

    @XmlElement(name = "FIRST-DATA-PROTOTYPE-REF")
    protected DATAPROTOTYPEMAPPING.FIRSTDATAPROTOTYPEREF firstdataprototyperef;
    @XmlElement(name = "SECOND-DATA-PROTOTYPE-REF")
    protected DATAPROTOTYPEMAPPING.SECONDDATAPROTOTYPEREF seconddataprototyperef;
    @XmlElement(name = "SUB-ELEMENT-MAPPINGS")
    protected DATAPROTOTYPEMAPPING.SUBELEMENTMAPPINGS subelementmappings;
    @XmlElement(name = "TEXT-TABLE-MAPPINGS")
    protected DATAPROTOTYPEMAPPING.TEXTTABLEMAPPINGS texttablemappings;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??firstdataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link DATAPROTOTYPEMAPPING.FIRSTDATAPROTOTYPEREF }
     *     
     */
    public DATAPROTOTYPEMAPPING.FIRSTDATAPROTOTYPEREF getFIRSTDATAPROTOTYPEREF() {
        return firstdataprototyperef;
    }

    /**
     * ??firstdataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAPROTOTYPEMAPPING.FIRSTDATAPROTOTYPEREF }
     *     
     */
    public void setFIRSTDATAPROTOTYPEREF(DATAPROTOTYPEMAPPING.FIRSTDATAPROTOTYPEREF value) {
        this.firstdataprototyperef = value;
    }

    /**
     * ??seconddataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link DATAPROTOTYPEMAPPING.SECONDDATAPROTOTYPEREF }
     *     
     */
    public DATAPROTOTYPEMAPPING.SECONDDATAPROTOTYPEREF getSECONDDATAPROTOTYPEREF() {
        return seconddataprototyperef;
    }

    /**
     * ??seconddataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAPROTOTYPEMAPPING.SECONDDATAPROTOTYPEREF }
     *     
     */
    public void setSECONDDATAPROTOTYPEREF(DATAPROTOTYPEMAPPING.SECONDDATAPROTOTYPEREF value) {
        this.seconddataprototyperef = value;
    }

    /**
     * ??subelementmappings?????
     * 
     * @return
     *     possible object is
     *     {@link DATAPROTOTYPEMAPPING.SUBELEMENTMAPPINGS }
     *     
     */
    public DATAPROTOTYPEMAPPING.SUBELEMENTMAPPINGS getSUBELEMENTMAPPINGS() {
        return subelementmappings;
    }

    /**
     * ??subelementmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAPROTOTYPEMAPPING.SUBELEMENTMAPPINGS }
     *     
     */
    public void setSUBELEMENTMAPPINGS(DATAPROTOTYPEMAPPING.SUBELEMENTMAPPINGS value) {
        this.subelementmappings = value;
    }

    /**
     * ??texttablemappings?????
     * 
     * @return
     *     possible object is
     *     {@link DATAPROTOTYPEMAPPING.TEXTTABLEMAPPINGS }
     *     
     */
    public DATAPROTOTYPEMAPPING.TEXTTABLEMAPPINGS getTEXTTABLEMAPPINGS() {
        return texttablemappings;
    }

    /**
     * ??texttablemappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAPROTOTYPEMAPPING.TEXTTABLEMAPPINGS }
     *     
     */
    public void setTEXTTABLEMAPPINGS(DATAPROTOTYPEMAPPING.TEXTTABLEMAPPINGS value) {
        this.texttablemappings = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected AUTOSARDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public AUTOSARDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(AUTOSARDATAPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SECONDDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected AUTOSARDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public AUTOSARDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(AUTOSARDATAPROTOTYPESUBTYPESENUM value) {
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
     *         &lt;element name="SUB-ELEMENT-MAPPING" type="{http://autosar.org/schema/r4.0}SUB-ELEMENT-MAPPING"/>
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
        "subelementmapping"
    })
    public static class SUBELEMENTMAPPINGS {

        @XmlElement(name = "SUB-ELEMENT-MAPPING")
        protected List<SUBELEMENTMAPPING> subelementmapping;

        /**
         * Gets the value of the subelementmapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subelementmapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUBELEMENTMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SUBELEMENTMAPPING }
         * 
         * 
         */
        public List<SUBELEMENTMAPPING> getSUBELEMENTMAPPING() {
            if (subelementmapping == null) {
                subelementmapping = new ArrayList<SUBELEMENTMAPPING>();
            }
            return this.subelementmapping;
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
     *       &lt;choice maxOccurs="2" minOccurs="0">
     *         &lt;element name="TEXT-TABLE-MAPPING" type="{http://autosar.org/schema/r4.0}TEXT-TABLE-MAPPING"/>
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
        "texttablemapping"
    })
    public static class TEXTTABLEMAPPINGS {

        @XmlElement(name = "TEXT-TABLE-MAPPING")
        protected List<TEXTTABLEMAPPING> texttablemapping;

        /**
         * Gets the value of the texttablemapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the texttablemapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTEXTTABLEMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TEXTTABLEMAPPING }
         * 
         * 
         */
        public List<TEXTTABLEMAPPING> getTEXTTABLEMAPPING() {
            if (texttablemapping == null) {
                texttablemapping = new ArrayList<TEXTTABLEMAPPING>();
            }
            return this.texttablemapping;
        }

    }

}
