package ru.artbmstu.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.artbmstu.entities.CategoryEntity;

@Repository(CategoryRepository.NAME)
public interface CategoryRepository extends PagingAndSortingRepository<CategoryEntity, String> {

    @NonNull
    String NAME = "categoryRepository";

    CategoryEntity findByIdcategory(Integer id);
}
