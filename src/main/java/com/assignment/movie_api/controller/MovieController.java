package com.assignment.movie_api.controller;

import com.assignment.movie_api.model.Movie;
import com.assignment.movie_api.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//REST Controller providing endpoints for Movie management
@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;
    //Constructor Injection
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }
    /**
     * POST Endpoint to create a new movie.
     * Validates that the title is not empty.
     */
    @PostMapping
    public ResponseEntity<?> createMovie(@RequestBody Movie movie){
        if(movie.getTitle() == null || movie.getTitle().isEmpty()){
            return ResponseEntity.badRequest().body("Title is required!");
        }
        Movie savedMovie = movieService.addMovie(movie);
        return ResponseEntity.status(201).body(savedMovie);
    }
    /**
     * GET Endpoint to retrieve a movie by ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable String id){
        Movie movie = movieService.getMovieById(id);
        if(movie == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movie);
    }
}
