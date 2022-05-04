package com.olx.server.items.properties;

import javax.persistence.Entity;

import com.olx.server.enums.categories.properties.Properties;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ApartmentItem extends ResidentialItem {

    private int floor;
    private int totalFloors;
    private boolean isLastFloor;


    public ApartmentItem() {
        addCategory(Properties.APARTMENTS);
    }
}
