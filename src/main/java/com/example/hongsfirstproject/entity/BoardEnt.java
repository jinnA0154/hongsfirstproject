package com.example.hongsfirstproject.entity;

import jdk.jfr.DataAmount;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class BoardEnt {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    private BoardEnt () {}

    public BoardEnt(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "BoardEnt{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
