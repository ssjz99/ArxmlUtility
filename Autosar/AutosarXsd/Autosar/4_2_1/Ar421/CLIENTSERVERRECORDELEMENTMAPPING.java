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
 * Mapping of a primitive record element to a SystemSignal. If the ArgumentDataPrototype that is referenced by ClientServerCompositeTypeMapping is typed by an ApplicationDataType the reference to the ApplicationRecordElement shall be used. If the VariableDataPrototype is typed by the ImplementationDataType the reference to the ImplementationRecordElement shall be used. 
 * 
 * If the element is composite, there will be no mapping (multiplicity 0). In this case the "RecordElementMapping" Element will aggregate the "TypeMapping" Element. In that way also the composite datatypes can be mapped to SystemSignals. 
 * 
 * Regardless whether composite or primitive record element is mapped the record element always needs to be specified.
 * 
 * <p>CLIENT-SERVER-RECORD-ELEMENT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-SERVER-RECORD-ELEMENT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-RECORD-ELEMENT-MAPPING"/>
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
@XmlType(name = "CLIENT-SERVER-RECORD-ELEMENT-MAPPING", propOrder = {
    "applicationrecordelementref",
    "complextypemapping",
    "implementationrecordelementref",
    "systemsignalref"
})
public class CLIENTSERVERRECORDELEMENTMAPPING {

    @XmlElement(name = "APPLICATION-RECORD-ELEMENT-REF")
    protected CLIENTSERVERRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF applicationrecordelementref;
    @XmlElement(name = "COMPLEX-TYPE-MAPPING")
    protected CLIENTSERVERRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING complextypemapping;
    @XmlElement(name = "IMPLEMENTATION-RECORD-ELEMENT-REF")
    protected CLIENTSERVERRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF implementationrecordelementref;
    @XmlElement(name = "SYSTEM-SIGNAL-REF")
    protected CLIENTSERVERRECORDELEMENTMAPPING.SYSTEMSIGNALREF systemsignalref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??applicationrecordelementref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF }
     *     
     */
    public CLIENTSERVERRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF getAPPLICATIONRECORDELEMENTREF() {
        return applicationrecordelementref;
    }

    /**
     * ??applicationrecordelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF }
     *     
     */
    public void setAPPLICATIONRECORDELEMENTREF(CLIENTSERVERRECORDELEMENTMAPPING.APPLICATIONRECORDELEMENTREF value) {
        this.applicationrecordelementref = value;
    }

    /**
     * ??complextypemapping?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public CLIENTSERVERRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING getCOMPLEXTYPEMAPPING() {
        return complextypemapping;
    }

    /**
     * ??complextypemapping?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public void setCOMPLEXTYPEMAPPING(CLIENTSERVERRECORDELEMENTMAPPING.COMPLEXTYPEMAPPING value) {
        this.complextypemapping = value;
    }

    /**
     * ??implementationrecordelementref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF }
     *     
     */
    public CLIENTSERVERRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF getIMPLEMENTATIONRECORDELEMENTREF() {
        return implementationrecordelementref;
    }

    /**
     * ??implementationrecordelementref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF }
     *     
     */
    public void setIMPLEMENTATIONRECORDELEMENTREF(CLIENTSERVERRECORDELEMENTMAPPING.IMPLEMENTATIONRECORDELEMENTREF value) {
        this.implementationrecordelementref = value;
    }

    /**
     * ??systemsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public CLIENTSERVERRECORDELEMENTMAPPING.SYSTEMSIGNALREF getSYSTEMSIGNALREF() {
        return systemsignalref;
    }

    /**
     * ??systemsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERRECORDELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public void setSYSTEMSIGNALREF(CLIENTSERVERRECORDELEMENTMAPPING.SYSTEMSIGNALREF value) {
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
    public static class COMPLEXTYPEMAPPING {

        @XmlElements({
            @XmlElement(name = "CLIENT-SERVER-ARRAY-TYPE-MAPPING", type = CLIENTSERVERARRAYTYPEMAPPING.class),
            @XmlElement(name = "CLIENT-SERVER-RECORD-TYPE-MAPPING", type = CLIENTSERVERRECORDTYPEMAPPING.class)
        })
        protected Object clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING;

        /**
         * ??clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING?????
         * 
         * @return
         *     possible object is
         *     {@link CLIENTSERVERARRAYTYPEMAPPING }
         *     {@link CLIENTSERVERRECORDTYPEMAPPING }
         *     
         */
        public Object getCLIENTSERVERARRAYTYPEMAPPINGOrCLIENTSERVERRECORDTYPEMAPPING() {
            return clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING;
        }

        /**
         * ??clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING?????
         * 
         * @param value
         *     allowed object is
         *     {@link CLIENTSERVERARRAYTYPEMAPPING }
         *     {@link CLIENTSERVERRECORDTYPEMAPPING }
         *     
         */
        public void setCLIENTSERVERARRAYTYPEMAPPINGOrCLIENTSERVERRECORDTYPEMAPPING(Object value) {
            this.clientserverarraytypemappingOrCLIENTSERVERRECORDTYPEMAPPING = value;
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
