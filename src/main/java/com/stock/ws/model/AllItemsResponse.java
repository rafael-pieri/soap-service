
package com.stock.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allItemsResponse", propOrder = {
        "items"
})
public class AllItemsResponse {

    private ItemsList items;

    public ItemsList getItems() {
        return items;
    }

    public void setItems(final ItemsList value) {
        this.items = value;
    }
}