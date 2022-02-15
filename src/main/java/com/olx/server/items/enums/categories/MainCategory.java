package com.olx.server.items.enums.categories;

import com.olx.server.items.enums.categories.properties.Properties;
import com.olx.server.items.enums.categories.vehicles.Vehicles;


public enum MainCategory {

    //J-
    VEHICLES (Vehicles.values()),
    PROPERTIES(Properties.values()),
    ELECTRONICS,
    FURNITURE,
    ELECTRICAL_APPLIANCES,
    FASHION,
    HEALTH_BEAUTY,
    PETS,
    BABIES,
    SPORTS,
    ARTS_HOBBIES,
    INDUSTRIAL;
    //J+

    private Category[] subcategories;


    MainCategory(Category... subcategories) {
        this.subcategories = subcategories;
    }


    public Category[] getSubcategories() {
        return subcategories;
    }
}
