package com.github.dannyi9.newsapi.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RssService {

    @Scheduled(fixedRate = 10000) // 10,000 ms = 10 seconds
    public void fetchRssFeed() {
        System.out.println("Fetching RSS feed...");
        parseRssFeed();
    }
    
    private void parseRssFeed() {
        System.out.println("Parsing RSS feed...");
    }

}
