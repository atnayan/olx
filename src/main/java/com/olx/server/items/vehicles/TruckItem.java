package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;


@Entity
public class TruckItem extends VehicleItem {

    public TruckItem() {
        setCategory(Vehicles.TRUCKS);
    }
}
