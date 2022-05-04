package com.olx.server.enums.categories;

public class MainCategoryProvider implements CategoryProvider<MainCategory> {
    public MainCategoryProvider() {
    }


    @Override
    public MainCategory[] get() {
        return MainCategory.values();
    }
}
