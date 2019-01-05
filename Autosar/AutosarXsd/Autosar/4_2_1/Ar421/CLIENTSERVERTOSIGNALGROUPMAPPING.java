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
 * This mapping is deprecated and will be removed in future. It is replaced by the ClientServerToSignalMapping.
 * 
 * Old description:
 * Mapping of client server operation arguments to signals of a signal group. Arguments with a primitive datatype will be mapped via the "ClientServerPrimitiveTypeMapping" element. 
 * Arguments with composite datatypes will be mapped via the "CompositeTypeMapping" element.
 * 
 * <p>CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING"/>
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
@XmlType(name = "CLIENT-SERVER-TO-SIGNAL-GROUP-MAPPING", propOrder = {
    "communicationdirection",
    "eventgrouprefs",
    "eventhandlerrefs",
    "introduction",
    "serviceinstancerefs",
    "variationpoint",
    "applicationerror",
    "clientid",
    "compositetypemappings",
    "emptysignal",
    "mappedoperationiref",
    "primitivetypemappings",
    "requestgroupref",
    "responsegroupref",
    "sequencecounter"
})
public class CLIENTSERVERTOSIGNALGROUPMAPPING {

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
    @XmlElement(name = "APPLICATION-ERROR")
    protected APPLICATIONERRORMAPPING applicationerror;
    @XmlElement(name = "CLIENT-ID")
    protected CLIENTIDMAPPING clientid;
    @XmlElement(name = "COMPOSITE-TYPE-MAPPINGS")
    protected CLIENTSERVERTOSIGNALGROUPMAPPING.COMPOSITETYPEMAPPINGS compositetypemappings;
    @XmlElement(name = "EMPTY-SIGNAL")
    protected EMPTYSIGNALMAPPING emptysignal;
    @XmlElement(name = "MAPPED-OPERATION-IREF")
    protected OPERATIONINSYSTEMINSTANCEREF mappedoperationiref;
    @XmlElement(name = "PRIMITIVE-TYPE-MAPPINGS")
    protected CLIENTSERVERTOSIGNALGROUPMAPPING.PRIMITIVETYPEMAPPINGS primitivetypemappings;
    @XmlElement(name = "REQUEST-GROUP-REF")
    protected CLIENTSERVERTOSIGNALGROUPMAPPING.REQUESTGROUPREF requestgroupref;
    @XmlElement(name = "RESPONSE-GROUP-REF")
    protected CLIENTSERVERTOSIGNALGROUPMAPPING.RESPONSEGROUPREF responsegroupref;
    @XmlElement(name = "SEQUENCE-COUNTER")
    protected SEQUENCECOUNTERMAPPING sequencecounter;
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
     * ??applicationerror?????
     * 
     * @return
     *     possible object is
     *     {@link APPLICATIONERRORMAPPING }
     *     
     */
    public APPLICATIONERRORMAPPING getAPPLICATIONERROR() {
        return applicationerror;
    }

    /**
     * ??applicationerror?????
     * 
     * @param value
     *     allowed object is
     *     {@link APPLICATIONERRORMAPPING }
     *     
     */
    public void setAPPLICATIONERROR(APPLICATIONERRORMAPPING value) {
        this.applicationerror = value;
    }

    /**
     * ??clientid?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTIDMAPPING }
     *     
     */
    public CLIENTIDMAPPING getCLIENTID() {
        return clientid;
    }

    /**
     * ??clientid?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTIDMAPPING }
     *     
     */
    public void setCLIENTID(CLIENTIDMAPPING value) {
        this.clientid = value;
    }

    /**
     * ??compositetypemappings?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.COMPOSITETYPEMAPPINGS }
     *     
     */
    public CLIENTSERVERTOSIGNALGROUPMAPPING.COMPOSITETYPEMAPPINGS getCOMPOSITETYPEMAPPINGS() {
        return compositetypemappings;
    }

    /**
     * ??compositetypemappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.COMPOSITETYPEMAPPINGS }
     *     
     */
    public void setCOMPOSITETYPEMAPPINGS(CLIENTSERVERTOSIGNALGROUPMAPPING.COMPOSITETYPEMAPPINGS value) {
        this.compositetypemappings = value;
    }

    /**
     * ??emptysignal?????
     * 
     * @return
     *     possible object is
     *     {@link EMPTYSIGNALMAPPING }
     *     
     */
    public EMPTYSIGNALMAPPING getEMPTYSIGNAL() {
        return emptysignal;
    }

    /**
     * ??emptysignal?????
     * 
     * @param value
     *     allowed object is
     *     {@link EMPTYSIGNALMAPPING }
     *     
     */
    public void setEMPTYSIGNAL(EMPTYSIGNALMAPPING value) {
        this.emptysignal = value;
    }

    /**
     * ??mappedoperationiref?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF }
     *     
     */
    public OPERATIONINSYSTEMINSTANCEREF getMAPPEDOPERATIONIREF() {
        return mappedoperationiref;
    }

    /**
     * ??mappedoperationiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF }
     *     
     */
    public void setMAPPEDOPERATIONIREF(OPERATIONINSYSTEMINSTANCEREF value) {
        this.mappedoperationiref = value;
    }

    /**
     * ??primitivetypemappings?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.PRIMITIVETYPEMAPPINGS }
     *     
     */
    public CLIENTSERVERTOSIGNALGROUPMAPPING.PRIMITIVETYPEMAPPINGS getPRIMITIVETYPEMAPPINGS() {
        return primitivetypemappings;
    }

    /**
     * ??primitivetypemappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.PRIMITIVETYPEMAPPINGS }
     *     
     */
    public void setPRIMITIVETYPEMAPPINGS(CLIENTSERVERTOSIGNALGROUPMAPPING.PRIMITIVETYPEMAPPINGS value) {
        this.primitivetypemappings = value;
    }

    /**
     * ??requestgroupref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.REQUESTGROUPREF }
     *     
     */
    public CLIENTSERVERTOSIGNALGROUPMAPPING.REQUESTGROUPREF getREQUESTGROUPREF() {
        return requestgroupref;
    }

    /**
     * ??requestgroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.REQUESTGROUPREF }
     *     
     */
    public void setREQUESTGROUPREF(CLIENTSERVERTOSIGNALGROUPMAPPING.REQUESTGROUPREF value) {
        this.requestgroupref = value;
    }

    /**
     * ??responsegroupref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.RESPONSEGROUPREF }
     *     
     */
    public CLIENTSERVERTOSIGNALGROUPMAPPING.RESPONSEGROUPREF getRESPONSEGROUPREF() {
        return responsegroupref;
    }

    /**
     * ??responsegroupref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERTOSIGNALGROUPMAPPING.RESPONSEGROUPREF }
     *     
     */
    public void setRESPONSEGROUPREF(CLIENTSERVERTOSIGNALGROUPMAPPING.RESPONSEGROUPREF value) {
        this.responsegroupref = value;
    }

    /**
     * ??sequencecounter?????
     * 
     * @return
     *     possible object is
     *     {@link SEQUENCECOUNTERMAPPING }
     *     
     */
    public SEQUENCECOUNTERMAPPING getSEQUENCECOUNTER() {
        return sequencecounter;
    }

    /**
     * ??sequencecounter?????
     * 
     * @param value
     *     allowed object is
     *     {@link SEQUENCECOUNTERMAPPING }
     *     
     */
    public void setSEQUENCECOUNTER(SEQUENCECOUNTERMAPPING value) {
        this.sequencecounter = value;
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
     *         &lt;element name="CLIENT-SERVER-ARRAY-TYPE-MAPPING" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-ARRAY-TYPE-MAPPING"/>
     *         &lt;element name="CLIENT-SERVER-RECORD-TYPE-MAPPING" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-RECORD-TYPE-MAPPING"/>
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
        "clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING"
    })
    public static class COMPOSITETYPEMAPPINGS {

        @XmlElements({
            @XmlElement(name = "CLIENT-SERVER-ARRAY-TYPE-MAPPING", type = CLIENTSERVERARRAYTYPEMAPPING.class),
            @XmlElement(name = "CLIENT-SERVER-RECORD-TYPE-MAPPING", type = CLIENTSERVERRECORDTYPEMAPPING.class)
        })
        protected List<Object> clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING;

        /**
         * Gets the value of the clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTSERVERARRAYTYPEMAPPINGOrCLIENTSERVERRECORDTYPEMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CLIENTSERVERARRAYTYPEMAPPING }
         * {@link CLIENTSERVERRECORDTYPEMAPPING }
         * 
         * 
         */
        public List<Object> getCLIENTSERVERARRAYTYPEMAPPINGOrCLIENTSERVERRECORDTYPEMAPPING() {
            if (clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING == null) {
                clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING = new ArrayList<Object>();
            }
            return this.clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING;
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
     *         &lt;element name="CLIENT-SERVER-PRIMITIVE-TYPE-MAPPING" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-PRIMITIVE-TYPE-MAPPING"/>
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
        "clientserverprimitivetypemapping"
    })
    public static class PRIMITIVETYPEMAPPINGS {

        @XmlElement(name = "CLIENT-SERVER-PRIMITIVE-TYPE-MAPPING")
        protected List<CLIENTSERVERPRIMITIVETYPEMAPPING> clientserverprimitivetypemapping;

        /**
         * Gets the value of the clientserverprimitivetypemapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientserverprimitivetypemapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTSERVERPRIMITIVETYPEMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CLIENTSERVERPRIMITIVETYPEMAPPING }
         * 
         * 
         */
        public List<CLIENTSERVERPRIMITIVETYPEMAPPING> getCLIENTSERVERPRIMITIVETYPEMAPPING() {
            if (clientserverprimitivetypemapping == null) {
                clientserverprimitivetypemapping = new ArrayList<CLIENTSERVERPRIMITIVETYPEMAPPING>();
            }
            return this.clientserverprimitivetypemapping;
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
    public static class REQUESTGROUPREF
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
    public static class RESPONSEGROUPREF
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

}
