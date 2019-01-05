//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>INNER-PORT-GROUP-IN-COMPOSITION-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INNER-PORT-GROUP-IN-COMPOSITION-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INNER-PORT-GROUP-IN-COMPOSITION-INSTANCE-REF"/>
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
@XmlType(name = "INNER-PORT-GROUP-IN-COMPOSITION-INSTANCE-REF", propOrder = {
    "contextref",
    "targetref"
})
public class INNERPORTGROUPINCOMPOSITIONINSTANCEREF {

    @XmlElement(name = "CONTEXT-REF")
    protected List<INNERPORTGROUPINCOMPOSITIONINSTANCEREF.CONTEXTREF> contextref;
    @XmlElement(name = "TARGET-REF")
    protected INNERPORTGROUPINCOMPOSITIONINSTANCEREF.TARGETREF targetref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the contextref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTEXTREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INNERPORTGROUPINCOMPOSITIONINSTANCEREF.CONTEXTREF }
     * 
     * 
     */
    public List<INNERPORTGROUPINCOMPOSITIONINSTANCEREF.CONTEXTREF> getCONTEXTREF() {
        if (contextref == null) {
            contextref = new ArrayList<INNERPORTGROUPINCOMPOSITIONINSTANCEREF.CONTEXTREF>();
        }
        return this.contextref;
    }

    /**
     * ??targetref?????
     * 
     * @return
     *     possible object is
     *     {@link INNERPORTGROUPINCOMPOSITIONINSTANCEREF.TARGETREF }
     *     
     */
    public INNERPORTGROUPINCOMPOSITIONINSTANCEREF.TARGETREF getTARGETREF() {
        return targetref;
    }

    /**
     * ??targetref?????
     * 
     * @param value
     *     allowed object is
     *     {@link INNERPORTGROUPINCOMPOSITIONINSTANCEREF.TARGETREF }
     *     
     */
    public void setTARGETREF(INNERPORTGROUPINCOMPOSITIONINSTANCEREF.TARGETREF value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SW-COMPONENT-PROTOTYPE--SUBTYPES-ENUM" />
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
        protected SWCOMPONENTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link SWCOMPONENTPROTOTYPESUBTYPESENUM }
         *     
         */
        public SWCOMPONENTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link SWCOMPONENTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(SWCOMPONENTPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-GROUP--SUBTYPES-ENUM" />
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
        protected PORTGROUPSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTGROUPSUBTYPESENUM }
         *     
         */
        public PORTGROUPSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTGROUPSUBTYPESENUM }
         *     
         */
        public void setDEST(PORTGROUPSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
