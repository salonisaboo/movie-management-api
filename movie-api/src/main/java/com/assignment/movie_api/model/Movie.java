package com.assignment.movie_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Lombok annotations used to reduce boilerplate
 * Represents a Movie entity
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String id; //Unique identifier
    private String title; // movie name
    private String description; // short summary
    private String genre; // genre of movie
    private int releaseYear; // releasing year
}
