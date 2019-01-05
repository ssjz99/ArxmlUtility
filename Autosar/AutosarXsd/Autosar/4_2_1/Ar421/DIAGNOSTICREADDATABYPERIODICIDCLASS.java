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
 * This meta-class contains attributes shared by all instances of the "Read Data by periodic Identifier" diagnostic service.
 * 
 * <p>DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COLLECTABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PACKAGEABLE-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-ELEMENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-CLASS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS"/>
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
@XmlType(name = "DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "accesspermissionref",
    "accesspermissionvalidity",
    "maxperiodicdidtoread",
    "periodicrates",
    "schedulermaxnumber"
})
public class DIAGNOSTICREADDATABYPERIODICIDCLASS {

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
    @XmlElement(name = "ACCESS-PERMISSION-REF")
    protected Ar421.DIAGNOSTICWRITEDATABYIDENTIFIERCLASS.ACCESSPERMISSIONREF accesspermissionref;
    @XmlElement(name = "ACCESS-PERMISSION-VALIDITY")
    protected DIAGNOSTICACCESSPERMISSIONVALIDITYENUM accesspermissionvalidity;
    @XmlElement(name = "MAX-PERIODIC-DID-TO-READ")
    protected POSITIVEINTEGER maxperiodicdidtoread;
    @XmlElement(name = "PERIODIC-RATES")
    protected DIAGNOSTICREADDATABYPERIODICIDCLASS.PERIODICRATES periodicrates;
    @XmlElement(name = "SCHEDULER-MAX-NUMBER")
    protected POSITIVEINTEGER schedulermaxnumber;
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
     * ??accesspermissionref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.DIAGNOSTICWRITEDATABYIDENTIFIERCLASS.ACCESSPERMISSIONREF }
     *     
     */
    public Ar421.DIAGNOSTICWRITEDATABYIDENTIFIERCLASS.ACCESSPERMISSIONREF getACCESSPERMISSIONREF() {
        return accesspermissionref;
    }

    /**
     * ??accesspermissionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.DIAGNOSTICWRITEDATABYIDENTIFIERCLASS.ACCESSPERMISSIONREF }
     *     
     */
    public void setACCESSPERMISSIONREF(Ar421.DIAGNOSTICWRITEDATABYIDENTIFIERCLASS.ACCESSPERMISSIONREF value) {
        this.accesspermissionref = value;
    }

    /**
     * ??accesspermissionvalidity?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICACCESSPERMISSIONVALIDITYENUM }
     *     
     */
    public DIAGNOSTICACCESSPERMISSIONVALIDITYENUM getACCESSPERMISSIONVALIDITY() {
        return accesspermissionvalidity;
    }

    /**
     * ??accesspermissionvalidity?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICACCESSPERMISSIONVALIDITYENUM }
     *     
     */
    public void setACCESSPERMISSIONVALIDITY(DIAGNOSTICACCESSPERMISSIONVALIDITYENUM value) {
        this.accesspermissionvalidity = value;
    }

    /**
     * ??maxperiodicdidtoread?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMAXPERIODICDIDTOREAD() {
        return maxperiodicdidtoread;
    }

    /**
     * ??maxperiodicdidtoread?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMAXPERIODICDIDTOREAD(POSITIVEINTEGER value) {
        this.maxperiodicdidtoread = value;
    }

    /**
     * ??periodicrates?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICREADDATABYPERIODICIDCLASS.PERIODICRATES }
     *     
     */
    public DIAGNOSTICREADDATABYPERIODICIDCLASS.PERIODICRATES getPERIODICRATES() {
        return periodicrates;
    }

    /**
     * ??periodicrates?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICREADDATABYPERIODICIDCLASS.PERIODICRATES }
     *     
     */
    public void setPERIODICRATES(DIAGNOSTICREADDATABYPERIODICIDCLASS.PERIODICRATES value) {
        this.periodicrates = value;
    }

    /**
     * ??schedulermaxnumber?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSCHEDULERMAXNUMBER() {
        return schedulermaxnumber;
    }

    /**
     * ??schedulermaxnumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSCHEDULERMAXNUMBER(POSITIVEINTEGER value) {
        this.schedulermaxnumber = value;
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
     *         &lt;element name="DIAGNOSTIC-PERIODIC-RATE" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-PERIODIC-RATE"/>
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
        "diagnosticperiodicrate"
    })
    public static class PERIODICRATES {

        @XmlElement(name = "DIAGNOSTIC-PERIODIC-RATE")
        protected List<DIAGNOSTICPERIODICRATE> diagnosticperiodicrate;

        /**
         * Gets the value of the diagnosticperiodicrate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticperiodicrate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICPERIODICRATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICPERIODICRATE }
         * 
         * 
         */
        public List<DIAGNOSTICPERIODICRATE> getDIAGNOSTICPERIODICRATE() {
            if (diagnosticperiodicrate == null) {
                diagnosticperiodicrate = new ArrayList<DIAGNOSTICPERIODICRATE>();
            }
            return this.diagnosticperiodicrate;
        }

    }

}