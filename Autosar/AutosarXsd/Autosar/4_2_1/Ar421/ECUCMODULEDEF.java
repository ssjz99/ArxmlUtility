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
 * Used as the top-level element for configuration definition for Software Modules, including BSW and RTE as well as ECU Infrastructure.
 * 
 * <p>ECUC-MODULE-DEF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-MODULE-DEF">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-DEFINITION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-DEFINITION-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-MODULE-DEF"/>
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
@XmlType(name = "ECUC-MODULE-DEF", propOrder = {
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
    "ecucvalidationconds",
    "ecuccond",
    "lowermultiplicity",
    "uppermultiplicity",
    "uppermultiplicityinfinite",
    "scope",
    "apiserviceprefix",
    "postbuildvariantsupport",
    "refinedmoduledefref",
    "supportedconfigvariants",
    "containers"
})
public class ECUCMODULEDEF {

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
    @XmlElement(name = "ECUC-VALIDATION-CONDS")
    protected Ar421.ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS ecucvalidationconds;
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
    @XmlElement(name = "API-SERVICE-PREFIX")
    protected CIDENTIFIER apiserviceprefix;
    @XmlElement(name = "POST-BUILD-VARIANT-SUPPORT")
    protected BOOLEAN postbuildvariantsupport;
    @XmlElement(name = "REFINED-MODULE-DEF-REF")
    protected ECUCMODULEDEF.REFINEDMODULEDEFREF refinedmoduledefref;
    @XmlElement(name = "SUPPORTED-CONFIG-VARIANTS")
    protected ECUCMODULEDEF.SUPPORTEDCONFIGVARIANTS supportedconfigvariants;
    @XmlElement(name = "CONTAINERS")
    protected ECUCMODULEDEF.CONTAINERS containers;
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
     * ??ecucvalidationconds?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS }
     *     
     */
    public Ar421.ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS getECUCVALIDATIONCONDS() {
        return ecucvalidationconds;
    }

    /**
     * ??ecucvalidationconds?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS }
     *     
     */
    public void setECUCVALIDATIONCONDS(Ar421.ECUCFUNCTIONNAMEDEF.ECUCVALIDATIONCONDS value) {
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
     * ??apiserviceprefix?????
     * 
     * @return
     *     possible object is
     *     {@link CIDENTIFIER }
     *     
     */
    public CIDENTIFIER getAPISERVICEPREFIX() {
        return apiserviceprefix;
    }

    /**
     * ??apiserviceprefix?????
     * 
     * @param value
     *     allowed object is
     *     {@link CIDENTIFIER }
     *     
     */
    public void setAPISERVICEPREFIX(CIDENTIFIER value) {
        this.apiserviceprefix = value;
    }

    /**
     * ??postbuildvariantsupport?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPOSTBUILDVARIANTSUPPORT() {
        return postbuildvariantsupport;
    }

    /**
     * ??postbuildvariantsupport?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPOSTBUILDVARIANTSUPPORT(BOOLEAN value) {
        this.postbuildvariantsupport = value;
    }

    /**
     * ??refinedmoduledefref?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCMODULEDEF.REFINEDMODULEDEFREF }
     *     
     */
    public ECUCMODULEDEF.REFINEDMODULEDEFREF getREFINEDMODULEDEFREF() {
        return refinedmoduledefref;
    }

    /**
     * ??refinedmoduledefref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCMODULEDEF.REFINEDMODULEDEFREF }
     *     
     */
    public void setREFINEDMODULEDEFREF(ECUCMODULEDEF.REFINEDMODULEDEFREF value) {
        this.refinedmoduledefref = value;
    }

    /**
     * ??supportedconfigvariants?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCMODULEDEF.SUPPORTEDCONFIGVARIANTS }
     *     
     */
    public ECUCMODULEDEF.SUPPORTEDCONFIGVARIANTS getSUPPORTEDCONFIGVARIANTS() {
        return supportedconfigvariants;
    }

    /**
     * ??supportedconfigvariants?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCMODULEDEF.SUPPORTEDCONFIGVARIANTS }
     *     
     */
    public void setSUPPORTEDCONFIGVARIANTS(ECUCMODULEDEF.SUPPORTEDCONFIGVARIANTS value) {
        this.supportedconfigvariants = value;
    }

    /**
     * ??containers?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCMODULEDEF.CONTAINERS }
     *     
     */
    public ECUCMODULEDEF.CONTAINERS getCONTAINERS() {
        return containers;
    }

    /**
     * ??containers?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCMODULEDEF.CONTAINERS }
     *     
     */
    public void setCONTAINERS(ECUCMODULEDEF.CONTAINERS value) {
        this.containers = value;
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
    public static class REFINEDMODULEDEFREF
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SUPPORTED-CONFIG-VARIANT" type="{http://autosar.org/schema/r4.0}ECUC-CONFIGURATION-VARIANT-ENUM"/>
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
        "supportedconfigvariant"
    })
    public static class SUPPORTEDCONFIGVARIANTS {

        @XmlElement(name = "SUPPORTED-CONFIG-VARIANT")
        protected List<ECUCCONFIGURATIONVARIANTENUM> supportedconfigvariant;

        /**
         * Gets the value of the supportedconfigvariant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportedconfigvariant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUPPORTEDCONFIGVARIANT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCCONFIGURATIONVARIANTENUM }
         * 
         * 
         */
        public List<ECUCCONFIGURATIONVARIANTENUM> getSUPPORTEDCONFIGVARIANT() {
            if (supportedconfigvariant == null) {
                supportedconfigvariant = new ArrayList<ECUCCONFIGURATIONVARIANTENUM>();
            }
            return this.supportedconfigvariant;
        }

    }

}
