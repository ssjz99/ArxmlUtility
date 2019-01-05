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
 * This meta-class is used to create an association of two ConstantSpecifications. One ConstantSpecification is supposed to be defined in the application domain while the other should be defined in the implementation domain.
 * 
 * Hence the ConstantSpecificationMapping needs to be used where a ConstantSpecification defined in one domain needs to be associated to a ConstantSpecification in the other domain.
 * 
 * This information is crucial for the RTE generator.
 * 
 * <p>CONSTANT-SPECIFICATION-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CONSTANT-SPECIFICATION-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION-MAPPING"/>
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
@XmlType(name = "CONSTANT-SPECIFICATION-MAPPING", propOrder = {
    "applconstantref",
    "implconstantref"
})
public class CONSTANTSPECIFICATIONMAPPING {

    @XmlElement(name = "APPL-CONSTANT-REF")
    protected CONSTANTSPECIFICATIONMAPPING.APPLCONSTANTREF applconstantref;
    @XmlElement(name = "IMPL-CONSTANT-REF")
    protected CONSTANTSPECIFICATIONMAPPING.IMPLCONSTANTREF implconstantref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??applconstantref?????
     * 
     * @return
     *     possible object is
     *     {@link CONSTANTSPECIFICATIONMAPPING.APPLCONSTANTREF }
     *     
     */
    public CONSTANTSPECIFICATIONMAPPING.APPLCONSTANTREF getAPPLCONSTANTREF() {
        return applconstantref;
    }

    /**
     * ??applconstantref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTANTSPECIFICATIONMAPPING.APPLCONSTANTREF }
     *     
     */
    public void setAPPLCONSTANTREF(CONSTANTSPECIFICATIONMAPPING.APPLCONSTANTREF value) {
        this.applconstantref = value;
    }

    /**
     * ??implconstantref?????
     * 
     * @return
     *     possible object is
     *     {@link CONSTANTSPECIFICATIONMAPPING.IMPLCONSTANTREF }
     *     
     */
    public CONSTANTSPECIFICATIONMAPPING.IMPLCONSTANTREF getIMPLCONSTANTREF() {
        return implconstantref;
    }

    /**
     * ??implconstantref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CONSTANTSPECIFICATIONMAPPING.IMPLCONSTANTREF }
     *     
     */
    public void setIMPLCONSTANTREF(CONSTANTSPECIFICATIONMAPPING.IMPLCONSTANTREF value) {
        this.implconstantref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class APPLCONSTANTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CONSTANTSPECIFICATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CONSTANTSPECIFICATIONSUBTYPESENUM }
         *     
         */
        public CONSTANTSPECIFICATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CONSTANTSPECIFICATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(CONSTANTSPECIFICATIONSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSTANT-SPECIFICATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IMPLCONSTANTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CONSTANTSPECIFICATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CONSTANTSPECIFICATIONSUBTYPESENUM }
         *     
         */
        public CONSTANTSPECIFICATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CONSTANTSPECIFICATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(CONSTANTSPECIFICATIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
