package com.olx.server.items.vehicles;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.enums.categories.vehicles.cars.BodyType;
import com.olx.server.enums.categories.vehicles.cars.CarBrand;
import com.olx.server.enums.categories.vehicles.cars.CarModel;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class CarItem extends VehicleItem {

    @Enumerated(EnumType.STRING)
    private CarBrand brand;
    private CarModel model;
    @Enumerated(EnumType.STRING)
    private BodyType bodyType;


    public CarItem() {
        addCategory(Vehicles.CARS);
    }

}
