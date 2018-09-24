package ru.artbmstu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.artbmstu.model.User;
import ru.artbmstu.repository.UserRepository;

import javax.jws.soap.SOAPBinding;
import javax.persistence.Table;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public Iterable<User> findAll(Sort sort) {
        return userRepository.findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Transactional
    public <S extends User> S save(S s) {
        return (S) userRepository.save(s);
    }
}
