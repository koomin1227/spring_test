package com.example.chasang.repository;

import com.example.chasang.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByUserId() {
//        Users user1 = new Users();
//        user1.setUserId("test");
//        user1.setMajor("qwe");
//        user1.setNickname("koomin");
//        Users savedUser = userRepository.save(user1);
//        System.out.println(savedUser.getId());
        User user = userRepository.findByUserId("test");
        System.out.println(user.getId());
    }
}