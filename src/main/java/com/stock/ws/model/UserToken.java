package com.stock.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userToken", propOrder = {
        "expirationDate",
        "token"
})
public class UserToken {

    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar expirationDate;

    private String token;

    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String value) {
        this.token = value;
    }
}