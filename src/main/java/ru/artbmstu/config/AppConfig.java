package ru.artbmstu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
@ComponentScan("ru.artbmstu")
@EnableJpaRepositories(basePackages = "ru.artbmstu.repositories")
public class AppConfig {

    @Bean(name="entityManagerFactory")
    public EntityManagerFactory getEntityManager(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "entity" );
        return entityManagerFactory;
    }
}
