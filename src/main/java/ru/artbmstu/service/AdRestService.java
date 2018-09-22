package ru.artbmstu.service;

import ru.artbmstu.dto.AdDTO;
import ru.artbmstu.model.AdEntity;

import java.util.List;
import java.util.Optional;

public interface AdRestService {

    AdDTO save(AdDTO ad);

    List<AdEntity> findAll();

    void deleteById(String id);

    Optional<AdEntity> findByIdad(String id);

    void delete(AdDTO ad);
}
