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
 * An includedDataTypeSet declares that a set of AutosarDataType is used by a basic software module or a software component for its implementation and the AutosarDataType becomes part of the contract. 
 * 
 * This information is required if the AutosarDataType is not used for any DataPrototype owned by this software component or if the enumeration literals, lowerLimit and upperLimit constants shall be generated with a literalPrefix.
 * 
 * The optional literalPrefix is used to add a common prefix on enumeration literals, lowerLimit and upperLimit constants created by the RTE.
 * 
 * <p>INCLUDED-DATA-TYPE-SET complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="INCLUDED-DATA-TYPE-SET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}INCLUDED-DATA-TYPE-SET"/>
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
@XmlType(name = "INCLUDED-DATA-TYPE-SET", propOrder = {
    "datatyperefs",
    "literalprefix"
})
public class INCLUDEDDATATYPESET {

    @XmlElement(name = "DATA-TYPE-REFS")
    protected INCLUDEDDATATYPESET.DATATYPEREFS datatyperefs;
    @XmlElement(name = "LITERAL-PREFIX")
    protected IDENTIFIER literalprefix;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??datatyperefs?????
     * 
     * @return
     *     possible object is
     *     {@link INCLUDEDDATATYPESET.DATATYPEREFS }
     *     
     */
    public INCLUDEDDATATYPESET.DATATYPEREFS getDATATYPEREFS() {
        return datatyperefs;
    }

    /**
     * ??datatyperefs?????
     * 
     * @param value
     *     allowed object is
     *     {@link INCLUDEDDATATYPESET.DATATYPEREFS }
     *     
     */
    public void setDATATYPEREFS(INCLUDEDDATATYPESET.DATATYPEREFS value) {
        this.datatyperefs = value;
    }

    /**
     * ??literalprefix?????
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFIER }
     *     
     */
    public IDENTIFIER getLITERALPREFIX() {
        return literalprefix;
    }

    /**
     * ??literalprefix?????
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFIER }
     *     
     */
    public void setLITERALPREFIX(IDENTIFIER value) {
        this.literalprefix = value;
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
     *         &lt;element name="DATA-TYPE-REF">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://autosar.org/schema/r4.0>REF">
     *                 &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-TYPE--SUBTYPES-ENUM" />
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
        "datatyperef"
    })
    public static class DATATYPEREFS {

        @XmlElement(name = "DATA-TYPE-REF")
        protected List<INCLUDEDDATATYPESET.DATATYPEREFS.DATATYPEREF> datatyperef;

        /**
         * Gets the value of the datatyperef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datatyperef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATATYPEREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INCLUDEDDATATYPESET.DATATYPEREFS.DATATYPEREF }
         * 
         * 
         */
        public List<INCLUDEDDATATYPESET.DATATYPEREFS.DATATYPEREF> getDATATYPEREF() {
            if (datatyperef == null) {
                datatyperef = new ArrayList<INCLUDEDDATATYPESET.DATATYPEREFS.DATATYPEREF>();
            }
            return this.datatyperef;
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
         *       &lt;attribute name="DEST" use="required" type="{http://autosar.org/schema/r4.0}AUTOSAR-DATA-TYPE--SUBTYPES-ENUM" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DATATYPEREF
            extends REF
        {

            @XmlAttribute(name = "DEST", required = true)
            protected AUTOSARDATATYPESUBTYPESENUM dest;

            /**
             * ??dest?????
             * 
             * @return
             *     possible object is
             *     {@link AUTOSARDATATYPESUBTYPESENUM }
             *     
             */
            public AUTOSARDATATYPESUBTYPESENUM getDEST() {
                return dest;
            }

            /**
             * ??dest?????
             * 
             * @param value
             *     allowed object is
             *     {@link AUTOSARDATATYPESUBTYPESENUM }
             *     
             */
            public void setDEST(AUTOSARDATATYPESUBTYPESENUM value) {
                this.dest = value;
            }

        }

    }

}
