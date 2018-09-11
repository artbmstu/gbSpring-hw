package ru.artbmstu.service;

import ru.artbmstu.entities.CategoryEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> findAll();
}
