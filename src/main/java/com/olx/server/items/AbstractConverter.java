package com.olx.server.items;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import com.olx.server.enums.IEnum;
import com.olx.server.enums.Provider;


public abstract class AbstractConverter<S extends IEnum> {
    public AbstractConverter() {
    }


    protected String convertToDatabaseColumn(S ienum) {
        return ienum.getName();
    }

    protected S convertToEntityAttribute(String dbData) {
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
