package com.dev22.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev22.dsvendas.dto.SaleDTO;
import com.dev22.dsvendas.dto.SaleSuccessDTO;
import com.dev22.dsvendas.dto.SaleSumDTO;
import com.dev22.dsvendas.entities.Sale;
import com.dev22.dsvendas.repositories.SaleRepository;
import com.dev22.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){	
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
		
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
	
}
