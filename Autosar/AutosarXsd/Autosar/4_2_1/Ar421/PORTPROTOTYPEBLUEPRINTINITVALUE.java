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
 * This meta-class represents the ability to express init values in PortPrototypeBlueprints. These init values act as a kind of blueprint from which for example proper ComSpecs can be derived.
 * 
 * <p>PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE"/>
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
@XmlType(name = "PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE", propOrder = {
    "dataprototyperef",
    "value"
})
public class PORTPROTOTYPEBLUEPRINTINITVALUE {

    @XmlElement(name = "DATA-PROTOTYPE-REF")
    protected PORTPROTOTYPEBLUEPRINTINITVALUE.DATAPROTOTYPEREF dataprototyperef;
    @XmlElement(name = "VALUE")
    protected PORTPROTOTYPEBLUEPRINTINITVALUE.VALUE value;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??dataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINTINITVALUE.DATAPROTOTYPEREF }
     *     
     */
    public PORTPROTOTYPEBLUEPRINTINITVALUE.DATAPROTOTYPEREF getDATAPROTOTYPEREF() {
        return dataprototyperef;
    }

    /**
     * ??dataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINTINITVALUE.DATAPROTOTYPEREF }
     *     
     */
    public void setDATAPROTOTYPEREF(PORTPROTOTYPEBLUEPRINTINITVALUE.DATAPROTOTYPEREF value) {
        this.dataprototyperef = value;
    }

    /**
     * ??value?????
     * 
     * @return
     *     possible object is
     *     {@link PORTPROTOTYPEBLUEPRINTINITVALUE.VALUE }
     *     
     */
    public PORTPROTOTYPEBLUEPRINTINITVALUE.VALUE getVALUE() {
        return value;
    }

    /**
     * ??value?????
     * 
     * @param value
     *     allowed object is
     *     {@link PORTPROTOTYPEBLUEPRINTINITVALUE.VALUE }
     *     
     */
    public void setVALUE(PORTPROTOTYPEBLUEPRINTINITVALUE.VALUE value) {
        this.value = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected AUTOSARDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public AUTOSARDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link AUTOSARDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(AUTOSARDATAPROTOTYPESUBTYPESENUM value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element name="APPLICATION-RULE-BASED-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}APPLICATION-RULE-BASED-VALUE-SPECIFICATION"/>
     *         &lt;element name="APPLICATION-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}APPLICATION-VALUE-SPECIFICATION"/>
     *         &lt;element name="ARRAY-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}ARRAY-VALUE-SPECIFICATION"/>
     *         &lt;element name="CONSTANT-REFERENCE" type="{http://autosar.org/schema/r4.0}CONSTANT-REFERENCE"/>
     *         &lt;element name="NUMERICAL-RULE-BASED-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}NUMERICAL-RULE-BASED-VALUE-SPECIFICATION"/>
     *         &lt;element name="NUMERICAL-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}NUMERICAL-VALUE-SPECIFICATION"/>
     *         &lt;element name="RECORD-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}RECORD-VALUE-SPECIFICATION"/>
     *         &lt;element name="REFERENCE-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}REFERENCE-VALUE-SPECIFICATION"/>
     *         &lt;element name="TEXT-VALUE-SPECIFICATION" type="{http://autosar.org/schema/r4.0}TEXT-VALUE-SPECIFICATION"/>
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
        "applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION"
    })
    public static class VALUE {

        @XmlElements({
            @XmlElement(name = "APPLICATION-RULE-BASED-VALUE-SPECIFICATION", type = APPLICATIONRULEBASEDVALUESPECIFICATION.class),
            @XmlElement(name = "APPLICATION-VALUE-SPECIFICATION", type = APPLICATIONVALUESPECIFICATION.class),
            @XmlElement(name = "ARRAY-VALUE-SPECIFICATION", type = ARRAYVALUESPECIFICATION.class),
            @XmlElement(name = "CONSTANT-REFERENCE", type = CONSTANTREFERENCE.class),
            @XmlElement(name = "NUMERICAL-RULE-BASED-VALUE-SPECIFICATION", type = NUMERICALRULEBASEDVALUESPECIFICATION.class),
            @XmlElement(name = "NUMERICAL-VALUE-SPECIFICATION", type = NUMERICALVALUESPECIFICATION.class),
            @XmlElement(name = "RECORD-VALUE-SPECIFICATION", type = RECORDVALUESPECIFICATION.class),
            @XmlElement(name = "REFERENCE-VALUE-SPECIFICATION", type = REFERENCEVALUESPECIFICATION.class),
            @XmlElement(name = "TEXT-VALUE-SPECIFICATION", type = TEXTVALUESPECIFICATION.class)
        })
        protected Object applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION;

        /**
         * ??applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION?????
         * 
         * @return
         *     possible object is
         *     {@link APPLICATIONRULEBASEDVALUESPECIFICATION }
         *     {@link APPLICATIONVALUESPECIFICATION }
         *     {@link ARRAYVALUESPECIFICATION }
         *     {@link CONSTANTREFERENCE }
         *     {@link NUMERICALRULEBASEDVALUESPECIFICATION }
         *     {@link NUMERICALVALUESPECIFICATION }
         *     {@link RECORDVALUESPECIFICATION }
         *     {@link REFERENCEVALUESPECIFICATION }
         *     {@link TEXTVALUESPECIFICATION }
         *     
         */
        public Object getAPPLICATIONRULEBASEDVALUESPECIFICATIONOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION() {
            return applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION;
        }

        /**
         * ??applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION?????
         * 
         * @param value
         *     allowed object is
         *     {@link APPLICATIONRULEBASEDVALUESPECIFICATION }
         *     {@link APPLICATIONVALUESPECIFICATION }
         *     {@link ARRAYVALUESPECIFICATION }
         *     {@link CONSTANTREFERENCE }
         *     {@link NUMERICALRULEBASEDVALUESPECIFICATION }
         *     {@link NUMERICALVALUESPECIFICATION }
         *     {@link RECORDVALUESPECIFICATION }
         *     {@link REFERENCEVALUESPECIFICATION }
         *     {@link TEXTVALUESPECIFICATION }
         *     
         */
        public void setAPPLICATIONRULEBASEDVALUESPECIFICATIONOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION(Object value) {
            this.applicationrulebasedvaluespecificationOrAPPLICATIONVALUESPECIFICATIONOrARRAYVALUESPECIFICATION = value;
        }

    }

}
