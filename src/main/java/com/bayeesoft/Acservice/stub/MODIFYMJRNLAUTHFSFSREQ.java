
package com.bayeesoft.Acservice.stub;

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
 *                   <element name="Detb-Jrnl-Txn-Master--Auth-Full" type="{http://fcubs.ofss.com/service/FCUBSACService}MultiJrnlAuth-Full-Type"/>
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
@XmlRootElement(name = "MODIFYMJRNLAUTH_FSFS_REQ")
public class MODIFYMJRNLAUTHFSFSREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected MODIFYMJRNLAUTHFSFSREQ.FCUBSBODY fcubsbody;

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
     *     {@link MODIFYMJRNLAUTHFSFSREQ.FCUBSBODY }
     *     
     */
    public MODIFYMJRNLAUTHFSFSREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link MODIFYMJRNLAUTHFSFSREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(MODIFYMJRNLAUTHFSFSREQ.FCUBSBODY value) {
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
     *         <element name="Detb-Jrnl-Txn-Master--Auth-Full" type="{http://fcubs.ofss.com/service/FCUBSACService}MultiJrnlAuth-Full-Type"/>
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
        "detbJrnlTxnMasterAuthFull"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Detb-Jrnl-Txn-Master--Auth-Full", required = true)
        protected MultiJrnlAuthFullType detbJrnlTxnMasterAuthFull;

        /**
         * Gets the value of the detbJrnlTxnMasterAuthFull property.
         * 
         * @return
         *     possible object is
         *     {@link MultiJrnlAuthFullType }
         *     
         */
        public MultiJrnlAuthFullType getDetbJrnlTxnMasterAuthFull() {
            return detbJrnlTxnMasterAuthFull;
        }

        /**
         * Sets the value of the detbJrnlTxnMasterAuthFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiJrnlAuthFullType }
         *     
         */
        public void setDetbJrnlTxnMasterAuthFull(MultiJrnlAuthFullType value) {
            this.detbJrnlTxnMasterAuthFull = value;
        }

    }

}
