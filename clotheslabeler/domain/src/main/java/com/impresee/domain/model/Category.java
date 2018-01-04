package com.impresee.domain.model;

/**
 * Created by calvarez on 04-01-18.
 */

public class Category {
    private String name;
    private int categoryId;

    public Category(String name, int categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }
}
