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
 * If a RunnableEntity owns an ExternalTriggeringPoint it is entitled to raise an ExternalTriggerOccurredEvent.
 * 
 * <p>EXTERNAL-TRIGGERING-POINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EXTERNAL-TRIGGERING-POINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXTERNAL-TRIGGERING-POINT"/>
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
@XmlType(name = "EXTERNAL-TRIGGERING-POINT", propOrder = {
    "ident",
    "triggeriref",
    "variationpoint"
})
public class EXTERNALTRIGGERINGPOINT {

    @XmlElement(name = "IDENT")
    protected EXTERNALTRIGGERINGPOINTIDENT ident;
    @XmlElement(name = "TRIGGER-IREF")
    protected EXTERNALTRIGGERINGPOINT.TRIGGERIREF triggeriref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??ident?????
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALTRIGGERINGPOINTIDENT }
     *     
     */
    public EXTERNALTRIGGERINGPOINTIDENT getIDENT() {
        return ident;
    }

    /**
     * ??ident?????
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALTRIGGERINGPOINTIDENT }
     *     
     */
    public void setIDENT(EXTERNALTRIGGERINGPOINTIDENT value) {
        this.ident = value;
    }

    /**
     * ??triggeriref?????
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALTRIGGERINGPOINT.TRIGGERIREF }
     *     
     */
    public EXTERNALTRIGGERINGPOINT.TRIGGERIREF getTRIGGERIREF() {
        return triggeriref;
    }

    /**
     * ??triggeriref?????
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALTRIGGERINGPOINT.TRIGGERIREF }
     *     
     */
    public void setTRIGGERIREF(EXTERNALTRIGGERINGPOINT.TRIGGERIREF value) {
        this.triggeriref = value;
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
     *         &lt;element name="P-TRIGGER-IN-ATOMIC-SWC-TYPE-INSTANCE-REF" type="{http://autosar.org/schema/r4.0}P-TRIGGER-IN-ATOMIC-SWC-TYPE-INSTANCE-REF"/>
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
        "ptriggerinatomicswctypeinstanceref"
    })
    public static class TRIGGERIREF {

        @XmlElement(name = "P-TRIGGER-IN-ATOMIC-SWC-TYPE-INSTANCE-REF")
        protected PTRIGGERINATOMICSWCTYPEINSTANCEREF ptriggerinatomicswctypeinstanceref;

        /**
         * ??ptriggerinatomicswctypeinstanceref?????
         * 
         * @return
         *     possible object is
         *     {@link PTRIGGERINATOMICSWCTYPEINSTANCEREF }
         *     
         */
        public PTRIGGERINATOMICSWCTYPEINSTANCEREF getPTRIGGERINATOMICSWCTYPEINSTANCEREF() {
            return ptriggerinatomicswctypeinstanceref;
        }

        /**
         * ??ptriggerinatomicswctypeinstanceref?????
         * 
         * @param value
         *     allowed object is
         *     {@link PTRIGGERINATOMICSWCTYPEINSTANCEREF }
         *     
         */
        public void setPTRIGGERINATOMICSWCTYPEINSTANCEREF(PTRIGGERINATOMICSWCTYPEINSTANCEREF value) {
            this.ptriggerinatomicswctypeinstanceref = value;
        }

    }

}
