package com.hansung.capstone01.controller;

import com.hansung.capstone01.DTO.PostDTO;
import com.hansung.capstone01.domain.Post;
import com.hansung.capstone01.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public List<PostDTO> getPosts(@RequestParam String boardName){
        List<PostDTO> posts = postService.findByBoardName(boardName);
        return posts;
    }
}
