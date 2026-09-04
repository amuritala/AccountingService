package com.bayeesoft.Acservice.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditTrailRequest {

    private String branchcode;
    private String custacno;

    private Date trnfromdt;

    private Date trntodt;

    private String action;

    private String chequeno;




}
