package com.example.tourist_app.model;

import org.springframework.data.annotation.Id;
import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String role; // For roles like "USER", "ADMIN"

    // Getters and setters
}
