package com.stock.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerItem", propOrder = {
        "item"
})
public class RegisterItem {

    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(final Item value) {
        this.item = value;
    }
}