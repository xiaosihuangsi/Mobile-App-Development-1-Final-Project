package com.example.newsapp;

import com.example.newsapp.Models.NewsHeadlines;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    String status;
    int totalResults;
    List<NewsHeadlines> articles;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
