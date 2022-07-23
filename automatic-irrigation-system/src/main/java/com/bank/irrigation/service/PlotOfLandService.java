package com.bank.irrigation.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.irrigation.error.RecoredNotFoundExecption;
import com.bank.irrigation.model.PlotOfLand;
import com.bank.irrigation.repository.PlotOfLandRepo;

@Service
public class PlotOfLandService  {
	
	@Autowired
	private PlotOfLandRepo plotOfLandRepo;

	
	public List<PlotOfLand> findAll() {
		return  plotOfLandRepo.findAll();
	}
	
	
	public PlotOfLand findById(Long id) {
		return  plotOfLandRepo.findById(id).orElseThrow(
				() -> new RecoredNotFoundExecption("This Recored with id : "+ id + " not found"));
	}
	
	public PlotOfLand insert(PlotOfLand entity) {
		return  plotOfLandRepo.save(entity);
	}
	
	public List<PlotOfLand> insertAll(List<PlotOfLand> entity) {

		return plotOfLandRepo.saveAll(entity);
	}
	

	public PlotOfLand update(PlotOfLand entity) {

		return plotOfLandRepo.save(entity);
	}
	
	public PlotOfLand configure(PlotOfLand entity) {

		return plotOfLandRepo.save(entity);
	}
	

}