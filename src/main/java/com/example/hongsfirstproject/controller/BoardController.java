package com.example.hongsfirstproject.controller;

import com.example.hongsfirstproject.dto.BoardDto;
import com.example.hongsfirstproject.entity.BoardEnt;
import com.example.hongsfirstproject.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/board/new")
    public String newBoard () {
        return "/board/new";
    }

    @PostMapping("/board/create")
    public String createBoard (BoardDto bdto) {

        System.out.println(bdto.toString());

        BoardEnt boardEnt = bdto.toEntity();
        System.out.println(boardEnt.toString());

        BoardEnt saved = boardRepository.save(boardEnt);
        System.out.println(saved.toString());

        return "";
    }

    @GetMapping("/board/getlist")
    public String getlist (Model model) {

        List<BoardEnt> boardlist = boardRepository.findAll();

        model.addAttribute("blist", boardlist);

        return "board/getlist";
    }
}
