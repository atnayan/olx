package com.olx.server.items;

import com.olx.server.enums.RentType;
import com.olx.server.enums.SaleType;
import com.olx.server.enums.Status;
import com.olx.server.enums.categories.Category;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class AbstractItem {

    private Long id;
    private String title;
    private String description;
    private Category category;
    private SaleType saleType;
    private RentType rentType;
    private Status status;
    private double price;


    public AbstractItem() {
    }
}
