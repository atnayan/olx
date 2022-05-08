package com.olx.server.items.vehicles;

import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.items.AbstractItem;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class AccessoriesItem extends AbstractItem {

    private int accType;


    public AccessoriesItem() {
        addCategory(Vehicles.ACCESSORIES);
    }
}
