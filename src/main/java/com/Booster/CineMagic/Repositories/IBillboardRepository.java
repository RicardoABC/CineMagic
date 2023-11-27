package com.Booster.CineMagic.Repositories;

import com.Booster.CineMagic.Entities.Billboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBillboardRepository extends JpaRepository<Billboard, Long>
{}