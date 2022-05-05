package com.spring.boot.microservice.ratings.data.ratingsdataservice;

public class Rating {
    int rating;
    int movieId;

    public Rating(){

    }
    public Rating(int rating, int movieId) {
        this.rating = rating;
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
