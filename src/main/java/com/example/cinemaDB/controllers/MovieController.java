package com.example.cinemaDB.controllers;


import com.example.cinemaDB.models.Movie;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {


    @PostMapping



    @GetMapping
    public String movieName(){
        Movie movie = new Movie ("Transformers", 2, 2.00);
        return (movie.getTitle() + movie.getRating() + " The length of this movie is : " + movie.getDuration());
    }

}
