package ru.artbmstu.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.artbmstu.entities.CompanyEntity;

@Repository()
public interface CompanyRepository  extends PagingAndSortingRepository<CompanyRepository, String> {

    @NonNull
    String NAME = "companyRepository";

    @Query(value = "SELECT company from CompanyEntity company where company.companyName = :companyName")
    CompanyEntity findByName(@Param("company_name") String companyName);
}
