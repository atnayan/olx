package com.olx.server.items;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractItem {

    @Id
    @SequenceGenerator(name = "item_sequence", sequenceName = "item_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_sequence")
    protected Long id;
    private String title;
    private String description;
    @Setter(value = AccessLevel.PROTECTED)
    private List<Category> categories;
    @Enumerated(EnumType.STRING)
    private SaleType saleType;
    @Enumerated(EnumType.STRING)
    private RentType rentType;
    @Enumerated(EnumType.STRING)
    private Status status;
    private double price;


    public AbstractItem() {
    }


    protected void addCategory(Category cat) {
        if (categories == null) {
            categories = new LinkedList<>();
        }
        categories.add(cat);
    }
}
