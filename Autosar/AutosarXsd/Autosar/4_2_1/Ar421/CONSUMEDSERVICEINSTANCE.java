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
 * Service instances that are consumed by the ECU that is connected via the ApplicationEndpoint to a CommunicationConnector.
 * 
 * <p>CONSUMED-SERVICE-INSTANCE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CONSUMED-SERVICE-INSTANCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-SERVICE-INSTANCE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CONSUMED-SERVICE-INSTANCE"/>
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
@XmlType(name = "CONSUMED-SERVICE-INSTANCE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "routinggrouprefs",
    "consumedeventgroups",
    "providedserviceinstanceref",
    "sdclientconfig"
})
public class CONSUMEDSERVICEINSTANCE {

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
    @XmlElement(name = "ROUTING-GROUP-REFS")
    protected Ar421.PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS routinggrouprefs;
    @XmlElement(name = "CONSUMED-EVENT-GROUPS")
    protected CONSUMEDSERVICEINSTANCE.CONSUMEDEVENTGROUPS consumedeventgroups;
    @XmlElement(name = "PROVIDED-SERVICE-INSTANCE-REF")
    protected CONSUMEDSERVICEINSTANCE.PROVIDEDSERVICEINSTANCEREF providedserviceinstanceref;
    @XmlElement(name = "SD-CLIENT-CONFIG")
    protected SDCLIENTCONFIG sdclientconfig;
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
     * ??routinggrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS }
     *     
     */
    public Ar421.PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS getROUTINGGROUPREFS() {
        return routinggrouprefs;
    }

    /**
     * ??routinggrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS }
     *     
     */
    public void setROUTINGGROUPREFS(Ar421.PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS value) {
        this.routinggrouprefs = value;
    }

    /**
     * ??consumedeventgroups?????
     * 
     * @return
     *     possible object is
     *     {@link CONSUMEDSERVICEINSTANCE.CONSUMEDEVENTGROUPS }
     *     
     */
    public CONSUMEDSERVICEINSTANCE.CONSUMEDEVENTGROUPS getCONSUMEDEVENTGROUPS() {
        return consumedeventgroups;
    }

    /**
     * ??consumedeventgroups?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSUMEDSERVICEINSTANCE.CONSUMEDEVENTGROUPS }
     *     
     */
    public void setCONSUMEDEVENTGROUPS(CONSUMEDSERVICEINSTANCE.CONSUMEDEVENTGROUPS value) {
        this.consumedeventgroups = value;
    }

    /**
     * ??providedserviceinstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link CONSUMEDSERVICEINSTANCE.PROVIDEDSERVICEINSTANCEREF }
     *     
     */
    public CONSUMEDSERVICEINSTANCE.PROVIDEDSERVICEINSTANCEREF getPROVIDEDSERVICEINSTANCEREF() {
        return providedserviceinstanceref;
    }

    /**
     * ??providedserviceinstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSUMEDSERVICEINSTANCE.PROVIDEDSERVICEINSTANCEREF }
     *     
     */
    public void setPROVIDEDSERVICEINSTANCEREF(CONSUMEDSERVICEINSTANCE.PROVIDEDSERVICEINSTANCEREF value) {
        this.providedserviceinstanceref = value;
    }

    /**
     * ??sdclientconfig?????
     * 
     * @return
     *     possible object is
     *     {@link SDCLIENTCONFIG }
     *     
     */
    public SDCLIENTCONFIG getSDCLIENTCONFIG() {
        return sdclientconfig;
    }

    /**
     * ??sdclientconfig?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDCLIENTCONFIG }
     *     
     */
    public void setSDCLIENTCONFIG(SDCLIENTCONFIG value) {
        this.sdclientconfig = value;
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
     *         &lt;element name="CONSUMED-EVENT-GROUP" type="{http://autosar.org/schema/r4.0}CONSUMED-EVENT-GROUP"/>
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
        "consumedeventgroup"
    })
    public static class CONSUMEDEVENTGROUPS {

        @XmlElement(name = "CONSUMED-EVENT-GROUP")
        protected List<CONSUMEDEVENTGROUP> consumedeventgroup;

        /**
         * Gets the value of the consumedeventgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the consumedeventgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSUMEDEVENTGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CONSUMEDEVENTGROUP }
         * 
         * 
         */
        public List<CONSUMEDEVENTGROUP> getCONSUMEDEVENTGROUP() {
            if (consumedeventgroup == null) {
                consumedeventgroup = new ArrayList<CONSUMEDEVENTGROUP>();
            }
            return this.consumedeventgroup;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PROVIDED-SERVICE-INSTANCE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PROVIDEDSERVICEINSTANCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PROVIDEDSERVICEINSTANCESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PROVIDEDSERVICEINSTANCESUBTYPESENUM }
         *     
         */
        public PROVIDEDSERVICEINSTANCESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PROVIDEDSERVICEINSTANCESUBTYPESENUM }
         *     
         */
        public void setDEST(PROVIDEDSERVICEINSTANCESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
