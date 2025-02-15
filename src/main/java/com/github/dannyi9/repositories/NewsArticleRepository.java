package com.github.dannyi9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dannyi9.newsapi.entities.NewsArticle;

public interface NewsArticleRepository extends JpaRepository<NewsArticle, Long> {
    
}
