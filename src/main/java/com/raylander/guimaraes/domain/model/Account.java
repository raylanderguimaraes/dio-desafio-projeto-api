package com.raylander.guimaraes.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name= "tb_account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	private String barber;
	
	
	private Integer hairCuts;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBarber() {
		return barber;
	}
	public void setBarber(String barber) {
		this.barber = barber;
	}
	public Integer getHairCuts() {
		return hairCuts;
	}
	public void setHairCuts(Integer hairCuts) {
		this.hairCuts = hairCuts;
	}
	
	
}
