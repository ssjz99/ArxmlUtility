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
 * Communication attributes specific to distribution of  events (PPortPrototype, SenderReceiverInterface and dataElement carries an "event").
 * 
 * <p>QUEUED-SENDER-COM-SPEC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="QUEUED-SENDER-COM-SPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}P-PORT-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}QUEUED-SENDER-COM-SPEC"/>
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
@XmlType(name = "QUEUED-SENDER-COM-SPEC", propOrder = {
    "compositenetworkrepresentations",
    "dataelementref",
    "handleoutofrange",
    "networkrepresentation",
    "transmissionacknowledge",
    "usesendtoendprotection"
})
public class QUEUEDSENDERCOMSPEC {

    @XmlElement(name = "COMPOSITE-NETWORK-REPRESENTATIONS")
    protected Ar421.NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS compositenetworkrepresentations;
    @XmlElement(name = "DATA-ELEMENT-REF")
    protected Ar421.NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF dataelementref;
    @XmlElement(name = "HANDLE-OUT-OF-RANGE")
    protected HANDLEOUTOFRANGEENUM handleoutofrange;
    @XmlElement(name = "NETWORK-REPRESENTATION")
    protected SWDATADEFPROPS networkrepresentation;
    @XmlElement(name = "TRANSMISSION-ACKNOWLEDGE")
    protected TRANSMISSIONACKNOWLEDGEMENTREQUEST transmissionacknowledge;
    @XmlElement(name = "USES-END-TO-END-PROTECTION")
    protected BOOLEANVALUEVARIATIONPOINT usesendtoendprotection;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public Ar421.NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS getCOMPOSITENETWORKREPRESENTATIONS() {
        return compositenetworkrepresentations;
    }

    /**
     * ??compositenetworkrepresentations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS }
     *     
     */
    public void setCOMPOSITENETWORKREPRESENTATIONS(Ar421.NONQUEUEDSENDERCOMSPEC.COMPOSITENETWORKREPRESENTATIONS value) {
        this.compositenetworkrepresentations = value;
    }

    /**
     * ??dataelementref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public Ar421.NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF getDATAELEMENTREF() {
        return dataelementref;
    }

    /**
     * ??dataelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF }
     *     
     */
    public void setDATAELEMENTREF(Ar421.NONQUEUEDSENDERCOMSPEC.DATAELEMENTREF value) {
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

}
