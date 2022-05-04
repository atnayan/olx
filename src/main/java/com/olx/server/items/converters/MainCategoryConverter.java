package com.olx.server.items.converters;

import javax.persistence.Converter;

import com.olx.server.enums.categories.Category;
import com.olx.server.enums.categories.MainCategoryProvider;

import org.springframework.stereotype.Component;


@Component
@Converter(autoApply = true)
public class MainCategoryConverter extends AbstractConverter<Category, MainCategoryProvider> {
    public MainCategoryConverter() {
    }

}
