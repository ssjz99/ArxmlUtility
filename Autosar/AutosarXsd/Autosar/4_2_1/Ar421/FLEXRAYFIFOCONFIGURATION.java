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
 * One First In First Out (FIFO) queued receive structure, defining the admittance criteria to the FIFO, and mandating the ability to admit messages into the FIFO based on Message Id filtering criteria.
 * 
 * <p>FLEXRAY-FIFO-CONFIGURATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-FIFO-CONFIGURATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-FIFO-CONFIGURATION"/>
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
@XmlType(name = "FLEXRAY-FIFO-CONFIGURATION", propOrder = {
    "admitwithoutmessageid",
    "basecycle",
    "channelref",
    "cyclerepetition",
    "fifodepth",
    "fiforanges",
    "msgidmask",
    "msgidmatch"
})
public class FLEXRAYFIFOCONFIGURATION {

    @XmlElement(name = "ADMIT-WITHOUT-MESSAGE-ID")
    protected BOOLEAN admitwithoutmessageid;
    @XmlElement(name = "BASE-CYCLE")
    protected INTEGER basecycle;
    @XmlElement(name = "CHANNEL-REF")
    protected FLEXRAYFIFOCONFIGURATION.CHANNELREF channelref;
    @XmlElement(name = "CYCLE-REPETITION")
    protected INTEGER cyclerepetition;
    @XmlElement(name = "FIFO-DEPTH")
    protected INTEGER fifodepth;
    @XmlElement(name = "FIFO-RANGES")
    protected FLEXRAYFIFOCONFIGURATION.FIFORANGES fiforanges;
    @XmlElement(name = "MSG-ID-MASK")
    protected INTEGER msgidmask;
    @XmlElement(name = "MSG-ID-MATCH")
    protected INTEGER msgidmatch;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??admitwithoutmessageid?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getADMITWITHOUTMESSAGEID() {
        return admitwithoutmessageid;
    }

    /**
     * ??admitwithoutmessageid?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setADMITWITHOUTMESSAGEID(BOOLEAN value) {
        this.admitwithoutmessageid = value;
    }

    /**
     * ??basecycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getBASECYCLE() {
        return basecycle;
    }

    /**
     * ??basecycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setBASECYCLE(INTEGER value) {
        this.basecycle = value;
    }

    /**
     * ??channelref?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYFIFOCONFIGURATION.CHANNELREF }
     *     
     */
    public FLEXRAYFIFOCONFIGURATION.CHANNELREF getCHANNELREF() {
        return channelref;
    }

    /**
     * ??channelref?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYFIFOCONFIGURATION.CHANNELREF }
     *     
     */
    public void setCHANNELREF(FLEXRAYFIFOCONFIGURATION.CHANNELREF value) {
        this.channelref = value;
    }

    /**
     * ??cyclerepetition?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getCYCLEREPETITION() {
        return cyclerepetition;
    }

    /**
     * ??cyclerepetition?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setCYCLEREPETITION(INTEGER value) {
        this.cyclerepetition = value;
    }

    /**
     * ??fifodepth?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getFIFODEPTH() {
        return fifodepth;
    }

    /**
     * ??fifodepth?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setFIFODEPTH(INTEGER value) {
        this.fifodepth = value;
    }

    /**
     * ??fiforanges?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYFIFOCONFIGURATION.FIFORANGES }
     *     
     */
    public FLEXRAYFIFOCONFIGURATION.FIFORANGES getFIFORANGES() {
        return fiforanges;
    }

    /**
     * ??fiforanges?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYFIFOCONFIGURATION.FIFORANGES }
     *     
     */
    public void setFIFORANGES(FLEXRAYFIFOCONFIGURATION.FIFORANGES value) {
        this.fiforanges = value;
    }

    /**
     * ??msgidmask?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMSGIDMASK() {
        return msgidmask;
    }

    /**
     * ??msgidmask?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMSGIDMASK(INTEGER value) {
        this.msgidmask = value;
    }

    /**
     * ??msgidmatch?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMSGIDMATCH() {
        return msgidmatch;
    }

    /**
     * ??msgidmatch?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMSGIDMATCH(INTEGER value) {
        this.msgidmatch = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}FLEXRAY-PHYSICAL-CHANNEL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CHANNELREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected FLEXRAYPHYSICALCHANNELSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link FLEXRAYPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public FLEXRAYPHYSICALCHANNELSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXRAYPHYSICALCHANNELSUBTYPESENUM }
         *     
         */
        public void setDEST(FLEXRAYPHYSICALCHANNELSUBTYPESENUM value) {
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
     *         &lt;element name="FLEXRAY-FIFO-RANGE" type="{http://autosar.org/schema/r4.0}FLEXRAY-FIFO-RANGE"/>
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
        "flexrayfiforange"
    })
    public static class FIFORANGES {

        @XmlElement(name = "FLEXRAY-FIFO-RANGE")
        protected List<FLEXRAYFIFORANGE> flexrayfiforange;

        /**
         * Gets the value of the flexrayfiforange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexrayfiforange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYFIFORANGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYFIFORANGE }
         * 
         * 
         */
        public List<FLEXRAYFIFORANGE> getFLEXRAYFIFORANGE() {
            if (flexrayfiforange == null) {
                flexrayfiforange = new ArrayList<FLEXRAYFIFORANGE>();
            }
            return this.flexrayfiforange;
        }

    }

}
