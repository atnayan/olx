package com.olx.server.items.properties;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ResidentialItem extends PropertyItem {

    private int bedrooms;
    private int bathrooms;
    private int salon;
    private int parking;
    private boolean furnished;


    public ResidentialItem() {
    }
}
