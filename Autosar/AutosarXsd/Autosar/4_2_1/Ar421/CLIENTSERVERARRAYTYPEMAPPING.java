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
 * If the ApplicationCompositeDataType is an Array, the "ArrayTypeMapping" will be used.
 * 
 * <p>CLIENT-SERVER-ARRAY-TYPE-MAPPING complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="CLIENT-SERVER-ARRAY-TYPE-MAPPING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-COMPOSITE-TYPE-MAPPING"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}CLIENT-SERVER-ARRAY-TYPE-MAPPING"/>
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
@XmlType(name = "CLIENT-SERVER-ARRAY-TYPE-MAPPING", propOrder = {
    "argumentref",
    "arrayelementmappings"
})
public class CLIENTSERVERARRAYTYPEMAPPING {

    @XmlElement(name = "ARGUMENT-REF")
    protected Ar421.CLIENTSERVERRECORDTYPEMAPPING.ARGUMENTREF argumentref;
    @XmlElement(name = "ARRAY-ELEMENT-MAPPINGS")
    protected CLIENTSERVERARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS arrayelementmappings;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??argumentref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.CLIENTSERVERRECORDTYPEMAPPING.ARGUMENTREF }
     *     
     */
    public Ar421.CLIENTSERVERRECORDTYPEMAPPING.ARGUMENTREF getARGUMENTREF() {
        return argumentref;
    }

    /**
     * ??argumentref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.CLIENTSERVERRECORDTYPEMAPPING.ARGUMENTREF }
     *     
     */
    public void setARGUMENTREF(Ar421.CLIENTSERVERRECORDTYPEMAPPING.ARGUMENTREF value) {
        this.argumentref = value;
    }

    /**
     * ??arrayelementmappings?????
     * 
     * @return
     *     possible object is
     *     {@link CLIENTSERVERARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS }
     *     
     */
    public CLIENTSERVERARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS getARRAYELEMENTMAPPINGS() {
        return arrayelementmappings;
    }

    /**
     * ??arrayelementmappings?????
     * 
     * @param value
     *     allowed object is
     *     {@link CLIENTSERVERARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS }
     *     
     */
    public void setARRAYELEMENTMAPPINGS(CLIENTSERVERARRAYTYPEMAPPING.ARRAYELEMENTMAPPINGS value) {
        this.arrayelementmappings = value;
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
     *         &lt;element name="CLIENT-SERVER-ARRAY-ELEMENT-MAPPING" type="{http://autosar.org/schema/r4.0}CLIENT-SERVER-ARRAY-ELEMENT-MAPPING"/>
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
        "clientserverarrayelementmapping"
    })
    public static class ARRAYELEMENTMAPPINGS {

        @XmlElement(name = "CLIENT-SERVER-ARRAY-ELEMENT-MAPPING")
        protected List<CLIENTSERVERARRAYELEMENTMAPPING> clientserverarrayelementmapping;

        /**
         * Gets the value of the clientserverarrayelementmapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientserverarrayelementmapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLIENTSERVERARRAYELEMENTMAPPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CLIENTSERVERARRAYELEMENTMAPPING }
         * 
         * 
         */
        public List<CLIENTSERVERARRAYELEMENTMAPPING> getCLIENTSERVERARRAYELEMENTMAPPING() {
            if (clientserverarrayelementmapping == null) {
                clientserverarrayelementmapping = new ArrayList<CLIENTSERVERARRAYELEMENTMAPPING>();
            }
            return this.clientserverarrayelementmapping;
        }

    }

}
