package com.github.dannyi9.newsapi.services;

import java.net.URL;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

@Service
public class RssService {

    @Scheduled(fixedRate = 10000) // 10,000 ms = 10 seconds
    public void fetchRssFeed() {
        System.out.println("Fetching RSS feed...");
        parseRssFeed();
    }
    
    private void parseRssFeed() {
        System.out.println("Parsing RSS feed...");

        try {
            String rssFeedUrl = "https://feeds.skynews.com/feeds/rss/uk.xml";

            URL url = new URL(rssFeedUrl);
            
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(url));

            List<SyndEntry> entries = feed.getEntries();

            for (SyndEntry entry : entries) {
                System.out.println("Title: " + entry.getTitle());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
