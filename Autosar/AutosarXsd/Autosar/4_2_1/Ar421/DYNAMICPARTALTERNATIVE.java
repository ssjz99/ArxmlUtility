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
 * One of the Com IPdu alternatives that are transmitted in the Dynamic Part of the MultiplexedIPdu. The selectorFieldCode
 * specifies which Com IPdu is contained in the DynamicPart within a
 * certain transmission of a multiplexed PDU.
 * 
 * <p>DYNAMIC-PART-ALTERNATIVE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DYNAMIC-PART-ALTERNATIVE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DYNAMIC-PART-ALTERNATIVE"/>
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
@XmlType(name = "DYNAMIC-PART-ALTERNATIVE", propOrder = {
    "ipduref",
    "initialdynamicpart",
    "selectorfieldcode"
})
public class DYNAMICPARTALTERNATIVE {

    @XmlElement(name = "I-PDU-REF")
    protected DYNAMICPARTALTERNATIVE.IPDUREF ipduref;
    @XmlElement(name = "INITIAL-DYNAMIC-PART")
    protected BOOLEAN initialdynamicpart;
    @XmlElement(name = "SELECTOR-FIELD-CODE")
    protected INTEGER selectorfieldcode;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??ipduref?????
     * 
     * @return
     *     possible object is
     *     {@link DYNAMICPARTALTERNATIVE.IPDUREF }
     *     
     */
    public DYNAMICPARTALTERNATIVE.IPDUREF getIPDUREF() {
        return ipduref;
    }

    /**
     * ??ipduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link DYNAMICPARTALTERNATIVE.IPDUREF }
     *     
     */
    public void setIPDUREF(DYNAMICPARTALTERNATIVE.IPDUREF value) {
        this.ipduref = value;
    }

    /**
     * ??initialdynamicpart?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getINITIALDYNAMICPART() {
        return initialdynamicpart;
    }

    /**
     * ??initialdynamicpart?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setINITIALDYNAMICPART(BOOLEAN value) {
        this.initialdynamicpart = value;
    }

    /**
     * ??selectorfieldcode?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSELECTORFIELDCODE() {
        return selectorfieldcode;
    }

    /**
     * ??selectorfieldcode?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSELECTORFIELDCODE(INTEGER value) {
        this.selectorfieldcode = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}I-SIGNAL-I-PDU--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ISIGNALIPDUSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ISIGNALIPDUSUBTYPESENUM }
         *     
         */
        public ISIGNALIPDUSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ISIGNALIPDUSUBTYPESENUM }
         *     
         */
        public void setDEST(ISIGNALIPDUSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
