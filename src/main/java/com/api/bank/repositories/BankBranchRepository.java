package com.api.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bank.enitities.BankBranch;

public interface BankBranchRepository extends JpaRepository<BankBranch, String>{

}
