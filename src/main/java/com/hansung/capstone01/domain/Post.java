package com.hansung.capstone01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {

    @Id
    private String postId;
    private String boardName;
    private String userEmail;
    private String title;
    private String body;
    private String type;
}
