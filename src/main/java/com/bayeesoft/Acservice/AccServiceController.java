package com.bayeesoft.Acservice;


import com.bayeesoft.Acservice.dto.AuditTrailRequest;
import com.bayeesoft.Acservice.dto.CustomerQueryRequest;
import com.bayeesoft.Acservice.dto.TransactionRequest;
import com.bayeesoft.Acservice.stub.QUERYACCTRNSIOFSRES;
import com.bayeesoft.Acservice.stub.QUERYAUDITTRAILIOFSRES;
import com.bayeesoft.Acservice.stub.QUERYCUSTOMERSTATIOFSRES;
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
