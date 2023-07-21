package com.api.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bank.enitities.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{

}
