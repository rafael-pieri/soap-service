package com.stock.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemsList", propOrder = {
        "item"
})
public class ItemsList {

    private List<Item> item;

    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
    }

    public void setItem(final List<Item> item) {
        this.item = item;
    }
}