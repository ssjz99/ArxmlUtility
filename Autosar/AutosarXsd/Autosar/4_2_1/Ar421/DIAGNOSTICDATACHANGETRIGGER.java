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
 * This represents the ability to define a trigger based on the change of a given DiagnosticDataIdentifier.
 * 
 * <p>DIAGNOSTIC-DATA-CHANGE-TRIGGER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-DATA-CHANGE-TRIGGER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-RESPONSE-ON-EVENT-TRIGGER"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-CHANGE-TRIGGER"/>
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
@XmlType(name = "DIAGNOSTIC-DATA-CHANGE-TRIGGER", propOrder = {
    "initialeventstatus",
    "dataidentifierref"
})
public class DIAGNOSTICDATACHANGETRIGGER {

    @XmlElement(name = "INITIAL-EVENT-STATUS")
    protected DIAGNOSTICINITIALEVENTSTATUSENUM initialeventstatus;
    @XmlElement(name = "DATA-IDENTIFIER-REF")
    protected DIAGNOSTICDATACHANGETRIGGER.DATAIDENTIFIERREF dataidentifierref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??initialeventstatus?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICINITIALEVENTSTATUSENUM }
     *     
     */
    public DIAGNOSTICINITIALEVENTSTATUSENUM getINITIALEVENTSTATUS() {
        return initialeventstatus;
    }

    /**
     * ??initialeventstatus?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICINITIALEVENTSTATUSENUM }
     *     
     */
    public void setINITIALEVENTSTATUS(DIAGNOSTICINITIALEVENTSTATUSENUM value) {
        this.initialeventstatus = value;
    }

    /**
     * ??dataidentifierref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICDATACHANGETRIGGER.DATAIDENTIFIERREF }
     *     
     */
    public DIAGNOSTICDATACHANGETRIGGER.DATAIDENTIFIERREF getDATAIDENTIFIERREF() {
        return dataidentifierref;
    }

    /**
     * ??dataidentifierref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICDATACHANGETRIGGER.DATAIDENTIFIERREF }
     *     
     */
    public void setDATAIDENTIFIERREF(DIAGNOSTICDATACHANGETRIGGER.DATAIDENTIFIERREF value) {
        this.dataidentifierref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DATA-IDENTIFIER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATAIDENTIFIERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM }
         *     
         */
        public DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM }
         *     
         */
        public void setDEST(DIAGNOSTICDATAIDENTIFIERSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
