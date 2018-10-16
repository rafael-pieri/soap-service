package com.stock.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
        "code",
        "name",
        "quantity",
        "type"
})
public class Item {

    private String code;
    private String name;
    private int quantity;
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(final String value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(final String value) {
        this.name = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int value) {
        this.quantity = value;
    }

    public String getType() {
        return type;
    }

    public void setType(final String value) {
        this.type = value;
    }
}