package com.example.nitin.popularmovies.app;

/**
 * Created by harash on 11/01/16.
 */
public class MovieReview {

     private String author;
     private String content;

    public MovieReview(String author, String content){
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
