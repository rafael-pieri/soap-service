package com.stock.ws.service;

import com.stock.ws.exception.FaultAuthorization;
import com.stock.ws.factory.ObjectFactory;
import com.stock.ws.model.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://ws.stock.com/", name = "StockWS")
@XmlSeeAlso({ObjectFactory.class})
public interface StockWS {

    @WebMethod(operationName = "AllItems")
    @Action(input = "http://ws.stock.com/StockWS/AllItemsRequest",
            output = "http://ws.stock.com/StockWS/AllItemsResponse")
    @RequestWrapper(localName = "AllItems", targetNamespace = "http://ws.stock.com/", className = "com.stock.ws.model.AllItems")
    @ResponseWrapper(localName = "AllItemsResponse", targetNamespace = "http://ws.stock.com/", className = "com.stock.ws.model.AllItemsResponse")
    @WebResult(name = "Items")
    ItemsList allItems(@WebParam(name = "Filters", targetNamespace = "http://ws.stock.com/") final Filters filters);

    @WebMethod(operationName = "RegisterItem")
    @Action(input = "http://ws.stock.com/StockWS/RegisterItemRequest",
            output = "http://ws.stock.com/StockWS/RegisterItemResponse",
            fault = {@FaultAction(className = FaultAuthorization.class, value = "http://ws.stock.com/StockWS/RegisterItem/Fault/AuthorizationException")})
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "RegisterItemResponse", targetNamespace = "http://ws.stock.com/", partName = "result")
    RegisterItemResponse registerItem(
            @WebParam(partName = "registerItem", name = "RegisterItem", targetNamespace = "http://ws.stock.com/") final RegisterItem registerItem,
            @WebParam(partName = "userToken", name = "UserToken", targetNamespace = "http://ws.stock.com/", header = true) final UserToken userToken
    ) throws FaultAuthorization;
}