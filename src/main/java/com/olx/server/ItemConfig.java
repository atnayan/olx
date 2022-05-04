package com.olx.server;

import java.util.List;

import com.olx.server.enums.SaleType;
import com.olx.server.enums.Status;
import com.olx.server.enums.categories.Color;
import com.olx.server.enums.categories.vehicles.Transmission;
import com.olx.server.enums.categories.vehicles.cars.BodyType;
import com.olx.server.enums.categories.vehicles.cars.CarBrand;
import com.olx.server.enums.categories.vehicles.cars.models.AudiModel;
import com.olx.server.items.vehicles.CarItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ItemConfig {
    public ItemConfig() {
    }


    @Bean
    @Autowired
    CommandLineRunner commandLineRunner(ItemRepository itemRepository) {
        return args -> {
            CarItem car_audi_for_sale = createCarItem("Car AUDI For Sale");
            CarItem car_bmw_for_sale = createCarItem("Car BMW For Sale");
            itemRepository.saveAll(List.of(car_audi_for_sale));
        };
    }

    private CarItem createCarItem(String title) {
        CarItem carItem = new CarItem();
        carItem.setTitle(title);
        carItem.setDescription("Car Description");
        carItem.setSaleType(SaleType.SALE);
        carItem.setStatus(Status.USED);
        carItem.setPrice(12000L);
        carItem.setYear(2014);
        carItem.setOdometer(76000);
        carItem.setTransmission(Transmission.AUTOMATIC);
        carItem.setColor(Color.WHITE);
        carItem.setBrand(CarBrand.AUDI);
        carItem.setModel(AudiModel.Q5);
        carItem.setBodyType(BodyType.SUV);
//        carItem.setRentType(RentType.DAILY);
        return carItem;
    }
}
