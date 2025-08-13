package com.codenest.programming.model;

import com.codenest.user.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "problems")
public class Problem {

    @Id
    private String id;

    private String title;
    private String description;
    private String difficulty;
    private String inputFormat;
    private String outputFormat;
    private String sampleInput;
    private String sampleOutput;

    @DBRef
    private Set<User> solvers = new HashSet<>();

    // Getters and Setters
}
