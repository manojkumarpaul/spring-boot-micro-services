package com.spring.boot.microservice.movie.info.movieinfoservice;

public class Movie {
    int mId;
    String name;

    public Movie(){

    }
    public Movie(int mId, String name) {
        this.mId = mId;
        this.name = name;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
