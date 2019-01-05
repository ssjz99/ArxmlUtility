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
 * This represents the ability to add further attributes to the definition of a specific channel that is subject to the diagnostic service "communication control".
 * 
 * <p>DIAGNOSTIC-COM-CONTROL-SPECIFIC-CHANNEL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-COM-CONTROL-SPECIFIC-CHANNEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COM-CONTROL-SPECIFIC-CHANNEL"/>
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
@XmlType(name = "DIAGNOSTIC-COM-CONTROL-SPECIFIC-CHANNEL", propOrder = {
    "specificchannelref",
    "subnetnumber"
})
public class DIAGNOSTICCOMCONTROLSPECIFICCHANNEL {

    @XmlElement(name = "SPECIFIC-CHANNEL-REF")
    protected DIAGNOSTICCOMCONTROLSPECIFICCHANNEL.SPECIFICCHANNELREF specificchannelref;
    @XmlElement(name = "SUBNET-NUMBER")
    protected POSITIVEINTEGER subnetnumber;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??specificchannelref?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCOMCONTROLSPECIFICCHANNEL.SPECIFICCHANNELREF }
     *     
     */
    public DIAGNOSTICCOMCONTROLSPECIFICCHANNEL.SPECIFICCHANNELREF getSPECIFICCHANNELREF() {
        return specificchannelref;
    }

    /**
     * ??specificchannelref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCOMCONTROLSPECIFICCHANNEL.SPECIFICCHANNELREF }
     *     
     */
    public void setSPECIFICCHANNELREF(DIAGNOSTICCOMCONTROLSPECIFICCHANNEL.SPECIFICCHANNELREF value) {
        this.specificchannelref = value;
    }

    /**
     * ??subnetnumber?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSUBNETNUMBER() {
        return subnetnumber;
    }

    /**
     * ??subnetnumber?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSUBNETNUMBER(POSITIVEINTEGER value) {
        this.subnetnumber = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}COMMUNICATION-CLUSTER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SPECIFICCHANNELREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected COMMUNICATIONCLUSTERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
         *     
         */
        public COMMUNICATIONCLUSTERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link COMMUNICATIONCLUSTERSUBTYPESENUM }
         *     
         */
        public void setDEST(COMMUNICATIONCLUSTERSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
