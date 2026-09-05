package com.techstack.corebanking.util;

import com.techstack.corebanking.stub.FCUBSHEADERType;
import com.techstack.corebanking.stub.UBSCOMPType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RequestUtil {

    private final String username;
    private final String password;
    private final String service;
    private final String source;
    private final String ubscomp;
    private final String msgid;
    private final String correlid;
    private final String moduleid;
    private final String branch;
    private final String operation;

    public RequestUtil(
            @Value("${fcubs.username}") String username,
            @Value("${fcubs.password}") String password,
            @Value("${fcubs.service}") String service,
            @Value("${fcubs.source}") String source,
            @Value("${fcubs.ubscomp}") String ubscomp,
            @Value("${fcubs.msgid}") String msgid,
            @Value("${fcubs.correlid}") String correlid,
            @Value("${fcubs.moduleid}") String moduleid,
            @Value("${fcubs.branch}") String branch,
            @Value("${fcubs.operation}") String operation) {

        this.username = username;
        this.password = password;
        this.service = service;
        this.source = source;
        this.ubscomp = ubscomp;
        this.msgid = msgid;
        this.correlid = correlid;
        this.moduleid = moduleid;
        this.branch = branch;
        this.operation = operation;
    }

    public FCUBSHEADERType createHeader() {

        FCUBSHEADERType header = new FCUBSHEADERType();

        header.setSOURCE(source);

        header.setUBSCOMP(
                "FCUBS".equals(ubscomp)
                        ? UBSCOMPType.FCUBS
                        : UBSCOMPType.valueOf(ubscomp)
        );

        header.setMSGID(msgid);
        header.setCORRELID(correlid);
        header.setUSERID(username);
        header.setPASSWORD(password);
        header.setMODULEID(moduleid);
        header.setSERVICE(service);
        header.setBRANCH(branch);
        header.setOPERATION(operation);

        return header;
    }
}