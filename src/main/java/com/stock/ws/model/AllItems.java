
package com.stock.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allItems", propOrder = {
        "filters"
})
public class AllItems {

    @XmlElement(namespace = "http://stock.ws.com/")
    private Filters filters;

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(final Filters value) {
        this.filters = value;
    }
}