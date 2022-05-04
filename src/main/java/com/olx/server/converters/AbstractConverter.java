package com.olx.server.converters;

import java.lang.reflect.ParameterizedType;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import javax.persistence.AttributeConverter;

import com.olx.server.enums.IEnum;
import com.olx.server.providers.Provider;


public abstract class AbstractConverter<S extends IEnum, P extends Provider> implements AttributeConverter<S, String> {

    private final List<S> enumsList;


    public AbstractConverter() {
        //J-
        ServiceLoader<Provider> serviceLoader = ServiceLoader.load(Provider.class);
        final Class<P> providerClass = (Class<P>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        enumsList = serviceLoader.stream()
                                .filter(provider -> providerClass.isAssignableFrom(provider.type()))
                                .map(provider -> (Object[]) provider.get().get())
                                .flatMap(Arrays::stream)
                                .map(obj -> (S) obj)
                                .collect(Collectors.toList());
        //J+
    }


    @Override
    public String convertToDatabaseColumn(S attribute) {
        return attribute.getName();
    }

    @Override
    public S convertToEntityAttribute(String dbData) {
        for (S elt : enumsList) {
            if (elt.getName().equals(dbData)) {
                return elt;
            }
        }
        return null;
    }
}
