package com.codenest.user.model;

import com.codenest.quiz.model.Quiz;
import com.codenest.community.model.Community;
import com.codenest.programming.model.Problem;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;
    private String password;
    private String email;
    private Role role;

    @DBRef
    private Set<Community> communities = new HashSet<>();

    @DBRef
    private Set<Quiz> attemptedQuizzes = new HashSet<>();

    @DBRef
    private Set<Problem> solvedProblems = new HashSet<>();

    // Getters and Setters
}
