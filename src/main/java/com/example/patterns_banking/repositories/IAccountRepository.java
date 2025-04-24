package com.example.patterns_banking.repositories;

import com.example.patterns_banking.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAllByCustomerId(Long customerId);
}
