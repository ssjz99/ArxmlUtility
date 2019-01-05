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
 * An SwAxisGrouped is an axis which is shared between multiple calibration parameters.
 * 
 * <p>SW-AXIS-GROUPED complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SW-AXIS-GROUPED">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-CALPRM-AXIS-TYPE-PROPS"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SW-AXIS-GROUPED"/>
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
@XmlType(name = "SW-AXIS-GROUPED", propOrder = {
    "sharedaxistyperef",
    "swaxisindex",
    "arparameterAndMCDATAINSTANCEREF"
})
public class SWAXISGROUPED {

    @XmlElement(name = "SHARED-AXIS-TYPE-REF")
    protected SWAXISGROUPED.SHAREDAXISTYPEREF sharedaxistyperef;
    @XmlElement(name = "SW-AXIS-INDEX")
    protected AXISINDEXTYPE swaxisindex;
    @XmlElements({
        @XmlElement(name = "AR-PARAMETER", type = AUTOSARPARAMETERREF.class),
        @XmlElement(name = "MC-DATA-INSTANCE-REF", type = Ar421.SWCALPRMREFPROXY.MCDATAINSTANCEREF.class)
    })
    protected List<Object> arparameterAndMCDATAINSTANCEREF;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??sharedaxistyperef?????
     * 
     * @return
     *     possible object is
     *     {@link SWAXISGROUPED.SHAREDAXISTYPEREF }
     *     
     */
    public SWAXISGROUPED.SHAREDAXISTYPEREF getSHAREDAXISTYPEREF() {
        return sharedaxistyperef;
    }

    /**
     * ??sharedaxistyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWAXISGROUPED.SHAREDAXISTYPEREF }
     *     
     */
    public void setSHAREDAXISTYPEREF(SWAXISGROUPED.SHAREDAXISTYPEREF value) {
        this.sharedaxistyperef = value;
    }

    /**
     * ??swaxisindex?????
     * 
     * @return
     *     possible object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public AXISINDEXTYPE getSWAXISINDEX() {
        return swaxisindex;
    }

    /**
     * ??swaxisindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link AXISINDEXTYPE }
     *     
     */
    public void setSWAXISINDEX(AXISINDEXTYPE value) {
        this.swaxisindex = value;
    }

    /**
     * Gets the value of the arparameterAndMCDATAINSTANCEREF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arparameterAndMCDATAINSTANCEREF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARPARAMETERAndMCDATAINSTANCEREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AUTOSARPARAMETERREF }
     * {@link Ar421.SWCALPRMREFPROXY.MCDATAINSTANCEREF }
     * 
     * 
     */
    public List<Object> getARPARAMETERAndMCDATAINSTANCEREF() {
        if (arparameterAndMCDATAINSTANCEREF == null) {
            arparameterAndMCDATAINSTANCEREF = new ArrayList<Object>();
        }
        return this.arparameterAndMCDATAINSTANCEREF;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}APPLICATION-PRIMITIVE-DATA-TYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SHAREDAXISTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM }
         *     
         */
        public APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM }
         *     
         */
        public void setDEST(APPLICATIONPRIMITIVEDATATYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
