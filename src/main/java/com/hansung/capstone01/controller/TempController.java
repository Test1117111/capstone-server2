package com.hansung.capstone01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {
    @GetMapping("hello") // 8080/hello로 매핑
    public String hello(Model model){

        model.addAttribute("data", "hello!");
        return "hello"; // hello.html로 찾아가서 렌더링하라는 의미
    }
}
