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
 * Http over TCP as transport protocol.
 * 
 * <p>HTTP-TP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="HTTP-TP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSPORT-PROTOCOL-CONFIGURATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}HTTP-TP"/>
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
@XmlType(name = "HTTP-TP", propOrder = {
    "contenttype",
    "protocolversion",
    "requestmethod",
    "tcptpconfig",
    "uri"
})
public class HTTPTP {

    @XmlElement(name = "CONTENT-TYPE")
    protected STRING contenttype;
    @XmlElement(name = "PROTOCOL-VERSION")
    protected STRING protocolversion;
    @XmlElement(name = "REQUEST-METHOD")
    protected REQUESTMETHODENUM requestmethod;
    @XmlElement(name = "TCP-TP-CONFIG")
    protected TCPTP tcptpconfig;
    @XmlElement(name = "URI")
    protected URISTRING uri;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contenttype?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getCONTENTTYPE() {
        return contenttype;
    }

    /**
     * ??contenttype?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setCONTENTTYPE(STRING value) {
        this.contenttype = value;
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
     * ??requestmethod?????
     * 
     * @return
     *     possible object is
     *     {@link REQUESTMETHODENUM }
     *     
     */
    public REQUESTMETHODENUM getREQUESTMETHOD() {
        return requestmethod;
    }

    /**
     * ??requestmethod?????
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTMETHODENUM }
     *     
     */
    public void setREQUESTMETHOD(REQUESTMETHODENUM value) {
        this.requestmethod = value;
    }

    /**
     * ??tcptpconfig?????
     * 
     * @return
     *     possible object is
     *     {@link TCPTP }
     *     
     */
    public TCPTP getTCPTPCONFIG() {
        return tcptpconfig;
    }

    /**
     * ??tcptpconfig?????
     * 
     * @param value
     *     allowed object is
     *     {@link TCPTP }
     *     
     */
    public void setTCPTPCONFIG(TCPTP value) {
        this.tcptpconfig = value;
    }

    /**
     * ??uri?????
     * 
     * @return
     *     possible object is
     *     {@link URISTRING }
     *     
     */
    public URISTRING getURI() {
        return uri;
    }

    /**
     * ??uri?????
     * 
     * @param value
     *     allowed object is
     *     {@link URISTRING }
     *     
     */
    public void setURI(URISTRING value) {
        this.uri = value;
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
