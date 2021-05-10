package com.dev22.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev22.dsvendas.dto.SaleSuccessDTO;
import com.dev22.dsvendas.dto.SaleSumDTO;
import com.dev22.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.dev22.dsvendas.dto.SaleSumDTO(obj.seller, SUM (obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
		List<SaleSumDTO> amountGroupedBySeller(); 
	

	@Query("SELECT new com.dev22.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM (obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
		List<SaleSuccessDTO> successGroupedBySeller(); 
}
