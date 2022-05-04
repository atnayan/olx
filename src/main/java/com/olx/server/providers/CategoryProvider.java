package com.olx.server.providers;

import com.olx.server.enums.Provider;
import com.olx.server.enums.categories.Category;


public interface CategoryProvider<S extends Category> extends Provider<S[]> {
}
