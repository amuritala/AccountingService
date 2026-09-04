package com.bayeesoft.Acservice;

import com.bayeesoft.Acservice.dto.AuditTrailRequest;
import com.bayeesoft.Acservice.dto.CustomerQueryRequest;
import com.bayeesoft.Acservice.dto.TransactionRequest;
import com.bayeesoft.Acservice.stub.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.datatype.XMLGregorianCalendar;


@Service
public class AccServiceClient {
    @Autowired
    private Jaxb2Marshaller marshaller ;
    private WebServiceTemplate template ;


        public QUERYACCTRNSIOFSRES QueryAccTransaction (TransactionRequest transactionrequest) {
            QUERYACCTRNSIOFSREQ fcubsMainHeader = new QUERYACCTRNSIOFSREQ();
            FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
            fcubsheader.setSOURCE("FCAT");
            fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
            fcubsheader.setMSGID("");
            fcubsheader.setCORRELID(null);
            fcubsheader.setUSERID("TAKEON02");
            fcubsheader.setPASSWORD("Oracle@2");
            fcubsheader.setBRANCH("100");
            fcubsheader.setMODULEID("");
            fcubsheader.setSERVICE("FCUBSACService");
            fcubsheader.setOPERATION("QueryAccTrns");
            fcubsMainHeader.setFCUBSHEADER(fcubsheader);

            AccTrnsQueryIOType Aacctrnsqueryiotype = new AccTrnsQueryIOType();
            Aacctrnsqueryiotype.setNUMOFTRN(transactionrequest.getNumoftrn());
            Aacctrnsqueryiotype.setACCNO(transactionrequest.getAccno());
            Aacctrnsqueryiotype.setACCBRN(transactionrequest.getAccbrn());

            QUERYACCTRNSIOFSREQ.FCUBSBODY flexbosy = new QUERYACCTRNSIOFSREQ.FCUBSBODY();
            flexbosy.setAccDetailsIO(Aacctrnsqueryiotype);
            fcubsMainHeader.setFCUBSBODY(flexbosy);

            template = new WebServiceTemplate(marshaller);
            QUERYACCTRNSIOFSRES response = (QUERYACCTRNSIOFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSACService/FCUBSACService",fcubsMainHeader);
            return response ;
        }


    public QUERYCUSTOMERSTATIOFSRES QueryCustomerStat (CustomerQueryRequest customerqueryrequest) {
        QUERYCUSTOMERSTATIOFSREQ fcubsMainHeader = new QUERYCUSTOMERSTATIOFSREQ();
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
        fcubsheader.setSOURCE("FCAT");
        fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheader.setMSGID("");
        fcubsheader.setCORRELID(null);
        fcubsheader.setUSERID("TAKEON02");
        fcubsheader.setPASSWORD("Oracle@2");
        fcubsheader.setBRANCH("100");
        fcubsheader.setMODULEID("");
        fcubsheader.setSERVICE("FCUBSACService");
        fcubsheader.setOPERATION("QueryCustomerStat");
        fcubsMainHeader.setFCUBSHEADER(fcubsheader);

        CustomerStatQueryIOType customerstatqueryiotype = new CustomerStatQueryIOType();
        customerstatqueryiotype.setCUSTOMERNO(customerqueryrequest.getCustomerno());
        customerstatqueryiotype.setCUSTOMERACCNO(customerqueryrequest.getCustomeraccno());
        customerstatqueryiotype.setBRANCHCODE(customerqueryrequest.getBranchcode());

        QUERYCUSTOMERSTATIOFSREQ.FCUBSBODY flexbosy = new QUERYCUSTOMERSTATIOFSREQ.FCUBSBODY();
        flexbosy.setCumulativeIO(customerstatqueryiotype);
        fcubsMainHeader.setFCUBSBODY(flexbosy);

        template = new WebServiceTemplate(marshaller);
        QUERYCUSTOMERSTATIOFSRES response = (QUERYCUSTOMERSTATIOFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSACService/FCUBSACService",fcubsMainHeader);
        return response ;
    }

    public QUERYAUDITTRAILIOFSRES QueryAuditTrails (AuditTrailRequest auditTrailrequest) throws Exception {

        QUERYAUDITTRAILIOFSREQ fcubsMainHeader = new QUERYAUDITTRAILIOFSREQ();
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
        fcubsheader.setSOURCE("FCAT");
        fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheader.setMSGID("");
        fcubsheader.setCORRELID(null);
        fcubsheader.setUSERID("TAKEON02");
        fcubsheader.setPASSWORD("Oracle@2");
        fcubsheader.setBRANCH("100");
        fcubsheader.setMODULEID("");
        fcubsheader.setSERVICE("FCUBSACService");
        fcubsheader.setOPERATION("QueryAudittrail");
        fcubsMainHeader.setFCUBSHEADER(fcubsheader);

        XMLGregorianCalendar fromdt;
        XMLGregorianCalendar todt;
        fromdt = FlexcubeDateUtil.convertToXmlCalendar(auditTrailrequest.getTrnfromdt());
        todt = FlexcubeDateUtil.convertToXmlCalendar(auditTrailrequest.getTrntodt());
        ACDAUDTRQueryIOType  acdaudtrqueryiotype  = new ACDAUDTRQueryIOType();
        acdaudtrqueryiotype.setBRANCHCODE(auditTrailrequest.getBranchcode());
        acdaudtrqueryiotype.setCUSTACNO(auditTrailrequest.getCustacno());
        acdaudtrqueryiotype.setTRNFROMDT(fromdt);
        acdaudtrqueryiotype.setTRNTODT(todt);



        QUERYAUDITTRAILIOFSREQ.FCUBSBODY flexbosy = new QUERYAUDITTRAILIOFSREQ.FCUBSBODY();
        flexbosy.setAcvwAcdaudtrIO(acdaudtrqueryiotype);
        fcubsMainHeader.setFCUBSBODY(flexbosy);

        template = new WebServiceTemplate(marshaller);
        QUERYAUDITTRAILIOFSRES response = (QUERYAUDITTRAILIOFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSACService/FCUBSACService",fcubsMainHeader);
        return response ;

    }

}
