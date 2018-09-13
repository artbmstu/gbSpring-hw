package ru.artbmstu.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.artbmstu.entities.AdEntity;
import ru.artbmstu.entities.CategoryEntity;

import java.util.List;

@Repository(AdRepository.NAME)
public interface AdRepository extends PagingAndSortingRepository<AdEntity, String> {

    @NonNull
    String NAME = "adRepository";

    AdEntity getByIdad(String id);

    List<AdEntity> findByCategoryEntity(CategoryEntity category);
}
