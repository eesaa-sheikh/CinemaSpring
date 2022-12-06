package com.example.cinemaDB.repositories;

import com.example.cinemaDB.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
