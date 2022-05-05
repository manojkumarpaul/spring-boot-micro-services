package com.spring.boot.microservice.movie.info.movieinfoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping ("/movie-service/{movieId}")
public class MovieController {

    public List<Movie> getMovieDetailByMovieId(@PathVariable ("movieId") int mId){

        List <Movie> movieList = createNewList();
        return (List<Movie>) movieList.stream().filter(m -> m.mId == mId).findFirst().get();
    }

    private List<Movie> createNewList() {
        return Arrays.asList(new Movie(111, "Panipat"),
                new Movie(222, "Janeman"),
                new Movie(333, "Tees Maar Khan"),
                new Movie(444, "RRR"),
                new Movie(555, "The Kashmir Files"));
    }
}
