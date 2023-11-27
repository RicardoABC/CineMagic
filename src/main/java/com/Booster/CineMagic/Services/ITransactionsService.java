package com.Booster.CineMagic.Services;

import java.util.List;
import com.Booster.CineMagic.Entities.Transaction;

public interface ITransactionsService
{
    // Create
    Transaction AddTransaction(Transaction newTransaction);

    // Read
    List<Transaction> GetTransactions();
    Transaction GetTransactionByID(Long idTransaction);

    // Update
    Transaction UpdateTransaction(Long idTransaction, Transaction transaction);

    // Delete
    Boolean DeleteTransaction(Long idTransaction);
}