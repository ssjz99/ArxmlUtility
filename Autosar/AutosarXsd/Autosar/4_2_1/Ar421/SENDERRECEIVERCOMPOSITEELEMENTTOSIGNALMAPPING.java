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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Mapping of an Variable Data Prototype which is aggregated within a composite datatype to a SystemSignal (only one element of the composite data type is mapped).
 * 
 * <p>SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SENDER-RECEIVER-COMPOSITE-ELEMENT-TO-SIGNAL-MAPPING", propOrder = {
    "communicationdirection",
    "eventgrouprefs",
    "eventhandlerrefs",
    "introduction",
    "serviceinstancerefs",
    "variationpoint",
    "dataelementiref",
    "systemsignalref",
    "typemapping"
})
public class SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING {

    @XmlElement(name = "COMMUNICATION-DIRECTION")
    protected COMMUNICATIONDIRECTIONTYPE communicationdirection;
    @XmlElement(name = "EVENT-GROUP-REFS")
    protected Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS eventgrouprefs;
    @XmlElement(name = "EVENT-HANDLER-REFS")
    protected Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS eventhandlerrefs;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "SERVICE-INSTANCE-REFS")
    protected Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS serviceinstancerefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "DATA-ELEMENT-IREF")
    protected VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF dataelementiref;
    @XmlElement(name = "SYSTEM-SIGNAL-REF")
    protected SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.SYSTEMSIGNALREF systemsignalref;
    @XmlElement(name = "TYPE-MAPPING")
    protected SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.TYPEMAPPING typemapping;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??communicationdirection?????
     * 
     * @return
     *     possible object is
     *     {@link COMMUNICATIONDIRECTIONTYPE }
     *     
     */
    public COMMUNICATIONDIRECTIONTYPE getCOMMUNICATIONDIRECTION() {
        return communicationdirection;
    }

    /**
     * ??communicationdirection?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMMUNICATIONDIRECTIONTYPE }
     *     
     */
    public void setCOMMUNICATIONDIRECTION(COMMUNICATIONDIRECTIONTYPE value) {
        this.communicationdirection = value;
    }

    /**
     * ??eventgrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS }
     *     
     */
    public Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS getEVENTGROUPREFS() {
        return eventgrouprefs;
    }

    /**
     * ??eventgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS }
     *     
     */
    public void setEVENTGROUPREFS(Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS value) {
        this.eventgrouprefs = value;
    }

    /**
     * ??eventhandlerrefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS }
     *     
     */
    public Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS getEVENTHANDLERREFS() {
        return eventhandlerrefs;
    }

    /**
     * ??eventhandlerrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS }
     *     
     */
    public void setEVENTHANDLERREFS(Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS value) {
        this.eventhandlerrefs = value;
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
     * ??serviceinstancerefs?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS }
     *     
     */
    public Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS getSERVICEINSTANCEREFS() {
        return serviceinstancerefs;
    }

    /**
     * ??serviceinstancerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS }
     *     
     */
    public void setSERVICEINSTANCEREFS(Ar421.SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS value) {
        this.serviceinstancerefs = value;
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
     * ??dataelementiref?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF }
     *     
     */
    public VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF getDATAELEMENTIREF() {
        return dataelementiref;
    }

    /**
     * ??dataelementiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF }
     *     
     */
    public void setDATAELEMENTIREF(VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF value) {
        this.dataelementiref = value;
    }

    /**
     * ??systemsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.SYSTEMSIGNALREF getSYSTEMSIGNALREF() {
        return systemsignalref;
    }

    /**
     * ??systemsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public void setSYSTEMSIGNALREF(SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.SYSTEMSIGNALREF value) {
        this.systemsignalref = value;
    }

    /**
     * ??typemapping?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.TYPEMAPPING }
     *     
     */
    public SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.TYPEMAPPING getTYPEMAPPING() {
        return typemapping;
    }

    /**
     * ??typemapping?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.TYPEMAPPING }
     *     
     */
    public void setTYPEMAPPING(SENDERRECEIVERCOMPOSITEELEMENTTOSIGNALMAPPING.TYPEMAPPING value) {
        this.typemapping = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SYSTEM-SIGNAL--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SYSTEMSIGNALREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SYSTEMSIGNALSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SYSTEMSIGNALSUBTYPESENUM }
         *     
         */
        public SYSTEMSIGNALSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SYSTEMSIGNALSUBTYPESENUM }
         *     
         */
        public void setDEST(SYSTEMSIGNALSUBTYPESENUM value) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="SENDER-REC-ARRAY-TYPE-MAPPING" type="{http://autosar.org/schema/r4.0}SENDER-REC-ARRAY-TYPE-MAPPING"/>
     *         &lt;element name="SENDER-REC-RECORD-TYPE-MAPPING" type="{http://autosar.org/schema/r4.0}SENDER-REC-RECORD-TYPE-MAPPING"/>
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
        "senderrecarraytypemappingOrSENDERRECRECORDTYPEMAPPING"
    })
    public static class TYPEMAPPING {

        @XmlElements({
            @XmlElement(name = "SENDER-REC-ARRAY-TYPE-MAPPING", type = SENDERRECARRAYTYPEMAPPING.class),
            @XmlElement(name = "SENDER-REC-RECORD-TYPE-MAPPING", type = SENDERRECRECORDTYPEMAPPING.class)
        })
        protected Object senderrecarraytypemappingOrSENDERRECRECORDTYPEMAPPING;

        /**
         * ??senderrecarraytypemappingOrSENDERRECRECORDTYPEMAPPING?????
         * 
         * @return
         *     possible object is
         *     {@link SENDERRECARRAYTYPEMAPPING }
         *     {@link SENDERRECRECORDTYPEMAPPING }
         *     
         */
        public Object getSENDERRECARRAYTYPEMAPPINGOrSENDERRECRECORDTYPEMAPPING() {
            return senderrecarraytypemappingOrSENDERRECRECORDTYPEMAPPING;
        }

        /**
         * ??senderrecarraytypemappingOrSENDERRECRECORDTYPEMAPPING?????
         * 
         * @param value
         *     allowed object is
         *     {@link SENDERRECARRAYTYPEMAPPING }
         *     {@link SENDERRECRECORDTYPEMAPPING }
         *     
         */
        public void setSENDERRECARRAYTYPEMAPPINGOrSENDERRECRECORDTYPEMAPPING(Object value) {
            this.senderrecarraytypemappingOrSENDERRECRECORDTYPEMAPPING = value;
        }

    }

}
