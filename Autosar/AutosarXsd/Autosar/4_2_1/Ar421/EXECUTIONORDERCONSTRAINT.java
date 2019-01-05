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
 * This constraint is used to restrict the order of execution for a set of ExecutableEntities. The ExecutionOrderConstraint can be used in any timing view.
 * 
 * The various scopes for ExecutionOrderConstraint are described below. Generally, each ExecutionOrderConstraint has a scope of software components and can reference all executable entities available in the corresponding internal behavior (RunnableEntity and BswModuleEntity) either directly or by the events activating respectively starting them (RteEvent and BswEvent).
 * 
 * On VFB level an ExecutionOrderConstraint can be specified for RunnableEntities part of the composition hierarchy referenced by the VfbTiming. The ExecutionOrderConstraint is aggregated by the VfbTiming.
 * 
 * On SW-C level an ExecutionOrderConstraint can be specified for RunnableEntities part of the InternalBehavior referenced by the SwcTiming. The ExecutionOrderConstraint is aggregated by the SwcTiming.
 * 
 * On System level an ExecutionOrderConstraint can be specified for RunnableEntities part of the composition hierarchy of the system referenced by the SystemTiming. The ExecutionOrderConstraint is aggregated by the SystemTiming.
 * 
 * On BSW Module level, an ExectionOrderConstraint can be specified for BswModuleEntities part of an BswInternalBehavior referenced by the BswModuleTiming. The ExecutionOrderConstraint is aggregated by the BswModuleTiming.
 * 
 * On ECU level an ExecutionOrderConstraint can be specified for all ExecutableEntities and Events available via the EcucValueCollection, covering ECU Extract and BSW Module Configuration, referenced by the EcuTiming. The ExecutionOrderConstraint is aggregated by the EcuTiming.
 * 
 * <p>EXECUTION-ORDER-CONSTRAINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EXECUTION-ORDER-CONSTRAINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRACEABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TIMING-CONSTRAINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXECUTION-ORDER-CONSTRAINT"/>
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
@XmlType(name = "EXECUTION-ORDER-CONSTRAINT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "tracerefs",
    "variationpoint",
    "basecompositionref",
    "executionorderconstrainttype",
    "isevent",
    "orderedelements",
    "permitmultiplereferencestoee"
})
public class EXECUTIONORDERCONSTRAINT {

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
    @XmlElement(name = "TRACE-REFS")
    protected Ar421.AGECONSTRAINT.TRACEREFS tracerefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "BASE-COMPOSITION-REF")
    protected EXECUTIONORDERCONSTRAINT.BASECOMPOSITIONREF basecompositionref;
    @XmlElement(name = "EXECUTION-ORDER-CONSTRAINT-TYPE")
    protected EXECUTIONORDERCONSTRAINTTYPEENUM executionorderconstrainttype;
    @XmlElement(name = "IS-EVENT")
    protected BOOLEAN isevent;
    @XmlElement(name = "ORDERED-ELEMENTS")
    protected EXECUTIONORDERCONSTRAINT.ORDEREDELEMENTS orderedelements;
    @XmlElement(name = "PERMIT-MULTIPLE-REFERENCES-TO-EE")
    protected BOOLEAN permitmultiplereferencestoee;
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
     * ??tracerefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.AGECONSTRAINT.TRACEREFS }
     *     
     */
    public Ar421.AGECONSTRAINT.TRACEREFS getTRACEREFS() {
        return tracerefs;
    }

    /**
     * ??tracerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.AGECONSTRAINT.TRACEREFS }
     *     
     */
    public void setTRACEREFS(Ar421.AGECONSTRAINT.TRACEREFS value) {
        this.tracerefs = value;
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
     * ??basecompositionref?????
     * 
     * @return
     *     possible object is
     *     {@link EXECUTIONORDERCONSTRAINT.BASECOMPOSITIONREF }
     *     
     */
    public EXECUTIONORDERCONSTRAINT.BASECOMPOSITIONREF getBASECOMPOSITIONREF() {
        return basecompositionref;
    }

    /**
     * ??basecompositionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link EXECUTIONORDERCONSTRAINT.BASECOMPOSITIONREF }
     *     
     */
    public void setBASECOMPOSITIONREF(EXECUTIONORDERCONSTRAINT.BASECOMPOSITIONREF value) {
        this.basecompositionref = value;
    }

    /**
     * ??executionorderconstrainttype?????
     * 
     * @return
     *     possible object is
     *     {@link EXECUTIONORDERCONSTRAINTTYPEENUM }
     *     
     */
    public EXECUTIONORDERCONSTRAINTTYPEENUM getEXECUTIONORDERCONSTRAINTTYPE() {
        return executionorderconstrainttype;
    }

    /**
     * ??executionorderconstrainttype?????
     * 
     * @param value
     *     allowed object is
     *     {@link EXECUTIONORDERCONSTRAINTTYPEENUM }
     *     
     */
    public void setEXECUTIONORDERCONSTRAINTTYPE(EXECUTIONORDERCONSTRAINTTYPEENUM value) {
        this.executionorderconstrainttype = value;
    }

    /**
     * ??isevent?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getISEVENT() {
        return isevent;
    }

    /**
     * ??isevent?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setISEVENT(BOOLEAN value) {
        this.isevent = value;
    }

    /**
     * ??orderedelements?????
     * 
     * @return
     *     possible object is
     *     {@link EXECUTIONORDERCONSTRAINT.ORDEREDELEMENTS }
     *     
     */
    public EXECUTIONORDERCONSTRAINT.ORDEREDELEMENTS getORDEREDELEMENTS() {
        return orderedelements;
    }

    /**
     * ??orderedelements?????
     * 
     * @param value
     *     allowed object is
     *     {@link EXECUTIONORDERCONSTRAINT.ORDEREDELEMENTS }
     *     
     */
    public void setORDEREDELEMENTS(EXECUTIONORDERCONSTRAINT.ORDEREDELEMENTS value) {
        this.orderedelements = value;
    }

    /**
     * ??permitmultiplereferencestoee?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPERMITMULTIPLEREFERENCESTOEE() {
        return permitmultiplereferencestoee;
    }

    /**
     * ??permitmultiplereferencestoee?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPERMITMULTIPLEREFERENCESTOEE(BOOLEAN value) {
        this.permitmultiplereferencestoee = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMPOSITION-SW-COMPONENT-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BASECOMPOSITIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(COMPOSITIONSWCOMPONENTTYPESUBTYPESENUM value) {
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
     *         &lt;element name="EOC-EVENT-REF" type="{http://autosar.org/schema/r4.0}EOC-EVENT-REF"/>
     *         &lt;element name="EOC-EXECUTABLE-ENTITY-REF" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF"/>
     *         &lt;element name="EOC-EXECUTABLE-ENTITY-REF-GROUP" type="{http://autosar.org/schema/r4.0}EOC-EXECUTABLE-ENTITY-REF-GROUP"/>
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
        "eoceventrefOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP"
    })
    public static class ORDEREDELEMENTS {

        @XmlElements({
            @XmlElement(name = "EOC-EVENT-REF", type = EOCEVENTREF.class),
            @XmlElement(name = "EOC-EXECUTABLE-ENTITY-REF", type = EOCEXECUTABLEENTITYREF.class),
            @XmlElement(name = "EOC-EXECUTABLE-ENTITY-REF-GROUP", type = EOCEXECUTABLEENTITYREFGROUP.class)
        })
        protected List<Object> eoceventrefOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP;

        /**
         * Gets the value of the eoceventrefOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eoceventrefOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEOCEVENTREFOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EOCEVENTREF }
         * {@link EOCEXECUTABLEENTITYREF }
         * {@link EOCEXECUTABLEENTITYREFGROUP }
         * 
         * 
         */
        public List<Object> getEOCEVENTREFOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP() {
            if (eoceventrefOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP == null) {
                eoceventrefOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP = new ArrayList<Object>();
            }
            return this.eoceventrefOrEOCEXECUTABLEENTITYREFOrEOCEXECUTABLEENTITYREFGROUP;
        }

    }

}
