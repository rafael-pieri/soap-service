package com.stock.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerItemResponse", propOrder = {
        "item"
})
public class RegisterItemResponse {

    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(final Item value) {
        this.item = value;
    }
}