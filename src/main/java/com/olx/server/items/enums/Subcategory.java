package com.olx.server.items.enums;

import com.olx.server.items.enums.categories.MainCategory;

import lombok.Getter;


@Getter
public enum Subcategory {

    //J-
    PROPERTIES_FOR_SALE;

    //J+

    private MainCategory parentMainCategory;


    Subcategory() {

    }

    Subcategory(MainCategory parentMainCategory) {
        this.parentMainCategory = parentMainCategory;
    }

}
