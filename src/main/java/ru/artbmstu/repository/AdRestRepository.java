package ru.artbmstu.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.artbmstu.dto.AdDTO;
import ru.artbmstu.model.AdEntity;

@Repository(AdRepository.NAME)
public interface AdRestRepository extends PagingAndSortingRepository<AdDTO, String> {

    @NonNull
    String NAME = "adRestRepository";


}
