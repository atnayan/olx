package com.olx.server.items;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.olx.server.enums.categories.Category;

import org.springframework.stereotype.Component;


@Component
@Converter
public class CategoryConverter extends AbstractConverter<Category> implements AttributeConverter<Category, String> {
    public CategoryConverter() {
    }


    @Override
    public String convertToDatabaseColumn(Category category) {
        return super.convertToDatabaseColumn(category);
    }

    @Override
    public Category convertToEntityAttribute(String dbData) {
        return super.convertToEntityAttribute(dbData);
    }

}
