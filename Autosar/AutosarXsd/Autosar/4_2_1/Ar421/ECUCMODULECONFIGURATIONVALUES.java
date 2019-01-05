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
 * Head of the configuration of one Module. A Module can be a BSW module as well as the RTE and ECU Infrastructure.
 * 
 * As part of the BSW module description, the EcucModuleConfigurationValues element has two different roles:
 * 
 * The recommendedConfiguration contains parameter values recommended by the BSW module vendor. 
 * 
 * The preconfiguredConfiguration contains values for those parameters which are fixed by the implementation and cannot be changed.
 * 
 * These two EcucModuleConfigurationValues are used when the base EcucModuleConfigurationValues (as part of the base ECU configuration) is created to fill parameters with initial values.
 * 
 * <p>ECUC-MODULE-CONFIGURATION-VALUES complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-MODULE-CONFIGURATION-VALUES">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-MODULE-CONFIGURATION-VALUES"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECUC-MODULE-CONFIGURATION-VALUES", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "definitionref",
    "ecucdefedition",
    "implementationconfigvariant",
    "moduledescriptionref",
    "containers"
})
public class ECUCMODULECONFIGURATIONVALUES {

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
    @XmlElement(name = "DEFINITION-REF")
    protected ECUCMODULECONFIGURATIONVALUES.DEFINITIONREF definitionref;
    @XmlElement(name = "ECUC-DEF-EDITION")
    protected REVISIONLABELSTRING ecucdefedition;
    @XmlElement(name = "IMPLEMENTATION-CONFIG-VARIANT")
    protected ECUCCONFIGURATIONVARIANTENUM implementationconfigvariant;
    @XmlElement(name = "MODULE-DESCRIPTION-REF")
    protected ECUCMODULECONFIGURATIONVALUES.MODULEDESCRIPTIONREF moduledescriptionref;
    @XmlElement(name = "CONTAINERS")
    protected ECUCMODULECONFIGURATIONVALUES.CONTAINERS containers;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??definitionref?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCMODULECONFIGURATIONVALUES.DEFINITIONREF }
     *     
     */
    public ECUCMODULECONFIGURATIONVALUES.DEFINITIONREF getDEFINITIONREF() {
        return definitionref;
    }

    /**
     * ??definitionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCMODULECONFIGURATIONVALUES.DEFINITIONREF }
     *     
     */
    public void setDEFINITIONREF(ECUCMODULECONFIGURATIONVALUES.DEFINITIONREF value) {
        this.definitionref = value;
    }

    /**
     * ??ecucdefedition?????
     * 
     * @return
     *     possible object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public REVISIONLABELSTRING getECUCDEFEDITION() {
        return ecucdefedition;
    }

    /**
     * ??ecucdefedition?????
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONLABELSTRING }
     *     
     */
    public void setECUCDEFEDITION(REVISIONLABELSTRING value) {
        this.ecucdefedition = value;
    }

    /**
     * ??implementationconfigvariant?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONFIGURATIONVARIANTENUM }
     *     
     */
    public ECUCCONFIGURATIONVARIANTENUM getIMPLEMENTATIONCONFIGVARIANT() {
        return implementationconfigvariant;
    }

    /**
     * ??implementationconfigvariant?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONFIGURATIONVARIANTENUM }
     *     
     */
    public void setIMPLEMENTATIONCONFIGVARIANT(ECUCCONFIGURATIONVARIANTENUM value) {
        this.implementationconfigvariant = value;
    }

    /**
     * ??moduledescriptionref?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCMODULECONFIGURATIONVALUES.MODULEDESCRIPTIONREF }
     *     
     */
    public ECUCMODULECONFIGURATIONVALUES.MODULEDESCRIPTIONREF getMODULEDESCRIPTIONREF() {
        return moduledescriptionref;
    }

    /**
     * ??moduledescriptionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCMODULECONFIGURATIONVALUES.MODULEDESCRIPTIONREF }
     *     
     */
    public void setMODULEDESCRIPTIONREF(ECUCMODULECONFIGURATIONVALUES.MODULEDESCRIPTIONREF value) {
        this.moduledescriptionref = value;
    }

    /**
     * ??containers?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCMODULECONFIGURATIONVALUES.CONTAINERS }
     *     
     */
    public ECUCMODULECONFIGURATIONVALUES.CONTAINERS getCONTAINERS() {
        return containers;
    }

    /**
     * ??containers?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCMODULECONFIGURATIONVALUES.CONTAINERS }
     *     
     */
    public void setCONTAINERS(ECUCMODULECONFIGURATIONVALUES.CONTAINERS value) {
        this.containers = value;
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
     *         &lt;element name="ECUC-CONTAINER-VALUE" type="{http://autosar.org/schema/r4.0}ECUC-CONTAINER-VALUE"/>
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
        "ecuccontainervalue"
    })
    public static class CONTAINERS {

        @XmlElement(name = "ECUC-CONTAINER-VALUE")
        protected List<ECUCCONTAINERVALUE> ecuccontainervalue;

        /**
         * Gets the value of the ecuccontainervalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecuccontainervalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCCONTAINERVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCCONTAINERVALUE }
         * 
         * 
         */
        public List<ECUCCONTAINERVALUE> getECUCCONTAINERVALUE() {
            if (ecuccontainervalue == null) {
                ecuccontainervalue = new ArrayList<ECUCCONTAINERVALUE>();
            }
            return this.ecuccontainervalue;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-MODULE-DEF--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DEFINITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUCMODULEDEFSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUCMODULEDEFSUBTYPESENUM }
         *     
         */
        public ECUCMODULEDEFSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUCMODULEDEFSUBTYPESENUM }
         *     
         */
        public void setDEST(ECUCMODULEDEFSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-IMPLEMENTATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MODULEDESCRIPTIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWIMPLEMENTATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWIMPLEMENTATIONSUBTYPESENUM }
         *     
         */
        public BSWIMPLEMENTATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWIMPLEMENTATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWIMPLEMENTATIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
