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
 * Communication attributes for non-queued sender/receiver communication (sender side)
 * 
 * <p>NONQUEUED-SENDER-COM-SPEC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NONQUEUED-SENDER-COM-SPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}P-PORT-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NONQUEUED-SENDER-COM-SPEC"/>
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
@XmlType(name = "NONQUEUED-SENDER-COM-SPEC", propOrder = {
    "compositenetworkrepresentations",
    "dataelementref",
    "handleoutofrange",
    "networkrepresentation",
    "transmissionacknowledge",
    "usesendtoendprotection",
    "initvalue"
})
public class NONQUEUEDSENDERCOMSPEC {

    @XmlElement(name = "COMPOSITE-NETWORK-REPRESENTATIONS")
    protected NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS compositenetworkrepresentations;
    @XmlElement(name = "DATA-ELEMENT-REF")
    protected NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF dataelementref;
    @XmlElement(name = "HANDLE-OUT-OF-RANGE")
    protected HANDLEOUTOFRANGEENUM handleoutofrange;
    @XmlElement(name = "NETWORK-REPRESENTATION")
    protected SWDATADEFPROPS networkrepresentation;
    @XmlElement(name = "TRANSMISSION-ACKNOWLEDGE")
    protected TRANSMISSIONACKNOWLEDGEMENTREQUEST transmissionacknowledge;
    @XmlElement(name = "USES-END-TO-END-PROTECTION")
    protected BOOLEANVALUEVARIATIONPOINT usesendtoendprotection;
    @XmlElement(name = "INIT-VALUE")
    protected NONQUEUEDSENDERCOMSPEC.INITVALUE initvalue;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @return
     *     possible object is
     *     {@link NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS getCOMPOSITENETWORKREPRESENTATIONS() {
        return compositenetworkrepresentations;
    }

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public void setCOMPOSITENETWORKREPRESENTATIONS(NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS value) {
        this.compositenetworkrepresentations = value;
    }

    /**
     * ??dataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF getDATAELEMENTREF() {
        return dataelementref;
    }

    /**
     * ??dataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public void setDATAELEMENTREF(NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF value) {
        this.dataelementref = value;
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
     * ??transmissionacknowledge?????
     * 
     * @return
     *     possible object is
     *     {@link TRANSMISSIONACKNOWLEDGEMENTREQUEST }
     *     
     */
    public TRANSMISSIONACKNOWLEDGEMENTREQUEST getTRANSMISSIONACKNOWLEDGE() {
        return transmissionacknowledge;
    }

    /**
     * ??transmissionacknowledge?????
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSMISSIONACKNOWLEDGEMENTREQUEST }
     *     
     */
    public void setTRANSMISSIONACKNOWLEDGE(TRANSMISSIONACKNOWLEDGEMENTREQUEST value) {
        this.transmissionacknowledge = value;
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
     * ??initvalue?????
     * 
     * @return
     *     possible object is
     *     {@link NONQUEUEDSENDERCOMSPEC.INITVALUE }
     *     
     */
    public NONQUEUEDSENDERCOMSPEC.INITVALUE getINITVALUE() {
        return initvalue;
    }

    /**
     * ??initvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link NONQUEUEDSENDERCOMSPEC.INITVALUE }
     *     
     */
    public void setINITVALUE(NONQUEUEDSENDERCOMSPEC.INITVALUE value) {
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
