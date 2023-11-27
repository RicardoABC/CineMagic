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

import com.Booster.CineMagic.Entities.RatingReview;
import com.Booster.CineMagic.Services.IRatingsReviewsService;

@RestController
@RequestMapping("/CineMagic/v0")
public class RatingsReviewsController
{
    @Autowired
    IRatingsReviewsService ratingsReviewsService;

    @PostMapping("/RatingsReviews")
    public RatingReview AddRatingReview(@RequestBody RatingReview newRatingReview)
    {
        return ratingsReviewsService.AddRatingReview(newRatingReview);
    }

    @GetMapping("/RatingsReviews")
    public List<RatingReview> GetRatingsReviews()
    {
        return ratingsReviewsService.GetRatingsReviews();
    }

    @GetMapping("/RatingsReviews/{idRatingReview}")
    public RatingReview GetRatingReviewByID(@PathVariable Long idRatingReview)
    {
        return ratingsReviewsService.GetRatingReviewByID(idRatingReview);
    }

    @PutMapping("/RatingsReviews/{idRatingReview}")
    public RatingReview UpdateRatingReview(@PathVariable Long idRatingReview, @RequestBody RatingReview ratingReview)
    {
        return ratingsReviewsService.UpdateRatingReview(idRatingReview, ratingReview);
    }

    @DeleteMapping("/RatingsReviews/{idRatingReview}")
    public Boolean DeleteRatingReview(@PathVariable Long idRatingReview)
    {
        return ratingsReviewsService.DeleteRatingReview(idRatingReview);
    }
}