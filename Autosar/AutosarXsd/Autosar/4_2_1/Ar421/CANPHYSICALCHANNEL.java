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
 * CAN bus specific physical channel attributes.
 * 
 * <p>CAN-PHYSICAL-CHANNEL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-PHYSICAL-CHANNEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PHYSICAL-CHANNEL"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-CAN-PHYSICAL-CHANNEL"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-PHYSICAL-CHANNEL"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAN-PHYSICAL-CHANNEL", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "commconnectors",
    "frametriggerings",
    "isignaltriggerings",
    "pdutriggerings",
    "variationpoint"
})
public class CANPHYSICALCHANNEL {

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
    @XmlElement(name = "COMM-CONNECTORS")
    protected CANPHYSICALCHANNEL.COMMCONNECTORS commconnectors;
    @XmlElement(name = "FRAME-TRIGGERINGS")
    protected CANPHYSICALCHANNEL.FRAMETRIGGERINGS frametriggerings;
    @XmlElement(name = "I-SIGNAL-TRIGGERINGS")
    protected CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS isignaltriggerings;
    @XmlElement(name = "PDU-TRIGGERINGS")
    protected CANPHYSICALCHANNEL.PDUTRIGGERINGS pdutriggerings;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;
    @XmlAttribute(name = "UUID")
    protected String uuid;

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
     * ??commconnectors?????
     * 
     * @return
     *     possible object is
     *     {@link CANPHYSICALCHANNEL.COMMCONNECTORS }
     *     
     */
    public CANPHYSICALCHANNEL.COMMCONNECTORS getCOMMCONNECTORS() {
        return commconnectors;
    }

    /**
     * ??commconnectors?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANPHYSICALCHANNEL.COMMCONNECTORS }
     *     
     */
    public void setCOMMCONNECTORS(CANPHYSICALCHANNEL.COMMCONNECTORS value) {
        this.commconnectors = value;
    }

    /**
     * ??frametriggerings?????
     * 
     * @return
     *     possible object is
     *     {@link CANPHYSICALCHANNEL.FRAMETRIGGERINGS }
     *     
     */
    public CANPHYSICALCHANNEL.FRAMETRIGGERINGS getFRAMETRIGGERINGS() {
        return frametriggerings;
    }

    /**
     * ??frametriggerings?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANPHYSICALCHANNEL.FRAMETRIGGERINGS }
     *     
     */
    public void setFRAMETRIGGERINGS(CANPHYSICALCHANNEL.FRAMETRIGGERINGS value) {
        this.frametriggerings = value;
    }

    /**
     * ??isignaltriggerings?????
     * 
     * @return
     *     possible object is
     *     {@link CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS }
     *     
     */
    public CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS getISIGNALTRIGGERINGS() {
        return isignaltriggerings;
    }

    /**
     * ??isignaltriggerings?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS }
     *     
     */
    public void setISIGNALTRIGGERINGS(CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS value) {
        this.isignaltriggerings = value;
    }

    /**
     * ??pdutriggerings?????
     * 
     * @return
     *     possible object is
     *     {@link CANPHYSICALCHANNEL.PDUTRIGGERINGS }
     *     
     */
    public CANPHYSICALCHANNEL.PDUTRIGGERINGS getPDUTRIGGERINGS() {
        return pdutriggerings;
    }

    /**
     * ??pdutriggerings?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANPHYSICALCHANNEL.PDUTRIGGERINGS }
     *     
     */
    public void setPDUTRIGGERINGS(CANPHYSICALCHANNEL.PDUTRIGGERINGS value) {
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
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="COMMUNICATION-CONNECTOR-REF-CONDITIONAL" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CONNECTOR-REF-CONDITIONAL"/>
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
        "communicationconnectorrefconditional"
    })
    public static class COMMCONNECTORS {

        @XmlElement(name = "COMMUNICATION-CONNECTOR-REF-CONDITIONAL")
        protected List<COMMUNICATIONCONNECTORREFCONDITIONAL> communicationconnectorrefconditional;

        /**
         * Gets the value of the communicationconnectorrefconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the communicationconnectorrefconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMMUNICATIONCONNECTORREFCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMMUNICATIONCONNECTORREFCONDITIONAL }
         * 
         * 
         */
        public List<COMMUNICATIONCONNECTORREFCONDITIONAL> getCOMMUNICATIONCONNECTORREFCONDITIONAL() {
            if (communicationconnectorrefconditional == null) {
                communicationconnectorrefconditional = new ArrayList<COMMUNICATIONCONNECTORREFCONDITIONAL>();
            }
            return this.communicationconnectorrefconditional;
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
     *         &lt;element name="CAN-FRAME-TRIGGERING" type="{http://autosar.org/schema/r4.0}CAN-FRAME-TRIGGERING"/>
     *         &lt;element name="ETHERNET-FRAME-TRIGGERING" type="{http://autosar.org/schema/r4.0}ETHERNET-FRAME-TRIGGERING"/>
     *         &lt;element name="FLEXRAY-FRAME-TRIGGERING" type="{http://autosar.org/schema/r4.0}FLEXRAY-FRAME-TRIGGERING"/>
     *         &lt;element name="LIN-FRAME-TRIGGERING" type="{http://autosar.org/schema/r4.0}LIN-FRAME-TRIGGERING"/>
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
        "canframetriggeringOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING"
    })
    public static class FRAMETRIGGERINGS {

        @XmlElements({
            @XmlElement(name = "CAN-FRAME-TRIGGERING", type = CANFRAMETRIGGERING.class),
            @XmlElement(name = "ETHERNET-FRAME-TRIGGERING", type = ETHERNETFRAMETRIGGERING.class),
            @XmlElement(name = "FLEXRAY-FRAME-TRIGGERING", type = FLEXRAYFRAMETRIGGERING.class),
            @XmlElement(name = "LIN-FRAME-TRIGGERING", type = LINFRAMETRIGGERING.class)
        })
        protected List<Object> canframetriggeringOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING;

        /**
         * Gets the value of the canframetriggeringOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the canframetriggeringOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANFRAMETRIGGERINGOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANFRAMETRIGGERING }
         * {@link ETHERNETFRAMETRIGGERING }
         * {@link FLEXRAYFRAMETRIGGERING }
         * {@link LINFRAMETRIGGERING }
         * 
         * 
         */
        public List<Object> getCANFRAMETRIGGERINGOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING() {
            if (canframetriggeringOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING == null) {
                canframetriggeringOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING = new ArrayList<Object>();
            }
            return this.canframetriggeringOrETHERNETFRAMETRIGGERINGOrFLEXRAYFRAMETRIGGERING;
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
     *         &lt;element name="I-SIGNAL-TRIGGERING" type="{http://autosar.org/schema/r4.0}I-SIGNAL-TRIGGERING"/>
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
        "isignaltriggering"
    })
    public static class ISIGNALTRIGGERINGS {

        @XmlElement(name = "I-SIGNAL-TRIGGERING")
        protected List<ISIGNALTRIGGERING> isignaltriggering;

        /**
         * Gets the value of the isignaltriggering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the isignaltriggering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISIGNALTRIGGERING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ISIGNALTRIGGERING }
         * 
         * 
         */
        public List<ISIGNALTRIGGERING> getISIGNALTRIGGERING() {
            if (isignaltriggering == null) {
                isignaltriggering = new ArrayList<ISIGNALTRIGGERING>();
            }
            return this.isignaltriggering;
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
     *         &lt;element name="PDU-TRIGGERING" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING"/>
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
        "pdutriggering"
    })
    public static class PDUTRIGGERINGS {

        @XmlElement(name = "PDU-TRIGGERING")
        protected List<PDUTRIGGERING> pdutriggering;

        /**
         * Gets the value of the pdutriggering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pdutriggering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPDUTRIGGERING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PDUTRIGGERING }
         * 
         * 
         */
        public List<PDUTRIGGERING> getPDUTRIGGERING() {
            if (pdutriggering == null) {
                pdutriggering = new ArrayList<PDUTRIGGERING>();
            }
            return this.pdutriggering;
        }

    }

}
