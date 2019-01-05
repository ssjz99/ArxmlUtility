//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This meta-class specifies that the implementation of the reference is done using a symbolic name defined by the referenced Container's shortName.
 * 
 * <p>ECUC-SYMBOLIC-NAME-REFERENCE-DEF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-SYMBOLIC-NAME-REFERENCE-DEF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-DEFINITION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-DEFINITION-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-COMMON-ATTRIBUTES"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-ABSTRACT-REFERENCE-DEF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-SYMBOLIC-NAME-REFERENCE-DEF"/>
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
@XmlType(name = "ECUC-SYMBOLIC-NAME-REFERENCE-DEF", propOrder = {
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
    "configurationclassaffection",
    "implementationconfigclasses",
    "multiplicityconfigclasses",
    "origin",
    "postbuildvariantmultiplicity",
    "postbuildvariantvalue",
    "requiresindex",
    "valueconfigclasses",
    "destinationref"
})
public class ECUCSYMBOLICNAMEREFERENCEDEF {

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
    @XmlElement(name = "CONFIGURATION-CLASS-AFFECTION")
    protected ECUCCONFIGURATIONCLASSAFFECTION configurationclassaffection;
    @XmlElement(name = "IMPLEMENTATION-CONFIG-CLASSES")
    protected Ar421.ECUCFUNCTIONNAMEDEF.IMPLEMENTATIONCONFIGCLASSES implementationconfigclasses;
    @XmlElement(name = "MULTIPLICITY-CONFIG-CLASSES")
    protected Ar421.ECUCFUNCTIONNAMEDEF.MULTIPLICITYCONFIGCLASSES multiplicityconfigclasses;
    @XmlElement(name = "ORIGIN")
    protected STRING origin;
    @XmlElement(name = "POST-BUILD-VARIANT-MULTIPLICITY")
    protected BOOLEAN postbuildvariantmultiplicity;
    @XmlElement(name = "POST-BUILD-VARIANT-VALUE")
    protected BOOLEAN postbuildvariantvalue;
    @XmlElement(name = "REQUIRES-INDEX")
    protected BOOLEAN requiresindex;
    @XmlElement(name = "VALUE-CONFIG-CLASSES")
    protected Ar421.ECUCFUNCTIONNAMEDEF.VALUECONFIGCLASSES valueconfigclasses;
    @XmlElement(name = "DESTINATION-REF")
    protected ECUCSYMBOLICNAMEREFERENCEDEF.DESTINATIONREF destinationref;
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
     * ??configurationclassaffection?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONFIGURATIONCLASSAFFECTION }
     *     
     */
    public ECUCCONFIGURATIONCLASSAFFECTION getCONFIGURATIONCLASSAFFECTION() {
        return configurationclassaffection;
    }

    /**
     * ??configurationclassaffection?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONFIGURATIONCLASSAFFECTION }
     *     
     */
    public void setCONFIGURATIONCLASSAFFECTION(ECUCCONFIGURATIONCLASSAFFECTION value) {
        this.configurationclassaffection = value;
    }

    /**
     * ??implementationconfigclasses?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.IMPLEMENTATIONCONFIGCLASSES }
     *     
     */
    public Ar421.ECUCFUNCTIONNAMEDEF.IMPLEMENTATIONCONFIGCLASSES getIMPLEMENTATIONCONFIGCLASSES() {
        return implementationconfigclasses;
    }

    /**
     * ??implementationconfigclasses?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.IMPLEMENTATIONCONFIGCLASSES }
     *     
     */
    public void setIMPLEMENTATIONCONFIGCLASSES(Ar421.ECUCFUNCTIONNAMEDEF.IMPLEMENTATIONCONFIGCLASSES value) {
        this.implementationconfigclasses = value;
    }

    /**
     * ??multiplicityconfigclasses?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.MULTIPLICITYCONFIGCLASSES }
     *     
     */
    public Ar421.ECUCFUNCTIONNAMEDEF.MULTIPLICITYCONFIGCLASSES getMULTIPLICITYCONFIGCLASSES() {
        return multiplicityconfigclasses;
    }

    /**
     * ??multiplicityconfigclasses?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.MULTIPLICITYCONFIGCLASSES }
     *     
     */
    public void setMULTIPLICITYCONFIGCLASSES(Ar421.ECUCFUNCTIONNAMEDEF.MULTIPLICITYCONFIGCLASSES value) {
        this.multiplicityconfigclasses = value;
    }

    /**
     * ??origin?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getORIGIN() {
        return origin;
    }

    /**
     * ??origin?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setORIGIN(STRING value) {
        this.origin = value;
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
     * ??postbuildvariantvalue?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPOSTBUILDVARIANTVALUE() {
        return postbuildvariantvalue;
    }

    /**
     * ??postbuildvariantvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPOSTBUILDVARIANTVALUE(BOOLEAN value) {
        this.postbuildvariantvalue = value;
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
     * ??valueconfigclasses?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.VALUECONFIGCLASSES }
     *     
     */
    public Ar421.ECUCFUNCTIONNAMEDEF.VALUECONFIGCLASSES getVALUECONFIGCLASSES() {
        return valueconfigclasses;
    }

    /**
     * ??valueconfigclasses?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ECUCFUNCTIONNAMEDEF.VALUECONFIGCLASSES }
     *     
     */
    public void setVALUECONFIGCLASSES(Ar421.ECUCFUNCTIONNAMEDEF.VALUECONFIGCLASSES value) {
        this.valueconfigclasses = value;
    }

    /**
     * ??destinationref?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCSYMBOLICNAMEREFERENCEDEF.DESTINATIONREF }
     *     
     */
    public ECUCSYMBOLICNAMEREFERENCEDEF.DESTINATIONREF getDESTINATIONREF() {
        return destinationref;
    }

    /**
     * ??destinationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCSYMBOLICNAMEREFERENCEDEF.DESTINATIONREF }
     *     
     */
    public void setDESTINATIONREF(ECUCSYMBOLICNAMEREFERENCEDEF.DESTINATIONREF value) {
        this.destinationref = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-PARAM-CONF-CONTAINER-DEF--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DESTINATIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM }
         *     
         */
        public ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM }
         *     
         */
        public void setDEST(ECUCPARAMCONFCONTAINERDEFSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
