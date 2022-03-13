package com.olx.server.items;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

import com.olx.server.enums.RentType;
import com.olx.server.enums.SaleType;
import com.olx.server.enums.Status;
import com.olx.server.enums.categories.Category;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractItem {

    @Id
    @SequenceGenerator(name = "item_sequence", sequenceName = "item_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_sequence")
    protected Long id;
    private String title;
    private String description;
    @Setter(value = AccessLevel.PROTECTED)
    @Convert(converter = EnumConverter.class)
    private Category category;
    private SaleType saleType;
    private RentType rentType;
    private Status status;
    private double price;


    public AbstractItem() {
    }
}
