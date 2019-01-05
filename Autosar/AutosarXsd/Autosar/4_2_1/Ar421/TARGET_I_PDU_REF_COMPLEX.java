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
 * Target destination of the referencing mapping.
 * 
 * <p>TARGET-I-PDU-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="TARGET-I-PDU-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}TARGET-I-PDU-REF"/>
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
@XmlType(name = "TARGET-I-PDU-REF", propOrder = {
    "defaultvalue",
    "targetipduref"
})
public class TARGET_I_PDU_REF_COMPLEX {

    @XmlElement(name = "DEFAULT-VALUE")
    protected PDUMAPPINGDEFAULTVALUE defaultvalue;
    @XmlElement(name = "TARGET-I-PDU-REF")
    protected TARGET_I_PDU_REF_COMPLEX.TARGETIPDUREF targetipduref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??defaultvalue?????
     * 
     * @return
     *     possible object is
     *     {@link PDUMAPPINGDEFAULTVALUE }
     *     
     */
    public PDUMAPPINGDEFAULTVALUE getDEFAULTVALUE() {
        return defaultvalue;
    }

    /**
     * ??defaultvalue?????
     * 
     * @param value
     *     allowed object is
     *     {@link PDUMAPPINGDEFAULTVALUE }
     *     
     */
    public void setDEFAULTVALUE(PDUMAPPINGDEFAULTVALUE value) {
        this.defaultvalue = value;
    }

    /**
     * ??targetipduref?????
     * 
     * @return
     *     possible object is
     *     {@link TARGET_I_PDU_REF_COMPLEX.TARGETIPDUREF }
     *     
     */
    public TARGET_I_PDU_REF_COMPLEX.TARGETIPDUREF getTARGETIPDUREF() {
        return targetipduref;
    }

    /**
     * ??targetipduref?????
     * 
     * @param value
     *     allowed object is
     *     {@link TARGET_I_PDU_REF_COMPLEX.TARGETIPDUREF }
     *     
     */
    public void setTARGETIPDUREF(TARGET_I_PDU_REF_COMPLEX.TARGETIPDUREF value) {
        this.targetipduref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PDU-TRIGGERING--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETIPDUREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PDUTRIGGERINGSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PDUTRIGGERINGSUBTYPESENUM }
         *     
         */
        public PDUTRIGGERINGSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PDUTRIGGERINGSUBTYPESENUM }
         *     
         */
        public void setDEST(PDUTRIGGERINGSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
