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
 * Mapping of a primitive record element to a SystemSignal. If the VariableDataPrototype that is referenced by SenderReceiverToSignalGroupMapping is typed by an ApplicationDataType the reference applicationRecordElement shall be used. If the VariableDataPrototype is typed by the ImplementationDataType the reference implementationRecordElement shall be used. Either the implementationRecordElement or applicationRecordElement reference shall be used. 
 * 
 * If the element is composite, there will be no mapping to the SystemSignal (multiplicity 0). In this case the RecordElementMapping element will aggregate the complexTypeMapping element. In that way also the composite datatypes can be mapped to SystemSignals.
 * 
 * <p>SENDER-REC-RECORD-ELEMENT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SENDER-REC-RECORD-ELEMENT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-REC-RECORD-ELEMENT-MAPPING"/>
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
@XmlType(name = "SENDER-REC-RECORD-ELEMENT-MAPPING", propOrder = {
    "applicationrecordelementref",
    "complextypemapping",
    "implementationrecordelementref",
    "systemsignalref"
})
public class SENDERRECRECORDELEMENTMAPPING {

    @XmlElement(name = "APPLICATION-RECORD-ELEMENT-REF")
    protected SENDERRECRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF applicationrecordelementref;
    @XmlElement(name = "COMPLEX-TYPE-MAPPING")
    protected SENDERRECRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING complextypemapping;
    @XmlElement(name = "IMPLEMENTATION-RECORD-ELEMENT-REF")
    protected SENDERRECRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF implementationrecordelementref;
    @XmlElement(name = "SYSTEM-SIGNAL-REF")
    protected SENDERRECRECORDELEMENTMAPPING.SYSTEMSIGNALREF systemsignalref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??applicationrecordelementref?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF }
     *     
     */
    public SENDERRECRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF getAPPLICATIONRECORDELEMENTREF() {
        return applicationrecordelementref;
    }

    /**
     * ??applicationrecordelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF }
     *     
     */
    public void setAPPLICATIONRECORDELEMENTREF(SENDERRECRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF value) {
        this.applicationrecordelementref = value;
    }

    /**
     * ??complextypemapping?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public SENDERRECRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING getCOMPLEXTYPEMAPPING() {
        return complextypemapping;
    }

    /**
     * ??complextypemapping?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public void setCOMPLEXTYPEMAPPING(SENDERRECRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING value) {
        this.complextypemapping = value;
    }

    /**
     * ??implementationrecordelementref?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF }
     *     
     */
    public SENDERRECRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF getIMPLEMENTATIONRECORDELEMENTREF() {
        return implementationrecordelementref;
    }

    /**
     * ??implementationrecordelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF }
     *     
     */
    public void setIMPLEMENTATIONRECORDELEMENTREF(SENDERRECRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF value) {
        this.implementationrecordelementref = value;
    }

    /**
     * ??systemsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public SENDERRECRECORDELEMENTMAPPING.SYSTEMSIGNALREF getSYSTEMSIGNALREF() {
        return systemsignalref;
    }

    /**
     * ??systemsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECRECORDELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public void setSYSTEMSIGNALREF(SENDERRECRECORDELEMENTMAPPING.SYSTEMSIGNALREF value) {
        this.systemsignalref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-RECORD-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class APPLICATIONRECORDELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONRECORDELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONRECORDELEMENTSUBTYPESENUM }
         *     
         */
        public APPLICATIONRECORDELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONRECORDELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONRECORDELEMENTSUBTYPESENUM value) {
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
    public static class COMPLEXTYPEMAPPING {

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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IMPLEMENTATIONRECORDELEMENTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM value) {
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

}
