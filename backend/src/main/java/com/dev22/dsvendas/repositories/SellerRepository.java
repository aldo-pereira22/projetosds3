package com.dev22.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev22.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

	
}
