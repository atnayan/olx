package com.olx.server.providers.vehicles.cars;

import com.olx.server.enums.Provider;
import com.olx.server.enums.categories.vehicles.cars.CarModel;


public interface CarModelProvider<S extends CarModel> extends Provider<S[]> {
}
