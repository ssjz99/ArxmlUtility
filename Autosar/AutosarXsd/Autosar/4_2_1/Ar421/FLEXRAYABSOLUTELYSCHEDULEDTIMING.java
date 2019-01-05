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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Each frame in FlexRay is identified by its slot id and communication cycle. A description is provided by the usage of AbsolutelyScheduledTiming. 
 * 
 * In the static segment a frame can be sent multiple times within one communication cycle. For describing this case multiple AbsolutelyScheduledTimings have to be used. The main use case would be that a frame is sent twice within one communication cycle.
 * 
 * <p>FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING"/>
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
@XmlType(name = "FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING", propOrder = {
    "communicationcycle",
    "slotid"
})
public class FLEXRAYABSOLUTELYSCHEDULEDTIMING {

    @XmlElement(name = "COMMUNICATION-CYCLE")
    protected FLEXRAYABSOLUTELYSCHEDULEDTIMING.COMMUNICATIONCYCLE communicationcycle;
    @XmlElement(name = "SLOT-ID")
    protected POSITIVEINTEGER slotid;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??communicationcycle?????
     * 
     * @return
     *     possible object is
     *     {@link FLEXRAYABSOLUTELYSCHEDULEDTIMING.COMMUNICATIONCYCLE }
     *     
     */
    public FLEXRAYABSOLUTELYSCHEDULEDTIMING.COMMUNICATIONCYCLE getCOMMUNICATIONCYCLE() {
        return communicationcycle;
    }

    /**
     * ??communicationcycle?????
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXRAYABSOLUTELYSCHEDULEDTIMING.COMMUNICATIONCYCLE }
     *     
     */
    public void setCOMMUNICATIONCYCLE(FLEXRAYABSOLUTELYSCHEDULEDTIMING.COMMUNICATIONCYCLE value) {
        this.communicationcycle = value;
    }

    /**
     * ??slotid?????
     * 
     * @return
     *     possible object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public POSITIVEINTEGER getSLOTID() {
        return slotid;
    }

    /**
     * ??slotid?????
     * 
     * @param value
     *     allowed object is
     *     {@link POSITIVEINTEGER }
     *     
     */
    public void setSLOTID(POSITIVEINTEGER value) {
        this.slotid = value;
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="CYCLE-COUNTER" type="{http://autosar.org/schema/r4.0}CYCLE-COUNTER"/>
     *         &lt;element name="CYCLE-REPETITION" type="{http://autosar.org/schema/r4.0}CYCLE-REPETITION"/>
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
        "cyclecounterOrCYCLEREPETITION"
    })
    public static class COMMUNICATIONCYCLE {

        @XmlElements({
            @XmlElement(name = "CYCLE-COUNTER", type = CYCLECOUNTER.class),
            @XmlElement(name = "CYCLE-REPETITION", type = CYCLEREPETITION.class)
        })
        protected Object cyclecounterOrCYCLEREPETITION;

        /**
         * ??cyclecounterOrCYCLEREPETITION?????
         * 
         * @return
         *     possible object is
         *     {@link CYCLECOUNTER }
         *     {@link CYCLEREPETITION }
         *     
         */
        public Object getCYCLECOUNTEROrCYCLEREPETITION() {
            return cyclecounterOrCYCLEREPETITION;
        }

        /**
         * ??cyclecounterOrCYCLEREPETITION?????
         * 
         * @param value
         *     allowed object is
         *     {@link CYCLECOUNTER }
         *     {@link CYCLEREPETITION }
         *     
         */
        public void setCYCLECOUNTEROrCYCLEREPETITION(Object value) {
            this.cyclecounterOrCYCLEREPETITION = value;
        }

    }

}
