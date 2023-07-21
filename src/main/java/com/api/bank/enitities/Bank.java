package com.api.bank.enitities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "banks")
public class Bank {
	@Id
	private long id;
	private String name;
	
}
