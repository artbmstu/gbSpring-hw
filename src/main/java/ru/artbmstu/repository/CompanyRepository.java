package ru.artbmstu.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.artbmstu.entities.CompanyEntity;

@Repository(CompanyRepository.NAME)
public interface CompanyRepository  extends PagingAndSortingRepository<CompanyEntity, String> {

    @NonNull
    String NAME = "companyRepository";

//    CompanyEntity findByAdsEquals(String ad);
    CompanyEntity getById(String id);
}
