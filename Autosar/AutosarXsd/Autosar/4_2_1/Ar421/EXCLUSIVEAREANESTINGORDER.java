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
 * This meta-class represents the ability to define a nesting order of ExclusiveAreas. A nesting order (that may occur in the executable code) is formally defined to be able to analyze the resource locking behavior.
 * 
 * <p>EXCLUSIVE-AREA-NESTING-ORDER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EXCLUSIVE-AREA-NESTING-ORDER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA-NESTING-ORDER"/>
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
@XmlType(name = "EXCLUSIVE-AREA-NESTING-ORDER", propOrder = {
    "shortname",
    "exclusivearearefs",
    "variationpoint"
})
public class EXCLUSIVEAREANESTINGORDER {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "EXCLUSIVE-AREA-REFS")
    protected EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS exclusivearearefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??shortname?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getSHORTNAME() {
        return shortname;
    }

    /**
     * ??shortname?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setSHORTNAME(IDENTIFIER value) {
        this.shortname = value;
    }

    /**
     * ??exclusivearearefs?????
     * 
     * @return
     *     possible object is
     *     {@link EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS }
     *     
     */
    public EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS getEXCLUSIVEAREAREFS() {
        return exclusivearearefs;
    }

    /**
     * ??exclusivearearefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS }
     *     
     */
    public void setEXCLUSIVEAREAREFS(EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS value) {
        this.exclusivearearefs = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
     *         &lt;element name="EXCLUSIVE-AREA-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA--SUBTYPES-ENUM" />
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
        "exclusivearearef"
    })
    public static class EXCLUSIVEAREAREFS {

        @XmlElement(name = "EXCLUSIVE-AREA-REF")
        protected List<EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS.EXCLUSIVEAREAREF> exclusivearearef;

        /**
         * Gets the value of the exclusivearearef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exclusivearearef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXCLUSIVEAREAREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS.EXCLUSIVEAREAREF }
         * 
         * 
         */
        public List<EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS.EXCLUSIVEAREAREF> getEXCLUSIVEAREAREF() {
            if (exclusivearearef == null) {
                exclusivearearef = new ArrayList<EXCLUSIVEAREANESTINGORDER.EXCLUSIVEAREAREFS.EXCLUSIVEAREAREF>();
            }
            return this.exclusivearearef;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EXCLUSIVEAREAREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected EXCLUSIVEAREASUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link EXCLUSIVEAREASUBTYPESENUM }
             *     
             */
            public EXCLUSIVEAREASUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link EXCLUSIVEAREASUBTYPESENUM }
             *     
             */
            public void setDEST(EXCLUSIVEAREASUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
