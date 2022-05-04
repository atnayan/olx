package com.olx.server.providers.vehicles.cars;

import com.olx.server.enums.categories.vehicles.cars.models.BmwModel;


public class BmwModelProvider implements CarModelProvider<BmwModel> {
    public BmwModelProvider() {
    }


    @Override
    public BmwModel[] get() {
        return BmwModel.values();
    }
}
