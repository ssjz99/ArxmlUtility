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
 * The condition defined by this class evaluates to true if one of the referenced modeDeclarations (OR associated) is active. All referenced modeDeclarations shall be from the same ModeDeclarationGroup.
 * 
 * The condition is used to define which TransmissionMode shall be activated using Com_SwitchIpduTxMode.
 * 
 * <p>MODE-DRIVEN-TRANSMISSION-MODE-CONDITION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MODE-DRIVEN-TRANSMISSION-MODE-CONDITION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MODE-DRIVEN-TRANSMISSION-MODE-CONDITION"/>
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
@XmlType(name = "MODE-DRIVEN-TRANSMISSION-MODE-CONDITION", propOrder = {
    "modedeclarationrefs"
})
public class MODEDRIVENTRANSMISSIONMODECONDITION {

    @XmlElement(name = "MODE-DECLARATION-REFS")
    protected MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS modedeclarationrefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??modedeclarationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS }
     *     
     */
    public MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS getMODEDECLARATIONREFS() {
        return modedeclarationrefs;
    }

    /**
     * ??modedeclarationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS }
     *     
     */
    public void setMODEDECLARATIONREFS(MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS value) {
        this.modedeclarationrefs = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="MODE-DECLARATION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modedeclarationref"
    })
    public static class MODEDECLARATIONREFS {

        @XmlElement(name = "MODE-DECLARATION-REF")
        protected List<MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS.MODEDECLARATIONREF> modedeclarationref;

        /**
         * Gets the value of the modedeclarationref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modedeclarationref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODEDECLARATIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS.MODEDECLARATIONREF }
         * 
         * 
         */
        public List<MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS.MODEDECLARATIONREF> getMODEDECLARATIONREF() {
            if (modedeclarationref == null) {
                modedeclarationref = new ArrayList<MODEDRIVENTRANSMISSIONMODECONDITION.MODEDECLARATIONREFS.MODEDECLARATIONREF>();
            }
            return this.modedeclarationref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MODE-DECLARATION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MODEDECLARATIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected MODEDECLARATIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link MODEDECLARATIONSUBTYPESENUM }
             *     
             */
            public MODEDECLARATIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link MODEDECLARATIONSUBTYPESENUM }
             *     
             */
            public void setDEST(MODEDECLARATIONSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
