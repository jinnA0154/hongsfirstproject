package com.example.hongsfirstproject.repository;

import com.example.hongsfirstproject.entity.BoardEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEnt, Long> {

}
