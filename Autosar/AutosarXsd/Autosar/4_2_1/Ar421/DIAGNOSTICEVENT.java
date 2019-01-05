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
 * This element is used to configure DiagnosticEvents.
 * 
 * <p>DIAGNOSTIC-EVENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-EVENT">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT"/>
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
@XmlType(name = "DIAGNOSTIC-EVENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "agingallowed",
    "cleareventbehavior",
    "connectedindicators",
    "eventclearallowed",
    "eventfailurecyclecounterthreshold",
    "eventkind",
    "prestoragefreezeframe"
})
public class DIAGNOSTICEVENT {

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
    @XmlElement(name = "AGING-ALLOWED")
    protected BOOLEAN agingallowed;
    @XmlElement(name = "CLEAR-EVENT-BEHAVIOR")
    protected DIAGNOSTICCLEAREVENTBEHAVIORENUM cleareventbehavior;
    @XmlElement(name = "CONNECTED-INDICATORS")
    protected DIAGNOSTICEVENT.CONNECTEDINDICATORS connectedindicators;
    @XmlElement(name = "EVENT-CLEAR-ALLOWED")
    protected DIAGNOSTICEVENTCLEARALLOWEDENUM eventclearallowed;
    @XmlElement(name = "EVENT-FAILURE-CYCLE-COUNTER-THRESHOLD")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT eventfailurecyclecounterthreshold;
    @XmlElement(name = "EVENT-KIND")
    protected DIAGNOSTICEVENTKINDENUM eventkind;
    @XmlElement(name = "PRESTORAGE-FREEZE-FRAME")
    protected BOOLEAN prestoragefreezeframe;
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
     * ??agingallowed?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getAGINGALLOWED() {
        return agingallowed;
    }

    /**
     * ??agingallowed?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setAGINGALLOWED(BOOLEAN value) {
        this.agingallowed = value;
    }

    /**
     * ??cleareventbehavior?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCLEAREVENTBEHAVIORENUM }
     *     
     */
    public DIAGNOSTICCLEAREVENTBEHAVIORENUM getCLEAREVENTBEHAVIOR() {
        return cleareventbehavior;
    }

    /**
     * ??cleareventbehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCLEAREVENTBEHAVIORENUM }
     *     
     */
    public void setCLEAREVENTBEHAVIOR(DIAGNOSTICCLEAREVENTBEHAVIORENUM value) {
        this.cleareventbehavior = value;
    }

    /**
     * ??connectedindicators?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENT.CONNECTEDINDICATORS }
     *     
     */
    public DIAGNOSTICEVENT.CONNECTEDINDICATORS getCONNECTEDINDICATORS() {
        return connectedindicators;
    }

    /**
     * ??connectedindicators?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENT.CONNECTEDINDICATORS }
     *     
     */
    public void setCONNECTEDINDICATORS(DIAGNOSTICEVENT.CONNECTEDINDICATORS value) {
        this.connectedindicators = value;
    }

    /**
     * ??eventclearallowed?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTCLEARALLOWEDENUM }
     *     
     */
    public DIAGNOSTICEVENTCLEARALLOWEDENUM getEVENTCLEARALLOWED() {
        return eventclearallowed;
    }

    /**
     * ??eventclearallowed?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTCLEARALLOWEDENUM }
     *     
     */
    public void setEVENTCLEARALLOWED(DIAGNOSTICEVENTCLEARALLOWEDENUM value) {
        this.eventclearallowed = value;
    }

    /**
     * ??eventfailurecyclecounterthreshold?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getEVENTFAILURECYCLECOUNTERTHRESHOLD() {
        return eventfailurecyclecounterthreshold;
    }

    /**
     * ??eventfailurecyclecounterthreshold?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setEVENTFAILURECYCLECOUNTERTHRESHOLD(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.eventfailurecyclecounterthreshold = value;
    }

    /**
     * ??eventkind?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTKINDENUM }
     *     
     */
    public DIAGNOSTICEVENTKINDENUM getEVENTKIND() {
        return eventkind;
    }

    /**
     * ??eventkind?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTKINDENUM }
     *     
     */
    public void setEVENTKIND(DIAGNOSTICEVENTKINDENUM value) {
        this.eventkind = value;
    }

    /**
     * ??prestoragefreezeframe?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPRESTORAGEFREEZEFRAME() {
        return prestoragefreezeframe;
    }

    /**
     * ??prestoragefreezeframe?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPRESTORAGEFREEZEFRAME(BOOLEAN value) {
        this.prestoragefreezeframe = value;
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
     *         &lt;element name="DIAGNOSTIC-CONNECTED-INDICATOR" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-CONNECTED-INDICATOR"/>
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
        "diagnosticconnectedindicator"
    })
    public static class CONNECTEDINDICATORS {

        @XmlElement(name = "DIAGNOSTIC-CONNECTED-INDICATOR")
        protected List<DIAGNOSTICCONNECTEDINDICATOR> diagnosticconnectedindicator;

        /**
         * Gets the value of the diagnosticconnectedindicator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticconnectedindicator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICCONNECTEDINDICATOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICCONNECTEDINDICATOR }
         * 
         * 
         */
        public List<DIAGNOSTICCONNECTEDINDICATOR> getDIAGNOSTICCONNECTEDINDICATOR() {
            if (diagnosticconnectedindicator == null) {
                diagnosticconnectedindicator = new ArrayList<DIAGNOSTICCONNECTEDINDICATOR>();
            }
            return this.diagnosticconnectedindicator;
        }

    }

}
