package com.codenest.quiz.model;

import com.codenest.user.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document(collection = "quizzes")
public class Quiz {

    @Id
    private String id;

    private String title;
    private String description;

    private List<Question> questions = new ArrayList<>();

    @DBRef
    private Set<User> participants = new HashSet<>();

    // Getters and Setters
}
