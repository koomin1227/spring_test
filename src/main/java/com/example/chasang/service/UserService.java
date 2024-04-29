package com.example.chasang.service;

import com.example.chasang.dto.CreateUserDto;
import com.example.chasang.entity.User;
import com.example.chasang.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    @Value("${test}")
    String test;

    @PostConstruct
    public void init() {
        System.out.println(test);
    }
    public List<User> getUsers() {
        System.out.println(test);
        List<User> user = userRepository.findAll();
        user.forEach(System.out::println);
        return user;
    }

    public User getUser(String userId) {
        User user = userRepository.findByUserId(userId);
        System.out.println(user.toString());
        return userRepository.findByUserId(userId);
    }

    public void saveUser(CreateUserDto userInfo) {
        User user = new User();
//        user.setUserId(userInfo.);
    }
}
