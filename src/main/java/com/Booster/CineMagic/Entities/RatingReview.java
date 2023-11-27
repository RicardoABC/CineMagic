package com.Booster.CineMagic.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RatingsReviews")
public class RatingReview
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRatingReview;
    private String customerName;
    private Long movieID;
    private Long rating;
    private String review;

    // Constructors
    public RatingReview()
    {}

    public RatingReview(Long idRatingReview, String customerName, Long movieID, Long rating, String review)
    {
        this.idRatingReview = idRatingReview;
        this.customerName = customerName;
        this.movieID = movieID;
        this.rating = rating;
        this.review = review;
    }

    // Getters
    public Long getIdRatingReview()
    {
        return this.idRatingReview;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public Long getMovieID()
    {
        return this.movieID;
    }

    public Long getRating()
    {
        return this.rating;
    }

    public String getReview()
    {
        return this.review;
    }

    // Setters
    public void setIdRatingReview(Long idRatingReview)
    {
        this.idRatingReview = idRatingReview;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setMovieID(Long movieID)
    {
        this.movieID = movieID;
    }

    public void setRating(Long rating)
    {
        this.rating = rating;
    }

    public void setReview(String review)
    {
        this.review = review;
    }
}