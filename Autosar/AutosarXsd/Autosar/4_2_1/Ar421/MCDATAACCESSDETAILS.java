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
 * This meta-class allows to attach detailed information about the usage of a data buffer by the RTE to a corresponding McDataInstance.
 * 
 * Use Case:  Direct memory access to RTE internal buffers for rapid prototyping. In case of implicit communication, the various task local buffers need to be identified in relation to RTE events and variable access points.
 * 
 * Note that the SwComponentPrototype, the RunnableEntity and the VariableDataPrototype are implicitly given be the referred instances of RTEEvent and VariableAccess.
 * 
 * <p>MC-DATA-ACCESS-DETAILS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="MC-DATA-ACCESS-DETAILS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}MC-DATA-ACCESS-DETAILS"/>
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
@XmlType(name = "MC-DATA-ACCESS-DETAILS", propOrder = {
    "rteeventirefs",
    "variableaccessirefs"
})
public class MCDATAACCESSDETAILS {

    @XmlElement(name = "RTE-EVENT-IREFS")
    protected MCDATAACCESSDETAILS.RTEEVENTIREFS rteeventirefs;
    @XmlElement(name = "VARIABLE-ACCESS-IREFS")
    protected MCDATAACCESSDETAILS.VARIABLEACCESSIREFS variableaccessirefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??rteeventirefs?????
     * 
     * @return
     *     possible object is
     *     {@link MCDATAACCESSDETAILS.RTEEVENTIREFS }
     *     
     */
    public MCDATAACCESSDETAILS.RTEEVENTIREFS getRTEEVENTIREFS() {
        return rteeventirefs;
    }

    /**
     * ??rteeventirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCDATAACCESSDETAILS.RTEEVENTIREFS }
     *     
     */
    public void setRTEEVENTIREFS(MCDATAACCESSDETAILS.RTEEVENTIREFS value) {
        this.rteeventirefs = value;
    }

    /**
     * ??variableaccessirefs?????
     * 
     * @return
     *     possible object is
     *     {@link MCDATAACCESSDETAILS.VARIABLEACCESSIREFS }
     *     
     */
    public MCDATAACCESSDETAILS.VARIABLEACCESSIREFS getVARIABLEACCESSIREFS() {
        return variableaccessirefs;
    }

    /**
     * ??variableaccessirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link MCDATAACCESSDETAILS.VARIABLEACCESSIREFS }
     *     
     */
    public void setVARIABLEACCESSIREFS(MCDATAACCESSDETAILS.VARIABLEACCESSIREFS value) {
        this.variableaccessirefs = value;
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
     *         &lt;element name="RTE-EVENT-IREF" type="{http://autosar.org/schema/r4.0}RTE-EVENT-IN-ECU-INSTANCE-REF"/>
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
        "rteeventiref"
    })
    public static class RTEEVENTIREFS {

        @XmlElement(name = "RTE-EVENT-IREF")
        protected List<RTEEVENTINECUINSTANCEREF> rteeventiref;

        /**
         * Gets the value of the rteeventiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rteeventiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRTEEVENTIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RTEEVENTINECUINSTANCEREF }
         * 
         * 
         */
        public List<RTEEVENTINECUINSTANCEREF> getRTEEVENTIREF() {
            if (rteeventiref == null) {
                rteeventiref = new ArrayList<RTEEVENTINECUINSTANCEREF>();
            }
            return this.rteeventiref;
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
     *         &lt;element name="VARIABLE-ACCESS-IREF" type="{http://autosar.org/schema/r4.0}VARIABLE-ACCESS-IN-ECU-INSTANCE-REF"/>
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
        "variableaccessiref"
    })
    public static class VARIABLEACCESSIREFS {

        @XmlElement(name = "VARIABLE-ACCESS-IREF")
        protected List<VARIABLEACCESSINECUINSTANCEREF> variableaccessiref;

        /**
         * Gets the value of the variableaccessiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableaccessiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVARIABLEACCESSIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VARIABLEACCESSINECUINSTANCEREF }
         * 
         * 
         */
        public List<VARIABLEACCESSINECUINSTANCEREF> getVARIABLEACCESSIREF() {
            if (variableaccessiref == null) {
                variableaccessiref = new ArrayList<VARIABLEACCESSINECUINSTANCEREF>();
            }
            return this.variableaccessiref;
        }

    }

}
