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
 * A LinTP channel represents an internal path for the transmission or reception of a Pdu via LinTp and describes the the sender and the receiver of this particular communication. 
 * 
 * LinTp supports (per Lin Cluster) the configuration of one Rx Tp-SDU and one Tx Tp-SDU per NAD the LinMaster uses to address one or more of its Lin Slaves. To support this an arbitrary number of LinTpConnections shall be described.
 * 
 * <p>LIN-TP-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-TP-CONNECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TP-CONNECTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-TP-CONNECTION"/>
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
@XmlType(name = "LIN-TP-CONNECTION", propOrder = {
    "ident",
    "datapduref",
    "dropnotrequestednad",
    "flowcontrolref",
    "lintpnsduref",
    "multicastref",
    "receiverrefs",
    "timeoutas",
    "timeoutcr",
    "timeoutcs",
    "transmitterref",
    "variationpoint"
})
public class LINTPCONNECTION {

    @XmlElement(name = "IDENT")
    protected TPCONNECTIONIDENT ident;
    @XmlElement(name = "DATA-PDU-REF")
    protected LINTPCONNECTION.DATAPDUREF datapduref;
    @XmlElement(name = "DROP-NOT-REQUESTED-NAD")
    protected BOOLEAN dropnotrequestednad;
    @XmlElement(name = "FLOW-CONTROL-REF")
    protected LINTPCONNECTION.FLOWCONTROLREF flowcontrolref;
    @XmlElement(name = "LIN-TP-N-SDU-REF")
    protected LINTPCONNECTION.LINTPNSDUREF lintpnsduref;
    @XmlElement(name = "MULTICAST-REF")
    protected LINTPCONNECTION.MULTICASTREF multicastref;
    @XmlElement(name = "RECEIVER-REFS")
    protected LINTPCONNECTION.RECEIVERREFS receiverrefs;
    @XmlElement(name = "TIMEOUT-AS")
    protected TIMEVALUE timeoutas;
    @XmlElement(name = "TIMEOUT-CR")
    protected TIMEVALUE timeoutcr;
    @XmlElement(name = "TIMEOUT-CS")
    protected TIMEVALUE timeoutcs;
    @XmlElement(name = "TRANSMITTER-REF")
    protected LINTPCONNECTION.TRANSMITTERREF transmitterref;
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
     * ??datapduref?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONNECTION.DATAPDUREF }
     *     
     */
    public LINTPCONNECTION.DATAPDUREF getDATAPDUREF() {
        return datapduref;
    }

    /**
     * ??datapduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONNECTION.DATAPDUREF }
     *     
     */
    public void setDATAPDUREF(LINTPCONNECTION.DATAPDUREF value) {
        this.datapduref = value;
    }

    /**
     * ??dropnotrequestednad?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getDROPNOTREQUESTEDNAD() {
        return dropnotrequestednad;
    }

    /**
     * ??dropnotrequestednad?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setDROPNOTREQUESTEDNAD(BOOLEAN value) {
        this.dropnotrequestednad = value;
    }

    /**
     * ??flowcontrolref?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONNECTION.FLOWCONTROLREF }
     *     
     */
    public LINTPCONNECTION.FLOWCONTROLREF getFLOWCONTROLREF() {
        return flowcontrolref;
    }

    /**
     * ??flowcontrolref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONNECTION.FLOWCONTROLREF }
     *     
     */
    public void setFLOWCONTROLREF(LINTPCONNECTION.FLOWCONTROLREF value) {
        this.flowcontrolref = value;
    }

    /**
     * ??lintpnsduref?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONNECTION.LINTPNSDUREF }
     *     
     */
    public LINTPCONNECTION.LINTPNSDUREF getLINTPNSDUREF() {
        return lintpnsduref;
    }

    /**
     * ??lintpnsduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONNECTION.LINTPNSDUREF }
     *     
     */
    public void setLINTPNSDUREF(LINTPCONNECTION.LINTPNSDUREF value) {
        this.lintpnsduref = value;
    }

    /**
     * ??multicastref?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONNECTION.MULTICASTREF }
     *     
     */
    public LINTPCONNECTION.MULTICASTREF getMULTICASTREF() {
        return multicastref;
    }

    /**
     * ??multicastref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONNECTION.MULTICASTREF }
     *     
     */
    public void setMULTICASTREF(LINTPCONNECTION.MULTICASTREF value) {
        this.multicastref = value;
    }

    /**
     * ??receiverrefs?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONNECTION.RECEIVERREFS }
     *     
     */
    public LINTPCONNECTION.RECEIVERREFS getRECEIVERREFS() {
        return receiverrefs;
    }

    /**
     * ??receiverrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONNECTION.RECEIVERREFS }
     *     
     */
    public void setRECEIVERREFS(LINTPCONNECTION.RECEIVERREFS value) {
        this.receiverrefs = value;
    }

    /**
     * ??timeoutas?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTAS() {
        return timeoutas;
    }

    /**
     * ??timeoutas?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTAS(TIMEVALUE value) {
        this.timeoutas = value;
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
     * ??transmitterref?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONNECTION.TRANSMITTERREF }
     *     
     */
    public LINTPCONNECTION.TRANSMITTERREF getTRANSMITTERREF() {
        return transmitterref;
    }

    /**
     * ??transmitterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONNECTION.TRANSMITTERREF }
     *     
     */
    public void setTRANSMITTERREF(LINTPCONNECTION.TRANSMITTERREF value) {
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
    public static class FLOWCONTROLREF
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
    public static class LINTPNSDUREF
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
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-TP-NODE--SUBTYPES-ENUM" />
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
        protected List<LINTPCONNECTION.RECEIVERREFS.RECEIVERREF> receiverref;

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
         * {@link LINTPCONNECTION.RECEIVERREFS.RECEIVERREF }
         * 
         * 
         */
        public List<LINTPCONNECTION.RECEIVERREFS.RECEIVERREF> getRECEIVERREF() {
            if (receiverref == null) {
                receiverref = new ArrayList<LINTPCONNECTION.RECEIVERREFS.RECEIVERREF>();
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-TP-NODE--SUBTYPES-ENUM" />
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
            protected LINTPNODESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link LINTPNODESUBTYPESENUM }
             *     
             */
            public LINTPNODESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link LINTPNODESUBTYPESENUM }
             *     
             */
            public void setDEST(LINTPNODESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIN-TP-NODE--SUBTYPES-ENUM" />
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
        protected LINTPNODESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LINTPNODESUBTYPESENUM }
         *     
         */
        public LINTPNODESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LINTPNODESUBTYPESENUM }
         *     
         */
        public void setDEST(LINTPNODESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
