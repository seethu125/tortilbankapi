package com.api.bank.enitities;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Immutable
@Data
@Table(name= "bank_branches")
public class BankBranch {
	@Id
	private String ifsc;
	private long bank_id;
	private String branch;
	private String address;
	private String district;
	private String city;
	private String state;
	private String bankName;
}
