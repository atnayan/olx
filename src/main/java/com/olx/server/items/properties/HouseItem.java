package com.olx.server.items.properties;

import javax.persistence.Entity;

import com.olx.server.enums.categories.properties.Properties;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class HouseItem extends ResidentialItem {

    private int totalFloors;
    private boolean hasBasement;


    public HouseItem() {
        addCategory(Properties.HOUSES);
    }
}
