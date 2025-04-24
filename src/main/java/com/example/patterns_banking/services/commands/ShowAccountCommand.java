package com.example.patterns_banking.services.commands;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.repositories.IAccountRepository;

import java.util.List;

public class ShowAccountCommand implements ICommand<List<Account>>{

    private final IAccountRepository accountRepository;
    private final Long customerId;

    public ShowAccountCommand(IAccountRepository accountRepository, Long customerId) {
        this.accountRepository = accountRepository;
        this.customerId = customerId;
    }

    @Override
    public List<Account> execute() {

        List<Account> accountList = accountRepository.findAllByCustomerId(customerId);

        if (accountList.isEmpty()) {
            throw new RuntimeException("Accounts not found");
        }

        return accountList;
    }
}
