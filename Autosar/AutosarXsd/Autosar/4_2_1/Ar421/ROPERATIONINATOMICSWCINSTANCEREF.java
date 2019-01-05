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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>R-OPERATION-IN-ATOMIC-SWC-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="R-OPERATION-IN-ATOMIC-SWC-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ATP-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}OPERATION-IN-ATOMIC-SWC-INSTANCE-REF"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}R-OPERATION-IN-ATOMIC-SWC-INSTANCE-REF"/>
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
@XmlType(name = "R-OPERATION-IN-ATOMIC-SWC-INSTANCE-REF", propOrder = {
    "contextrportref",
    "targetrequiredoperationref"
})
public class ROPERATIONINATOMICSWCINSTANCEREF {

    @XmlElement(name = "CONTEXT-R-PORT-REF")
    protected ROPERATIONINATOMICSWCINSTANCEREF.CONTEXTRPORTREF contextrportref;
    @XmlElement(name = "TARGET-REQUIRED-OPERATION-REF")
    protected ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF targetrequiredoperationref;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??contextrportref?????
     * 
     * @return
     *     possible object is
     *     {@link ROPERATIONINATOMICSWCINSTANCEREF.CONTEXTRPORTREF }
     *     
     */
    public ROPERATIONINATOMICSWCINSTANCEREF.CONTEXTRPORTREF getCONTEXTRPORTREF() {
        return contextrportref;
    }

    /**
     * ??contextrportref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROPERATIONINATOMICSWCINSTANCEREF.CONTEXTRPORTREF }
     *     
     */
    public void setCONTEXTRPORTREF(ROPERATIONINATOMICSWCINSTANCEREF.CONTEXTRPORTREF value) {
        this.contextrportref = value;
    }

    /**
     * ??targetrequiredoperationref?????
     * 
     * @return
     *     possible object is
     *     {@link ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF }
     *     
     */
    public ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF getTARGETREQUIREDOPERATIONREF() {
        return targetrequiredoperationref;
    }

    /**
     * ??targetrequiredoperationref?????
     * 
     * @param value
     *     allowed object is
     *     {@link ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF }
     *     
     */
    public void setTARGETREQUIREDOPERATIONREF(ROPERATIONINATOMICSWCINSTANCEREF.TARGETREQUIREDOPERATIONREF value) {
        this.targetrequiredoperationref = value;
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}ABSTRACT-REQUIRED-PORT-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CONTEXTRPORTREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(ABSTRACTREQUIREDPORTPROTOTYPESUBTYPESENUM value) {
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
    public static class TARGETREQUIREDOPERATIONREF
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
