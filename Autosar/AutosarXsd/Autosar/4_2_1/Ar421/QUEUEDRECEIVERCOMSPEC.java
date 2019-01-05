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
 * Communication attributes specific to queued receiving.
 * 
 * <p>QUEUED-RECEIVER-COM-SPEC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="QUEUED-RECEIVER-COM-SPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-PORT-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RECEIVER-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}QUEUED-RECEIVER-COM-SPEC"/>
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
@XmlType(name = "QUEUED-RECEIVER-COM-SPEC", propOrder = {
    "compositenetworkrepresentations",
    "dataelementref",
    "externalreplacementref",
    "handleoutofrange",
    "handleoutofrangestatus",
    "maxdeltacounterinit",
    "maxnoneworrepeateddata",
    "networkrepresentation",
    "replacewith",
    "synccounterinit",
    "transformationcomspecpropss",
    "usesendtoendprotection",
    "queuelength"
})
public class QUEUEDRECEIVERCOMSPEC {

    @XmlElement(name = "COMPOSITE-NETWORK-REPRESENTATIONS")
    protected QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS compositenetworkrepresentations;
    @XmlElement(name = "DATA-ELEMENT-REF")
    protected QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF dataelementref;
    @XmlElement(name = "EXTERNAL-REPLACEMENT-REF")
    protected QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF externalreplacementref;
    @XmlElement(name = "HANDLE-OUT-OF-RANGE")
    protected HANDLEOUTOFRANGEENUM handleoutofrange;
    @XmlElement(name = "HANDLE-OUT-OF-RANGE-STATUS")
    protected HANDLEOUTOFRANGESTATUSENUM handleoutofrangestatus;
    @XmlElement(name = "MAX-DELTA-COUNTER-INIT")
    protected POSITIVEINTEGERVALUEVARIATIONPOINT maxdeltacounterinit;
    @XmlElement(name = "MAX-NO-NEW-OR-REPEATED-DATA")
    protected POSITIVEINTEGER maxnoneworrepeateddata;
    @XmlElement(name = "NETWORK-REPRESENTATION")
    protected SWDATADEFPROPS networkrepresentation;
    @XmlElement(name = "REPLACE-WITH")
    protected VARIABLEACCESS replacewith;
    @XmlElement(name = "SYNC-COUNTER-INIT")
    protected POSITIVEINTEGER synccounterinit;
    @XmlElement(name = "TRANSFORMATION-COM-SPEC-PROPSS")
    protected QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS transformationcomspecpropss;
    @XmlElement(name = "USES-END-TO-END-PROTECTION")
    protected BOOLEANVALUEVARIATIONPOINT usesendtoendprotection;
    @XmlElement(name = "QUEUE-LENGTH")
    protected POSITIVEINTEGER queuelength;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @return
     *     possible object is
     *     {@link QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS getCOMPOSITENETWORKREPRESENTATIONS() {
        return compositenetworkrepresentations;
    }

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public void setCOMPOSITENETWORKREPRESENTATIONS(QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS value) {
        this.compositenetworkrepresentations = value;
    }

    /**
     * ??dataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF getDATAELEMENTREF() {
        return dataelementref;
    }

    /**
     * ??dataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public void setDATAELEMENTREF(QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF value) {
        this.dataelementref = value;
    }

    /**
     * ??externalreplacementref?????
     * 
     * @return
     *     possible object is
     *     {@link QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF }
     *     
     */
    public QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF getEXTERNALREPLACEMENTREF() {
        return externalreplacementref;
    }

    /**
     * ??externalreplacementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF }
     *     
     */
    public void setEXTERNALREPLACEMENTREF(QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF value) {
        this.externalreplacementref = value;
    }

    /**
     * ??handleoutofrange?????
     * 
     * @return
     *     possible object is
     *     {@link HANDLEOUTOFRANGEENUM }
     *     
     */
    public HANDLEOUTOFRANGEENUM getHANDLEOUTOFRANGE() {
        return handleoutofrange;
    }

    /**
     * ??handleoutofrange?????
     * 
     * @param value
     *     allowed object is
     *     {@link HANDLEOUTOFRANGEENUM }
     *     
     */
    public void setHANDLEOUTOFRANGE(HANDLEOUTOFRANGEENUM value) {
        this.handleoutofrange = value;
    }

    /**
     * ??handleoutofrangestatus?????
     * 
     * @return
     *     possible object is
     *     {@link HANDLEOUTOFRANGESTATUSENUM }
     *     
     */
    public HANDLEOUTOFRANGESTATUSENUM getHANDLEOUTOFRANGESTATUS() {
        return handleoutofrangestatus;
    }

    /**
     * ??handleoutofrangestatus?????
     * 
     * @param value
     *     allowed object is
     *     {@link HANDLEOUTOFRANGESTATUSENUM }
     *     
     */
    public void setHANDLEOUTOFRANGESTATUS(HANDLEOUTOFRANGESTATUSENUM value) {
        this.handleoutofrangestatus = value;
    }

    /**
     * ??maxdeltacounterinit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public POSITIVEINTEGERVALUEVARIATIONPOINT getMAXDELTACOUNTERINIT() {
        return maxdeltacounterinit;
    }

    /**
     * ??maxdeltacounterinit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGERVALUEVARIATIONPOINT }
     *     
     */
    public void setMAXDELTACOUNTERINIT(POSITIVEINTEGERVALUEVARIATIONPOINT value) {
        this.maxdeltacounterinit = value;
    }

    /**
     * ??maxnoneworrepeateddata?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXNONEWORREPEATEDDATA() {
        return maxnoneworrepeateddata;
    }

    /**
     * ??maxnoneworrepeateddata?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXNONEWORREPEATEDDATA(POSITIVEINTEGER value) {
        this.maxnoneworrepeateddata = value;
    }

    /**
     * ??networkrepresentation?????
     * 
     * @return
     *     possible object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public SWDATADEFPROPS getNETWORKREPRESENTATION() {
        return networkrepresentation;
    }

    /**
     * ??networkrepresentation?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWDATADEFPROPS }
     *     
     */
    public void setNETWORKREPRESENTATION(SWDATADEFPROPS value) {
        this.networkrepresentation = value;
    }

    /**
     * ??replacewith?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEACCESS }
     *     
     */
    public VARIABLEACCESS getREPLACEWITH() {
        return replacewith;
    }

    /**
     * ??replacewith?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEACCESS }
     *     
     */
    public void setREPLACEWITH(VARIABLEACCESS value) {
        this.replacewith = value;
    }

    /**
     * ??synccounterinit?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSYNCCOUNTERINIT() {
        return synccounterinit;
    }

    /**
     * ??synccounterinit?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSYNCCOUNTERINIT(POSITIVEINTEGER value) {
        this.synccounterinit = value;
    }

    /**
     * ??transformationcomspecpropss?????
     * 
     * @return
     *     possible object is
     *     {@link QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS }
     *     
     */
    public QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS getTRANSFORMATIONCOMSPECPROPSS() {
        return transformationcomspecpropss;
    }

    /**
     * ??transformationcomspecpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS }
     *     
     */
    public void setTRANSFORMATIONCOMSPECPROPSS(QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS value) {
        this.transformationcomspecpropss = value;
    }

    /**
     * ??usesendtoendprotection?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEANVALUEVARIATIONPOINT }
     *     
     */
    public BOOLEANVALUEVARIATIONPOINT getUSESENDTOENDPROTECTION() {
        return usesendtoendprotection;
    }

    /**
     * ??usesendtoendprotection?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEANVALUEVARIATIONPOINT }
     *     
     */
    public void setUSESENDTOENDPROTECTION(BOOLEANVALUEVARIATIONPOINT value) {
        this.usesendtoendprotection = value;
    }

    /**
     * ??queuelength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getQUEUELENGTH() {
        return queuelength;
    }

    /**
     * ??queuelength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setQUEUELENGTH(POSITIVEINTEGER value) {
        this.queuelength = value;
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
     *         &lt;element name="COMPOSITE-NETWORK-REPRESENTATION" type="{http://autosar.org/schema/r4.0}COMPOSITE-NETWORK-REPRESENTATION"/>
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
        "compositenetworkrepresentation"
    })
    public static class COMPOSITENETWORKREPRESENTATIONS {

        @XmlElement(name = "COMPOSITE-NETWORK-REPRESENTATION")
        protected List<COMPOSITENETWORKREPRESENTATION> compositenetworkrepresentation;

        /**
         * Gets the value of the compositenetworkrepresentation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compositenetworkrepresentation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMPOSITENETWORKREPRESENTATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPOSITENETWORKREPRESENTATION }
         * 
         * 
         */
        public List<COMPOSITENETWORKREPRESENTATION> getCOMPOSITENETWORKREPRESENTATION() {
            if (compositenetworkrepresentation == null) {
                compositenetworkrepresentation = new ArrayList<COMPOSITENETWORKREPRESENTATION>();
            }
            return this.compositenetworkrepresentation;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATAELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected VARIABLEDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public VARIABLEDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(VARIABLEDATAPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EXTERNALREPLACEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected AUTOSARDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public AUTOSARDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(AUTOSARDATAPROTOTYPESUBTYPESENUM value) {
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
     *         &lt;element name="END-TO-END-TRANSFORMATION-COM-SPEC-PROPS" type="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-COM-SPEC-PROPS"/>
     *         &lt;element name="USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS" type="{http://autosar.org/schema/r4.0}USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS"/>
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
        "endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS"
    })
    public static class TRANSFORMATIONCOMSPECPROPSS {

        @XmlElements({
            @XmlElement(name = "END-TO-END-TRANSFORMATION-COM-SPEC-PROPS", type = ENDTOENDTRANSFORMATIONCOMSPECPROPS.class),
            @XmlElement(name = "USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS", type = USERDEFINEDTRANSFORMATIONCOMSPECPROPS.class)
        })
        protected List<Object> endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS;

        /**
         * Gets the value of the endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDTRANSFORMATIONCOMSPECPROPSOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDTRANSFORMATIONCOMSPECPROPS }
         * {@link USERDEFINEDTRANSFORMATIONCOMSPECPROPS }
         * 
         * 
         */
        public List<Object> getENDTOENDTRANSFORMATIONCOMSPECPROPSOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS() {
            if (endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS == null) {
                endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS = new ArrayList<Object>();
            }
            return this.endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS;
        }

    }

}
