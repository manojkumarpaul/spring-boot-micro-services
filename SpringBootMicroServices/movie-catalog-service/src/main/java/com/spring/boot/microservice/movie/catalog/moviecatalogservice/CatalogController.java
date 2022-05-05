package com.spring.boot.microservice.movie.catalog.moviecatalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping ("/catalog-service/{userId}")
public class CatalogController {
    @Autowired
    private RestTemplate restTemplate;

    public List<Movie> getAllMoviesByUserId(@PathVariable ("userId") int uId){
        //Get All ratings and movie ids based on userId

        //For each movie id get all movie detail

        //put them all together

        return null;
    }
}
