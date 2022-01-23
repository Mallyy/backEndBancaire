package org.imt.nordeurope.leclercq_baey.backendbancaire.services;

import java.util.List;

public interface IAccount {
    List<Account> listAccount();
    void addAccount(Account account); //IBAN en
    void deleteAccount(Account account);
    
}
