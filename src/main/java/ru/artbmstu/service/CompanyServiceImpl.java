package ru.artbmstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.artbmstu.entities.CompanyEntity;
import ru.artbmstu.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyRepository companyRepository;

//    @Transactional(readOnly = true)
//    public CompanyEntity findByAd(String ad){
//        return companyRepository.findByAdsEquals(ad);
//    }

    @Transactional(readOnly = true)
    public CompanyEntity findById(String id){
        return companyRepository.getById(id);
    }
}
