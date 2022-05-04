package com.olx.server.enums.categories.vehicles;

import com.olx.server.enums.categories.CategoryProvider;


public class VehiclesProvider implements CategoryProvider<Vehicles> {
    public VehiclesProvider() {
    }


    @Override
    public Vehicles[] get() {
        return Vehicles.values();
    }
}
