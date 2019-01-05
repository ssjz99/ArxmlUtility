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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Communication attributes specific to non-queued receiving.
 * 
 * <p>NONQUEUED-RECEIVER-COM-SPEC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NONQUEUED-RECEIVER-COM-SPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-PORT-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RECEIVER-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NONQUEUED-RECEIVER-COM-SPEC"/>
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
@XmlType(name = "NONQUEUED-RECEIVER-COM-SPEC", propOrder = {
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
    "alivetimeout",
    "enableupdate",
    "filter",
    "handledatastatus",
    "handleneverreceived",
    "handletimeouttype",
    "initvalue"
})
public class NONQUEUEDRECEIVERCOMSPEC {

    @XmlElement(name = "COMPOSITE-NETWORK-REPRESENTATIONS")
    protected Ar421.QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS compositenetworkrepresentations;
    @XmlElement(name = "DATA-ELEMENT-REF")
    protected Ar421.QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF dataelementref;
    @XmlElement(name = "EXTERNAL-REPLACEMENT-REF")
    protected Ar421.QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF externalreplacementref;
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
    protected Ar421.QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS transformationcomspecpropss;
    @XmlElement(name = "USES-END-TO-END-PROTECTION")
    protected BOOLEANVALUEVARIATIONPOINT usesendtoendprotection;
    @XmlElement(name = "ALIVE-TIMEOUT")
    protected TIMEVALUE alivetimeout;
    @XmlElement(name = "ENABLE-UPDATE")
    protected BOOLEAN enableupdate;
    @XmlElement(name = "FILTER")
    protected DATAFILTER filter;
    @XmlElement(name = "HANDLE-DATA-STATUS")
    protected BOOLEAN handledatastatus;
    @XmlElement(name = "HANDLE-NEVER-RECEIVED")
    protected BOOLEAN handleneverreceived;
    @XmlElement(name = "HANDLE-TIMEOUT-TYPE")
    protected HANDLETIMEOUTENUM handletimeouttype;
    @XmlElement(name = "INIT-VALUE")
    protected NONQUEUEDRECEIVERCOMSPEC.INITVALUE initvalue;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public Ar421.QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS getCOMPOSITENETWORKREPRESENTATIONS() {
        return compositenetworkrepresentations;
    }

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public void setCOMPOSITENETWORKREPRESENTATIONS(Ar421.QUEUEDRECEIVERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS value) {
        this.compositenetworkrepresentations = value;
    }

    /**
     * ??dataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public Ar421.QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF getDATAELEMENTREF() {
        return dataelementref;
    }

    /**
     * ??dataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public void setDATAELEMENTREF(Ar421.QUEUEDRECEIVERCOMSPEC.DATAELEMENTREF value) {
        this.dataelementref = value;
    }

    /**
     * ??externalreplacementref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF }
     *     
     */
    public Ar421.QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF getEXTERNALREPLACEMENTREF() {
        return externalreplacementref;
    }

    /**
     * ??externalreplacementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF }
     *     
     */
    public void setEXTERNALREPLACEMENTREF(Ar421.QUEUEDRECEIVERCOMSPEC.EXTERNALREPLACEMENTREF value) {
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
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS }
     *     
     */
    public Ar421.QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS getTRANSFORMATIONCOMSPECPROPSS() {
        return transformationcomspecpropss;
    }

    /**
     * ??transformationcomspecpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS }
     *     
     */
    public void setTRANSFORMATIONCOMSPECPROPSS(Ar421.QUEUEDRECEIVERCOMSPEC.TRANSFORMATIONCOMSPECPROPSS value) {
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
     * ??alivetimeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getALIVETIMEOUT() {
        return alivetimeout;
    }

    /**
     * ??alivetimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setALIVETIMEOUT(TIMEVALUE value) {
        this.alivetimeout = value;
    }

    /**
     * ??enableupdate?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getENABLEUPDATE() {
        return enableupdate;
    }

    /**
     * ??enableupdate?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setENABLEUPDATE(BOOLEAN value) {
        this.enableupdate = value;
    }

    /**
     * ??filter?????
     * 
     * @return
     *     possible object is
     *     {@link DATAFILTER }
     *     
     */
    public DATAFILTER getFILTER() {
        return filter;
    }

    /**
     * ??filter?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATAFILTER }
     *     
     */
    public void setFILTER(DATAFILTER value) {
        this.filter = value;
    }

    /**
     * ??handledatastatus?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getHANDLEDATASTATUS() {
        return handledatastatus;
    }

    /**
     * ??handledatastatus?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setHANDLEDATASTATUS(BOOLEAN value) {
        this.handledatastatus = value;
    }

    /**
     * ??handleneverreceived?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getHANDLENEVERRECEIVED() {
        return handleneverreceived;
    }

    /**
     * ??handleneverreceived?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setHANDLENEVERRECEIVED(BOOLEAN value) {
        this.handleneverreceived = value;
    }

    /**
     * ??handletimeouttype?????
     * 
     * @return
     *     possible object is
     *     {@link HANDLETIMEOUTENUM }
     *     
     */
    public HANDLETIMEOUTENUM getHANDLETIMEOUTTYPE() {
        return handletimeouttype;
    }

    /**
     * ??handletimeouttype?????
     * 
     * @param value
     *     allowed object is
     *     {@link HANDLETIMEOUTENUM }
     *     
     */
    public void setHANDLETIMEOUTTYPE(HANDLETIMEOUTENUM value) {
        this.handletimeouttype = value;
    }

    /**
     * ??initvalue?????
     * 
     * @return
     *     possible object is
     *     {@link NONQUEUEDRECEIVERCOMSPEC.INITVALUE }
     *     
     */
    public NONQUEUEDRECEIVERCOMSPEC.INITVALUE getINITVALUE() {
        return initvalue;
    }

    /**
     * ??initvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link NONQUEUEDRECEIVERCOMSPEC.INITVALUE }
     *     
     */
    public void setINITVALUE(NONQUEUEDRECEIVERCOMSPEC.INITVALUE value) {
        this.initvalue = value;
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
    public static class INITVALUE {

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

}
