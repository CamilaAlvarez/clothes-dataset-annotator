package com.impresee.domain.repository;

import com.impresee.domain.model.Category;

import rx.Single;

/**
 * Created by calvarez on 04-01-18.
 */

public interface CategoryRepository {
    Single<Category> getCategory(int categoryId);
}
