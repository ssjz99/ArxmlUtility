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
 * Specifies in the "VendorSpecificModuleDefinition" whether changes on this parameter do affect other parameters in a later configuration step.
 * 
 * This element is removed from the specifications and shall not be used.
 * 
 * <p>ECUC-CONFIGURATION-CLASS-AFFECTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-CONFIGURATION-CLASS-AFFECTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-CONFIGURATION-CLASS-AFFECTION"/>
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
@XmlType(name = "ECUC-CONFIGURATION-CLASS-AFFECTION", propOrder = {
    "affectedrefs",
    "affectionkind"
})
public class ECUCCONFIGURATIONCLASSAFFECTION {

    @XmlElement(name = "AFFECTED-REFS")
    protected ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS affectedrefs;
    @XmlElement(name = "AFFECTION-KIND")
    protected ECUCAFFECTIONENUM affectionkind;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??affectedrefs?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS }
     *     
     */
    public ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS getAFFECTEDREFS() {
        return affectedrefs;
    }

    /**
     * ??affectedrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS }
     *     
     */
    public void setAFFECTEDREFS(ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS value) {
        this.affectedrefs = value;
    }

    /**
     * ??affectionkind?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCAFFECTIONENUM }
     *     
     */
    public ECUCAFFECTIONENUM getAFFECTIONKIND() {
        return affectionkind;
    }

    /**
     * ??affectionkind?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCAFFECTIONENUM }
     *     
     */
    public void setAFFECTIONKIND(ECUCAFFECTIONENUM value) {
        this.affectionkind = value;
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
     *         &lt;element name="AFFECTED-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-COMMON-ATTRIBUTES--SUBTYPES-ENUM" />
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
        "affectedref"
    })
    public static class AFFECTEDREFS {

        @XmlElement(name = "AFFECTED-REF")
        protected List<ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS.AFFECTEDREF> affectedref;

        /**
         * Gets the value of the affectedref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAFFECTEDREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS.AFFECTEDREF }
         * 
         * 
         */
        public List<ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS.AFFECTEDREF> getAFFECTEDREF() {
            if (affectedref == null) {
                affectedref = new ArrayList<ECUCCONFIGURATIONCLASSAFFECTION.AFFECTEDREFS.AFFECTEDREF>();
            }
            return this.affectedref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ECUC-COMMON-ATTRIBUTES--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AFFECTEDREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected ECUCCOMMONATTRIBUTESSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link ECUCCOMMONATTRIBUTESSUBTYPESENUM }
             *     
             */
            public ECUCCOMMONATTRIBUTESSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link ECUCCOMMONATTRIBUTESSUBTYPESENUM }
             *     
             */
            public void setDEST(ECUCCOMMONATTRIBUTESSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
