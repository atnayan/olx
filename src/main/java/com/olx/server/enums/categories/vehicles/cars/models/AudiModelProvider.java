package com.olx.server.enums.categories.vehicles.cars.models;

import com.olx.server.enums.Provider;


public class AudiModelProvider implements Provider<AudiModel[]> {
    public AudiModelProvider() {
    }


    @Override
    public AudiModel[] get() {
        return AudiModel.values();
    }
}
