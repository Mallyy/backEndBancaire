package org.imt.nordeurope.leclercq_baey.backendbancaire.services;

import org.imt.nordeurope.leclercq_baey.backendbancaire.jpa.TransactionJpa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Transaction implements ITransaction{

    @Autowired
    TransactionJpa transactionJpa;

    @Override
    public List<Transaction> listAllTransactions() {
        return transactionJpa.findAll();
    }

    @Override
    public List<Transaction> listTransactionForAccount(Account account) {
        return transactionJpa.findTransactionByAccount(account);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactionJpa.save(transaction);
    }

    @Override
    public void deleteTransaction(Transaction transaction) {
        transactionJpa.delete(transaction);

    }
}
