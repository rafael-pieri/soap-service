package com.stock.ws.model;

import com.stock.ws.model.enums.ItemType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter", propOrder = {
        "name",
        "type"
})
public class Filter {

    private String name;
    private ItemType type;

    public String getName() {
        return name;
    }

    public void setName(final String value) {
        this.name = value;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(final ItemType value) {
        this.type = value;
    }
}