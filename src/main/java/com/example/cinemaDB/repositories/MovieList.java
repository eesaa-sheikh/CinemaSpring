//todo: Dont really need this yet

package com.example.cinemaDB.repositories;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class MovieList {
    private List<String>movies;

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public MovieList(){
        this.movies = Arrays.asList(
                "Transformers",
                "Avengers",
                "Totoro"
        );



    }
}
