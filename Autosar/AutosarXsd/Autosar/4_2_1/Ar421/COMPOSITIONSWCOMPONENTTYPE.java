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
 * A CompositionSwComponentType aggregates SwComponentPrototypes (that in turn are typed by SwComponentTypes) as well as SwConnectors for primarily connecting SwComponentPrototypes among each others and towards the surface of the CompositionSwComponentType. By this means hierarchical structures of software-components can be created.
 * 
 * <p>COMPOSITION-SW-COMPONENT-TYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPOSITION-SW-COMPONENT-TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-CLASSIFIER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-TYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-COMPONENT-TYPE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPOSITION-SW-COMPONENT-TYPE"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPOSITION-SW-COMPONENT-TYPE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "blueprintpolicys",
    "shortnamepattern",
    "swcomponentdocumentations",
    "consistencyneedss",
    "ports",
    "portgroups",
    "unitgrouprefs",
    "components",
    "connectors",
    "constantvaluemappingrefs",
    "datatypemappingrefs",
    "instantiationrteeventpropss"
})
public class COMPOSITIONSWCOMPONENTTYPE {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "SW-COMPONENT-DOCUMENTATIONS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS swcomponentdocumentations;
    @XmlElement(name = "CONSISTENCY-NEEDSS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS consistencyneedss;
    @XmlElement(name = "PORTS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.PORTS ports;
    @XmlElement(name = "PORT-GROUPS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS portgroups;
    @XmlElement(name = "UNIT-GROUP-REFS")
    protected Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS unitgrouprefs;
    @XmlElement(name = "COMPONENTS")
    protected COMPOSITIONSWCOMPONENTTYPE.COMPONENTS components;
    @XmlElement(name = "CONNECTORS")
    protected COMPOSITIONSWCOMPONENTTYPE.CONNECTORS connectors;
    @XmlElement(name = "CONSTANT-VALUE-MAPPING-REFS")
    protected COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS constantvaluemappingrefs;
    @XmlElement(name = "DATA-TYPE-MAPPING-REFS")
    protected COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS datatypemappingrefs;
    @XmlElement(name = "INSTANTIATION-RTE-EVENT-PROPSS")
    protected COMPOSITIONSWCOMPONENTTYPE.INSTANTIATIONRTEEVENTPROPSS instantiationrteeventpropss;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
    }

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
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
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
     * ??blueprintpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public Ar421.FLATMAP.BLUEPRINTPOLICYS getBLUEPRINTPOLICYS() {
        return blueprintpolicys;
    }

    /**
     * ??blueprintpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public void setBLUEPRINTPOLICYS(Ar421.FLATMAP.BLUEPRINTPOLICYS value) {
        this.blueprintpolicys = value;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSHORTNAMEPATTERN() {
        return shortnamepattern;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSHORTNAMEPATTERN(STRING value) {
        this.shortnamepattern = value;
    }

    /**
     * ??swcomponentdocumentations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS getSWCOMPONENTDOCUMENTATIONS() {
        return swcomponentdocumentations;
    }

    /**
     * ??swcomponentdocumentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS }
     *     
     */
    public void setSWCOMPONENTDOCUMENTATIONS(Ar421.PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS value) {
        this.swcomponentdocumentations = value;
    }

    /**
     * ??consistencyneedss?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS getCONSISTENCYNEEDSS() {
        return consistencyneedss;
    }

    /**
     * ??consistencyneedss?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS }
     *     
     */
    public void setCONSISTENCYNEEDSS(Ar421.PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS value) {
        this.consistencyneedss = value;
    }

    /**
     * ??ports?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.PORTS getPORTS() {
        return ports;
    }

    /**
     * ??ports?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTS }
     *     
     */
    public void setPORTS(Ar421.PARAMETERSWCOMPONENTTYPE.PORTS value) {
        this.ports = value;
    }

    /**
     * ??portgroups?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS getPORTGROUPS() {
        return portgroups;
    }

    /**
     * ??portgroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS }
     *     
     */
    public void setPORTGROUPS(Ar421.PARAMETERSWCOMPONENTTYPE.PORTGROUPS value) {
        this.portgroups = value;
    }

    /**
     * ??unitgrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS }
     *     
     */
    public Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS getUNITGROUPREFS() {
        return unitgrouprefs;
    }

    /**
     * ??unitgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS }
     *     
     */
    public void setUNITGROUPREFS(Ar421.PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS value) {
        this.unitgrouprefs = value;
    }

    /**
     * ??components?????
     * 
     * @return
     *     possible object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.COMPONENTS }
     *     
     */
    public COMPOSITIONSWCOMPONENTTYPE.COMPONENTS getCOMPONENTS() {
        return components;
    }

    /**
     * ??components?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.COMPONENTS }
     *     
     */
    public void setCOMPONENTS(COMPOSITIONSWCOMPONENTTYPE.COMPONENTS value) {
        this.components = value;
    }

    /**
     * ??connectors?????
     * 
     * @return
     *     possible object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.CONNECTORS }
     *     
     */
    public COMPOSITIONSWCOMPONENTTYPE.CONNECTORS getCONNECTORS() {
        return connectors;
    }

    /**
     * ??connectors?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.CONNECTORS }
     *     
     */
    public void setCONNECTORS(COMPOSITIONSWCOMPONENTTYPE.CONNECTORS value) {
        this.connectors = value;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS getCONSTANTVALUEMAPPINGREFS() {
        return constantvaluemappingrefs;
    }

    /**
     * ??constantvaluemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS }
     *     
     */
    public void setCONSTANTVALUEMAPPINGREFS(COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS value) {
        this.constantvaluemappingrefs = value;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS }
     *     
     */
    public COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS getDATATYPEMAPPINGREFS() {
        return datatypemappingrefs;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS }
     *     
     */
    public void setDATATYPEMAPPINGREFS(COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS value) {
        this.datatypemappingrefs = value;
    }

    /**
     * ??instantiationrteeventpropss?????
     * 
     * @return
     *     possible object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.INSTANTIATIONRTEEVENTPROPSS }
     *     
     */
    public COMPOSITIONSWCOMPONENTTYPE.INSTANTIATIONRTEEVENTPROPSS getINSTANTIATIONRTEEVENTPROPSS() {
        return instantiationrteeventpropss;
    }

    /**
     * ??instantiationrteeventpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPOSITIONSWCOMPONENTTYPE.INSTANTIATIONRTEEVENTPROPSS }
     *     
     */
    public void setINSTANTIATIONRTEEVENTPROPSS(COMPOSITIONSWCOMPONENTTYPE.INSTANTIATIONRTEEVENTPROPSS value) {
        this.instantiationrteeventpropss = value;
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
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *         &lt;element name="SW-COMPONENT-PROTOTYPE" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-PROTOTYPE"/>
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
        "swcomponentprototype"
    })
    public static class COMPONENTS {

        @XmlElement(name = "SW-COMPONENT-PROTOTYPE")
        protected List<SWCOMPONENTPROTOTYPE> swcomponentprototype;

        /**
         * Gets the value of the swcomponentprototype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcomponentprototype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCOMPONENTPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCOMPONENTPROTOTYPE }
         * 
         * 
         */
        public List<SWCOMPONENTPROTOTYPE> getSWCOMPONENTPROTOTYPE() {
            if (swcomponentprototype == null) {
                swcomponentprototype = new ArrayList<SWCOMPONENTPROTOTYPE>();
            }
            return this.swcomponentprototype;
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
     *         &lt;element name="ASSEMBLY-SW-CONNECTOR" type="{http://autosar.org/schema/r4.0}ASSEMBLY-SW-CONNECTOR"/>
     *         &lt;element name="DELEGATION-SW-CONNECTOR" type="{http://autosar.org/schema/r4.0}DELEGATION-SW-CONNECTOR"/>
     *         &lt;element name="PASS-THROUGH-SW-CONNECTOR" type="{http://autosar.org/schema/r4.0}PASS-THROUGH-SW-CONNECTOR"/>
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
        "assemblyswconnectorOrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR"
    })
    public static class CONNECTORS {

        @XmlElements({
            @XmlElement(name = "ASSEMBLY-SW-CONNECTOR", type = ASSEMBLYSWCONNECTOR.class),
            @XmlElement(name = "DELEGATION-SW-CONNECTOR", type = DELEGATIONSWCONNECTOR.class),
            @XmlElement(name = "PASS-THROUGH-SW-CONNECTOR", type = PASSTHROUGHSWCONNECTOR.class)
        })
        protected List<Object> assemblyswconnectorOrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR;

        /**
         * Gets the value of the assemblyswconnectorOrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assemblyswconnectorOrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSEMBLYSWCONNECTOROrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASSEMBLYSWCONNECTOR }
         * {@link DELEGATIONSWCONNECTOR }
         * {@link PASSTHROUGHSWCONNECTOR }
         * 
         * 
         */
        public List<Object> getASSEMBLYSWCONNECTOROrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR() {
            if (assemblyswconnectorOrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR == null) {
                assemblyswconnectorOrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR = new ArrayList<Object>();
            }
            return this.assemblyswconnectorOrDELEGATIONSWCONNECTOROrPASSTHROUGHSWCONNECTOR;
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
     *         &lt;element name="CONSTANT-VALUE-MAPPING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING-SET--SUBTYPES-ENUM" />
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
        "constantvaluemappingref"
    })
    public static class CONSTANTVALUEMAPPINGREFS {

        @XmlElement(name = "CONSTANT-VALUE-MAPPING-REF")
        protected List<COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF> constantvaluemappingref;

        /**
         * Gets the value of the constantvaluemappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constantvaluemappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSTANTVALUEMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF }
         * 
         * 
         */
        public List<COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF> getCONSTANTVALUEMAPPINGREF() {
            if (constantvaluemappingref == null) {
                constantvaluemappingref = new ArrayList<COMPOSITIONSWCOMPONENTTYPE.CONSTANTVALUEMAPPINGREFS.CONSTANTVALUEMAPPINGREF>();
            }
            return this.constantvaluemappingref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONSTANTVALUEMAPPINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM }
             *     
             */
            public CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM }
             *     
             */
            public void setDEST(CONSTANTSPECIFICATIONMAPPINGSETSUBTYPESENUM value) {
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
     *         &lt;element name="DATA-TYPE-MAPPING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-TYPE-MAPPING-SET--SUBTYPES-ENUM" />
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
        "datatypemappingref"
    })
    public static class DATATYPEMAPPINGREFS {

        @XmlElement(name = "DATA-TYPE-MAPPING-REF")
        protected List<COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> datatypemappingref;

        /**
         * Gets the value of the datatypemappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datatypemappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATATYPEMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF }
         * 
         * 
         */
        public List<COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> getDATATYPEMAPPINGREF() {
            if (datatypemappingref == null) {
                datatypemappingref = new ArrayList<COMPOSITIONSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF>();
            }
            return this.datatypemappingref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-TYPE-MAPPING-SET--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DATATYPEMAPPINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected DATATYPEMAPPINGSETSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link DATATYPEMAPPINGSETSUBTYPESENUM }
             *     
             */
            public DATATYPEMAPPINGSETSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link DATATYPEMAPPINGSETSUBTYPESENUM }
             *     
             */
            public void setDEST(DATATYPEMAPPINGSETSUBTYPESENUM value) {
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
     *         &lt;element name="INSTANTIATION-TIMING-EVENT-PROPS" type="{http://autosar.org/schema/r4.0}INSTANTIATION-TIMING-EVENT-PROPS"/>
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
        "instantiationtimingeventprops"
    })
    public static class INSTANTIATIONRTEEVENTPROPSS {

        @XmlElement(name = "INSTANTIATION-TIMING-EVENT-PROPS")
        protected List<INSTANTIATIONTIMINGEVENTPROPS> instantiationtimingeventprops;

        /**
         * Gets the value of the instantiationtimingeventprops property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instantiationtimingeventprops property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSTANTIATIONTIMINGEVENTPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSTANTIATIONTIMINGEVENTPROPS }
         * 
         * 
         */
        public List<INSTANTIATIONTIMINGEVENTPROPS> getINSTANTIATIONTIMINGEVENTPROPS() {
            if (instantiationtimingeventprops == null) {
                instantiationtimingeventprops = new ArrayList<INSTANTIATIONTIMINGEVENTPROPS>();
            }
            return this.instantiationtimingeventprops;
        }

    }

}
