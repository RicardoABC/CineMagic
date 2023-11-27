package com.Booster.CineMagic.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Booster.CineMagic.Entities.Movie;
import com.Booster.CineMagic.Services.IMoviesService;

@RestController
@RequestMapping("/CineMagic/v0")
public class MoviesController
{
    @Autowired
    IMoviesService moviesService;

    @PostMapping("/Movies")
    public Movie AddMovie(@RequestBody Movie newMovie)
    {
        return moviesService.AddMovie(newMovie);
    }

    @GetMapping("/Movies")
    public List<Movie> GetMovies()
    {
        return moviesService.GetMovies();
    }

    @GetMapping("/Movies/{idMovie}")
    public Movie GetMovieByID(@PathVariable Long idMovie)
    {
        return moviesService.GetMovieByID(idMovie);
    }

    @PutMapping("/Movies/{idMovie}")
    public Movie UpdateMovie(@PathVariable Long idMovie, @RequestBody Movie movie)
    {
        return moviesService.UpdateMovie(idMovie, movie);
    }

    @DeleteMapping("/Movies/{idMovie}")
    public Boolean DeleteMovie(@PathVariable Long idMovie)
    {
        return moviesService.DeleteMovie(idMovie);
    }
}