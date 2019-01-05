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
 * This represents an instance of the "Response on Event" diagnostic service.
 * 
 * <p>DIAGNOSTIC-RESPONSE-ON-EVENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-RESPONSE-ON-EVENT">
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
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-SERVICE-INSTANCE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-RESPONSE-ON-EVENT"/>
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
@XmlType(name = "DIAGNOSTIC-RESPONSE-ON-EVENT", propOrder = {
    "shortname",
    "longname",
    "desc",
    "category",
    "admindata",
    "introduction",
    "annotations",
    "variationpoint",
    "accesspermissionref",
    "events",
    "eventwindows",
    "responseoneventclassref"
})
public class DIAGNOSTICRESPONSEONEVENT {

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
    protected Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF accesspermissionref;
    @XmlElement(name = "EVENTS")
    protected DIAGNOSTICRESPONSEONEVENT.EVENTS events;
    @XmlElement(name = "EVENT-WINDOWS")
    protected DIAGNOSTICRESPONSEONEVENT.EVENTWINDOWS eventwindows;
    @XmlElement(name = "RESPONSE-ON-EVENT-CLASS-REF")
    protected DIAGNOSTICRESPONSEONEVENT.RESPONSEONEVENTCLASSREF responseoneventclassref;
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
     *     {@link Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF }
     *     
     */
    public Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF getACCESSPERMISSIONREF() {
        return accesspermissionref;
    }

    /**
     * ??accesspermissionref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF }
     *     
     */
    public void setACCESSPERMISSIONREF(Ar421.DIAGNOSTICROUTINECONTROL.ACCESSPERMISSIONREF value) {
        this.accesspermissionref = value;
    }

    /**
     * ??events?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICRESPONSEONEVENT.EVENTS }
     *     
     */
    public DIAGNOSTICRESPONSEONEVENT.EVENTS getEVENTS() {
        return events;
    }

    /**
     * ??events?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICRESPONSEONEVENT.EVENTS }
     *     
     */
    public void setEVENTS(DIAGNOSTICRESPONSEONEVENT.EVENTS value) {
        this.events = value;
    }

    /**
     * ??eventwindows?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICRESPONSEONEVENT.EVENTWINDOWS }
     *     
     */
    public DIAGNOSTICRESPONSEONEVENT.EVENTWINDOWS getEVENTWINDOWS() {
        return eventwindows;
    }

    /**
     * ??eventwindows?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICRESPONSEONEVENT.EVENTWINDOWS }
     *     
     */
    public void setEVENTWINDOWS(DIAGNOSTICRESPONSEONEVENT.EVENTWINDOWS value) {
        this.eventwindows = value;
    }

    /**
     * ??responseoneventclassref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICRESPONSEONEVENT.RESPONSEONEVENTCLASSREF }
     *     
     */
    public DIAGNOSTICRESPONSEONEVENT.RESPONSEONEVENTCLASSREF getRESPONSEONEVENTCLASSREF() {
        return responseoneventclassref;
    }

    /**
     * ??responseoneventclassref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICRESPONSEONEVENT.RESPONSEONEVENTCLASSREF }
     *     
     */
    public void setRESPONSEONEVENTCLASSREF(DIAGNOSTICRESPONSEONEVENT.RESPONSEONEVENTCLASSREF value) {
        this.responseoneventclassref = value;
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
     *         &lt;element name="DIAGNOSTIC-DATA-CHANGE-TRIGGER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-CHANGE-TRIGGER"/>
     *         &lt;element name="DIAGNOSTIC-DTC-CHANGE-TRIGGER" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DTC-CHANGE-TRIGGER"/>
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
        "diagnosticdatachangetriggerOrDIAGNOSTICDTCCHANGETRIGGER"
    })
    public static class EVENTS {

        @XmlElements({
            @XmlElement(name = "DIAGNOSTIC-DATA-CHANGE-TRIGGER", type = DIAGNOSTICDATACHANGETRIGGER.class),
            @XmlElement(name = "DIAGNOSTIC-DTC-CHANGE-TRIGGER", type = DIAGNOSTICDTCCHANGETRIGGER.class)
        })
        protected List<Object> diagnosticdatachangetriggerOrDIAGNOSTICDTCCHANGETRIGGER;

        /**
         * Gets the value of the diagnosticdatachangetriggerOrDIAGNOSTICDTCCHANGETRIGGER property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticdatachangetriggerOrDIAGNOSTICDTCCHANGETRIGGER property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICDATACHANGETRIGGEROrDIAGNOSTICDTCCHANGETRIGGER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICDATACHANGETRIGGER }
         * {@link DIAGNOSTICDTCCHANGETRIGGER }
         * 
         * 
         */
        public List<Object> getDIAGNOSTICDATACHANGETRIGGEROrDIAGNOSTICDTCCHANGETRIGGER() {
            if (diagnosticdatachangetriggerOrDIAGNOSTICDTCCHANGETRIGGER == null) {
                diagnosticdatachangetriggerOrDIAGNOSTICDTCCHANGETRIGGER = new ArrayList<Object>();
            }
            return this.diagnosticdatachangetriggerOrDIAGNOSTICDTCCHANGETRIGGER;
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
     *         &lt;element name="DIAGNOSTIC-EVENT-WINDOW" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-EVENT-WINDOW"/>
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
        "diagnosticeventwindow"
    })
    public static class EVENTWINDOWS {

        @XmlElement(name = "DIAGNOSTIC-EVENT-WINDOW")
        protected List<DIAGNOSTICEVENTWINDOW> diagnosticeventwindow;

        /**
         * Gets the value of the diagnosticeventwindow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticeventwindow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICEVENTWINDOW().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICEVENTWINDOW }
         * 
         * 
         */
        public List<DIAGNOSTICEVENTWINDOW> getDIAGNOSTICEVENTWINDOW() {
            if (diagnosticeventwindow == null) {
                diagnosticeventwindow = new ArrayList<DIAGNOSTICEVENTWINDOW>();
            }
            return this.diagnosticeventwindow;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RESPONSEONEVENTCLASSREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICRESPONSEONEVENTCLASSSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
