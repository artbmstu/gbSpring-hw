package ru.artbmstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.artbmstu.entities.CategoryEntity;
import ru.artbmstu.repository.CategoryRepository;

import javax.transaction.Transactional;

@Transactional
@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public CategoryEntity findOne(String id){
        return categoryRepository.findOne(id);
    }
}
