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
 * Describes a reference to a particular ImplementationDataTypeElement instance in the context of a given ParameterDataPrototype.
 * Thus it refers to a particular element in the implementation description of a software data structure.
 * 
 * Use Case:
 * The RTE generator publishes its generated structure of calibration parameters in its BSW module description using the "constantMemory" role of ParameterDataPrototypes. Each ParameterDataPrototype describes a group of single calibration parameters. In order to point to these single parameters, this "instance ref" is needed.
 * 
 * Note that this class follows the pattern of an InstanceRef but is not implemented based on the abstract classes because the ImplementationDataType isn't either, especially because ImplementationDataTypeElement isn't derived from AtpPrototype.
 * 
 * <p>IMPLEMENTATION-ELEMENT-IN-PARAMETER-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="IMPLEMENTATION-ELEMENT-IN-PARAMETER-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}IMPLEMENTATION-ELEMENT-IN-PARAMETER-INSTANCE-REF"/>
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
@XmlType(name = "IMPLEMENTATION-ELEMENT-IN-PARAMETER-INSTANCE-REF", propOrder = {
    "contextref",
    "targetref"
})
public class IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF {

    @XmlElement(name = "CONTEXT-REF")
    protected IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.CONTEXTREF contextref;
    @XmlElement(name = "TARGET-REF")
    protected IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.TARGETREF targetref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextref?????
     * 
     * @return
     *     possible object is
     *     {@link IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.CONTEXTREF }
     *     
     */
    public IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.CONTEXTREF getCONTEXTREF() {
        return contextref;
    }

    /**
     * ??contextref?????
     * 
     * @param value
     *     allowed object is
     *     {@link IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.CONTEXTREF }
     *     
     */
    public void setCONTEXTREF(IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.CONTEXTREF value) {
        this.contextref = value;
    }

    /**
     * ??targetref?????
     * 
     * @return
     *     possible object is
     *     {@link IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.TARGETREF }
     *     
     */
    public IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.TARGETREF getTARGETREF() {
        return targetref;
    }

    /**
     * ??targetref?????
     * 
     * @param value
     *     allowed object is
     *     {@link IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.TARGETREF }
     *     
     */
    public void setTARGETREF(IMPLEMENTATIONELEMENTINPARAMETERINSTANCEREF.TARGETREF value) {
        this.targetref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PARAMETERDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public PARAMETERDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PARAMETERDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PARAMETERDATAPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
