package com.armanfara.userservice.service;

import com.armanfara.userservice.entity.User;
import com.armanfara.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        log.info("Inside findAll of UserService");
        return userRepository.findAll();
    }

    public User findById(Long userId) {
        log.info("Inside findById of UserService");
        return userRepository.findById(userId).orElse(null);
    }

    public User save(User user) {
        log.info("Inside save of UserService");
        return userRepository.save(user);
    }
}
