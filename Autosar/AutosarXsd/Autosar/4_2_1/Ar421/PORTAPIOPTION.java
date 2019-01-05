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
 * Options how to generate the signatures of calls for an AtomicSwComponentType in order to communicate over a PortPrototype (for calls into a RunnableEntity as well as for calls from a RunnableEntity to the PortPrototype).
 * 
 * <p>PORT-API-OPTION complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PORT-API-OPTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PORT-API-OPTION"/>
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
@XmlType(name = "PORT-API-OPTION", propOrder = {
    "enabletakeaddress",
    "errorhandling",
    "indirectapi",
    "portargvalues",
    "portref",
    "variationpoint"
})
public class PORTAPIOPTION {

    @XmlElement(name = "ENABLE-TAKE-ADDRESS")
    protected BOOLEAN enabletakeaddress;
    @XmlElement(name = "ERROR-HANDLING")
    protected DATATRANSFORMATIONERRORHANDLINGENUM errorhandling;
    @XmlElement(name = "INDIRECT-API")
    protected BOOLEAN indirectapi;
    @XmlElement(name = "PORT-ARG-VALUES")
    protected PORTAPIOPTION.PORTARGVALUES portargvalues;
    @XmlElement(name = "PORT-REF")
    protected PORTAPIOPTION.PORTREF portref;
    @XmlElement(name = "VARIATION-POINT")
    protected VARIATIONPOINT variationpoint;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??enabletakeaddress?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getENABLETAKEADDRESS() {
        return enabletakeaddress;
    }

    /**
     * ??enabletakeaddress?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setENABLETAKEADDRESS(BOOLEAN value) {
        this.enabletakeaddress = value;
    }

    /**
     * ??errorhandling?????
     * 
     * @return
     *     possible object is
     *     {@link DATATRANSFORMATIONERRORHANDLINGENUM }
     *     
     */
    public DATATRANSFORMATIONERRORHANDLINGENUM getERRORHANDLING() {
        return errorhandling;
    }

    /**
     * ??errorhandling?????
     * 
     * @param value
     *     allowed object is
     *     {@link DATATRANSFORMATIONERRORHANDLINGENUM }
     *     
     */
    public void setERRORHANDLING(DATATRANSFORMATIONERRORHANDLINGENUM value) {
        this.errorhandling = value;
    }

    /**
     * ??indirectapi?????
     * 
     * @return
     *     possible object is
     *     {@link BOOLEAN }
     *     
     */
    public BOOLEAN getINDIRECTAPI() {
        return indirectapi;
    }

    /**
     * ??indirectapi?????
     * 
     * @param value
     *     allowed object is
     *     {@link BOOLEAN }
     *     
     */
    public void setINDIRECTAPI(BOOLEAN value) {
        this.indirectapi = value;
    }

    /**
     * ??portargvalues?????
     * 
     * @return
     *     possible object is
     *     {@link PORTAPIOPTION.PORTARGVALUES }
     *     
     */
    public PORTAPIOPTION.PORTARGVALUES getPORTARGVALUES() {
        return portargvalues;
    }

    /**
     * ??portargvalues?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTAPIOPTION.PORTARGVALUES }
     *     
     */
    public void setPORTARGVALUES(PORTAPIOPTION.PORTARGVALUES value) {
        this.portargvalues = value;
    }

    /**
     * ??portref?????
     * 
     * @return
     *     possible object is
     *     {@link PORTAPIOPTION.PORTREF }
     *     
     */
    public PORTAPIOPTION.PORTREF getPORTREF() {
        return portref;
    }

    /**
     * ??portref?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTAPIOPTION.PORTREF }
     *     
     */
    public void setPORTREF(PORTAPIOPTION.PORTREF value) {
        this.portref = value;
    }

    /**
     * ??variationpoint?????
     * 
     * @return
     *     possible object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public VARIATIONPOINT getVARIATIONPOINT() {
        return variationpoint;
    }

    /**
     * ??variationpoint?????
     * 
     * @param value
     *     allowed object is
     *     {@link VARIATIONPOINT }
     *     
     */
    public void setVARIATIONPOINT(VARIATIONPOINT value) {
        this.variationpoint = value;
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
     *         &lt;element name="PORT-DEFINED-ARGUMENT-VALUE" type="{http://autosar.org/schema/r4.0}PORT-DEFINED-ARGUMENT-VALUE"/>
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
        "portdefinedargumentvalue"
    })
    public static class PORTARGVALUES {

        @XmlElement(name = "PORT-DEFINED-ARGUMENT-VALUE")
        protected List<PORTDEFINEDARGUMENTVALUE> portdefinedargumentvalue;

        /**
         * Gets the value of the portdefinedargumentvalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the portdefinedargumentvalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPORTDEFINEDARGUMENTVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PORTDEFINEDARGUMENTVALUE }
         * 
         * 
         */
        public List<PORTDEFINEDARGUMENTVALUE> getPORTDEFINEDARGUMENTVALUE() {
            if (portdefinedargumentvalue == null) {
                portdefinedargumentvalue = new ArrayList<PORTDEFINEDARGUMENTVALUE>();
            }
            return this.portdefinedargumentvalue;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected PORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public PORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link PORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(PORTPROTOTYPESUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
