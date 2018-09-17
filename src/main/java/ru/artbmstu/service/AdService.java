package ru.artbmstu.service;

import ru.artbmstu.model.AdEntity;
import ru.artbmstu.model.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface AdService {

    AdEntity save(AdEntity ad);
    void deleteById(String id);
    Optional<AdEntity> findByIdad(String id);
    List<AdEntity> findAll();
    List<AdEntity> findByCategory(CategoryEntity categoryEntity);
}
