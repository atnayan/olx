package com.olx.server.enums.categories;

import com.olx.server.enums.Provider;


public class MainCategoryProvider implements Provider<MainCategory[]> {
    public MainCategoryProvider() {
    }


    @Override
    public MainCategory[] get() {
        return MainCategory.values();
    }
}
