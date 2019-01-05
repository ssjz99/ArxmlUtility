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
 * AssignFrameIdRange generates an assign frame PID range request.
 * 
 * <p>ASSIGN-FRAME-ID-RANGE complex type? Java ??
 * 
 * <p>????????????????????
 * 
 * <pre>
 * &lt;complexType name="ASSIGN-FRAME-ID-RANGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}AR-OBJECT"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}SCHEDULE-TABLE-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}LIN-CONFIGURATION-ENTRY"/>
 *         &lt;group ref="{http://autosar.org/schema/r4.0}ASSIGN-FRAME-ID-RANGE"/>
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
@XmlType(name = "ASSIGN-FRAME-ID-RANGE", propOrder = {
    "introduction",
    "delay",
    "positionintable",
    "assignedcontrollerref",
    "framepids",
    "startindex"
})
public class ASSIGNFRAMEIDRANGE {

    @XmlElement(name = "INTRODUCTION")
    protected DOCUMENTATIONBLOCK introduction;
    @XmlElement(name = "DELAY")
    protected TIMEVALUE delay;
    @XmlElement(name = "POSITION-IN-TABLE")
    protected INTEGER positionintable;
    @XmlElement(name = "ASSIGNED-CONTROLLER-REF")
    protected Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF assignedcontrollerref;
    @XmlElement(name = "FRAME-PIDS")
    protected ASSIGNFRAMEIDRANGE.FRAMEPIDS framepids;
    @XmlElement(name = "START-INDEX")
    protected INTEGER startindex;
    @XmlAttribute(name = "S")
    protected String s;
    @XmlAttribute(name = "T")
    protected String t;

    /**
     * ??introduction?????
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public DOCUMENTATIONBLOCK getINTRODUCTION() {
        return introduction;
    }

    /**
     * ??introduction?????
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONBLOCK }
     *     
     */
    public void setINTRODUCTION(DOCUMENTATIONBLOCK value) {
        this.introduction = value;
    }

    /**
     * ??delay?????
     * 
     * @return
     *     possible object is
     *     {@link TIMEVALUE }
     *     
     */
    public TIMEVALUE getDELAY() {
        return delay;
    }

    /**
     * ??delay?????
     * 
     * @param value
     *     allowed object is
     *     {@link TIMEVALUE }
     *     
     */
    public void setDELAY(TIMEVALUE value) {
        this.delay = value;
    }

    /**
     * ??positionintable?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getPOSITIONINTABLE() {
        return positionintable;
    }

    /**
     * ??positionintable?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setPOSITIONINTABLE(INTEGER value) {
        this.positionintable = value;
    }

    /**
     * ??assignedcontrollerref?????
     * 
     * @return
     *     possible object is
     *     {@link Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF }
     *     
     */
    public Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF getASSIGNEDCONTROLLERREF() {
        return assignedcontrollerref;
    }

    /**
     * ??assignedcontrollerref?????
     * 
     * @param value
     *     allowed object is
     *     {@link Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF }
     *     
     */
    public void setASSIGNEDCONTROLLERREF(Ar421.SAVECONFIGURATIONENTRY.ASSIGNEDCONTROLLERREF value) {
        this.assignedcontrollerref = value;
    }

    /**
     * ??framepids?????
     * 
     * @return
     *     possible object is
     *     {@link ASSIGNFRAMEIDRANGE.FRAMEPIDS }
     *     
     */
    public ASSIGNFRAMEIDRANGE.FRAMEPIDS getFRAMEPIDS() {
        return framepids;
    }

    /**
     * ??framepids?????
     * 
     * @param value
     *     allowed object is
     *     {@link ASSIGNFRAMEIDRANGE.FRAMEPIDS }
     *     
     */
    public void setFRAMEPIDS(ASSIGNFRAMEIDRANGE.FRAMEPIDS value) {
        this.framepids = value;
    }

    /**
     * ??startindex?????
     * 
     * @return
     *     possible object is
     *     {@link INTEGER }
     *     
     */
    public INTEGER getSTARTINDEX() {
        return startindex;
    }

    /**
     * ??startindex?????
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGER }
     *     
     */
    public void setSTARTINDEX(INTEGER value) {
        this.startindex = value;
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
     *       &lt;choice maxOccurs="4" minOccurs="0">
     *         &lt;element name="FRAME-PID" type="{http://autosar.org/schema/r4.0}FRAME-PID"/>
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
        "framepid"
    })
    public static class FRAMEPIDS {

        @XmlElement(name = "FRAME-PID")
        protected List<FRAMEPID> framepid;

        /**
         * Gets the value of the framepid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the framepid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFRAMEPID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FRAMEPID }
         * 
         * 
         */
        public List<FRAMEPID> getFRAMEPID() {
            if (framepid == null) {
                framepid = new ArrayList<FRAMEPID>();
            }
            return this.framepid;
        }

    }

}
