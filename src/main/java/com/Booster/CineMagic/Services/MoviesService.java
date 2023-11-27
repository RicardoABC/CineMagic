package com.Booster.CineMagic.Services;

import java.util.List;
import java.util.Optional;
import com.Booster.CineMagic.Entities.Movie;
import com.Booster.CineMagic.Repositories.IMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService implements IMoviesService
{
    @Autowired
    IMoviesRepository moviesRepository;

    @Override
    public Movie AddMovie(Movie newMovie)
    {
        return moviesRepository.save(newMovie);
    }

    @Override
    public List<Movie> GetMovies()
    {
        return moviesRepository.findAll();
    }

    @Override
    public Movie GetMovieByID(Long idMovie)
    {
        return moviesRepository.findById(idMovie).orElse(null);
    }

    @Override
    public Movie UpdateMovie(Long idMovie, Movie movie)
    {
        Optional<Movie> movie2Update = moviesRepository.findById(idMovie);

        if (!movie2Update.isPresent())
            return null;
        
        Movie updateMovie = movie2Update.get();

        updateMovie.setName(movie.getName());
        updateMovie.setGenre(movie.getGenre());
        updateMovie.setClassification(movie.getClassification());
        updateMovie.setDuration(movie.getDuration());

        return moviesRepository.save(updateMovie);
    }

    @Override
    public Boolean DeleteMovie(Long idMovie)
    {
        if (this.GetMovieByID(idMovie) == null)
            return null;
        
        moviesRepository.deleteById(idMovie);

        return (this.GetMovieByID(idMovie) == null)? true : false;
    }
}