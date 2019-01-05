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
 * Configures the outbound application endpoint a server uses to call a clients callback. Only required if the source TpPort is not dynamically assigned. If a consumed event group is referenced the configuration is only valid for this relation.
 * 
 * <p>EVENT-HANDLER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="EVENT-HANDLER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}EVENT-HANDLER"/>
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
@XmlType(name = "EVENT-HANDLER", propOrder = {
    "shortname",
    "applicationendpointref",
    "consumedeventgrouprefs",
    "multicastthreshold",
    "routinggrouprefs",
    "sdserverconfig"
})
public class EVENTHANDLER {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "APPLICATION-ENDPOINT-REF")
    protected EVENTHANDLER.APPLICATIONENDPOINTREF applicationendpointref;
    @XmlElement(name = "CONSUMED-EVENT-GROUP-REFS")
    protected EVENTHANDLER.CONSUMEDEVENTGROUPREFS consumedeventgrouprefs;
    @XmlElement(name = "MULTICAST-THRESHOLD")
    protected POSITIVEINTEGER multicastthreshold;
    @XmlElement(name = "ROUTING-GROUP-REFS")
    protected EVENTHANDLER.ROUTINGGROUPREFS routinggrouprefs;
    @XmlElement(name = "SD-SERVER-CONFIG")
    protected SDSERVERCONFIG sdserverconfig;
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
     * ??applicationendpointref?????
     * 
     * @return
     *     possible object is
     *     {@link EVENTHANDLER.APPLICATIONENDPOINTREF }
     *     
     */
    public EVENTHANDLER.APPLICATIONENDPOINTREF getAPPLICATIONENDPOINTREF() {
        return applicationendpointref;
    }

    /**
     * ??applicationendpointref?????
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTHANDLER.APPLICATIONENDPOINTREF }
     *     
     */
    public void setAPPLICATIONENDPOINTREF(EVENTHANDLER.APPLICATIONENDPOINTREF value) {
        this.applicationendpointref = value;
    }

    /**
     * ??consumedeventgrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link EVENTHANDLER.CONSUMEDEVENTGROUPREFS }
     *     
     */
    public EVENTHANDLER.CONSUMEDEVENTGROUPREFS getCONSUMEDEVENTGROUPREFS() {
        return consumedeventgrouprefs;
    }

    /**
     * ??consumedeventgrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTHANDLER.CONSUMEDEVENTGROUPREFS }
     *     
     */
    public void setCONSUMEDEVENTGROUPREFS(EVENTHANDLER.CONSUMEDEVENTGROUPREFS value) {
        this.consumedeventgrouprefs = value;
    }

    /**
     * ??multicastthreshold?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getMULTICASTTHRESHOLD() {
        return multicastthreshold;
    }

    /**
     * ??multicastthreshold?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setMULTICASTTHRESHOLD(POSITIVEINTEGER value) {
        this.multicastthreshold = value;
    }

    /**
     * ??routinggrouprefs?????
     * 
     * @return
     *     possible object is
     *     {@link EVENTHANDLER.ROUTINGGROUPREFS }
     *     
     */
    public EVENTHANDLER.ROUTINGGROUPREFS getROUTINGGROUPREFS() {
        return routinggrouprefs;
    }

    /**
     * ??routinggrouprefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTHANDLER.ROUTINGGROUPREFS }
     *     
     */
    public void setROUTINGGROUPREFS(EVENTHANDLER.ROUTINGGROUPREFS value) {
        this.routinggrouprefs = value;
    }

    /**
     * ??sdserverconfig?????
     * 
     * @return
     *     possible object is
     *     {@link SDSERVERCONFIG }
     *     
     */
    public SDSERVERCONFIG getSDSERVERCONFIG() {
        return sdserverconfig;
    }

    /**
     * ??sdserverconfig?????
     * 
     * @param value
     *     allowed object is
     *     {@link SDSERVERCONFIG }
     *     
     */
    public void setSDSERVERCONFIG(SDSERVERCONFIG value) {
        this.sdserverconfig = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-ENDPOINT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class APPLICATIONENDPOINTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONENDPOINTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONENDPOINTSUBTYPESENUM }
         *     
         */
        public APPLICATIONENDPOINTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONENDPOINTSUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONENDPOINTSUBTYPESENUM value) {
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
     *         &lt;element name="CONSUMED-EVENT-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSUMED-EVENT-GROUP--SUBTYPES-ENUM" />
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
        "consumedeventgroupref"
    })
    public static class CONSUMEDEVENTGROUPREFS {

        @XmlElement(name = "CONSUMED-EVENT-GROUP-REF")
        protected List<EVENTHANDLER.CONSUMEDEVENTGROUPREFS.CONSUMEDEVENTGROUPREF> consumedeventgroupref;

        /**
         * Gets the value of the consumedeventgroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the consumedeventgroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONSUMEDEVENTGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EVENTHANDLER.CONSUMEDEVENTGROUPREFS.CONSUMEDEVENTGROUPREF }
         * 
         * 
         */
        public List<EVENTHANDLER.CONSUMEDEVENTGROUPREFS.CONSUMEDEVENTGROUPREF> getCONSUMEDEVENTGROUPREF() {
            if (consumedeventgroupref == null) {
                consumedeventgroupref = new ArrayList<EVENTHANDLER.CONSUMEDEVENTGROUPREFS.CONSUMEDEVENTGROUPREF>();
            }
            return this.consumedeventgroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CONSUMED-EVENT-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONSUMEDEVENTGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected CONSUMEDEVENTGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link CONSUMEDEVENTGROUPSUBTYPESENUM }
             *     
             */
            public CONSUMEDEVENTGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link CONSUMEDEVENTGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(CONSUMEDEVENTGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

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
     *         &lt;element name="ROUTING-GROUP-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SO-AD-ROUTING-GROUP--SUBTYPES-ENUM" />
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
        "routinggroupref"
    })
    public static class ROUTINGGROUPREFS {

        @XmlElement(name = "ROUTING-GROUP-REF")
        protected List<EVENTHANDLER.ROUTINGGROUPREFS.ROUTINGGROUPREF> routinggroupref;

        /**
         * Gets the value of the routinggroupref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routinggroupref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROUTINGGROUPREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EVENTHANDLER.ROUTINGGROUPREFS.ROUTINGGROUPREF }
         * 
         * 
         */
        public List<EVENTHANDLER.ROUTINGGROUPREFS.ROUTINGGROUPREF> getROUTINGGROUPREF() {
            if (routinggroupref == null) {
                routinggroupref = new ArrayList<EVENTHANDLER.ROUTINGGROUPREFS.ROUTINGGROUPREF>();
            }
            return this.routinggroupref;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}SO-AD-ROUTING-GROUP--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ROUTINGGROUPREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected SOADROUTINGGROUPSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link SOADROUTINGGROUPSUBTYPESENUM }
             *     
             */
            public SOADROUTINGGROUPSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link SOADROUTINGGROUPSUBTYPESENUM }
             *     
             */
            public void setDEST(SOADROUTINGGROUPSUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
