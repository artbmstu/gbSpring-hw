package ru.artbmstu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.artbmstu.model.User;

import javax.jws.soap.SOAPBinding;

@Repository(UserRepository.NAME)
public interface UserRepository extends PagingAndSortingRepository {

    String NAME = "userRepository";

    User findByLogin(String login);

    @Query(value = "select e from User e where e.email = :email")
    User findByEmail(@Param("email") String email);

    long countByEmail(@Param("email") String email);

    long countByLogin(String login);
}
