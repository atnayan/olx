package com.olx.server.items.vehicles;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.items.AbstractItem;


public class SpareItem extends AbstractItem {

    public SpareItem() {
        setCategory(Vehicles.SPARE);
    }
}
