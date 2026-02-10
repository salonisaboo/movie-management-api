package com.assignment.movie_api.service;

import com.assignment.movie_api.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/*
*  Service class to handle business logic
* It manages in memory data storage
* */
@Service
public class MovieService {
    private final List<Movie> movies = new ArrayList<>();
    // Assigns a unique ID and saves the movie to the list
    public Movie addMovie(Movie movie){
        movie.setId(UUID.randomUUID().toString());
        movies.add(movie);
        return movie;
    }
    // searches for a movie by its unique ID
    public Movie getMovieById(String id){
        return movies.stream()
                .filter(m->m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
