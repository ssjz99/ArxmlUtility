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
 * This meta-class allows to define links that specify logical relationships between single McDataInstances. The details on the existence and semantics of such links are not standardized.
 * 
 * Possible Use Case: 
 * Rapid Prototyping solutions in which additional communication buffers and switches are implemented  in the RTE that allow to switch between the usage of the original and the bypass buffers. The different buffers and the switch can be represented by McDataInstances (in order to be accessed by MC tools) which have relationships to each other.
 * 
 * <p>ROLE-BASED-MC-DATA-ASSIGNMENT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ROLE-BASED-MC-DATA-ASSIGNMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ROLE-BASED-MC-DATA-ASSIGNMENT"/>
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
@XmlType(name = "ROLE-BASED-MC-DATA-ASSIGNMENT", propOrder = {
    "mcdatainstancerefs",
    "role"
})
public class ROLEBASEDMCDATAASSIGNMENT {

    @XmlElement(name = "MC-DATA-INSTANCE-REFS")
    protected ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS mcdatainstancerefs;
    @XmlElement(name = "ROLE")
    protected IDENTIFIER role;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??mcdatainstancerefs?????
     * 
     * @return
     *     possible object is
     *     {@link ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS }
     *     
     */
    public ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS getMCDATAINSTANCEREFS() {
        return mcdatainstancerefs;
    }

    /**
     * ??mcdatainstancerefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS }
     *     
     */
    public void setMCDATAINSTANCEREFS(ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS value) {
        this.mcdatainstancerefs = value;
    }

    /**
     * ??role?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getROLE() {
        return role;
    }

    /**
     * ??role?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setROLE(IDENTIFIER value) {
        this.role = value;
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
     *         &lt;element name="MC-DATA-INSTANCE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE--SUBTYPES-ENUM" />
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
        "mcdatainstanceref"
    })
    public static class MCDATAINSTANCEREFS {

        @XmlElement(name = "MC-DATA-INSTANCE-REF")
        protected List<ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS.MCDATAINSTANCEREF> mcdatainstanceref;

        /**
         * Gets the value of the mcdatainstanceref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcdatainstanceref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCDATAINSTANCEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS.MCDATAINSTANCEREF }
         * 
         * 
         */
        public List<ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS.MCDATAINSTANCEREF> getMCDATAINSTANCEREF() {
            if (mcdatainstanceref == null) {
                mcdatainstanceref = new ArrayList<ROLEBASEDMCDATAASSIGNMENT.MCDATAINSTANCEREFS.MCDATAINSTANCEREF>();
            }
            return this.mcdatainstanceref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}MC-DATA-INSTANCE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MCDATAINSTANCEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected MCDATAINSTANCESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link MCDATAINSTANCESUBTYPESENUM }
             *     
             */
            public MCDATAINSTANCESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link MCDATAINSTANCESUBTYPESENUM }
             *     
             */
            public void setDEST(MCDATAINSTANCESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
