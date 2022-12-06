package com.example.cinemaDB.models;

public class MovieStart {
    private String message;

    public MovieStart(String message){
        this.message=message;
    }
    public MovieStart(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
