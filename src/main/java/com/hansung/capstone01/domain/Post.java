package com.hansung.capstone01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @Column(name = "postId")
    private String postId;

    @Column(name = "boardName")
    private String boardName;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "type")
    private String type;
}
