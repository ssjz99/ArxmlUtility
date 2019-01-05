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
 * The master task (in the master node) transmits frame headers based on a schedule table. The schedule table specifies the identifiers for each header and the interval between the start of a frame and the start of the following frame.
 * 
 * <p>LIN-SCHEDULE-TABLE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIN-SCHEDULE-TABLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-SCHEDULE-TABLE"/>
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
@XmlType(name = "LIN-SCHEDULE-TABLE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "resumeposition",
    "runmode",
    "tableentrys",
    "variationpoint"
})
public class LINSCHEDULETABLE {

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
    @XmlElement(name = "RESUME-POSITION")
    protected RESUMEPOSITION resumeposition;
    @XmlElement(name = "RUN-MODE")
    protected RUNMODE runmode;
    @XmlElement(name = "TABLE-ENTRYS")
    protected LINSCHEDULETABLE.TABLEENTRYS tableentrys;
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
     * ??resumeposition?????
     * 
     * @return
     *     possible object is
     *     {@link RESUMEPOSITION }
     *     
     */
    public RESUMEPOSITION getRESUMEPOSITION() {
        return resumeposition;
    }

    /**
     * ??resumeposition?????
     * 
     * @param value
     *     allowed object is
     *     {@link RESUMEPOSITION }
     *     
     */
    public void setRESUMEPOSITION(RESUMEPOSITION value) {
        this.resumeposition = value;
    }

    /**
     * ??runmode?????
     * 
     * @return
     *     possible object is
     *     {@link RUNMODE }
     *     
     */
    public RUNMODE getRUNMODE() {
        return runmode;
    }

    /**
     * ??runmode?????
     * 
     * @param value
     *     allowed object is
     *     {@link RUNMODE }
     *     
     */
    public void setRUNMODE(RUNMODE value) {
        this.runmode = value;
    }

    /**
     * ??tableentrys?????
     * 
     * @return
     *     possible object is
     *     {@link LINSCHEDULETABLE.TABLEENTRYS }
     *     
     */
    public LINSCHEDULETABLE.TABLEENTRYS getTABLEENTRYS() {
        return tableentrys;
    }

    /**
     * ??tableentrys?????
     * 
     * @param value
     *     allowed object is
     *     {@link LINSCHEDULETABLE.TABLEENTRYS }
     *     
     */
    public void setTABLEENTRYS(LINSCHEDULETABLE.TABLEENTRYS value) {
        this.tableentrys = value;
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
     *         &lt;element name="APPLICATION-ENTRY" type="{http://autosar.org/schema/r4.0}APPLICATION-ENTRY"/>
     *         &lt;element name="ASSIGN-FRAME-ID" type="{http://autosar.org/schema/r4.0}ASSIGN-FRAME-ID"/>
     *         &lt;element name="ASSIGN-FRAME-ID-RANGE" type="{http://autosar.org/schema/r4.0}ASSIGN-FRAME-ID-RANGE"/>
     *         &lt;element name="ASSIGN-NAD" type="{http://autosar.org/schema/r4.0}ASSIGN-NAD"/>
     *         &lt;element name="CONDITIONAL-CHANGE-NAD" type="{http://autosar.org/schema/r4.0}CONDITIONAL-CHANGE-NAD"/>
     *         &lt;element name="DATA-DUMP-ENTRY" type="{http://autosar.org/schema/r4.0}DATA-DUMP-ENTRY"/>
     *         &lt;element name="FREE-FORMAT" type="{http://autosar.org/schema/r4.0}FREE-FORMAT"/>
     *         &lt;element name="SAVE-CONFIGURATION-ENTRY" type="{http://autosar.org/schema/r4.0}SAVE-CONFIGURATION-ENTRY"/>
     *         &lt;element name="UNASSIGN-FRAME-ID" type="{http://autosar.org/schema/r4.0}UNASSIGN-FRAME-ID"/>
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
        "applicationentryOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE"
    })
    public static class TABLEENTRYS {

        @XmlElements({
            @XmlElement(name = "APPLICATION-ENTRY", type = APPLICATIONENTRY.class),
            @XmlElement(name = "ASSIGN-FRAME-ID", type = ASSIGNFRAMEID.class),
            @XmlElement(name = "ASSIGN-FRAME-ID-RANGE", type = ASSIGNFRAMEIDRANGE.class),
            @XmlElement(name = "ASSIGN-NAD", type = ASSIGNNAD.class),
            @XmlElement(name = "CONDITIONAL-CHANGE-NAD", type = CONDITIONALCHANGENAD.class),
            @XmlElement(name = "DATA-DUMP-ENTRY", type = DATADUMPENTRY.class),
            @XmlElement(name = "FREE-FORMAT", type = FREEFORMAT.class),
            @XmlElement(name = "SAVE-CONFIGURATION-ENTRY", type = SAVECONFIGURATIONENTRY.class),
            @XmlElement(name = "UNASSIGN-FRAME-ID", type = UNASSIGNFRAMEID.class)
        })
        protected List<Object> applicationentryOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE;

        /**
         * Gets the value of the applicationentryOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicationentryOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAPPLICATIONENTRYOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APPLICATIONENTRY }
         * {@link ASSIGNFRAMEID }
         * {@link ASSIGNFRAMEIDRANGE }
         * {@link ASSIGNNAD }
         * {@link CONDITIONALCHANGENAD }
         * {@link DATADUMPENTRY }
         * {@link FREEFORMAT }
         * {@link SAVECONFIGURATIONENTRY }
         * {@link UNASSIGNFRAMEID }
         * 
         * 
         */
        public List<Object> getAPPLICATIONENTRYOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE() {
            if (applicationentryOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE == null) {
                applicationentryOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE = new ArrayList<Object>();
            }
            return this.applicationentryOrASSIGNFRAMEIDOrASSIGNFRAMEIDRANGE;
        }

    }

}
