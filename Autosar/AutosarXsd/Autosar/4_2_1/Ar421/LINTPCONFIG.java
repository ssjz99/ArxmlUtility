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
 * This element defines exactly one Lin TP Configuration. 
 * 
 * One LinTpConfig element shall be created for each Lin Network in the System.
 * 
 * <p>LIN-TP-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-TP-CONFIG">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-TP-CONFIG"/>
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
@XmlType(name = "LIN-TP-CONFIG", propOrder = {
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
    "tpconnections",
    "tpnodes"
})
public class LINTPCONFIG {

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
    protected LINTPCONFIG.COMMUNICATIONCLUSTERREF communicationclusterref;
    @XmlElement(name = "TP-ADDRESSS")
    protected LINTPCONFIG.TPADDRESSS tpaddresss;
    @XmlElement(name = "TP-CONNECTIONS")
    protected LINTPCONFIG.TPCONNECTIONS tpconnections;
    @XmlElement(name = "TP-NODES")
    protected LINTPCONFIG.TPNODES tpnodes;
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
     *     {@link LINTPCONFIG.COMMUNICATIONCLUSTERREF }
     *     
     */
    public LINTPCONFIG.COMMUNICATIONCLUSTERREF getCOMMUNICATIONCLUSTERREF() {
        return communicationclusterref;
    }

    /**
     * ??communicationclusterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONFIG.COMMUNICATIONCLUSTERREF }
     *     
     */
    public void setCOMMUNICATIONCLUSTERREF(LINTPCONFIG.COMMUNICATIONCLUSTERREF value) {
        this.communicationclusterref = value;
    }

    /**
     * ??tpaddresss?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONFIG.TPADDRESSS }
     *     
     */
    public LINTPCONFIG.TPADDRESSS getTPADDRESSS() {
        return tpaddresss;
    }

    /**
     * ??tpaddresss?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONFIG.TPADDRESSS }
     *     
     */
    public void setTPADDRESSS(LINTPCONFIG.TPADDRESSS value) {
        this.tpaddresss = value;
    }

    /**
     * ??tpconnections?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONFIG.TPCONNECTIONS }
     *     
     */
    public LINTPCONFIG.TPCONNECTIONS getTPCONNECTIONS() {
        return tpconnections;
    }

    /**
     * ??tpconnections?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONFIG.TPCONNECTIONS }
     *     
     */
    public void setTPCONNECTIONS(LINTPCONFIG.TPCONNECTIONS value) {
        this.tpconnections = value;
    }

    /**
     * ??tpnodes?????
     * 
     * @return
     *     possible object is
     *     {@link LINTPCONFIG.TPNODES }
     *     
     */
    public LINTPCONFIG.TPNODES getTPNODES() {
        return tpnodes;
    }

    /**
     * ??tpnodes?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINTPCONFIG.TPNODES }
     *     
     */
    public void setTPNODES(LINTPCONFIG.TPNODES value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class COMMUNICATIONCLUSTERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMMUNICATIONCLUSTERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
         *     
         */
        public COMMUNICATIONCLUSTERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
         *     
         */
        public void setDEST(COMMUNICATIONCLUSTERSUBTYPESENUM value) {
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
     *         &lt;element name="LIN-TP-CONNECTION" type="{http://autosar.org/schema/r4.0}LIN-TP-CONNECTION"/>
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
        "lintpconnection"
    })
    public static class TPCONNECTIONS {

        @XmlElement(name = "LIN-TP-CONNECTION")
        protected List<LINTPCONNECTION> lintpconnection;

        /**
         * Gets the value of the lintpconnection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lintpconnection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINTPCONNECTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINTPCONNECTION }
         * 
         * 
         */
        public List<LINTPCONNECTION> getLINTPCONNECTION() {
            if (lintpconnection == null) {
                lintpconnection = new ArrayList<LINTPCONNECTION>();
            }
            return this.lintpconnection;
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
     *         &lt;element name="LIN-TP-NODE" type="{http://autosar.org/schema/r4.0}LIN-TP-NODE"/>
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
        "lintpnode"
    })
    public static class TPNODES {

        @XmlElement(name = "LIN-TP-NODE")
        protected List<LINTPNODE> lintpnode;

        /**
         * Gets the value of the lintpnode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lintpnode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINTPNODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LINTPNODE }
         * 
         * 
         */
        public List<LINTPNODE> getLINTPNODE() {
            if (lintpnode == null) {
                lintpnode = new ArrayList<LINTPNODE>();
            }
            return this.lintpnode;
        }

    }

}
