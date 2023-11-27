package com.Booster.CineMagic.Services;

import java.util.List;
import com.Booster.CineMagic.Entities.Movie;

public interface IMoviesService
{
    // Create
    Movie AddMovie(Movie newMovie);

    // Read
    List<Movie> GetMovies();
    Movie GetMovieByID(Long idMovie);

    // Update
    Movie UpdateMovie(Long idMovie, Movie movie);

    // Delete
    Boolean DeleteMovie(Long idMovie);
}