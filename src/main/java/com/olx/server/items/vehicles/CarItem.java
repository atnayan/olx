package com.olx.server.items.vehicles;

import javax.persistence.Convert;
import javax.persistence.Entity;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.enums.categories.vehicles.cars.BodyType;
import com.olx.server.enums.categories.vehicles.cars.CarBrand;
import com.olx.server.enums.categories.vehicles.cars.CarModel;
import com.olx.server.items.CarModelConverter;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class CarItem extends VehicleItem {

    private CarBrand brand;
    @Convert(converter = CarModelConverter.class)
    private CarModel model;
    private BodyType bodyType;


    public CarItem() {
        setCategory(Vehicles.CARS);
    }

}
