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
 * The EcucDestinationUriPolicy describes the EcucContainerDef that will be targeted by EcucUriReferenceDefs. The type of the description is dependent of the destinationUriNestingContract attribute.
 * 
 * <p>ECUC-DESTINATION-URI-POLICY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-DESTINATION-URI-POLICY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-DESTINATION-URI-POLICY"/>
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
@XmlType(name = "ECUC-DESTINATION-URI-POLICY", propOrder = {
    "containers",
    "destinationurinestingcontract",
    "parameters",
    "references"
})
public class ECUCDESTINATIONURIPOLICY {

    @XmlElement(name = "CONTAINERS")
    protected ECUCDESTINATIONURIPOLICY.CONTAINERS containers;
    @XmlElement(name = "DESTINATION-URI-NESTING-CONTRACT")
    protected ECUCDESTINATIONURINESTINGCONTRACTENUM destinationurinestingcontract;
    @XmlElement(name = "PARAMETERS")
    protected ECUCDESTINATIONURIPOLICY.PARAMETERS parameters;
    @XmlElement(name = "REFERENCES")
    protected ECUCDESTINATIONURIPOLICY.REFERENCES references;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??containers?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCDESTINATIONURIPOLICY.CONTAINERS }
     *     
     */
    public ECUCDESTINATIONURIPOLICY.CONTAINERS getCONTAINERS() {
        return containers;
    }

    /**
     * ??containers?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCDESTINATIONURIPOLICY.CONTAINERS }
     *     
     */
    public void setCONTAINERS(ECUCDESTINATIONURIPOLICY.CONTAINERS value) {
        this.containers = value;
    }

    /**
     * ??destinationurinestingcontract?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCDESTINATIONURINESTINGCONTRACTENUM }
     *     
     */
    public ECUCDESTINATIONURINESTINGCONTRACTENUM getDESTINATIONURINESTINGCONTRACT() {
        return destinationurinestingcontract;
    }

    /**
     * ??destinationurinestingcontract?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCDESTINATIONURINESTINGCONTRACTENUM }
     *     
     */
    public void setDESTINATIONURINESTINGCONTRACT(ECUCDESTINATIONURINESTINGCONTRACTENUM value) {
        this.destinationurinestingcontract = value;
    }

    /**
     * ??parameters?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCDESTINATIONURIPOLICY.PARAMETERS }
     *     
     */
    public ECUCDESTINATIONURIPOLICY.PARAMETERS getPARAMETERS() {
        return parameters;
    }

    /**
     * ??parameters?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCDESTINATIONURIPOLICY.PARAMETERS }
     *     
     */
    public void setPARAMETERS(ECUCDESTINATIONURIPOLICY.PARAMETERS value) {
        this.parameters = value;
    }

    /**
     * ??references?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCDESTINATIONURIPOLICY.REFERENCES }
     *     
     */
    public ECUCDESTINATIONURIPOLICY.REFERENCES getREFERENCES() {
        return references;
    }

    /**
     * ??references?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCDESTINATIONURIPOLICY.REFERENCES }
     *     
     */
    public void setREFERENCES(ECUCDESTINATIONURIPOLICY.REFERENCES value) {
        this.references = value;
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
     *         &lt;element name="ECUC-CHOICE-CONTAINER-DEF" type="{http://autosar.org/schema/r4.0}ECUC-CHOICE-CONTAINER-DEF"/>
     *         &lt;element name="ECUC-PARAM-CONF-CONTAINER-DEF" type="{http://autosar.org/schema/r4.0}ECUC-PARAM-CONF-CONTAINER-DEF"/>
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
        "ecucchoicecontainerdefOrECUCPARAMCONFCONTAINERDEF"
    })
    public static class CONTAINERS {

        @XmlElements({
            @XmlElement(name = "ECUC-CHOICE-CONTAINER-DEF", type = ECUCCHOICECONTAINERDEF.class),
            @XmlElement(name = "ECUC-PARAM-CONF-CONTAINER-DEF", type = ECUCPARAMCONFCONTAINERDEF.class)
        })
        protected List<Object> ecucchoicecontainerdefOrECUCPARAMCONFCONTAINERDEF;

        /**
         * Gets the value of the ecucchoicecontainerdefOrECUCPARAMCONFCONTAINERDEF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucchoicecontainerdefOrECUCPARAMCONFCONTAINERDEF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCCHOICECONTAINERDEFOrECUCPARAMCONFCONTAINERDEF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCCHOICECONTAINERDEF }
         * {@link ECUCPARAMCONFCONTAINERDEF }
         * 
         * 
         */
        public List<Object> getECUCCHOICECONTAINERDEFOrECUCPARAMCONFCONTAINERDEF() {
            if (ecucchoicecontainerdefOrECUCPARAMCONFCONTAINERDEF == null) {
                ecucchoicecontainerdefOrECUCPARAMCONFCONTAINERDEF = new ArrayList<Object>();
            }
            return this.ecucchoicecontainerdefOrECUCPARAMCONFCONTAINERDEF;
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
     *         &lt;element name="ECUC-ADD-INFO-PARAM-DEF" type="{http://autosar.org/schema/r4.0}ECUC-ADD-INFO-PARAM-DEF"/>
     *         &lt;element name="ECUC-BOOLEAN-PARAM-DEF" type="{http://autosar.org/schema/r4.0}ECUC-BOOLEAN-PARAM-DEF"/>
     *         &lt;element name="ECUC-ENUMERATION-PARAM-DEF" type="{http://autosar.org/schema/r4.0}ECUC-ENUMERATION-PARAM-DEF"/>
     *         &lt;element name="ECUC-FLOAT-PARAM-DEF" type="{http://autosar.org/schema/r4.0}ECUC-FLOAT-PARAM-DEF"/>
     *         &lt;element name="ECUC-FUNCTION-NAME-DEF" type="{http://autosar.org/schema/r4.0}ECUC-FUNCTION-NAME-DEF"/>
     *         &lt;element name="ECUC-INTEGER-PARAM-DEF" type="{http://autosar.org/schema/r4.0}ECUC-INTEGER-PARAM-DEF"/>
     *         &lt;element name="ECUC-LINKER-SYMBOL-DEF" type="{http://autosar.org/schema/r4.0}ECUC-LINKER-SYMBOL-DEF"/>
     *         &lt;element name="ECUC-MULTILINE-STRING-PARAM-DEF" type="{http://autosar.org/schema/r4.0}ECUC-MULTILINE-STRING-PARAM-DEF"/>
     *         &lt;element name="ECUC-STRING-PARAM-DEF" type="{http://autosar.org/schema/r4.0}ECUC-STRING-PARAM-DEF"/>
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
        "ecucaddinfoparamdefOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF"
    })
    public static class PARAMETERS {

        @XmlElements({
            @XmlElement(name = "ECUC-ADD-INFO-PARAM-DEF", type = ECUCADDINFOPARAMDEF.class),
            @XmlElement(name = "ECUC-BOOLEAN-PARAM-DEF", type = ECUCBOOLEANPARAMDEF.class),
            @XmlElement(name = "ECUC-ENUMERATION-PARAM-DEF", type = ECUCENUMERATIONPARAMDEF.class),
            @XmlElement(name = "ECUC-FLOAT-PARAM-DEF", type = ECUCFLOATPARAMDEF.class),
            @XmlElement(name = "ECUC-FUNCTION-NAME-DEF", type = ECUCFUNCTIONNAMEDEF.class),
            @XmlElement(name = "ECUC-INTEGER-PARAM-DEF", type = ECUCINTEGERPARAMDEF.class),
            @XmlElement(name = "ECUC-LINKER-SYMBOL-DEF", type = ECUCLINKERSYMBOLDEF.class),
            @XmlElement(name = "ECUC-MULTILINE-STRING-PARAM-DEF", type = ECUCMULTILINESTRINGPARAMDEF.class),
            @XmlElement(name = "ECUC-STRING-PARAM-DEF", type = ECUCSTRINGPARAMDEF.class)
        })
        protected List<Object> ecucaddinfoparamdefOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF;

        /**
         * Gets the value of the ecucaddinfoparamdefOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucaddinfoparamdefOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCADDINFOPARAMDEFOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCADDINFOPARAMDEF }
         * {@link ECUCBOOLEANPARAMDEF }
         * {@link ECUCENUMERATIONPARAMDEF }
         * {@link ECUCFLOATPARAMDEF }
         * {@link ECUCFUNCTIONNAMEDEF }
         * {@link ECUCINTEGERPARAMDEF }
         * {@link ECUCLINKERSYMBOLDEF }
         * {@link ECUCMULTILINESTRINGPARAMDEF }
         * {@link ECUCSTRINGPARAMDEF }
         * 
         * 
         */
        public List<Object> getECUCADDINFOPARAMDEFOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF() {
            if (ecucaddinfoparamdefOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF == null) {
                ecucaddinfoparamdefOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF = new ArrayList<Object>();
            }
            return this.ecucaddinfoparamdefOrECUCBOOLEANPARAMDEFOrECUCENUMERATIONPARAMDEF;
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
     *         &lt;element name="ECUC-CHOICE-REFERENCE-DEF" type="{http://autosar.org/schema/r4.0}ECUC-CHOICE-REFERENCE-DEF"/>
     *         &lt;element name="ECUC-FOREIGN-REFERENCE-DEF" type="{http://autosar.org/schema/r4.0}ECUC-FOREIGN-REFERENCE-DEF"/>
     *         &lt;element name="ECUC-INSTANCE-REFERENCE-DEF" type="{http://autosar.org/schema/r4.0}ECUC-INSTANCE-REFERENCE-DEF"/>
     *         &lt;element name="ECUC-REFERENCE-DEF" type="{http://autosar.org/schema/r4.0}ECUC-REFERENCE-DEF"/>
     *         &lt;element name="ECUC-SYMBOLIC-NAME-REFERENCE-DEF" type="{http://autosar.org/schema/r4.0}ECUC-SYMBOLIC-NAME-REFERENCE-DEF"/>
     *         &lt;element name="ECUC-URI-REFERENCE-DEF" type="{http://autosar.org/schema/r4.0}ECUC-URI-REFERENCE-DEF"/>
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
        "ecucchoicereferencedefOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF"
    })
    public static class REFERENCES {

        @XmlElements({
            @XmlElement(name = "ECUC-CHOICE-REFERENCE-DEF", type = ECUCCHOICEREFERENCEDEF.class),
            @XmlElement(name = "ECUC-FOREIGN-REFERENCE-DEF", type = ECUCFOREIGNREFERENCEDEF.class),
            @XmlElement(name = "ECUC-INSTANCE-REFERENCE-DEF", type = ECUCINSTANCEREFERENCEDEF.class),
            @XmlElement(name = "ECUC-REFERENCE-DEF", type = ECUCREFERENCEDEF.class),
            @XmlElement(name = "ECUC-SYMBOLIC-NAME-REFERENCE-DEF", type = ECUCSYMBOLICNAMEREFERENCEDEF.class),
            @XmlElement(name = "ECUC-URI-REFERENCE-DEF", type = ECUCURIREFERENCEDEF.class)
        })
        protected List<Object> ecucchoicereferencedefOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF;

        /**
         * Gets the value of the ecucchoicereferencedefOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucchoicereferencedefOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCCHOICEREFERENCEDEFOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCCHOICEREFERENCEDEF }
         * {@link ECUCFOREIGNREFERENCEDEF }
         * {@link ECUCINSTANCEREFERENCEDEF }
         * {@link ECUCREFERENCEDEF }
         * {@link ECUCSYMBOLICNAMEREFERENCEDEF }
         * {@link ECUCURIREFERENCEDEF }
         * 
         * 
         */
        public List<Object> getECUCCHOICEREFERENCEDEFOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF() {
            if (ecucchoicereferencedefOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF == null) {
                ecucchoicereferencedefOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF = new ArrayList<Object>();
            }
            return this.ecucchoicereferencedefOrECUCFOREIGNREFERENCEDEFOrECUCINSTANCEREFERENCEDEF;
        }

    }

}
