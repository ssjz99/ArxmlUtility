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
 * A channel is a group of connections sharing several properties.
 * 
 * The FlexRay AutosarTransport Layer supports several channels. These channels can work concurrently, thus each of them requires its own state machine and management data structures and its own PDU-IDs.
 * 
 * <p>FLEXRAY-AR-TP-CHANNEL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-AR-TP-CHANNEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-AR-TP-CHANNEL"/>
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
@XmlType(name = "FLEXRAY-AR-TP-CHANNEL", propOrder = {
    "acktype",
    "cancellation",
    "extendedaddressing",
    "flowcontrolpduref",
    "maxar",
    "maxas",
    "maxbs",
    "maxbufferrequest",
    "maxfcwait",
    "maxfrif",
    "maxretries",
    "maximummessagelength",
    "minimummulticastseperationtime",
    "minimumseparationtime",
    "multicastsegmentation",
    "npdurefs",
    "pdupools",
    "timebr",
    "timebuffer",
    "timecs",
    "timefrif",
    "timeoutar",
    "timeoutas",
    "timeoutbs",
    "timeoutcr",
    "tpconnections",
    "transmitcancellation",
    "variationpoint"
})
public class FLEXRAYARTPCHANNEL {

    @XmlElement(name = "ACK-TYPE")
    protected FRARTPACKTYPE acktype;
    @XmlElement(name = "CANCELLATION")
    protected BOOLEAN cancellation;
    @XmlElement(name = "EXTENDED-ADDRESSING")
    protected BOOLEAN extendedaddressing;
    @XmlElement(name = "FLOW-CONTROL-PDU-REF")
    protected FLEXRAYARTPCHANNEL.FLOWCONTROLPDUREF flowcontrolpduref;
    @XmlElement(name = "MAX-AR")
    protected INTEGER maxar;
    @XmlElement(name = "MAX-AS")
    protected INTEGER maxas;
    @XmlElement(name = "MAX-BS")
    protected INTEGER maxbs;
    @XmlElement(name = "MAX-BUFFER-REQUEST")
    protected INTEGER maxbufferrequest;
    @XmlElement(name = "MAX-FC-WAIT")
    protected POSITIVEINTEGER maxfcwait;
    @XmlElement(name = "MAX-FR-IF")
    protected INTEGER maxfrif;
    @XmlElement(name = "MAX-RETRIES")
    protected INTEGER maxretries;
    @XmlElement(name = "MAXIMUM-MESSAGE-LENGTH")
    protected MAXIMUMMESSAGELENGTHTYPE maximummessagelength;
    @XmlElement(name = "MINIMUM-MULTICAST-SEPERATION-TIME")
    protected TIMEVALUE minimummulticastseperationtime;
    @XmlElement(name = "MINIMUM-SEPARATION-TIME")
    protected TIMEVALUE minimumseparationtime;
    @XmlElement(name = "MULTICAST-SEGMENTATION")
    protected BOOLEAN multicastsegmentation;
    @XmlElement(name = "N-PDU-REFS")
    protected FLEXRAYARTPCHANNEL.NPDUREFS npdurefs;
    @XmlElement(name = "PDU-POOLS")
    protected FLEXRAYARTPCHANNEL.PDUPOOLS pdupools;
    @XmlElement(name = "TIME-BR")
    protected TIMEVALUE timebr;
    @XmlElement(name = "TIME-BUFFER")
    protected TIMEVALUE timebuffer;
    @XmlElement(name = "TIME-CS")
    protected TIMEVALUE timecs;
    @XmlElement(name = "TIME-FR-IF")
    protected TIMEVALUE timefrif;
    @XmlElement(name = "TIMEOUT-AR")
    protected TIMEVALUE timeoutar;
    @XmlElement(name = "TIMEOUT-AS")
    protected TIMEVALUE timeoutas;
    @XmlElement(name = "TIMEOUT-BS")
    protected TIMEVALUE timeoutbs;
    @XmlElement(name = "TIMEOUT-CR")
    protected TIMEVALUE timeoutcr;
    @XmlElement(name = "TP-CONNECTIONS")
    protected FLEXRAYARTPCHANNEL.TPCONNECTIONS tpconnections;
    @XmlElement(name = "TRANSMIT-CANCELLATION")
    protected BOOLEAN transmitcancellation;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??acktype?????
     * 
     * @return
     *     possible object is
     *     {@link FRARTPACKTYPE }
     *     
     */
    public FRARTPACKTYPE getACKTYPE() {
        return acktype;
    }

    /**
     * ??acktype?????
     * 
     * @param value
     *     allowed object is
     *     {@link FRARTPACKTYPE }
     *     
     */
    public void setACKTYPE(FRARTPACKTYPE value) {
        this.acktype = value;
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
     * ??extendedaddressing?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getEXTENDEDADDRESSING() {
        return extendedaddressing;
    }

    /**
     * ??extendedaddressing?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setEXTENDEDADDRESSING(BOOLEAN value) {
        this.extendedaddressing = value;
    }

    /**
     * ??flowcontrolpduref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCHANNEL.FLOWCONTROLPDUREF }
     *     
     */
    public FLEXRAYARTPCHANNEL.FLOWCONTROLPDUREF getFLOWCONTROLPDUREF() {
        return flowcontrolpduref;
    }

    /**
     * ??flowcontrolpduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCHANNEL.FLOWCONTROLPDUREF }
     *     
     */
    public void setFLOWCONTROLPDUREF(FLEXRAYARTPCHANNEL.FLOWCONTROLPDUREF value) {
        this.flowcontrolpduref = value;
    }

    /**
     * ??maxar?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXAR() {
        return maxar;
    }

    /**
     * ??maxar?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXAR(INTEGER value) {
        this.maxar = value;
    }

    /**
     * ??maxas?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXAS() {
        return maxas;
    }

    /**
     * ??maxas?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXAS(INTEGER value) {
        this.maxas = value;
    }

    /**
     * ??maxbs?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXBS() {
        return maxbs;
    }

    /**
     * ??maxbs?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXBS(INTEGER value) {
        this.maxbs = value;
    }

    /**
     * ??maxbufferrequest?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXBUFFERREQUEST() {
        return maxbufferrequest;
    }

    /**
     * ??maxbufferrequest?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXBUFFERREQUEST(INTEGER value) {
        this.maxbufferrequest = value;
    }

    /**
     * ??maxfcwait?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXFCWAIT() {
        return maxfcwait;
    }

    /**
     * ??maxfcwait?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXFCWAIT(POSITIVEINTEGER value) {
        this.maxfcwait = value;
    }

    /**
     * ??maxfrif?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXFRIF() {
        return maxfrif;
    }

    /**
     * ??maxfrif?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXFRIF(INTEGER value) {
        this.maxfrif = value;
    }

    /**
     * ??maxretries?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXRETRIES() {
        return maxretries;
    }

    /**
     * ??maxretries?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXRETRIES(INTEGER value) {
        this.maxretries = value;
    }

    /**
     * ??maximummessagelength?????
     * 
     * @return
     *     possible object is
     *     {@link MAXIMUMMESSAGELENGTHTYPE }
     *     
     */
    public MAXIMUMMESSAGELENGTHTYPE getMAXIMUMMESSAGELENGTH() {
        return maximummessagelength;
    }

    /**
     * ??maximummessagelength?????
     * 
     * @param value
     *     allowed object is
     *     {@link MAXIMUMMESSAGELENGTHTYPE }
     *     
     */
    public void setMAXIMUMMESSAGELENGTH(MAXIMUMMESSAGELENGTHTYPE value) {
        this.maximummessagelength = value;
    }

    /**
     * ??minimummulticastseperationtime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMINIMUMMULTICASTSEPERATIONTIME() {
        return minimummulticastseperationtime;
    }

    /**
     * ??minimummulticastseperationtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMINIMUMMULTICASTSEPERATIONTIME(TIMEVALUE value) {
        this.minimummulticastseperationtime = value;
    }

    /**
     * ??minimumseparationtime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getMINIMUMSEPARATIONTIME() {
        return minimumseparationtime;
    }

    /**
     * ??minimumseparationtime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setMINIMUMSEPARATIONTIME(TIMEVALUE value) {
        this.minimumseparationtime = value;
    }

    /**
     * ??multicastsegmentation?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getMULTICASTSEGMENTATION() {
        return multicastsegmentation;
    }

    /**
     * ??multicastsegmentation?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setMULTICASTSEGMENTATION(BOOLEAN value) {
        this.multicastsegmentation = value;
    }

    /**
     * ??npdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCHANNEL.NPDUREFS }
     *     
     */
    public FLEXRAYARTPCHANNEL.NPDUREFS getNPDUREFS() {
        return npdurefs;
    }

    /**
     * ??npdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCHANNEL.NPDUREFS }
     *     
     */
    public void setNPDUREFS(FLEXRAYARTPCHANNEL.NPDUREFS value) {
        this.npdurefs = value;
    }

    /**
     * ??pdupools?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCHANNEL.PDUPOOLS }
     *     
     */
    public FLEXRAYARTPCHANNEL.PDUPOOLS getPDUPOOLS() {
        return pdupools;
    }

    /**
     * ??pdupools?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCHANNEL.PDUPOOLS }
     *     
     */
    public void setPDUPOOLS(FLEXRAYARTPCHANNEL.PDUPOOLS value) {
        this.pdupools = value;
    }

    /**
     * ??timebr?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEBR() {
        return timebr;
    }

    /**
     * ??timebr?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEBR(TIMEVALUE value) {
        this.timebr = value;
    }

    /**
     * ??timebuffer?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEBUFFER() {
        return timebuffer;
    }

    /**
     * ??timebuffer?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEBUFFER(TIMEVALUE value) {
        this.timebuffer = value;
    }

    /**
     * ??timecs?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMECS() {
        return timecs;
    }

    /**
     * ??timecs?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMECS(TIMEVALUE value) {
        this.timecs = value;
    }

    /**
     * ??timefrif?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEFRIF() {
        return timefrif;
    }

    /**
     * ??timefrif?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEFRIF(TIMEVALUE value) {
        this.timefrif = value;
    }

    /**
     * ??timeoutar?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTAR() {
        return timeoutar;
    }

    /**
     * ??timeoutar?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTAR(TIMEVALUE value) {
        this.timeoutar = value;
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
     * ??tpconnections?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYARTPCHANNEL.TPCONNECTIONS }
     *     
     */
    public FLEXRAYARTPCHANNEL.TPCONNECTIONS getTPCONNECTIONS() {
        return tpconnections;
    }

    /**
     * ??tpconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYARTPCHANNEL.TPCONNECTIONS }
     *     
     */
    public void setTPCONNECTIONS(FLEXRAYARTPCHANNEL.TPCONNECTIONS value) {
        this.tpconnections = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="N-PDU-REF">
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
        "npduref"
    })
    public static class NPDUREFS {

        @XmlElement(name = "N-PDU-REF")
        protected List<FLEXRAYARTPCHANNEL.NPDUREFS.NPDUREF> npduref;

        /**
         * Gets the value of the npduref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the npduref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNPDUREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYARTPCHANNEL.NPDUREFS.NPDUREF }
         * 
         * 
         */
        public List<FLEXRAYARTPCHANNEL.NPDUREFS.NPDUREF> getNPDUREF() {
            if (npduref == null) {
                npduref = new ArrayList<FLEXRAYARTPCHANNEL.NPDUREFS.NPDUREF>();
            }
            return this.npduref;
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
     *         &lt;element name="N-PDU" type="{http://autosar.org/schema/r4.0}N-PDU"/>
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
        "npdu"
    })
    public static class PDUPOOLS {

        @XmlElement(name = "N-PDU")
        protected List<NPDU> npdu;

        /**
         * Gets the value of the npdu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the npdu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNPDU().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NPDU }
         * 
         * 
         */
        public List<NPDU> getNPDU() {
            if (npdu == null) {
                npdu = new ArrayList<NPDU>();
            }
            return this.npdu;
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
     *         &lt;element name="FLEXRAY-AR-TP-CONNECTION" type="{http://autosar.org/schema/r4.0}FLEXRAY-AR-TP-CONNECTION"/>
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
        "flexrayartpconnection"
    })
    public static class TPCONNECTIONS {

        @XmlElement(name = "FLEXRAY-AR-TP-CONNECTION")
        protected List<FLEXRAYARTPCONNECTION> flexrayartpconnection;

        /**
         * Gets the value of the flexrayartpconnection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexrayartpconnection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYARTPCONNECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYARTPCONNECTION }
         * 
         * 
         */
        public List<FLEXRAYARTPCONNECTION> getFLEXRAYARTPCONNECTION() {
            if (flexrayartpconnection == null) {
                flexrayartpconnection = new ArrayList<FLEXRAYARTPCONNECTION>();
            }
            return this.flexrayartpconnection;
        }

    }

}
