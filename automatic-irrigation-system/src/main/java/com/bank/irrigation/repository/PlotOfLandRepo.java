package com.bank.irrigation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.irrigation.model.PlotOfLand;

@Repository
public interface PlotOfLandRepo extends JpaRepository<PlotOfLand, Long> {



	 
	  
	 
}