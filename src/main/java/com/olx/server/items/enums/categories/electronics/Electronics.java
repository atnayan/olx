package com.olx.server.items.enums.categories.electronics;

import com.olx.server.items.enums.categories.Category;


public enum Electronics implements Category {
    //J-
    MOBILES(Mobiles.values()),
    TABLETS(Tablets.values()),
    DISPLAYS(Displays.values()),
    SMARTWATCHES,
    OTHER;

    //J+

    private Category[] subcategory;


    Electronics(Category... subcategory) {
        this.subcategory = subcategory;
    }
}
