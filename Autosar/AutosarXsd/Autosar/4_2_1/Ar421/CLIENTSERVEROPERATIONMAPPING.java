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
 * Defines the mapping of two particular ClientServerOperations in context of two different ClientServerInterfaces.
 * 
 * <p>CLIENT-SERVER-OPERATION-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-SERVER-OPERATION-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-OPERATION-MAPPING"/>
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
@XmlType(name = "CLIENT-SERVER-OPERATION-MAPPING", propOrder = {
    "argumentmappings",
    "firstoperationref",
    "secondoperationref"
})
public class CLIENTSERVEROPERATIONMAPPING {

    @XmlElement(name = "ARGUMENT-MAPPINGS")
    protected CLIENTSERVEROPERATIONMAPPING.ARGUMENTMAPPINGS argumentmappings;
    @XmlElement(name = "FIRST-OPERATION-REF")
    protected CLIENTSERVEROPERATIONMAPPING.FIRSTOPERATIONREF firstoperationref;
    @XmlElement(name = "SECOND-OPERATION-REF")
    protected CLIENTSERVEROPERATIONMAPPING.SECONDOPERATIONREF secondoperationref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??argumentmappings?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVEROPERATIONMAPPING.ARGUMENTMAPPINGS }
     *     
     */
    public CLIENTSERVEROPERATIONMAPPING.ARGUMENTMAPPINGS getARGUMENTMAPPINGS() {
        return argumentmappings;
    }

    /**
     * ??argumentmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVEROPERATIONMAPPING.ARGUMENTMAPPINGS }
     *     
     */
    public void setARGUMENTMAPPINGS(CLIENTSERVEROPERATIONMAPPING.ARGUMENTMAPPINGS value) {
        this.argumentmappings = value;
    }

    /**
     * ??firstoperationref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVEROPERATIONMAPPING.FIRSTOPERATIONREF }
     *     
     */
    public CLIENTSERVEROPERATIONMAPPING.FIRSTOPERATIONREF getFIRSTOPERATIONREF() {
        return firstoperationref;
    }

    /**
     * ??firstoperationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVEROPERATIONMAPPING.FIRSTOPERATIONREF }
     *     
     */
    public void setFIRSTOPERATIONREF(CLIENTSERVEROPERATIONMAPPING.FIRSTOPERATIONREF value) {
        this.firstoperationref = value;
    }

    /**
     * ??secondoperationref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVEROPERATIONMAPPING.SECONDOPERATIONREF }
     *     
     */
    public CLIENTSERVEROPERATIONMAPPING.SECONDOPERATIONREF getSECONDOPERATIONREF() {
        return secondoperationref;
    }

    /**
     * ??secondoperationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVEROPERATIONMAPPING.SECONDOPERATIONREF }
     *     
     */
    public void setSECONDOPERATIONREF(CLIENTSERVEROPERATIONMAPPING.SECONDOPERATIONREF value) {
        this.secondoperationref = value;
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
     *         &lt;element name="DATA-PROTOTYPE-MAPPING" type="{http://autosar.org/schema/r4.0}DATA-PROTOTYPE-MAPPING"/>
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
        "dataprototypemapping"
    })
    public static class ARGUMENTMAPPINGS {

        @XmlElement(name = "DATA-PROTOTYPE-MAPPING")
        protected List<DATAPROTOTYPEMAPPING> dataprototypemapping;

        /**
         * Gets the value of the dataprototypemapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataprototypemapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATAPROTOTYPEMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DATAPROTOTYPEMAPPING }
         * 
         * 
         */
        public List<DATAPROTOTYPEMAPPING> getDATAPROTOTYPEMAPPING() {
            if (dataprototypemapping == null) {
                dataprototypemapping = new ArrayList<DATAPROTOTYPEMAPPING>();
            }
            return this.dataprototypemapping;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-OPERATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTOPERATIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CLIENTSERVEROPERATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CLIENTSERVEROPERATIONSUBTYPESENUM }
         *     
         */
        public CLIENTSERVEROPERATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CLIENTSERVEROPERATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(CLIENTSERVEROPERATIONSUBTYPESENUM value) {
            this.dest = value;
        }

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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-OPERATION--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SECONDOPERATIONREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected CLIENTSERVEROPERATIONSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link CLIENTSERVEROPERATIONSUBTYPESENUM }
         *     
         */
        public CLIENTSERVEROPERATIONSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link CLIENTSERVEROPERATIONSUBTYPESENUM }
         *     
         */
        public void setDEST(CLIENTSERVEROPERATIONSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
