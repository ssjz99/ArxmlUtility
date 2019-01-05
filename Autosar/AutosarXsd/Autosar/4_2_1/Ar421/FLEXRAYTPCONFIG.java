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
 * This element defines exactly one FlexRay ISO TP Configuration. 
 * 
 * One FlexRayTpConfig element shall be created for each FlexRay Network in the System that uses FlexRay Iso Tp.
 * 
 * <p>FLEXRAY-TP-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-TP-CONFIG">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-TP-CONFIG"/>
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
@XmlType(name = "FLEXRAY-TP-CONFIG", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "communicationclusterref",
    "pdupools",
    "tpaddresss",
    "tpconnections",
    "tpconnectioncontrols",
    "tpecus",
    "tpnodes"
})
public class FLEXRAYTPCONFIG {

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
    @XmlElement(name = "PDU-POOLS")
    protected FLEXRAYTPCONFIG.PDUPOOLS pdupools;
    @XmlElement(name = "TP-ADDRESSS")
    protected FLEXRAYTPCONFIG.TPADDRESSS tpaddresss;
    @XmlElement(name = "TP-CONNECTIONS")
    protected FLEXRAYTPCONFIG.TPCONNECTIONS tpconnections;
    @XmlElement(name = "TP-CONNECTION-CONTROLS")
    protected FLEXRAYTPCONFIG.TPCONNECTIONCONTROLS tpconnectioncontrols;
    @XmlElement(name = "TP-ECUS")
    protected FLEXRAYTPCONFIG.TPECUS tpecus;
    @XmlElement(name = "TP-NODES")
    protected FLEXRAYTPCONFIG.TPNODES tpnodes;
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
     * ??pdupools?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONFIG.PDUPOOLS }
     *     
     */
    public FLEXRAYTPCONFIG.PDUPOOLS getPDUPOOLS() {
        return pdupools;
    }

    /**
     * ??pdupools?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONFIG.PDUPOOLS }
     *     
     */
    public void setPDUPOOLS(FLEXRAYTPCONFIG.PDUPOOLS value) {
        this.pdupools = value;
    }

    /**
     * ??tpaddresss?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONFIG.TPADDRESSS }
     *     
     */
    public FLEXRAYTPCONFIG.TPADDRESSS getTPADDRESSS() {
        return tpaddresss;
    }

    /**
     * ??tpaddresss?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONFIG.TPADDRESSS }
     *     
     */
    public void setTPADDRESSS(FLEXRAYTPCONFIG.TPADDRESSS value) {
        this.tpaddresss = value;
    }

    /**
     * ??tpconnections?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONFIG.TPCONNECTIONS }
     *     
     */
    public FLEXRAYTPCONFIG.TPCONNECTIONS getTPCONNECTIONS() {
        return tpconnections;
    }

    /**
     * ??tpconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONFIG.TPCONNECTIONS }
     *     
     */
    public void setTPCONNECTIONS(FLEXRAYTPCONFIG.TPCONNECTIONS value) {
        this.tpconnections = value;
    }

    /**
     * ??tpconnectioncontrols?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONFIG.TPCONNECTIONCONTROLS }
     *     
     */
    public FLEXRAYTPCONFIG.TPCONNECTIONCONTROLS getTPCONNECTIONCONTROLS() {
        return tpconnectioncontrols;
    }

    /**
     * ??tpconnectioncontrols?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONFIG.TPCONNECTIONCONTROLS }
     *     
     */
    public void setTPCONNECTIONCONTROLS(FLEXRAYTPCONFIG.TPCONNECTIONCONTROLS value) {
        this.tpconnectioncontrols = value;
    }

    /**
     * ??tpecus?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONFIG.TPECUS }
     *     
     */
    public FLEXRAYTPCONFIG.TPECUS getTPECUS() {
        return tpecus;
    }

    /**
     * ??tpecus?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONFIG.TPECUS }
     *     
     */
    public void setTPECUS(FLEXRAYTPCONFIG.TPECUS value) {
        this.tpecus = value;
    }

    /**
     * ??tpnodes?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYTPCONFIG.TPNODES }
     *     
     */
    public FLEXRAYTPCONFIG.TPNODES getTPNODES() {
        return tpnodes;
    }

    /**
     * ??tpnodes?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYTPCONFIG.TPNODES }
     *     
     */
    public void setTPNODES(FLEXRAYTPCONFIG.TPNODES value) {
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
     *         &lt;element name="FLEXRAY-TP-PDU-POOL" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-PDU-POOL"/>
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
        "flexraytppdupool"
    })
    public static class PDUPOOLS {

        @XmlElement(name = "FLEXRAY-TP-PDU-POOL")
        protected List<FLEXRAYTPPDUPOOL> flexraytppdupool;

        /**
         * Gets the value of the flexraytppdupool property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexraytppdupool property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYTPPDUPOOL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYTPPDUPOOL }
         * 
         * 
         */
        public List<FLEXRAYTPPDUPOOL> getFLEXRAYTPPDUPOOL() {
            if (flexraytppdupool == null) {
                flexraytppdupool = new ArrayList<FLEXRAYTPPDUPOOL>();
            }
            return this.flexraytppdupool;
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
     *         &lt;element name="TP-ADDRESS" type="{http://autosar.org/schema/r4.0}TP-ADDRESS"/>
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
        "tpaddress"
    })
    public static class TPADDRESSS {

        @XmlElement(name = "TP-ADDRESS")
        protected List<TPADDRESS> tpaddress;

        /**
         * Gets the value of the tpaddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tpaddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTPADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TPADDRESS }
         * 
         * 
         */
        public List<TPADDRESS> getTPADDRESS() {
            if (tpaddress == null) {
                tpaddress = new ArrayList<TPADDRESS>();
            }
            return this.tpaddress;
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
     *         &lt;element name="FLEXRAY-TP-CONNECTION-CONTROL" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-CONNECTION-CONTROL"/>
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
        "flexraytpconnectioncontrol"
    })
    public static class TPCONNECTIONCONTROLS {

        @XmlElement(name = "FLEXRAY-TP-CONNECTION-CONTROL")
        protected List<FLEXRAYTPCONNECTIONCONTROL> flexraytpconnectioncontrol;

        /**
         * Gets the value of the flexraytpconnectioncontrol property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexraytpconnectioncontrol property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYTPCONNECTIONCONTROL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYTPCONNECTIONCONTROL }
         * 
         * 
         */
        public List<FLEXRAYTPCONNECTIONCONTROL> getFLEXRAYTPCONNECTIONCONTROL() {
            if (flexraytpconnectioncontrol == null) {
                flexraytpconnectioncontrol = new ArrayList<FLEXRAYTPCONNECTIONCONTROL>();
            }
            return this.flexraytpconnectioncontrol;
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
     *         &lt;element name="FLEXRAY-TP-CONNECTION" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-CONNECTION"/>
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
        "flexraytpconnection"
    })
    public static class TPCONNECTIONS {

        @XmlElement(name = "FLEXRAY-TP-CONNECTION")
        protected List<FLEXRAYTPCONNECTION> flexraytpconnection;

        /**
         * Gets the value of the flexraytpconnection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexraytpconnection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYTPCONNECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYTPCONNECTION }
         * 
         * 
         */
        public List<FLEXRAYTPCONNECTION> getFLEXRAYTPCONNECTION() {
            if (flexraytpconnection == null) {
                flexraytpconnection = new ArrayList<FLEXRAYTPCONNECTION>();
            }
            return this.flexraytpconnection;
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
     *         &lt;element name="FLEXRAY-TP-ECU" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-ECU"/>
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
        "flexraytpecu"
    })
    public static class TPECUS {

        @XmlElement(name = "FLEXRAY-TP-ECU")
        protected List<FLEXRAYTPECU> flexraytpecu;

        /**
         * Gets the value of the flexraytpecu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexraytpecu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYTPECU().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYTPECU }
         * 
         * 
         */
        public List<FLEXRAYTPECU> getFLEXRAYTPECU() {
            if (flexraytpecu == null) {
                flexraytpecu = new ArrayList<FLEXRAYTPECU>();
            }
            return this.flexraytpecu;
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
     *         &lt;element name="FLEXRAY-TP-NODE" type="{http://autosar.org/schema/r4.0}FLEXRAY-TP-NODE"/>
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
        "flexraytpnode"
    })
    public static class TPNODES {

        @XmlElement(name = "FLEXRAY-TP-NODE")
        protected List<FLEXRAYTPNODE> flexraytpnode;

        /**
         * Gets the value of the flexraytpnode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexraytpnode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFLEXRAYTPNODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FLEXRAYTPNODE }
         * 
         * 
         */
        public List<FLEXRAYTPNODE> getFLEXRAYTPNODE() {
            if (flexraytpnode == null) {
                flexraytpnode = new ArrayList<FLEXRAYTPNODE>();
            }
            return this.flexraytpnode;
        }

    }

}
