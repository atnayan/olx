package com.olx.server;

import java.lang.reflect.Modifier;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.olx.server.items.AbstractItem;

import org.reflections.Reflections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration
public class ObjectMapperConfiguration {

    @Lazy
    @Autowired
    ObjectMapper objectMapper;


    public ObjectMapperConfiguration() {
    }


    @PostConstruct
    public ObjectMapper configureMapper() {
        Reflections reflections = new Reflections("com.olx.server.items");
        Set<Class<? extends AbstractItem>> subTypesOfAbstractItem = reflections.getSubTypesOf(AbstractItem.class);
        List<Class<?>> subtypes = subTypesOfAbstractItem.stream().filter(clazz -> !Modifier.isAbstract(clazz.getModifiers())).collect(Collectors.toList());
        objectMapper.registerSubtypes(subtypes);
        return objectMapper;
    }
}
