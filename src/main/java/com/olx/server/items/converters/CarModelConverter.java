package com.olx.server.items.converters;

import javax.persistence.Converter;

import com.olx.server.enums.categories.vehicles.cars.CarModel;

import org.springframework.stereotype.Component;


@Component
@Converter(autoApply = true)
public class CarModelConverter extends AbstractConverter<CarModel> {
    public CarModelConverter() {
    }

}
