package org.imt.nordeurope.leclercq_baey.backendbancaire.jpa;

import org.imt.nordeurope.leclercq_baey.backendbancaire.services.Account;
import org.imt.nordeurope.leclercq_baey.backendbancaire.services.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionJpa extends JpaRepository<Transaction, Long> {
    List<Transaction> findTransactionByAccount(Account account);
}
