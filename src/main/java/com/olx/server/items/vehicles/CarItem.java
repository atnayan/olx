package com.olx.server.items.vehicles;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.enums.categories.vehicles.cars.BodyType;
import com.olx.server.enums.categories.vehicles.cars.CarBrand;
import com.olx.server.enums.categories.vehicles.cars.CarModel;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CarItem extends VehicleItem {

    private CarBrand brand;
    private CarModel model;
    private BodyType bodyType;


    public CarItem() {
        setCategory(Vehicles.CARS);
    }

}
