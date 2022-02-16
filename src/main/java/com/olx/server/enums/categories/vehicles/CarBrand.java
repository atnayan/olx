package com.olx.server.enums.categories.vehicles;

import com.olx.server.enums.categories.Category;


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
