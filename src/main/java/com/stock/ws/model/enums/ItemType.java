package com.stock.ws.model.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "itemType")
@XmlEnum
public enum ItemType {

    @XmlEnumValue("Book")
    BOOK("Book"),

    @XmlEnumValue("Cellphone")
    CELLPHONE("Cellphone"),

    @XmlEnumValue("Tablet")
    TABLET("Tablet");
    private final String value;

    ItemType(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static ItemType fromValue(final String value) {
        for (ItemType itemType : ItemType.values()) {
            if (itemType.value.equals(value)) {
                return itemType;
            }
        }
        throw new IllegalArgumentException(value);
    }
}