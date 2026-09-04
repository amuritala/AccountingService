
package com.bayeesoft.Acservice.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSACService}FCUBS_HEADERType"/>
 *         <element name="FCUBS_BODY">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Acc-Details-IO" type="{http://fcubs.ofss.com/service/FCUBSACService}AccTrns-Query-IO-Type" minOccurs="0"/>
 *                   <element name="Acc-Details-Full" type="{http://fcubs.ofss.com/service/FCUBSACService}AccTrns-Full-Type" minOccurs="0"/>
 *                   <element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSACService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSACService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "QUERYACCTRNS_IOFS_RES")
public class QUERYACCTRNSIOFSRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected QUERYACCTRNSIOFSRES.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link QUERYACCTRNSIOFSRES.FCUBSBODY }
     *     
     */
    public QUERYACCTRNSIOFSRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUERYACCTRNSIOFSRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(QUERYACCTRNSIOFSRES.FCUBSBODY value) {
        this.fcubsbody = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Acc-Details-IO" type="{http://fcubs.ofss.com/service/FCUBSACService}AccTrns-Query-IO-Type" minOccurs="0"/>
     *         <element name="Acc-Details-Full" type="{http://fcubs.ofss.com/service/FCUBSACService}AccTrns-Full-Type" minOccurs="0"/>
     *         <element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSACService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSACService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accDetailsIO",
        "accDetailsFull",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Acc-Details-IO")
        protected AccTrnsQueryIOType accDetailsIO;
        @XmlElement(name = "Acc-Details-Full")
        protected AccTrnsFullType accDetailsFull;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected List<ERRORType> fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected List<WARNINGType> fcubswarningresp;

        /**
         * Gets the value of the accDetailsIO property.
         * 
         * @return
         *     possible object is
         *     {@link AccTrnsQueryIOType }
         *     
         */
        public AccTrnsQueryIOType getAccDetailsIO() {
            return accDetailsIO;
        }

        /**
         * Sets the value of the accDetailsIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccTrnsQueryIOType }
         *     
         */
        public void setAccDetailsIO(AccTrnsQueryIOType value) {
            this.accDetailsIO = value;
        }

        /**
         * Gets the value of the accDetailsFull property.
         * 
         * @return
         *     possible object is
         *     {@link AccTrnsFullType }
         *     
         */
        public AccTrnsFullType getAccDetailsFull() {
            return accDetailsFull;
        }

        /**
         * Sets the value of the accDetailsFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccTrnsFullType }
         *     
         */
        public void setAccDetailsFull(AccTrnsFullType value) {
            this.accDetailsFull = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the fcubserrorresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSERRORRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ERRORType }
         * 
         * 
         * @return
         *     The value of the fcubserrorresp property.
         */
        public List<ERRORType> getFCUBSERRORRESP() {
            if (fcubserrorresp == null) {
                fcubserrorresp = new ArrayList<>();
            }
            return this.fcubserrorresp;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the fcubswarningresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSWARNINGRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WARNINGType }
         * 
         * 
         * @return
         *     The value of the fcubswarningresp property.
         */
        public List<WARNINGType> getFCUBSWARNINGRESP() {
            if (fcubswarningresp == null) {
                fcubswarningresp = new ArrayList<>();
            }
            return this.fcubswarningresp;
        }

    }

}
