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
 * Client-specific communication attributes (RPortPrototype typed by ClientServerInterface).
 * 
 * <p>CLIENT-COM-SPEC complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-COM-SPEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-PORT-COM-SPEC"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-COM-SPEC"/>
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
@XmlType(name = "CLIENT-COM-SPEC", propOrder = {
    "operationref",
    "transformationcomspecpropss"
})
public class CLIENTCOMSPEC {

    @XmlElement(name = "OPERATION-REF")
    protected CLIENTCOMSPEC.OPERATIONREF operationref;
    @XmlElement(name = "TRANSFORMATION-COM-SPEC-PROPSS")
    protected CLIENTCOMSPEC.TRANSFORMATIONCOMSPECPROPSS transformationcomspecpropss;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??operationref?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTCOMSPEC.OPERATIONREF }
     *     
     */
    public CLIENTCOMSPEC.OPERATIONREF getOPERATIONREF() {
        return operationref;
    }

    /**
     * ??operationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTCOMSPEC.OPERATIONREF }
     *     
     */
    public void setOPERATIONREF(CLIENTCOMSPEC.OPERATIONREF value) {
        this.operationref = value;
    }

    /**
     * ??transformationcomspecpropss?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTCOMSPEC.TRANSFORMATIONCOMSPECPROPSS }
     *     
     */
    public CLIENTCOMSPEC.TRANSFORMATIONCOMSPECPROPSS getTRANSFORMATIONCOMSPECPROPSS() {
        return transformationcomspecpropss;
    }

    /**
     * ??transformationcomspecpropss?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTCOMSPEC.TRANSFORMATIONCOMSPECPROPSS }
     *     
     */
    public void setTRANSFORMATIONCOMSPECPROPSS(CLIENTCOMSPEC.TRANSFORMATIONCOMSPECPROPSS value) {
        this.transformationcomspecpropss = value;
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
    public static class OPERATIONREF
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="END-TO-END-TRANSFORMATION-COM-SPEC-PROPS" type="{http://autosar.org/schema/r4.0}END-TO-END-TRANSFORMATION-COM-SPEC-PROPS"/>
     *         &lt;element name="USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS" type="{http://autosar.org/schema/r4.0}USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS"/>
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
        "endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS"
    })
    public static class TRANSFORMATIONCOMSPECPROPSS {

        @XmlElements({
            @XmlElement(name = "END-TO-END-TRANSFORMATION-COM-SPEC-PROPS", type = ENDTOENDTRANSFORMATIONCOMSPECPROPS.class),
            @XmlElement(name = "USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS", type = USERDEFINEDTRANSFORMATIONCOMSPECPROPS.class)
        })
        protected List<Object> endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS;

        /**
         * Gets the value of the endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getENDTOENDTRANSFORMATIONCOMSPECPROPSOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ENDTOENDTRANSFORMATIONCOMSPECPROPS }
         * {@link USERDEFINEDTRANSFORMATIONCOMSPECPROPS }
         * 
         * 
         */
        public List<Object> getENDTOENDTRANSFORMATIONCOMSPECPROPSOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS() {
            if (endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS == null) {
                endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS = new ArrayList<Object>();
            }
            return this.endtoendtransformationcomspecpropsOrUSERDEFINEDTRANSFORMATIONCOMSPECPROPS;
        }

    }

}
