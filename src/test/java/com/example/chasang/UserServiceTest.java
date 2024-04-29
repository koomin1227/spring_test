package com.example.chasang;

import com.example.chasang.entity.User;
import com.example.chasang.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
class UserServiceTest {

    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("테스트")
    void userTest() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }

}