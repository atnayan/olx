package com.olx.server.providers.vehicles;

import com.olx.server.enums.categories.vehicles.Vehicles;
import com.olx.server.providers.CategoryProvider;


public class VehiclesProvider implements CategoryProvider<Vehicles> {
    public VehiclesProvider() {
    }


    @Override
    public Vehicles[] get() {
        return Vehicles.values();
    }
}
