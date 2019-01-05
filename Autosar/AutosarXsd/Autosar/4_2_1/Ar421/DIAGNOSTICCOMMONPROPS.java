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
 * This meta-class aggregates a number of common properties that are shared among a diagnostic extract.
 * 
 * <p>DIAGNOSTIC-COMMON-PROPS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="DIAGNOSTIC-COMMON-PROPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-PROPS"/>
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
@XmlType(name = "DIAGNOSTIC-COMMON-PROPS", propOrder = {
    "diagnosticcommonpropsvariants"
})
public class DIAGNOSTICCOMMONPROPS {

    @XmlElement(name = "DIAGNOSTIC-COMMON-PROPS-VARIANTS")
    protected DIAGNOSTICCOMMONPROPS.DIAGNOSTICCOMMONPROPSVARIANTS diagnosticcommonpropsvariants;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??diagnosticcommonpropsvariants?????
     * 
     * @return
     *     possible object is
     *     {@link DIAGNOSTICCOMMONPROPS.DIAGNOSTICCOMMONPROPSVARIANTS }
     *     
     */
    public DIAGNOSTICCOMMONPROPS.DIAGNOSTICCOMMONPROPSVARIANTS getDIAGNOSTICCOMMONPROPSVARIANTS() {
        return diagnosticcommonpropsvariants;
    }

    /**
     * ??diagnosticcommonpropsvariants?????
     * 
     * @param value
     *     allowed object is
     *     {@link DIAGNOSTICCOMMONPROPS.DIAGNOSTICCOMMONPROPSVARIANTS }
     *     
     */
    public void setDIAGNOSTICCOMMONPROPSVARIANTS(DIAGNOSTICCOMMONPROPS.DIAGNOSTICCOMMONPROPSVARIANTS value) {
        this.diagnosticcommonpropsvariants = value;
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
     *         &lt;element name="DIAGNOSTIC-COMMON-PROPS-CONDITIONAL" type="{http://autosar.org/schema/r4.0}DIAGNOSTIC-COMMON-PROPS-CONDITIONAL"/>
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
        "diagnosticcommonpropsconditional"
    })
    public static class DIAGNOSTICCOMMONPROPSVARIANTS {

        @XmlElement(name = "DIAGNOSTIC-COMMON-PROPS-CONDITIONAL")
        protected List<DIAGNOSTICCOMMONPROPSCONDITIONAL> diagnosticcommonpropsconditional;

        /**
         * Gets the value of the diagnosticcommonpropsconditional property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticcommonpropsconditional property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGNOSTICCOMMONPROPSCONDITIONAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIAGNOSTICCOMMONPROPSCONDITIONAL }
         * 
         * 
         */
        public List<DIAGNOSTICCOMMONPROPSCONDITIONAL> getDIAGNOSTICCOMMONPROPSCONDITIONAL() {
            if (diagnosticcommonpropsconditional == null) {
                diagnosticcommonpropsconditional = new ArrayList<DIAGNOSTICCOMMONPROPSCONDITIONAL>();
            }
            return this.diagnosticcommonpropsconditional;
        }

    }

}
