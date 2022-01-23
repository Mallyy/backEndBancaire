package org.imt.nordeurope.leclercq_baey.backendbancaire.services;

import java.util.List;

public interface ITransaction {
    List<Transaction> listAllTransactions();
    List<Transaction> listTransactionForAccount(Account account);
    void addTransaction(Transaction transaction);
    void deleteTransaction(Transaction transaction);
}
