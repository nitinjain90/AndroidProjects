package com.example.nitin.popularmovies.app;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by harash on 30/11/15.
 */
public class Movie implements Parcelable {


    private String title;
    private String poster;
    private String overview;
    private String voteAverage;
    private String releaseDate;

    public Movie(String title, String poster, String overview, String voteAverage, String releaseDate) {

       this.title = title;
       this.poster = poster;
       this.overview = overview;
       this.voteAverage = voteAverage;
       this.releaseDate = releaseDate;
    }
    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public String getOverview() {
        return overview;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    private Movie(Parcel in) {
        title = in.readString();
        poster = in.readString();
        overview = in.readString();
        voteAverage = in.readString();
        releaseDate = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
