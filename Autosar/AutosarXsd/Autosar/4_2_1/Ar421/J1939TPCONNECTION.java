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
 * A J1939TpConnection represents an internal path for the transmission or reception of a Pdu via J1939Tp and describes the the sender and the receiver of this particular communication. The J1939Tp module routes a Pdu (J1939 PGN) through the connection.
 * 
 * <p>J-1939-TP-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="J-1939-TP-CONNECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TP-CONNECTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}J-1939-TP-CONNECTION"/>
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
@XmlType(name = "J-1939-TP-CONNECTION", propOrder = {
    "ident",
    "broadcast",
    "bufferratio",
    "cancellation",
    "datapduref",
    "directpduref",
    "dynamicbs",
    "flowcontrolpdurefs",
    "maxbs",
    "maxexpbs",
    "receiverrefs",
    "retry",
    "tppgs",
    "tpsdurefs",
    "transmitterref",
    "variationpoint"
})
public class J1939TPCONNECTION {

    @XmlElement(name = "IDENT")
    protected TPCONNECTIONIDENT ident;
    @XmlElement(name = "BROADCAST")
    protected BOOLEAN broadcast;
    @XmlElement(name = "BUFFER-RATIO")
    protected POSITIVEINTEGER bufferratio;
    @XmlElement(name = "CANCELLATION")
    protected BOOLEAN cancellation;
    @XmlElement(name = "DATA-PDU-REF")
    protected J1939TPCONNECTION.DATAPDUREF datapduref;
    @XmlElement(name = "DIRECT-PDU-REF")
    protected J1939TPCONNECTION.DIRECTPDUREF directpduref;
    @XmlElement(name = "DYNAMIC-BS")
    protected BOOLEAN dynamicbs;
    @XmlElement(name = "FLOW-CONTROL-PDU-REFS")
    protected J1939TPCONNECTION.FLOWCONTROLPDUREFS flowcontrolpdurefs;
    @XmlElement(name = "MAX-BS")
    protected POSITIVEINTEGER maxbs;
    @XmlElement(name = "MAX-EXP-BS")
    protected POSITIVEINTEGER maxexpbs;
    @XmlElement(name = "RECEIVER-REFS")
    protected J1939TPCONNECTION.RECEIVERREFS receiverrefs;
    @XmlElement(name = "RETRY")
    protected BOOLEAN retry;
    @XmlElement(name = "TP-PGS")
    protected J1939TPCONNECTION.TPPGS tppgs;
    @XmlElement(name = "TP-SDU-REFS")
    protected J1939TPCONNECTION.TPSDUREFS tpsdurefs;
    @XmlElement(name = "TRANSMITTER-REF")
    protected J1939TPCONNECTION.TRANSMITTERREF transmitterref;
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
     * ??broadcast?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getBROADCAST() {
        return broadcast;
    }

    /**
     * ??broadcast?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setBROADCAST(BOOLEAN value) {
        this.broadcast = value;
    }

    /**
     * ??bufferratio?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getBUFFERRATIO() {
        return bufferratio;
    }

    /**
     * ??bufferratio?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setBUFFERRATIO(POSITIVEINTEGER value) {
        this.bufferratio = value;
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
     *     {@link J1939TPCONNECTION.DATAPDUREF }
     *     
     */
    public J1939TPCONNECTION.DATAPDUREF getDATAPDUREF() {
        return datapduref;
    }

    /**
     * ??datapduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPCONNECTION.DATAPDUREF }
     *     
     */
    public void setDATAPDUREF(J1939TPCONNECTION.DATAPDUREF value) {
        this.datapduref = value;
    }

    /**
     * ??directpduref?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPCONNECTION.DIRECTPDUREF }
     *     
     */
    public J1939TPCONNECTION.DIRECTPDUREF getDIRECTPDUREF() {
        return directpduref;
    }

    /**
     * ??directpduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPCONNECTION.DIRECTPDUREF }
     *     
     */
    public void setDIRECTPDUREF(J1939TPCONNECTION.DIRECTPDUREF value) {
        this.directpduref = value;
    }

    /**
     * ??dynamicbs?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getDYNAMICBS() {
        return dynamicbs;
    }

    /**
     * ??dynamicbs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setDYNAMICBS(BOOLEAN value) {
        this.dynamicbs = value;
    }

    /**
     * ??flowcontrolpdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPCONNECTION.FLOWCONTROLPDUREFS }
     *     
     */
    public J1939TPCONNECTION.FLOWCONTROLPDUREFS getFLOWCONTROLPDUREFS() {
        return flowcontrolpdurefs;
    }

    /**
     * ??flowcontrolpdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPCONNECTION.FLOWCONTROLPDUREFS }
     *     
     */
    public void setFLOWCONTROLPDUREFS(J1939TPCONNECTION.FLOWCONTROLPDUREFS value) {
        this.flowcontrolpdurefs = value;
    }

    /**
     * ??maxbs?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXBS() {
        return maxbs;
    }

    /**
     * ??maxbs?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXBS(POSITIVEINTEGER value) {
        this.maxbs = value;
    }

    /**
     * ??maxexpbs?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXEXPBS() {
        return maxexpbs;
    }

    /**
     * ??maxexpbs?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXEXPBS(POSITIVEINTEGER value) {
        this.maxexpbs = value;
    }

    /**
     * ??receiverrefs?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPCONNECTION.RECEIVERREFS }
     *     
     */
    public J1939TPCONNECTION.RECEIVERREFS getRECEIVERREFS() {
        return receiverrefs;
    }

    /**
     * ??receiverrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPCONNECTION.RECEIVERREFS }
     *     
     */
    public void setRECEIVERREFS(J1939TPCONNECTION.RECEIVERREFS value) {
        this.receiverrefs = value;
    }

    /**
     * ??retry?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getRETRY() {
        return retry;
    }

    /**
     * ??retry?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setRETRY(BOOLEAN value) {
        this.retry = value;
    }

    /**
     * ??tppgs?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPCONNECTION.TPPGS }
     *     
     */
    public J1939TPCONNECTION.TPPGS getTPPGS() {
        return tppgs;
    }

    /**
     * ??tppgs?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPCONNECTION.TPPGS }
     *     
     */
    public void setTPPGS(J1939TPCONNECTION.TPPGS value) {
        this.tppgs = value;
    }

    /**
     * ??tpsdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPCONNECTION.TPSDUREFS }
     *     
     */
    public J1939TPCONNECTION.TPSDUREFS getTPSDUREFS() {
        return tpsdurefs;
    }

    /**
     * ??tpsdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPCONNECTION.TPSDUREFS }
     *     
     */
    public void setTPSDUREFS(J1939TPCONNECTION.TPSDUREFS value) {
        this.tpsdurefs = value;
    }

    /**
     * ??transmitterref?????
     * 
     * @return
     *     possible object is
     *     {@link J1939TPCONNECTION.TRANSMITTERREF }
     *     
     */
    public J1939TPCONNECTION.TRANSMITTERREF getTRANSMITTERREF() {
        return transmitterref;
    }

    /**
     * ??transmitterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TPCONNECTION.TRANSMITTERREF }
     *     
     */
    public void setTRANSMITTERREF(J1939TPCONNECTION.TRANSMITTERREF value) {
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
    public static class DIRECTPDUREF
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
     *       &lt;choice maxOccurs="2" minOccurs="0">
     *         &lt;element name="FLOW-CONTROL-PDU-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}N-PDU--SUBTYPES-ENUM" />
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
        "flowcontrolpduref"
    })
    public static class FLOWCONTROLPDUREFS {

        @XmlElement(name = "FLOW-CONTROL-PDU-REF")
        protected List<J1939TPCONNECTION.FLOWCONTROLPDUREFS.FLOWCONTROLPDUREF> flowcontrolpduref;

        /**
         * Gets the value of the flowcontrolpduref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flowcontrolpduref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLOWCONTROLPDUREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link J1939TPCONNECTION.FLOWCONTROLPDUREFS.FLOWCONTROLPDUREF }
         * 
         * 
         */
        public List<J1939TPCONNECTION.FLOWCONTROLPDUREFS.FLOWCONTROLPDUREF> getFLOWCONTROLPDUREF() {
            if (flowcontrolpduref == null) {
                flowcontrolpduref = new ArrayList<J1939TPCONNECTION.FLOWCONTROLPDUREFS.FLOWCONTROLPDUREF>();
            }
            return this.flowcontrolpduref;
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
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}J-1939-TP-NODE--SUBTYPES-ENUM" />
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
        protected List<J1939TPCONNECTION.RECEIVERREFS.RECEIVERREF> receiverref;

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
         * {@link J1939TPCONNECTION.RECEIVERREFS.RECEIVERREF }
         * 
         * 
         */
        public List<J1939TPCONNECTION.RECEIVERREFS.RECEIVERREF> getRECEIVERREF() {
            if (receiverref == null) {
                receiverref = new ArrayList<J1939TPCONNECTION.RECEIVERREFS.RECEIVERREF>();
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}J-1939-TP-NODE--SUBTYPES-ENUM" />
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
            protected J1939TPNODESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link J1939TPNODESUBTYPESENUM }
             *     
             */
            public J1939TPNODESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link J1939TPNODESUBTYPESENUM }
             *     
             */
            public void setDEST(J1939TPNODESUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="J-1939-TP-PG" type="{http://autosar.org/schema/r4.0}J-1939-TP-PG"/>
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
        "j1939TPPG"
    })
    public static class TPPGS {

        @XmlElement(name = "J-1939-TP-PG")
        protected List<J1939TPPG> j1939TPPG;

        /**
         * Gets the value of the j1939TPPG property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the j1939TPPG property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJ1939TPPG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link J1939TPPG }
         * 
         * 
         */
        public List<J1939TPPG> getJ1939TPPG() {
            if (j1939TPPG == null) {
                j1939TPPG = new ArrayList<J1939TPPG>();
            }
            return this.j1939TPPG;
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
     *         &lt;element name="TP-SDU-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-PDU--SUBTYPES-ENUM" />
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
        "tpsduref"
    })
    public static class TPSDUREFS {

        @XmlElement(name = "TP-SDU-REF")
        protected List<J1939TPCONNECTION.TPSDUREFS.TPSDUREF> tpsduref;

        /**
         * Gets the value of the tpsduref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tpsduref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTPSDUREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link J1939TPCONNECTION.TPSDUREFS.TPSDUREF }
         * 
         * 
         */
        public List<J1939TPCONNECTION.TPSDUREFS.TPSDUREF> getTPSDUREF() {
            if (tpsduref == null) {
                tpsduref = new ArrayList<J1939TPCONNECTION.TPSDUREFS.TPSDUREF>();
            }
            return this.tpsduref;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}J-1939-TP-NODE--SUBTYPES-ENUM" />
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
        protected J1939TPNODESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link J1939TPNODESUBTYPESENUM }
         *     
         */
        public J1939TPNODESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link J1939TPNODESUBTYPESENUM }
         *     
         */
        public void setDEST(J1939TPNODESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
