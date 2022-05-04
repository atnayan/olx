package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.items.AbstractItem;


@Entity
public class AccessoriesItem extends AbstractItem {

    public AccessoriesItem() {
        addCategory(Vehicles.ACCESSORIES);
    }
}
