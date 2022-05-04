package com.olx.server.converters;

import javax.persistence.Converter;

import com.olx.server.enums.categories.vehicles.cars.CarModel;
import com.olx.server.providers.vehicles.cars.CarModelProvider;

import org.springframework.stereotype.Component;


@Component
@Converter(autoApply = true)
public class CarModelConverter extends AbstractConverter<CarModel, CarModelProvider> {
    public CarModelConverter() {
    }

}
