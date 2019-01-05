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
 * This element defines exactly one CAN TP Configuration. 
 * 
 * One CanTpConfig element shall be created for each CAN Network in the System.
 * 
 * <p>CAN-TP-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CAN-TP-CONFIG">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TP-CONFIG"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CAN-TP-CONFIG"/>
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
@XmlType(name = "CAN-TP-CONFIG", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "communicationclusterref",
    "tpaddresss",
    "tpchannels",
    "tpconnections",
    "tpecus",
    "tpnodes"
})
public class CANTPCONFIG {

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
    @XmlElement(name = "COMMUNICATION-CLUSTER-REF")
    protected Ar421.LINTPCONFIG.COMMUNICATIONCLUSTERREF communicationclusterref;
    @XmlElement(name = "TP-ADDRESSS")
    protected CANTPCONFIG.TPADDRESSS tpaddresss;
    @XmlElement(name = "TP-CHANNELS")
    protected CANTPCONFIG.TPCHANNELS tpchannels;
    @XmlElement(name = "TP-CONNECTIONS")
    protected CANTPCONFIG.TPCONNECTIONS tpconnections;
    @XmlElement(name = "TP-ECUS")
    protected CANTPCONFIG.TPECUS tpecus;
    @XmlElement(name = "TP-NODES")
    protected CANTPCONFIG.TPNODES tpnodes;
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
     * ??communicationclusterref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.LINTPCONFIG.COMMUNICATIONCLUSTERREF }
     *     
     */
    public Ar421.LINTPCONFIG.COMMUNICATIONCLUSTERREF getCOMMUNICATIONCLUSTERREF() {
        return communicationclusterref;
    }

    /**
     * ??communicationclusterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.LINTPCONFIG.COMMUNICATIONCLUSTERREF }
     *     
     */
    public void setCOMMUNICATIONCLUSTERREF(Ar421.LINTPCONFIG.COMMUNICATIONCLUSTERREF value) {
        this.communicationclusterref = value;
    }

    /**
     * ??tpaddresss?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONFIG.TPADDRESSS }
     *     
     */
    public CANTPCONFIG.TPADDRESSS getTPADDRESSS() {
        return tpaddresss;
    }

    /**
     * ??tpaddresss?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONFIG.TPADDRESSS }
     *     
     */
    public void setTPADDRESSS(CANTPCONFIG.TPADDRESSS value) {
        this.tpaddresss = value;
    }

    /**
     * ??tpchannels?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONFIG.TPCHANNELS }
     *     
     */
    public CANTPCONFIG.TPCHANNELS getTPCHANNELS() {
        return tpchannels;
    }

    /**
     * ??tpchannels?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONFIG.TPCHANNELS }
     *     
     */
    public void setTPCHANNELS(CANTPCONFIG.TPCHANNELS value) {
        this.tpchannels = value;
    }

    /**
     * ??tpconnections?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONFIG.TPCONNECTIONS }
     *     
     */
    public CANTPCONFIG.TPCONNECTIONS getTPCONNECTIONS() {
        return tpconnections;
    }

    /**
     * ??tpconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONFIG.TPCONNECTIONS }
     *     
     */
    public void setTPCONNECTIONS(CANTPCONFIG.TPCONNECTIONS value) {
        this.tpconnections = value;
    }

    /**
     * ??tpecus?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONFIG.TPECUS }
     *     
     */
    public CANTPCONFIG.TPECUS getTPECUS() {
        return tpecus;
    }

    /**
     * ??tpecus?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONFIG.TPECUS }
     *     
     */
    public void setTPECUS(CANTPCONFIG.TPECUS value) {
        this.tpecus = value;
    }

    /**
     * ??tpnodes?????
     * 
     * @return
     *     possible object is
     *     {@link CANTPCONFIG.TPNODES }
     *     
     */
    public CANTPCONFIG.TPNODES getTPNODES() {
        return tpnodes;
    }

    /**
     * ??tpnodes?????
     * 
     * @param value
     *     allowed object is
     *     {@link CANTPCONFIG.TPNODES }
     *     
     */
    public void setTPNODES(CANTPCONFIG.TPNODES value) {
        this.tpnodes = value;
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
     *         &lt;element name="CAN-TP-ADDRESS" type="{http://autosar.org/schema/r4.0}CAN-TP-ADDRESS"/>
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
        "cantpaddress"
    })
    public static class TPADDRESSS {

        @XmlElement(name = "CAN-TP-ADDRESS")
        protected List<CANTPADDRESS> cantpaddress;

        /**
         * Gets the value of the cantpaddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cantpaddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANTPADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANTPADDRESS }
         * 
         * 
         */
        public List<CANTPADDRESS> getCANTPADDRESS() {
            if (cantpaddress == null) {
                cantpaddress = new ArrayList<CANTPADDRESS>();
            }
            return this.cantpaddress;
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
     *         &lt;element name="CAN-TP-CHANNEL" type="{http://autosar.org/schema/r4.0}CAN-TP-CHANNEL"/>
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
        "cantpchannel"
    })
    public static class TPCHANNELS {

        @XmlElement(name = "CAN-TP-CHANNEL")
        protected List<CANTPCHANNEL> cantpchannel;

        /**
         * Gets the value of the cantpchannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cantpchannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANTPCHANNEL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANTPCHANNEL }
         * 
         * 
         */
        public List<CANTPCHANNEL> getCANTPCHANNEL() {
            if (cantpchannel == null) {
                cantpchannel = new ArrayList<CANTPCHANNEL>();
            }
            return this.cantpchannel;
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
     *         &lt;element name="CAN-TP-CONNECTION" type="{http://autosar.org/schema/r4.0}CAN-TP-CONNECTION"/>
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
        "cantpconnection"
    })
    public static class TPCONNECTIONS {

        @XmlElement(name = "CAN-TP-CONNECTION")
        protected List<CANTPCONNECTION> cantpconnection;

        /**
         * Gets the value of the cantpconnection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cantpconnection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANTPCONNECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANTPCONNECTION }
         * 
         * 
         */
        public List<CANTPCONNECTION> getCANTPCONNECTION() {
            if (cantpconnection == null) {
                cantpconnection = new ArrayList<CANTPCONNECTION>();
            }
            return this.cantpconnection;
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
     *         &lt;element name="CAN-TP-ECU" type="{http://autosar.org/schema/r4.0}CAN-TP-ECU"/>
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
        "cantpecu"
    })
    public static class TPECUS {

        @XmlElement(name = "CAN-TP-ECU")
        protected List<CANTPECU> cantpecu;

        /**
         * Gets the value of the cantpecu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cantpecu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANTPECU().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANTPECU }
         * 
         * 
         */
        public List<CANTPECU> getCANTPECU() {
            if (cantpecu == null) {
                cantpecu = new ArrayList<CANTPECU>();
            }
            return this.cantpecu;
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
     *         &lt;element name="CAN-TP-NODE" type="{http://autosar.org/schema/r4.0}CAN-TP-NODE"/>
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
        "cantpnode"
    })
    public static class TPNODES {

        @XmlElement(name = "CAN-TP-NODE")
        protected List<CANTPNODE> cantpnode;

        /**
         * Gets the value of the cantpnode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cantpnode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANTPNODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANTPNODE }
         * 
         * 
         */
        public List<CANTPNODE> getCANTPNODE() {
            if (cantpnode == null) {
                cantpnode = new ArrayList<CANTPNODE>();
            }
            return this.cantpnode;
        }

    }

}
