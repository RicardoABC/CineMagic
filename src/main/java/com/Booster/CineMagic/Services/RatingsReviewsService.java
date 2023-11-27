package com.Booster.CineMagic.Services;

import java.util.List;
import java.util.Optional;

import com.Booster.CineMagic.Entities.RatingReview;
import com.Booster.CineMagic.Repositories.IRatingsReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingsReviewsService implements IRatingsReviewsService
{
    @Autowired
    IRatingsReviewsRepository ratingsReviewsRepository;

    @Override
    public RatingReview AddRatingReview(RatingReview newRatingReview)
    {
        return ratingsReviewsRepository.save(newRatingReview);
    }

    @Override
    public List<RatingReview> GetRatingsReviews()
    {
        return ratingsReviewsRepository.findAll();
    }

    @Override
    public RatingReview GetRatingReviewByID(Long idRatingReview)
    {
        return ratingsReviewsRepository.findById(idRatingReview).orElse(null);
    }

    @Override
    public RatingReview UpdateRatingReview(Long idRatingReview, RatingReview ratingReview)
    {
        Optional<RatingReview> ratingReview2Update = ratingsReviewsRepository.findById(idRatingReview);

        if (!ratingReview2Update.isPresent())
            return null;
        
        RatingReview updateRatingReview = ratingReview2Update.get();

        updateRatingReview.setCustomerName(ratingReview.getCustomerName());
        updateRatingReview.setMovieID(ratingReview.getMovieID());
        updateRatingReview.setRating(ratingReview.getRating());
        updateRatingReview.setReview(ratingReview.getReview());

        return ratingsReviewsRepository.save(updateRatingReview);
    }

    @Override
    public Boolean DeleteRatingReview(Long idRatingReview)
    {
        if (this.GetRatingReviewByID(idRatingReview) == null)
            return null;
        
        ratingsReviewsRepository.deleteById(idRatingReview);

        return (this.GetRatingReviewByID(idRatingReview) == null)? true : false;
    }
}