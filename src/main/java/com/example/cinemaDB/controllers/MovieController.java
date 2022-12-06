package com.example.cinemaDB.controllers;


import com.example.cinemaDB.models.Movie;
import com.example.cinemaDB.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieServices movieServices;

    @PostMapping
    public ResponseEntity<Movie> newMovie(@RequestBody Movie movie){
        movieServices.addMovie(movie);
        return new ResponseEntity<>(movie,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieServices.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        Optional<Movie> movie = movieServices.getMovieById(id);
        if (movie.isPresent()){
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
         } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        //Everything is done
    }
}

