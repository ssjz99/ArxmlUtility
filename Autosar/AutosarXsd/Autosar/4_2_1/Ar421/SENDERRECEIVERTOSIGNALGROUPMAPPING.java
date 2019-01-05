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
 * Mapping of a sender receiver communication data element with a composite datatype to a signal group.
 * 
 * <p>SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING"/>
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
@XmlType(name = "SENDER-RECEIVER-TO-SIGNAL-GROUP-MAPPING", propOrder = {
    "communicationdirection",
    "eventgrouprefs",
    "eventhandlerrefs",
    "introduction",
    "serviceinstancerefs",
    "variationpoint",
    "dataelementiref",
    "signalgroupref",
    "typemapping"
})
public class SENDERRECEIVERTOSIGNALGROUPMAPPING {

    @XmlElement(name = "COMMUNICATION-DIRECTION")
    protected COMMUNICATIONDIRECTIONTYPE communicationdirection;
    @XmlElement(name = "EVENT-GROUP-REFS")
    protected SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS eventgrouprefs;
    @XmlElement(name = "EVENT-HANDLER-REFS")
    protected SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS eventhandlerrefs;
    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "SERVICE-INSTANCE-REFS")
    protected SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS serviceinstancerefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "DATA-ELEMENT-IREF")
    protected VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF dataelementiref;
    @XmlElement(name = "SIGNAL-GROUP-REF")
    protected SENDERRECEIVERTOSIGNALGROUPMAPPING.SIGNALGROUPREF signalgroupref;
    @XmlElement(name = "TYPE-MAPPING")
    protected SENDERRECEIVERTOSIGNALGROUPMAPPING.TYPEMAPPING typemapping;
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
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS }
     *     
     */
    public SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS getEVENTGROUPREFS() {
        return eventgrouprefs;
    }

    /**
     * ??eventgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS }
     *     
     */
    public void setEVENTGROUPREFS(SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS value) {
        this.eventgrouprefs = value;
    }

    /**
     * ??eventhandlerrefs?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS }
     *     
     */
    public SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS getEVENTHANDLERREFS() {
        return eventhandlerrefs;
    }

    /**
     * ??eventhandlerrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS }
     *     
     */
    public void setEVENTHANDLERREFS(SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS value) {
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
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS }
     *     
     */
    public SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS getSERVICEINSTANCEREFS() {
        return serviceinstancerefs;
    }

    /**
     * ??serviceinstancerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS }
     *     
     */
    public void setSERVICEINSTANCEREFS(SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS value) {
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
     * ??signalgroupref?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.SIGNALGROUPREF }
     *     
     */
    public SENDERRECEIVERTOSIGNALGROUPMAPPING.SIGNALGROUPREF getSIGNALGROUPREF() {
        return signalgroupref;
    }

    /**
     * ??signalgroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.SIGNALGROUPREF }
     *     
     */
    public void setSIGNALGROUPREF(SENDERRECEIVERTOSIGNALGROUPMAPPING.SIGNALGROUPREF value) {
        this.signalgroupref = value;
    }

    /**
     * ??typemapping?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.TYPEMAPPING }
     *     
     */
    public SENDERRECEIVERTOSIGNALGROUPMAPPING.TYPEMAPPING getTYPEMAPPING() {
        return typemapping;
    }

    /**
     * ??typemapping?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.TYPEMAPPING }
     *     
     */
    public void setTYPEMAPPING(SENDERRECEIVERTOSIGNALGROUPMAPPING.TYPEMAPPING value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="EVENT-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSUMED-EVENT-GROUP--SUBTYPES-ENUM" />
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
        "eventgroupref"
    })
    public static class EVENTGROUPREFS {

        @XmlElement(name = "EVENT-GROUP-REF")
        protected List<SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS.EVENTGROUPREF> eventgroupref;

        /**
         * Gets the value of the eventgroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventgroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEVENTGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS.EVENTGROUPREF }
         * 
         * 
         */
        public List<SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS.EVENTGROUPREF> getEVENTGROUPREF() {
            if (eventgroupref == null) {
                eventgroupref = new ArrayList<SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTGROUPREFS.EVENTGROUPREF>();
            }
            return this.eventgroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSUMED-EVENT-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EVENTGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CONSUMEDEVENTGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CONSUMEDEVENTGROUPSUBTYPESENUM }
             *     
             */
            public CONSUMEDEVENTGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CONSUMEDEVENTGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(CONSUMEDEVENTGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="EVENT-HANDLER-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EVENT-HANDLER--SUBTYPES-ENUM" />
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
        "eventhandlerref"
    })
    public static class EVENTHANDLERREFS {

        @XmlElement(name = "EVENT-HANDLER-REF")
        protected List<SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS.EVENTHANDLERREF> eventhandlerref;

        /**
         * Gets the value of the eventhandlerref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventhandlerref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEVENTHANDLERREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS.EVENTHANDLERREF }
         * 
         * 
         */
        public List<SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS.EVENTHANDLERREF> getEVENTHANDLERREF() {
            if (eventhandlerref == null) {
                eventhandlerref = new ArrayList<SENDERRECEIVERTOSIGNALGROUPMAPPING.EVENTHANDLERREFS.EVENTHANDLERREF>();
            }
            return this.eventhandlerref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EVENT-HANDLER--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EVENTHANDLERREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EVENTHANDLERSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EVENTHANDLERSUBTYPESENUM }
             *     
             */
            public EVENTHANDLERSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EVENTHANDLERSUBTYPESENUM }
             *     
             */
            public void setDEST(EVENTHANDLERSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="SERVICE-INSTANCE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-SERVICE-INSTANCE--SUBTYPES-ENUM" />
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
        "serviceinstanceref"
    })
    public static class SERVICEINSTANCEREFS {

        @XmlElement(name = "SERVICE-INSTANCE-REF")
        protected List<SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS.SERVICEINSTANCEREF> serviceinstanceref;

        /**
         * Gets the value of the serviceinstanceref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceinstanceref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSERVICEINSTANCEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS.SERVICEINSTANCEREF }
         * 
         * 
         */
        public List<SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS.SERVICEINSTANCEREF> getSERVICEINSTANCEREF() {
            if (serviceinstanceref == null) {
                serviceinstanceref = new ArrayList<SENDERRECEIVERTOSIGNALGROUPMAPPING.SERVICEINSTANCEREFS.SERVICEINSTANCEREF>();
            }
            return this.serviceinstanceref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-SERVICE-INSTANCE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SERVICEINSTANCEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ABSTRACTSERVICEINSTANCESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ABSTRACTSERVICEINSTANCESUBTYPESENUM }
             *     
             */
            public ABSTRACTSERVICEINSTANCESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ABSTRACTSERVICEINSTANCESUBTYPESENUM }
             *     
             */
            public void setDEST(ABSTRACTSERVICEINSTANCESUBTYPESENUM value) {
                this.dest = value;
            }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SYSTEM-SIGNAL-GROUP--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SIGNALGROUPREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SYSTEMSIGNALGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SYSTEMSIGNALGROUPSUBTYPESENUM }
         *     
         */
        public SYSTEMSIGNALGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SYSTEMSIGNALGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(SYSTEMSIGNALGROUPSUBTYPESENUM value) {
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
