package com.Booster.CineMagic.Repositories;

import com.Booster.CineMagic.Entities.RatingReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRatingsReviewsRepository extends JpaRepository<RatingReview, Long>
{}