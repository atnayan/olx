package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.items.AbstractItem;


@Entity
public class SpareItem extends AbstractItem {

    public SpareItem() {
        setCategory(Vehicles.SPARE);
    }
}
