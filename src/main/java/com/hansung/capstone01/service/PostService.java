package com.hansung.capstone01.service;

import com.hansung.capstone01.DTO.PostDTO;
import com.hansung.capstone01.domain.Post;
import com.hansung.capstone01.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<PostDTO> findByBoardName(String boardName) {
        List<Post> posts = postRepository.findByBoardName(boardName);

        // Post 엔티티를 PostDTO로 변환
        List<PostDTO> postDTOs = posts.stream()
                .map(post -> new PostDTO(post.getPostId(), post.getBoardName(), post.getTitle(), post.getUserEmail(), post.getBody(), post.getType()))
                .collect(Collectors.toList());

        return postDTOs;
    }
}
