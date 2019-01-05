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
 * This meta-class represents the ability to define requirements on the implicit communication behavior.
 * 
 * <p>CONSISTENCY-NEEDS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CONSISTENCY-NEEDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CONSISTENCY-NEEDS"/>
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
@XmlType(name = "CONSISTENCY-NEEDS", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "blueprintpolicys",
    "shortnamepattern",
    "dpgdoesnotrequirecoherencys",
    "dpgrequirescoherencys",
    "regdoesnotrequirestabilitys",
    "regrequiresstabilitys",
    "variationpoint"
})
public class CONSISTENCYNEEDS {

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
    @XmlElement(name = "BLUEPRINT-POLICYS")
    protected Ar421.FLATMAP.BLUEPRINTPOLICYS blueprintpolicys;
    @XmlElement(name = "SHORT-NAME-PATTERN")
    protected STRING shortnamepattern;
    @XmlElement(name = "DPG-DOES-NOT-REQUIRE-COHERENCYS")
    protected CONSISTENCYNEEDS.DPGDOESNOTREQUIRECOHERENCYS dpgdoesnotrequirecoherencys;
    @XmlElement(name = "DPG-REQUIRES-COHERENCYS")
    protected CONSISTENCYNEEDS.DPGREQUIRESCOHERENCYS dpgrequirescoherencys;
    @XmlElement(name = "REG-DOES-NOT-REQUIRE-STABILITYS")
    protected CONSISTENCYNEEDS.REGDOESNOTREQUIRESTABILITYS regdoesnotrequirestabilitys;
    @XmlElement(name = "REG-REQUIRES-STABILITYS")
    protected CONSISTENCYNEEDS.REGREQUIRESSTABILITYS regrequiresstabilitys;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
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
     * ??blueprintpolicys?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public Ar421.FLATMAP.BLUEPRINTPOLICYS getBLUEPRINTPOLICYS() {
        return blueprintpolicys;
    }

    /**
     * ??blueprintpolicys?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.FLATMAP.BLUEPRINTPOLICYS }
     *     
     */
    public void setBLUEPRINTPOLICYS(Ar421.FLATMAP.BLUEPRINTPOLICYS value) {
        this.blueprintpolicys = value;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @return
     *     possible object is
     *     {@link STRING }
     *     
     */
    public STRING getSHORTNAMEPATTERN() {
        return shortnamepattern;
    }

    /**
     * ??shortnamepattern?????
     * 
     * @param value
     *     allowed object is
     *     {@link STRING }
     *     
     */
    public void setSHORTNAMEPATTERN(STRING value) {
        this.shortnamepattern = value;
    }

    /**
     * ??dpgdoesnotrequirecoherencys?????
     * 
     * @return
     *     possible object is
     *     {@link CONSISTENCYNEEDS.DPGDOESNOTREQUIRECOHERENCYS }
     *     
     */
    public CONSISTENCYNEEDS.DPGDOESNOTREQUIRECOHERENCYS getDPGDOESNOTREQUIRECOHERENCYS() {
        return dpgdoesnotrequirecoherencys;
    }

    /**
     * ??dpgdoesnotrequirecoherencys?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSISTENCYNEEDS.DPGDOESNOTREQUIRECOHERENCYS }
     *     
     */
    public void setDPGDOESNOTREQUIRECOHERENCYS(CONSISTENCYNEEDS.DPGDOESNOTREQUIRECOHERENCYS value) {
        this.dpgdoesnotrequirecoherencys = value;
    }

    /**
     * ??dpgrequirescoherencys?????
     * 
     * @return
     *     possible object is
     *     {@link CONSISTENCYNEEDS.DPGREQUIRESCOHERENCYS }
     *     
     */
    public CONSISTENCYNEEDS.DPGREQUIRESCOHERENCYS getDPGREQUIRESCOHERENCYS() {
        return dpgrequirescoherencys;
    }

    /**
     * ??dpgrequirescoherencys?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSISTENCYNEEDS.DPGREQUIRESCOHERENCYS }
     *     
     */
    public void setDPGREQUIRESCOHERENCYS(CONSISTENCYNEEDS.DPGREQUIRESCOHERENCYS value) {
        this.dpgrequirescoherencys = value;
    }

    /**
     * ??regdoesnotrequirestabilitys?????
     * 
     * @return
     *     possible object is
     *     {@link CONSISTENCYNEEDS.REGDOESNOTREQUIRESTABILITYS }
     *     
     */
    public CONSISTENCYNEEDS.REGDOESNOTREQUIRESTABILITYS getREGDOESNOTREQUIRESTABILITYS() {
        return regdoesnotrequirestabilitys;
    }

    /**
     * ??regdoesnotrequirestabilitys?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSISTENCYNEEDS.REGDOESNOTREQUIRESTABILITYS }
     *     
     */
    public void setREGDOESNOTREQUIRESTABILITYS(CONSISTENCYNEEDS.REGDOESNOTREQUIRESTABILITYS value) {
        this.regdoesnotrequirestabilitys = value;
    }

    /**
     * ??regrequiresstabilitys?????
     * 
     * @return
     *     possible object is
     *     {@link CONSISTENCYNEEDS.REGREQUIRESSTABILITYS }
     *     
     */
    public CONSISTENCYNEEDS.REGREQUIRESSTABILITYS getREGREQUIRESSTABILITYS() {
        return regrequiresstabilitys;
    }

    /**
     * ??regrequiresstabilitys?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSISTENCYNEEDS.REGREQUIRESSTABILITYS }
     *     
     */
    public void setREGREQUIRESSTABILITYS(CONSISTENCYNEEDS.REGREQUIRESSTABILITYS value) {
        this.regrequiresstabilitys = value;
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
     *         &lt;element name="DATA-PROTOTYPE-GROUP" type="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE-GROUP"/>
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
        "dataprototypegroup"
    })
    public static class DPGDOESNOTREQUIRECOHERENCYS {

        @XmlElement(name = "DATA-PROTOTYPE-GROUP")
        protected List<DATAPROTOTYPEGROUP> dataprototypegroup;

        /**
         * Gets the value of the dataprototypegroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataprototypegroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATAPROTOTYPEGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DATAPROTOTYPEGROUP }
         * 
         * 
         */
        public List<DATAPROTOTYPEGROUP> getDATAPROTOTYPEGROUP() {
            if (dataprototypegroup == null) {
                dataprototypegroup = new ArrayList<DATAPROTOTYPEGROUP>();
            }
            return this.dataprototypegroup;
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
     *         &lt;element name="DATA-PROTOTYPE-GROUP" type="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE-GROUP"/>
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
        "dataprototypegroup"
    })
    public static class DPGREQUIRESCOHERENCYS {

        @XmlElement(name = "DATA-PROTOTYPE-GROUP")
        protected List<DATAPROTOTYPEGROUP> dataprototypegroup;

        /**
         * Gets the value of the dataprototypegroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataprototypegroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATAPROTOTYPEGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DATAPROTOTYPEGROUP }
         * 
         * 
         */
        public List<DATAPROTOTYPEGROUP> getDATAPROTOTYPEGROUP() {
            if (dataprototypegroup == null) {
                dataprototypegroup = new ArrayList<DATAPROTOTYPEGROUP>();
            }
            return this.dataprototypegroup;
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
     *         &lt;element name="RUNNABLE-ENTITY-GROUP" type="{http://autosar.org/schema/r4.0}RUNNABLE-ENTITY-GROUP"/>
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
        "runnableentitygroup"
    })
    public static class REGDOESNOTREQUIRESTABILITYS {

        @XmlElement(name = "RUNNABLE-ENTITY-GROUP")
        protected List<RUNNABLEENTITYGROUP> runnableentitygroup;

        /**
         * Gets the value of the runnableentitygroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runnableentitygroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNNABLEENTITYGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RUNNABLEENTITYGROUP }
         * 
         * 
         */
        public List<RUNNABLEENTITYGROUP> getRUNNABLEENTITYGROUP() {
            if (runnableentitygroup == null) {
                runnableentitygroup = new ArrayList<RUNNABLEENTITYGROUP>();
            }
            return this.runnableentitygroup;
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
     *         &lt;element name="RUNNABLE-ENTITY-GROUP" type="{http://autosar.org/schema/r4.0}RUNNABLE-ENTITY-GROUP"/>
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
        "runnableentitygroup"
    })
    public static class REGREQUIRESSTABILITYS {

        @XmlElement(name = "RUNNABLE-ENTITY-GROUP")
        protected List<RUNNABLEENTITYGROUP> runnableentitygroup;

        /**
         * Gets the value of the runnableentitygroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runnableentitygroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRUNNABLEENTITYGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RUNNABLEENTITYGROUP }
         * 
         * 
         */
        public List<RUNNABLEENTITYGROUP> getRUNNABLEENTITYGROUP() {
            if (runnableentitygroup == null) {
                runnableentitygroup = new ArrayList<RUNNABLEENTITYGROUP>();
            }
            return this.runnableentitygroup;
        }

    }

}
