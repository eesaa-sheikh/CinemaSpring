package com.example.cinemaDB.controllers;


import com.example.cinemaDB.models.Movie;
import com.example.cinemaDB.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieServices movieServices;

//    @PostMapping
//    public ResponseEntity<MovieStart> loadingMovie() {
//        MovieStart movieStart = movieServices.MovieServices();
//        return new ResponseEntity<>(movieStart, HttpStatus.CREATED);
//
//    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieServices.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        Movie movie = movieServices.getMovieById(id);
//        if (movies.isPresent()){
            return new ResponseEntity<>(movie, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//        }
    }
}

