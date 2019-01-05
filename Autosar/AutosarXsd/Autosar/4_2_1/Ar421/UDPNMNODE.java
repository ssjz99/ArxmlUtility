//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Udp specific NM Node attributes.
 * 
 * <p>UDP-NM-NODE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="UDP-NM-NODE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-NODE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}UDP-NM-NODE"/>
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
@XmlType(name = "UDP-NM-NODE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "controllerref",
    "nmcoordcluster",
    "nmcoordinatorrole",
    "nmifecuref",
    "nmnodeid",
    "nmpassivemodeenabled",
    "rxnmpdurefs",
    "txnmpdurefs",
    "variationpoint",
    "nmmsgcycleoffset"
})
public class UDPNMNODE {

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
    @XmlElement(name = "CONTROLLER-REF")
    protected Ar421.FLEXRAYNMNODE.CONTROLLERREF controllerref;
    @XmlElement(name = "NM-COORD-CLUSTER")
    protected POSITIVEINTEGER nmcoordcluster;
    @XmlElement(name = "NM-COORDINATOR-ROLE")
    protected NMCOORDINATORROLEENUM nmcoordinatorrole;
    @XmlElement(name = "NM-IF-ECU-REF")
    protected Ar421.FLEXRAYNMNODE.NMIFECUREF nmifecuref;
    @XmlElement(name = "NM-NODE-ID")
    protected INTEGER nmnodeid;
    @XmlElement(name = "NM-PASSIVE-MODE-ENABLED")
    protected BOOLEAN nmpassivemodeenabled;
    @XmlElement(name = "RX-NM-PDU-REFS")
    protected Ar421.FLEXRAYNMNODE.RXNMPDUREFS rxnmpdurefs;
    @XmlElement(name = "TX-NM-PDU-REFS")
    protected Ar421.FLEXRAYNMNODE.TXNMPDUREFS txnmpdurefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "NM-MSG-CYCLE-OFFSET")
    protected TIMEVALUE nmmsgcycleoffset;
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
     * ??controllerref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLEXRAYNMNODE.CONTROLLERREF }
     *     
     */
    public Ar421.FLEXRAYNMNODE.CONTROLLERREF getCONTROLLERREF() {
        return controllerref;
    }

    /**
     * ??controllerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLEXRAYNMNODE.CONTROLLERREF }
     *     
     */
    public void setCONTROLLERREF(Ar421.FLEXRAYNMNODE.CONTROLLERREF value) {
        this.controllerref = value;
    }

    /**
     * ??nmcoordcluster?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getNMCOORDCLUSTER() {
        return nmcoordcluster;
    }

    /**
     * ??nmcoordcluster?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setNMCOORDCLUSTER(POSITIVEINTEGER value) {
        this.nmcoordcluster = value;
    }

    /**
     * ??nmcoordinatorrole?????
     * 
     * @return
     *     possible object is
     *     {@link NMCOORDINATORROLEENUM }
     *     
     */
    public NMCOORDINATORROLEENUM getNMCOORDINATORROLE() {
        return nmcoordinatorrole;
    }

    /**
     * ??nmcoordinatorrole?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMCOORDINATORROLEENUM }
     *     
     */
    public void setNMCOORDINATORROLE(NMCOORDINATORROLEENUM value) {
        this.nmcoordinatorrole = value;
    }

    /**
     * ??nmifecuref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLEXRAYNMNODE.NMIFECUREF }
     *     
     */
    public Ar421.FLEXRAYNMNODE.NMIFECUREF getNMIFECUREF() {
        return nmifecuref;
    }

    /**
     * ??nmifecuref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLEXRAYNMNODE.NMIFECUREF }
     *     
     */
    public void setNMIFECUREF(Ar421.FLEXRAYNMNODE.NMIFECUREF value) {
        this.nmifecuref = value;
    }

    /**
     * ??nmnodeid?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getNMNODEID() {
        return nmnodeid;
    }

    /**
     * ??nmnodeid?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setNMNODEID(INTEGER value) {
        this.nmnodeid = value;
    }

    /**
     * ??nmpassivemodeenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMPASSIVEMODEENABLED() {
        return nmpassivemodeenabled;
    }

    /**
     * ??nmpassivemodeenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMPASSIVEMODEENABLED(BOOLEAN value) {
        this.nmpassivemodeenabled = value;
    }

    /**
     * ??rxnmpdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLEXRAYNMNODE.RXNMPDUREFS }
     *     
     */
    public Ar421.FLEXRAYNMNODE.RXNMPDUREFS getRXNMPDUREFS() {
        return rxnmpdurefs;
    }

    /**
     * ??rxnmpdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLEXRAYNMNODE.RXNMPDUREFS }
     *     
     */
    public void setRXNMPDUREFS(Ar421.FLEXRAYNMNODE.RXNMPDUREFS value) {
        this.rxnmpdurefs = value;
    }

    /**
     * ??txnmpdurefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLEXRAYNMNODE.TXNMPDUREFS }
     *     
     */
    public Ar421.FLEXRAYNMNODE.TXNMPDUREFS getTXNMPDUREFS() {
        return txnmpdurefs;
    }

    /**
     * ??txnmpdurefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLEXRAYNMNODE.TXNMPDUREFS }
     *     
     */
    public void setTXNMPDUREFS(Ar421.FLEXRAYNMNODE.TXNMPDUREFS value) {
        this.txnmpdurefs = value;
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
     * ??nmmsgcycleoffset?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMMSGCYCLEOFFSET() {
        return nmmsgcycleoffset;
    }

    /**
     * ??nmmsgcycleoffset?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMMSGCYCLEOFFSET(TIMEVALUE value) {
        this.nmmsgcycleoffset = value;
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

}
