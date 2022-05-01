package com.olx.server.items.converters;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import javax.persistence.AttributeConverter;

import com.olx.server.enums.IEnum;
import com.olx.server.enums.Provider;


public abstract class AbstractConverter<S extends IEnum> implements AttributeConverter<S, String> {
    public AbstractConverter() {
    }


    @Override
    public String convertToDatabaseColumn(S attribute) {
        return attribute.getName();
    }

    @Override
    public S convertToEntityAttribute(String dbData) {
        ServiceLoader<Provider> serviceLoader = ServiceLoader.load(Provider.class);
        List<S> list = serviceLoader.stream().map(provider -> (Object[]) provider.get().get()).flatMap(Arrays::stream).map(obj -> (S) obj).collect(Collectors.toList());
        for (S elt : list) {
            if (elt.getName().equals(dbData)) {
                return elt;
            }
        }
        return null;
    }
}
