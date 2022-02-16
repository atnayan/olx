package com.olx.server.items.vehicles;

import com.olx.server.enums.categories.vehicles.CarBrand;
import com.olx.server.enums.categories.vehicles.CarModel;
import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.items.AbstractItem;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CarItem extends AbstractItem {

    private CarBrand brand;
    private CarModel model;


    public CarItem() {
        setCategory(new Vehicles[] { Vehicles.CARS });
    }

}
