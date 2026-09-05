package com.techstack.corebanking;

import com.techstack.corebanking.dto.AuditTrailRequest;
import com.techstack.corebanking.dto.CustomerQueryRequest;
import com.techstack.corebanking.dto.TransactionRequest;
import com.techstack.corebanking.stub.*;
import com.techstack.corebanking.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.datatype.XMLGregorianCalendar;


@Service
public class AccServiceClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    @Autowired
    private RequestUtil requestUtil;

    @Value("${fcubs.account-service-url}")
    private static String ACCOUNT_SERVICE_URL;

    private WebServiceTemplate template;


        public QUERYACCTRNSIOFSRES QueryAccTransaction (TransactionRequest transactionrequest) {
            QUERYACCTRNSIOFSREQ fcubsMainHeader = new QUERYACCTRNSIOFSREQ();

            FCUBSHEADERType fcubsHeader = requestUtil.createHeader();
            fcubsHeader.setOPERATION("QueryAccTrns");
            fcubsMainHeader.setFCUBSHEADER(fcubsHeader);



            AccTrnsQueryIOType Aacctrnsqueryiotype = new AccTrnsQueryIOType();
            Aacctrnsqueryiotype.setNUMOFTRN(transactionrequest.getNumoftrn());
            Aacctrnsqueryiotype.setACCNO(transactionrequest.getAccno());
            Aacctrnsqueryiotype.setACCBRN(transactionrequest.getAccbrn());

            QUERYACCTRNSIOFSREQ.FCUBSBODY flexbosy = new QUERYACCTRNSIOFSREQ.FCUBSBODY();
            flexbosy.setAccDetailsIO(Aacctrnsqueryiotype);
            fcubsMainHeader.setFCUBSBODY(flexbosy);

            template = new WebServiceTemplate(marshaller);
            QUERYACCTRNSIOFSRES response = (QUERYACCTRNSIOFSRES)  template.marshalSendAndReceive(ACCOUNT_SERVICE_URL,fcubsMainHeader);
            return response ;
        }


    public QUERYCUSTOMERSTATIOFSRES QueryCustomerStat (CustomerQueryRequest customerqueryrequest) {
        QUERYCUSTOMERSTATIOFSREQ fcubsMainHeader = new QUERYCUSTOMERSTATIOFSREQ();

        FCUBSHEADERType fcubsHeader = requestUtil.createHeader();
        fcubsHeader.setOPERATION("QueryCustomerStat");
        fcubsMainHeader.setFCUBSHEADER(fcubsHeader);

        CustomerStatQueryIOType customerstatqueryiotype = new CustomerStatQueryIOType();
        customerstatqueryiotype.setCUSTOMERNO(customerqueryrequest.getCustomerno());
        customerstatqueryiotype.setCUSTOMERACCNO(customerqueryrequest.getCustomeraccno());
        customerstatqueryiotype.setBRANCHCODE(customerqueryrequest.getBranchcode());

        QUERYCUSTOMERSTATIOFSREQ.FCUBSBODY flexbosy = new QUERYCUSTOMERSTATIOFSREQ.FCUBSBODY();
        flexbosy.setCumulativeIO(customerstatqueryiotype);
        fcubsMainHeader.setFCUBSBODY(flexbosy);

        template = new WebServiceTemplate(marshaller);
        QUERYCUSTOMERSTATIOFSRES response = (QUERYCUSTOMERSTATIOFSRES)  template.marshalSendAndReceive(ACCOUNT_SERVICE_URL,fcubsMainHeader);
        return response ;
    }

    public QUERYAUDITTRAILIOFSRES QueryAuditTrails (AuditTrailRequest auditTrailrequest) throws Exception {

        QUERYAUDITTRAILIOFSREQ fcubsMainHeader = new QUERYAUDITTRAILIOFSREQ();

        FCUBSHEADERType fcubsHeader = requestUtil.createHeader();
        fcubsHeader.setOPERATION("QueryAudittrail");
        fcubsMainHeader.setFCUBSHEADER(fcubsHeader);

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
        QUERYAUDITTRAILIOFSRES response = (QUERYAUDITTRAILIOFSRES)  template.marshalSendAndReceive(ACCOUNT_SERVICE_URL,fcubsMainHeader);
        return response ;

    }

}
