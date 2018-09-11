package ru.artbmstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.artbmstu.entities.AdEntity;
import ru.artbmstu.entities.CategoryEntity;
import ru.artbmstu.repository.AdRepository;

import java.util.List;

@Service
@Transactional
public class AdServiceImpl implements AdService{

    @Autowired
    AdRepository adRepository;

    @Transactional
    public AdEntity save(AdEntity ad){
        return adRepository.save(ad);
    }

    @Transactional
    public void delete(AdEntity ad){
        adRepository.delete(ad);
    }

    @Transactional(readOnly = true)
    public AdEntity getById(String id){
        return adRepository.getByIdad(id);
    }

    @Transactional(readOnly = true)
    public List<AdEntity> findAll(){
        return (List<AdEntity>) adRepository.findAll();
    }

//    @Transactional(readOnly = true)
//    public List<AdEntity> findAllByCategory(CategoryEntity category){
//        return adRepository.findAllByCategory(category);
//    }
}
