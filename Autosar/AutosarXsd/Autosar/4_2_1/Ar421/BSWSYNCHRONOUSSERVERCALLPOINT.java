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
 * Represents a synchronous procedure call point via the BSW Scheduler.
 * 
 * <p>BSW-SYNCHRONOUS-SERVER-CALL-POINT complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="BSW-SYNCHRONOUS-SERVER-CALL-POINT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-MODULE-CALL-POINT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}BSW-SYNCHRONOUS-SERVER-CALL-POINT"/>
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
@XmlType(name = "BSW-SYNCHRONOUS-SERVER-CALL-POINT", propOrder = {
    "shortname",
    "contextlimitationrefs",
    "variationpoint",
    "calledentryref",
    "calledfromwithinexclusivearearef"
})
public class BSWSYNCHRONOUSSERVERCALLPOINT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "CONTEXT-LIMITATION-REFS")
    protected BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS contextlimitationrefs;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlElement(name = "CALLED-ENTRY-REF")
    protected BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDENTRYREF calledentryref;
    @XmlElement(name = "CALLED-FROM-WITHIN-EXCLUSIVE-AREA-REF")
    protected BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDFROMWITHINEXCLUSIVEAREAREF calledfromwithinexclusivearearef;
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
     * ??contextlimitationrefs?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS }
     *     
     */
    public BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS getCONTEXTLIMITATIONREFS() {
        return contextlimitationrefs;
    }

    /**
     * ??contextlimitationrefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS }
     *     
     */
    public void setCONTEXTLIMITATIONREFS(BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS value) {
        this.contextlimitationrefs = value;
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
     * ??calledentryref?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDENTRYREF }
     *     
     */
    public BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDENTRYREF getCALLEDENTRYREF() {
        return calledentryref;
    }

    /**
     * ??calledentryref?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDENTRYREF }
     *     
     */
    public void setCALLEDENTRYREF(BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDENTRYREF value) {
        this.calledentryref = value;
    }

    /**
     * ??calledfromwithinexclusivearearef?????
     * 
     * @return
     *     possible object is
     *     {@link BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDFROMWITHINEXCLUSIVEAREAREF }
     *     
     */
    public BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDFROMWITHINEXCLUSIVEAREAREF getCALLEDFROMWITHINEXCLUSIVEAREAREF() {
        return calledfromwithinexclusivearearef;
    }

    /**
     * ??calledfromwithinexclusivearearef?????
     * 
     * @param value
     *     allowed object is
     *     {@link BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDFROMWITHINEXCLUSIVEAREAREF }
     *     
     */
    public void setCALLEDFROMWITHINEXCLUSIVEAREAREF(BSWSYNCHRONOUSSERVERCALLPOINT.CALLEDFROMWITHINEXCLUSIVEAREAREF value) {
        this.calledfromwithinexclusivearearef = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-MODULE-CLIENT-SERVER-ENTRY--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CALLEDENTRYREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected BSWMODULECLIENTSERVERENTRYSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link BSWMODULECLIENTSERVERENTRYSUBTYPESENUM }
         *     
         */
        public BSWMODULECLIENTSERVERENTRYSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link BSWMODULECLIENTSERVERENTRYSUBTYPESENUM }
         *     
         */
        public void setDEST(BSWMODULECLIENTSERVERENTRYSUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}EXCLUSIVE-AREA-NESTING-ORDER--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CALLEDFROMWITHINEXCLUSIVEAREAREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected EXCLUSIVEAREANESTINGORDERSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link EXCLUSIVEAREANESTINGORDERSUBTYPESENUM }
         *     
         */
        public EXCLUSIVEAREANESTINGORDERSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link EXCLUSIVEAREANESTINGORDERSUBTYPESENUM }
         *     
         */
        public void setDEST(EXCLUSIVEAREANESTINGORDERSUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="CONTEXT-LIMITATION-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM" />
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
        "contextlimitationref"
    })
    public static class CONTEXTLIMITATIONREFS {

        @XmlElement(name = "CONTEXT-LIMITATION-REF")
        protected List<BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF> contextlimitationref;

        /**
         * Gets the value of the contextlimitationref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contextlimitationref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTEXTLIMITATIONREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF }
         * 
         * 
         */
        public List<BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF> getCONTEXTLIMITATIONREF() {
            if (contextlimitationref == null) {
                contextlimitationref = new ArrayList<BSWSYNCHRONOUSSERVERCALLPOINT.CONTEXTLIMITATIONREFS.CONTEXTLIMITATIONREF>();
            }
            return this.contextlimitationref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONTEXTLIMITATIONREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected BSWDISTINGUISHEDPARTITIONSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link BSWDISTINGUISHEDPARTITIONSUBTYPESENUM }
             *     
             */
            public BSWDISTINGUISHEDPARTITIONSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link BSWDISTINGUISHEDPARTITIONSUBTYPESENUM }
             *     
             */
            public void setDEST(BSWDISTINGUISHEDPARTITIONSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
