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
 * Represents the IPdus handled by Com. The ISignalIPdu assembled and disassembled in AUTOSAR COM consists of one or more signals.
 * In case no multiplexing is performed this IPdu is routed to/from the Interface Layer.
 * 
 * A maximum of one dynamic length signal per IPdu is allowed.
 * 
 * <p>I-SIGNAL-I-PDU complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="I-SIGNAL-I-PDU">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU"/>
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
@XmlType(name = "I-SIGNAL-I-PDU", propOrder = {
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
    "ipdutimingspecifications",
    "isignaltopdumappings",
    "pducounters",
    "pdureplications",
    "unusedbitpattern"
})
public class ISIGNALIPDU {

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
    @XmlElement(name = "I-PDU-TIMING-SPECIFICATIONS")
    protected ISIGNALIPDU.IPDUTIMINGSPECIFICATIONS ipdutimingspecifications;
    @XmlElement(name = "I-SIGNAL-TO-PDU-MAPPINGS")
    protected ISIGNALIPDU.ISIGNALTOPDUMAPPINGS isignaltopdumappings;
    @XmlElement(name = "PDU-COUNTERS")
    protected ISIGNALIPDU.PDUCOUNTERS pducounters;
    @XmlElement(name = "PDU-REPLICATIONS")
    protected ISIGNALIPDU.PDUREPLICATIONS pdureplications;
    @XmlElement(name = "UNUSED-BIT-PATTERN")
    protected INTEGER unusedbitpattern;
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
     * ??ipdutimingspecifications?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALIPDU.IPDUTIMINGSPECIFICATIONS }
     *     
     */
    public ISIGNALIPDU.IPDUTIMINGSPECIFICATIONS getIPDUTIMINGSPECIFICATIONS() {
        return ipdutimingspecifications;
    }

    /**
     * ??ipdutimingspecifications?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALIPDU.IPDUTIMINGSPECIFICATIONS }
     *     
     */
    public void setIPDUTIMINGSPECIFICATIONS(ISIGNALIPDU.IPDUTIMINGSPECIFICATIONS value) {
        this.ipdutimingspecifications = value;
    }

    /**
     * ??isignaltopdumappings?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALIPDU.ISIGNALTOPDUMAPPINGS }
     *     
     */
    public ISIGNALIPDU.ISIGNALTOPDUMAPPINGS getISIGNALTOPDUMAPPINGS() {
        return isignaltopdumappings;
    }

    /**
     * ??isignaltopdumappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALIPDU.ISIGNALTOPDUMAPPINGS }
     *     
     */
    public void setISIGNALTOPDUMAPPINGS(ISIGNALIPDU.ISIGNALTOPDUMAPPINGS value) {
        this.isignaltopdumappings = value;
    }

    /**
     * ??pducounters?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALIPDU.PDUCOUNTERS }
     *     
     */
    public ISIGNALIPDU.PDUCOUNTERS getPDUCOUNTERS() {
        return pducounters;
    }

    /**
     * ??pducounters?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALIPDU.PDUCOUNTERS }
     *     
     */
    public void setPDUCOUNTERS(ISIGNALIPDU.PDUCOUNTERS value) {
        this.pducounters = value;
    }

    /**
     * ??pdureplications?????
     * 
     * @return
     *     possible object is
     *     {@link ISIGNALIPDU.PDUREPLICATIONS }
     *     
     */
    public ISIGNALIPDU.PDUREPLICATIONS getPDUREPLICATIONS() {
        return pdureplications;
    }

    /**
     * ??pdureplications?????
     * 
     * @param value
     *     allowed object is
     *     {@link ISIGNALIPDU.PDUREPLICATIONS }
     *     
     */
    public void setPDUREPLICATIONS(ISIGNALIPDU.PDUREPLICATIONS value) {
        this.pdureplications = value;
    }

    /**
     * ??unusedbitpattern?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getUNUSEDBITPATTERN() {
        return unusedbitpattern;
    }

    /**
     * ??unusedbitpattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setUNUSEDBITPATTERN(INTEGER value) {
        this.unusedbitpattern = value;
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
     *         &lt;element name="I-PDU-TIMING" type="{http://autosar.org/schema/r4.0}I-PDU-TIMING"/>
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
        "ipdutiming"
    })
    public static class IPDUTIMINGSPECIFICATIONS {

        @XmlElement(name = "I-PDU-TIMING")
        protected List<IPDUTIMING> ipdutiming;

        /**
         * Gets the value of the ipdutiming property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ipdutiming property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIPDUTIMING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IPDUTIMING }
         * 
         * 
         */
        public List<IPDUTIMING> getIPDUTIMING() {
            if (ipdutiming == null) {
                ipdutiming = new ArrayList<IPDUTIMING>();
            }
            return this.ipdutiming;
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
     *         &lt;element name="I-SIGNAL-TO-I-PDU-MAPPING" type="{http://autosar.org/schema/r4.0}I-SIGNAL-TO-I-PDU-MAPPING"/>
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
        "isignaltoipdumapping"
    })
    public static class ISIGNALTOPDUMAPPINGS {

        @XmlElement(name = "I-SIGNAL-TO-I-PDU-MAPPING")
        protected List<ISIGNALTOIPDUMAPPING> isignaltoipdumapping;

        /**
         * Gets the value of the isignaltoipdumapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the isignaltoipdumapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISIGNALTOIPDUMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ISIGNALTOIPDUMAPPING }
         * 
         * 
         */
        public List<ISIGNALTOIPDUMAPPING> getISIGNALTOIPDUMAPPING() {
            if (isignaltoipdumapping == null) {
                isignaltoipdumapping = new ArrayList<ISIGNALTOIPDUMAPPING>();
            }
            return this.isignaltoipdumapping;
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
     *         &lt;element name="SIGNAL-I-PDU-COUNTER" type="{http://autosar.org/schema/r4.0}SIGNAL-I-PDU-COUNTER"/>
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
        "signalipducounter"
    })
    public static class PDUCOUNTERS {

        @XmlElement(name = "SIGNAL-I-PDU-COUNTER")
        protected List<SIGNALIPDUCOUNTER> signalipducounter;

        /**
         * Gets the value of the signalipducounter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signalipducounter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSIGNALIPDUCOUNTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SIGNALIPDUCOUNTER }
         * 
         * 
         */
        public List<SIGNALIPDUCOUNTER> getSIGNALIPDUCOUNTER() {
            if (signalipducounter == null) {
                signalipducounter = new ArrayList<SIGNALIPDUCOUNTER>();
            }
            return this.signalipducounter;
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
     *         &lt;element name="SIGNAL-I-PDU-REPLICATION" type="{http://autosar.org/schema/r4.0}SIGNAL-I-PDU-REPLICATION"/>
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
        "signalipdureplication"
    })
    public static class PDUREPLICATIONS {

        @XmlElement(name = "SIGNAL-I-PDU-REPLICATION")
        protected List<SIGNALIPDUREPLICATION> signalipdureplication;

        /**
         * Gets the value of the signalipdureplication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signalipdureplication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSIGNALIPDUREPLICATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SIGNALIPDUREPLICATION }
         * 
         * 
         */
        public List<SIGNALIPDUREPLICATION> getSIGNALIPDUREPLICATION() {
            if (signalipdureplication == null) {
                signalipdureplication = new ArrayList<SIGNALIPDUREPLICATION>();
            }
            return this.signalipdureplication;
        }

    }

}
