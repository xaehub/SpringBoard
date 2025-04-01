package com.example.board.dto;

import lombok.Getter;

@Getter
public class MemberResponseDto {

    private final Long id;

    private final String username;

    private final Integer age;

    public MemberResponseDto(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
}
