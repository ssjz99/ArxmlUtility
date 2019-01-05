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
 * LIN specific attributes to the physicalChannel
 * 
 * <p>LIN-PHYSICAL-CHANNEL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-PHYSICAL-CHANNEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PHYSICAL-CHANNEL"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-PHYSICAL-CHANNEL"/>
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
@XmlType(name = "LIN-PHYSICAL-CHANNEL", propOrder = {
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
    "variationpoint",
    "scheduletables"
})
public class LINPHYSICALCHANNEL {

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
    protected Ar421.CANPHYSICALCHANNEL.COMMCONNECTORS commconnectors;
    @XmlElement(name = "FRAME-TRIGGERINGS")
    protected Ar421.CANPHYSICALCHANNEL.FRAMETRIGGERINGS frametriggerings;
    @XmlElement(name = "I-SIGNAL-TRIGGERINGS")
    protected Ar421.CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS isignaltriggerings;
    @XmlElement(name = "PDU-TRIGGERINGS")
    protected Ar421.CANPHYSICALCHANNEL.PDUTRIGGERINGS pdutriggerings;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "SCHEDULE-TABLES")
    protected LINPHYSICALCHANNEL.SCHEDULETABLES scheduletables;
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
     * ??commconnectors?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CANPHYSICALCHANNEL.COMMCONNECTORS }
     *     
     */
    public Ar421.CANPHYSICALCHANNEL.COMMCONNECTORS getCOMMCONNECTORS() {
        return commconnectors;
    }

    /**
     * ??commconnectors?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CANPHYSICALCHANNEL.COMMCONNECTORS }
     *     
     */
    public void setCOMMCONNECTORS(Ar421.CANPHYSICALCHANNEL.COMMCONNECTORS value) {
        this.commconnectors = value;
    }

    /**
     * ??frametriggerings?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CANPHYSICALCHANNEL.FRAMETRIGGERINGS }
     *     
     */
    public Ar421.CANPHYSICALCHANNEL.FRAMETRIGGERINGS getFRAMETRIGGERINGS() {
        return frametriggerings;
    }

    /**
     * ??frametriggerings?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CANPHYSICALCHANNEL.FRAMETRIGGERINGS }
     *     
     */
    public void setFRAMETRIGGERINGS(Ar421.CANPHYSICALCHANNEL.FRAMETRIGGERINGS value) {
        this.frametriggerings = value;
    }

    /**
     * ??isignaltriggerings?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS }
     *     
     */
    public Ar421.CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS getISIGNALTRIGGERINGS() {
        return isignaltriggerings;
    }

    /**
     * ??isignaltriggerings?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS }
     *     
     */
    public void setISIGNALTRIGGERINGS(Ar421.CANPHYSICALCHANNEL.ISIGNALTRIGGERINGS value) {
        this.isignaltriggerings = value;
    }

    /**
     * ??pdutriggerings?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CANPHYSICALCHANNEL.PDUTRIGGERINGS }
     *     
     */
    public Ar421.CANPHYSICALCHANNEL.PDUTRIGGERINGS getPDUTRIGGERINGS() {
        return pdutriggerings;
    }

    /**
     * ??pdutriggerings?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CANPHYSICALCHANNEL.PDUTRIGGERINGS }
     *     
     */
    public void setPDUTRIGGERINGS(Ar421.CANPHYSICALCHANNEL.PDUTRIGGERINGS value) {
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
     * ??scheduletables?????
     * 
     * @return
     *     possible object is
     *     {@link LINPHYSICALCHANNEL.SCHEDULETABLES }
     *     
     */
    public LINPHYSICALCHANNEL.SCHEDULETABLES getSCHEDULETABLES() {
        return scheduletables;
    }

    /**
     * ??scheduletables?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINPHYSICALCHANNEL.SCHEDULETABLES }
     *     
     */
    public void setSCHEDULETABLES(LINPHYSICALCHANNEL.SCHEDULETABLES value) {
        this.scheduletables = value;
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
     *         &lt;element name="LIN-SCHEDULE-TABLE" type="{http://autosar.org/schema/r4.0}LIN-SCHEDULE-TABLE"/>
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
        "linscheduletable"
    })
    public static class SCHEDULETABLES {

        @XmlElement(name = "LIN-SCHEDULE-TABLE")
        protected List<LINSCHEDULETABLE> linscheduletable;

        /**
         * Gets the value of the linscheduletable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linscheduletable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINSCHEDULETABLE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINSCHEDULETABLE }
         * 
         * 
         */
        public List<LINSCHEDULETABLE> getLINSCHEDULETABLE() {
            if (linscheduletable == null) {
                linscheduletable = new ArrayList<LINSCHEDULETABLE>();
            }
            return this.linscheduletable;
        }

    }

}
