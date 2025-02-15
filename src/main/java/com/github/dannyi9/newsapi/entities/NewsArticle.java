package com.github.dannyi9.newsapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NewsArticle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String link;

    public NewsArticle() {}

    public NewsArticle(String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }

}
