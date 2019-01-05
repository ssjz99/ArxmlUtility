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
 * Service instances that are provided by the ECU that is connected via the ApplicationEndpoint to a CommunicationConnector.
 * 
 * <p>PROVIDED-SERVICE-INSTANCE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PROVIDED-SERVICE-INSTANCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MULTILANGUAGE-REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IDENTIFIABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ABSTRACT-SERVICE-INSTANCE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PROVIDED-SERVICE-INSTANCE"/>
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
@XmlType(name = "PROVIDED-SERVICE-INSTANCE", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "routinggrouprefs",
    "eventhandlers",
    "instanceidentifier",
    "priority",
    "sdserverconfig",
    "serviceidentifier"
})
public class PROVIDEDSERVICEINSTANCE {

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
    protected PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS routinggrouprefs;
    @XmlElement(name = "EVENT-HANDLERS")
    protected PROVIDEDSERVICEINSTANCE.EVENTHANDLERS eventhandlers;
    @XmlElement(name = "INSTANCE-IDENTIFIER")
    protected POSITIVEINTEGER instanceidentifier;
    @XmlElement(name = "PRIORITY")
    protected POSITIVEINTEGER priority;
    @XmlElement(name = "SD-SERVER-CONFIG")
    protected SDSERVERCONFIG sdserverconfig;
    @XmlElement(name = "SERVICE-IDENTIFIER")
    protected POSITIVEINTEGER serviceidentifier;
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
     * ??routinggrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS }
     *     
     */
    public PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS getROUTINGGROUPREFS() {
        return routinggrouprefs;
    }

    /**
     * ??routinggrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS }
     *     
     */
    public void setROUTINGGROUPREFS(PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS value) {
        this.routinggrouprefs = value;
    }

    /**
     * ??eventhandlers?????
     * 
     * @return
     *     possible object is
     *     {@link PROVIDEDSERVICEINSTANCE.EVENTHANDLERS }
     *     
     */
    public PROVIDEDSERVICEINSTANCE.EVENTHANDLERS getEVENTHANDLERS() {
        return eventhandlers;
    }

    /**
     * ??eventhandlers?????
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDEDSERVICEINSTANCE.EVENTHANDLERS }
     *     
     */
    public void setEVENTHANDLERS(PROVIDEDSERVICEINSTANCE.EVENTHANDLERS value) {
        this.eventhandlers = value;
    }

    /**
     * ??instanceidentifier?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getINSTANCEIDENTIFIER() {
        return instanceidentifier;
    }

    /**
     * ??instanceidentifier?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setINSTANCEIDENTIFIER(POSITIVEINTEGER value) {
        this.instanceidentifier = value;
    }

    /**
     * ??priority?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getPRIORITY() {
        return priority;
    }

    /**
     * ??priority?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setPRIORITY(POSITIVEINTEGER value) {
        this.priority = value;
    }

    /**
     * ??sdserverconfig?????
     * 
     * @return
     *     possible object is
     *     {@link SDSERVERCONFIG }
     *     
     */
    public SDSERVERCONFIG getSDSERVERCONFIG() {
        return sdserverconfig;
    }

    /**
     * ??sdserverconfig?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDSERVERCONFIG }
     *     
     */
    public void setSDSERVERCONFIG(SDSERVERCONFIG value) {
        this.sdserverconfig = value;
    }

    /**
     * ??serviceidentifier?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSERVICEIDENTIFIER() {
        return serviceidentifier;
    }

    /**
     * ??serviceidentifier?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSERVICEIDENTIFIER(POSITIVEINTEGER value) {
        this.serviceidentifier = value;
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
     *         &lt;element name="EVENT-HANDLER" type="{http://autosar.org/schema/r4.0}EVENT-HANDLER"/>
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
        "eventhandler"
    })
    public static class EVENTHANDLERS {

        @XmlElement(name = "EVENT-HANDLER")
        protected List<EVENTHANDLER> eventhandler;

        /**
         * Gets the value of the eventhandler property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventhandler property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEVENTHANDLER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EVENTHANDLER }
         * 
         * 
         */
        public List<EVENTHANDLER> getEVENTHANDLER() {
            if (eventhandler == null) {
                eventhandler = new ArrayList<EVENTHANDLER>();
            }
            return this.eventhandler;
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
     *         &lt;element name="ROUTING-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SO-AD-ROUTING-GROUP--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "routinggroupref"
    })
    public static class ROUTINGGROUPREFS {

        @XmlElement(name = "ROUTING-GROUP-REF")
        protected List<PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS.ROUTINGGROUPREF> routinggroupref;

        /**
         * Gets the value of the routinggroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routinggroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROUTINGGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS.ROUTINGGROUPREF }
         * 
         * 
         */
        public List<PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS.ROUTINGGROUPREF> getROUTINGGROUPREF() {
            if (routinggroupref == null) {
                routinggroupref = new ArrayList<PROVIDEDSERVICEINSTANCE.ROUTINGGROUPREFS.ROUTINGGROUPREF>();
            }
            return this.routinggroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SO-AD-ROUTING-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ROUTINGGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected SOADROUTINGGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link SOADROUTINGGROUPSUBTYPESENUM }
             *     
             */
            public SOADROUTINGGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link SOADROUTINGGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(SOADROUTINGGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
