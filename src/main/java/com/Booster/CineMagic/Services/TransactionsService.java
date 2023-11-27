package com.Booster.CineMagic.Services;

import java.util.List;
import java.util.Optional;

import com.Booster.CineMagic.Entities.Transaction;
import com.Booster.CineMagic.Repositories.ITransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsService implements ITransactionsService
{
    @Autowired
    ITransactionsRepository transactionsRepository;

    @Override
    public Transaction AddTransaction(Transaction newTransaction)
    {
        return transactionsRepository.save(newTransaction);
    }

    @Override
    public List<Transaction> GetTransactions()
    {
        return transactionsRepository.findAll();
    }

    @Override
    public Transaction GetTransactionByID(Long idTransaction)
    {
        return transactionsRepository.findById(idTransaction).orElse(null);
    }

    @Override
    public Transaction UpdateTransaction(Long idTransaction, Transaction transaction)
    {
        Optional<Transaction> transaction2Update = transactionsRepository.findById(idTransaction);

        if (!transaction2Update.isPresent())
            return null;
        
        Transaction updateTransaction = transaction2Update.get();

        updateTransaction.setCustomerName(transaction.getCustomerName());
        updateTransaction.setBillboardID(transaction.getBillboardID());
        updateTransaction.setSeat(transaction.getSeat());
        updateTransaction.setPaymentDetails(transaction.getPaymentDetails());

        return transactionsRepository.save(updateTransaction);
    }

    @Override
    public Boolean DeleteTransaction(Long idTransaction)
    {
        if (this.GetTransactionByID(idTransaction) == null)
            return null;
        
        transactionsRepository.deleteById(idTransaction);

        return (this.GetTransactionByID(idTransaction) == null)? true : false;
    }
}