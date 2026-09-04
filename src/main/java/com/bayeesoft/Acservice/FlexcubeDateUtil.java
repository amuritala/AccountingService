package com.bayeesoft.Acservice;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class FlexcubeDateUtil {
    public static XMLGregorianCalendar convertToXmlCalendar(Date date) throws Exception {
        GregorianCalendar gCal = new GregorianCalendar();
        gCal.setTime(date);
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
    }
}