package com.Booster.CineMagic.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Billboard")
public class Billboard
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBillboard;
    private Long movieID;
    private String language;
    private String movieSchedule;

    // Constructors
    public Billboard()
    {}

    public Billboard(Long idBillboard, Long movieID, String language, String movieSchedule)
    {
        this.idBillboard = idBillboard;
        this.movieID = movieID;
        this.language = language;
        this.movieSchedule = movieSchedule;
    }

    // Getters
    public Long getIdBillboard()
    {
        return this.idBillboard;
    }

    public Long getMovieID()
    {
        return this.movieID;
    }

    public String getLanguage()
    {
        return this.language;
    }

    public String getMovieSchedule()
    {
        return this.movieSchedule;
    }

    // Setters
    public void setIdBillboard(Long idBillboard)
    {
        this.idBillboard = idBillboard;
    }

    public void setMovieID(Long movieID)
    {
        this.movieID = movieID;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public void setMovieSchedule(String movieSchedule)
    {
        this.movieSchedule = movieSchedule;
    }
}