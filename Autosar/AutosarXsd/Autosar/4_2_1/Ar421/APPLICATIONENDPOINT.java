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
 * An application endpoint is the endpoint on an Ecu in terms of application addressing (e.g. socket). The application endpoint represents e.g. the listen socket in client-server-based communication.
 * 
 * <p>APPLICATION-ENDPOINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="APPLICATION-ENDPOINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}APPLICATION-ENDPOINT"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPLICATION-ENDPOINT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "consumedserviceinstances",
    "discoverytechnology",
    "networkendpointref",
    "priority",
    "providedserviceinstances",
    "remotingtechnology",
    "serializationtechnologyref",
    "tpconfiguration"
})
public class APPLICATIONENDPOINT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "LONG-NAME")
    protected MULTILANGUAGELONGNAME longname;
    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ANNOTATIONS")
    protected Ar421.LINKER.ANNOTATIONS annotations;
    @XmlElement(name = "CONSUMED-SERVICE-INSTANCES")
    protected APPLICATIONENDPOINT.CONSUMEDSERVICEINSTANCES consumedserviceinstances;
    @XmlElement(name = "DISCOVERY-TECHNOLOGY")
    protected DISCOVERYTECHNOLOGY discoverytechnology;
    @XmlElement(name = "NETWORK-ENDPOINT-REF")
    protected APPLICATIONENDPOINT.NETWORKENDPOINTREF networkendpointref;
    @XmlElement(name = "PRIORITY")
    protected POSITIVEINTEGER priority;
    @XmlElement(name = "PROVIDED-SERVICE-INSTANCES")
    protected APPLICATIONENDPOINT.PROVIDEDSERVICEINSTANCES providedserviceinstances;
    @XmlElement(name = "REMOTING-TECHNOLOGY")
    protected REMOTINGTECHNOLOGY remotingtechnology;
    @XmlElement(name = "SERIALIZATION-TECHNOLOGY-REF")
    protected APPLICATIONENDPOINT.SERIALIZATIONTECHNOLOGYREF serializationtechnologyref;
    @XmlElement(name = "TP-CONFIGURATION")
    protected APPLICATIONENDPOINT.TPCONFIGURATION tpconfiguration;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??longname?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public MULTILANGUAGELONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * ??longname?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGELONGNAME }
     *     
     */
    public void setLONGNAME(MULTILANGUAGELONGNAME value) {
        this.longname = value;
    }

    /**
     * ??desc?????
     * 
     * @return
     *     possible object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public MULTILANGUAGEOVERVIEWPARAGRAPH getDESC() {
        return desc;
    }

    /**
     * ??desc?????
     * 
     * @param value
     *     allowed object is
     *     {@link MULTILANGUAGEOVERVIEWPARAGRAPH }
     *     
     */
    public void setDESC(MULTILANGUAGEOVERVIEWPARAGRAPH value) {
        this.desc = value;
    }

    /**
     * ??category?????
     * 
     * @return
     *     possible object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public CATEGORYSTRING getCATEGORY() {
        return category;
    }

    /**
     * ??category?????
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORYSTRING }
     *     
     */
    public void setCATEGORY(CATEGORYSTRING value) {
        this.category = value;
    }

    /**
     * ??admindata?????
     * 
     * @return
     *     possible object is
     *     {@link ADMINDATA }
     *     
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * ??admindata?????
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINDATA }
     *     
     */
    public void setADMINDATA(ADMINDATA value) {
        this.admindata = value;
    }

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??annotations?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public Ar421.LINKER.ANNOTATIONS getANNOTATIONS() {
        return annotations;
    }

    /**
     * ??annotations?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINKER.ANNOTATIONS }
     *     
     */
    public void setANNOTATIONS(Ar421.LINKER.ANNOTATIONS value) {
        this.annotations = value;
    }

    /**
     * ??consumedserviceinstances?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONENDPOINT.CONSUMEDSERVICEINSTANCES }
     *     
     */
    public APPLICATIONENDPOINT.CONSUMEDSERVICEINSTANCES getCONSUMEDSERVICEINSTANCES() {
        return consumedserviceinstances;
    }

    /**
     * ??consumedserviceinstances?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONENDPOINT.CONSUMEDSERVICEINSTANCES }
     *     
     */
    public void setCONSUMEDSERVICEINSTANCES(APPLICATIONENDPOINT.CONSUMEDSERVICEINSTANCES value) {
        this.consumedserviceinstances = value;
    }

    /**
     * ??discoverytechnology?????
     * 
     * @return
     *     possible object is
     *     {@link DISCOVERYTECHNOLOGY }
     *     
     */
    public DISCOVERYTECHNOLOGY getDISCOVERYTECHNOLOGY() {
        return discoverytechnology;
    }

    /**
     * ??discoverytechnology?????
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOVERYTECHNOLOGY }
     *     
     */
    public void setDISCOVERYTECHNOLOGY(DISCOVERYTECHNOLOGY value) {
        this.discoverytechnology = value;
    }

    /**
     * ??networkendpointref?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONENDPOINT.NETWORKENDPOINTREF }
     *     
     */
    public APPLICATIONENDPOINT.NETWORKENDPOINTREF getNETWORKENDPOINTREF() {
        return networkendpointref;
    }

    /**
     * ??networkendpointref?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONENDPOINT.NETWORKENDPOINTREF }
     *     
     */
    public void setNETWORKENDPOINTREF(APPLICATIONENDPOINT.NETWORKENDPOINTREF value) {
        this.networkendpointref = value;
    }

    /**
     * ??priority?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPRIORITY() {
        return priority;
    }

    /**
     * ??priority?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPRIORITY(POSITIVEINTEGER value) {
        this.priority = value;
    }

    /**
     * ??providedserviceinstances?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONENDPOINT.PROVIDEDSERVICEINSTANCES }
     *     
     */
    public APPLICATIONENDPOINT.PROVIDEDSERVICEINSTANCES getPROVIDEDSERVICEINSTANCES() {
        return providedserviceinstances;
    }

    /**
     * ??providedserviceinstances?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONENDPOINT.PROVIDEDSERVICEINSTANCES }
     *     
     */
    public void setPROVIDEDSERVICEINSTANCES(APPLICATIONENDPOINT.PROVIDEDSERVICEINSTANCES value) {
        this.providedserviceinstances = value;
    }

    /**
     * ??remotingtechnology?????
     * 
     * @return
     *     possible object is
     *     {@link REMOTINGTECHNOLOGY }
     *     
     */
    public REMOTINGTECHNOLOGY getREMOTINGTECHNOLOGY() {
        return remotingtechnology;
    }

    /**
     * ??remotingtechnology?????
     * 
     * @param value
     *     allowed object is
     *     {@link REMOTINGTECHNOLOGY }
     *     
     */
    public void setREMOTINGTECHNOLOGY(REMOTINGTECHNOLOGY value) {
        this.remotingtechnology = value;
    }

    /**
     * ??serializationtechnologyref?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONENDPOINT.SERIALIZATIONTECHNOLOGYREF }
     *     
     */
    public APPLICATIONENDPOINT.SERIALIZATIONTECHNOLOGYREF getSERIALIZATIONTECHNOLOGYREF() {
        return serializationtechnologyref;
    }

    /**
     * ??serializationtechnologyref?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONENDPOINT.SERIALIZATIONTECHNOLOGYREF }
     *     
     */
    public void setSERIALIZATIONTECHNOLOGYREF(APPLICATIONENDPOINT.SERIALIZATIONTECHNOLOGYREF value) {
        this.serializationtechnologyref = value;
    }

    /**
     * ??tpconfiguration?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONENDPOINT.TPCONFIGURATION }
     *     
     */
    public APPLICATIONENDPOINT.TPCONFIGURATION getTPCONFIGURATION() {
        return tpconfiguration;
    }

    /**
     * ??tpconfiguration?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONENDPOINT.TPCONFIGURATION }
     *     
     */
    public void setTPCONFIGURATION(APPLICATIONENDPOINT.TPCONFIGURATION value) {
        this.tpconfiguration = value;
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
     * ??uuid?????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * ??uuid?????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
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
     *         &lt;element name="CONSUMED-SERVICE-INSTANCE" type="{http://autosar.org/schema/r4.0}CONSUMED-SERVICE-INSTANCE"/>
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
        "consumedserviceinstance"
    })
    public static class CONSUMEDSERVICEINSTANCES {

        @XmlElement(name = "CONSUMED-SERVICE-INSTANCE")
        protected List<CONSUMEDSERVICEINSTANCE> consumedserviceinstance;

        /**
         * Gets the value of the consumedserviceinstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the consumedserviceinstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSUMEDSERVICEINSTANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CONSUMEDSERVICEINSTANCE }
         * 
         * 
         */
        public List<CONSUMEDSERVICEINSTANCE> getCONSUMEDSERVICEINSTANCE() {
            if (consumedserviceinstance == null) {
                consumedserviceinstance = new ArrayList<CONSUMEDSERVICEINSTANCE>();
            }
            return this.consumedserviceinstance;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NETWORK-ENDPOINT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NETWORKENDPOINTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected NETWORKENDPOINTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link NETWORKENDPOINTSUBTYPESENUM }
         *     
         */
        public NETWORKENDPOINTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link NETWORKENDPOINTSUBTYPESENUM }
         *     
         */
        public void setDEST(NETWORKENDPOINTSUBTYPESENUM value) {
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
     *         &lt;element name="PROVIDED-SERVICE-INSTANCE" type="{http://autosar.org/schema/r4.0}PROVIDED-SERVICE-INSTANCE"/>
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
        "providedserviceinstance"
    })
    public static class PROVIDEDSERVICEINSTANCES {

        @XmlElement(name = "PROVIDED-SERVICE-INSTANCE")
        protected List<PROVIDEDSERVICEINSTANCE> providedserviceinstance;

        /**
         * Gets the value of the providedserviceinstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providedserviceinstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPROVIDEDSERVICEINSTANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PROVIDEDSERVICEINSTANCE }
         * 
         * 
         */
        public List<PROVIDEDSERVICEINSTANCE> getPROVIDEDSERVICEINSTANCE() {
            if (providedserviceinstance == null) {
                providedserviceinstance = new ArrayList<PROVIDEDSERVICEINSTANCE>();
            }
            return this.providedserviceinstance;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SERIALIZATION-TECHNOLOGY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SERIALIZATIONTECHNOLOGYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SERIALIZATIONTECHNOLOGYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SERIALIZATIONTECHNOLOGYSUBTYPESENUM }
         *     
         */
        public SERIALIZATIONTECHNOLOGYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SERIALIZATIONTECHNOLOGYSUBTYPESENUM }
         *     
         */
        public void setDEST(SERIALIZATIONTECHNOLOGYSUBTYPESENUM value) {
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
     *         &lt;element name="GENERIC-TP" type="{http://autosar.org/schema/r4.0}GENERIC-TP"/>
     *         &lt;element name="HTTP-TP" type="{http://autosar.org/schema/r4.0}HTTP-TP"/>
     *         &lt;element name="IEEE-1722-TP" type="{http://autosar.org/schema/r4.0}IEEE-1722-TP"/>
     *         &lt;element name="RTP-TP" type="{http://autosar.org/schema/r4.0}RTP-TP"/>
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
        "generictpOrHTTPTPOrIEEE1722TP"
    })
    public static class TPCONFIGURATION {

        @XmlElements({
            @XmlElement(name = "GENERIC-TP", type = GENERICTP.class),
            @XmlElement(name = "HTTP-TP", type = HTTPTP.class),
            @XmlElement(name = "IEEE-1722-TP", type = IEEE1722TP.class),
            @XmlElement(name = "RTP-TP", type = RTPTP.class),
            @XmlElement(name = "TCP-TP", type = TCPTP.class),
            @XmlElement(name = "UDP-TP", type = UDPTP.class)
        })
        protected Object generictpOrHTTPTPOrIEEE1722TP;

        /**
         * ??generictpOrHTTPTPOrIEEE1722TP?????
         * 
         * @return
         *     possible object is
         *     {@link GENERICTP }
         *     {@link HTTPTP }
         *     {@link IEEE1722TP }
         *     {@link RTPTP }
         *     {@link TCPTP }
         *     {@link UDPTP }
         *     
         */
        public Object getGENERICTPOrHTTPTPOrIEEE1722TP() {
            return generictpOrHTTPTPOrIEEE1722TP;
        }

        /**
         * ??generictpOrHTTPTPOrIEEE1722TP?????
         * 
         * @param value
         *     allowed object is
         *     {@link GENERICTP }
         *     {@link HTTPTP }
         *     {@link IEEE1722TP }
         *     {@link RTPTP }
         *     {@link TCPTP }
         *     {@link UDPTP }
         *     
         */
        public void setGENERICTPOrHTTPTPOrIEEE1722TP(Object value) {
            this.generictpOrHTTPTPOrIEEE1722TP = value;
        }

    }

}
