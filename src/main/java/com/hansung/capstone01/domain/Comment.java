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
public class Comment {
    @Id
    @Column(name = "commentId")
    private String commentId;

    @Column(name = "comment")
    private String comment;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "postId")
    private String postId;
}
