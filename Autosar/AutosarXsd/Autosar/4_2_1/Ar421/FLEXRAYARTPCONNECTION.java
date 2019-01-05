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
 * A connection within a channel identifies the sender and the receiver of this particular communication.
 * 
 * The FlexRay Autosar Tp module routes a Pdu through this connection.
 * 
 * <p>FLEXRAY-AR-TP-CONNECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-AR-TP-CONNECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TP-CONNECTION"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-AR-TP-CONNECTION"/>
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
@XmlType(name = "FLEXRAY-AR-TP-CONNECTION", propOrder = {
    "ident",
    "connectionpriopdus",
    "directtpsduref",
    "flowcontrolpduref",
    "multicastref",
    "reversedtpsduref",
    "sourceref",
    "targetrefs",
    "transmitpdurefs"
})
public class FLEXRAYARTPCONNECTION {

    @XmlElement(name = "IDENT")
    protected TPCONNECTIONIDENT ident;
    @XmlElement(name = "CONNECTION-PRIO-PDUS")
    protected INTEGER connectionpriopdus;
    @XmlElement(name = "DIRECT-TP-SDU-REF")
    protected FLEXRAYARTPCONNECTION.DIRECTTPSDUREF directtpsduref;
    @XmlElement(name = "FLOW-CONTROL-PDU-REF")
    protected FLEXRAYARTPCONNECTION.FLOWCONTROLPDUREF flowcontrolpduref;
    @XmlElement(name = "MULTICAST-REF")
    protected FLEXRAYARTPCONNECTION.MULTICASTREF multicastref;
    @XmlElement(name = "REVERSED-TP-SDU-REF")
    protected FLEXRAYARTPCONNECTION.REVERSEDTPSDUREF reversedtpsduref;
    @XmlElement(name = "SOURCE-REF")
    protected FLEXRAYARTPCONNECTION.SOURCEREF sourceref;
    @XmlElement(name = "TARGET-REFS")
    protected FLEXRAYARTPCONNECTION.TARGETREFS targetrefs;
    @XmlElement(name = "TRANSMIT-PDU-REFS")
    protected FLEXRAYARTPCONNECTION.TRANSMITPDUREFS transmitpdurefs;
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
     * ??connectionpriopdus?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCONNECTIONPRIOPDUS() {
        return connectionpriopdus;
    }

    /**
     * ??connectionpriopdus?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCONNECTIONPRIOPDUS(INTEGER value) {
        this.connectionpriopdus = value;
    }

    /**
     * ??directtpsduref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCONNECTION.DIRECTTPSDUREF }
     *     
     */
    public FLEXRAYARTPCONNECTION.DIRECTTPSDUREF getDIRECTTPSDUREF() {
        return directtpsduref;
    }

    /**
     * ??directtpsduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCONNECTION.DIRECTTPSDUREF }
     *     
     */
    public void setDIRECTTPSDUREF(FLEXRAYARTPCONNECTION.DIRECTTPSDUREF value) {
        this.directtpsduref = value;
    }

    /**
     * ??flowcontrolpduref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCONNECTION.FLOWCONTROLPDUREF }
     *     
     */
    public FLEXRAYARTPCONNECTION.FLOWCONTROLPDUREF getFLOWCONTROLPDUREF() {
        return flowcontrolpduref;
    }

    /**
     * ??flowcontrolpduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCONNECTION.FLOWCONTROLPDUREF }
     *     
     */
    public void setFLOWCONTROLPDUREF(FLEXRAYARTPCONNECTION.FLOWCONTROLPDUREF value) {
        this.flowcontrolpduref = value;
    }

    /**
     * ??multicastref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCONNECTION.MULTICASTREF }
     *     
     */
    public FLEXRAYARTPCONNECTION.MULTICASTREF getMULTICASTREF() {
        return multicastref;
    }

    /**
     * ??multicastref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCONNECTION.MULTICASTREF }
     *     
     */
    public void setMULTICASTREF(FLEXRAYARTPCONNECTION.MULTICASTREF value) {
        this.multicastref = value;
    }

    /**
     * ??reversedtpsduref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCONNECTION.REVERSEDTPSDUREF }
     *     
     */
    public FLEXRAYARTPCONNECTION.REVERSEDTPSDUREF getREVERSEDTPSDUREF() {
        return reversedtpsduref;
    }

    /**
     * ??reversedtpsduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCONNECTION.REVERSEDTPSDUREF }
     *     
     */
    public void setREVERSEDTPSDUREF(FLEXRAYARTPCONNECTION.REVERSEDTPSDUREF value) {
        this.reversedtpsduref = value;
    }

    /**
     * ??sourceref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCONNECTION.SOURCEREF }
     *     
     */
    public FLEXRAYARTPCONNECTION.SOURCEREF getSOURCEREF() {
        return sourceref;
    }

    /**
     * ??sourceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCONNECTION.SOURCEREF }
     *     
     */
    public void setSOURCEREF(FLEXRAYARTPCONNECTION.SOURCEREF value) {
        this.sourceref = value;
    }

    /**
     * ??targetrefs?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCONNECTION.TARGETREFS }
     *     
     */
    public FLEXRAYARTPCONNECTION.TARGETREFS getTARGETREFS() {
        return targetrefs;
    }

    /**
     * ??targetrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCONNECTION.TARGETREFS }
     *     
     */
    public void setTARGETREFS(FLEXRAYARTPCONNECTION.TARGETREFS value) {
        this.targetrefs = value;
    }

    /**
     * ??transmitpdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCONNECTION.TRANSMITPDUREFS }
     *     
     */
    public FLEXRAYARTPCONNECTION.TRANSMITPDUREFS getTRANSMITPDUREFS() {
        return transmitpdurefs;
    }

    /**
     * ??transmitpdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCONNECTION.TRANSMITPDUREFS }
     *     
     */
    public void setTRANSMITPDUREFS(FLEXRAYARTPCONNECTION.TRANSMITPDUREFS value) {
        this.transmitpdurefs = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-AR-TP-NODE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SOURCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLEXRAYARTPNODESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLEXRAYARTPNODESUBTYPESENUM }
         *     
         */
        public FLEXRAYARTPNODESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXRAYARTPNODESUBTYPESENUM }
         *     
         */
        public void setDEST(FLEXRAYARTPNODESUBTYPESENUM value) {
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
     *         &lt;element name="TARGET-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-AR-TP-NODE--SUBTYPES-ENUM" />
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
        "targetref"
    })
    public static class TARGETREFS {

        @XmlElement(name = "TARGET-REF")
        protected List<FLEXRAYARTPCONNECTION.TARGETREFS.TARGETREF> targetref;

        /**
         * Gets the value of the targetref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGETREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYARTPCONNECTION.TARGETREFS.TARGETREF }
         * 
         * 
         */
        public List<FLEXRAYARTPCONNECTION.TARGETREFS.TARGETREF> getTARGETREF() {
            if (targetref == null) {
                targetref = new ArrayList<FLEXRAYARTPCONNECTION.TARGETREFS.TARGETREF>();
            }
            return this.targetref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-AR-TP-NODE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TARGETREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected FLEXRAYARTPNODESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link FLEXRAYARTPNODESUBTYPESENUM }
             *     
             */
            public FLEXRAYARTPNODESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXRAYARTPNODESUBTYPESENUM }
             *     
             */
            public void setDEST(FLEXRAYARTPNODESUBTYPESENUM value) {
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
     *         &lt;element name="TRANSMIT-PDU-REF">
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
        "transmitpduref"
    })
    public static class TRANSMITPDUREFS {

        @XmlElement(name = "TRANSMIT-PDU-REF")
        protected List<FLEXRAYARTPCONNECTION.TRANSMITPDUREFS.TRANSMITPDUREF> transmitpduref;

        /**
         * Gets the value of the transmitpduref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transmitpduref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRANSMITPDUREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYARTPCONNECTION.TRANSMITPDUREFS.TRANSMITPDUREF }
         * 
         * 
         */
        public List<FLEXRAYARTPCONNECTION.TRANSMITPDUREFS.TRANSMITPDUREF> getTRANSMITPDUREF() {
            if (transmitpduref == null) {
                transmitpduref = new ArrayList<FLEXRAYARTPCONNECTION.TRANSMITPDUREFS.TRANSMITPDUREF>();
            }
            return this.transmitpduref;
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
        public static class TRANSMITPDUREF
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

}
