package com.olx.server.providers.vehicles.cars;

import com.olx.server.enums.categories.vehicles.cars.CarModel;
import com.olx.server.providers.Provider;


public interface CarModelProvider<S extends CarModel> extends Provider<S[]> {
}
