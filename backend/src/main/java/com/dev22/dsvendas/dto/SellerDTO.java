package com.dev22.dsvendas.dto;

import java.io.Serializable;

import com.dev22.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SellerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}


	public SellerDTO(Seller entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	
}
