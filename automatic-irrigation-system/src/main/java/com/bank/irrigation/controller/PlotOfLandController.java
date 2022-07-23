package com.bank.irrigation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.irrigation.model.PlotOfLand;
import com.bank.irrigation.service.PlotOfLandService;

@RestController
@RequestMapping("/plotOfLand")
@CrossOrigin("http://localhost:4200")
public class PlotOfLandController {

	
	@Autowired
	private PlotOfLandService plotOfLandService;
	
	@GetMapping()
	public ResponseEntity<List<PlotOfLand>> findAll (){
		
		return ResponseEntity.ok(plotOfLandService.findAll()) ;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {

		PlotOfLand plotOfLand = plotOfLandService.findById(id);

		return ResponseEntity.ok(plotOfLand);
	}
	
	
	
	@PostMapping("")
	public ResponseEntity<?> insert(@RequestBody @Valid PlotOfLand entity) {

		PlotOfLand plotOfLand = plotOfLandService.insert(entity);

		return ResponseEntity.ok(plotOfLand);
	}
	
	
	@PutMapping("")
	public ResponseEntity<?> update(@RequestBody @Valid PlotOfLand entity) {

		PlotOfLand plotOfLand = plotOfLandService.update(entity);

		return ResponseEntity.ok(plotOfLand);
	}
	
	@PutMapping("/configure")
	public ResponseEntity<?> configure(@RequestBody @Valid PlotOfLand entity) {
		
		PlotOfLand plotOfLand = plotOfLandService.update(entity);

		return ResponseEntity.ok(plotOfLand);
	}
}
