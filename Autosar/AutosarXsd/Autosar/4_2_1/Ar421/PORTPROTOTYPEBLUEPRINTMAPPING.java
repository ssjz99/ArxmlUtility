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
 * This meta-class represents the ability to map a PortPrototypeBlueprint to a PortProtoype of which one acts as the blueprint for the other.
 * 
 * <p>PORT-PROTOTYPE-BLUEPRINT-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PORT-PROTOTYPE-BLUEPRINT-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-BLUEPRINT-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE-BLUEPRINT-MAPPING"/>
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
@XmlType(name = "PORT-PROTOTYPE-BLUEPRINT-MAPPING", propOrder = {
    "portprototypeblueprintref",
    "derivedportprototyperef"
})
public class PORTPROTOTYPEBLUEPRINTMAPPING {

    @XmlElement(name = "PORT-PROTOTYPE-BLUEPRINT-REF")
    protected PORTPROTOTYPEBLUEPRINTMAPPING.PORTPROTOTYPEBLUEPRINTREF portprototypeblueprintref;
    @XmlElement(name = "DERIVED-PORT-PROTOTYPE-REF")
    protected PORTPROTOTYPEBLUEPRINTMAPPING.DERIVEDPORTPROTOTYPEREF derivedportprototyperef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??portprototypeblueprintref?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINTMAPPING.PORTPROTOTYPEBLUEPRINTREF }
     *     
     */
    public PORTPROTOTYPEBLUEPRINTMAPPING.PORTPROTOTYPEBLUEPRINTREF getPORTPROTOTYPEBLUEPRINTREF() {
        return portprototypeblueprintref;
    }

    /**
     * ??portprototypeblueprintref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINTMAPPING.PORTPROTOTYPEBLUEPRINTREF }
     *     
     */
    public void setPORTPROTOTYPEBLUEPRINTREF(PORTPROTOTYPEBLUEPRINTMAPPING.PORTPROTOTYPEBLUEPRINTREF value) {
        this.portprototypeblueprintref = value;
    }

    /**
     * ??derivedportprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINTMAPPING.DERIVEDPORTPROTOTYPEREF }
     *     
     */
    public PORTPROTOTYPEBLUEPRINTMAPPING.DERIVEDPORTPROTOTYPEREF getDERIVEDPORTPROTOTYPEREF() {
        return derivedportprototyperef;
    }

    /**
     * ??derivedportprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINTMAPPING.DERIVEDPORTPROTOTYPEREF }
     *     
     */
    public void setDERIVEDPORTPROTOTYPEREF(PORTPROTOTYPEBLUEPRINTMAPPING.DERIVEDPORTPROTOTYPEREF value) {
        this.derivedportprototyperef = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DERIVEDPORTPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public PORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE-BLUEPRINT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PORTPROTOTYPEBLUEPRINTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTPROTOTYPEBLUEPRINTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTPROTOTYPEBLUEPRINTSUBTYPESENUM }
         *     
         */
        public PORTPROTOTYPEBLUEPRINTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTPROTOTYPEBLUEPRINTSUBTYPESENUM }
         *     
         */
        public void setDEST(PORTPROTOTYPEBLUEPRINTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
