package com.olx.server.items;

import com.olx.server.items.enums.SaleType;
import com.olx.server.items.enums.Status;
import com.olx.server.items.enums.Subcategory;
import com.olx.server.items.enums.categories.MainCategory;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public class AbstractItem {

    protected Long id;
    protected String title;
    protected String description;
    protected MainCategory mainCategory;
    protected Subcategory subcategory;
    protected SaleType saleType;
    protected Status status;
    protected double price;


    public AbstractItem() {
    }
}
