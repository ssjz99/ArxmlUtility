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
 * Used to define configuration containers that can hierarchically contain other containers and/or parameter definitions.
 * 
 * <p>ECUC-PARAM-CONF-CONTAINER-DEF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-PARAM-CONF-CONTAINER-DEF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-DEFINITION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-DEFINITION-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-CONTAINER-DEF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-PARAM-CONF-CONTAINER-DEF"/>
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
@XmlType(name = "ECUC-PARAM-CONF-CONTAINER-DEF", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "ecucvalidationconds",
    "ecuccond",
    "lowermultiplicity",
    "uppermultiplicity",
    "uppermultiplicityinfinite",
    "scope",
    "destinationurirefs",
    "multiplicityconfigclasses",
    "postbuildchangeable",
    "postbuildvariantmultiplicity",
    "requiresindex",
    "multipleconfigurationcontainer",
    "parameters",
    "references",
    "subcontainers"
})
public class ECUCPARAMCONFCONTAINERDEF {

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
    @XmlElement(name = "ECUC-VALIDATION-CONDS")
    protected ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS ecucvalidationconds;
    @XmlElement(name = "ECUC-COND")
    protected ECUCCONDITIONSPECIFICATION ecuccond;
    @XmlElement(name = "LOWER-MULTIPLICITY")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT lowermultiplicity;
    @XmlElement(name = "UPPER-MULTIPLICITY")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT uppermultiplicity;
    @XmlElement(name = "UPPER-MULTIPLICITY-INFINITE")
    protected BOOLEANVALUEVARIATIONPOINT uppermultiplicityinfinite;
    @XmlElement(name = "SCOPE")
    protected ECUCSCOPEENUM scope;
    @XmlElement(name = "DESTINATION-URI-REFS")
    protected ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS destinationurirefs;
    @XmlElement(name = "MULTIPLICITY-CONFIG-CLASSES")
    protected ECUCPARAMCONFCONTAINERDEF.MULTIPLICITYCONFIGCLASSES multiplicityconfigclasses;
    @XmlElement(name = "POST-BUILD-CHANGEABLE")
    protected BOOLEAN postbuildchangeable;
    @XmlElement(name = "POST-BUILD-VARIANT-MULTIPLICITY")
    protected BOOLEAN postbuildvariantmultiplicity;
    @XmlElement(name = "REQUIRES-INDEX")
    protected BOOLEAN requiresindex;
    @XmlElement(name = "MULTIPLE-CONFIGURATION-CONTAINER")
    protected BOOLEAN multipleconfigurationcontainer;
    @XmlElement(name = "PARAMETERS")
    protected ECUCPARAMCONFCONTAINERDEF.PARAMETERS parameters;
    @XmlElement(name = "REFERENCES")
    protected ECUCPARAMCONFCONTAINERDEF.REFERENCES references;
    @XmlElement(name = "SUB-CONTAINERS")
    protected ECUCPARAMCONFCONTAINERDEF.SUBCONTAINERS subcontainers;
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
     * ??ecucvalidationconds?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS }
     *     
     */
    public ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS getECUCVALIDATIONCONDS() {
        return ecucvalidationconds;
    }

    /**
     * ??ecucvalidationconds?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS }
     *     
     */
    public void setECUCVALIDATIONCONDS(ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS value) {
        this.ecucvalidationconds = value;
    }

    /**
     * ??ecuccond?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONDITIONSPECIFICATION }
     *     
     */
    public ECUCCONDITIONSPECIFICATION getECUCCOND() {
        return ecuccond;
    }

    /**
     * ??ecuccond?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONDITIONSPECIFICATION }
     *     
     */
    public void setECUCCOND(ECUCCONDITIONSPECIFICATION value) {
        this.ecuccond = value;
    }

    /**
     * ??lowermultiplicity?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getLOWERMULTIPLICITY() {
        return lowermultiplicity;
    }

    /**
     * ??lowermultiplicity?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setLOWERMULTIPLICITY(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.lowermultiplicity = value;
    }

    /**
     * ??uppermultiplicity?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getUPPERMULTIPLICITY() {
        return uppermultiplicity;
    }

    /**
     * ??uppermultiplicity?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setUPPERMULTIPLICITY(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.uppermultiplicity = value;
    }

    /**
     * ??uppermultiplicityinfinite?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEANVALUEVARIATIONPOINT }
     *     
     */
    public BOOLEANVALUEVARIATIONPOINT getUPPERMULTIPLICITYINFINITE() {
        return uppermultiplicityinfinite;
    }

    /**
     * ??uppermultiplicityinfinite?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEANVALUEVARIATIONPOINT }
     *     
     */
    public void setUPPERMULTIPLICITYINFINITE(BOOLEANVALUEVARIATIONPOINT value) {
        this.uppermultiplicityinfinite = value;
    }

    /**
     * ??scope?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCSCOPEENUM }
     *     
     */
    public ECUCSCOPEENUM getSCOPE() {
        return scope;
    }

    /**
     * ??scope?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCSCOPEENUM }
     *     
     */
    public void setSCOPE(ECUCSCOPEENUM value) {
        this.scope = value;
    }

    /**
     * ??destinationurirefs?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS }
     *     
     */
    public ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS getDESTINATIONURIREFS() {
        return destinationurirefs;
    }

    /**
     * ??destinationurirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS }
     *     
     */
    public void setDESTINATIONURIREFS(ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS value) {
        this.destinationurirefs = value;
    }

    /**
     * ??multiplicityconfigclasses?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.MULTIPLICITYCONFIGCLASSES }
     *     
     */
    public ECUCPARAMCONFCONTAINERDEF.MULTIPLICITYCONFIGCLASSES getMULTIPLICITYCONFIGCLASSES() {
        return multiplicityconfigclasses;
    }

    /**
     * ??multiplicityconfigclasses?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.MULTIPLICITYCONFIGCLASSES }
     *     
     */
    public void setMULTIPLICITYCONFIGCLASSES(ECUCPARAMCONFCONTAINERDEF.MULTIPLICITYCONFIGCLASSES value) {
        this.multiplicityconfigclasses = value;
    }

    /**
     * ??postbuildchangeable?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPOSTBUILDCHANGEABLE() {
        return postbuildchangeable;
    }

    /**
     * ??postbuildchangeable?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPOSTBUILDCHANGEABLE(BOOLEAN value) {
        this.postbuildchangeable = value;
    }

    /**
     * ??postbuildvariantmultiplicity?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPOSTBUILDVARIANTMULTIPLICITY() {
        return postbuildvariantmultiplicity;
    }

    /**
     * ??postbuildvariantmultiplicity?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPOSTBUILDVARIANTMULTIPLICITY(BOOLEAN value) {
        this.postbuildvariantmultiplicity = value;
    }

    /**
     * ??requiresindex?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getREQUIRESINDEX() {
        return requiresindex;
    }

    /**
     * ??requiresindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setREQUIRESINDEX(BOOLEAN value) {
        this.requiresindex = value;
    }

    /**
     * ??multipleconfigurationcontainer?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getMULTIPLECONFIGURATIONCONTAINER() {
        return multipleconfigurationcontainer;
    }

    /**
     * ??multipleconfigurationcontainer?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setMULTIPLECONFIGURATIONCONTAINER(BOOLEAN value) {
        this.multipleconfigurationcontainer = value;
    }

    /**
     * ??parameters?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.PARAMETERS }
     *     
     */
    public ECUCPARAMCONFCONTAINERDEF.PARAMETERS getPARAMETERS() {
        return parameters;
    }

    /**
     * ??parameters?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.PARAMETERS }
     *     
     */
    public void setPARAMETERS(ECUCPARAMCONFCONTAINERDEF.PARAMETERS value) {
        this.parameters = value;
    }

    /**
     * ??references?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.REFERENCES }
     *     
     */
    public ECUCPARAMCONFCONTAINERDEF.REFERENCES getREFERENCES() {
        return references;
    }

    /**
     * ??references?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.REFERENCES }
     *     
     */
    public void setREFERENCES(ECUCPARAMCONFCONTAINERDEF.REFERENCES value) {
        this.references = value;
    }

    /**
     * ??subcontainers?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.SUBCONTAINERS }
     *     
     */
    public ECUCPARAMCONFCONTAINERDEF.SUBCONTAINERS getSUBCONTAINERS() {
        return subcontainers;
    }

    /**
     * ??subcontainers?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCPARAMCONFCONTAINERDEF.SUBCONTAINERS }
     *     
     */
    public void setSUBCONTAINERS(ECUCPARAMCONFCONTAINERDEF.SUBCONTAINERS value) {
        this.subcontainers = value;
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
     *         &lt;element name="DESTINATION-URI-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-DESTINATION-URI-DEF--SUBTYPES-ENUM" />
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
        "destinationuriref"
    })
    public static class DESTINATIONURIREFS {

        @XmlElement(name = "DESTINATION-URI-REF")
        protected List<ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS.DESTINATIONURIREF> destinationuriref;

        /**
         * Gets the value of the destinationuriref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destinationuriref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDESTINATIONURIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS.DESTINATIONURIREF }
         * 
         * 
         */
        public List<ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS.DESTINATIONURIREF> getDESTINATIONURIREF() {
            if (destinationuriref == null) {
                destinationuriref = new ArrayList<ECUCPARAMCONFCONTAINERDEF.DESTINATIONURIREFS.DESTINATIONURIREF>();
            }
            return this.destinationuriref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-DESTINATION-URI-DEF--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DESTINATIONURIREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ECUCDESTINATIONURIDEFSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ECUCDESTINATIONURIDEFSUBTYPESENUM }
             *     
             */
            public ECUCDESTINATIONURIDEFSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ECUCDESTINATIONURIDEFSUBTYPESENUM }
             *     
             */
            public void setDEST(ECUCDESTINATIONURIDEFSUBTYPESENUM value) {
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
     *         &lt;element name="ECUC-MULTIPLICITY-CONFIGURATION-CLASS" type="{http://autosar.org/schema/r4.0}ECUC-MULTIPLICITY-CONFIGURATION-CLASS"/>
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
        "ecucmultiplicityconfigurationclass"
    })
    public static class MULTIPLICITYCONFIGCLASSES {

        @XmlElement(name = "ECUC-MULTIPLICITY-CONFIGURATION-CLASS")
        protected List<ECUCMULTIPLICITYCONFIGURATIONCLASS> ecucmultiplicityconfigurationclass;

        /**
         * Gets the value of the ecucmultiplicityconfigurationclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucmultiplicityconfigurationclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCMULTIPLICITYCONFIGURATIONCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCMULTIPLICITYCONFIGURATIONCLASS }
         * 
         * 
         */
        public List<ECUCMULTIPLICITYCONFIGURATIONCLASS> getECUCMULTIPLICITYCONFIGURATIONCLASS() {
            if (ecucmultiplicityconfigurationclass == null) {
                ecucmultiplicityconfigurationclass = new ArrayList<ECUCMULTIPLICITYCONFIGURATIONCLASS>();
            }
            return this.ecucmultiplicityconfigurationclass;
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
    public static class SUBCONTAINERS {

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

}
