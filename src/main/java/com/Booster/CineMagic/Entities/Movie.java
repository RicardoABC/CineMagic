package com.Booster.CineMagic.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movie
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovie;
    private String name;
    private String genre;
    private String classification;
    private Long duration;

    // Constructor
    public Movie()
    {}

    public Movie(Long idMovie, String name, String genre, String classification, Long duration)
    {
        this.idMovie = idMovie;
        this.name = name;
        this.genre = genre;
        this.classification = classification;
        this.duration = duration;
    }

    // Getters
    public Long getIdMovie()
    {
        return this.idMovie;
    }

    public String getName()
    {
        return this.name;
    }

    public String getGenre()
    {
        return this.genre;
    }

    public String getClassification()
    {
        return this.classification;
    }

    public Long getDuration()
    {
        return this.duration;
    }

    // Setters
    public void setIdMovie(Long idMovie)
    {
        this.idMovie = idMovie;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setClassification(String classification)
    {
        this.classification = classification;
    }

    public void setDuration(Long duration)
    {
        this.duration = duration;
    }
}