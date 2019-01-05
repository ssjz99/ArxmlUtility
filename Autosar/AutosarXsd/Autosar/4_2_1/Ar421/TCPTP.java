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
 * Content Model for TCP configuration.
 * 
 * <p>TCP-TP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TCP-TP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSPORT-PROTOCOL-CONFIGURATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TCP-UDP-CONFIG"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TCP-TP"/>
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
@XmlType(name = "TCP-TP", propOrder = {
    "keepaliveinterval",
    "keepaliveprobesmax",
    "keepalivetime",
    "keepalives",
    "naglesalgorithm",
    "tcptpport"
})
public class TCPTP {

    @XmlElement(name = "KEEP-ALIVE-INTERVAL")
    protected TIMEVALUE keepaliveinterval;
    @XmlElement(name = "KEEP-ALIVE-PROBES-MAX")
    protected POSITIVEINTEGER keepaliveprobesmax;
    @XmlElement(name = "KEEP-ALIVE-TIME")
    protected TIMEVALUE keepalivetime;
    @XmlElement(name = "KEEP-ALIVES")
    protected BOOLEAN keepalives;
    @XmlElement(name = "NAGLES-ALGORITHM")
    protected BOOLEAN naglesalgorithm;
    @XmlElement(name = "TCP-TP-PORT")
    protected TPPORT tcptpport;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??keepaliveinterval?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getKEEPALIVEINTERVAL() {
        return keepaliveinterval;
    }

    /**
     * ??keepaliveinterval?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setKEEPALIVEINTERVAL(TIMEVALUE value) {
        this.keepaliveinterval = value;
    }

    /**
     * ??keepaliveprobesmax?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getKEEPALIVEPROBESMAX() {
        return keepaliveprobesmax;
    }

    /**
     * ??keepaliveprobesmax?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setKEEPALIVEPROBESMAX(POSITIVEINTEGER value) {
        this.keepaliveprobesmax = value;
    }

    /**
     * ??keepalivetime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getKEEPALIVETIME() {
        return keepalivetime;
    }

    /**
     * ??keepalivetime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setKEEPALIVETIME(TIMEVALUE value) {
        this.keepalivetime = value;
    }

    /**
     * ??keepalives?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getKEEPALIVES() {
        return keepalives;
    }

    /**
     * ??keepalives?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setKEEPALIVES(BOOLEAN value) {
        this.keepalives = value;
    }

    /**
     * ??naglesalgorithm?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNAGLESALGORITHM() {
        return naglesalgorithm;
    }

    /**
     * ??naglesalgorithm?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNAGLESALGORITHM(BOOLEAN value) {
        this.naglesalgorithm = value;
    }

    /**
     * ??tcptpport?????
     * 
     * @return
     *     possible object is
     *     {@link TPPORT }
     *     
     */
    public TPPORT getTCPTPPORT() {
        return tcptpport;
    }

    /**
     * ??tcptpport?????
     * 
     * @param value
     *     allowed object is
     *     {@link TPPORT }
     *     
     */
    public void setTCPTPPORT(TPPORT value) {
        this.tcptpport = value;
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
