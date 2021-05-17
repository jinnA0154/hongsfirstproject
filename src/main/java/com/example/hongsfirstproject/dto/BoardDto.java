package com.example.hongsfirstproject.dto;

import com.example.hongsfirstproject.entity.BoardEnt;

public class BoardDto {

    private String title;
    private String content;

    public BoardDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public BoardEnt toEntity () {
        return new BoardEnt(null, title, content);
    }

}
