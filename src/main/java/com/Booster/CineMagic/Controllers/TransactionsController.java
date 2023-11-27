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

import com.Booster.CineMagic.Entities.Transaction;
import com.Booster.CineMagic.Services.ITransactionsService;

@RestController
@RequestMapping("/CineMagic/v0")
public class TransactionsController
{
    @Autowired
    ITransactionsService transactionsService;

    @PostMapping("/Transactions")
    public Transaction AddTransaction(@RequestBody Transaction newTransaction)
    {
        return transactionsService.AddTransaction(newTransaction);
    }

    @GetMapping("Transactions")
    public List<Transaction> GetTransactions()
    {
        return transactionsService.GetTransactions();
    }

    @GetMapping("/Transactions/{idTransaction}")
    public Transaction GetTransactionByID(@PathVariable Long idTransaction)
    {
        return transactionsService.GetTransactionByID(idTransaction);
    }

    @PutMapping("/Transactions/{idTransaction}")
    public Transaction UpdateTransaction(@PathVariable Long idTransaction, @RequestBody Transaction transaction)
    {
        return transactionsService.UpdateTransaction(idTransaction, transaction);
    }

    @DeleteMapping("/Transactions/{idTransaction}")
    public Boolean DeleteTransaction(@PathVariable Long idTransaction)
    {
        return transactionsService.DeleteTransaction(idTransaction);
    }
}