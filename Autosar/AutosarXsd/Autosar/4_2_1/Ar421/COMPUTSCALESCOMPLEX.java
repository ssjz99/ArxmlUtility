//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:36:46 PM CET 
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
 * This meta-class represents the ability to stepwise express a computation method.
 * 
 * <p>COMPU-SCALES complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="COMPU-SCALES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPU-CONTENT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}COMPU-SCALES"/>
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
@XmlType(name = "COMPU-SCALES", propOrder = {
    "compuscales"
})
public class COMPUTSCALESCOMPLEX {

    @XmlElement(name = "COMPU-SCALES")
    protected COMPUTSCALESCOMPLEX.COMPUSCALES compuscales;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??compuscales?????
     * 
     * @return
     *     possible object is
     *     {@link COMPUTSCALESCOMPLEX.COMPUSCALES }
     *     
     */
    public COMPUTSCALESCOMPLEX.COMPUSCALES getCOMPUSCALES() {
        return compuscales;
    }

    /**
     * ??compuscales?????
     * 
     * @param value
     *     allowed object is
     *     {@link COMPUTSCALESCOMPLEX.COMPUSCALES }
     *     
     */
    public void setCOMPUSCALES(COMPUTSCALESCOMPLEX.COMPUSCALES value) {
        this.compuscales = value;
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
     *         &lt;element name="COMPU-SCALE" type="{http://autosar.org/schema/r4.0}COMPU-SCALE"/>
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
        "compuscale"
    })
    public static class COMPUSCALES {

        @XmlElement(name = "COMPU-SCALE")
        protected List<COMPUSCALE> compuscale;

        /**
         * Gets the value of the compuscale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compuscale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMPUSCALE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPUSCALE }
         * 
         * 
         */
        public List<COMPUSCALE> getCOMPUSCALE() {
            if (compuscale == null) {
                compuscale = new ArrayList<COMPUSCALE>();
            }
            return this.compuscale;
        }

    }

}
