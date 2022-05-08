package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class MaritimeItem extends VehicleItem {

    public MaritimeItem() {
        addCategory(Vehicles.MARITIME);
    }
}
