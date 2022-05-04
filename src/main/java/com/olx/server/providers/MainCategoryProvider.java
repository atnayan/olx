package com.olx.server.providers;

import com.olx.server.enums.categories.MainCategory;


public class MainCategoryProvider implements CategoryProvider<MainCategory> {
    public MainCategoryProvider() {
    }


    @Override
    public MainCategory[] get() {
        return MainCategory.values();
    }
}
