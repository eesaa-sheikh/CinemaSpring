package com.example.cinemaDB.services;

import com.example.cinemaDB.models.Movie;
import com.example.cinemaDB.models.MovieStart;
import com.example.cinemaDB.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServices {

    @Autowired
    MovieRepository movieRepository;

    private ArrayList<Movie> movies;


    public MovieStart MovieServices(){
        Movie movie = new Movie("Transformers", 1, 2.0);
        Movie movie1 = new Movie("Totoro", 5, 1.4);
        movieRepository.save(movie);
        movieRepository.save(movie1);
        return new MovieStart("Welcome to the P3SSI Cinemas");
    }






    public Optional<Movie> getMovieById(int id){
        return MovieRepository.findById(id);
    }

    public List<Movie> getAllMovie() {
        return MovieRepository.findAll();
    }


}
