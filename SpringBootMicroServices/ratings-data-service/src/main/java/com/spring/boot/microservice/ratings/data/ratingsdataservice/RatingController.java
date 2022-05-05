package com.spring.boot.microservice.ratings.data.ratingsdataservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RatingController {
    @RequestMapping("/rating/{userId}")
    public List<Rating> getRatingByUserId(@PathVariable ("userId") int uId){

        return Arrays.asList(new Rating(1,111),
                             new Rating(2,222),
                             new Rating(3, 333),
                             new Rating(4, 333),
                             new Rating(5, 333));
    }

    @RequestMapping("/")
    public String homePage(){
        return "Welcome Home";
    }
}
