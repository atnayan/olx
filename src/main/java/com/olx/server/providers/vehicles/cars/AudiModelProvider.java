package com.olx.server.providers.vehicles.cars;

import com.olx.server.enums.categories.vehicles.cars.models.AudiModel;


public class AudiModelProvider implements CarModelProvider<AudiModel> {
    public AudiModelProvider() {
    }


    @Override
    public AudiModel[] get() {
        return AudiModel.values();
    }
}
