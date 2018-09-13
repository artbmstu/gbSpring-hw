package ru.artbmstu.service;

import ru.artbmstu.entities.AdEntity;
import ru.artbmstu.entities.CategoryEntity;

import java.util.List;

public interface AdService {

    AdEntity save(AdEntity ad);
    void delete(AdEntity ad);
    AdEntity getById(String id);
    List<AdEntity> findAll();
    List<AdEntity> findByCategory(CategoryEntity categoryEntity);
}
