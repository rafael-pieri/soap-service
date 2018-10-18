package com.stock.ws.repository;

import com.stock.ws.model.*;

import java.util.Collections;

public class ItemRepositoryStub {

    public ItemsList getAll() {
        final ItemsList itemsList = new ItemsList();
        itemsList.setItem(Collections.singletonList(generateItem()));
        return itemsList;
    }

    public Item save(final RegisterItem registerItem) {
        return generateItem();
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