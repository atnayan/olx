package com.olx.server.items.properties;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.olx.server.enums.categories.MainCategory;
import com.olx.server.items.AbstractItem;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PropertyItem extends AbstractItem {

    private int area;


    public PropertyItem() {
        addCategory(MainCategory.PROPERTIES);
    }
}
