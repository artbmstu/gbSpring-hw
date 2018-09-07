package ru.artbmstu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import ru.artbmstu.entities.CategoryEntity;

import javax.persistence.EntityManager;

@Repository
public class CategoryRepository extends AbstractRepository {

    @Autowired
    @Qualifier(value = "entityManagerFactory")
    EntityManager myEntityManager;

    public CategoryEntity findOne(final String id){
        System.out.println(myEntityManager.getProperties());
        return myEntityManager.find(CategoryEntity.class, id);
    }
}
