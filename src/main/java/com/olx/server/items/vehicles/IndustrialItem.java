package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class IndustrialItem extends VehicleItem {

    private int type;


    public IndustrialItem() {
        addCategory(Vehicles.INDUSTRIAL);
    }
}
