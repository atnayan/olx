package com.olx.server.enums.categories.vehicles.cars.models;

import com.olx.server.enums.categories.vehicles.cars.CarModelProvider;


public class AudiModelProvider implements CarModelProvider<AudiModel> {
    public AudiModelProvider() {
    }


    @Override
    public AudiModel[] get() {
        return AudiModel.values();
    }
}
