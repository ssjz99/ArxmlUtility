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
 * This meta-class represents the ability to map two PortInterfaces of which one acts as the blueprint for the other.
 * 
 * <p>PORT-INTERFACE-BLUEPRINT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PORT-INTERFACE-BLUEPRINT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PORT-INTERFACE-BLUEPRINT-MAPPING"/>
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
@XmlType(name = "PORT-INTERFACE-BLUEPRINT-MAPPING", propOrder = {
    "portinterfaceblueprintref",
    "derivedportinterfaceref"
})
public class PORTINTERFACEBLUEPRINTMAPPING {

    @XmlElement(name = "PORT-INTERFACE-BLUEPRINT-REF")
    protected PORTINTERFACEBLUEPRINTMAPPING.PORTINTERFACEBLUEPRINTREF portinterfaceblueprintref;
    @XmlElement(name = "DERIVED-PORT-INTERFACE-REF")
    protected PORTINTERFACEBLUEPRINTMAPPING.DERIVEDPORTINTERFACEREF derivedportinterfaceref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??portinterfaceblueprintref?????
     * 
     * @return
     *     possible object is
     *     {@link PORTINTERFACEBLUEPRINTMAPPING.PORTINTERFACEBLUEPRINTREF }
     *     
     */
    public PORTINTERFACEBLUEPRINTMAPPING.PORTINTERFACEBLUEPRINTREF getPORTINTERFACEBLUEPRINTREF() {
        return portinterfaceblueprintref;
    }

    /**
     * ??portinterfaceblueprintref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTINTERFACEBLUEPRINTMAPPING.PORTINTERFACEBLUEPRINTREF }
     *     
     */
    public void setPORTINTERFACEBLUEPRINTREF(PORTINTERFACEBLUEPRINTMAPPING.PORTINTERFACEBLUEPRINTREF value) {
        this.portinterfaceblueprintref = value;
    }

    /**
     * ??derivedportinterfaceref?????
     * 
     * @return
     *     possible object is
     *     {@link PORTINTERFACEBLUEPRINTMAPPING.DERIVEDPORTINTERFACEREF }
     *     
     */
    public PORTINTERFACEBLUEPRINTMAPPING.DERIVEDPORTINTERFACEREF getDERIVEDPORTINTERFACEREF() {
        return derivedportinterfaceref;
    }

    /**
     * ??derivedportinterfaceref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTINTERFACEBLUEPRINTMAPPING.DERIVEDPORTINTERFACEREF }
     *     
     */
    public void setDERIVEDPORTINTERFACEREF(PORTINTERFACEBLUEPRINTMAPPING.DERIVEDPORTINTERFACEREF value) {
        this.derivedportinterfaceref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-INTERFACE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DERIVEDPORTINTERFACEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTINTERFACESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public PORTINTERFACESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTINTERFACESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-INTERFACE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PORTINTERFACEBLUEPRINTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTINTERFACESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public PORTINTERFACESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTINTERFACESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTINTERFACESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
