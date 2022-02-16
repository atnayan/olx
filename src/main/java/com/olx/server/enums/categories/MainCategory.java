package com.olx.server.enums.categories;

import com.olx.server.enums.categories.electronics.Electronics;
import com.olx.server.enums.categories.properties.Properties;
import com.olx.server.enums.categories.vehicles.Vehicles;


public enum MainCategory implements Category {

    //J-
    VEHICLES (Vehicles.values()),
    PROPERTIES(Properties.values()),
    ELECTRONICS(Electronics.values()),
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
