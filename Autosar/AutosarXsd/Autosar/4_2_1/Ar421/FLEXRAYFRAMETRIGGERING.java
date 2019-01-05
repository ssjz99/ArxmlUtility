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
 * FlexRay specific attributes to the FrameTriggering
 * 
 * <p>FLEXRAY-FRAME-TRIGGERING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-FRAME-TRIGGERING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FRAME-TRIGGERING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-FRAME-TRIGGERING"/>
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
@XmlType(name = "FLEXRAY-FRAME-TRIGGERING", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "frameportrefs",
    "frameref",
    "pdutriggerings",
    "variationpoint",
    "absolutelyscheduledtimings",
    "allowdynamiclsdulength",
    "messageid",
    "payloadpreambleindicator"
})
public class FLEXRAYFRAMETRIGGERING {

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
    @XmlElement(name = "FRAME-PORT-REFS")
    protected Ar421.ETHERNETFRAMETRIGGERING.FRAMEPORTREFS frameportrefs;
    @XmlElement(name = "FRAME-REF")
    protected Ar421.ETHERNETFRAMETRIGGERING.FRAMEREF frameref;
    @XmlElement(name = "PDU-TRIGGERINGS")
    protected Ar421.ETHERNETFRAMETRIGGERING.PDUTRIGGERINGS pdutriggerings;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "ABSOLUTELY-SCHEDULED-TIMINGS")
    protected FLEXRAYFRAMETRIGGERING.ABSOLUTELYSCHEDULEDTIMINGS absolutelyscheduledtimings;
    @XmlElement(name = "ALLOW-DYNAMIC-L-SDU-LENGTH")
    protected BOOLEAN allowdynamiclsdulength;
    @XmlElement(name = "MESSAGE-ID")
    protected POSITIVEINTEGER messageid;
    @XmlElement(name = "PAYLOAD-PREAMBLE-INDICATOR")
    protected BOOLEAN payloadpreambleindicator;
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
     * ??frameportrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ETHERNETFRAMETRIGGERING.FRAMEPORTREFS }
     *     
     */
    public Ar421.ETHERNETFRAMETRIGGERING.FRAMEPORTREFS getFRAMEPORTREFS() {
        return frameportrefs;
    }

    /**
     * ??frameportrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ETHERNETFRAMETRIGGERING.FRAMEPORTREFS }
     *     
     */
    public void setFRAMEPORTREFS(Ar421.ETHERNETFRAMETRIGGERING.FRAMEPORTREFS value) {
        this.frameportrefs = value;
    }

    /**
     * ??frameref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ETHERNETFRAMETRIGGERING.FRAMEREF }
     *     
     */
    public Ar421.ETHERNETFRAMETRIGGERING.FRAMEREF getFRAMEREF() {
        return frameref;
    }

    /**
     * ??frameref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ETHERNETFRAMETRIGGERING.FRAMEREF }
     *     
     */
    public void setFRAMEREF(Ar421.ETHERNETFRAMETRIGGERING.FRAMEREF value) {
        this.frameref = value;
    }

    /**
     * ??pdutriggerings?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.ETHERNETFRAMETRIGGERING.PDUTRIGGERINGS }
     *     
     */
    public Ar421.ETHERNETFRAMETRIGGERING.PDUTRIGGERINGS getPDUTRIGGERINGS() {
        return pdutriggerings;
    }

    /**
     * ??pdutriggerings?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.ETHERNETFRAMETRIGGERING.PDUTRIGGERINGS }
     *     
     */
    public void setPDUTRIGGERINGS(Ar421.ETHERNETFRAMETRIGGERING.PDUTRIGGERINGS value) {
        this.pdutriggerings = value;
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
     * ??absolutelyscheduledtimings?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYFRAMETRIGGERING.ABSOLUTELYSCHEDULEDTIMINGS }
     *     
     */
    public FLEXRAYFRAMETRIGGERING.ABSOLUTELYSCHEDULEDTIMINGS getABSOLUTELYSCHEDULEDTIMINGS() {
        return absolutelyscheduledtimings;
    }

    /**
     * ??absolutelyscheduledtimings?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYFRAMETRIGGERING.ABSOLUTELYSCHEDULEDTIMINGS }
     *     
     */
    public void setABSOLUTELYSCHEDULEDTIMINGS(FLEXRAYFRAMETRIGGERING.ABSOLUTELYSCHEDULEDTIMINGS value) {
        this.absolutelyscheduledtimings = value;
    }

    /**
     * ??allowdynamiclsdulength?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getALLOWDYNAMICLSDULENGTH() {
        return allowdynamiclsdulength;
    }

    /**
     * ??allowdynamiclsdulength?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setALLOWDYNAMICLSDULENGTH(BOOLEAN value) {
        this.allowdynamiclsdulength = value;
    }

    /**
     * ??messageid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMESSAGEID() {
        return messageid;
    }

    /**
     * ??messageid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMESSAGEID(POSITIVEINTEGER value) {
        this.messageid = value;
    }

    /**
     * ??payloadpreambleindicator?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getPAYLOADPREAMBLEINDICATOR() {
        return payloadpreambleindicator;
    }

    /**
     * ??payloadpreambleindicator?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setPAYLOADPREAMBLEINDICATOR(BOOLEAN value) {
        this.payloadpreambleindicator = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING" type="{http://autosar.org/schema/r4.0}FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING"/>
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
        "flexrayabsolutelyscheduledtiming"
    })
    public static class ABSOLUTELYSCHEDULEDTIMINGS {

        @XmlElement(name = "FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING")
        protected List<FLEXRAYABSOLUTELYSCHEDULEDTIMING> flexrayabsolutelyscheduledtiming;

        /**
         * Gets the value of the flexrayabsolutelyscheduledtiming property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexrayabsolutelyscheduledtiming property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYABSOLUTELYSCHEDULEDTIMING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYABSOLUTELYSCHEDULEDTIMING }
         * 
         * 
         */
        public List<FLEXRAYABSOLUTELYSCHEDULEDTIMING> getFLEXRAYABSOLUTELYSCHEDULEDTIMING() {
            if (flexrayabsolutelyscheduledtiming == null) {
                flexrayabsolutelyscheduledtiming = new ArrayList<FLEXRAYABSOLUTELYSCHEDULEDTIMING>();
            }
            return this.flexrayabsolutelyscheduledtiming;
        }

    }

}
