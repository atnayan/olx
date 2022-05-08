package com.olx.server.converters;

import java.io.IOException;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import com.olx.server.enums.categories.vehicles.cars.CarModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CarModelDeserializer extends StdDeserializer<CarModel> {

    @Autowired
    private CarModelConverter carModelConverter;


    protected CarModelDeserializer() {
        super(CarModel.class);
    }


    @Override
    public CarModel deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JacksonException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String carModelVal = node.asText();
        return carModelConverter.convertToEntityAttribute(carModelVal);
    }
}
