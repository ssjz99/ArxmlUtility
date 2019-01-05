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
 * Defines properties for the debounce algorithm class.
 * 
 * <p>DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}REFERRABLE"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS"/>
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
@XmlType(name = "DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS", propOrder = {
    "shortname",
    "debouncealgorithm",
    "debouncebehavior",
    "debouncecounterstorage"
})
public class DIAGNOSTICDEBOUNCEALGORITHMPROPS {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected IDENTIFIER shortname;
    @XmlElement(name = "DEBOUNCE-ALGORITHM")
    protected DIAGNOSTICDEBOUNCEALGORITHMPROPS.DEBOUNCEALGORITHM debouncealgorithm;
    @XmlElement(name = "DEBOUNCE-BEHAVIOR")
    protected DIAGNOSTICDEBOUNCEBEHAVIORENUM debouncebehavior;
    @XmlElement(name = "DEBOUNCE-COUNTER-STORAGE")
    protected BOOLEAN debouncecounterstorage;
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
     * ??debouncealgorithm?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICDEBOUNCEALGORITHMPROPS.DEBOUNCEALGORITHM }
     *     
     */
    public DIAGNOSTICDEBOUNCEALGORITHMPROPS.DEBOUNCEALGORITHM getDEBOUNCEALGORITHM() {
        return debouncealgorithm;
    }

    /**
     * ??debouncealgorithm?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICDEBOUNCEALGORITHMPROPS.DEBOUNCEALGORITHM }
     *     
     */
    public void setDEBOUNCEALGORITHM(DIAGNOSTICDEBOUNCEALGORITHMPROPS.DEBOUNCEALGORITHM value) {
        this.debouncealgorithm = value;
    }

    /**
     * ??debouncebehavior?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICDEBOUNCEBEHAVIORENUM }
     *     
     */
    public DIAGNOSTICDEBOUNCEBEHAVIORENUM getDEBOUNCEBEHAVIOR() {
        return debouncebehavior;
    }

    /**
     * ??debouncebehavior?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICDEBOUNCEBEHAVIORENUM }
     *     
     */
    public void setDEBOUNCEBEHAVIOR(DIAGNOSTICDEBOUNCEBEHAVIORENUM value) {
        this.debouncebehavior = value;
    }

    /**
     * ??debouncecounterstorage?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getDEBOUNCECOUNTERSTORAGE() {
        return debouncecounterstorage;
    }

    /**
     * ??debouncecounterstorage?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setDEBOUNCECOUNTERSTORAGE(BOOLEAN value) {
        this.debouncecounterstorage = value;
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
     *         &lt;element name="DIAG-EVENT-DEBOUNCE-COUNTER-BASED" type="{http://autosar.org/schema/r4.0}DIAG-EVENT-DEBOUNCE-COUNTER-BASED"/>
     *         &lt;element name="DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL" type="{http://autosar.org/schema/r4.0}DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL"/>
     *         &lt;element name="DIAG-EVENT-DEBOUNCE-TIME-BASED" type="{http://autosar.org/schema/r4.0}DIAG-EVENT-DEBOUNCE-TIME-BASED"/>
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
        "diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED"
    })
    public static class DEBOUNCEALGORITHM {

        @XmlElements({
            @XmlElement(name = "DIAG-EVENT-DEBOUNCE-COUNTER-BASED", type = DIAGEVENTDEBOUNCECOUNTERBASED.class),
            @XmlElement(name = "DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL", type = DIAGEVENTDEBOUNCEMONITORINTERNAL.class),
            @XmlElement(name = "DIAG-EVENT-DEBOUNCE-TIME-BASED", type = DIAGEVENTDEBOUNCETIMEBASED.class)
        })
        protected Object diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED;

        /**
         * ??diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED?????
         * 
         * @return
         *     possible object is
         *     {@link DIAGEVENTDEBOUNCECOUNTERBASED }
         *     {@link DIAGEVENTDEBOUNCEMONITORINTERNAL }
         *     {@link DIAGEVENTDEBOUNCETIMEBASED }
         *     
         */
        public Object getDIAGEVENTDEBOUNCECOUNTERBASEDOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED() {
            return diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED;
        }

        /**
         * ??diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED?????
         * 
         * @param value
         *     allowed object is
         *     {@link DIAGEVENTDEBOUNCECOUNTERBASED }
         *     {@link DIAGEVENTDEBOUNCEMONITORINTERNAL }
         *     {@link DIAGEVENTDEBOUNCETIMEBASED }
         *     
         */
        public void setDIAGEVENTDEBOUNCECOUNTERBASEDOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED(Object value) {
            this.diageventdebouncecounterbasedOrDIAGEVENTDEBOUNCEMONITORINTERNALOrDIAGEVENTDEBOUNCETIMEBASED = value;
        }

    }

}
