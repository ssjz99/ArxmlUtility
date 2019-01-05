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
 * A NM coordinator is an ECU, which is connected to at least two busses, and where the requirement exists that shutdown of NM of at least two of these busses (also referred to as coordinated busses) has to be performed synchronously.
 * 
 * <p>NM-COORDINATOR complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="NM-COORDINATOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}NM-COORDINATOR"/>
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
@XmlType(name = "NM-COORDINATOR", propOrder = {
    "index",
    "nmactivecoordinator",
    "nmcoordsyncsupport",
    "nmglobalcoordinatortime",
    "nmnoderefs",
    "nmshutdowndelaytimer"
})
public class NMCOORDINATOR {

    @XmlElement(name = "INDEX")
    protected INTEGER index;
    @XmlElement(name = "NM-ACTIVE-COORDINATOR")
    protected BOOLEAN nmactivecoordinator;
    @XmlElement(name = "NM-COORD-SYNC-SUPPORT")
    protected BOOLEAN nmcoordsyncsupport;
    @XmlElement(name = "NM-GLOBAL-COORDINATOR-TIME")
    protected TIMEVALUE nmglobalcoordinatortime;
    @XmlElement(name = "NM-NODE-REFS")
    protected NMCOORDINATOR.NMNODEREFS nmnoderefs;
    @XmlElement(name = "NM-SHUTDOWN-DELAY-TIMER")
    protected TIMEVALUE nmshutdowndelaytimer;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??index?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getINDEX() {
        return index;
    }

    /**
     * ??index?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setINDEX(INTEGER value) {
        this.index = value;
    }

    /**
     * ??nmactivecoordinator?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMACTIVECOORDINATOR() {
        return nmactivecoordinator;
    }

    /**
     * ??nmactivecoordinator?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMACTIVECOORDINATOR(BOOLEAN value) {
        this.nmactivecoordinator = value;
    }

    /**
     * ??nmcoordsyncsupport?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getNMCOORDSYNCSUPPORT() {
        return nmcoordsyncsupport;
    }

    /**
     * ??nmcoordsyncsupport?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setNMCOORDSYNCSUPPORT(BOOLEAN value) {
        this.nmcoordsyncsupport = value;
    }

    /**
     * ??nmglobalcoordinatortime?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMGLOBALCOORDINATORTIME() {
        return nmglobalcoordinatortime;
    }

    /**
     * ??nmglobalcoordinatortime?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMGLOBALCOORDINATORTIME(TIMEVALUE value) {
        this.nmglobalcoordinatortime = value;
    }

    /**
     * ??nmnoderefs?????
     * 
     * @return
     *     possible object is
     *     {@link NMCOORDINATOR.NMNODEREFS }
     *     
     */
    public NMCOORDINATOR.NMNODEREFS getNMNODEREFS() {
        return nmnoderefs;
    }

    /**
     * ??nmnoderefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link NMCOORDINATOR.NMNODEREFS }
     *     
     */
    public void setNMNODEREFS(NMCOORDINATOR.NMNODEREFS value) {
        this.nmnoderefs = value;
    }

    /**
     * ??nmshutdowndelaytimer?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getNMSHUTDOWNDELAYTIMER() {
        return nmshutdowndelaytimer;
    }

    /**
     * ??nmshutdowndelaytimer?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setNMSHUTDOWNDELAYTIMER(TIMEVALUE value) {
        this.nmshutdowndelaytimer = value;
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
     *         &lt;element name="NM-NODE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NM-NODE--SUBTYPES-ENUM" />
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
        "nmnoderef"
    })
    public static class NMNODEREFS {

        @XmlElement(name = "NM-NODE-REF")
        protected List<NMCOORDINATOR.NMNODEREFS.NMNODEREF> nmnoderef;

        /**
         * Gets the value of the nmnoderef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nmnoderef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNMNODEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NMCOORDINATOR.NMNODEREFS.NMNODEREF }
         * 
         * 
         */
        public List<NMCOORDINATOR.NMNODEREFS.NMNODEREF> getNMNODEREF() {
            if (nmnoderef == null) {
                nmnoderef = new ArrayList<NMCOORDINATOR.NMNODEREFS.NMNODEREF>();
            }
            return this.nmnoderef;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}NM-NODE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NMNODEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected NMNODESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link NMNODESUBTYPESENUM }
             *     
             */
            public NMNODESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link NMNODESUBTYPESENUM }
             *     
             */
            public void setDEST(NMNODESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
