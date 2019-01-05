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
 * Contains the all configuration elements for AUTOSAR Nm.
 * 
 * <p>NM-CONFIG complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NM-CONFIG">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-CONFIG"/>
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
@XmlType(name = "NM-CONFIG", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "nmclusters",
    "nmclustercouplings",
    "nmifecus"
})
public class NMCONFIG {

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
    @XmlElement(name = "NM-CLUSTERS")
    protected NMCONFIG.NMCLUSTERS nmclusters;
    @XmlElement(name = "NM-CLUSTER-COUPLINGS")
    protected NMCONFIG.NMCLUSTERCOUPLINGS nmclustercouplings;
    @XmlElement(name = "NM-IF-ECUS")
    protected NMCONFIG.NMIFECUS nmifecus;
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
     * ??nmclusters?????
     * 
     * @return
     *     possible object is
     *     {@link NMCONFIG.NMCLUSTERS }
     *     
     */
    public NMCONFIG.NMCLUSTERS getNMCLUSTERS() {
        return nmclusters;
    }

    /**
     * ??nmclusters?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMCONFIG.NMCLUSTERS }
     *     
     */
    public void setNMCLUSTERS(NMCONFIG.NMCLUSTERS value) {
        this.nmclusters = value;
    }

    /**
     * ??nmclustercouplings?????
     * 
     * @return
     *     possible object is
     *     {@link NMCONFIG.NMCLUSTERCOUPLINGS }
     *     
     */
    public NMCONFIG.NMCLUSTERCOUPLINGS getNMCLUSTERCOUPLINGS() {
        return nmclustercouplings;
    }

    /**
     * ??nmclustercouplings?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMCONFIG.NMCLUSTERCOUPLINGS }
     *     
     */
    public void setNMCLUSTERCOUPLINGS(NMCONFIG.NMCLUSTERCOUPLINGS value) {
        this.nmclustercouplings = value;
    }

    /**
     * ??nmifecus?????
     * 
     * @return
     *     possible object is
     *     {@link NMCONFIG.NMIFECUS }
     *     
     */
    public NMCONFIG.NMIFECUS getNMIFECUS() {
        return nmifecus;
    }

    /**
     * ??nmifecus?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMCONFIG.NMIFECUS }
     *     
     */
    public void setNMIFECUS(NMCONFIG.NMIFECUS value) {
        this.nmifecus = value;
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
     *         &lt;element name="CAN-NM-CLUSTER-COUPLING" type="{http://autosar.org/schema/r4.0}CAN-NM-CLUSTER-COUPLING"/>
     *         &lt;element name="FLEXRAY-NM-CLUSTER-COUPLING" type="{http://autosar.org/schema/r4.0}FLEXRAY-NM-CLUSTER-COUPLING"/>
     *         &lt;element name="UDP-NM-CLUSTER-COUPLING" type="{http://autosar.org/schema/r4.0}UDP-NM-CLUSTER-COUPLING"/>
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
        "cannmclustercouplingOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING"
    })
    public static class NMCLUSTERCOUPLINGS {

        @XmlElements({
            @XmlElement(name = "CAN-NM-CLUSTER-COUPLING", type = CANNMCLUSTERCOUPLING.class),
            @XmlElement(name = "FLEXRAY-NM-CLUSTER-COUPLING", type = FLEXRAYNMCLUSTERCOUPLING.class),
            @XmlElement(name = "UDP-NM-CLUSTER-COUPLING", type = UDPNMCLUSTERCOUPLING.class)
        })
        protected List<Object> cannmclustercouplingOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING;

        /**
         * Gets the value of the cannmclustercouplingOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cannmclustercouplingOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANNMCLUSTERCOUPLINGOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANNMCLUSTERCOUPLING }
         * {@link FLEXRAYNMCLUSTERCOUPLING }
         * {@link UDPNMCLUSTERCOUPLING }
         * 
         * 
         */
        public List<Object> getCANNMCLUSTERCOUPLINGOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING() {
            if (cannmclustercouplingOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING == null) {
                cannmclustercouplingOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING = new ArrayList<Object>();
            }
            return this.cannmclustercouplingOrFLEXRAYNMCLUSTERCOUPLINGOrUDPNMCLUSTERCOUPLING;
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
     *         &lt;element name="CAN-NM-CLUSTER" type="{http://autosar.org/schema/r4.0}CAN-NM-CLUSTER"/>
     *         &lt;element name="FLEXRAY-NM-CLUSTER" type="{http://autosar.org/schema/r4.0}FLEXRAY-NM-CLUSTER"/>
     *         &lt;element name="J-1939-NM-CLUSTER" type="{http://autosar.org/schema/r4.0}J-1939-NM-CLUSTER"/>
     *         &lt;element name="UDP-NM-CLUSTER" type="{http://autosar.org/schema/r4.0}UDP-NM-CLUSTER"/>
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
        "cannmclusterOrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER"
    })
    public static class NMCLUSTERS {

        @XmlElements({
            @XmlElement(name = "CAN-NM-CLUSTER", type = CANNMCLUSTER.class),
            @XmlElement(name = "FLEXRAY-NM-CLUSTER", type = FLEXRAYNMCLUSTER.class),
            @XmlElement(name = "J-1939-NM-CLUSTER", type = J1939NMCLUSTER.class),
            @XmlElement(name = "UDP-NM-CLUSTER", type = UDPNMCLUSTER.class)
        })
        protected List<Object> cannmclusterOrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER;

        /**
         * Gets the value of the cannmclusterOrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cannmclusterOrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANNMCLUSTEROrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANNMCLUSTER }
         * {@link FLEXRAYNMCLUSTER }
         * {@link J1939NMCLUSTER }
         * {@link UDPNMCLUSTER }
         * 
         * 
         */
        public List<Object> getCANNMCLUSTEROrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER() {
            if (cannmclusterOrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER == null) {
                cannmclusterOrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER = new ArrayList<Object>();
            }
            return this.cannmclusterOrFLEXRAYNMCLUSTEROrJ1939NMCLUSTER;
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
     *         &lt;element name="NM-ECU" type="{http://autosar.org/schema/r4.0}NM-ECU"/>
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
        "nmecu"
    })
    public static class NMIFECUS {

        @XmlElement(name = "NM-ECU")
        protected List<NMECU> nmecu;

        /**
         * Gets the value of the nmecu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nmecu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNMECU().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NMECU }
         * 
         * 
         */
        public List<NMECU> getNMECU() {
            if (nmecu == null) {
                nmecu = new ArrayList<NMECU>();
            }
            return this.nmecu;
        }

    }

}
