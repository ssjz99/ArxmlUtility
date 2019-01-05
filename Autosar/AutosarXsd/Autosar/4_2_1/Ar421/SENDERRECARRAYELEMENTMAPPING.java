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
 * The SenderRecArrayElement may be a primitive one or a composite one. If the element is primitive, it will be mapped to the SystemSignal (multiplicity 1). If the VariableDataPrototype that is referenced by SenderReceiverToSignalGroupMapping is typed by an ApplicationDataType the reference to the ApplicationArrayElement shall be used. If the VariableDataPrototype is typed by the ImplementationDataType the reference to the ImplementationArrayElement shall be used. 
 * 
 * If the element is composite, there will be no mapping to the SystemSignal (multiplicity 0). In this case the ArrayElementMapping element will aggregate the TypeMapping element. In that way also the composite datatypes can be mapped to SystemSignals. 
 * 
 * Regardless whether composite or primitive array element is mapped the indexed element always needs to be specified.
 * 
 * <p>SENDER-REC-ARRAY-ELEMENT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SENDER-REC-ARRAY-ELEMENT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SENDER-REC-ARRAY-ELEMENT-MAPPING"/>
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
@XmlType(name = "SENDER-REC-ARRAY-ELEMENT-MAPPING", propOrder = {
    "complextypemapping",
    "indexedarrayelement",
    "systemsignalref"
})
public class SENDERRECARRAYELEMENTMAPPING {

    @XmlElement(name = "COMPLEX-TYPE-MAPPING")
    protected SENDERRECARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING complextypemapping;
    @XmlElement(name = "INDEXED-ARRAY-ELEMENT")
    protected INDEXEDARRAYELEMENT indexedarrayelement;
    @XmlElement(name = "SYSTEM-SIGNAL-REF")
    protected SENDERRECARRAYELEMENTMAPPING.SYSTEMSIGNALREF systemsignalref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??complextypemapping?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public SENDERRECARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING getCOMPLEXTYPEMAPPING() {
        return complextypemapping;
    }

    /**
     * ??complextypemapping?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public void setCOMPLEXTYPEMAPPING(SENDERRECARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING value) {
        this.complextypemapping = value;
    }

    /**
     * ??indexedarrayelement?????
     * 
     * @return
     *     possible object is
     *     {@link INDEXEDARRAYELEMENT }
     *     
     */
    public INDEXEDARRAYELEMENT getINDEXEDARRAYELEMENT() {
        return indexedarrayelement;
    }

    /**
     * ??indexedarrayelement?????
     * 
     * @param value
     *     allowed object is
     *     {@link INDEXEDARRAYELEMENT }
     *     
     */
    public void setINDEXEDARRAYELEMENT(INDEXEDARRAYELEMENT value) {
        this.indexedarrayelement = value;
    }

    /**
     * ??systemsignalref?????
     * 
     * @return
     *     possible object is
     *     {@link SENDERRECARRAYELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public SENDERRECARRAYELEMENTMAPPING.SYSTEMSIGNALREF getSYSTEMSIGNALREF() {
        return systemsignalref;
    }

    /**
     * ??systemsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SENDERRECARRAYELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public void setSYSTEMSIGNALREF(SENDERRECARRAYELEMENTMAPPING.SYSTEMSIGNALREF value) {
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
