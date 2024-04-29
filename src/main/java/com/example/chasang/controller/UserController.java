package com.example.chasang.controller;

import com.example.chasang.dto.CreateUserDto;
import com.example.chasang.service.UserService;
import com.example.chasang.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String userId) {
        System.out.println(userId);
        return userService.getUser(userId);
    }

    @PostMapping()
    public void createUser(@RequestBody CreateUserDto createUserDto) {
        System.out.println(createUserDto.toString());
        System.out.println(createUserDto.getUserId());
        System.out.println(createUserDto.getNickname());
    }
}
