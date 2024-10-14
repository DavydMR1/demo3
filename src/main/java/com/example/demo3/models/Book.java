package com.example.demo3.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = true)
    private Integer publicationYear;
}
