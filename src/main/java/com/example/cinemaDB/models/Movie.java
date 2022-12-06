package com.example.cinemaDB.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="title")
    private String title;

    @Column (name = "rating")
    private int rating;

    @Column (name = "duration")
    private double duration;

    //Constructor
    public Movie(String title, int rating, double duration){
        this.title= title;
        this.rating= rating;
        this.duration = duration;
    }
    public Movie(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
