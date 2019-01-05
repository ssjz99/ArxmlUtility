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
 * The ApplicationArrayElement may be a primitive one or a composite one. If the element is primitive, it will be mapped to the "SystemSignal" (multiplicity 1). If the ArgumentDataPrototype that is referenced by ClientServerCompositeTypeMapping is typed by an ApplicationDataType the reference to the ApplicationArrayElement shall be used. If the VariableDataPrototype is typed by the ImplementationDataType the reference to the ImplementationArrayElement shall be used. 
 * 
 * If the element is composite, there will be no mapping to the "SystemSignal" (multiplicity 0). In this case the "ArrayElementMapping" Element will aggregate the "TypeMapping" Element. In that way also the composite datatypes can be mapped to SystemSignals. 
 * 
 * Regardless whether composite or primitive array element is mapped the indexed array element always needs to be specified.
 * 
 * <p>CLIENT-SERVER-ARRAY-ELEMENT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-SERVER-ARRAY-ELEMENT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-ARRAY-ELEMENT-MAPPING"/>
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
@XmlType(name = "CLIENT-SERVER-ARRAY-ELEMENT-MAPPING", propOrder = {
    "complextypemapping",
    "indexedarrayelement",
    "systemsignalref"
})
public class CLIENTSERVERARRAYELEMENTMAPPING {

    @XmlElement(name = "COMPLEX-TYPE-MAPPING")
    protected CLIENTSERVERARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING complextypemapping;
    @XmlElement(name = "INDEXED-ARRAY-ELEMENT")
    protected INDEXEDARRAYELEMENT indexedarrayelement;
    @XmlElement(name = "SYSTEM-SIGNAL-REF")
    protected CLIENTSERVERARRAYELEMENTMAPPING.SYSTEMSIGNALREF systemsignalref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??complextypemapping?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public CLIENTSERVERARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING getCOMPLEXTYPEMAPPING() {
        return complextypemapping;
    }

    /**
     * ??complextypemapping?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING }
     *     
     */
    public void setCOMPLEXTYPEMAPPING(CLIENTSERVERARRAYELEMENTMAPPING.COMPLEXTYPEMAPPING value) {
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
     *     {@link CLIENTSERVERARRAYELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public CLIENTSERVERARRAYELEMENTMAPPING.SYSTEMSIGNALREF getSYSTEMSIGNALREF() {
        return systemsignalref;
    }

    /**
     * ??systemsignalref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERARRAYELEMENTMAPPING.SYSTEMSIGNALREF }
     *     
     */
    public void setSYSTEMSIGNALREF(CLIENTSERVERARRAYELEMENTMAPPING.SYSTEMSIGNALREF value) {
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
