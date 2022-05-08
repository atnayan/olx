package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class MotorcycleItem extends VehicleItem {

    private int cc;


    public MotorcycleItem() {
        addCategory(Vehicles.MOTORCYCLES);
    }
}
