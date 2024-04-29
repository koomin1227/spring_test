package com.example.chasang.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 8, nullable = false)
    private String userId;

    @Column(length = 30)
    private String nickname;

    @Column(length = 30)
    private String major;

//    @Builder
}
