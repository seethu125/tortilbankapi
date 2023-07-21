package com.api.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bank.enitities.Bank;
import com.api.bank.enitities.BankBranch;
import com.api.bank.services.BankService;

@RestController
@RequestMapping("/banks")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@GetMapping("/all")
	public List<Bank> getAllBanks() {
		return bankService.getAllBanks();
	}
	
	@GetMapping("/{ifscCode}")
	public BankBranch getBankBranch(@PathVariable String ifscCode) {
		return bankService.getBankBranch(ifscCode);
	}
	

}
