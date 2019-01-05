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
 * This meta class represents the ability to attach a life cycle  information to a particular set of elements.
 * 
 * The information can be defined for a particular period. This supports the definition of transition plans.
 * 
 * If no period is specified, the life cycle state applies forever.
 * 
 * <p>LIFE-CYCLE-INFO-SET complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="LIFE-CYCLE-INFO-SET">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIFE-CYCLE-INFO-SET"/>
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
@XmlType(name = "LIFE-CYCLE-INFO-SET", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "defaultlcstateref",
    "defaultperiodbegin",
    "defaultperiodend",
    "lifecycleinfos",
    "usedlifecyclestatedefinitiongroupref"
})
public class LIFECYCLEINFOSET {

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
    @XmlElement(name = "DEFAULT-LC-STATE-REF")
    protected LIFECYCLEINFOSET.DEFAULTLCSTATEREF defaultlcstateref;
    @XmlElement(name = "DEFAULT-PERIOD-BEGIN")
    protected LIFECYCLEPERIOD defaultperiodbegin;
    @XmlElement(name = "DEFAULT-PERIOD-END")
    protected LIFECYCLEPERIOD defaultperiodend;
    @XmlElement(name = "LIFE-CYCLE-INFOS")
    protected LIFECYCLEINFOSET.LIFECYCLEINFOS lifecycleinfos;
    @XmlElement(name = "USED-LIFE-CYCLE-STATE-DEFINITION-GROUP-REF")
    protected LIFECYCLEINFOSET.USEDLIFECYCLESTATEDEFINITIONGROUPREF usedlifecyclestatedefinitiongroupref;
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
     * ??defaultlcstateref?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEINFOSET.DEFAULTLCSTATEREF }
     *     
     */
    public LIFECYCLEINFOSET.DEFAULTLCSTATEREF getDEFAULTLCSTATEREF() {
        return defaultlcstateref;
    }

    /**
     * ??defaultlcstateref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEINFOSET.DEFAULTLCSTATEREF }
     *     
     */
    public void setDEFAULTLCSTATEREF(LIFECYCLEINFOSET.DEFAULTLCSTATEREF value) {
        this.defaultlcstateref = value;
    }

    /**
     * ??defaultperiodbegin?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public LIFECYCLEPERIOD getDEFAULTPERIODBEGIN() {
        return defaultperiodbegin;
    }

    /**
     * ??defaultperiodbegin?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public void setDEFAULTPERIODBEGIN(LIFECYCLEPERIOD value) {
        this.defaultperiodbegin = value;
    }

    /**
     * ??defaultperiodend?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public LIFECYCLEPERIOD getDEFAULTPERIODEND() {
        return defaultperiodend;
    }

    /**
     * ??defaultperiodend?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEPERIOD }
     *     
     */
    public void setDEFAULTPERIODEND(LIFECYCLEPERIOD value) {
        this.defaultperiodend = value;
    }

    /**
     * ??lifecycleinfos?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEINFOSET.LIFECYCLEINFOS }
     *     
     */
    public LIFECYCLEINFOSET.LIFECYCLEINFOS getLIFECYCLEINFOS() {
        return lifecycleinfos;
    }

    /**
     * ??lifecycleinfos?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEINFOSET.LIFECYCLEINFOS }
     *     
     */
    public void setLIFECYCLEINFOS(LIFECYCLEINFOSET.LIFECYCLEINFOS value) {
        this.lifecycleinfos = value;
    }

    /**
     * ??usedlifecyclestatedefinitiongroupref?????
     * 
     * @return
     *     possible object is
     *     {@link LIFECYCLEINFOSET.USEDLIFECYCLESTATEDEFINITIONGROUPREF }
     *     
     */
    public LIFECYCLEINFOSET.USEDLIFECYCLESTATEDEFINITIONGROUPREF getUSEDLIFECYCLESTATEDEFINITIONGROUPREF() {
        return usedlifecyclestatedefinitiongroupref;
    }

    /**
     * ??usedlifecyclestatedefinitiongroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link LIFECYCLEINFOSET.USEDLIFECYCLESTATEDEFINITIONGROUPREF }
     *     
     */
    public void setUSEDLIFECYCLESTATEDEFINITIONGROUPREF(LIFECYCLEINFOSET.USEDLIFECYCLESTATEDEFINITIONGROUPREF value) {
        this.usedlifecyclestatedefinitiongroupref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIFE-CYCLE-STATE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DEFAULTLCSTATEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LIFECYCLESTATESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LIFECYCLESTATESUBTYPESENUM }
         *     
         */
        public LIFECYCLESTATESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LIFECYCLESTATESUBTYPESENUM }
         *     
         */
        public void setDEST(LIFECYCLESTATESUBTYPESENUM value) {
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
     *         &lt;element name="LIFE-CYCLE-INFO" type="{http://autosar.org/schema/r4.0}LIFE-CYCLE-INFO"/>
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
        "lifecycleinfo"
    })
    public static class LIFECYCLEINFOS {

        @XmlElement(name = "LIFE-CYCLE-INFO")
        protected List<LIFECYCLEINFO> lifecycleinfo;

        /**
         * Gets the value of the lifecycleinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lifecycleinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLIFECYCLEINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LIFECYCLEINFO }
         * 
         * 
         */
        public List<LIFECYCLEINFO> getLIFECYCLEINFO() {
            if (lifecycleinfo == null) {
                lifecycleinfo = new ArrayList<LIFECYCLEINFO>();
            }
            return this.lifecycleinfo;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}LIFE-CYCLE-STATE-DEFINITION-GROUP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class USEDLIFECYCLESTATEDEFINITIONGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM }
         *     
         */
        public LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(LIFECYCLESTATEDEFINITIONGROUPSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
