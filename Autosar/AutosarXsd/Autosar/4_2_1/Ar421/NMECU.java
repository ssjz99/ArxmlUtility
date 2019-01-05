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
 * ECU on which NM is running.
 * 
 * <p>NM-ECU complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NM-ECU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-ECU"/>
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
@XmlType(name = "NM-ECU", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "busdependentnmecus",
    "busspecificnmecu",
    "ecuinstanceref",
    "nmbussynchronizationenabled",
    "nmcomcontrolenabled",
    "nmcoordinator",
    "nmcycletimemainfunction",
    "nmmultiplechannelsenabled",
    "nmnodedetectionenabled",
    "nmnodeidenabled",
    "nmpassivemodeenabled",
    "nmpdurxindicationenabled",
    "nmremotesleepindenabled",
    "nmrepeatmsgindenabled",
    "nmstatechangeindenabled",
    "nmuserdataenabled",
    "variationpoint"
})
public class NMECU {

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
    @XmlElement(name = "BUS-DEPENDENT-NM-ECUS")
    protected NMECU.BUSDEPENDENTNMECUS busdependentnmecus;
    @XmlElement(name = "BUS-SPECIFIC-NM-ECU")
    protected NMECU.BUSSPECIFICNMECU busspecificnmecu;
    @XmlElement(name = "ECU-INSTANCE-REF")
    protected NMECU.ECUINSTANCEREF ecuinstanceref;
    @XmlElement(name = "NM-BUS-SYNCHRONIZATION-ENABLED")
    protected BOOLEAN nmbussynchronizationenabled;
    @XmlElement(name = "NM-COM-CONTROL-ENABLED")
    protected BOOLEAN nmcomcontrolenabled;
    @XmlElement(name = "NM-COORDINATOR")
    protected NMCOORDINATOR nmcoordinator;
    @XmlElement(name = "NM-CYCLETIME-MAIN-FUNCTION")
    protected TIMEVALUE nmcycletimemainfunction;
    @XmlElement(name = "NM-MULTIPLE-CHANNELS-ENABLED")
    protected BOOLEAN nmmultiplechannelsenabled;
    @XmlElement(name = "NM-NODE-DETECTION-ENABLED")
    protected BOOLEAN nmnodedetectionenabled;
    @XmlElement(name = "NM-NODE-ID-ENABLED")
    protected BOOLEAN nmnodeidenabled;
    @XmlElement(name = "NM-PASSIVE-MODE-ENABLED")
    protected BOOLEAN nmpassivemodeenabled;
    @XmlElement(name = "NM-PDU-RX-INDICATION-ENABLED")
    protected BOOLEAN nmpdurxindicationenabled;
    @XmlElement(name = "NM-REMOTE-SLEEP-IND-ENABLED")
    protected BOOLEAN nmremotesleepindenabled;
    @XmlElement(name = "NM-REPEAT-MSG-IND-ENABLED")
    protected BOOLEAN nmrepeatmsgindenabled;
    @XmlElement(name = "NM-STATE-CHANGE-IND-ENABLED")
    protected BOOLEAN nmstatechangeindenabled;
    @XmlElement(name = "NM-USER-DATA-ENABLED")
    protected BOOLEAN nmuserdataenabled;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??busdependentnmecus?????
     * 
     * @return
     *     possible object is
     *     {@link NMECU.BUSDEPENDENTNMECUS }
     *     
     */
    public NMECU.BUSDEPENDENTNMECUS getBUSDEPENDENTNMECUS() {
        return busdependentnmecus;
    }

    /**
     * ??busdependentnmecus?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMECU.BUSDEPENDENTNMECUS }
     *     
     */
    public void setBUSDEPENDENTNMECUS(NMECU.BUSDEPENDENTNMECUS value) {
        this.busdependentnmecus = value;
    }

    /**
     * ??busspecificnmecu?????
     * 
     * @return
     *     possible object is
     *     {@link NMECU.BUSSPECIFICNMECU }
     *     
     */
    public NMECU.BUSSPECIFICNMECU getBUSSPECIFICNMECU() {
        return busspecificnmecu;
    }

    /**
     * ??busspecificnmecu?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMECU.BUSSPECIFICNMECU }
     *     
     */
    public void setBUSSPECIFICNMECU(NMECU.BUSSPECIFICNMECU value) {
        this.busspecificnmecu = value;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link NMECU.ECUINSTANCEREF }
     *     
     */
    public NMECU.ECUINSTANCEREF getECUINSTANCEREF() {
        return ecuinstanceref;
    }

    /**
     * ??ecuinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMECU.ECUINSTANCEREF }
     *     
     */
    public void setECUINSTANCEREF(NMECU.ECUINSTANCEREF value) {
        this.ecuinstanceref = value;
    }

    /**
     * ??nmbussynchronizationenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMBUSSYNCHRONIZATIONENABLED() {
        return nmbussynchronizationenabled;
    }

    /**
     * ??nmbussynchronizationenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMBUSSYNCHRONIZATIONENABLED(BOOLEAN value) {
        this.nmbussynchronizationenabled = value;
    }

    /**
     * ??nmcomcontrolenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCOMCONTROLENABLED() {
        return nmcomcontrolenabled;
    }

    /**
     * ??nmcomcontrolenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCOMCONTROLENABLED(BOOLEAN value) {
        this.nmcomcontrolenabled = value;
    }

    /**
     * ??nmcoordinator?????
     * 
     * @return
     *     possible object is
     *     {@link NMCOORDINATOR }
     *     
     */
    public NMCOORDINATOR getNMCOORDINATOR() {
        return nmcoordinator;
    }

    /**
     * ??nmcoordinator?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMCOORDINATOR }
     *     
     */
    public void setNMCOORDINATOR(NMCOORDINATOR value) {
        this.nmcoordinator = value;
    }

    /**
     * ??nmcycletimemainfunction?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMCYCLETIMEMAINFUNCTION() {
        return nmcycletimemainfunction;
    }

    /**
     * ??nmcycletimemainfunction?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMCYCLETIMEMAINFUNCTION(TIMEVALUE value) {
        this.nmcycletimemainfunction = value;
    }

    /**
     * ??nmmultiplechannelsenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMMULTIPLECHANNELSENABLED() {
        return nmmultiplechannelsenabled;
    }

    /**
     * ??nmmultiplechannelsenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMMULTIPLECHANNELSENABLED(BOOLEAN value) {
        this.nmmultiplechannelsenabled = value;
    }

    /**
     * ??nmnodedetectionenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMNODEDETECTIONENABLED() {
        return nmnodedetectionenabled;
    }

    /**
     * ??nmnodedetectionenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMNODEDETECTIONENABLED(BOOLEAN value) {
        this.nmnodedetectionenabled = value;
    }

    /**
     * ??nmnodeidenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMNODEIDENABLED() {
        return nmnodeidenabled;
    }

    /**
     * ??nmnodeidenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMNODEIDENABLED(BOOLEAN value) {
        this.nmnodeidenabled = value;
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
     * ??nmpdurxindicationenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMPDURXINDICATIONENABLED() {
        return nmpdurxindicationenabled;
    }

    /**
     * ??nmpdurxindicationenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMPDURXINDICATIONENABLED(BOOLEAN value) {
        this.nmpdurxindicationenabled = value;
    }

    /**
     * ??nmremotesleepindenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMREMOTESLEEPINDENABLED() {
        return nmremotesleepindenabled;
    }

    /**
     * ??nmremotesleepindenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMREMOTESLEEPINDENABLED(BOOLEAN value) {
        this.nmremotesleepindenabled = value;
    }

    /**
     * ??nmrepeatmsgindenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMREPEATMSGINDENABLED() {
        return nmrepeatmsgindenabled;
    }

    /**
     * ??nmrepeatmsgindenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMREPEATMSGINDENABLED(BOOLEAN value) {
        this.nmrepeatmsgindenabled = value;
    }

    /**
     * ??nmstatechangeindenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMSTATECHANGEINDENABLED() {
        return nmstatechangeindenabled;
    }

    /**
     * ??nmstatechangeindenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMSTATECHANGEINDENABLED(BOOLEAN value) {
        this.nmstatechangeindenabled = value;
    }

    /**
     * ??nmuserdataenabled?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMUSERDATAENABLED() {
        return nmuserdataenabled;
    }

    /**
     * ??nmuserdataenabled?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMUSERDATAENABLED(BOOLEAN value) {
        this.nmuserdataenabled = value;
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
     *         &lt;element name="CAN-NM-ECU" type="{http://autosar.org/schema/r4.0}CAN-NM-ECU"/>
     *         &lt;element name="FLEXRAY-NM-ECU" type="{http://autosar.org/schema/r4.0}FLEXRAY-NM-ECU"/>
     *         &lt;element name="J-1939-NM-ECU" type="{http://autosar.org/schema/r4.0}J-1939-NM-ECU"/>
     *         &lt;element name="UDP-NM-ECU" type="{http://autosar.org/schema/r4.0}UDP-NM-ECU"/>
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
        "cannmecuOrFLEXRAYNMECUOrJ1939NMECU"
    })
    public static class BUSDEPENDENTNMECUS {

        @XmlElements({
            @XmlElement(name = "CAN-NM-ECU", type = CANNMECU.class),
            @XmlElement(name = "FLEXRAY-NM-ECU", type = FLEXRAYNMECU.class),
            @XmlElement(name = "J-1939-NM-ECU", type = J1939NMECU.class),
            @XmlElement(name = "UDP-NM-ECU", type = UDPNMECU.class)
        })
        protected List<Object> cannmecuOrFLEXRAYNMECUOrJ1939NMECU;

        /**
         * Gets the value of the cannmecuOrFLEXRAYNMECUOrJ1939NMECU property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cannmecuOrFLEXRAYNMECUOrJ1939NMECU property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCANNMECUOrFLEXRAYNMECUOrJ1939NMECU().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CANNMECU }
         * {@link FLEXRAYNMECU }
         * {@link J1939NMECU }
         * {@link UDPNMECU }
         * 
         * 
         */
        public List<Object> getCANNMECUOrFLEXRAYNMECUOrJ1939NMECU() {
            if (cannmecuOrFLEXRAYNMECUOrJ1939NMECU == null) {
                cannmecuOrFLEXRAYNMECUOrJ1939NMECU = new ArrayList<Object>();
            }
            return this.cannmecuOrFLEXRAYNMECUOrJ1939NMECU;
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="CAN-NM-ECU" type="{http://autosar.org/schema/r4.0}CAN-NM-ECU"/>
     *         &lt;element name="FLEXRAY-NM-ECU" type="{http://autosar.org/schema/r4.0}FLEXRAY-NM-ECU"/>
     *         &lt;element name="J-1939-NM-ECU" type="{http://autosar.org/schema/r4.0}J-1939-NM-ECU"/>
     *         &lt;element name="UDP-NM-ECU" type="{http://autosar.org/schema/r4.0}UDP-NM-ECU"/>
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
        "cannmecuOrFLEXRAYNMECUOrJ1939NMECU"
    })
    public static class BUSSPECIFICNMECU {

        @XmlElements({
            @XmlElement(name = "CAN-NM-ECU", type = CANNMECU.class),
            @XmlElement(name = "FLEXRAY-NM-ECU", type = FLEXRAYNMECU.class),
            @XmlElement(name = "J-1939-NM-ECU", type = J1939NMECU.class),
            @XmlElement(name = "UDP-NM-ECU", type = UDPNMECU.class)
        })
        protected Object cannmecuOrFLEXRAYNMECUOrJ1939NMECU;

        /**
         * ??cannmecuOrFLEXRAYNMECUOrJ1939NMECU?????
         * 
         * @return
         *     possible object is
         *     {@link CANNMECU }
         *     {@link FLEXRAYNMECU }
         *     {@link J1939NMECU }
         *     {@link UDPNMECU }
         *     
         */
        public Object getCANNMECUOrFLEXRAYNMECUOrJ1939NMECU() {
            return cannmecuOrFLEXRAYNMECUOrJ1939NMECU;
        }

        /**
         * ??cannmecuOrFLEXRAYNMECUOrJ1939NMECU?????
         * 
         * @param value
         *     allowed object is
         *     {@link CANNMECU }
         *     {@link FLEXRAYNMECU }
         *     {@link J1939NMECU }
         *     {@link UDPNMECU }
         *     
         */
        public void setCANNMECUOrFLEXRAYNMECUOrJ1939NMECU(Object value) {
            this.cannmecuOrFLEXRAYNMECUOrJ1939NMECU = value;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECU-INSTANCE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ECUINSTANCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ECUINSTANCESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ECUINSTANCESUBTYPESENUM }
         *     
         */
        public ECUINSTANCESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ECUINSTANCESUBTYPESENUM }
         *     
         */
        public void setDEST(ECUINSTANCESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
