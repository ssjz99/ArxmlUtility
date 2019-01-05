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
 * Allows to define existence dependencies based on the value of  parameter values.
 * 
 * <p>ECUC-CONDITION-SPECIFICATION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ECUC-CONDITION-SPECIFICATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ECUC-CONDITION-SPECIFICATION"/>
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
@XmlType(name = "ECUC-CONDITION-SPECIFICATION", propOrder = {
    "conditionformula",
    "ecucquerys",
    "informalformula"
})
public class ECUCCONDITIONSPECIFICATION {

    @XmlElement(name = "CONDITION-FORMULA")
    protected ECUCCONDITIONFORMULA conditionformula;
    @XmlElement(name = "ECUC-QUERYS")
    protected ECUCCONDITIONSPECIFICATION.ECUCQUERYS ecucquerys;
    @XmlElement(name = "INFORMAL-FORMULA")
    protected MLFORMULA informalformula;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??conditionformula?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONDITIONFORMULA }
     *     
     */
    public ECUCCONDITIONFORMULA getCONDITIONFORMULA() {
        return conditionformula;
    }

    /**
     * ??conditionformula?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONDITIONFORMULA }
     *     
     */
    public void setCONDITIONFORMULA(ECUCCONDITIONFORMULA value) {
        this.conditionformula = value;
    }

    /**
     * ??ecucquerys?????
     * 
     * @return
     *     possible object is
     *     {@link ECUCCONDITIONSPECIFICATION.ECUCQUERYS }
     *     
     */
    public ECUCCONDITIONSPECIFICATION.ECUCQUERYS getECUCQUERYS() {
        return ecucquerys;
    }

    /**
     * ??ecucquerys?????
     * 
     * @param value
     *     allowed object is
     *     {@link ECUCCONDITIONSPECIFICATION.ECUCQUERYS }
     *     
     */
    public void setECUCQUERYS(ECUCCONDITIONSPECIFICATION.ECUCQUERYS value) {
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
