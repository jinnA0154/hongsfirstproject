package com.example.hongsfirstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        return "greetings"; // templates/greetings.mustache를 찾아서 브라우저로 전송해줌.
    }
}
