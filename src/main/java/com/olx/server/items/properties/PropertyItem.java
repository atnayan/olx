package com.olx.server.items.properties;

import com.olx.server.enums.categories.MainCategory;
import com.olx.server.items.AbstractItem;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class PropertyItem extends AbstractItem {

    private int area;


    public PropertyItem() {
        setCategory(MainCategory.PROPERTIES);
    }
}
