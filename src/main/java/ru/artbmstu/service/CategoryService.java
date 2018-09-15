package ru.artbmstu.service;

import ru.artbmstu.model.CategoryEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> findAll();
}
