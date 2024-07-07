package com.example.board.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String password; //비밀번호
}
