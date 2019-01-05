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
 * This element was generated/modified due to an atpVariation stereotype.
 * 
 * <p>LIN-SLAVE-CONDITIONAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-SLAVE-CONDITIONAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-COMMUNICATION-CONTROLLER-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-SLAVE-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-SLAVE-CONDITIONAL"/>
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
@XmlType(name = "LIN-SLAVE-CONDITIONAL", propOrder = {
    "wakeupbycontrollersupported",
    "protocolversion",
    "configurednad",
    "functionid",
    "linerrorresponse",
    "supplierid",
    "variantid",
    "variationpoint"
})
public class LINSLAVECONDITIONAL {

    @XmlElement(name = "WAKE-UP-BY-CONTROLLER-SUPPORTED")
    protected BOOLEAN wakeupbycontrollersupported;
    @XmlElement(name = "PROTOCOL-VERSION")
    protected STRING protocolversion;
    @XmlElement(name = "CONFIGURED-NAD")
    protected INTEGER configurednad;
    @XmlElement(name = "FUNCTION-ID")
    protected POSITIVEINTEGER functionid;
    @XmlElement(name = "LIN-ERROR-RESPONSE")
    protected LINERRORRESPONSE linerrorresponse;
    @XmlElement(name = "SUPPLIER-ID")
    protected POSITIVEINTEGER supplierid;
    @XmlElement(name = "VARIANT-ID")
    protected POSITIVEINTEGER variantid;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getWAKEUPBYCONTROLLERSUPPORTED() {
        return wakeupbycontrollersupported;
    }

    /**
     * ??wakeupbycontrollersupported?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setWAKEUPBYCONTROLLERSUPPORTED(BOOLEAN value) {
        this.wakeupbycontrollersupported = value;
    }

    /**
     * ??protocolversion?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getPROTOCOLVERSION() {
        return protocolversion;
    }

    /**
     * ??protocolversion?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setPROTOCOLVERSION(STRING value) {
        this.protocolversion = value;
    }

    /**
     * ??configurednad?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCONFIGUREDNAD() {
        return configurednad;
    }

    /**
     * ??configurednad?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCONFIGUREDNAD(INTEGER value) {
        this.configurednad = value;
    }

    /**
     * ??functionid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFUNCTIONID() {
        return functionid;
    }

    /**
     * ??functionid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFUNCTIONID(POSITIVEINTEGER value) {
        this.functionid = value;
    }

    /**
     * ??linerrorresponse?????
     * 
     * @return
     *     possible object is
     *     {@link LINERRORRESPONSE }
     *     
     */
    public LINERRORRESPONSE getLINERRORRESPONSE() {
        return linerrorresponse;
    }

    /**
     * ??linerrorresponse?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINERRORRESPONSE }
     *     
     */
    public void setLINERRORRESPONSE(LINERRORRESPONSE value) {
        this.linerrorresponse = value;
    }

    /**
     * ??supplierid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSUPPLIERID() {
        return supplierid;
    }

    /**
     * ??supplierid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSUPPLIERID(POSITIVEINTEGER value) {
        this.supplierid = value;
    }

    /**
     * ??variantid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getVARIANTID() {
        return variantid;
    }

    /**
     * ??variantid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setVARIANTID(POSITIVEINTEGER value) {
        this.variantid = value;
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

}
