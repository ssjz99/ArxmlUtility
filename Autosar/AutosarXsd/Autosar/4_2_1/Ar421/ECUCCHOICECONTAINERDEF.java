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
 * Used to define configuration containers that provide a choice between several EcucParamConfContainerDef. But in the actual ECU Configuration Values only one instance from the choice list will be present.
 * 
 * <p>ECUC-CHOICE-CONTAINER-DEF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-CHOICE-CONTAINER-DEF">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-CHOICE-CONTAINER-DEF"/>
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
@XmlType(name = "ECUC-CHOICE-CONTAINER-DEF", propOrder = {
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
    "choices"
})
public class ECUCCHOICECONTAINERDEF {

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
    @XmlElement(name = "CHOICES")
    protected ECUCCHOICECONTAINERDEF.CHOICES choices;
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
     * ??choices?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCHOICECONTAINERDEF.CHOICES }
     *     
     */
    public ECUCCHOICECONTAINERDEF.CHOICES getCHOICES() {
        return choices;
    }

    /**
     * ??choices?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCHOICECONTAINERDEF.CHOICES }
     *     
     */
    public void setCHOICES(ECUCCHOICECONTAINERDEF.CHOICES value) {
        this.choices = value;
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
        "ecucparamconfcontainerdef"
    })
    public static class CHOICES {

        @XmlElement(name = "ECUC-PARAM-CONF-CONTAINER-DEF")
        protected List<ECUCPARAMCONFCONTAINERDEF> ecucparamconfcontainerdef;

        /**
         * Gets the value of the ecucparamconfcontainerdef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucparamconfcontainerdef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCPARAMCONFCONTAINERDEF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCPARAMCONFCONTAINERDEF }
         * 
         * 
         */
        public List<ECUCPARAMCONFCONTAINERDEF> getECUCPARAMCONFCONTAINERDEF() {
            if (ecucparamconfcontainerdef == null) {
                ecucparamconfcontainerdef = new ArrayList<ECUCPARAMCONFCONTAINERDEF>();
            }
            return this.ecucparamconfcontainerdef;
        }

    }

}
