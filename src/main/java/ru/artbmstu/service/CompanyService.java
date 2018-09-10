package ru.artbmstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.artbmstu.entities.CompanyEntity;
import ru.artbmstu.repository.CompanyRepository;


@Service
@Transactional
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Transactional(readOnly=true)
    public CompanyEntity findByName(String name){
        return companyRepository.findByName(name);
    }
}
