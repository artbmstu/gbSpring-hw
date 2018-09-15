package ru.artbmstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.artbmstu.model.CategoryEntity;
import ru.artbmstu.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryEntity> findAll(){
        return (List<CategoryEntity>) categoryRepository.findAll();
    }
}
