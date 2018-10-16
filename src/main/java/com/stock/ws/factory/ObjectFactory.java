package com.stock.ws.factory;

import com.stock.ws.model.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName REGISTER_ITEM_RESPONSE = new QName("http://ws.stock.com/", "registerItemResponse");
    private final static QName ALL_ITEMS_RESPONSE = new QName("http://ws.stock.com/", "allItemsResponse");
    private final static QName USER_TOKEN = new QName("http://ws.stock.com/", "userToken");
    private final static QName REGISTER_ITEM = new QName("http://ws.stock.com/", "registerItem");
    private final static QName FILTERS = new QName("http://ws.stock.com/", "filters");
    private final static QName FAULT_AUTHORIZATION = new QName("http://ws.stock.com/", "faultAuthorization");
    private final static QName ITEMS_LIST = new QName("http://ws.stock.com/", "itemsList");
    private final static QName ALL_ITEMS = new QName("http://ws.stock.com/", "allItems");

    public ObjectFactory() {

    }

    public ItemsList createItemsList() {
        return new ItemsList();
    }

    public AllItems createAllItems() {
        return new AllItems();
    }

    public RegisterItem createRegisterItem() {
        return new RegisterItem();
    }

    public Filters createFilters() {
        return new Filters();
    }

    public UserToken createUserToken() {
        return new UserToken();
    }

    public RegisterItemResponse createRegisterItemResponse() {
        return new RegisterItemResponse();
    }

    public AllItemsResponse createAllItemsResponse() {
        return new AllItemsResponse();
    }

    public Filter createFilter() {
        return new Filter();
    }

    public Item createItem() {
        return new Item();
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "registerItemResponse")
    public JAXBElement<RegisterItemResponse> createRegisterItemResponse(final RegisterItemResponse registerItemResponse) {
        return new JAXBElement<>(REGISTER_ITEM_RESPONSE, RegisterItemResponse.class, null, registerItemResponse);
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "allItemsResponse")
    public JAXBElement<AllItemsResponse> createAllItemsResponse(final AllItemsResponse allItemsResponse) {
        return new JAXBElement<>(ALL_ITEMS_RESPONSE, AllItemsResponse.class, null, allItemsResponse);
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "userToken")
    public JAXBElement<UserToken> createUserToken(final UserToken userToken) {
        return new JAXBElement<>(USER_TOKEN, UserToken.class, null, userToken);
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "registerItem")
    public JAXBElement<RegisterItem> createRegisterItem(final RegisterItem registerItem) {
        return new JAXBElement<>(REGISTER_ITEM, RegisterItem.class, null, registerItem);
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "filters")
    public JAXBElement<Filters> createFilters(final Filters filters) {
        return new JAXBElement<>(FILTERS, Filters.class, null, filters);
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "faultAuthorization")
    public JAXBElement<String> createFaultAuthorization(final String value) {
        return new JAXBElement<>(FAULT_AUTHORIZATION, String.class, null, value);
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "itemsList")
    public JAXBElement<ItemsList> createItemsList(final ItemsList itemsList) {
        return new JAXBElement<>(ITEMS_LIST, ItemsList.class, null, itemsList);
    }

    @XmlElementDecl(namespace = "http://ws.stock.com/", name = "allItems")
    public JAXBElement<AllItems> createAllItems(final AllItems allItems) {
        return new JAXBElement<>(ALL_ITEMS, AllItems.class, null, allItems);
    }
}