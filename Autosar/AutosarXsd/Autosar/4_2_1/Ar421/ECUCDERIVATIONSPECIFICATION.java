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
 * Allows to define configuration items that are calculated based on the value of
 * - other parameter values
 * - elements (attributes/classes) defined in other AUTOSAR templates such as System template and SW component template
 * 
 * <p>ECUC-DERIVATION-SPECIFICATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-DERIVATION-SPECIFICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-DERIVATION-SPECIFICATION"/>
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
@XmlType(name = "ECUC-DERIVATION-SPECIFICATION", propOrder = {
    "calculationformula",
    "ecucquerys",
    "informalformula"
})
public class ECUCDERIVATIONSPECIFICATION {

    @XmlElement(name = "CALCULATION-FORMULA")
    protected ECUCPARAMETERDERIVATIONFORMULA calculationformula;
    @XmlElement(name = "ECUC-QUERYS")
    protected ECUCDERIVATIONSPECIFICATION.ECUCQUERYS ecucquerys;
    @XmlElement(name = "INFORMAL-FORMULA")
    protected MLFORMULA informalformula;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??calculationformula?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCPARAMETERDERIVATIONFORMULA }
     *     
     */
    public ECUCPARAMETERDERIVATIONFORMULA getCALCULATIONFORMULA() {
        return calculationformula;
    }

    /**
     * ??calculationformula?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCPARAMETERDERIVATIONFORMULA }
     *     
     */
    public void setCALCULATIONFORMULA(ECUCPARAMETERDERIVATIONFORMULA value) {
        this.calculationformula = value;
    }

    /**
     * ??ecucquerys?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCDERIVATIONSPECIFICATION.ECUCQUERYS }
     *     
     */
    public ECUCDERIVATIONSPECIFICATION.ECUCQUERYS getECUCQUERYS() {
        return ecucquerys;
    }

    /**
     * ??ecucquerys?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCDERIVATIONSPECIFICATION.ECUCQUERYS }
     *     
     */
    public void setECUCQUERYS(ECUCDERIVATIONSPECIFICATION.ECUCQUERYS value) {
        this.ecucquerys = value;
    }

    /**
     * ??informalformula?????
     * 
     * @return
     *     possible object is
     *     {@link MLFORMULA }
     *     
     */
    public MLFORMULA getINFORMALFORMULA() {
        return informalformula;
    }

    /**
     * ??informalformula?????
     * 
     * @param value
     *     allowed object is
     *     {@link MLFORMULA }
     *     
     */
    public void setINFORMALFORMULA(MLFORMULA value) {
        this.informalformula = value;
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
     *         &lt;element name="ECUC-QUERY" type="{http://autosar.org/schema/r4.0}ECUC-QUERY"/>
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
        "ecucquery"
    })
    public static class ECUCQUERYS {

        @XmlElement(name = "ECUC-QUERY")
        protected List<ECUCQUERY> ecucquery;

        /**
         * Gets the value of the ecucquery property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecucquery property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECUCQUERY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECUCQUERY }
         * 
         * 
         */
        public List<ECUCQUERY> getECUCQUERY() {
            if (ecucquery == null) {
                ecucquery = new ArrayList<ECUCQUERY>();
            }
            return this.ecucquery;
        }

    }

}
