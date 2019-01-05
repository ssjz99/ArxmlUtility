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
import javax.xml.bind.annotation.XmlType;


/**
 * This element maps the ClientServerOperation to call- and return-SystemSignals. The serialization is defined by the referenced SerializationTechnology.
 * 
 * <p>CLIENT-SERVER-TO-SIGNAL-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-SERVER-TO-SIGNAL-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DATA-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-TO-SIGNAL-MAPPING"/>
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
@XmlType(name = "CLIENT-SERVER-TO-SIGNAL-MAPPING", propOrder = {
    "communicationdirection",
    "eventgrouprefs",
    "eventhandlerrefs",
    "introduction",
    "serviceinstancerefs",
    "variationpoint",
    "callsignalref",
    "clientserveroperationiref",
    "lengthclientid",
    "lengthsequencecounter",
    "returnsignalref",
    "serializerref"
})
public class CLIENTSERVERTOSIGNALMAPPING {

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
    @XmlElement(name = "CALL-SIGNAL-REF")
    protected CLIENTSERVERTOSIGNALMAPPING.CALLSIGNALREF callsignalref;
    @XmlElement(name = "CLIENT-SERVER-OPERATION-IREF")
    protected OPERATIONINSYSTEMINSTANCEREF clientserveroperationiref;
    @XmlElement(name = "LENGTH-CLIENT-ID")
    protected POSITIVEINTEGER lengthclientid;
    @XmlElement(name = "LENGTH-SEQUENCE-COUNTER")
    protected POSITIVEINTEGER lengthsequencecounter;
    @XmlElement(name = "RETURN-SIGNAL-REF")
    protected CLIENTSERVERTOSIGNALMAPPING.RETURNSIGNALREF returnsignalref;
    @XmlElement(name = "SERIALIZER-REF")
    protected CLIENTSERVERTOSIGNALMAPPING.SERIALIZERREF serializerref;
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
     * ??callsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERTOSIGNALMAPPING.CALLSIGNALREF }
     *     
     */
    public CLIENTSERVERTOSIGNALMAPPING.CALLSIGNALREF getCALLSIGNALREF() {
        return callsignalref;
    }

    /**
     * ??callsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERTOSIGNALMAPPING.CALLSIGNALREF }
     *     
     */
    public void setCALLSIGNALREF(CLIENTSERVERTOSIGNALMAPPING.CALLSIGNALREF value) {
        this.callsignalref = value;
    }

    /**
     * ??clientserveroperationiref?????
     * 
     * @return
     *     possible object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF }
     *     
     */
    public OPERATIONINSYSTEMINSTANCEREF getCLIENTSERVEROPERATIONIREF() {
        return clientserveroperationiref;
    }

    /**
     * ??clientserveroperationiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link OPERATIONINSYSTEMINSTANCEREF }
     *     
     */
    public void setCLIENTSERVEROPERATIONIREF(OPERATIONINSYSTEMINSTANCEREF value) {
        this.clientserveroperationiref = value;
    }

    /**
     * ??lengthclientid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getLENGTHCLIENTID() {
        return lengthclientid;
    }

    /**
     * ??lengthclientid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setLENGTHCLIENTID(POSITIVEINTEGER value) {
        this.lengthclientid = value;
    }

    /**
     * ??lengthsequencecounter?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getLENGTHSEQUENCECOUNTER() {
        return lengthsequencecounter;
    }

    /**
     * ??lengthsequencecounter?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setLENGTHSEQUENCECOUNTER(POSITIVEINTEGER value) {
        this.lengthsequencecounter = value;
    }

    /**
     * ??returnsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERTOSIGNALMAPPING.RETURNSIGNALREF }
     *     
     */
    public CLIENTSERVERTOSIGNALMAPPING.RETURNSIGNALREF getRETURNSIGNALREF() {
        return returnsignalref;
    }

    /**
     * ??returnsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERTOSIGNALMAPPING.RETURNSIGNALREF }
     *     
     */
    public void setRETURNSIGNALREF(CLIENTSERVERTOSIGNALMAPPING.RETURNSIGNALREF value) {
        this.returnsignalref = value;
    }

    /**
     * ??serializerref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERTOSIGNALMAPPING.SERIALIZERREF }
     *     
     */
    public CLIENTSERVERTOSIGNALMAPPING.SERIALIZERREF getSERIALIZERREF() {
        return serializerref;
    }

    /**
     * ??serializerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERTOSIGNALMAPPING.SERIALIZERREF }
     *     
     */
    public void setSERIALIZERREF(CLIENTSERVERTOSIGNALMAPPING.SERIALIZERREF value) {
        this.serializerref = value;
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
    public static class CALLSIGNALREF
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
    public static class RETURNSIGNALREF
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SERIALIZATION-TECHNOLOGY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SERIALIZERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected SERIALIZATIONTECHNOLOGYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SERIALIZATIONTECHNOLOGYSUBTYPESENUM }
         *     
         */
        public SERIALIZATIONTECHNOLOGYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SERIALIZATIONTECHNOLOGYSUBTYPESENUM }
         *     
         */
        public void setDEST(SERIALIZATIONTECHNOLOGYSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
