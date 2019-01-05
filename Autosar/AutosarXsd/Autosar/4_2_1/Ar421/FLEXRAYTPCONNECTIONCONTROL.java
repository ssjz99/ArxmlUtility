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
 * Configuration parameters to control a FlexRay TP connection.
 * 
 * <p>FLEXRAY-TP-CONNECTION-CONTROL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-TP-CONNECTION-CONTROL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-TP-CONNECTION-CONTROL"/>
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
@XmlType(name = "FLEXRAY-TP-CONNECTION-CONTROL", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "acktype",
    "maxar",
    "maxas",
    "maxbuffersize",
    "maxfcwait",
    "maxfrif",
    "maxnumberofnpdupercycle",
    "maxretries",
    "separationcycleexponent",
    "timebr",
    "timebuffer",
    "timecs",
    "timefrif",
    "timeoutar",
    "timeoutas",
    "timeoutbr",
    "timeoutbs",
    "timeoutcr",
    "timeoutcs",
    "variationpoint"
})
public class FLEXRAYTPCONNECTIONCONTROL {

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
    @XmlElement(name = "ACK-TYPE")
    protected TPACKTYPE acktype;
    @XmlElement(name = "MAX-AR")
    protected INTEGER maxar;
    @XmlElement(name = "MAX-AS")
    protected INTEGER maxas;
    @XmlElement(name = "MAX-BUFFER-SIZE")
    protected INTEGER maxbuffersize;
    @XmlElement(name = "MAX-FC-WAIT")
    protected INTEGER maxfcwait;
    @XmlElement(name = "MAX-FR-IF")
    protected INTEGER maxfrif;
    @XmlElement(name = "MAX-NUMBER-OF-NPDU-PER-CYCLE")
    protected INTEGER maxnumberofnpdupercycle;
    @XmlElement(name = "MAX-RETRIES")
    protected INTEGER maxretries;
    @XmlElement(name = "SEPARATION-CYCLE-EXPONENT")
    protected INTEGER separationcycleexponent;
    @XmlElement(name = "TIME-BR")
    protected TIMEVALUE timebr;
    @XmlElement(name = "TIME-BUFFER")
    protected TIMEVALUE timebuffer;
    @XmlElement(name = "TIME-CS")
    protected TIMEVALUE timecs;
    @XmlElement(name = "TIME-FR-IF")
    protected TIMEVALUE timefrif;
    @XmlElement(name = "TIMEOUT-AR")
    protected TIMEVALUE timeoutar;
    @XmlElement(name = "TIMEOUT-AS")
    protected TIMEVALUE timeoutas;
    @XmlElement(name = "TIMEOUT-BR")
    protected TIMEVALUE timeoutbr;
    @XmlElement(name = "TIMEOUT-BS")
    protected TIMEVALUE timeoutbs;
    @XmlElement(name = "TIMEOUT-CR")
    protected TIMEVALUE timeoutcr;
    @XmlElement(name = "TIMEOUT-CS")
    protected TIMEVALUE timeoutcs;
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
     * ??acktype?????
     * 
     * @return
     *     possible object is
     *     {@link TPACKTYPE }
     *     
     */
    public TPACKTYPE getACKTYPE() {
        return acktype;
    }

    /**
     * ??acktype?????
     * 
     * @param value
     *     allowed object is
     *     {@link TPACKTYPE }
     *     
     */
    public void setACKTYPE(TPACKTYPE value) {
        this.acktype = value;
    }

    /**
     * ??maxar?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXAR() {
        return maxar;
    }

    /**
     * ??maxar?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXAR(INTEGER value) {
        this.maxar = value;
    }

    /**
     * ??maxas?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXAS() {
        return maxas;
    }

    /**
     * ??maxas?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXAS(INTEGER value) {
        this.maxas = value;
    }

    /**
     * ??maxbuffersize?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXBUFFERSIZE() {
        return maxbuffersize;
    }

    /**
     * ??maxbuffersize?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXBUFFERSIZE(INTEGER value) {
        this.maxbuffersize = value;
    }

    /**
     * ??maxfcwait?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXFCWAIT() {
        return maxfcwait;
    }

    /**
     * ??maxfcwait?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXFCWAIT(INTEGER value) {
        this.maxfcwait = value;
    }

    /**
     * ??maxfrif?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXFRIF() {
        return maxfrif;
    }

    /**
     * ??maxfrif?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXFRIF(INTEGER value) {
        this.maxfrif = value;
    }

    /**
     * ??maxnumberofnpdupercycle?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXNUMBEROFNPDUPERCYCLE() {
        return maxnumberofnpdupercycle;
    }

    /**
     * ??maxnumberofnpdupercycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXNUMBEROFNPDUPERCYCLE(INTEGER value) {
        this.maxnumberofnpdupercycle = value;
    }

    /**
     * ??maxretries?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getMAXRETRIES() {
        return maxretries;
    }

    /**
     * ??maxretries?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setMAXRETRIES(INTEGER value) {
        this.maxretries = value;
    }

    /**
     * ??separationcycleexponent?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSEPARATIONCYCLEEXPONENT() {
        return separationcycleexponent;
    }

    /**
     * ??separationcycleexponent?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSEPARATIONCYCLEEXPONENT(INTEGER value) {
        this.separationcycleexponent = value;
    }

    /**
     * ??timebr?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEBR() {
        return timebr;
    }

    /**
     * ??timebr?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEBR(TIMEVALUE value) {
        this.timebr = value;
    }

    /**
     * ??timebuffer?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEBUFFER() {
        return timebuffer;
    }

    /**
     * ??timebuffer?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEBUFFER(TIMEVALUE value) {
        this.timebuffer = value;
    }

    /**
     * ??timecs?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMECS() {
        return timecs;
    }

    /**
     * ??timecs?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMECS(TIMEVALUE value) {
        this.timecs = value;
    }

    /**
     * ??timefrif?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEFRIF() {
        return timefrif;
    }

    /**
     * ??timefrif?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEFRIF(TIMEVALUE value) {
        this.timefrif = value;
    }

    /**
     * ??timeoutar?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTAR() {
        return timeoutar;
    }

    /**
     * ??timeoutar?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTAR(TIMEVALUE value) {
        this.timeoutar = value;
    }

    /**
     * ??timeoutas?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTAS() {
        return timeoutas;
    }

    /**
     * ??timeoutas?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTAS(TIMEVALUE value) {
        this.timeoutas = value;
    }

    /**
     * ??timeoutbr?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTBR() {
        return timeoutbr;
    }

    /**
     * ??timeoutbr?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTBR(TIMEVALUE value) {
        this.timeoutbr = value;
    }

    /**
     * ??timeoutbs?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTBS() {
        return timeoutbs;
    }

    /**
     * ??timeoutbs?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTBS(TIMEVALUE value) {
        this.timeoutbs = value;
    }

    /**
     * ??timeoutcr?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTCR() {
        return timeoutcr;
    }

    /**
     * ??timeoutcr?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTCR(TIMEVALUE value) {
        this.timeoutcr = value;
    }

    /**
     * ??timeoutcs?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getTIMEOUTCS() {
        return timeoutcs;
    }

    /**
     * ??timeoutcs?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setTIMEOUTCS(TIMEVALUE value) {
        this.timeoutcs = value;
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

}
