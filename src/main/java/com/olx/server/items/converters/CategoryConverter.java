package com.olx.server.items.converters;

import javax.persistence.Converter;

import com.olx.server.enums.categories.Category;

import org.springframework.stereotype.Component;


@Component
@Converter(autoApply = true)
public class CategoryConverter extends AbstractConverter<Category> {
    public CategoryConverter() {
    }

}
