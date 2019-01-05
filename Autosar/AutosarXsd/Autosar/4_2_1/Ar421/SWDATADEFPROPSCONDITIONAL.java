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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>SW-DATA-DEF-PROPS-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-DATA-DEF-PROPS-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-DATA-DEF-PROPS-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-DATA-DEF-PROPS-CONDITIONAL"/>
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
@XmlType(name = "SW-DATA-DEF-PROPS-CONDITIONAL", propOrder = {
    "stepsize",
    "annotations",
    "swaddrmethodref",
    "swalignment",
    "basetyperef",
    "swbitrepresentation",
    "swcalibrationaccess",
    "swvalueblocksize",
    "swcalprmaxisset",
    "swtextprops",
    "swcomparisonvariables",
    "compumethodref",
    "dataconstrref",
    "swdatadependency",
    "displayformat",
    "implementationdatatyperef",
    "swhostvariable",
    "swimplpolicy",
    "additionalnativetypequalifier",
    "swintendedresolution",
    "swinterpolationmethod",
    "invalidvalue",
    "mcfunction",
    "swisvirtual",
    "swpointertargetprops",
    "swrecordlayoutref",
    "swrefreshtiming",
    "unitref",
    "valueaxisdatatyperef",
    "variationpoint"
})
public class SWDATADEFPROPSCONDITIONAL {

    @XmlElement(name = "STEP-SIZE")
    protected FLOAT stepsize;
    @XmlElement(name = "ANNOTATIONS")
    protected SWDATADEFPROPSCONDITIONAL.ANNOTATIONS annotations;
    @XmlElement(name = "SW-ADDR-METHOD-REF")
    protected SWDATADEFPROPSCONDITIONAL.SWADDRMETHODREF swaddrmethodref;
    @XmlElement(name = "SW-ALIGNMENT")
    protected ALIGNMENTTYPE swalignment;
    @XmlElement(name = "BASE-TYPE-REF")
    protected SWDATADEFPROPSCONDITIONAL.BASETYPEREF basetyperef;
    @XmlElement(name = "SW-BIT-REPRESENTATION")
    protected SWBITREPRESENTATION swbitrepresentation;
    @XmlElement(name = "SW-CALIBRATION-ACCESS")
    protected SWCALIBRATIONACCESSENUM swcalibrationaccess;
    @XmlElement(name = "SW-VALUE-BLOCK-SIZE")
    protected NUMERICALVALUEVARIATIONPOINT swvalueblocksize;
    @XmlElement(name = "SW-CALPRM-AXIS-SET")
    protected SWCALPRMAXISSET swcalprmaxisset;
    @XmlElement(name = "SW-TEXT-PROPS")
    protected SWTEXTPROPS swtextprops;
    @XmlElement(name = "SW-COMPARISON-VARIABLES")
    protected SWDATADEFPROPSCONDITIONAL.SWCOMPARISONVARIABLES swcomparisonvariables;
    @XmlElement(name = "COMPU-METHOD-REF")
    protected SWDATADEFPROPSCONDITIONAL.COMPUMETHODREF compumethodref;
    @XmlElement(name = "DATA-CONSTR-REF")
    protected SWDATADEFPROPSCONDITIONAL.DATACONSTRREF dataconstrref;
    @XmlElement(name = "SW-DATA-DEPENDENCY")
    protected SWDATADEPENDENCY swdatadependency;
    @XmlElement(name = "DISPLAY-FORMAT")
    protected DISPLAYFORMATSTRING displayformat;
    @XmlElement(name = "IMPLEMENTATION-DATA-TYPE-REF")
    protected SWDATADEFPROPSCONDITIONAL.IMPLEMENTATIONDATATYPEREF implementationdatatyperef;
    @XmlElement(name = "SW-HOST-VARIABLE")
    protected SWVARIABLEREFPROXY swhostvariable;
    @XmlElement(name = "SW-IMPL-POLICY")
    protected SWIMPLPOLICYENUM swimplpolicy;
    @XmlElement(name = "ADDITIONAL-NATIVE-TYPE-QUALIFIER")
    protected NATIVEDECLARATIONSTRING additionalnativetypequalifier;
    @XmlElement(name = "SW-INTENDED-RESOLUTION")
    protected NUMERICALVALUE swintendedresolution;
    @XmlElement(name = "SW-INTERPOLATION-METHOD")
    protected IDENTIFIER swinterpolationmethod;
    @XmlElement(name = "INVALID-VALUE")
    protected SWDATADEFPROPSCONDITIONAL.INVALIDVALUE invalidvalue;
    @XmlElement(name = "MC-FUNCTION")
    protected IDENTIFIER mcfunction;
    @XmlElement(name = "SW-IS-VIRTUAL")
    protected BOOLEAN swisvirtual;
    @XmlElement(name = "SW-POINTER-TARGET-PROPS")
    protected SWPOINTERTARGETPROPS swpointertargetprops;
    @XmlElement(name = "SW-RECORD-LAYOUT-REF")
    protected SWDATADEFPROPSCONDITIONAL.SWRECORDLAYOUTREF swrecordlayoutref;
    @XmlElement(name = "SW-REFRESH-TIMING")
    protected MULTIDIMENSIONALTIME swrefreshtiming;
    @XmlElement(name = "UNIT-REF")
    protected SWDATADEFPROPSCONDITIONAL.UNITREF unitref;
    @XmlElement(name = "VALUE-AXIS-DATA-TYPE-REF")
    protected SWDATADEFPROPSCONDITIONAL.VALUEAXISDATATYPEREF valueaxisdatatyperef;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??stepsize?????
     * 
     * @return
     *     possible object is
     *     {@link FLOAT }
     *     
     */
    public FLOAT getSTEPSIZE() {
        return stepsize;
    }

    /**
     * ??stepsize?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLOAT }
     *     
     */
    public void setSTEPSIZE(FLOAT value) {
        this.stepsize = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.ANNOTATIONS }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(SWDATADEFPROPSCONDITIONAL.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.SWADDRMETHODREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.SWADDRMETHODREF getSWADDRMETHODREF() {
        return swaddrmethodref;
    }

    /**
     * ??swaddrmethodref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.SWADDRMETHODREF }
     *     
     */
    public void setSWADDRMETHODREF(SWDATADEFPROPSCONDITIONAL.SWADDRMETHODREF value) {
        this.swaddrmethodref = value;
    }

    /**
     * ??swalignment?????
     * 
     * @return
     *     possible object is
     *     {@link ALIGNMENTTYPE }
     *     
     */
    public ALIGNMENTTYPE getSWALIGNMENT() {
        return swalignment;
    }

    /**
     * ??swalignment?????
     * 
     * @param value
     *     allowed object is
     *     {@link ALIGNMENTTYPE }
     *     
     */
    public void setSWALIGNMENT(ALIGNMENTTYPE value) {
        this.swalignment = value;
    }

    /**
     * ??basetyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.BASETYPEREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.BASETYPEREF getBASETYPEREF() {
        return basetyperef;
    }

    /**
     * ??basetyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.BASETYPEREF }
     *     
     */
    public void setBASETYPEREF(SWDATADEFPROPSCONDITIONAL.BASETYPEREF value) {
        this.basetyperef = value;
    }

    /**
     * ??swbitrepresentation?????
     * 
     * @return
     *     possible object is
     *     {@link SWBITREPRESENTATION }
     *     
     */
    public SWBITREPRESENTATION getSWBITREPRESENTATION() {
        return swbitrepresentation;
    }

    /**
     * ??swbitrepresentation?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWBITREPRESENTATION }
     *     
     */
    public void setSWBITREPRESENTATION(SWBITREPRESENTATION value) {
        this.swbitrepresentation = value;
    }

    /**
     * ??swcalibrationaccess?????
     * 
     * @return
     *     possible object is
     *     {@link SWCALIBRATIONACCESSENUM }
     *     
     */
    public SWCALIBRATIONACCESSENUM getSWCALIBRATIONACCESS() {
        return swcalibrationaccess;
    }

    /**
     * ??swcalibrationaccess?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCALIBRATIONACCESSENUM }
     *     
     */
    public void setSWCALIBRATIONACCESS(SWCALIBRATIONACCESSENUM value) {
        this.swcalibrationaccess = value;
    }

    /**
     * ??swvalueblocksize?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public NUMERICALVALUEVARIATIONPOINT getSWVALUEBLOCKSIZE() {
        return swvalueblocksize;
    }

    /**
     * ??swvalueblocksize?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUEVARIATIONPOINT }
     *     
     */
    public void setSWVALUEBLOCKSIZE(NUMERICALVALUEVARIATIONPOINT value) {
        this.swvalueblocksize = value;
    }

    /**
     * ??swcalprmaxisset?????
     * 
     * @return
     *     possible object is
     *     {@link SWCALPRMAXISSET }
     *     
     */
    public SWCALPRMAXISSET getSWCALPRMAXISSET() {
        return swcalprmaxisset;
    }

    /**
     * ??swcalprmaxisset?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCALPRMAXISSET }
     *     
     */
    public void setSWCALPRMAXISSET(SWCALPRMAXISSET value) {
        this.swcalprmaxisset = value;
    }

    /**
     * ??swtextprops?????
     * 
     * @return
     *     possible object is
     *     {@link SWTEXTPROPS }
     *     
     */
    public SWTEXTPROPS getSWTEXTPROPS() {
        return swtextprops;
    }

    /**
     * ??swtextprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWTEXTPROPS }
     *     
     */
    public void setSWTEXTPROPS(SWTEXTPROPS value) {
        this.swtextprops = value;
    }

    /**
     * ??swcomparisonvariables?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.SWCOMPARISONVARIABLES }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.SWCOMPARISONVARIABLES getSWCOMPARISONVARIABLES() {
        return swcomparisonvariables;
    }

    /**
     * ??swcomparisonvariables?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.SWCOMPARISONVARIABLES }
     *     
     */
    public void setSWCOMPARISONVARIABLES(SWDATADEFPROPSCONDITIONAL.SWCOMPARISONVARIABLES value) {
        this.swcomparisonvariables = value;
    }

    /**
     * ??compumethodref?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.COMPUMETHODREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.COMPUMETHODREF getCOMPUMETHODREF() {
        return compumethodref;
    }

    /**
     * ??compumethodref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.COMPUMETHODREF }
     *     
     */
    public void setCOMPUMETHODREF(SWDATADEFPROPSCONDITIONAL.COMPUMETHODREF value) {
        this.compumethodref = value;
    }

    /**
     * ??dataconstrref?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.DATACONSTRREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.DATACONSTRREF getDATACONSTRREF() {
        return dataconstrref;
    }

    /**
     * ??dataconstrref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.DATACONSTRREF }
     *     
     */
    public void setDATACONSTRREF(SWDATADEFPROPSCONDITIONAL.DATACONSTRREF value) {
        this.dataconstrref = value;
    }

    /**
     * ??swdatadependency?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEPENDENCY }
     *     
     */
    public SWDATADEPENDENCY getSWDATADEPENDENCY() {
        return swdatadependency;
    }

    /**
     * ??swdatadependency?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEPENDENCY }
     *     
     */
    public void setSWDATADEPENDENCY(SWDATADEPENDENCY value) {
        this.swdatadependency = value;
    }

    /**
     * ??displayformat?????
     * 
     * @return
     *     possible object is
     *     {@link DISPLAYFORMATSTRING }
     *     
     */
    public DISPLAYFORMATSTRING getDISPLAYFORMAT() {
        return displayformat;
    }

    /**
     * ??displayformat?????
     * 
     * @param value
     *     allowed object is
     *     {@link DISPLAYFORMATSTRING }
     *     
     */
    public void setDISPLAYFORMAT(DISPLAYFORMATSTRING value) {
        this.displayformat = value;
    }

    /**
     * ??implementationdatatyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.IMPLEMENTATIONDATATYPEREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.IMPLEMENTATIONDATATYPEREF getIMPLEMENTATIONDATATYPEREF() {
        return implementationdatatyperef;
    }

    /**
     * ??implementationdatatyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.IMPLEMENTATIONDATATYPEREF }
     *     
     */
    public void setIMPLEMENTATIONDATATYPEREF(SWDATADEFPROPSCONDITIONAL.IMPLEMENTATIONDATATYPEREF value) {
        this.implementationdatatyperef = value;
    }

    /**
     * ??swhostvariable?????
     * 
     * @return
     *     possible object is
     *     {@link SWVARIABLEREFPROXY }
     *     
     */
    public SWVARIABLEREFPROXY getSWHOSTVARIABLE() {
        return swhostvariable;
    }

    /**
     * ??swhostvariable?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWVARIABLEREFPROXY }
     *     
     */
    public void setSWHOSTVARIABLE(SWVARIABLEREFPROXY value) {
        this.swhostvariable = value;
    }

    /**
     * ??swimplpolicy?????
     * 
     * @return
     *     possible object is
     *     {@link SWIMPLPOLICYENUM }
     *     
     */
    public SWIMPLPOLICYENUM getSWIMPLPOLICY() {
        return swimplpolicy;
    }

    /**
     * ??swimplpolicy?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWIMPLPOLICYENUM }
     *     
     */
    public void setSWIMPLPOLICY(SWIMPLPOLICYENUM value) {
        this.swimplpolicy = value;
    }

    /**
     * ??additionalnativetypequalifier?????
     * 
     * @return
     *     possible object is
     *     {@link NATIVEDECLARATIONSTRING }
     *     
     */
    public NATIVEDECLARATIONSTRING getADDITIONALNATIVETYPEQUALIFIER() {
        return additionalnativetypequalifier;
    }

    /**
     * ??additionalnativetypequalifier?????
     * 
     * @param value
     *     allowed object is
     *     {@link NATIVEDECLARATIONSTRING }
     *     
     */
    public void setADDITIONALNATIVETYPEQUALIFIER(NATIVEDECLARATIONSTRING value) {
        this.additionalnativetypequalifier = value;
    }

    /**
     * ??swintendedresolution?????
     * 
     * @return
     *     possible object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public NUMERICALVALUE getSWINTENDEDRESOLUTION() {
        return swintendedresolution;
    }

    /**
     * ??swintendedresolution?????
     * 
     * @param value
     *     allowed object is
     *     {@link NUMERICALVALUE }
     *     
     */
    public void setSWINTENDEDRESOLUTION(NUMERICALVALUE value) {
        this.swintendedresolution = value;
    }

    /**
     * ??swinterpolationmethod?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSWINTERPOLATIONMETHOD() {
        return swinterpolationmethod;
    }

    /**
     * ??swinterpolationmethod?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSWINTERPOLATIONMETHOD(IDENTIFIER value) {
        this.swinterpolationmethod = value;
    }

    /**
     * ??invalidvalue?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.INVALIDVALUE }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.INVALIDVALUE getINVALIDVALUE() {
        return invalidvalue;
    }

    /**
     * ??invalidvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.INVALIDVALUE }
     *     
     */
    public void setINVALIDVALUE(SWDATADEFPROPSCONDITIONAL.INVALIDVALUE value) {
        this.invalidvalue = value;
    }

    /**
     * ??mcfunction?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getMCFUNCTION() {
        return mcfunction;
    }

    /**
     * ??mcfunction?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setMCFUNCTION(IDENTIFIER value) {
        this.mcfunction = value;
    }

    /**
     * ??swisvirtual?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSWISVIRTUAL() {
        return swisvirtual;
    }

    /**
     * ??swisvirtual?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSWISVIRTUAL(BOOLEAN value) {
        this.swisvirtual = value;
    }

    /**
     * ??swpointertargetprops?????
     * 
     * @return
     *     possible object is
     *     {@link SWPOINTERTARGETPROPS }
     *     
     */
    public SWPOINTERTARGETPROPS getSWPOINTERTARGETPROPS() {
        return swpointertargetprops;
    }

    /**
     * ??swpointertargetprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWPOINTERTARGETPROPS }
     *     
     */
    public void setSWPOINTERTARGETPROPS(SWPOINTERTARGETPROPS value) {
        this.swpointertargetprops = value;
    }

    /**
     * ??swrecordlayoutref?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.SWRECORDLAYOUTREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.SWRECORDLAYOUTREF getSWRECORDLAYOUTREF() {
        return swrecordlayoutref;
    }

    /**
     * ??swrecordlayoutref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.SWRECORDLAYOUTREF }
     *     
     */
    public void setSWRECORDLAYOUTREF(SWDATADEFPROPSCONDITIONAL.SWRECORDLAYOUTREF value) {
        this.swrecordlayoutref = value;
    }

    /**
     * ??swrefreshtiming?????
     * 
     * @return
     *     possible object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public MULTIDIMENSIONALTIME getSWREFRESHTIMING() {
        return swrefreshtiming;
    }

    /**
     * ??swrefreshtiming?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIDIMENSIONALTIME }
     *     
     */
    public void setSWREFRESHTIMING(MULTIDIMENSIONALTIME value) {
        this.swrefreshtiming = value;
    }

    /**
     * ??unitref?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.UNITREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.UNITREF getUNITREF() {
        return unitref;
    }

    /**
     * ??unitref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.UNITREF }
     *     
     */
    public void setUNITREF(SWDATADEFPROPSCONDITIONAL.UNITREF value) {
        this.unitref = value;
    }

    /**
     * ??valueaxisdatatyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPSCONDITIONAL.VALUEAXISDATATYPEREF }
     *     
     */
    public SWDATADEFPROPSCONDITIONAL.VALUEAXISDATATYPEREF getVALUEAXISDATATYPEREF() {
        return valueaxisdatatyperef;
    }

    /**
     * ??valueaxisdatatyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPSCONDITIONAL.VALUEAXISDATATYPEREF }
     *     
     */
    public void setVALUEAXISDATATYPEREF(SWDATADEFPROPSCONDITIONAL.VALUEAXISDATATYPEREF value) {
        this.valueaxisdatatyperef = value;
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
     *         &lt;element name="ANNOTATION" type="{http://autosar.org/schema/r4.0}ANNOTATION"/>
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
        "annotation"
    })
    public static class ANNOTATIONS {

        @XmlElement(name = "ANNOTATION")
        protected List<ANNOTATION> annotation;

        /**
         * Gets the value of the annotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getANNOTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANNOTATION }
         * 
         * 
         */
        public List<ANNOTATION> getANNOTATION() {
            if (annotation == null) {
                annotation = new ArrayList<ANNOTATION>();
            }
            return this.annotation;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-BASE-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BASETYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWBASETYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWBASETYPESUBTYPESENUM }
         *     
         */
        public SWBASETYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWBASETYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWBASETYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IMPLEMENTATIONDATATYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IMPLEMENTATIONDATATYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IMPLEMENTATIONDATATYPESUBTYPESENUM }
         *     
         */
        public IMPLEMENTATIONDATATYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IMPLEMENTATIONDATATYPESUBTYPESENUM }
         *     
         */
        public void setDEST(IMPLEMENTATIONDATATYPESUBTYPESENUM value) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="APPLICATION-RULE-BASED-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}APPLICATION-RULE-BASED-VALUE-SPECIFICATION"/>
     *         &lt;element name="APPLICATION-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}APPLICATION-VALUE-SPECIFICATION"/>
     *         &lt;element name="ARRAY-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}ARRAY-VALUE-SPECIFICATION"/>
     *         &lt;element name="CONSTANT-REFERENCE" type="{http://autosar.org/schema/r4.0}CONSTANT-REFERENCE"/>
     *         &lt;element name="NUMERICAL-RULE-BASED-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}NUMERICAL-RULE-BASED-VALUE-SPECIFICATION"/>
     *         &lt;element name="NUMERICAL-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}NUMERICAL-VALUE-SPECIFICATION"/>
     *         &lt;element name="RECORD-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}RECORD-VALUE-SPECIFICATION"/>
     *         &lt;element name="REFERENCE-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}REFERENCE-VALUE-SPECIFICATION"/>
     *         &lt;element name="TEXT-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}TEXT-VALUE-SPECIFICATION"/>
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
        "applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION"
    })
    public static class INVALIDVALUE {

        @XmlElements({
            @XmlElement(name = "APPLICATION-RULE-BASED-VALUE-SPECIFICATION", type = APPLICATIONRULEBASEDVALUESPECIFICATION.class),
            @XmlElement(name = "APPLICATION-VALUE-SPECIFICATION", type = APPLICATIONVALUESPECIFICATION.class),
            @XmlElement(name = "ARRAY-VALUE-SPECIFICATION", type = ARRAYVALUESPECIFICATION.class),
            @XmlElement(name = "CONSTANT-REFERENCE", type = CONSTANTREFERENCE.class),
            @XmlElement(name = "NUMERICAL-RULE-BASED-VALUE-SPECIFICATION", type = NUMERICALRULEBASEDVALUESPECIFICATION.class),
            @XmlElement(name = "NUMERICAL-VALUE-SPECIFICATION", type = NUMERICALVALUESPECIFICATION.class),
            @XmlElement(name = "RECORD-VALUE-SPECIFICATION", type = RECORDVALUESPECIFICATION.class),
            @XmlElement(name = "REFERENCE-VALUE-SPECIFICATION", type = REFERENCEVALUESPECIFICATION.class),
            @XmlElement(name = "TEXT-VALUE-SPECIFICATION", type = TEXTVALUESPECIFICATION.class)
        })
        protected Object applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION;

        /**
         * ??applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONRULEBASEDVALUESPECIFICATION }
         *     {@link APPLICATIONVALUESPECIFICATION }
         *     {@link ARRAYVALUESPECIFICATION }
         *     {@link CONSTANTREFERENCE }
         *     {@link NUMERICALRULEBASEDVALUESPECIFICATION }
         *     {@link NUMERICALVALUESPECIFICATION }
         *     {@link RECORDVALUESPECIFICATION }
         *     {@link REFERENCEVALUESPECIFICATION }
         *     {@link TEXTVALUESPECIFICATION }
         *     
         */
        public Object getAPPLICATIONRULEBASEDVALUESPECIFICATIONOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION() {
            return applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION;
        }

        /**
         * ??applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONRULEBASEDVALUESPECIFICATION }
         *     {@link APPLICATIONVALUESPECIFICATION }
         *     {@link ARRAYVALUESPECIFICATION }
         *     {@link CONSTANTREFERENCE }
         *     {@link NUMERICALRULEBASEDVALUESPECIFICATION }
         *     {@link NUMERICALVALUESPECIFICATION }
         *     {@link RECORDVALUESPECIFICATION }
         *     {@link REFERENCEVALUESPECIFICATION }
         *     {@link TEXTVALUESPECIFICATION }
         *     
         */
        public void setAPPLICATIONRULEBASEDVALUESPECIFICATIONOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION(Object value) {
            this.applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-ADDR-METHOD--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWADDRMETHODREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWADDRMETHODSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWADDRMETHODSUBTYPESENUM }
         *     
         */
        public SWADDRMETHODSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWADDRMETHODSUBTYPESENUM }
         *     
         */
        public void setDEST(SWADDRMETHODSUBTYPESENUM value) {
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
    public static class SWCOMPARISONVARIABLES {

        @XmlElements({
            @XmlElement(name = "AUTOSAR-VARIABLE", type = AUTOSARVARIABLEREF.class),
            @XmlElement(name = "MC-DATA-INSTANCE-VAR-REF", type = SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF.class)
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
         * {@link SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF }
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-RECORD-LAYOUT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SWRECORDLAYOUTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SWRECORDLAYOUTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWRECORDLAYOUTSUBTYPESENUM }
         *     
         */
        public SWRECORDLAYOUTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWRECORDLAYOUTSUBTYPESENUM }
         *     
         */
        public void setDEST(SWRECORDLAYOUTSUBTYPESENUM value) {
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
    public static class VALUEAXISDATATYPEREF
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

}
