package com.stock.ws.service;

import com.stock.ws.model.*;
import com.stock.ws.repository.ItemRepositoryStub;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(endpointInterface = "com.stock.ws.service.StockWS",
        serviceName = "StockWS",
        portName = "StockWSPort")
public class StockWSImpl implements StockWS {

    private ItemRepositoryStub itemRepository;

    public StockWSImpl() {
        this.itemRepository = new ItemRepositoryStub();
    }

    @Override
    public ItemsList allItems(final Filters filters) {
        return itemRepository.getAll();
    }

    @Override
    public RegisterItemResponse registerItem(final RegisterItem registerItem, final UserToken userToken) {
        final Item item = itemRepository.save(registerItem);

        final RegisterItemResponse registerItemResponse = new RegisterItemResponse();
        registerItemResponse.setItem(item);

        return registerItemResponse;
    }
}