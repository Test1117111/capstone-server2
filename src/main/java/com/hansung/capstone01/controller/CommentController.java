package com.hansung.capstone01.controller;

import com.hansung.capstone01.DTO.CommentDTO;
import com.hansung.capstone01.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comments")
public class CommentController {

    private final CommentService CommentService;

    public CommentController(CommentService CommmentService) {
        this.CommentService = CommmentService;
    }

    @GetMapping("/")
    public List<CommentDTO> getCommments(@RequestParam String postId){
        List<CommentDTO> Commments = CommentService.findByPostId(postId);
        return Commments;
    }

    @PostMapping
    public ResponseEntity<CommentDTO> createCommment(@RequestBody CommentDTO newCommment){
        CommentDTO savedCommment = CommentService.saveComment(newCommment);
        return new ResponseEntity<>(savedCommment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{CommmentId}")
    public ResponseEntity<Void> deleteCommment(@PathVariable String CommmentId){
        CommentService.deleteComment(CommmentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
