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
 * RTP over UDP or over TCP as transport protocol.
 * 
 * <p>RTP-TP complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="RTP-TP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TRANSPORT-PROTOCOL-CONFIGURATION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}RTP-TP"/>
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
@XmlType(name = "RTP-TP", propOrder = {
    "ssrc",
    "tcpudpconfig"
})
public class RTPTP {

    @XmlElement(name = "SSRC")
    protected POSITIVEINTEGER ssrc;
    @XmlElement(name = "TCP-UDP-CONFIG")
    protected RTPTP.TCPUDPCONFIG tcpudpconfig;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??ssrc?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSSRC() {
        return ssrc;
    }

    /**
     * ??ssrc?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSSRC(POSITIVEINTEGER value) {
        this.ssrc = value;
    }

    /**
     * ??tcpudpconfig?????
     * 
     * @return
     *     possible object is
     *     {@link RTPTP.TCPUDPCONFIG }
     *     
     */
    public RTPTP.TCPUDPCONFIG getTCPUDPCONFIG() {
        return tcpudpconfig;
    }

    /**
     * ??tcpudpconfig?????
     * 
     * @param value
     *     allowed object is
     *     {@link RTPTP.TCPUDPCONFIG }
     *     
     */
    public void setTCPUDPCONFIG(RTPTP.TCPUDPCONFIG value) {
        this.tcpudpconfig = value;
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
     *         &lt;element name="TCP-TP" type="{http://autosar.org/schema/r4.0}TCP-TP"/>
     *         &lt;element name="UDP-TP" type="{http://autosar.org/schema/r4.0}UDP-TP"/>
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
        "tcptpOrUDPTP"
    })
    public static class TCPUDPCONFIG {

        @XmlElements({
            @XmlElement(name = "TCP-TP", type = TCPTP.class),
            @XmlElement(name = "UDP-TP", type = UDPTP.class)
        })
        protected Object tcptpOrUDPTP;

        /**
         * ??tcptpOrUDPTP?????
         * 
         * @return
         *     possible object is
         *     {@link TCPTP }
         *     {@link UDPTP }
         *     
         */
        public Object getTCPTPOrUDPTP() {
            return tcptpOrUDPTP;
        }

        /**
         * ??tcptpOrUDPTP?????
         * 
         * @param value
         *     allowed object is
         *     {@link TCPTP }
         *     {@link UDPTP }
         *     
         */
        public void setTCPTPOrUDPTP(Object value) {
            this.tcptpOrUDPTP = value;
        }

    }

}
