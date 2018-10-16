package com.stock.ws.service;

import com.stock.ws.model.*;

import javax.jws.WebService;
import java.util.Collections;

@WebService(endpointInterface = "com.stock.ws.service.StockWS",
        serviceName = "StockWS",
        portName = "StockWSPort")
public class StockWSImpl implements StockWS {

    @Override
    public ItemsList allItems(final Filters filters) {
        final ItemsList itemsList = new ItemsList();
        itemsList.setItem(Collections.singletonList(generateItem()));
        return itemsList;
    }

    @Override
    public RegisterItemResponse registerItem(final RegisterItem registerItem, final UserToken userToken) {
        final RegisterItemResponse registerItemResponse = new RegisterItemResponse();
        registerItemResponse.setItem(generateItem());
        return registerItemResponse;
    }

    private Item generateItem() {
        final Item item = new Item();
        item.setCode("MEA");
        item.setName("MEAN");
        item.setQuantity(5);
        item.setType("Book");
        return item;
    }
}