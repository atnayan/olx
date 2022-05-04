package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;


@Entity
public class MotorcycleItem extends VehicleItem {

    public MotorcycleItem() {
        addCategory(Vehicles.MOTORCYCLES);
    }
}
