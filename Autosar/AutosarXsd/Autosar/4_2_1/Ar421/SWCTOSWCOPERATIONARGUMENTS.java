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
 * The SwcToSwcOperationArguments describes the information (client server operation arguments, plus the operation identification, if required) that are exchanged between two SW Components from exactly one client to one server, or from one server back to one client. The direction attribute defines which direction is described. If direction == IN, all arguments sent from the client to the server are described by the SwcToSwcOperationArguments, in direction == OUT, it's the arguments sent back from server to client.
 * 
 * <p>SWC-TO-SWC-OPERATION-ARGUMENTS complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="SWC-TO-SWC-OPERATION-ARGUMENTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SWC-TO-SWC-OPERATION-ARGUMENTS"/>
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
@XmlType(name = "SWC-TO-SWC-OPERATION-ARGUMENTS", propOrder = {
    "direction",
    "operationirefs"
})
public class SWCTOSWCOPERATIONARGUMENTS {

    @XmlElement(name = "DIRECTION")
    protected SWCTOSWCOPERATIONARGUMENTSDIRECTIONENUM direction;
    @XmlElement(name = "OPERATION-IREFS")
    protected SWCTOSWCOPERATIONARGUMENTS.OPERATIONIREFS operationirefs;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??direction?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOSWCOPERATIONARGUMENTSDIRECTIONENUM }
     *     
     */
    public SWCTOSWCOPERATIONARGUMENTSDIRECTIONENUM getDIRECTION() {
        return direction;
    }

    /**
     * ??direction?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOSWCOPERATIONARGUMENTSDIRECTIONENUM }
     *     
     */
    public void setDIRECTION(SWCTOSWCOPERATIONARGUMENTSDIRECTIONENUM value) {
        this.direction = value;
    }

    /**
     * ??operationirefs?????
     * 
     * @return
     *     possible object is
     *     {@link SWCTOSWCOPERATIONARGUMENTS.OPERATIONIREFS }
     *     
     */
    public SWCTOSWCOPERATIONARGUMENTS.OPERATIONIREFS getOPERATIONIREFS() {
        return operationirefs;
    }

    /**
     * ??operationirefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link SWCTOSWCOPERATIONARGUMENTS.OPERATIONIREFS }
     *     
     */
    public void setOPERATIONIREFS(SWCTOSWCOPERATIONARGUMENTS.OPERATIONIREFS value) {
        this.operationirefs = value;
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
     *         &lt;element name="OPERATION-IREF" type="{http://autosar.org/schema/r4.0}OPERATION-IN-SYSTEM-INSTANCE-REF"/>
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
        "operationiref"
    })
    public static class OPERATIONIREFS {

        @XmlElement(name = "OPERATION-IREF")
        protected List<OPERATIONINSYSTEMINSTANCEREF> operationiref;

        /**
         * Gets the value of the operationiref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationiref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOPERATIONIREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OPERATIONINSYSTEMINSTANCEREF }
         * 
         * 
         */
        public List<OPERATIONINSYSTEMINSTANCEREF> getOPERATIONIREF() {
            if (operationiref == null) {
                operationiref = new ArrayList<OPERATIONINSYSTEMINSTANCEREF>();
            }
            return this.operationiref;
        }

    }

}
