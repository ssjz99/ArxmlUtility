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
 * This class represents the ability to navigate into a data element inside of an VariableDataPrototype which is typed  by an ImplementationDatatype.
 * 
 * Note that it shall not be used if the target is the VariableDataPrototype itself (e.g. if its a primitive).
 * 
 * Note that this class follows the pattern of an InstanceRef but is not implemented based on the abstract classes because the ImplementationDataType isn't either, especially because ImplementationDataTypeElement isn't derived from AtpPrototype.
 * 
 * <p>AR-VARIABLE-IN-IMPLEMENTATION-DATA-INSTANCE-REF complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="AR-VARIABLE-IN-IMPLEMENTATION-DATA-INSTANCE-REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-VARIABLE-IN-IMPLEMENTATION-DATA-INSTANCE-REF"/>
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
@XmlType(name = "AR-VARIABLE-IN-IMPLEMENTATION-DATA-INSTANCE-REF", propOrder = {
    "portprototyperef",
    "rootvariabledataprototyperef",
    "contextdataprototyperefs",
    "targetdataprototyperef"
})
public class ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF {

    @XmlElement(name = "PORT-PROTOTYPE-REF")
    protected ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.PORTPROTOTYPEREF portprototyperef;
    @XmlElement(name = "ROOT-VARIABLE-DATA-PROTOTYPE-REF")
    protected ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF rootvariabledataprototyperef;
    @XmlElement(name = "CONTEXT-DATA-PROTOTYPE-REFS")
    protected ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS contextdataprototyperefs;
    @XmlElement(name = "TARGET-DATA-PROTOTYPE-REF")
    protected ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.TARGETDATAPROTOTYPEREF targetdataprototyperef;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??portprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.PORTPROTOTYPEREF }
     *     
     */
    public ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.PORTPROTOTYPEREF getPORTPROTOTYPEREF() {
        return portprototyperef;
    }

    /**
     * ??portprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.PORTPROTOTYPEREF }
     *     
     */
    public void setPORTPROTOTYPEREF(ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.PORTPROTOTYPEREF value) {
        this.portprototyperef = value;
    }

    /**
     * ??rootvariabledataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF }
     *     
     */
    public ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF getROOTVARIABLEDATAPROTOTYPEREF() {
        return rootvariabledataprototyperef;
    }

    /**
     * ??rootvariabledataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF }
     *     
     */
    public void setROOTVARIABLEDATAPROTOTYPEREF(ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.ROOTVARIABLEDATAPROTOTYPEREF value) {
        this.rootvariabledataprototyperef = value;
    }

    /**
     * ??contextdataprototyperefs?????
     * 
     * @return
     *     possible object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS }
     *     
     */
    public ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS getCONTEXTDATAPROTOTYPEREFS() {
        return contextdataprototyperefs;
    }

    /**
     * ??contextdataprototyperefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS }
     *     
     */
    public void setCONTEXTDATAPROTOTYPEREFS(ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS value) {
        this.contextdataprototyperefs = value;
    }

    /**
     * ??targetdataprototyperef?????
     * 
     * @return
     *     possible object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.TARGETDATAPROTOTYPEREF }
     *     
     */
    public ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.TARGETDATAPROTOTYPEREF getTARGETDATAPROTOTYPEREF() {
        return targetdataprototyperef;
    }

    /**
     * ??targetdataprototyperef?????
     * 
     * @param value
     *     allowed object is
     *     {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.TARGETDATAPROTOTYPEREF }
     *     
     */
    public void setTARGETDATAPROTOTYPEREF(ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.TARGETDATAPROTOTYPEREF value) {
        this.targetdataprototyperef = value;
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
     *         &lt;element name="CONTEXT-DATA-PROTOTYPE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT--SUBTYPES-ENUM" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "contextdataprototyperef"
    })
    public static class CONTEXTDATAPROTOTYPEREFS {

        @XmlElement(name = "CONTEXT-DATA-PROTOTYPE-REF")
        protected List<ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS.CONTEXTDATAPROTOTYPEREF> contextdataprototyperef;

        /**
         * Gets the value of the contextdataprototyperef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contextdataprototyperef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTEXTDATAPROTOTYPEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS.CONTEXTDATAPROTOTYPEREF }
         * 
         * 
         */
        public List<ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS.CONTEXTDATAPROTOTYPEREF> getCONTEXTDATAPROTOTYPEREF() {
            if (contextdataprototyperef == null) {
                contextdataprototyperef = new ArrayList<ARVARIABLEINIMPLEMENTATIONDATAINSTANCEREF.CONTEXTDATAPROTOTYPEREFS.CONTEXTDATAPROTOTYPEREF>();
            }
            return this.contextdataprototyperef;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CONTEXTDATAPROTOTYPEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
             *     
             */
            public IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
             *     
             */
            public void setDEST(IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM value) {
                this.dest = value;
            }

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
    public static class PORTPROTOTYPEREF
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


    /**
     * <p>anonymous complex type? Java ??
     * 
     * <p>????????????????????
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ROOTVARIABLEDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected VARIABLEDATAPROTOTYPESUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public VARIABLEDATAPROTOTYPESUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link VARIABLEDATAPROTOTYPESUBTYPESENUM }
         *     
         */
        public void setDEST(VARIABLEDATAPROTOTYPESUBTYPESENUM value) {
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
     *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}IMPLEMENTATION-DATA-TYPE-ELEMENT--SUBTYPES-ENUM" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TARGETDATAPROTOTYPEREF
        extends REF
    {

        @XmlAttribute(name = "DEST", required = true)
        protected IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM dest;

        /**
         * ??dest?????
         * 
         * @return
         *     possible object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM getDEST() {
            return dest;
        }

        /**
         * ??dest?????
         * 
         * @param value
         *     allowed object is
         *     {@link IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM }
         *     
         */
        public void setDEST(IMPLEMENTATIONDATATYPEELEMENTSUBTYPESENUM value) {
            this.dest = value;
        }

    }

}
