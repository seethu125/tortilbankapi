package com.api.bank.services;

import java.util.List;

import com.api.bank.enitities.Bank;
import com.api.bank.enitities.BankBranch;

public interface BankService {

	List<Bank> getAllBanks();

	BankBranch getBankBranch(String ifscCode);
	
}
