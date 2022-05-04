package com.olx.server.providers.vehicles.cars;

import com.olx.server.enums.categories.vehicles.cars.models.MercedesModel;


public class MercedesModelProvider implements CarModelProvider<MercedesModel> {
    public MercedesModelProvider() {
    }


    @Override
    public MercedesModel[] get() {
        return MercedesModel.values();
    }
}
