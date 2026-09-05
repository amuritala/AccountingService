package com.techstack.corebanking;


import com.techstack.corebanking.dto.AuditTrailRequest;
import com.techstack.corebanking.dto.CustomerQueryRequest;
import com.techstack.corebanking.dto.TransactionRequest;
import com.techstack.corebanking.stub.QUERYACCTRNSIOFSRES;
import com.techstack.corebanking.stub.QUERYAUDITTRAILIOFSRES;
import com.techstack.corebanking.stub.QUERYCUSTOMERSTATIOFSRES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccServiceController {

    @Autowired
    private AccServiceClient accserviceclient ;


    @PostMapping("api/v1/QueryAccountTransaction")

    public QUERYACCTRNSIOFSRES QueryCustTransactiom(@RequestBody TransactionRequest transactionrequest) {
        QUERYACCTRNSIOFSRES responseMsg = accserviceclient.QueryAccTransaction(transactionrequest);
        System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }
    @PostMapping("api/v1/QueryCustomerStats")
    public QUERYCUSTOMERSTATIOFSRES QueryCustStat (@RequestBody CustomerQueryRequest customerqueryrequest) {
        QUERYCUSTOMERSTATIOFSRES responseMsg = accserviceclient.QueryCustomerStat(customerqueryrequest);
        System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }

    @PostMapping("api/v1/QueryAuditTrail")
    public QUERYAUDITTRAILIOFSRES AuditTrail (@RequestBody AuditTrailRequest audittrailrequest) throws Exception {
        QUERYAUDITTRAILIOFSRES responseMsg = accserviceclient.QueryAuditTrails(audittrailrequest);
        System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }

}
