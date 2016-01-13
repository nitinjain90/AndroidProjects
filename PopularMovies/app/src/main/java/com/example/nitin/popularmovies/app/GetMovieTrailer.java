package com.example.nitin.popularmovies.app;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by harash on 13/01/16.
 */
public class GetMovieTrailer  extends AsyncTask<String, Void, String>{

       private final String LOG_TAG = GetMovieTrailer.class.getSimpleName();
       private final String BASE_URL = "http://api.themoviedb.org/3/movie/";
       private final String API_KEY = "501e1ab4177660ece7b90cc04feea48f";

       private Movie movie;
       private String  detailInfo; //Trailer or Review

    public GetMovieTrailer(Movie movie, String detailInfo){
        this.movie = movie;
        this.detailInfo = detailInfo;
    }

    @Override
    protected String doInBackground(String... params) {

        if(params.length != 0){
            return null;
        }

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;


        try {

            Uri builtUri = Uri.parse(BASE_URL + movie.getMovieId() + "/" + detailInfo ).buildUpon()
                    .appendQueryParameter("api_key", API_KEY)
                    .build();

            URL url = new URL(builtUri.toString());

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();

            if (inputStream == null) {
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            if (buffer.length() == 0) {
                return null;
            }

            return buffer.toString();

        } catch (IOException e) {
            Log.e(LOG_TAG, "Error ", e);
            return null;
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e(LOG_TAG, "Error closing stream", e);
                }
            }
        }

    }
    @Override
    protected void onPostExecute(String result) {

        if(detailInfo.equals("reviews")){
            movie.setReviews(result);
        }else {
            movie.setMoviePreviews(result);
        }

    }


}
