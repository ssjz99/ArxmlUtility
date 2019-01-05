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
 * This class represents a reference to a parameter within AUTOSAR which can be one of the following use cases:
 * 
 * localParameter:
 * 
 * * localParameter which is used as whole (e.g.  sharedAxis for curve)
 * 
 * autosarVariable:
 * 
 * * a parameter provided via PortPrototype which is used as whole (e.g. parameterAccess)
 * 
 * * an element inside of a composite local parameter typed by ApplicationDatatype (e.g. sharedAxis for a curve)
 * 
 * * an element inside of a composite parameter provided via Port and typed by ApplicationDatatype (e.g. sharedAxis for a curve)
 * 
 * autosarParameterInImplDatatype:
 * 
 * * an element inside of a composite local parameter typed by ImplementationDatatype
 * 
 * * an element inside of a composite parameter provided via PortPrototype and typed by ImplementationDatatype
 * 
 * <p>AUTOSAR-PARAMETER-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="AUTOSAR-PARAMETER-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AUTOSAR-PARAMETER-REF"/>
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
@XmlType(name = "AUTOSAR-PARAMETER-REF", propOrder = {
    "autosarparameteriref",
    "localparameterref"
})
public class AUTOSARPARAMETERREF {

    @XmlElement(name = "AUTOSAR-PARAMETER-IREF")
    protected PARAMETERINATOMICSWCTYPEINSTANCEREF autosarparameteriref;
    @XmlElement(name = "LOCAL-PARAMETER-REF")
    protected AUTOSARPARAMETERREF.LOCALPARAMETERREF localparameterref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??autosarparameteriref?????
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERINATOMICSWCTYPEINSTANCEREF }
     *     
     */
    public PARAMETERINATOMICSWCTYPEINSTANCEREF getAUTOSARPARAMETERIREF() {
        return autosarparameteriref;
    }

    /**
     * ??autosarparameteriref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERINATOMICSWCTYPEINSTANCEREF }
     *     
     */
    public void setAUTOSARPARAMETERIREF(PARAMETERINATOMICSWCTYPEINSTANCEREF value) {
        this.autosarparameteriref = value;
    }

    /**
     * ??localparameterref?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARPARAMETERREF.LOCALPARAMETERREF }
     *     
     */
    public AUTOSARPARAMETERREF.LOCALPARAMETERREF getLOCALPARAMETERREF() {
        return localparameterref;
    }

    /**
     * ??localparameterref?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARPARAMETERREF.LOCALPARAMETERREF }
     *     
     */
    public void setLOCALPARAMETERREF(AUTOSARPARAMETERREF.LOCALPARAMETERREF value) {
        this.localparameterref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LOCALPARAMETERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected DATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link DATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public DATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link DATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(DATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
