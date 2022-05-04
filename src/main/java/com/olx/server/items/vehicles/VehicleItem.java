package com.olx.server.items.vehicles;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.olx.server.enums.categories.Color;
import com.olx.server.enums.categories.MainCategory;
import com.olx.server.enums.categories.vehicles.Transmission;
import com.olx.server.items.AbstractItem;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class VehicleItem extends AbstractItem {

    private int year;
    private int odometer;

    @Enumerated(EnumType.STRING)
    private Transmission transmission;
    @Enumerated(EnumType.STRING)
    private Color color;


    public VehicleItem() {
        addCategory(MainCategory.VEHICLES);
    }

}
