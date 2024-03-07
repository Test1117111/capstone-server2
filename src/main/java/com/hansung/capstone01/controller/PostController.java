package com.hansung.capstone01.controller;

import com.hansung.capstone01.DTO.PostDTO;
import com.hansung.capstone01.domain.Post;
import com.hansung.capstone01.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO newPost){
        PostDTO savedPost = postService.savePost(newPost);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<Void> deletePost(@PathVariable String postId){
        postService.deletePost(postId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
