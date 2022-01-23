package org.imt.nordeurope.leclercq_baey.backendbancaire.services;


import org.imt.nordeurope.leclercq_baey.backendbancaire.jpa.AccountJpa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Account implements IAccount{

    @Autowired
    AccountJpa accountJpa;

    @Override
    public List<Account> listAccount() {
        return accountJpa.findAll();
    }

    @Override
    public void addAccount(Account account) {
        accountJpa.save(account);
    }

    @Override
    public void deleteAccount(Account account) {
        accountJpa.delete(account);
    }
}
