package com.olx.server.items;

import java.util.ServiceLoader;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.olx.server.enums.IEnum;

import org.springframework.stereotype.Component;


@Component
@Converter
public class EnumConverter implements AttributeConverter<IEnum, String> {
    public EnumConverter() {
    }


    @Override
    public String convertToDatabaseColumn(IEnum iEnum) {
        return iEnum.getName();
    }

    @Override
    public IEnum convertToEntityAttribute(String dbData) {
        ServiceLoader<IEnum> serviceLoader = ServiceLoader.load(IEnum.class);
        for (IEnum category : serviceLoader) {
            if (category.getName().equals(dbData)) {
                return category;
            }
        }
        return null;
    }

}
