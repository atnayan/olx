package com.olx.server.enums.categories.vehicles.cars.models;

import com.olx.server.enums.categories.vehicles.cars.CarModelProvider;


public class BmwModelProvider implements CarModelProvider<BmwModel> {
    public BmwModelProvider() {
    }


    @Override
    public BmwModel[] get() {
        return BmwModel.values();
    }
}
