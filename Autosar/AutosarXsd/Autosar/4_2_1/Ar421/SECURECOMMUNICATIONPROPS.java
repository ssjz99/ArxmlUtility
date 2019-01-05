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
 * Properties used to configure SecuredIPdus.
 * 
 * <p>SECURE-COMMUNICATION-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SECURE-COMMUNICATION-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SECURE-COMMUNICATION-PROPS"/>
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
@XmlType(name = "SECURE-COMMUNICATION-PROPS", propOrder = {
    "authalgorithm",
    "authinfotxlength",
    "authenticationretries",
    "dataid",
    "freshnesscountersyncattempts",
    "freshnesstimestamptimeperiodfactor",
    "freshnessvalueid",
    "freshnessvaluelength",
    "freshnessvaluetxlength",
    "secondaryfreshnessvalueid",
    "usefreshnesstimestamp"
})
public class SECURECOMMUNICATIONPROPS {

    @XmlElement(name = "AUTH-ALGORITHM")
    protected STRING authalgorithm;
    @XmlElement(name = "AUTH-INFO-TX-LENGTH")
    protected POSITIVEINTEGER authinfotxlength;
    @XmlElement(name = "AUTHENTICATION-RETRIES")
    protected POSITIVEINTEGER authenticationretries;
    @XmlElement(name = "DATA-ID")
    protected POSITIVEINTEGER dataid;
    @XmlElement(name = "FRESHNESS-COUNTER-SYNC-ATTEMPTS")
    protected POSITIVEINTEGER freshnesscountersyncattempts;
    @XmlElement(name = "FRESHNESS-TIMESTAMP-TIME-PERIOD-FACTOR")
    protected POSITIVEINTEGER freshnesstimestamptimeperiodfactor;
    @XmlElement(name = "FRESHNESS-VALUE-ID")
    protected POSITIVEINTEGER freshnessvalueid;
    @XmlElement(name = "FRESHNESS-VALUE-LENGTH")
    protected POSITIVEINTEGER freshnessvaluelength;
    @XmlElement(name = "FRESHNESS-VALUE-TX-LENGTH")
    protected POSITIVEINTEGER freshnessvaluetxlength;
    @XmlElement(name = "SECONDARY-FRESHNESS-VALUE-ID")
    protected POSITIVEINTEGER secondaryfreshnessvalueid;
    @XmlElement(name = "USE-FRESHNESS-TIMESTAMP")
    protected BOOLEAN usefreshnesstimestamp;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??authalgorithm?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getAUTHALGORITHM() {
        return authalgorithm;
    }

    /**
     * ??authalgorithm?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setAUTHALGORITHM(STRING value) {
        this.authalgorithm = value;
    }

    /**
     * ??authinfotxlength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getAUTHINFOTXLENGTH() {
        return authinfotxlength;
    }

    /**
     * ??authinfotxlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setAUTHINFOTXLENGTH(POSITIVEINTEGER value) {
        this.authinfotxlength = value;
    }

    /**
     * ??authenticationretries?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getAUTHENTICATIONRETRIES() {
        return authenticationretries;
    }

    /**
     * ??authenticationretries?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setAUTHENTICATIONRETRIES(POSITIVEINTEGER value) {
        this.authenticationretries = value;
    }

    /**
     * ??dataid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getDATAID() {
        return dataid;
    }

    /**
     * ??dataid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setDATAID(POSITIVEINTEGER value) {
        this.dataid = value;
    }

    /**
     * ??freshnesscountersyncattempts?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFRESHNESSCOUNTERSYNCATTEMPTS() {
        return freshnesscountersyncattempts;
    }

    /**
     * ??freshnesscountersyncattempts?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFRESHNESSCOUNTERSYNCATTEMPTS(POSITIVEINTEGER value) {
        this.freshnesscountersyncattempts = value;
    }

    /**
     * ??freshnesstimestamptimeperiodfactor?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFRESHNESSTIMESTAMPTIMEPERIODFACTOR() {
        return freshnesstimestamptimeperiodfactor;
    }

    /**
     * ??freshnesstimestamptimeperiodfactor?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFRESHNESSTIMESTAMPTIMEPERIODFACTOR(POSITIVEINTEGER value) {
        this.freshnesstimestamptimeperiodfactor = value;
    }

    /**
     * ??freshnessvalueid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFRESHNESSVALUEID() {
        return freshnessvalueid;
    }

    /**
     * ??freshnessvalueid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFRESHNESSVALUEID(POSITIVEINTEGER value) {
        this.freshnessvalueid = value;
    }

    /**
     * ??freshnessvaluelength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFRESHNESSVALUELENGTH() {
        return freshnessvaluelength;
    }

    /**
     * ??freshnessvaluelength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFRESHNESSVALUELENGTH(POSITIVEINTEGER value) {
        this.freshnessvaluelength = value;
    }

    /**
     * ??freshnessvaluetxlength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getFRESHNESSVALUETXLENGTH() {
        return freshnessvaluetxlength;
    }

    /**
     * ??freshnessvaluetxlength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setFRESHNESSVALUETXLENGTH(POSITIVEINTEGER value) {
        this.freshnessvaluetxlength = value;
    }

    /**
     * ??secondaryfreshnessvalueid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSECONDARYFRESHNESSVALUEID() {
        return secondaryfreshnessvalueid;
    }

    /**
     * ??secondaryfreshnessvalueid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSECONDARYFRESHNESSVALUEID(POSITIVEINTEGER value) {
        this.secondaryfreshnessvalueid = value;
    }

    /**
     * ??usefreshnesstimestamp?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getUSEFRESHNESSTIMESTAMP() {
        return usefreshnesstimestamp;
    }

    /**
     * ??usefreshnesstimestamp?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setUSEFRESHNESSTIMESTAMP(BOOLEAN value) {
        this.usefreshnesstimestamp = value;
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
