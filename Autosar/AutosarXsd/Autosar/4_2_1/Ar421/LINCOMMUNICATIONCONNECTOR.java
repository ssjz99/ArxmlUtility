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
 * LIN bus specific communication connector attributes.
 * 
 * <p>LIN-COMMUNICATION-CONNECTOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-COMMUNICATION-CONNECTOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMMUNICATION-CONNECTOR"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-COMMUNICATION-CONNECTOR"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIN-COMMUNICATION-CONNECTOR", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "commcontrollerref",
    "ecucommportinstances",
    "pncgatewaytype",
    "initialnad",
    "linconfigurableframes",
    "linorderedconfigurableframes"
})
public class LINCOMMUNICATIONCONNECTOR {

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
    @XmlElement(name = "COMM-CONTROLLER-REF")
    protected LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF commcontrollerref;
    @XmlElement(name = "ECU-COMM-PORT-INSTANCES")
    protected LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES ecucommportinstances;
    @XmlElement(name = "PNC-GATEWAY-TYPE")
    protected PNCGATEWAYTYPEENUM pncgatewaytype;
    @XmlElement(name = "INITIAL-NAD")
    protected INTEGER initialnad;
    @XmlElement(name = "LIN-CONFIGURABLE-FRAMES")
    protected LINCOMMUNICATIONCONNECTOR.LINCONFIGURABLEFRAMES linconfigurableframes;
    @XmlElement(name = "LIN-ORDERED-CONFIGURABLE-FRAMES")
    protected LINCOMMUNICATIONCONNECTOR.LINORDEREDCONFIGURABLEFRAMES linorderedconfigurableframes;
    @XmlAttribute(name = "UUID")
    protected String uuid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

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
     * ??commcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF }
     *     
     */
    public LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF getCOMMCONTROLLERREF() {
        return commcontrollerref;
    }

    /**
     * ??commcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF }
     *     
     */
    public void setCOMMCONTROLLERREF(LINCOMMUNICATIONCONNECTOR.COMMCONTROLLERREF value) {
        this.commcontrollerref = value;
    }

    /**
     * ??ecucommportinstances?????
     * 
     * @return
     *     possible object is
     *     {@link LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES }
     *     
     */
    public LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES getECUCOMMPORTINSTANCES() {
        return ecucommportinstances;
    }

    /**
     * ??ecucommportinstances?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES }
     *     
     */
    public void setECUCOMMPORTINSTANCES(LINCOMMUNICATIONCONNECTOR.ECUCOMMPORTINSTANCES value) {
        this.ecucommportinstances = value;
    }

    /**
     * ??pncgatewaytype?????
     * 
     * @return
     *     possible object is
     *     {@link PNCGATEWAYTYPEENUM }
     *     
     */
    public PNCGATEWAYTYPEENUM getPNCGATEWAYTYPE() {
        return pncgatewaytype;
    }

    /**
     * ??pncgatewaytype?????
     * 
     * @param value
     *     allowed object is
     *     {@link PNCGATEWAYTYPEENUM }
     *     
     */
    public void setPNCGATEWAYTYPE(PNCGATEWAYTYPEENUM value) {
        this.pncgatewaytype = value;
    }

    /**
     * ??initialnad?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getINITIALNAD() {
        return initialnad;
    }

    /**
     * ??initialnad?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setINITIALNAD(INTEGER value) {
        this.initialnad = value;
    }

    /**
     * ??linconfigurableframes?????
     * 
     * @return
     *     possible object is
     *     {@link LINCOMMUNICATIONCONNECTOR.LINCONFIGURABLEFRAMES }
     *     
     */
    public LINCOMMUNICATIONCONNECTOR.LINCONFIGURABLEFRAMES getLINCONFIGURABLEFRAMES() {
        return linconfigurableframes;
    }

    /**
     * ??linconfigurableframes?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINCOMMUNICATIONCONNECTOR.LINCONFIGURABLEFRAMES }
     *     
     */
    public void setLINCONFIGURABLEFRAMES(LINCOMMUNICATIONCONNECTOR.LINCONFIGURABLEFRAMES value) {
        this.linconfigurableframes = value;
    }

    /**
     * ??linorderedconfigurableframes?????
     * 
     * @return
     *     possible object is
     *     {@link LINCOMMUNICATIONCONNECTOR.LINORDEREDCONFIGURABLEFRAMES }
     *     
     */
    public LINCOMMUNICATIONCONNECTOR.LINORDEREDCONFIGURABLEFRAMES getLINORDEREDCONFIGURABLEFRAMES() {
        return linorderedconfigurableframes;
    }

    /**
     * ??linorderedconfigurableframes?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINCOMMUNICATIONCONNECTOR.LINORDEREDCONFIGURABLEFRAMES }
     *     
     */
    public void setLINORDEREDCONFIGURABLEFRAMES(LINCOMMUNICATIONCONNECTOR.LINORDEREDCONFIGURABLEFRAMES value) {
        this.linorderedconfigurableframes = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CONTROLLER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COMMCONTROLLERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMMUNICATIONCONTROLLERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMMUNICATIONCONTROLLERSUBTYPESENUM }
         *     
         */
        public COMMUNICATIONCONTROLLERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMMUNICATIONCONTROLLERSUBTYPESENUM }
         *     
         */
        public void setDEST(COMMUNICATIONCONTROLLERSUBTYPESENUM value) {
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
     *         &lt;element name="FRAME-PORT" type="{http://autosar.org/schema/r4.0}FRAME-PORT"/>
     *         &lt;element name="I-PDU-PORT" type="{http://autosar.org/schema/r4.0}I-PDU-PORT"/>
     *         &lt;element name="I-SIGNAL-PORT" type="{http://autosar.org/schema/r4.0}I-SIGNAL-PORT"/>
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
        "frameportOrIPDUPORTOrISIGNALPORT"
    })
    public static class ECUCOMMPORTINSTANCES {

        @XmlElements({
            @XmlElement(name = "FRAME-PORT", type = FRAMEPORT.class),
            @XmlElement(name = "I-PDU-PORT", type = IPDUPORT.class),
            @XmlElement(name = "I-SIGNAL-PORT", type = ISIGNALPORT.class)
        })
        protected List<Object> frameportOrIPDUPORTOrISIGNALPORT;

        /**
         * Gets the value of the frameportOrIPDUPORTOrISIGNALPORT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the frameportOrIPDUPORTOrISIGNALPORT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFRAMEPORTOrIPDUPORTOrISIGNALPORT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FRAMEPORT }
         * {@link IPDUPORT }
         * {@link ISIGNALPORT }
         * 
         * 
         */
        public List<Object> getFRAMEPORTOrIPDUPORTOrISIGNALPORT() {
            if (frameportOrIPDUPORTOrISIGNALPORT == null) {
                frameportOrIPDUPORTOrISIGNALPORT = new ArrayList<Object>();
            }
            return this.frameportOrIPDUPORTOrISIGNALPORT;
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
     *         &lt;element name="LIN-CONFIGURABLE-FRAME" type="{http://autosar.org/schema/r4.0}LIN-CONFIGURABLE-FRAME"/>
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
        "linconfigurableframe"
    })
    public static class LINCONFIGURABLEFRAMES {

        @XmlElement(name = "LIN-CONFIGURABLE-FRAME")
        protected List<LINCONFIGURABLEFRAME> linconfigurableframe;

        /**
         * Gets the value of the linconfigurableframe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linconfigurableframe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINCONFIGURABLEFRAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINCONFIGURABLEFRAME }
         * 
         * 
         */
        public List<LINCONFIGURABLEFRAME> getLINCONFIGURABLEFRAME() {
            if (linconfigurableframe == null) {
                linconfigurableframe = new ArrayList<LINCONFIGURABLEFRAME>();
            }
            return this.linconfigurableframe;
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
     *         &lt;element name="LIN-ORDERED-CONFIGURABLE-FRAME" type="{http://autosar.org/schema/r4.0}LIN-ORDERED-CONFIGURABLE-FRAME"/>
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
        "linorderedconfigurableframe"
    })
    public static class LINORDEREDCONFIGURABLEFRAMES {

        @XmlElement(name = "LIN-ORDERED-CONFIGURABLE-FRAME")
        protected List<LINORDEREDCONFIGURABLEFRAME> linorderedconfigurableframe;

        /**
         * Gets the value of the linorderedconfigurableframe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linorderedconfigurableframe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINORDEREDCONFIGURABLEFRAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINORDEREDCONFIGURABLEFRAME }
         * 
         * 
         */
        public List<LINORDEREDCONFIGURABLEFRAME> getLINORDEREDCONFIGURABLEFRAME() {
            if (linorderedconfigurableframe == null) {
                linorderedconfigurableframe = new ArrayList<LINORDEREDCONFIGURABLEFRAME>();
            }
            return this.linorderedconfigurableframe;
        }

    }

}
