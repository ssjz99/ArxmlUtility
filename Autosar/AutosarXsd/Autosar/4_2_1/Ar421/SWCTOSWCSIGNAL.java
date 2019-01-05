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
 * The SwcToSwcSignal describes the information (data element) that is exchanged between two SW Components. On the SWC Level it is possible that a SW Component sends one data element from one P-Port to two different SW Components (1:n Communication). The SwcToSwcSignal describes exactly the information which is exchanged between one P-Port of a SW Component and one R-Port of another SW Component.
 * 
 * <p>SWC-TO-SWC-SIGNAL complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-TO-SWC-SIGNAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-TO-SWC-SIGNAL"/>
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
@XmlType(name = "SWC-TO-SWC-SIGNAL", propOrder = {
    "dataelementirefs"
})
public class SWCTOSWCSIGNAL {

    @XmlElement(name = "DATA-ELEMENT-IREFS")
    protected SWCTOSWCSIGNAL.DATAELEMENTIREFS dataelementirefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??dataelementirefs?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOSWCSIGNAL.DATAELEMENTIREFS }
     *     
     */
    public SWCTOSWCSIGNAL.DATAELEMENTIREFS getDATAELEMENTIREFS() {
        return dataelementirefs;
    }

    /**
     * ??dataelementirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOSWCSIGNAL.DATAELEMENTIREFS }
     *     
     */
    public void setDATAELEMENTIREFS(SWCTOSWCSIGNAL.DATAELEMENTIREFS value) {
        this.dataelementirefs = value;
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
     *       &lt;choice maxOccurs="2" minOccurs="0">
     *         &lt;element name="DATA-ELEMENT-IREF" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE-IN-SYSTEM-INSTANCE-REF"/>
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
        "dataelementiref"
    })
    public static class DATAELEMENTIREFS {

        @XmlElement(name = "DATA-ELEMENT-IREF")
        protected List<VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF> dataelementiref;

        /**
         * Gets the value of the dataelementiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataelementiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATAELEMENTIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF }
         * 
         * 
         */
        public List<VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF> getDATAELEMENTIREF() {
            if (dataelementiref == null) {
                dataelementiref = new ArrayList<VARIABLEDATAPROTOTYPEINSYSTEMINSTANCEREF>();
            }
            return this.dataelementiref;
        }

    }

}
