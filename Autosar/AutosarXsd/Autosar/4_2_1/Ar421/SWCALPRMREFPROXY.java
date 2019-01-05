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
 * Wrapper class for different kinds of references to a calibration parameter.
 * 
 * <p>SW-CALPRM-REF-PROXY complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-CALPRM-REF-PROXY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-CALPRM-REF-PROXY"/>
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
@XmlType(name = "SW-CALPRM-REF-PROXY", propOrder = {
    "arparameter",
    "mcdatainstanceref"
})
public class SWCALPRMREFPROXY {

    @XmlElement(name = "AR-PARAMETER")
    protected AUTOSARPARAMETERREF arparameter;
    @XmlElement(name = "MC-DATA-INSTANCE-REF")
    protected SWCALPRMREFPROXY.MCDATAINSTANCEREF mcdatainstanceref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??arparameter?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARPARAMETERREF }
     *     
     */
    public AUTOSARPARAMETERREF getARPARAMETER() {
        return arparameter;
    }

    /**
     * ??arparameter?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARPARAMETERREF }
     *     
     */
    public void setARPARAMETER(AUTOSARPARAMETERREF value) {
        this.arparameter = value;
    }

    /**
     * ??mcdatainstanceref?????
     * 
     * @return
     *     possible object is
     *     {@link SWCALPRMREFPROXY.MCDATAINSTANCEREF }
     *     
     */
    public SWCALPRMREFPROXY.MCDATAINSTANCEREF getMCDATAINSTANCEREF() {
        return mcdatainstanceref;
    }

    /**
     * ??mcdatainstanceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCALPRMREFPROXY.MCDATAINSTANCEREF }
     *     
     */
    public void setMCDATAINSTANCEREF(SWCALPRMREFPROXY.MCDATAINSTANCEREF value) {
        this.mcdatainstanceref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MCDATAINSTANCEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected MCDATAINSTANCESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link MCDATAINSTANCESUBTYPESENUM }
         *     
         */
        public MCDATAINSTANCESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link MCDATAINSTANCESUBTYPESENUM }
         *     
         */
        public void setDEST(MCDATAINSTANCESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
