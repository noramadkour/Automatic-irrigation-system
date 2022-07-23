package com.bank.irrigation.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.bank.irrigation.model.PlotOfLand;
import com.bank.irrigation.repository.PlotOfLandRepo;

@SpringBootTest
public class PlatOfLandServiceTest {
	
	@InjectMocks
	PlotOfLandService plotOfLandService;
	
	@Mock
	PlotOfLandRepo plotOfLandRepo;
	
	
	
	@Test
	public void findByIdTest() {

		Optional<PlotOfLand> plotOfLandParam = Optional.of(new PlotOfLand(1L,"land", 545.0, 766.0,99.0,100.0));

		Mockito.when( plotOfLandRepo.findById(Mockito.anyLong())).thenReturn(plotOfLandParam);

		PlotOfLand plotOfLand = plotOfLandService.findById(1L);

		assertEquals("land", plotOfLand.getName());
	}
	
	
	@Test
	public void findAllTest() {
		
		PlotOfLand Land1 = new PlotOfLand();
		Land1.setName("Farmland");
		Land1.setPrice(20000);
		Land1.setArea(1);
		Land1.setHeight(333);
		Land1.setWidth(44);

		PlotOfLand Land2 = new PlotOfLand();
		Land2.setName("desertland");
		Land2.setPrice(90000);
		Land2.setArea(9);
		Land2.setHeight(888);
		Land2.setWidth(33);

		PlotOfLand Land3 = new PlotOfLand();
		Land3.setName("The land belongs to the bank");
		Land3.setPrice(60000);
		Land3.setArea(5);
		Land3.setHeight(33366);
		Land3.setWidth(88);


		List<PlotOfLand> PlotOfLands = Arrays.asList(Land1, Land2, Land3);

		Mockito.when( plotOfLandRepo.findAll()).thenReturn(PlotOfLands);

		List<PlotOfLand> plotOfLands = plotOfLandService.findAll();

		assertEquals(3, plotOfLands.size());
	}
	
	
	@Test
	public void insertTest() {

		PlotOfLand PlotOfLands = new PlotOfLand(1L,"land", 545.0, 766.0,99.0,100.0);

		Mockito.when( plotOfLandRepo.save(Mockito.any(PlotOfLand.class))).thenReturn(PlotOfLands);

		PlotOfLand plotOfLand = plotOfLandService.insert(PlotOfLands);

		assertEquals("land", plotOfLand.getName());
	}
	
	
	@Test
	public void  updateTest() {

		PlotOfLand PlotOfLands = new PlotOfLand(1L,"land", 545.0, 766.0,99.0,100.0);

		Mockito.when( plotOfLandRepo.save(Mockito.any(PlotOfLand.class))).thenReturn(PlotOfLands);

		PlotOfLand plotOfLand = plotOfLandService.update(PlotOfLands);

		assertEquals("land", plotOfLand.getName());
	}
	
	
	@Test
	public void configureTest() {

		PlotOfLand PlotOfLands = new PlotOfLand(1L,"land", 545.0, 766.0,99.0,100.0);

		Mockito.when( plotOfLandRepo.save(Mockito.any(PlotOfLand.class))).thenReturn(PlotOfLands);

		PlotOfLand plotOfLand = plotOfLandService.configure(PlotOfLands);

		assertEquals("land", plotOfLand.getName());
	}


}
