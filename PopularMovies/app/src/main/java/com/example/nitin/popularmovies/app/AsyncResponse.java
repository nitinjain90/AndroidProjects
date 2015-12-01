package com.example.nitin.popularmovies.app;

import java.util.List;

/**
 * Created by harash on 01/12/15.
 */
public interface AsyncResponse {
       void onTaskCompleted(List<Movie> results);
}
