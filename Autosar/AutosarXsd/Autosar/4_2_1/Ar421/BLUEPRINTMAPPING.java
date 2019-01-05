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
 * This meta-class represents the ability to map two an object and its blueprint.
 * 
 * <p>BLUEPRINT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BLUEPRINT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BLUEPRINT-MAPPING"/>
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
@XmlType(name = "BLUEPRINT-MAPPING", propOrder = {
    "blueprintref",
    "derivedobjectref"
})
public class BLUEPRINTMAPPING {

    @XmlElement(name = "BLUEPRINT-REF")
    protected BLUEPRINTMAPPING.BLUEPRINTREF blueprintref;
    @XmlElement(name = "DERIVED-OBJECT-REF")
    protected BLUEPRINTMAPPING.DERIVEDOBJECTREF derivedobjectref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??blueprintref?????
     * 
     * @return
     *     possible object is
     *     {@link BLUEPRINTMAPPING.BLUEPRINTREF }
     *     
     */
    public BLUEPRINTMAPPING.BLUEPRINTREF getBLUEPRINTREF() {
        return blueprintref;
    }

    /**
     * ??blueprintref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BLUEPRINTMAPPING.BLUEPRINTREF }
     *     
     */
    public void setBLUEPRINTREF(BLUEPRINTMAPPING.BLUEPRINTREF value) {
        this.blueprintref = value;
    }

    /**
     * ??derivedobjectref?????
     * 
     * @return
     *     possible object is
     *     {@link BLUEPRINTMAPPING.DERIVEDOBJECTREF }
     *     
     */
    public BLUEPRINTMAPPING.DERIVEDOBJECTREF getDERIVEDOBJECTREF() {
        return derivedobjectref;
    }

    /**
     * ??derivedobjectref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BLUEPRINTMAPPING.DERIVEDOBJECTREF }
     *     
     */
    public void setDERIVEDOBJECTREF(BLUEPRINTMAPPING.DERIVEDOBJECTREF value) {
        this.derivedobjectref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BLUEPRINTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ATPBLUEPRINTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ATPBLUEPRINTSUBTYPESENUM }
         *     
         */
        public ATPBLUEPRINTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ATPBLUEPRINTSUBTYPESENUM }
         *     
         */
        public void setDEST(ATPBLUEPRINTSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ATP-BLUEPRINTABLE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DERIVEDOBJECTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ATPBLUEPRINTABLESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ATPBLUEPRINTABLESUBTYPESENUM }
         *     
         */
        public ATPBLUEPRINTABLESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ATPBLUEPRINTABLESUBTYPESENUM }
         *     
         */
        public void setDEST(ATPBLUEPRINTABLESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
