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
 * A connection identifies the sender and the receiver of this particular communication. The FlexRayTp module routes a Pdu through this connection. 
 * 
 * In a System Description the references to the PduPools are mandatory. In an ECU Extract these references can be optional:
 * On unicast connections these references are always mandatory.
 * On multicast the txPduPool is mandatory on the sender side. The rxPduPool is mandatory on the receiver side. On Gateway ECUs both references are mandatory.
 * 
 * <p>FLEXRAY-TP-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-TP-CONNECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TP-CONNECTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-TP-CONNECTION"/>
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
@XmlType(name = "FLEXRAY-TP-CONNECTION", propOrder = {
    "ident",
    "bandwidthlimitation",
    "directtpsduref",
    "multicastref",
    "receiverrefs",
    "reversedtpsduref",
    "rxpdupoolref",
    "tpconnectioncontrolref",
    "transmitterref",
    "txpdupoolref",
    "variationpoint"
})
public class FLEXRAYTPCONNECTION {

    @XmlElement(name = "IDENT")
    protected TPCONNECTIONIDENT ident;
    @XmlElement(name = "BANDWIDTH-LIMITATION")
    protected BOOLEAN bandwidthlimitation;
    @XmlElement(name = "DIRECT-TP-SDU-REF")
    protected FLEXRAYTPCONNECTION.DIRECTTPSDUREF directtpsduref;
    @XmlElement(name = "MULTICAST-REF")
    protected FLEXRAYTPCONNECTION.MULTICASTREF multicastref;
    @XmlElement(name = "RECEIVER-REFS")
    protected FLEXRAYTPCONNECTION.RECEIVERREFS receiverrefs;
    @XmlElement(name = "REVERSED-TP-SDU-REF")
    protected FLEXRAYTPCONNECTION.REVERSEDTPSDUREF reversedtpsduref;
    @XmlElement(name = "RX-PDU-POOL-REF")
    protected FLEXRAYTPCONNECTION.RXPDUPOOLREF rxpdupoolref;
    @XmlElement(name = "TP-CONNECTION-CONTROL-REF")
    protected FLEXRAYTPCONNECTION.TPCONNECTIONCONTROLREF tpconnectioncontrolref;
    @XmlElement(name = "TRANSMITTER-REF")
    protected FLEXRAYTPCONNECTION.TRANSMITTERREF transmitterref;
    @XmlElement(name = "TX-PDU-POOL-REF")
    protected FLEXRAYTPCONNECTION.TXPDUPOOLREF txpdupoolref;
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
     * ??bandwidthlimitation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getBANDWIDTHLIMITATION() {
        return bandwidthlimitation;
    }

    /**
     * ??bandwidthlimitation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setBANDWIDTHLIMITATION(BOOLEAN value) {
        this.bandwidthlimitation = value;
    }

    /**
     * ??directtpsduref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.DIRECTTPSDUREF }
     *     
     */
    public FLEXRAYTPCONNECTION.DIRECTTPSDUREF getDIRECTTPSDUREF() {
        return directtpsduref;
    }

    /**
     * ??directtpsduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.DIRECTTPSDUREF }
     *     
     */
    public void setDIRECTTPSDUREF(FLEXRAYTPCONNECTION.DIRECTTPSDUREF value) {
        this.directtpsduref = value;
    }

    /**
     * ??multicastref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.MULTICASTREF }
     *     
     */
    public FLEXRAYTPCONNECTION.MULTICASTREF getMULTICASTREF() {
        return multicastref;
    }

    /**
     * ??multicastref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.MULTICASTREF }
     *     
     */
    public void setMULTICASTREF(FLEXRAYTPCONNECTION.MULTICASTREF value) {
        this.multicastref = value;
    }

    /**
     * ??receiverrefs?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.RECEIVERREFS }
     *     
     */
    public FLEXRAYTPCONNECTION.RECEIVERREFS getRECEIVERREFS() {
        return receiverrefs;
    }

    /**
     * ??receiverrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.RECEIVERREFS }
     *     
     */
    public void setRECEIVERREFS(FLEXRAYTPCONNECTION.RECEIVERREFS value) {
        this.receiverrefs = value;
    }

    /**
     * ??reversedtpsduref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.REVERSEDTPSDUREF }
     *     
     */
    public FLEXRAYTPCONNECTION.REVERSEDTPSDUREF getREVERSEDTPSDUREF() {
        return reversedtpsduref;
    }

    /**
     * ??reversedtpsduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.REVERSEDTPSDUREF }
     *     
     */
    public void setREVERSEDTPSDUREF(FLEXRAYTPCONNECTION.REVERSEDTPSDUREF value) {
        this.reversedtpsduref = value;
    }

    /**
     * ??rxpdupoolref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.RXPDUPOOLREF }
     *     
     */
    public FLEXRAYTPCONNECTION.RXPDUPOOLREF getRXPDUPOOLREF() {
        return rxpdupoolref;
    }

    /**
     * ??rxpdupoolref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.RXPDUPOOLREF }
     *     
     */
    public void setRXPDUPOOLREF(FLEXRAYTPCONNECTION.RXPDUPOOLREF value) {
        this.rxpdupoolref = value;
    }

    /**
     * ??tpconnectioncontrolref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.TPCONNECTIONCONTROLREF }
     *     
     */
    public FLEXRAYTPCONNECTION.TPCONNECTIONCONTROLREF getTPCONNECTIONCONTROLREF() {
        return tpconnectioncontrolref;
    }

    /**
     * ??tpconnectioncontrolref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.TPCONNECTIONCONTROLREF }
     *     
     */
    public void setTPCONNECTIONCONTROLREF(FLEXRAYTPCONNECTION.TPCONNECTIONCONTROLREF value) {
        this.tpconnectioncontrolref = value;
    }

    /**
     * ??transmitterref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.TRANSMITTERREF }
     *     
     */
    public FLEXRAYTPCONNECTION.TRANSMITTERREF getTRANSMITTERREF() {
        return transmitterref;
    }

    /**
     * ??transmitterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.TRANSMITTERREF }
     *     
     */
    public void setTRANSMITTERREF(FLEXRAYTPCONNECTION.TRANSMITTERREF value) {
        this.transmitterref = value;
    }

    /**
     * ??txpdupoolref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONNECTION.TXPDUPOOLREF }
     *     
     */
    public FLEXRAYTPCONNECTION.TXPDUPOOLREF getTXPDUPOOLREF() {
        return txpdupoolref;
    }

    /**
     * ??txpdupoolref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONNECTION.TXPDUPOOLREF }
     *     
     */
    public void setTXPDUPOOLREF(FLEXRAYTPCONNECTION.TXPDUPOOLREF value) {
        this.txpdupoolref = value;
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
    public static class DIRECTTPSDUREF
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TP-ADDRESS--SUBTYPES-ENUM" />
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
        protected TPADDRESSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TPADDRESSSUBTYPESENUM }
         *     
         */
        public TPADDRESSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TPADDRESSSUBTYPESENUM }
         *     
         */
        public void setDEST(TPADDRESSSUBTYPESENUM value) {
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
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-NODE--SUBTYPES-ENUM" />
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
        protected List<FLEXRAYTPCONNECTION.RECEIVERREFS.RECEIVERREF> receiverref;

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
         * {@link FLEXRAYTPCONNECTION.RECEIVERREFS.RECEIVERREF }
         * 
         * 
         */
        public List<FLEXRAYTPCONNECTION.RECEIVERREFS.RECEIVERREF> getRECEIVERREF() {
            if (receiverref == null) {
                receiverref = new ArrayList<FLEXRAYTPCONNECTION.RECEIVERREFS.RECEIVERREF>();
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-NODE--SUBTYPES-ENUM" />
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
            protected FLEXRAYTPNODESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link FLEXRAYTPNODESUBTYPESENUM }
             *     
             */
            public FLEXRAYTPNODESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXRAYTPNODESUBTYPESENUM }
             *     
             */
            public void setDEST(FLEXRAYTPNODESUBTYPESENUM value) {
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
    public static class REVERSEDTPSDUREF
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-PDU-POOL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RXPDUPOOLREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLEXRAYTPPDUPOOLSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLEXRAYTPPDUPOOLSUBTYPESENUM }
         *     
         */
        public FLEXRAYTPPDUPOOLSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXRAYTPPDUPOOLSUBTYPESENUM }
         *     
         */
        public void setDEST(FLEXRAYTPPDUPOOLSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-CONNECTION-CONTROL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TPCONNECTIONCONTROLREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM }
         *     
         */
        public FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM }
         *     
         */
        public void setDEST(FLEXRAYTPCONNECTIONCONTROLSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-NODE--SUBTYPES-ENUM" />
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
        protected FLEXRAYTPNODESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLEXRAYTPNODESUBTYPESENUM }
         *     
         */
        public FLEXRAYTPNODESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXRAYTPNODESUBTYPESENUM }
         *     
         */
        public void setDEST(FLEXRAYTPNODESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-PDU-POOL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TXPDUPOOLREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLEXRAYTPPDUPOOLSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLEXRAYTPPDUPOOLSUBTYPESENUM }
         *     
         */
        public FLEXRAYTPPDUPOOLSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXRAYTPPDUPOOLSUBTYPESENUM }
         *     
         */
        public void setDEST(FLEXRAYTPPDUPOOLSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
