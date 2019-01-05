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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>DIAGNOSTIC-COMMON-PROPS-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-COMMON-PROPS-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-PROPS-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-PROPS-CONDITIONAL"/>
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
@XmlType(name = "DIAGNOSTIC-COMMON-PROPS-CONDITIONAL", propOrder = {
    "agingrequirestestedcycle",
    "cleardtclimitation",
    "debouncealgorithmpropss",
    "defaultendianness",
    "dtcstatusavailabilitymask",
    "environmentdatacapture",
    "eventdisplacementstrategy",
    "maxnumberofevententries",
    "maxnumberofrequestcorrectlyreceivedresponsepending",
    "memoryentrystoragetrigger",
    "occurrencecounterprocessing",
    "resetconfirmedbitonoverflow",
    "responseonallrequestsids",
    "responseonseconddeclinedrequest",
    "securitydelaytimeonboot",
    "statusbithandlingtestfailedsincelastclear",
    "statusbitstoragetestfailed",
    "typeofdtcsupported",
    "typeoffreezeframerecordnumeration",
    "variationpoint"
})
public class DIAGNOSTICCOMMONPROPSCONDITIONAL {

    @XmlElement(name = "AGING-REQUIRES-TESTED-CYCLE")
    protected BOOLEAN agingrequirestestedcycle;
    @XmlElement(name = "CLEAR-DTC-LIMITATION")
    protected DIAGNOSTICCLEARDTCLIMITATIONENUM cleardtclimitation;
    @XmlElement(name = "DEBOUNCE-ALGORITHM-PROPSS")
    protected DIAGNOSTICCOMMONPROPSCONDITIONAL.DEBOUNCEALGORITHMPROPSS debouncealgorithmpropss;
    @XmlElement(name = "DEFAULT-ENDIANNESS")
    protected BYTEORDERENUM defaultendianness;
    @XmlElement(name = "DTC-STATUS-AVAILABILITY-MASK")
    protected POSITIVEINTEGER dtcstatusavailabilitymask;
    @XmlElement(name = "ENVIRONMENT-DATA-CAPTURE")
    protected DIAGNOSTICDATACAPTUREENUM environmentdatacapture;
    @XmlElement(name = "EVENT-DISPLACEMENT-STRATEGY")
    protected DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUM eventdisplacementstrategy;
    @XmlElement(name = "MAX-NUMBER-OF-EVENT-ENTRIES")
    protected POSITIVEINTEGER maxnumberofevententries;
    @XmlElement(name = "MAX-NUMBER-OF-REQUEST-CORRECTLY-RECEIVED-RESPONSE-PENDING")
    protected POSITIVEINTEGER maxnumberofrequestcorrectlyreceivedresponsepending;
    @XmlElement(name = "MEMORY-ENTRY-STORAGE-TRIGGER")
    protected DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUM memoryentrystoragetrigger;
    @XmlElement(name = "OCCURRENCE-COUNTER-PROCESSING")
    protected DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUM occurrencecounterprocessing;
    @XmlElement(name = "RESET-CONFIRMED-BIT-ON-OVERFLOW")
    protected BOOLEAN resetconfirmedbitonoverflow;
    @XmlElement(name = "RESPONSE-ON-ALL-REQUEST-SIDS")
    protected BOOLEAN responseonallrequestsids;
    @XmlElement(name = "RESPONSE-ON-SECOND-DECLINED-REQUEST")
    protected BOOLEAN responseonseconddeclinedrequest;
    @XmlElement(name = "SECURITY-DELAY-TIME-ON-BOOT")
    protected TIMEVALUE securitydelaytimeonboot;
    @XmlElement(name = "STATUS-BIT-HANDLING-TEST-FAILED-SINCE-LAST-CLEAR")
    protected DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUM statusbithandlingtestfailedsincelastclear;
    @XmlElement(name = "STATUS-BIT-STORAGE-TEST-FAILED")
    protected BOOLEAN statusbitstoragetestfailed;
    @XmlElement(name = "TYPE-OF-DTC-SUPPORTED")
    protected DIAGNOSTICTYPEOFDTCSUPPORTEDENUM typeofdtcsupported;
    @XmlElement(name = "TYPE-OF-FREEZE-FRAME-RECORD-NUMERATION")
    protected DIAGNOSTICTYPEOFFREEZEFRAMERECORDNUMERATIONENUM typeoffreezeframerecordnumeration;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??agingrequirestestedcycle?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getAGINGREQUIRESTESTEDCYCLE() {
        return agingrequirestestedcycle;
    }

    /**
     * ??agingrequirestestedcycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setAGINGREQUIRESTESTEDCYCLE(BOOLEAN value) {
        this.agingrequirestestedcycle = value;
    }

    /**
     * ??cleardtclimitation?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCLEARDTCLIMITATIONENUM }
     *     
     */
    public DIAGNOSTICCLEARDTCLIMITATIONENUM getCLEARDTCLIMITATION() {
        return cleardtclimitation;
    }

    /**
     * ??cleardtclimitation?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCLEARDTCLIMITATIONENUM }
     *     
     */
    public void setCLEARDTCLIMITATION(DIAGNOSTICCLEARDTCLIMITATIONENUM value) {
        this.cleardtclimitation = value;
    }

    /**
     * ??debouncealgorithmpropss?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCOMMONPROPSCONDITIONAL.DEBOUNCEALGORITHMPROPSS }
     *     
     */
    public DIAGNOSTICCOMMONPROPSCONDITIONAL.DEBOUNCEALGORITHMPROPSS getDEBOUNCEALGORITHMPROPSS() {
        return debouncealgorithmpropss;
    }

    /**
     * ??debouncealgorithmpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCOMMONPROPSCONDITIONAL.DEBOUNCEALGORITHMPROPSS }
     *     
     */
    public void setDEBOUNCEALGORITHMPROPSS(DIAGNOSTICCOMMONPROPSCONDITIONAL.DEBOUNCEALGORITHMPROPSS value) {
        this.debouncealgorithmpropss = value;
    }

    /**
     * ??defaultendianness?????
     * 
     * @return
     *     possible object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public BYTEORDERENUM getDEFAULTENDIANNESS() {
        return defaultendianness;
    }

    /**
     * ??defaultendianness?????
     * 
     * @param value
     *     allowed object is
     *     {@link BYTEORDERENUM }
     *     
     */
    public void setDEFAULTENDIANNESS(BYTEORDERENUM value) {
        this.defaultendianness = value;
    }

    /**
     * ??dtcstatusavailabilitymask?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDTCSTATUSAVAILABILITYMASK() {
        return dtcstatusavailabilitymask;
    }

    /**
     * ??dtcstatusavailabilitymask?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDTCSTATUSAVAILABILITYMASK(POSITIVEINTEGER value) {
        this.dtcstatusavailabilitymask = value;
    }

    /**
     * ??environmentdatacapture?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICDATACAPTUREENUM }
     *     
     */
    public DIAGNOSTICDATACAPTUREENUM getENVIRONMENTDATACAPTURE() {
        return environmentdatacapture;
    }

    /**
     * ??environmentdatacapture?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICDATACAPTUREENUM }
     *     
     */
    public void setENVIRONMENTDATACAPTURE(DIAGNOSTICDATACAPTUREENUM value) {
        this.environmentdatacapture = value;
    }

    /**
     * ??eventdisplacementstrategy?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUM }
     *     
     */
    public DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUM getEVENTDISPLACEMENTSTRATEGY() {
        return eventdisplacementstrategy;
    }

    /**
     * ??eventdisplacementstrategy?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUM }
     *     
     */
    public void setEVENTDISPLACEMENTSTRATEGY(DIAGNOSTICEVENTDISPLACEMENTSTRATEGYENUM value) {
        this.eventdisplacementstrategy = value;
    }

    /**
     * ??maxnumberofevententries?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXNUMBEROFEVENTENTRIES() {
        return maxnumberofevententries;
    }

    /**
     * ??maxnumberofevententries?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXNUMBEROFEVENTENTRIES(POSITIVEINTEGER value) {
        this.maxnumberofevententries = value;
    }

    /**
     * ??maxnumberofrequestcorrectlyreceivedresponsepending?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXNUMBEROFREQUESTCORRECTLYRECEIVEDRESPONSEPENDING() {
        return maxnumberofrequestcorrectlyreceivedresponsepending;
    }

    /**
     * ??maxnumberofrequestcorrectlyreceivedresponsepending?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXNUMBEROFREQUESTCORRECTLYRECEIVEDRESPONSEPENDING(POSITIVEINTEGER value) {
        this.maxnumberofrequestcorrectlyreceivedresponsepending = value;
    }

    /**
     * ??memoryentrystoragetrigger?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUM }
     *     
     */
    public DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUM getMEMORYENTRYSTORAGETRIGGER() {
        return memoryentrystoragetrigger;
    }

    /**
     * ??memoryentrystoragetrigger?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUM }
     *     
     */
    public void setMEMORYENTRYSTORAGETRIGGER(DIAGNOSTICMEMORYENTRYSTORAGETRIGGERENUM value) {
        this.memoryentrystoragetrigger = value;
    }

    /**
     * ??occurrencecounterprocessing?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUM }
     *     
     */
    public DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUM getOCCURRENCECOUNTERPROCESSING() {
        return occurrencecounterprocessing;
    }

    /**
     * ??occurrencecounterprocessing?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUM }
     *     
     */
    public void setOCCURRENCECOUNTERPROCESSING(DIAGNOSTICOCCURRENCECOUNTERPROCESSINGENUM value) {
        this.occurrencecounterprocessing = value;
    }

    /**
     * ??resetconfirmedbitonoverflow?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRESETCONFIRMEDBITONOVERFLOW() {
        return resetconfirmedbitonoverflow;
    }

    /**
     * ??resetconfirmedbitonoverflow?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRESETCONFIRMEDBITONOVERFLOW(BOOLEAN value) {
        this.resetconfirmedbitonoverflow = value;
    }

    /**
     * ??responseonallrequestsids?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRESPONSEONALLREQUESTSIDS() {
        return responseonallrequestsids;
    }

    /**
     * ??responseonallrequestsids?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRESPONSEONALLREQUESTSIDS(BOOLEAN value) {
        this.responseonallrequestsids = value;
    }

    /**
     * ??responseonseconddeclinedrequest?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRESPONSEONSECONDDECLINEDREQUEST() {
        return responseonseconddeclinedrequest;
    }

    /**
     * ??responseonseconddeclinedrequest?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRESPONSEONSECONDDECLINEDREQUEST(BOOLEAN value) {
        this.responseonseconddeclinedrequest = value;
    }

    /**
     * ??securitydelaytimeonboot?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getSECURITYDELAYTIMEONBOOT() {
        return securitydelaytimeonboot;
    }

    /**
     * ??securitydelaytimeonboot?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setSECURITYDELAYTIMEONBOOT(TIMEVALUE value) {
        this.securitydelaytimeonboot = value;
    }

    /**
     * ??statusbithandlingtestfailedsincelastclear?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUM }
     *     
     */
    public DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUM getSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEAR() {
        return statusbithandlingtestfailedsincelastclear;
    }

    /**
     * ??statusbithandlingtestfailedsincelastclear?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUM }
     *     
     */
    public void setSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEAR(DIAGNOSTICSTATUSBITHANDLINGTESTFAILEDSINCELASTCLEARENUM value) {
        this.statusbithandlingtestfailedsincelastclear = value;
    }

    /**
     * ??statusbitstoragetestfailed?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getSTATUSBITSTORAGETESTFAILED() {
        return statusbitstoragetestfailed;
    }

    /**
     * ??statusbitstoragetestfailed?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setSTATUSBITSTORAGETESTFAILED(BOOLEAN value) {
        this.statusbitstoragetestfailed = value;
    }

    /**
     * ??typeofdtcsupported?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICTYPEOFDTCSUPPORTEDENUM }
     *     
     */
    public DIAGNOSTICTYPEOFDTCSUPPORTEDENUM getTYPEOFDTCSUPPORTED() {
        return typeofdtcsupported;
    }

    /**
     * ??typeofdtcsupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICTYPEOFDTCSUPPORTEDENUM }
     *     
     */
    public void setTYPEOFDTCSUPPORTED(DIAGNOSTICTYPEOFDTCSUPPORTEDENUM value) {
        this.typeofdtcsupported = value;
    }

    /**
     * ??typeoffreezeframerecordnumeration?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICTYPEOFFREEZEFRAMERECORDNUMERATIONENUM }
     *     
     */
    public DIAGNOSTICTYPEOFFREEZEFRAMERECORDNUMERATIONENUM getTYPEOFFREEZEFRAMERECORDNUMERATION() {
        return typeoffreezeframerecordnumeration;
    }

    /**
     * ??typeoffreezeframerecordnumeration?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICTYPEOFFREEZEFRAMERECORDNUMERATIONENUM }
     *     
     */
    public void setTYPEOFFREEZEFRAMERECORDNUMERATION(DIAGNOSTICTYPEOFFREEZEFRAMERECORDNUMERATIONENUM value) {
        this.typeoffreezeframerecordnumeration = value;
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
     *         &lt;element name="DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS"/>
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
        "diagnosticdebouncealgorithmprops"
    })
    public static class DEBOUNCEALGORITHMPROPSS {

        @XmlElement(name = "DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS")
        protected List<DIAGNOSTICDEBOUNCEALGORITHMPROPS> diagnosticdebouncealgorithmprops;

        /**
         * Gets the value of the diagnosticdebouncealgorithmprops property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticdebouncealgorithmprops property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICDEBOUNCEALGORITHMPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICDEBOUNCEALGORITHMPROPS }
         * 
         * 
         */
        public List<DIAGNOSTICDEBOUNCEALGORITHMPROPS> getDIAGNOSTICDEBOUNCEALGORITHMPROPS() {
            if (diagnosticdebouncealgorithmprops == null) {
                diagnosticdebouncealgorithmprops = new ArrayList<DIAGNOSTICDEBOUNCEALGORITHMPROPS>();
            }
            return this.diagnosticdebouncealgorithmprops;
        }

    }

}
