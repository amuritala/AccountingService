package com.bayeesoft.Acservice.dto;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerQueryRequest {
    private String customerno;
    private String customeraccno;
    private String branchcode;

}
