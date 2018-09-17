package ru.artbmstu.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.model.CategoryEntity;

import java.util.List;
import java.util.Optional;

@Repository(AdRepository.NAME)
public interface AdRepository extends PagingAndSortingRepository<AdEntity, String> {

    @NonNull
    String NAME = "adRepository";

    Optional<AdEntity> findByIdad(String id);

    List<AdEntity> findByCategoryEntity(CategoryEntity category);

    void deleteByIdad(String id);
}
