package com.Booster.CineMagic.Repositories;

import com.Booster.CineMagic.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransactionsRepository extends JpaRepository<Transaction, Long>
{}