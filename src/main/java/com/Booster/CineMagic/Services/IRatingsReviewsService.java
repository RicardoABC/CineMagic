package com.Booster.CineMagic.Services;

import java.util.List;
import com.Booster.CineMagic.Entities.RatingReview;

public interface IRatingsReviewsService
{
    // Create
    RatingReview AddRatingReview(RatingReview newRatingReview);

    // Read
    List<RatingReview> GetRatingsReviews();
    RatingReview GetRatingReviewByID(Long idRatingReview);

    // Update
    RatingReview UpdateRatingReview(Long idRatingReview, RatingReview ratingReview);

    // Delete
    Boolean DeleteRatingReview(Long idRatingReview);
}