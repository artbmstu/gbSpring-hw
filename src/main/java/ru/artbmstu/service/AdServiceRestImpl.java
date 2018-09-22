package ru.artbmstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.artbmstu.dto.AdDTO;
import ru.artbmstu.model.AdEntity;
import ru.artbmstu.repository.AdRepository;
import ru.artbmstu.repository.AdRestRepository;

import java.util.List;
import java.util.Optional;

public class AdServiceRestImpl implements AdRestService {

    @Autowired
    AdRestRepository adRestRepository;
    @Autowired
    AdRepository adRepository;

    @Transactional
    public AdDTO save(AdDTO ad){
        return adRestRepository.save(ad);
    }

    @Transactional(readOnly = true)
    public List<AdEntity> findAll(){
        return (List<AdEntity>) adRepository.findAll();
    }

    @Transactional
    public void deleteById(String id){
        adRepository.deleteByIdad(id);
    }

    @Transactional(readOnly = true)
    public Optional<AdEntity> findByIdad(String id){
        return adRepository.findByIdad(id);
    }

    @Transactional
    public void delete(AdDTO ad){
        adRestRepository.delete(ad);
    }
}
