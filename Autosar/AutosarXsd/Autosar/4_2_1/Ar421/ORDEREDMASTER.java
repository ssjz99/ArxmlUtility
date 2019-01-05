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
 * Element in the network endpoint list.
 * 
 * <p>ORDERED-MASTER complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ORDERED-MASTER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ORDERED-MASTER"/>
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
@XmlType(name = "ORDERED-MASTER", propOrder = {
    "index",
    "timesyncserverref"
})
public class ORDEREDMASTER {

    @XmlElement(name = "INDEX")
    protected POSITIVEINTEGER index;
    @XmlElement(name = "TIME-SYNC-SERVER-REF")
    protected ORDEREDMASTER.TIMESYNCSERVERREF timesyncserverref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??index?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getINDEX() {
        return index;
    }

    /**
     * ??index?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setINDEX(POSITIVEINTEGER value) {
        this.index = value;
    }

    /**
     * ??timesyncserverref?????
     * 
     * @return
     *     possible object is
     *     {@link ORDEREDMASTER.TIMESYNCSERVERREF }
     *     
     */
    public ORDEREDMASTER.TIMESYNCSERVERREF getTIMESYNCSERVERREF() {
        return timesyncserverref;
    }

    /**
     * ??timesyncserverref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ORDEREDMASTER.TIMESYNCSERVERREF }
     *     
     */
    public void setTIMESYNCSERVERREF(ORDEREDMASTER.TIMESYNCSERVERREF value) {
        this.timesyncserverref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}TIME-SYNC-SERVER-CONFIGURATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TIMESYNCSERVERREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM }
         *     
         */
        public TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(TIMESYNCSERVERCONFIGURATIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
