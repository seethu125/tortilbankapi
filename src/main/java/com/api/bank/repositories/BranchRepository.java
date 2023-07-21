package com.api.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bank.enitities.Branch;

public interface BranchRepository extends JpaRepository<Branch, String>{

}
