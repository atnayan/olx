package com.olx.server.enums.categories.vehicles.cars;

import com.olx.server.enums.categories.vehicles.cars.models.AudiModel;
import com.olx.server.enums.categories.vehicles.cars.models.BmwModel;
import com.olx.server.enums.categories.vehicles.cars.models.MercedesModel;


public enum CarBrand {

    //J-
    AUDI (AudiModel.values()),
    BMW (BmwModel.values()),
    MERCEDES (MercedesModel.values());
    //J+

    private CarModel[] models;


    CarBrand(CarModel... models) {
        this.models = models;
    }


    public CarModel[] getModels() {
        return models;
    }
}
