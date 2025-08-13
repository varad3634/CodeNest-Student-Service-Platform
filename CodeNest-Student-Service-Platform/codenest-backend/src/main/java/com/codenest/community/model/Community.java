package com.codenest.community.model;

import com.codenest.user.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "communities")
public class Community {

    @Id
    private String id;

    private String name;
    private String description;

    @DBRef
    private Set<User> members = new HashSet<>();

    // Getters and Setters
}
