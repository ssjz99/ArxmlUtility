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
 * The ParameterSwComponentType defines parameters and characteristic values accessible via provided Ports. The provided values are the same for all connected SwComponentPrototypes
 * 
 * <p>PARAMETER-SW-COMPONENT-TYPE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PARAMETER-SW-COMPONENT-TYPE">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PARAMETER-SW-COMPONENT-TYPE"/>
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
@XmlType(name = "PARAMETER-SW-COMPONENT-TYPE", propOrder = {
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
    "constantmappingrefs",
    "datatypemappingrefs",
    "instantiationdatadefpropss"
})
public class PARAMETERSWCOMPONENTTYPE {

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
    protected PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS swcomponentdocumentations;
    @XmlElement(name = "CONSISTENCY-NEEDSS")
    protected PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS consistencyneedss;
    @XmlElement(name = "PORTS")
    protected PARAMETERSWCOMPONENTTYPE.PORTS ports;
    @XmlElement(name = "PORT-GROUPS")
    protected PARAMETERSWCOMPONENTTYPE.PORTGROUPS portgroups;
    @XmlElement(name = "UNIT-GROUP-REFS")
    protected PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS unitgrouprefs;
    @XmlElement(name = "CONSTANT-MAPPING-REFS")
    protected PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS constantmappingrefs;
    @XmlElement(name = "DATA-TYPE-MAPPING-REFS")
    protected PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS datatypemappingrefs;
    @XmlElement(name = "INSTANTIATION-DATA-DEF-PROPSS")
    protected PARAMETERSWCOMPONENTTYPE.INSTANTIATIONDATADEFPROPSS instantiationdatadefpropss;
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
     *     {@link PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS getSWCOMPONENTDOCUMENTATIONS() {
        return swcomponentdocumentations;
    }

    /**
     * ??swcomponentdocumentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS }
     *     
     */
    public void setSWCOMPONENTDOCUMENTATIONS(PARAMETERSWCOMPONENTTYPE.SWCOMPONENTDOCUMENTATIONS value) {
        this.swcomponentdocumentations = value;
    }

    /**
     * ??consistencyneedss?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS getCONSISTENCYNEEDSS() {
        return consistencyneedss;
    }

    /**
     * ??consistencyneedss?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS }
     *     
     */
    public void setCONSISTENCYNEEDSS(PARAMETERSWCOMPONENTTYPE.CONSISTENCYNEEDSS value) {
        this.consistencyneedss = value;
    }

    /**
     * ??ports?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSWCOMPONENTTYPE.PORTS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.PORTS getPORTS() {
        return ports;
    }

    /**
     * ??ports?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.PORTS }
     *     
     */
    public void setPORTS(PARAMETERSWCOMPONENTTYPE.PORTS value) {
        this.ports = value;
    }

    /**
     * ??portgroups?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSWCOMPONENTTYPE.PORTGROUPS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.PORTGROUPS getPORTGROUPS() {
        return portgroups;
    }

    /**
     * ??portgroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.PORTGROUPS }
     *     
     */
    public void setPORTGROUPS(PARAMETERSWCOMPONENTTYPE.PORTGROUPS value) {
        this.portgroups = value;
    }

    /**
     * ??unitgrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS getUNITGROUPREFS() {
        return unitgrouprefs;
    }

    /**
     * ??unitgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS }
     *     
     */
    public void setUNITGROUPREFS(PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS value) {
        this.unitgrouprefs = value;
    }

    /**
     * ??constantmappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS getCONSTANTMAPPINGREFS() {
        return constantmappingrefs;
    }

    /**
     * ??constantmappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS }
     *     
     */
    public void setCONSTANTMAPPINGREFS(PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS value) {
        this.constantmappingrefs = value;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS getDATATYPEMAPPINGREFS() {
        return datatypemappingrefs;
    }

    /**
     * ??datatypemappingrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS }
     *     
     */
    public void setDATATYPEMAPPINGREFS(PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS value) {
        this.datatypemappingrefs = value;
    }

    /**
     * ??instantiationdatadefpropss?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERSWCOMPONENTTYPE.INSTANTIATIONDATADEFPROPSS }
     *     
     */
    public PARAMETERSWCOMPONENTTYPE.INSTANTIATIONDATADEFPROPSS getINSTANTIATIONDATADEFPROPSS() {
        return instantiationdatadefpropss;
    }

    /**
     * ??instantiationdatadefpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERSWCOMPONENTTYPE.INSTANTIATIONDATADEFPROPSS }
     *     
     */
    public void setINSTANTIATIONDATADEFPROPSS(PARAMETERSWCOMPONENTTYPE.INSTANTIATIONDATADEFPROPSS value) {
        this.instantiationdatadefpropss = value;
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
     *         &lt;element name="CONSISTENCY-NEEDS" type="{http://autosar.org/schema/r4.0}CONSISTENCY-NEEDS"/>
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
        "consistencyneeds"
    })
    public static class CONSISTENCYNEEDSS {

        @XmlElement(name = "CONSISTENCY-NEEDS")
        protected List<CONSISTENCYNEEDS> consistencyneeds;

        /**
         * Gets the value of the consistencyneeds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the consistencyneeds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSISTENCYNEEDS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CONSISTENCYNEEDS }
         * 
         * 
         */
        public List<CONSISTENCYNEEDS> getCONSISTENCYNEEDS() {
            if (consistencyneeds == null) {
                consistencyneeds = new ArrayList<CONSISTENCYNEEDS>();
            }
            return this.consistencyneeds;
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
     *         &lt;element name="CONSTANT-MAPPING-REF">
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
        "constantmappingref"
    })
    public static class CONSTANTMAPPINGREFS {

        @XmlElement(name = "CONSTANT-MAPPING-REF")
        protected List<PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS.CONSTANTMAPPINGREF> constantmappingref;

        /**
         * Gets the value of the constantmappingref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constantmappingref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSTANTMAPPINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS.CONSTANTMAPPINGREF }
         * 
         * 
         */
        public List<PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS.CONSTANTMAPPINGREF> getCONSTANTMAPPINGREF() {
            if (constantmappingref == null) {
                constantmappingref = new ArrayList<PARAMETERSWCOMPONENTTYPE.CONSTANTMAPPINGREFS.CONSTANTMAPPINGREF>();
            }
            return this.constantmappingref;
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
        public static class CONSTANTMAPPINGREF
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
        protected List<PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> datatypemappingref;

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
         * {@link PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF }
         * 
         * 
         */
        public List<PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF> getDATATYPEMAPPINGREF() {
            if (datatypemappingref == null) {
                datatypemappingref = new ArrayList<PARAMETERSWCOMPONENTTYPE.DATATYPEMAPPINGREFS.DATATYPEMAPPINGREF>();
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
     *         &lt;element name="INSTANTIATION-DATA-DEF-PROPS" type="{http://autosar.org/schema/r4.0}INSTANTIATION-DATA-DEF-PROPS"/>
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
        "instantiationdatadefprops"
    })
    public static class INSTANTIATIONDATADEFPROPSS {

        @XmlElement(name = "INSTANTIATION-DATA-DEF-PROPS")
        protected List<INSTANTIATIONDATADEFPROPS> instantiationdatadefprops;

        /**
         * Gets the value of the instantiationdatadefprops property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instantiationdatadefprops property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSTANTIATIONDATADEFPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSTANTIATIONDATADEFPROPS }
         * 
         * 
         */
        public List<INSTANTIATIONDATADEFPROPS> getINSTANTIATIONDATADEFPROPS() {
            if (instantiationdatadefprops == null) {
                instantiationdatadefprops = new ArrayList<INSTANTIATIONDATADEFPROPS>();
            }
            return this.instantiationdatadefprops;
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
     *         &lt;element name="PORT-GROUP" type="{http://autosar.org/schema/r4.0}PORT-GROUP"/>
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
        "portgroup"
    })
    public static class PORTGROUPS {

        @XmlElement(name = "PORT-GROUP")
        protected List<PORTGROUP> portgroup;

        /**
         * Gets the value of the portgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPORTGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PORTGROUP }
         * 
         * 
         */
        public List<PORTGROUP> getPORTGROUP() {
            if (portgroup == null) {
                portgroup = new ArrayList<PORTGROUP>();
            }
            return this.portgroup;
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
     *         &lt;element name="P-PORT-PROTOTYPE" type="{http://autosar.org/schema/r4.0}P-PORT-PROTOTYPE"/>
     *         &lt;element name="PR-PORT-PROTOTYPE" type="{http://autosar.org/schema/r4.0}PR-PORT-PROTOTYPE"/>
     *         &lt;element name="R-PORT-PROTOTYPE" type="{http://autosar.org/schema/r4.0}R-PORT-PROTOTYPE"/>
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
        "pportprototypeOrPRPORTPROTOTYPEOrRPORTPROTOTYPE"
    })
    public static class PORTS {

        @XmlElements({
            @XmlElement(name = "P-PORT-PROTOTYPE", type = PPORTPROTOTYPE.class),
            @XmlElement(name = "PR-PORT-PROTOTYPE", type = PRPORTPROTOTYPE.class),
            @XmlElement(name = "R-PORT-PROTOTYPE", type = RPORTPROTOTYPE.class)
        })
        protected List<Object> pportprototypeOrPRPORTPROTOTYPEOrRPORTPROTOTYPE;

        /**
         * Gets the value of the pportprototypeOrPRPORTPROTOTYPEOrRPORTPROTOTYPE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pportprototypeOrPRPORTPROTOTYPEOrRPORTPROTOTYPE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPPORTPROTOTYPEOrPRPORTPROTOTYPEOrRPORTPROTOTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PPORTPROTOTYPE }
         * {@link PRPORTPROTOTYPE }
         * {@link RPORTPROTOTYPE }
         * 
         * 
         */
        public List<Object> getPPORTPROTOTYPEOrPRPORTPROTOTYPEOrRPORTPROTOTYPE() {
            if (pportprototypeOrPRPORTPROTOTYPEOrRPORTPROTOTYPE == null) {
                pportprototypeOrPRPORTPROTOTYPEOrRPORTPROTOTYPE = new ArrayList<Object>();
            }
            return this.pportprototypeOrPRPORTPROTOTYPEOrRPORTPROTOTYPE;
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
     *         &lt;element name="SW-COMPONENT-DOCUMENTATION" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-DOCUMENTATION"/>
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
        "swcomponentdocumentation"
    })
    public static class SWCOMPONENTDOCUMENTATIONS {

        @XmlElement(name = "SW-COMPONENT-DOCUMENTATION")
        protected List<SWCOMPONENTDOCUMENTATION> swcomponentdocumentation;

        /**
         * Gets the value of the swcomponentdocumentation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swcomponentdocumentation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSWCOMPONENTDOCUMENTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SWCOMPONENTDOCUMENTATION }
         * 
         * 
         */
        public List<SWCOMPONENTDOCUMENTATION> getSWCOMPONENTDOCUMENTATION() {
            if (swcomponentdocumentation == null) {
                swcomponentdocumentation = new ArrayList<SWCOMPONENTDOCUMENTATION>();
            }
            return this.swcomponentdocumentation;
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
     *         &lt;element name="UNIT-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}UNIT-GROUP--SUBTYPES-ENUM" />
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
        "unitgroupref"
    })
    public static class UNITGROUPREFS {

        @XmlElement(name = "UNIT-GROUP-REF")
        protected List<PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS.UNITGROUPREF> unitgroupref;

        /**
         * Gets the value of the unitgroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unitgroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUNITGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS.UNITGROUPREF }
         * 
         * 
         */
        public List<PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS.UNITGROUPREF> getUNITGROUPREF() {
            if (unitgroupref == null) {
                unitgroupref = new ArrayList<PARAMETERSWCOMPONENTTYPE.UNITGROUPREFS.UNITGROUPREF>();
            }
            return this.unitgroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}UNIT-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UNITGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected UNITGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link UNITGROUPSUBTYPESENUM }
             *     
             */
            public UNITGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link UNITGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(UNITGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
