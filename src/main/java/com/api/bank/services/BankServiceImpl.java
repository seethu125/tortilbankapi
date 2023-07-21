package com.api.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bank.enitities.Bank;
import com.api.bank.enitities.BankBranch;
import com.api.bank.repositories.BankBranchRepository;
import com.api.bank.repositories.BankRepository;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	BankBranchRepository bankBranchRepository;
	
	@Autowired
	BankRepository bankRepository;

	@Override
	public List<Bank> getAllBanks() {
		return bankRepository.findAll();
	}

	@Override
	public BankBranch getBankBranch(String ifscCode) {
		return bankBranchRepository.findById(ifscCode).orElse(null);
	}

}
