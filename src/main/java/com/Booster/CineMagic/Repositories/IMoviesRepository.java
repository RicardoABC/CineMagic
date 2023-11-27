package com.Booster.CineMagic.Repositories;

import com.Booster.CineMagic.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMoviesRepository extends JpaRepository<Movie, Long>
{}