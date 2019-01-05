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
 * The SoAd serves as a (De)Multiplexer between different PDU sources and the TCP/IP stack.
 * 
 * <p>SOCKET-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SOCKET-CONNECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DESCRIBABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SOCKET-CONNECTION"/>
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
@XmlType(name = "SOCKET-CONNECTION", propOrder = {
    "desc",
    "category",
    "introduction",
    "admindata",
    "autosarconnector",
    "clientipaddrfromconnectionrequest",
    "clientportfromconnectionrequest",
    "clientportref",
    "doipsourceaddressref",
    "doiptargetaddressref",
    "ident",
    "localportref",
    "npduref",
    "pdus",
    "pducollectionmaxbuffersize",
    "pducollectiontimeout",
    "remoteportref",
    "runtimeipaddressconfiguration",
    "runtimeportconfiguration",
    "shortlabel",
    "socketprotocol",
    "variationpoint"
})
public class SOCKETCONNECTION {

    @XmlElement(name = "DESC")
    protected MULTILANGUAGEOVERVIEWPARAGRAPH desc;
    @XmlElement(name = "CATEGORY")
    protected CATEGORYSTRING category;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "AUTOSAR-CONNECTOR")
    protected SOADCONNECTORTYPE autosarconnector;
    @XmlElement(name = "CLIENT-IP-ADDR-FROM-CONNECTION-REQUEST")
    protected BOOLEAN clientipaddrfromconnectionrequest;
    @XmlElement(name = "CLIENT-PORT-FROM-CONNECTION-REQUEST")
    protected BOOLEAN clientportfromconnectionrequest;
    @XmlElement(name = "CLIENT-PORT-REF")
    protected SOCKETCONNECTION.CLIENTPORTREF clientportref;
    @XmlElement(name = "DO-IP-SOURCE-ADDRESS-REF")
    protected SOCKETCONNECTION.DOIPSOURCEADDRESSREF doipsourceaddressref;
    @XmlElement(name = "DO-IP-TARGET-ADDRESS-REF")
    protected SOCKETCONNECTION.DOIPTARGETADDRESSREF doiptargetaddressref;
    @XmlElement(name = "IDENT")
    protected TPCONNECTIONIDENT ident;
    @XmlElement(name = "LOCAL-PORT-REF")
    protected SOCKETCONNECTION.LOCALPORTREF localportref;
    @XmlElement(name = "N-PDU-REF")
    protected SOCKETCONNECTION.NPDUREF npduref;
    @XmlElement(name = "PDUS")
    protected SOCKETCONNECTION.PDUS pdus;
    @XmlElement(name = "PDU-COLLECTION-MAX-BUFFER-SIZE")
    protected POSITIVEINTEGER pducollectionmaxbuffersize;
    @XmlElement(name = "PDU-COLLECTION-TIMEOUT")
    protected TIMEVALUE pducollectiontimeout;
    @XmlElement(name = "REMOTE-PORT-REF")
    protected SOCKETCONNECTION.REMOTEPORTREF remoteportref;
    @XmlElement(name = "RUNTIME-IP-ADDRESS-CONFIGURATION")
    protected RUNTIMEADDRESSCONFIGURATIONENUM runtimeipaddressconfiguration;
    @XmlElement(name = "RUNTIME-PORT-CONFIGURATION")
    protected RUNTIMEADDRESSCONFIGURATIONENUM runtimeportconfiguration;
    @XmlElement(name = "SHORT-LABEL")
    protected IDENTIFIER shortlabel;
    @XmlElement(name = "SOCKET-PROTOCOL")
    protected SOADPROTOCOLTYPE socketprotocol;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??autosarconnector?????
     * 
     * @return
     *     possible object is
     *     {@link SOADCONNECTORTYPE }
     *     
     */
    public SOADCONNECTORTYPE getAUTOSARCONNECTOR() {
        return autosarconnector;
    }

    /**
     * ??autosarconnector?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOADCONNECTORTYPE }
     *     
     */
    public void setAUTOSARCONNECTOR(SOADCONNECTORTYPE value) {
        this.autosarconnector = value;
    }

    /**
     * ??clientipaddrfromconnectionrequest?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCLIENTIPADDRFROMCONNECTIONREQUEST() {
        return clientipaddrfromconnectionrequest;
    }

    /**
     * ??clientipaddrfromconnectionrequest?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCLIENTIPADDRFROMCONNECTIONREQUEST(BOOLEAN value) {
        this.clientipaddrfromconnectionrequest = value;
    }

    /**
     * ??clientportfromconnectionrequest?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCLIENTPORTFROMCONNECTIONREQUEST() {
        return clientportfromconnectionrequest;
    }

    /**
     * ??clientportfromconnectionrequest?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCLIENTPORTFROMCONNECTIONREQUEST(BOOLEAN value) {
        this.clientportfromconnectionrequest = value;
    }

    /**
     * ??clientportref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTION.CLIENTPORTREF }
     *     
     */
    public SOCKETCONNECTION.CLIENTPORTREF getCLIENTPORTREF() {
        return clientportref;
    }

    /**
     * ??clientportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTION.CLIENTPORTREF }
     *     
     */
    public void setCLIENTPORTREF(SOCKETCONNECTION.CLIENTPORTREF value) {
        this.clientportref = value;
    }

    /**
     * ??doipsourceaddressref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTION.DOIPSOURCEADDRESSREF }
     *     
     */
    public SOCKETCONNECTION.DOIPSOURCEADDRESSREF getDOIPSOURCEADDRESSREF() {
        return doipsourceaddressref;
    }

    /**
     * ??doipsourceaddressref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTION.DOIPSOURCEADDRESSREF }
     *     
     */
    public void setDOIPSOURCEADDRESSREF(SOCKETCONNECTION.DOIPSOURCEADDRESSREF value) {
        this.doipsourceaddressref = value;
    }

    /**
     * ??doiptargetaddressref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTION.DOIPTARGETADDRESSREF }
     *     
     */
    public SOCKETCONNECTION.DOIPTARGETADDRESSREF getDOIPTARGETADDRESSREF() {
        return doiptargetaddressref;
    }

    /**
     * ??doiptargetaddressref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTION.DOIPTARGETADDRESSREF }
     *     
     */
    public void setDOIPTARGETADDRESSREF(SOCKETCONNECTION.DOIPTARGETADDRESSREF value) {
        this.doiptargetaddressref = value;
    }

    /**
     * ??ident?????
     * 
     * @return
     *     possible object is
     *     {@link TPCONNECTIONIDENT }
     *     
     */
    public TPCONNECTIONIDENT getIDENT() {
        return ident;
    }

    /**
     * ??ident?????
     * 
     * @param value
     *     allowed object is
     *     {@link TPCONNECTIONIDENT }
     *     
     */
    public void setIDENT(TPCONNECTIONIDENT value) {
        this.ident = value;
    }

    /**
     * ??localportref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTION.LOCALPORTREF }
     *     
     */
    public SOCKETCONNECTION.LOCALPORTREF getLOCALPORTREF() {
        return localportref;
    }

    /**
     * ??localportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTION.LOCALPORTREF }
     *     
     */
    public void setLOCALPORTREF(SOCKETCONNECTION.LOCALPORTREF value) {
        this.localportref = value;
    }

    /**
     * ??npduref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTION.NPDUREF }
     *     
     */
    public SOCKETCONNECTION.NPDUREF getNPDUREF() {
        return npduref;
    }

    /**
     * ??npduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTION.NPDUREF }
     *     
     */
    public void setNPDUREF(SOCKETCONNECTION.NPDUREF value) {
        this.npduref = value;
    }

    /**
     * ??pdus?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTION.PDUS }
     *     
     */
    public SOCKETCONNECTION.PDUS getPDUS() {
        return pdus;
    }

    /**
     * ??pdus?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTION.PDUS }
     *     
     */
    public void setPDUS(SOCKETCONNECTION.PDUS value) {
        this.pdus = value;
    }

    /**
     * ??pducollectionmaxbuffersize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPDUCOLLECTIONMAXBUFFERSIZE() {
        return pducollectionmaxbuffersize;
    }

    /**
     * ??pducollectionmaxbuffersize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPDUCOLLECTIONMAXBUFFERSIZE(POSITIVEINTEGER value) {
        this.pducollectionmaxbuffersize = value;
    }

    /**
     * ??pducollectiontimeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getPDUCOLLECTIONTIMEOUT() {
        return pducollectiontimeout;
    }

    /**
     * ??pducollectiontimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setPDUCOLLECTIONTIMEOUT(TIMEVALUE value) {
        this.pducollectiontimeout = value;
    }

    /**
     * ??remoteportref?????
     * 
     * @return
     *     possible object is
     *     {@link SOCKETCONNECTION.REMOTEPORTREF }
     *     
     */
    public SOCKETCONNECTION.REMOTEPORTREF getREMOTEPORTREF() {
        return remoteportref;
    }

    /**
     * ??remoteportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOCKETCONNECTION.REMOTEPORTREF }
     *     
     */
    public void setREMOTEPORTREF(SOCKETCONNECTION.REMOTEPORTREF value) {
        this.remoteportref = value;
    }

    /**
     * ??runtimeipaddressconfiguration?????
     * 
     * @return
     *     possible object is
     *     {@link RUNTIMEADDRESSCONFIGURATIONENUM }
     *     
     */
    public RUNTIMEADDRESSCONFIGURATIONENUM getRUNTIMEIPADDRESSCONFIGURATION() {
        return runtimeipaddressconfiguration;
    }

    /**
     * ??runtimeipaddressconfiguration?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNTIMEADDRESSCONFIGURATIONENUM }
     *     
     */
    public void setRUNTIMEIPADDRESSCONFIGURATION(RUNTIMEADDRESSCONFIGURATIONENUM value) {
        this.runtimeipaddressconfiguration = value;
    }

    /**
     * ??runtimeportconfiguration?????
     * 
     * @return
     *     possible object is
     *     {@link RUNTIMEADDRESSCONFIGURATIONENUM }
     *     
     */
    public RUNTIMEADDRESSCONFIGURATIONENUM getRUNTIMEPORTCONFIGURATION() {
        return runtimeportconfiguration;
    }

    /**
     * ??runtimeportconfiguration?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNTIMEADDRESSCONFIGURATIONENUM }
     *     
     */
    public void setRUNTIMEPORTCONFIGURATION(RUNTIMEADDRESSCONFIGURATIONENUM value) {
        this.runtimeportconfiguration = value;
    }

    /**
     * ??shortlabel?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * ??shortlabel?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTLABEL(IDENTIFIER value) {
        this.shortlabel = value;
    }

    /**
     * ??socketprotocol?????
     * 
     * @return
     *     possible object is
     *     {@link SOADPROTOCOLTYPE }
     *     
     */
    public SOADPROTOCOLTYPE getSOCKETPROTOCOL() {
        return socketprotocol;
    }

    /**
     * ??socketprotocol?????
     * 
     * @param value
     *     allowed object is
     *     {@link SOADPROTOCOLTYPE }
     *     
     */
    public void setSOCKETPROTOCOL(SOADPROTOCOLTYPE value) {
        this.socketprotocol = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SOCKET-ADDRESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CLIENTPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SOCKETADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public SOCKETADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(SOCKETADDRESSSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LOGIC-ADDRESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DOIPSOURCEADDRESSREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LOGICADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LOGICADDRESSSUBTYPESENUM }
         *     
         */
        public LOGICADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LOGICADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(LOGICADDRESSSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LOGIC-ADDRESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DOIPTARGETADDRESSREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LOGICADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LOGICADDRESSSUBTYPESENUM }
         *     
         */
        public LOGICADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LOGICADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(LOGICADDRESSSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SOCKET-ADDRESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LOCALPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SOCKETADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public SOCKETADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(SOCKETADDRESSSUBTYPESENUM value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}N-PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected NPDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link NPDUSUBTYPESENUM }
         *     
         */
        public NPDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link NPDUSUBTYPESENUM }
         *     
         */
        public void setDEST(NPDUSUBTYPESENUM value) {
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
     *         &lt;element name="SOCKET-CONNECTION-IPDU-IDENTIFIER" type="{http://autosar.org/schema/r4.0}SOCKET-CONNECTION-IPDU-IDENTIFIER"/>
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
        "socketconnectionipduidentifier"
    })
    public static class PDUS {

        @XmlElement(name = "SOCKET-CONNECTION-IPDU-IDENTIFIER")
        protected List<SOCKETCONNECTIONIPDUIDENTIFIER> socketconnectionipduidentifier;

        /**
         * Gets the value of the socketconnectionipduidentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socketconnectionipduidentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOCKETCONNECTIONIPDUIDENTIFIER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOCKETCONNECTIONIPDUIDENTIFIER }
         * 
         * 
         */
        public List<SOCKETCONNECTIONIPDUIDENTIFIER> getSOCKETCONNECTIONIPDUIDENTIFIER() {
            if (socketconnectionipduidentifier == null) {
                socketconnectionipduidentifier = new ArrayList<SOCKETCONNECTIONIPDUIDENTIFIER>();
            }
            return this.socketconnectionipduidentifier;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SOCKET-ADDRESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class REMOTEPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SOCKETADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public SOCKETADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SOCKETADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(SOCKETADDRESSSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
