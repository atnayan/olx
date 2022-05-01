package com.olx.server.items;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.olx.server.enums.categories.vehicles.cars.CarModel;

import org.springframework.stereotype.Component;


@Component
@Converter
public class CarModelConverter extends AbstractConverter<CarModel> implements AttributeConverter<CarModel, String> {
    public CarModelConverter() {
    }


    @Override
    public String convertToDatabaseColumn(CarModel carModel) {
        return super.convertToDatabaseColumn(carModel);
    }

    @Override
    public CarModel convertToEntityAttribute(String dbData) {
        return super.convertToEntityAttribute(dbData);
    }
}
