package com.dev22.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev22.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	
}
