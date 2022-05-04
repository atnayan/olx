package com.olx.server.enums.categories.vehicles.cars.models;

import com.olx.server.enums.categories.vehicles.cars.CarModelProvider;


public class MercedesModelProvider implements CarModelProvider<MercedesModel> {
    public MercedesModelProvider() {
    }


    @Override
    public MercedesModel[] get() {
        return MercedesModel.values();
    }
}
