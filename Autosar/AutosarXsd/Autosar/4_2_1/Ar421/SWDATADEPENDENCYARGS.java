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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * This element specifies the elements used in a SwDataDependency.
 * 
 * <p>SW-DATA-DEPENDENCY-ARGS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-DATA-DEPENDENCY-ARGS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-DATA-DEPENDENCY-ARGS"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW-DATA-DEPENDENCY-ARGS", propOrder = {
    "orARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE"
})
public class SWDATADEPENDENCYARGS {

    @XmlElements({
        @XmlElement(name = "AR-PARAMETER", type = AUTOSARPARAMETERREF.class),
        @XmlElement(name = "MC-DATA-INSTANCE-REF", type = Ar421.SWCALPRMREFPROXY.MCDATAINSTANCEREF.class),
        @XmlElement(name = "AUTOSAR-VARIABLE", type = AUTOSARVARIABLEREF.class),
        @XmlElement(name = "MC-DATA-INSTANCE-VAR-REF", type = Ar421.SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF.class)
    })
    protected List<Object> orARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * Gets the value of the orARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AUTOSARPARAMETERREF }
     * {@link Ar421.SWCALPRMREFPROXY.MCDATAINSTANCEREF }
     * {@link AUTOSARVARIABLEREF }
     * {@link Ar421.SWVARIABLEREFPROXY.MCDATAINSTANCEVARREF }
     * 
     * 
     */
    public List<Object> getOrARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE() {
        if (orARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE == null) {
            orARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE = new ArrayList<Object>();
        }
        return this.orARPARAMETERAndMCDATAINSTANCEREFOrAUTOSARVARIABLE;
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

}
