package com.stock.ws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "faultAuthorization", targetNamespace = "http://stock.ws.com/")
public class FaultAuthorization extends Exception {
    
    private String faultAuthorization;

    public FaultAuthorization() {
        super();
    }
    
    public FaultAuthorization(final String message) {
        super(message);
    }
    
    public FaultAuthorization(final String message, final Throwable cause) {
        super(message, cause);
    }

    public FaultAuthorization(final String message, final String faultAuthorization) {
        super(message);
        this.faultAuthorization = faultAuthorization;
    }

    public FaultAuthorization(final String message, final String faultAuthorization, final Throwable cause) {
        super(message, cause);
        this.faultAuthorization = faultAuthorization;
    }

    public String getFaultInfo() {
        return this.faultAuthorization;
    }
}