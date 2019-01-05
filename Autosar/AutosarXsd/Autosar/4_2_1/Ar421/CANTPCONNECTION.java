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
 * A connection identifies the sender and the receiver of this particular communication. The CanTp module routes a Pdu through this connection. 
 * 
 * atpVariation: Derived, because TpNode can vary.
 * 
 * <p>CAN-TP-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-TP-CONNECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TP-CONNECTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-TP-CONNECTION"/>
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
@XmlType(name = "CAN-TP-CONNECTION", propOrder = {
    "ident",
    "addressingformat",
    "cantpchannelref",
    "cancellation",
    "datapduref",
    "flowcontrolpduref",
    "maxblocksize",
    "multicastref",
    "paddingactivation",
    "receiverrefs",
    "tatype",
    "timeoutbr",
    "timeoutbs",
    "timeoutcr",
    "timeoutcs",
    "tpsduref",
    "transmitcancellation",
    "transmitterref",
    "variationpoint"
})
public class CANTPCONNECTION {

    @XmlElement(name = "IDENT")
    protected TPCONNECTIONIDENT ident;
    @XmlElement(name = "ADDRESSING-FORMAT")
    protected CANTPADDRESSINGFORMATTYPE addressingformat;
    @XmlElement(name = "CAN-TP-CHANNEL-REF")
    protected CANTPCONNECTION.CANTPCHANNELREF cantpchannelref;
    @XmlElement(name = "CANCELLATION")
    protected BOOLEAN cancellation;
    @XmlElement(name = "DATA-PDU-REF")
    protected CANTPCONNECTION.DATAPDUREF datapduref;
    @XmlElement(name = "FLOW-CONTROL-PDU-REF")
    protected CANTPCONNECTION.FLOWCONTROLPDUREF flowcontrolpduref;
    @XmlElement(name = "MAX-BLOCK-SIZE")
    protected INTEGER maxblocksize;
    @XmlElement(name = "MULTICAST-REF")
    protected CANTPCONNECTION.MULTICASTREF multicastref;
    @XmlElement(name = "PADDING-ACTIVATION")
    protected BOOLEAN paddingactivation;
    @XmlElement(name = "RECEIVER-REFS")
    protected CANTPCONNECTION.RECEIVERREFS receiverrefs;
    @XmlElement(name = "TA-TYPE")
    protected NETWORKTARGETADDRESSTYPE tatype;
    @XmlElement(name = "TIMEOUT-BR")
    protected TIMEVALUE timeoutbr;
    @XmlElement(name = "TIMEOUT-BS")
    protected TIMEVALUE timeoutbs;
    @XmlElement(name = "TIMEOUT-CR")
    protected TIMEVALUE timeoutcr;
    @XmlElement(name = "TIMEOUT-CS")
    protected TIMEVALUE timeoutcs;
    @XmlElement(name = "TP-SDU-REF")
    protected CANTPCONNECTION.TPSDUREF tpsduref;
    @XmlElement(name = "TRANSMIT-CANCELLATION")
    protected BOOLEAN transmitcancellation;
    @XmlElement(name = "TRANSMITTER-REF")
    protected CANTPCONNECTION.TRANSMITTERREF transmitterref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??addressingformat?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPADDRESSINGFORMATTYPE }
     *     
     */
    public CANTPADDRESSINGFORMATTYPE getADDRESSINGFORMAT() {
        return addressingformat;
    }

    /**
     * ??addressingformat?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPADDRESSINGFORMATTYPE }
     *     
     */
    public void setADDRESSINGFORMAT(CANTPADDRESSINGFORMATTYPE value) {
        this.addressingformat = value;
    }

    /**
     * ??cantpchannelref?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONNECTION.CANTPCHANNELREF }
     *     
     */
    public CANTPCONNECTION.CANTPCHANNELREF getCANTPCHANNELREF() {
        return cantpchannelref;
    }

    /**
     * ??cantpchannelref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONNECTION.CANTPCHANNELREF }
     *     
     */
    public void setCANTPCHANNELREF(CANTPCONNECTION.CANTPCHANNELREF value) {
        this.cantpchannelref = value;
    }

    /**
     * ??cancellation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getCANCELLATION() {
        return cancellation;
    }

    /**
     * ??cancellation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setCANCELLATION(BOOLEAN value) {
        this.cancellation = value;
    }

    /**
     * ??datapduref?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONNECTION.DATAPDUREF }
     *     
     */
    public CANTPCONNECTION.DATAPDUREF getDATAPDUREF() {
        return datapduref;
    }

    /**
     * ??datapduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONNECTION.DATAPDUREF }
     *     
     */
    public void setDATAPDUREF(CANTPCONNECTION.DATAPDUREF value) {
        this.datapduref = value;
    }

    /**
     * ??flowcontrolpduref?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONNECTION.FLOWCONTROLPDUREF }
     *     
     */
    public CANTPCONNECTION.FLOWCONTROLPDUREF getFLOWCONTROLPDUREF() {
        return flowcontrolpduref;
    }

    /**
     * ??flowcontrolpduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONNECTION.FLOWCONTROLPDUREF }
     *     
     */
    public void setFLOWCONTROLPDUREF(CANTPCONNECTION.FLOWCONTROLPDUREF value) {
        this.flowcontrolpduref = value;
    }

    /**
     * ??maxblocksize?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXBLOCKSIZE() {
        return maxblocksize;
    }

    /**
     * ??maxblocksize?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXBLOCKSIZE(INTEGER value) {
        this.maxblocksize = value;
    }

    /**
     * ??multicastref?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONNECTION.MULTICASTREF }
     *     
     */
    public CANTPCONNECTION.MULTICASTREF getMULTICASTREF() {
        return multicastref;
    }

    /**
     * ??multicastref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONNECTION.MULTICASTREF }
     *     
     */
    public void setMULTICASTREF(CANTPCONNECTION.MULTICASTREF value) {
        this.multicastref = value;
    }

    /**
     * ??paddingactivation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPADDINGACTIVATION() {
        return paddingactivation;
    }

    /**
     * ??paddingactivation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPADDINGACTIVATION(BOOLEAN value) {
        this.paddingactivation = value;
    }

    /**
     * ??receiverrefs?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONNECTION.RECEIVERREFS }
     *     
     */
    public CANTPCONNECTION.RECEIVERREFS getRECEIVERREFS() {
        return receiverrefs;
    }

    /**
     * ??receiverrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONNECTION.RECEIVERREFS }
     *     
     */
    public void setRECEIVERREFS(CANTPCONNECTION.RECEIVERREFS value) {
        this.receiverrefs = value;
    }

    /**
     * ??tatype?????
     * 
     * @return
     *     possible object is
     *     {@link NETWORKTARGETADDRESSTYPE }
     *     
     */
    public NETWORKTARGETADDRESSTYPE getTATYPE() {
        return tatype;
    }

    /**
     * ??tatype?????
     * 
     * @param value
     *     allowed object is
     *     {@link NETWORKTARGETADDRESSTYPE }
     *     
     */
    public void setTATYPE(NETWORKTARGETADDRESSTYPE value) {
        this.tatype = value;
    }

    /**
     * ??timeoutbr?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTBR() {
        return timeoutbr;
    }

    /**
     * ??timeoutbr?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTBR(TIMEVALUE value) {
        this.timeoutbr = value;
    }

    /**
     * ??timeoutbs?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTBS() {
        return timeoutbs;
    }

    /**
     * ??timeoutbs?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTBS(TIMEVALUE value) {
        this.timeoutbs = value;
    }

    /**
     * ??timeoutcr?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTCR() {
        return timeoutcr;
    }

    /**
     * ??timeoutcr?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTCR(TIMEVALUE value) {
        this.timeoutcr = value;
    }

    /**
     * ??timeoutcs?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTCS() {
        return timeoutcs;
    }

    /**
     * ??timeoutcs?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTCS(TIMEVALUE value) {
        this.timeoutcs = value;
    }

    /**
     * ??tpsduref?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONNECTION.TPSDUREF }
     *     
     */
    public CANTPCONNECTION.TPSDUREF getTPSDUREF() {
        return tpsduref;
    }

    /**
     * ??tpsduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONNECTION.TPSDUREF }
     *     
     */
    public void setTPSDUREF(CANTPCONNECTION.TPSDUREF value) {
        this.tpsduref = value;
    }

    /**
     * ??transmitcancellation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getTRANSMITCANCELLATION() {
        return transmitcancellation;
    }

    /**
     * ??transmitcancellation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setTRANSMITCANCELLATION(BOOLEAN value) {
        this.transmitcancellation = value;
    }

    /**
     * ??transmitterref?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONNECTION.TRANSMITTERREF }
     *     
     */
    public CANTPCONNECTION.TRANSMITTERREF getTRANSMITTERREF() {
        return transmitterref;
    }

    /**
     * ??transmitterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONNECTION.TRANSMITTERREF }
     *     
     */
    public void setTRANSMITTERREF(CANTPCONNECTION.TRANSMITTERREF value) {
        this.transmitterref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-TP-CHANNEL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CANTPCHANNELREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CANTPCHANNELSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CANTPCHANNELSUBTYPESENUM }
         *     
         */
        public CANTPCHANNELSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CANTPCHANNELSUBTYPESENUM }
         *     
         */
        public void setDEST(CANTPCHANNELSUBTYPESENUM value) {
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
    public static class DATAPDUREF
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
    public static class FLOWCONTROLPDUREF
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-TP-ADDRESS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MULTICASTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CANTPADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CANTPADDRESSSUBTYPESENUM }
         *     
         */
        public CANTPADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CANTPADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(CANTPADDRESSSUBTYPESENUM value) {
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
     *         &lt;element name="RECEIVER-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-TP-NODE--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "receiverref"
    })
    public static class RECEIVERREFS {

        @XmlElement(name = "RECEIVER-REF")
        protected List<CANTPCONNECTION.RECEIVERREFS.RECEIVERREF> receiverref;

        /**
         * Gets the value of the receiverref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the receiverref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECEIVERREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANTPCONNECTION.RECEIVERREFS.RECEIVERREF }
         * 
         * 
         */
        public List<CANTPCONNECTION.RECEIVERREFS.RECEIVERREF> getRECEIVERREF() {
            if (receiverref == null) {
                receiverref = new ArrayList<CANTPCONNECTION.RECEIVERREFS.RECEIVERREF>();
            }
            return this.receiverref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-TP-NODE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RECEIVERREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CANTPNODESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CANTPNODESUBTYPESENUM }
             *     
             */
            public CANTPNODESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CANTPNODESUBTYPESENUM }
             *     
             */
            public void setDEST(CANTPNODESUBTYPESENUM value) {
                this.dest = value;
            }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TPSDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IPDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IPDUSUBTYPESENUM }
         *     
         */
        public IPDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IPDUSUBTYPESENUM }
         *     
         */
        public void setDEST(IPDUSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CAN-TP-NODE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TRANSMITTERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CANTPNODESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CANTPNODESUBTYPESENUM }
         *     
         */
        public CANTPNODESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CANTPNODESUBTYPESENUM }
         *     
         */
        public void setDEST(CANTPNODESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
