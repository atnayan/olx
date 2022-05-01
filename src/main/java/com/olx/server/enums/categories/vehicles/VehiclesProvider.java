package com.olx.server.enums.categories.vehicles;

import com.olx.server.enums.Provider;


public class VehiclesProvider implements Provider<Vehicles[]> {
    public VehiclesProvider() {
    }


    @Override
    public Vehicles[] get() {
        return Vehicles.values();
    }
}
