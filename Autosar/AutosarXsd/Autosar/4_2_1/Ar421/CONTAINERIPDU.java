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
 * Allows to collect several IPdus in one ContainerIPdu based on the IPdu.headerId.
 * 
 * <p>CONTAINER-I-PDU complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CONTAINER-I-PDU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FIBEX-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PDU"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-PDU"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CONTAINER-I-PDU"/>
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
@XmlType(name = "CONTAINER-I-PDU", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "length",
    "metadatalength",
    "containedipduprops",
    "containedpdutriggeringrefs",
    "containertimeout",
    "containertrigger",
    "headertype",
    "rxacceptcontainedipdu",
    "thresholdsize"
})
public class CONTAINERIPDU {

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
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "LENGTH")
    protected INTEGER length;
    @XmlElement(name = "META-DATA-LENGTH")
    protected POSITIVEINTEGER metadatalength;
    @XmlElement(name = "CONTAINED-I-PDU-PROPS")
    protected CONTAINEDIPDUPROPS containedipduprops;
    @XmlElement(name = "CONTAINED-PDU-TRIGGERING-REFS")
    protected CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS containedpdutriggeringrefs;
    @XmlElement(name = "CONTAINER-TIMEOUT")
    protected TIMEVALUE containertimeout;
    @XmlElement(name = "CONTAINER-TRIGGER")
    protected CONTAINERIPDUTRIGGERENUM containertrigger;
    @XmlElement(name = "HEADER-TYPE")
    protected CONTAINERIPDUHEADERTYPEENUM headertype;
    @XmlElement(name = "RX-ACCEPT-CONTAINED-I-PDU")
    protected RXACCEPTCONTAINEDIPDUENUM rxacceptcontainedipdu;
    @XmlElement(name = "THRESHOLD-SIZE")
    protected POSITIVEINTEGER thresholdsize;
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
     * ??length?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getLENGTH() {
        return length;
    }

    /**
     * ??length?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setLENGTH(INTEGER value) {
        this.length = value;
    }

    /**
     * ??metadatalength?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMETADATALENGTH() {
        return metadatalength;
    }

    /**
     * ??metadatalength?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMETADATALENGTH(POSITIVEINTEGER value) {
        this.metadatalength = value;
    }

    /**
     * ??containedipduprops?????
     * 
     * @return
     *     possible object is
     *     {@link CONTAINEDIPDUPROPS }
     *     
     */
    public CONTAINEDIPDUPROPS getCONTAINEDIPDUPROPS() {
        return containedipduprops;
    }

    /**
     * ??containedipduprops?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONTAINEDIPDUPROPS }
     *     
     */
    public void setCONTAINEDIPDUPROPS(CONTAINEDIPDUPROPS value) {
        this.containedipduprops = value;
    }

    /**
     * ??containedpdutriggeringrefs?????
     * 
     * @return
     *     possible object is
     *     {@link CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS }
     *     
     */
    public CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS getCONTAINEDPDUTRIGGERINGREFS() {
        return containedpdutriggeringrefs;
    }

    /**
     * ??containedpdutriggeringrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS }
     *     
     */
    public void setCONTAINEDPDUTRIGGERINGREFS(CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS value) {
        this.containedpdutriggeringrefs = value;
    }

    /**
     * ??containertimeout?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getCONTAINERTIMEOUT() {
        return containertimeout;
    }

    /**
     * ??containertimeout?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setCONTAINERTIMEOUT(TIMEVALUE value) {
        this.containertimeout = value;
    }

    /**
     * ??containertrigger?????
     * 
     * @return
     *     possible object is
     *     {@link CONTAINERIPDUTRIGGERENUM }
     *     
     */
    public CONTAINERIPDUTRIGGERENUM getCONTAINERTRIGGER() {
        return containertrigger;
    }

    /**
     * ??containertrigger?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONTAINERIPDUTRIGGERENUM }
     *     
     */
    public void setCONTAINERTRIGGER(CONTAINERIPDUTRIGGERENUM value) {
        this.containertrigger = value;
    }

    /**
     * ??headertype?????
     * 
     * @return
     *     possible object is
     *     {@link CONTAINERIPDUHEADERTYPEENUM }
     *     
     */
    public CONTAINERIPDUHEADERTYPEENUM getHEADERTYPE() {
        return headertype;
    }

    /**
     * ??headertype?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONTAINERIPDUHEADERTYPEENUM }
     *     
     */
    public void setHEADERTYPE(CONTAINERIPDUHEADERTYPEENUM value) {
        this.headertype = value;
    }

    /**
     * ??rxacceptcontainedipdu?????
     * 
     * @return
     *     possible object is
     *     {@link RXACCEPTCONTAINEDIPDUENUM }
     *     
     */
    public RXACCEPTCONTAINEDIPDUENUM getRXACCEPTCONTAINEDIPDU() {
        return rxacceptcontainedipdu;
    }

    /**
     * ??rxacceptcontainedipdu?????
     * 
     * @param value
     *     allowed object is
     *     {@link RXACCEPTCONTAINEDIPDUENUM }
     *     
     */
    public void setRXACCEPTCONTAINEDIPDU(RXACCEPTCONTAINEDIPDUENUM value) {
        this.rxacceptcontainedipdu = value;
    }

    /**
     * ??thresholdsize?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getTHRESHOLDSIZE() {
        return thresholdsize;
    }

    /**
     * ??thresholdsize?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setTHRESHOLDSIZE(POSITIVEINTEGER value) {
        this.thresholdsize = value;
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
     *         &lt;element name="CONTAINED-PDU-TRIGGERING-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING--SUBTYPES-ENUM" />
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
        "containedpdutriggeringref"
    })
    public static class CONTAINEDPDUTRIGGERINGREFS {

        @XmlElement(name = "CONTAINED-PDU-TRIGGERING-REF")
        protected List<CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS.CONTAINEDPDUTRIGGERINGREF> containedpdutriggeringref;

        /**
         * Gets the value of the containedpdutriggeringref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the containedpdutriggeringref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTAINEDPDUTRIGGERINGREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS.CONTAINEDPDUTRIGGERINGREF }
         * 
         * 
         */
        public List<CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS.CONTAINEDPDUTRIGGERINGREF> getCONTAINEDPDUTRIGGERINGREF() {
            if (containedpdutriggeringref == null) {
                containedpdutriggeringref = new ArrayList<CONTAINERIPDU.CONTAINEDPDUTRIGGERINGREFS.CONTAINEDPDUTRIGGERINGREF>();
            }
            return this.containedpdutriggeringref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONTAINEDPDUTRIGGERINGREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected PDUTRIGGERINGSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link PDUTRIGGERINGSUBTYPESENUM }
             *     
             */
            public PDUTRIGGERINGSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link PDUTRIGGERINGSUBTYPESENUM }
             *     
             */
            public void setDEST(PDUTRIGGERINGSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
