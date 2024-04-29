package com.example.chasang.dto;

import com.example.chasang.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class CreateUserDto {
    private String major;
    private String nickname;
    private String userId;

    public User toEntity() {
        return User.builder()
                .userId(userId)
                .nickname(nickname)
                .major(major)
                .build();
    }
}
