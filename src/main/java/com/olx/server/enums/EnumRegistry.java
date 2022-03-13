package com.olx.server.enums;

import java.util.HashMap;
import java.util.Map;

import com.olx.server.enums.categories.MainCategory;
import com.olx.server.enums.categories.electronics.Displays;
import com.olx.server.enums.categories.electronics.Electronics;
import com.olx.server.enums.categories.electronics.Mobiles;
import com.olx.server.enums.categories.electronics.Tablets;
import com.olx.server.enums.categories.properties.Properties;
import com.olx.server.enums.categories.vehicles.cars.models.AudiModel;


public class EnumRegistry {
    private final Map<String, Class<? extends Enum>> enumTypes = new HashMap<>();


    {
        // Category
        this.registerEnum("DISPLAYS", Displays.class);
        this.registerEnum("ELECTRONICS", Electronics.class);
        this.registerEnum("MAINCATEGORY", MainCategory.class);
        this.registerEnum("MOBILES", Mobiles.class);
        this.registerEnum("PROPERTIES", Properties.class);
        this.registerEnum("TABLETS", Tablets.class);

        // CarModel
        this.registerEnum("AUDI", AudiModel.class);
        this.registerEnum("BMW", Tablets.class);
        this.registerEnum("TABLETS", Tablets.class);
    }


    public EnumRegistry() {
    }


    public <T extends Enum<T> & IEnum> void registerEnum(String enumClassName, Class<T> cls) {
        this.enumTypes.put(enumClassName, cls);
    }

    public IEnum findByPlanetAndName(String enumClassName, String name) {
        return (IEnum) Enum.valueOf(this.enumTypes.get(enumClassName), name);
    }
}
