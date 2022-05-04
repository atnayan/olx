package com.olx.server.converters;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.olx.server.enums.categories.Category;
import com.olx.server.providers.CategoryProvider;

import org.springframework.stereotype.Component;


@Component
@Converter(autoApply = true)
public class CategoryConverter implements AttributeConverter<List<Category>, String> {
    private static final String SEPARATOR = ".";
    private final AbstractConverter<Category, CategoryProvider> converter;


    public CategoryConverter() {
        converter = new AbstractConverter<>() {
        };
    }


    @Override
    public String convertToDatabaseColumn(List<Category> attribute) {
        //J-
        return attribute.stream()
                        .map(converter::convertToDatabaseColumn)
                        .reduce((cat1, cat2) -> cat1.concat(SEPARATOR).concat(cat2))
                        .orElse(null);
        //J+
    }

    @Override
    public List<Category> convertToEntityAttribute(String dbData) {
        List<Category> categoriesList = new LinkedList<>();
        String[] categoriesStrArr = dbData.split("\\.");
        for (String categoryStr : categoriesStrArr) {
            Category category = converter.convertToEntityAttribute(categoryStr);
            categoriesList.add(category);
        }
        return categoriesList;
    }
}
