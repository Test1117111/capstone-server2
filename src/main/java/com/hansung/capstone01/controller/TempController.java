package com.hansung.capstone01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class TempController {
    @GetMapping("hello") // 8080/hello로 매핑
    public String hello(Model model){

        model.addAttribute("data", "hello!");
        return "hello";
    }
}