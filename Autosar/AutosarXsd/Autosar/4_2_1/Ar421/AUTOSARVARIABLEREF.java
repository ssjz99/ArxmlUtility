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
 * This class represents a reference to a variable within AUTOSAR which can be one of the following use cases:
 * 
 * localVariable:
 * 
 * * localVariable which is used as whole (e.g. InterRunnableVariable, inputValue for curve)
 * 
 * autosarVariable:
 * 
 * * a variable provided via Port which is used as whole (e.g. dataAccesspoints)
 * 
 * * an element inside of a composite local variable typed by ApplicationDatatype (e.g. inputValue for a curve)
 * 
 * * an element inside of a composite variable provided via Port and typed by ApplicationDatatype (e.g. inputValue for a curve)
 * 
 * autosarVariableInImplDatatype:
 * 
 * * an element inside of a composite local variable typed by ImplementationDatatype  (e.g. nvramData mapping)
 * 
 * * an element inside of a composite variable provided via Port and typed by ImplementationDatatype (e.g. inputValue for a curve)
 * 
 * <p>AUTOSAR-VARIABLE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="AUTOSAR-VARIABLE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AUTOSAR-VARIABLE-REF"/>
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
@XmlType(name = "AUTOSAR-VARIABLE-REF", propOrder = {
    "autosarvariableinimpldatatype",
    "autosarvariableiref",
    "localvariableref"
})
public class AUTOSARVARIABLEREF {

    @XmlElement(name = "AUTOSAR-VARIABLE-IN-IMPL-DATATYPE")
    protected ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF autosarvariableinimpldatatype;
    @XmlElement(name = "AUTOSAR-VARIABLE-IREF")
    protected VARIABLEINATOMICSWCTYPEINSTANCEREF autosarvariableiref;
    @XmlElement(name = "LOCAL-VARIABLE-REF")
    protected AUTOSARVARIABLEREF.LOCALVARIABLEREF localvariableref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??autosarvariableinimpldatatype?????
     * 
     * @return
     *     possible object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF }
     *     
     */
    public ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF getAUTOSARVARIABLEINIMPLDATATYPE() {
        return autosarvariableinimpldatatype;
    }

    /**
     * ??autosarvariableinimpldatatype?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF }
     *     
     */
    public void setAUTOSARVARIABLEINIMPLDATATYPE(ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF value) {
        this.autosarvariableinimpldatatype = value;
    }

    /**
     * ??autosarvariableiref?????
     * 
     * @return
     *     possible object is
     *     {@link VARIABLEINATOMICSWCTYPEINSTANCEREF }
     *     
     */
    public VARIABLEINATOMICSWCTYPEINSTANCEREF getAUTOSARVARIABLEIREF() {
        return autosarvariableiref;
    }

    /**
     * ??autosarvariableiref?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIABLEINATOMICSWCTYPEINSTANCEREF }
     *     
     */
    public void setAUTOSARVARIABLEIREF(VARIABLEINATOMICSWCTYPEINSTANCEREF value) {
        this.autosarvariableiref = value;
    }

    /**
     * ??localvariableref?????
     * 
     * @return
     *     possible object is
     *     {@link AUTOSARVARIABLEREF.LOCALVARIABLEREF }
     *     
     */
    public AUTOSARVARIABLEREF.LOCALVARIABLEREF getLOCALVARIABLEREF() {
        return localvariableref;
    }

    /**
     * ??localvariableref?????
     * 
     * @param value
     *     allowed object is
     *     {@link AUTOSARVARIABLEREF.LOCALVARIABLEREF }
     *     
     */
    public void setLOCALVARIABLEREF(AUTOSARVARIABLEREF.LOCALVARIABLEREF value) {
        this.localvariableref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LOCALVARIABLEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected VARIABLEDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public VARIABLEDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(VARIABLEDATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
