package com.api.bank.enitities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "branches")
@Data
public class Branch {
	
	@Id
	private String ifsc;
	private long bank_id;
	private String branch;
	private String address;
	private String district;
	private String city;
	private String state;

}
