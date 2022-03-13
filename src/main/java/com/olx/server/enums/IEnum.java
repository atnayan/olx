package com.olx.server.enums;

public interface IEnum {
    default String getName() {
        return this.toString();
    }
}
